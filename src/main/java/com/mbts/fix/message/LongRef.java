package com.mbts.fix.message;

import com.mbts.fix.api.Field;
import com.mbts.fix.api.Message;
import com.mbts.fix.api.Tag;

import static com.mbts.fix.Environment.UNSET_LONG;
import static com.mbts.fix.Environment.UNSET_STR;

public class LongRef extends NumberRef {

  long value;

  public LongRef(Message message, Tag tag) {
    super(message, tag);
  }

  public LongRef() {
    this(null, null);
  }

  public long value() {
    if(dirty()) {
      return value;
    }
    if(!mapped()) {
      return UNSET_LONG;
    }
    if(!parsed) {
      parse();
    }
    return value;
  }

  protected void parse() {
    value = 0;
    boolean neg = false;
    byte[] bytes = message.bytes;
    int beg = valBeg;
    if(bytes[beg] == '-') {
      neg = true;
      beg++;
    }
    for (int i = beg; i < valLim; i++) {
      byte c = bytes[i];
      value *= 10;
      value += c - '0';
    }
    if(neg) {
      value = -value;
    }
  }

  @SuppressWarnings("unchecked")
  public <F extends Field> F set(long value) {
    this.value = value;
    int charLength = stringSize(value);
    ensureCapacity(charLength);
    chars(value, charLength, newValue);
    newValueLength = charLength;
    onValueSet();
    return (F) this;
  }

  @Override
  public boolean equals(Object o) {
    if(o == null || !LongRef.class.isAssignableFrom(o.getClass())) {
      return false;
    }
    LongRef n = (LongRef) o;
    return value == n.value;
  }

  @Override
  public void unset() {
    super.unset();
    value = UNSET_LONG;
  }

  @Override
  public String toString() {
    return dirty()
        ? Long.toString(value)
        : mapped()
          ? new String(message.bytes, valBeg, valLen())
          : UNSET_STR;
  }
}
