package com.mbts.fix.message;

import com.mbts.fix.api.Field;
import com.mbts.fix.api.Message;
import com.mbts.fix.api.Tag;
import lombok.Getter;

import java.util.Arrays;

import static com.mbts.fix.Environment.*;
import static com.mbts.fix.Utils.checksum;
import static com.mbts.fix.Utils.fieldEnd;

@Getter
public abstract class AbstractMessage extends AbstractByteRef implements Message {

  protected abstract Field map(int fldBeg);
  protected abstract void writeUnmapped();
  protected abstract AbstractField msgType();
  protected abstract Tag unknownTag();

  protected long version;
  protected final byte[] bytes;

  final byte[] checksumBuf;
  final StringRefPool stringRefPool;
  AbstractField head, tail;
  boolean dirty;

  public AbstractMessage() {
    this.bytes = new byte[MAX_MSG_LEN];
    this.checksumBuf = new byte[3];
    this.stringRefPool = new StringRefPool(this);
    reset();
  }

  @Override
  @SuppressWarnings("unchecked")
  public <M extends Message> M copy(Message from) {
    AbstractMessage that = (AbstractMessage) from;
    if(that.dirty) {
      that.write();
    }
    map(that.bytes, that.valBeg, that.valLen());
    return (M) this;
  }

  @Override
  public void reset() {
    this.head = this.tail = null;
    version++;
    dirty = true;
    stringRefPool.reset();
    valBeg = 0;
  }

  @Override
  @SuppressWarnings("unchecked")
  public <M extends Message> M write() {
    if(!mapped()) {
      msgType().version = -version;
      writeUnmapped();
    } else {
      writeMapped();
    }
    dirty = false;
    return (M) this;
  }

  protected int writeMapped() {
    AbstractField f = head.next.next;
    int offset = 0;
    do {
      offset = f.write(offset);
    } while((f = f.next).tag.tag() != 10);
    return offset;
  }

  protected void writeUnmapped(LongRef bodyLenField, int bodyLen, StringRef beginString, StringRef checksum) {
    beginString.version = -version;
    bodyLenField.version = -version;
    checksum.version = -version;
    for (int i = 0; i < stringRefPool.size(); i++) {
      int oldValLim = valLim;
      valLim = stringRefPool.at(i).write(oldValLim);
      bodyLen += (valLim - oldValLim);
    }
    bodyLenField.set(bodyLen);
    int bodyLenFieldLength = bodyLenField.tag.bytes().length + bodyLenField.newValueLength + 1;
    bodyLenField.write(valBeg - bodyLenFieldLength);
    valBeg -= bodyLenFieldLength;
    byte[] beginStringStr = beginString.newValue;
    int beginStringFieldLength = beginString.tag.bytes().length + beginStringStr.length + 1;
    beginString.write(valBeg - beginStringFieldLength);
    valBeg -= beginStringFieldLength;
    calcAndWriteCheckSum(checksum);
  }

  protected void calcAndWriteBodyLengthMapped(LongRef bodyLength, StringRef beginString) {
    int checkSumValBeg = valLim - 7;
    int newVal = checkSumValBeg - bodyLength.valLim - 1;
    bodyLength.set(newVal);
    int oldLen = bodyLength.valLen();
    int newLen = bodyLength.newValueLength;
    int offset = oldLen - newLen;
    if(offset != 0) {
      beginString.fldBeg += offset;
      beginString.valBeg += offset;
      beginString.valLim += offset;
      System.arraycopy(bytes, valBeg, bytes, valBeg + offset, bodyLength.valBeg - valBeg);
      valBeg += offset;
    }
    int newValBeg = bodyLength.valBeg + offset;
    bodyLength.valBeg = newValBeg;
    System.arraycopy(bodyLength.newValue, 0, bytes, newValBeg, bodyLength.newValueLength);
  }

  protected void calcAndWriteCheckSum(StringRef checkSum) {
    if(!mapped()) {
      valLim += 7;
    }
    int checksumFldBeg = valLim - 7;
    int checksumValBeg = valLim - 4;
    int checksumVal = checksum(bytes, valBeg, checksumFldBeg);
    int len = NumberRef.stringSize(checksumVal);
    NumberRef.chars(checksumVal, len, checksumBuf);
    byte[] tagBytes = checkSum.tag.bytes();
    System.arraycopy(tagBytes, 0, bytes, checksumFldBeg, tagBytes.length);
    Arrays.fill(bytes, checksumValBeg, checksumValBeg + 3, (byte) '0');
    System.arraycopy(checksumBuf, 0, bytes, checksumValBeg + (3 - len), len);
    bytes[valLim - 1] = (byte) FLD_CHAR;
    checkSum.valBeg = checksumValBeg;
    checkSum.valLim = checksumValBeg + 3;
    checkSum.version = this.version;
  }

  @Override
  public <M extends Message> M map(byte[] bytes, int offset, int length) {
    reset();
    valBeg = 24;
    System.arraycopy(bytes, offset, this.bytes, valBeg, length);
    valLim = valBeg + length;
    return map();
  }

  @SuppressWarnings("unchecked")
  private <M extends Message> M map() {
    int ix = valBeg;
    while(ix < valLim) {
      AbstractField field = (AbstractField) map(ix);
      if(head == null) {
        head = field;
        tail = field;
      } else {
        tail = tail.append(field);
      }
      ix = field.valLim + 1;
    }
    dirty = false;
    return (M) this;
  }

  @Override
  public boolean mapped() {
    return head != null;
  }

  public StringRef unknownField(int ix) {
    StringRef aField = stringRefPool.next();
    aField.tag = unknownTag();
    aField.fldBeg = ix;
    aField.valBeg = ix + 2;
    aField.valLim = fieldEnd(bytes, ix + 2);
    aField.version = version;
    return aField;
  }

  @Override
  public String toString() {
    return "N/A";
  }

  @Override
  public String toDebugFixString() {
    if(dirty) {
      write();
    }
    if(valLen() < 1) {
      return "";
    }
    return new String(bytes, valBeg, valLen()).replaceAll(FLD_STR, "|");
  }
}
