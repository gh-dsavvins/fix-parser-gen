package com.mbts.fix.message;

import com.mbts.fix.api.Field;
import com.mbts.fix.api.Message;
import com.mbts.fix.api.Tag;

import static com.mbts.fix.Environment.UNSET_BOOLEAN;
import static com.mbts.fix.Environment.UNSET_STR;

public class BooleanRef extends AbstractField {

  private static final String TRUE_STR = "Y";
  private static final String FALSE_STR = "N";
  private static final byte[] TRUE = TRUE_STR.getBytes();
  private static final byte[] FALSE = FALSE_STR.getBytes();

  private Boolean parsedValue = UNSET_BOOLEAN;

  public BooleanRef(Message message, Tag tag) {
    super(message, tag);
  }

  public BooleanRef() {
    this(null, null);
  }

  @SuppressWarnings("unchecked")
  public <F extends Field> F newValue(boolean value) {
    newValue = value ? TRUE : FALSE;
    newValueLength = 1;
    onValueSet();
    return (F) this;
  }

  void parse() {
    byte b = message.bytes[valBeg];
    switch (b) {
      case 'Y', 'y', 'T', 't', '1' -> parsedValue = Boolean.TRUE;
      case 'N', 'n', 'F', 'f', '0' -> parsedValue = Boolean.FALSE;
      default -> parsedValue = null;
    }
    parsed = true;
  }

  public Boolean value() {
    if(dirty()) {
      return newValue == TRUE ? Boolean.TRUE : Boolean.FALSE;
    }
    if(!mapped()) {
      return UNSET_BOOLEAN;
    }
    if(!parsed) {
      parse();
    }
    return parsedValue;
  }

  @Override
  public void unset() {
    super.unset();
    parsedValue = null;
  }

  @Override
  public String toString() {
    return dirty() ? newValue == TRUE ? TRUE_STR : FALSE_STR
        : mapped() ? new String(message.bytes, valBeg, valLen())
        : UNSET_STR;
  }
}
