package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecurityTradingStatus extends LongRef {

  public static final long UNKNOWN_OR_INVALID = 20;
  public static final long NEW_PRICE_INDICATION = 15;
  public static final long READY_TO_TRADE = 17;
  public static final long PRICE_INDICATION = 5;
  public static final long ITS_PRE_OPENING = 14;
  public static final long TRADING_HALT = 2;
  public static final long NOT_TRADED_ON_THIS_MARKET = 19;
  public static final long MARKET_IMBALANCE_SELL = 8;
  public static final long MARKET_ON_CLOSE_IMBALANCE_SELL = 10;
  public static final long PRE_OPEN = 21;
  public static final long OPENING_ROTATION = 22;
  public static final long NO_OPEN_NO_RESUME = 4;
  public static final long NO_MARKET_IMBALANCE = 12;
  public static final long NO_MARKET_ON_CLOSE_IMBALANCE = 13;
  public static final long MARKET_ON_CLOSE_IMBALANCE_BUY = 9;
  public static final long MARKET_IMBALANCE_BUY = 7;
  public static final long TRADE_DISSEMINATION_TIME = 16;
  public static final long NOT_AVAILABLE_FOR_TRADING = 18;
  public static final long FAST_MARKET = 23;
  public static final long OPENING_DELAY = 1;
  public static final long TRADING_RANGE_INDICATION = 6;
  public static final long RESUME = 3;

  public SecurityTradingStatus(Message message) {
    super(message, FixTag.securityTradingStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> OPENING_DELAY;
        case '0' -> MARKET_ON_CLOSE_IMBALANCE_SELL;
        case '2' -> NO_MARKET_IMBALANCE;
        case '3' -> NO_MARKET_ON_CLOSE_IMBALANCE;
        case '4' -> ITS_PRE_OPENING;
        case '5' -> NEW_PRICE_INDICATION;
        case '6' -> TRADE_DISSEMINATION_TIME;
        case '7' -> READY_TO_TRADE;
        case '8' -> NOT_AVAILABLE_FOR_TRADING;
        case '9' -> NOT_TRADED_ON_THIS_MARKET;
        default -> throw new RuntimeException("value");
      };
      case '2' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> TRADING_HALT;
        case '0' -> UNKNOWN_OR_INVALID;
        case '1' -> PRE_OPEN;
        case '2' -> OPENING_ROTATION;
        case '3' -> FAST_MARKET;
        default -> throw new RuntimeException("value");
      };
      case '3' -> RESUME;
      case '4' -> NO_OPEN_NO_RESUME;
      case '5' -> PRICE_INDICATION;
      case '6' -> TRADING_RANGE_INDICATION;
      case '7' -> MARKET_IMBALANCE_BUY;
      case '8' -> MARKET_IMBALANCE_SELL;
      case '9' -> MARKET_ON_CLOSE_IMBALANCE_BUY;
      default -> throw new RuntimeException("value");
    };
  }
}