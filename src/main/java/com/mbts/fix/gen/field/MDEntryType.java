package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MDEntryType extends StringRef {

  public static final String IMBALANCE = "A";
  public static final String INDEX_VALUE = "3";
  public static final String OPENING_PRICE = "4";
  public static final String TRADING_SESSION_LOW_PRICE = "8";
  public static final String TRADE = "2";
  public static final String SETTLEMENT_PRICE = "6";
  public static final String OPEN_INTEREST = "C";
  public static final String TRADE_VOLUME = "B";
  public static final String CLOSING_PRICE = "5";
  public static final String BID = "0";
  public static final String OFFER = "1";
  public static final String TRADING_SESSION_VWAP_PRICE = "9";
  public static final String TRADING_SESSION_HIGH_PRICE = "7";

  public MDEntryType(Message message) {
    super(message, FixTag.mDEntryType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> BID;
      case '1' -> OFFER;
      case '2' -> TRADE;
      case '3' -> INDEX_VALUE;
      case '4' -> OPENING_PRICE;
      case '5' -> CLOSING_PRICE;
      case '6' -> SETTLEMENT_PRICE;
      case '7' -> TRADING_SESSION_HIGH_PRICE;
      case '8' -> TRADING_SESSION_LOW_PRICE;
      case '9' -> TRADING_SESSION_VWAP_PRICE;
      case 'A' -> IMBALANCE;
      case 'B' -> TRADE_VOLUME;
      case 'C' -> OPEN_INTEREST;
      default -> throw new RuntimeException("value");
    };
  }
}