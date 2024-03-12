package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TargetStrategy extends LongRef {

  public static final long MININIZE_MARKET_IMPACT = 3;
  public static final long VWAP = 1;
  public static final long PARTICIPATE = 2;

  public TargetStrategy(Message message) {
    super(message, FixTag.targetStrategy);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> VWAP;
      case '2' -> PARTICIPATE;
      case '3' -> MININIZE_MARKET_IMPACT;
      default -> throw new RuntimeException("value");
    };
  }
}