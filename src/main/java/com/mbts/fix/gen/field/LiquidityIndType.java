package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LiquidityIndType extends LongRef {

  public static final long OTHER = 4;
  public static final long _5DAY_MOVING_AVERAGE = 1;
  public static final long NORMAL_MARKET_SIZE = 3;
  public static final long _20_DAY_MOVING_AVERAGE = 2;

  public LiquidityIndType(Message message) {
    super(message, FixTag.liquidityIndType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> _5DAY_MOVING_AVERAGE;
      case '2' -> _20_DAY_MOVING_AVERAGE;
      case '3' -> NORMAL_MARKET_SIZE;
      case '4' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}