package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradSesMode extends LongRef {

  public static final long TESTING = 1;
  public static final long SIMULATED = 2;
  public static final long PRODUCTION = 3;

  public TradSesMode(Message message) {
    super(message, FixTag.tradSesMode);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> TESTING;
      case '2' -> SIMULATED;
      case '3' -> PRODUCTION;
      default -> throw new RuntimeException("value");
    };
  }
}