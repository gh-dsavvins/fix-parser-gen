package com.mbts.fix.message;

import com.mbts.fix.Environment;
import com.mbts.fix.api.Field;
import com.mbts.fix.api.Message;
import com.mbts.fix.api.Tag;
import lombok.Getter;
import lombok.Setter;

import static com.mbts.fix.Environment.FLD_CHAR;
import static com.mbts.fix.Environment.UNSET_LONG;

public abstract class AbstractField extends AbstractByteRef implements Field {

  protected final AbstractMessage message;
  protected Tag tag;
  protected int hash = 0;

  protected long version;
  @Getter @Setter protected int fldBeg;
  protected boolean unset;
  protected boolean parsed;
  @Getter protected boolean header;

  byte[] newValue;
  @Getter @Setter int newValueLength;
  AbstractField prev, next;

  AbstractField(Message message, Tag tag) {
    this.message = (AbstractMessage) message;
    this.tag = tag;
    this.version = UNSET_LONG;
  }

  public Tag tag() {
    return tag;
  }

  @Override
  public boolean dirty() {
    return message == null || message.version == -version;
  }

  @Override
  public boolean mapped() {
    return message != null && message.version == version;
  }

  @SuppressWarnings("unused")
  public <F extends AbstractField> void copyFrom(F field) {
    byte[] from;
    int srcBeg = 0, srcLen;
    if(field.dirty()) {
      from = field.newValue;
      srcLen = field.newValueLength;
    } else {
      from = field.message.bytes;
      srcBeg = field.valBeg;
      srcLen = field.valLen();
    }
    if(srcLen > 0) {
      ensureCapacity(srcLen);
      System.arraycopy(from, srcBeg, newValue, 0, srcLen);
      newValueLength = srcLen;
      onValueSet();
    }
  }

  @SuppressWarnings("unused")
  public <F extends AbstractField> void set(CharSequence value) {
    int len = value.length();
    set(value, 0, len);
  }

  @SuppressWarnings("unused")
  public <F extends AbstractField> void set(CharSequence value, int offset, int length) {
    if(length > 0) {
      ensureCapacity(length);
      int srcLim = offset + length;
      for(int srcIx = offset, dstIx = 0; srcIx < srcLim; srcIx++, dstIx++) {
        newValue[dstIx] = (byte) value.charAt(srcIx);
      }
      newValueLength = length;
      onValueSet();
    }
  }

  @SuppressWarnings("unused")
  public <F extends AbstractField> void copyFrom(byte[] bytes, int offset, int length) {
    if(length > 0) {
      ensureCapacity(length);
      System.arraycopy(bytes, offset, newValue, 0, length);
      newValueLength = length;
      onValueSet();
    }
  }

  void ensureCapacity(int length) {
    if(newValue == null || newValue.length < length) {
      newValue = new byte[length];
    }
  }

  @Override
  @SuppressWarnings("unchecked")
  public <F extends Field> F map(long version, byte[] bytes, int fldBeg) {
    this.fldBeg = fldBeg;
    valBeg = fldBeg + tag.bytes().length;
    int ix = valBeg;
    //noinspection StatementWithEmptyBody
    while (bytes[++ix] != Environment.FLD_CHAR) {}
    valLim = ix;
    this.version = version;
    hash = 0;
    unset = false;
    parsed = false;
    return (F) this;
  }

  void onValueSet() {
    if(message != null) {
      if(message.mapped() && !mapped() && !dirty()) {
        Field toInsertThisAfter = header ? message.msgType() : message.tail.prev;
        fldBeg = valBeg = valLim = 0;
        insertAfter(toInsertThisAfter);
      }
      version = -message.version;
      message.dirty = true;
    }
    unset = false;
    parsed = false;
  }

  private void shift(int offset) {
    fldBeg += offset;
    valBeg += offset;
    valLim += offset;
  }

  private int writeMapped(int offset) {
    byte[] bytes = message.bytes;
    byte[] fieldTagBytes = tag.bytes();
    int tagLen = fieldTagBytes.length;
    if(unset && valBeg > 0) {
      int diff = tagLen + valLen() + 1;
      System.arraycopy(bytes, valLim, bytes, fldBeg - 1, message.valLim - valLim);
      message.valLim -= diff;
      offset -= diff;
      fldBeg = valBeg = valLim = newValueLength = 0;
      return offset;
    }
    if(dirty()) {
      int oldValLen = valLen();
      int diff = newValueLength - oldValLen;
      if(fldBeg == 0) {
        fldBeg = prev.valLim + 1;
        valBeg = fldBeg + tagLen;
        valLim = valBeg + newValueLength;
        diff += tagLen + 1;
        if(diff != 0) {
          System.arraycopy(bytes, prev.valLim, bytes, prev.valLim + diff, message.valLim - prev.valLim);
          message.valLim += diff;
          offset += diff;
        }
        System.arraycopy(fieldTagBytes, 0, bytes, fldBeg, tagLen);
      } else {
        shift(offset);
        if(diff != 0) {
          System.arraycopy(bytes, valLim, bytes, valLim + diff, message.valLim - valLim);
          message.valLim += diff;
          offset += diff;
        }
        valLim += diff;
      }
      System.arraycopy(newValue, 0, bytes, valBeg, newValueLength);
    } else {
      shift(offset);
    }
    return offset;
  }

  private int writeUnmapped(int msgValLim) {
    if(dirty() && !unset) {
      byte[] bytes = message.bytes;
      byte[] fieldTagBytes = tag().bytes();
      int tagLen = fieldTagBytes.length;
      fldBeg = msgValLim;
      valBeg = fldBeg + tagLen;
      valLim = valBeg + newValueLength;
      msgValLim = valLim;
      System.arraycopy(fieldTagBytes, 0, bytes, fldBeg, tagLen);
      System.arraycopy(newValue, 0, bytes, valBeg, newValueLength);
      bytes[msgValLim++] = FLD_CHAR;
    }
    return msgValLim;
  }

  @Override
  public int write(int offset) {
    if(message == null) {
      return offset;
    }
    if(message.mapped()) {
      return writeMapped(offset);
    } else {
      return writeUnmapped(offset);
    }
  }

  @Override
  public void unset() {
    if(message != null) {
      version = -message.version;
      message.dirty = true;
    }
    unset = true;
    newValueLength = 0;
  }

  <F extends AbstractField> F append(F field) {
    field.prev = this;
    field.next = this.next;
    if(this.next != null) {
      this.next.prev = field;
    }
    this.next = field;
    return field;
  }

  <F extends Field> void insertAfter(F field) {
    prev = (AbstractField) field;
    if(prev != null) {
      next = prev.next;
      prev.next = this;
      if(next != null) {
        next.prev = this;
      }
    } else {
      next = null;
    }
  }
}
