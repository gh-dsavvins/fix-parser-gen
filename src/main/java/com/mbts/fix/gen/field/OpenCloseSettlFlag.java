package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OpenCloseSettlFlag extends StringRef {

  public static final String DELIVERY_SETTLEMENT_ENTRY = "2";
  public static final String THEORETICAL_PRICE_VALUE = "5";
  public static final String DAILY_OPEN = "0";
  public static final String SESSION_OPEN = "1";
  public static final String EXPECTED_ENTRY = "3";
  public static final String ENTRY_FROM_PREVIOUS_BUSINESS_DAY = "4";

  public OpenCloseSettlFlag(Message message) {
    super(message, FixTag.openCloseSettlFlag);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> DAILY_OPEN;
      case '1' -> SESSION_OPEN;
      case '2' -> DELIVERY_SETTLEMENT_ENTRY;
      case '3' -> EXPECTED_ENTRY;
      case '4' -> ENTRY_FROM_PREVIOUS_BUSINESS_DAY;
      case '5' -> THEORETICAL_PRICE_VALUE;
      default -> throw new RuntimeException("value");
    };
  }
}