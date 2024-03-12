package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CxlRejResponseTo extends StringRef {

  public static final String ORDER_CANCEL_REQUEST = "1";
  public static final String ORDER_CANCEL_REPLACE_REQUEST = "2";

  public CxlRejResponseTo(Message message) {
    super(message, FixTag.cxlRejResponseTo);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ORDER_CANCEL_REQUEST;
      case '2' -> ORDER_CANCEL_REPLACE_REQUEST;
      default -> throw new RuntimeException("value");
    };
  }
}