package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlPriceType extends LongRef {

  public static final long THEORETICAL = 2;
  public static final long FINAL = 1;

  public SettlPriceType(Message message) {
    super(message, FixTag.settlPriceType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> FINAL;
      case '2' -> THEORETICAL;
      default -> throw new RuntimeException("value");
    };
  }
}