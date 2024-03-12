package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LegSwapType extends LongRef {

  public static final long PAR_FOR_PAR = 1;
  public static final long RISK = 4;
  public static final long MODIFIED_DURATION = 2;
  public static final long PROCEEDS = 5;

  public LegSwapType(Message message) {
    super(message, FixTag.legSwapType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> PAR_FOR_PAR;
      case '2' -> MODIFIED_DURATION;
      case '4' -> RISK;
      case '5' -> PROCEEDS;
      default -> throw new RuntimeException("value");
    };
  }
}