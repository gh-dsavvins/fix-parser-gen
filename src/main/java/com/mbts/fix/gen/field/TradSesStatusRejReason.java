package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradSesStatusRejReason extends LongRef {

  public static final long UNKNOWN_OR_INVALID_TRADINGSESSIONID = 1;
  public static final long OTHER = 99;

  public TradSesStatusRejReason(Message message) {
    super(message, FixTag.tradSesStatusRejReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> UNKNOWN_OR_INVALID_TRADINGSESSIONID;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}