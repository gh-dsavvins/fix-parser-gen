package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CrossPrioritization extends LongRef {

  public static final long NONE = 0;
  public static final long SELL_SIDE_IS_PRIORITIZED = 2;
  public static final long BUY_SIDE_IS_PRIORITIZED = 1;

  public CrossPrioritization(Message message) {
    super(message, FixTag.crossPrioritization);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NONE;
      case '1' -> BUY_SIDE_IS_PRIORITIZED;
      case '2' -> SELL_SIDE_IS_PRIORITIZED;
      default -> throw new RuntimeException("value");
    };
  }
}