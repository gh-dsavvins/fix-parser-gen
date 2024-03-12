package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PegOffsetType extends LongRef {

  public static final long TICKS = 2;
  public static final long BASIS_POINTS = 1;
  public static final long PRICE_TIER = 3;
  public static final long PRICE = 0;

  public PegOffsetType(Message message) {
    super(message, FixTag.pegOffsetType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> PRICE;
      case '1' -> BASIS_POINTS;
      case '2' -> TICKS;
      case '3' -> PRICE_TIER;
      default -> throw new RuntimeException("value");
    };
  }
}