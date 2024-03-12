package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ExecPriceType extends StringRef {

  public static final String CREATION_PRICE = "C";
  public static final String OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT = "Q";
  public static final String SINGLE_PRICE = "S";
  public static final String CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT = "E";
  public static final String OFFER_PRICE_MINUS_ADJUSTMENT = "P";
  public static final String CREATION_PRICE_PLUS_ADJUSTMENT = "D";
  public static final String OFFER_PRICE = "O";
  public static final String BID_PRICE = "B";

  public ExecPriceType(Message message) {
    super(message, FixTag.execPriceType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'B' -> BID_PRICE;
      case 'C' -> CREATION_PRICE;
      case 'D' -> CREATION_PRICE_PLUS_ADJUSTMENT;
      case 'E' -> CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT;
      case 'O' -> OFFER_PRICE;
      case 'P' -> OFFER_PRICE_MINUS_ADJUSTMENT;
      case 'Q' -> OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT;
      case 'S' -> SINGLE_PRICE;
      default -> throw new RuntimeException("value");
    };
  }
}