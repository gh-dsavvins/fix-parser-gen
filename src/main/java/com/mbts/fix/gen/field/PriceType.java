package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PriceType extends LongRef {

  public static final long FIXED_CABINET_TRADE_PRICE = 10;
  public static final long PER_UNIT = 2;
  public static final long FIXED_AMOUNT = 3;
  public static final long PERCENTAGE = 1;
  public static final long TED_PRICE = 7;
  public static final long YIELD = 9;
  public static final long PREMIUM_PERCENTAGE_POINTS_OVER_PAR = 5;
  public static final long SPREAD = 6;
  public static final long VARIABLE_CABINET_TRADE_PRICE = 11;
  public static final long TED_YIELD = 8;
  public static final long DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR = 4;

  public PriceType(Message message) {
    super(message, FixTag.priceType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> PERCENTAGE;
        case '0' -> FIXED_CABINET_TRADE_PRICE;
        case '1' -> VARIABLE_CABINET_TRADE_PRICE;
        default -> throw new RuntimeException("value");
      };
      case '2' -> PER_UNIT;
      case '3' -> FIXED_AMOUNT;
      case '4' -> DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR;
      case '5' -> PREMIUM_PERCENTAGE_POINTS_OVER_PAR;
      case '6' -> SPREAD;
      case '7' -> TED_PRICE;
      case '8' -> TED_YIELD;
      case '9' -> YIELD;
      default -> throw new RuntimeException("value");
    };
  }
}