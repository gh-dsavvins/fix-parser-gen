package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradeCondition extends StringRef {

  public static final String SELLER = "L";
  public static final String OPENING = "E";
  public static final String SOLD = "M";
  public static final String CASH_TRADE = "C";
  public static final String IMBALANCE_MORE_SELLERS = "Q";
  public static final String STOPPED_STOCK = "N";
  public static final String CASH = "A";
  public static final String SOLD_LAST = "I";
  public static final String INTRADAY_TRADE_DETAIL = "F";
  public static final String RULE_127_TRADE = "G";
  public static final String NEXT_DAY_TRADE = "J";
  public static final String IMBALANCE_MORE_BUYERS = "P";
  public static final String RULE_155_TRADE = "H";
  public static final String OPENING_PRICE = "R";
  public static final String NEXT_DAY = "D";
  public static final String AVERAGE_PRICE_TRADE = "B";
  public static final String OPENED = "K";

  public TradeCondition(Message message) {
    super(message, FixTag.tradeCondition);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> CASH;
      case 'B' -> AVERAGE_PRICE_TRADE;
      case 'C' -> CASH_TRADE;
      case 'D' -> NEXT_DAY;
      case 'E' -> OPENING;
      case 'F' -> INTRADAY_TRADE_DETAIL;
      case 'G' -> RULE_127_TRADE;
      case 'H' -> RULE_155_TRADE;
      case 'I' -> SOLD_LAST;
      case 'J' -> NEXT_DAY_TRADE;
      case 'K' -> OPENED;
      case 'L' -> SELLER;
      case 'M' -> SOLD;
      case 'N' -> STOPPED_STOCK;
      case 'P' -> IMBALANCE_MORE_BUYERS;
      case 'Q' -> IMBALANCE_MORE_SELLERS;
      case 'R' -> OPENING_PRICE;
      default -> throw new RuntimeException("value");
    };
  }
}