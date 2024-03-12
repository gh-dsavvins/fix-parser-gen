package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteRequestRejectReason extends LongRef {

  public static final long TOO_LATE_TO_ENTER = 4;
  public static final long NO_MATCH_FOR_INQUIRY = 7;
  public static final long UNKNOWN_SYMBOL = 1;
  public static final long QUOTE_REQUEST_EXCEEDS_LIMIT = 3;
  public static final long INVALID_PRICE = 5;
  public static final long PASS = 10;
  public static final long OTHER = 99;
  public static final long EXCHANGE = 2;
  public static final long NOT_AUTHORIZED_TO_REQUEST_QUOTE = 6;
  public static final long NO_INVENTORY = 9;
  public static final long NO_MARKET_FOR_INSTRUMENT = 8;

  public QuoteRequestRejectReason(Message message) {
    super(message, FixTag.quoteRequestRejectReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> UNKNOWN_SYMBOL;
        case '0' -> PASS;
        default -> throw new RuntimeException("value");
      };
      case '2' -> EXCHANGE;
      case '3' -> QUOTE_REQUEST_EXCEEDS_LIMIT;
      case '4' -> TOO_LATE_TO_ENTER;
      case '5' -> INVALID_PRICE;
      case '6' -> NOT_AUTHORIZED_TO_REQUEST_QUOTE;
      case '7' -> NO_MATCH_FOR_INQUIRY;
      case '8' -> NO_MARKET_FOR_INSTRUMENT;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> NO_INVENTORY;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}