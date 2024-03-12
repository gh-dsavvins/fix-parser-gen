package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteStatus extends LongRef {

  public static final long CANCELED_DUE_TO_CROSS_MARKET = 15;
  public static final long PASS = 11;
  public static final long CANCELED_ALL = 4;
  public static final long CROSS_MARKET_WARNING = 13;
  public static final long EXPIRED = 7;
  public static final long REMOVED_FROM_MARKET = 6;
  public static final long LOCKED_MARKET_WARNING = 12;
  public static final long CANCELED_FOR_SECURITY_TYPE = 2;
  public static final long PENDING = 10;
  public static final long CANCELED_FOR_SYMBOL = 1;
  public static final long CANCELED_DUE_TO_LOCK_MARKET = 14;
  public static final long CANCELED_FOR_UNDERLYING = 3;
  public static final long REJECTED = 5;
  public static final long QUERY = 8;
  public static final long QUOTE_NOT_FOUND = 9;
  public static final long ACCEPTED = 0;

  public QuoteStatus(Message message) {
    super(message, FixTag.quoteStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ACCEPTED;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> CANCELED_FOR_SYMBOL;
        case '0' -> PENDING;
        case '1' -> PASS;
        case '2' -> LOCKED_MARKET_WARNING;
        case '3' -> CROSS_MARKET_WARNING;
        case '4' -> CANCELED_DUE_TO_LOCK_MARKET;
        case '5' -> CANCELED_DUE_TO_CROSS_MARKET;
        default -> throw new RuntimeException("value");
      };
      case '2' -> CANCELED_FOR_SECURITY_TYPE;
      case '3' -> CANCELED_FOR_UNDERLYING;
      case '4' -> CANCELED_ALL;
      case '5' -> REJECTED;
      case '6' -> REMOVED_FROM_MARKET;
      case '7' -> EXPIRED;
      case '8' -> QUERY;
      case '9' -> QUOTE_NOT_FOUND;
      default -> throw new RuntimeException("value");
    };
  }
}