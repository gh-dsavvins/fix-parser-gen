package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PegLimitType extends LongRef {

  public static final long STRICT_LIMIT_IS_A_STRICT_LIMIT = 1;
  public static final long OR_WORSE_FOR_A_BUY_THE_PEG_LIMIT_IS_A_MINIMUM_AND_FOR_A_SELL_THE_PEG_LIMIT_IS_A_MAXIMUM = 2;
  public static final long OR_BETTER = 0;

  public PegLimitType(Message message) {
    super(message, FixTag.pegLimitType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> OR_BETTER;
      case '1' -> STRICT_LIMIT_IS_A_STRICT_LIMIT;
      case '2' -> OR_WORSE_FOR_A_BUY_THE_PEG_LIMIT_IS_A_MINIMUM_AND_FOR_A_SELL_THE_PEG_LIMIT_IS_A_MAXIMUM;
      default -> throw new RuntimeException("value");
    };
  }
}