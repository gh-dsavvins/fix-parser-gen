package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlSessID extends StringRef {

  public static final String REGULAR_TRADING_HOURS = "RTH";
  public static final String INTRADAY = "ITD";
  public static final String ELECTRONIC_TRADING_HOURS = "ETH";

  public SettlSessID(Message message) {
    super(message, FixTag.settlSessID);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'E' -> ELECTRONIC_TRADING_HOURS;
      case 'I' -> INTRADAY;
      case 'R' -> REGULAR_TRADING_HOURS;
      default -> throw new RuntimeException("value");
    };
  }
}