package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradeAllocIndicator extends LongRef {

  public static final long USE_ALLOCATION_PROVIDED_WITH_THE_TRADE = 2;
  public static final long ALLOCATION_NOT_REQUIRED = 0;
  public static final long ALLOCATION_REQUIRED = 1;

  public TradeAllocIndicator(Message message) {
    super(message, FixTag.tradeAllocIndicator);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ALLOCATION_NOT_REQUIRED;
      case '1' -> ALLOCATION_REQUIRED;
      case '2' -> USE_ALLOCATION_PROVIDED_WITH_THE_TRADE;
      default -> throw new RuntimeException("value");
    };
  }
}