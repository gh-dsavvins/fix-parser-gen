package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OrdRejReason extends LongRef {

  public static final long EXCHANGE_CLOSED = 2;
  public static final long TRADE_ALONG_REQUIRED = 9;
  public static final long UNKNOWN_ACCOUNT = 15;
  public static final long STALE_ORDER = 8;
  public static final long TOO_LATE_TO_ENTER = 4;
  public static final long DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER = 7;
  public static final long UNKNOWN_SYMBOL = 1;
  public static final long INCORRECT_QUANTITY = 13;
  public static final long UNKNOWN_ORDER = 5;
  public static final long OTHER = 99;
  public static final long DUPLICATE_ORDER = 6;
  public static final long ORDER_EXCEEDS_LIMIT = 3;
  public static final long INCORRECT_ALLOCATED_QUANTITY = 14;
  public static final long BROKER = 0;
  public static final long UNSUPPORTED_ORDER_CHARACTERISTIC12_SURVEILLENCE_OPTION = 11;
  public static final long INVALID_INVESTOR_ID = 10;

  public OrdRejReason(Message message) {
    super(message, FixTag.ordRejReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> BROKER;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> UNKNOWN_SYMBOL;
        case '0' -> INVALID_INVESTOR_ID;
        case '1' -> UNSUPPORTED_ORDER_CHARACTERISTIC12_SURVEILLENCE_OPTION;
        case '3' -> INCORRECT_QUANTITY;
        case '4' -> INCORRECT_ALLOCATED_QUANTITY;
        case '5' -> UNKNOWN_ACCOUNT;
        default -> throw new RuntimeException("value");
      };
      case '2' -> EXCHANGE_CLOSED;
      case '3' -> ORDER_EXCEEDS_LIMIT;
      case '4' -> TOO_LATE_TO_ENTER;
      case '5' -> UNKNOWN_ORDER;
      case '6' -> DUPLICATE_ORDER;
      case '7' -> DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER;
      case '8' -> STALE_ORDER;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> TRADE_ALONG_REQUIRED;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}