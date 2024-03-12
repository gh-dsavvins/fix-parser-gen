package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteRejectReason extends LongRef {

  public static final long TOO_LATE_TO_ENTER = 4;
  public static final long UNKNOWN_SYMBOL = 1;
  public static final long UNKNOWN_QUOTE = 5;
  public static final long QUOTE_REQUEST_EXCEEDS_LIMIT = 3;
  public static final long NOT_AUTHORIZED_TO_QUOTE_SECURITY = 9;
  public static final long OTHER = 99;
  public static final long EXCHANGE = 2;
  public static final long DUPLICATE_QUOTE = 6;
  public static final long INVALID_PRICE = 8;
  public static final long INVALID_BID_ASK_SPREAD = 7;

  public QuoteRejectReason(Message message) {
    super(message, FixTag.quoteRejectReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> UNKNOWN_SYMBOL;
      case '2' -> EXCHANGE;
      case '3' -> QUOTE_REQUEST_EXCEEDS_LIMIT;
      case '4' -> TOO_LATE_TO_ENTER;
      case '5' -> UNKNOWN_QUOTE;
      case '6' -> DUPLICATE_QUOTE;
      case '7' -> INVALID_BID_ASK_SPREAD;
      case '8' -> INVALID_PRICE;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> NOT_AUTHORIZED_TO_QUOTE_SECURITY;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}