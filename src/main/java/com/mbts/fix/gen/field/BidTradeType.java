package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BidTradeType extends StringRef {

  public static final String VWAP_GUARANTEE = "G";
  public static final String GUARANTEED_CLOSE = "J";
  public static final String RISK_TRADE = "R";
  public static final String AGENCY = "A";

  public BidTradeType(Message message) {
    super(message, FixTag.bidTradeType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> AGENCY;
      case 'G' -> VWAP_GUARANTEE;
      case 'J' -> GUARANTEED_CLOSE;
      case 'R' -> RISK_TRADE;
      default -> throw new RuntimeException("value");
    };
  }
}