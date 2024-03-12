package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteCancelType extends LongRef {

  public static final long CANCEL_FOR_SECURITY_TYPE = 2;
  public static final long CANCEL_FOR_UNDERLYING_SYMBOL = 3;
  public static final long CANCEL_ALL_QUOTES = 4;
  public static final long CANCEL_FOR_SYMBOL = 1;

  public QuoteCancelType(Message message) {
    super(message, FixTag.quoteCancelType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> CANCEL_FOR_SYMBOL;
      case '2' -> CANCEL_FOR_SECURITY_TYPE;
      case '3' -> CANCEL_FOR_UNDERLYING_SYMBOL;
      case '4' -> CANCEL_ALL_QUOTES;
      default -> throw new RuntimeException("value");
    };
  }
}