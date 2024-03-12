package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LastLiquidityInd extends LongRef {

  public static final long ADDED_LIQUIDITY = 1;
  public static final long LIQUIDITY_ROUTED_OUT = 3;
  public static final long REMOVED_LIQUIDITY = 2;

  public LastLiquidityInd(Message message) {
    super(message, FixTag.lastLiquidityInd);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ADDED_LIQUIDITY;
      case '2' -> REMOVED_LIQUIDITY;
      case '3' -> LIQUIDITY_ROUTED_OUT;
      default -> throw new RuntimeException("value");
    };
  }
}