package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DiscretionInst extends StringRef {

  public static final String RELATED_TO_LOCAL_PRIMARY_PRICE = "3";
  public static final String RELATED_TO_LAST_TRADE_PRICE = "5";
  public static final String RELATED_TO_DISPLAYED_PRICE = "0";
  public static final String RELATED_TO_MARKET_PRICE = "1";
  public static final String RELATED_TO_PRIMARY_PRICE = "2";
  public static final String RELATED_TO_MIDPOINT_PRICE = "4";
  public static final String RELATED_TO_VWAP = "6";

  public DiscretionInst(Message message) {
    super(message, FixTag.discretionInst);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> RELATED_TO_DISPLAYED_PRICE;
      case '1' -> RELATED_TO_MARKET_PRICE;
      case '2' -> RELATED_TO_PRIMARY_PRICE;
      case '3' -> RELATED_TO_LOCAL_PRIMARY_PRICE;
      case '4' -> RELATED_TO_MIDPOINT_PRICE;
      case '5' -> RELATED_TO_LAST_TRADE_PRICE;
      case '6' -> RELATED_TO_VWAP;
      default -> throw new RuntimeException("value");
    };
  }
}