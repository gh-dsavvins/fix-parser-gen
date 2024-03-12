package com.mbts.fix.message;

import com.mbts.fix.api.Message;
import com.mbts.fix.api.Tag;

import static com.mbts.fix.Environment.*;

public class StringRef extends AbstractField implements CharSequence {

  public StringRef() {
    this(null, null);
  }

  public StringRef(Message message, Tag tag) {
    super(message, tag);
  }

  @SuppressWarnings("unchecked")
  public <F extends AbstractField> F append(CharSequence sequence) {
    resetIfNew();
    int length = sequence.length();
    int newLength = length + newValueLength;
    ensureCapacity(newLength);
    for(int i = 0; i < length; i++, newValueLength++) {
      newValue[newValueLength] = (byte) sequence.charAt(i);
    }
    onValueSet();
    return (F) this;
  }

  @SuppressWarnings("unchecked")
  public <F extends AbstractField> F append(long number) {
    resetIfNew();
    newValueLength += NumberRef.stringSize(number);
    ensureCapacity(newValueLength);
    NumberRef.chars(number, newValueLength, newValue);
    onValueSet();
    return (F) this;
  }

  private void resetIfNew() {
    if(!mapped() && !dirty()) {
      newValueLength = 0;
    }
  }

  @Override
  public boolean equals(Object o) {
    if(o == null || !CharSequence.class.isAssignableFrom(o.getClass())) {
      return false;
    }
    CharSequence charSequence = (CharSequence) o;
    int length = length();
    if(length == charSequence.length()) {
      for (int i = 0; i < length; i++) {
        if(charAt(i) != charSequence.charAt(i)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  @Override
  void onValueSet() {
    hash = 0;
    super.onValueSet();
  }

  @Override
  public int length() {
    if(dirty()) {
      return newValueLength;
    }
    if(!mapped()) {
      return 0;
    }
    return valLen();
  }

  @Override
  public char charAt(int ix) {
    if(dirty()) {
      return (char) newValue[ix];
    }
    if(!mapped()) {
      return UNSET_CHAR;
    }
    return (char) message.bytes[valBeg + ix];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int hashCode() {
    String l;
    return hash == 0 ? (hash = _hashcode()) : hash;
  }

  private int _hashcode() {
    byte[] bytes = dirty() ? newValue : message.bytes;
    int beg = dirty() ? 0 : valBeg;
    int lim = dirty() ? newValueLength : valLim;
    int result = 1;
    for (int i = beg; i < lim; i++) {
      result = 31 * result + (bytes[i] & 0xff);
    }
    return result;
  }

  @Override
  public String toString() {
    return unset ? UNSET_STR
        : dirty() ? new String(newValue, 0, newValueLength)
          : mapped() ? new String(message.bytes, valBeg, valLen())
            : UNSET_STR;
  }
}