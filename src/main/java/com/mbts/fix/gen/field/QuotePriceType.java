package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuotePriceType extends LongRef {

  public static final long PER_SHARE = 2;
  public static final long FIXED_AMOUNT = 3;
  public static final long TED_PRICE = 7;
  public static final long PERCENT = 1;
  public static final long PREMIUM_PERCENTAGE_POINTS_OVER_PAR = 5;
  public static final long BASIS_POINTS_RELATIVE_TO_BENCHMARK = 6;
  public static final long TED_YIELD = 8;
  public static final long YIELD_SPREAD = 9;
  public static final long YIELD = 10;
  public static final long DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR = 4;

  public QuotePriceType(Message message) {
    super(message, FixTag.quotePriceType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> PERCENT;
        case '0' -> YIELD;
        default -> throw new RuntimeException("value");
      };
      case '2' -> PER_SHARE;
      case '3' -> FIXED_AMOUNT;
      case '4' -> DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR;
      case '5' -> PREMIUM_PERCENTAGE_POINTS_OVER_PAR;
      case '6' -> BASIS_POINTS_RELATIVE_TO_BENCHMARK;
      case '7' -> TED_PRICE;
      case '8' -> TED_YIELD;
      case '9' -> YIELD_SPREAD;
      default -> throw new RuntimeException("value");
    };
  }
}