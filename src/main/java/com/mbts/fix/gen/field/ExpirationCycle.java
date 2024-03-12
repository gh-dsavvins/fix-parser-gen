package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ExpirationCycle extends LongRef {

  public static final long EXPIRE_ON_TRADING_SESSION_CLOSE = 0;
  public static final long EXPIRE_ON_TRADING_SESSION_OPEN = 1;

  public ExpirationCycle(Message message) {
    super(message, FixTag.expirationCycle);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> EXPIRE_ON_TRADING_SESSION_CLOSE;
      case '1' -> EXPIRE_ON_TRADING_SESSION_OPEN;
      default -> throw new RuntimeException("value");
    };
  }
}