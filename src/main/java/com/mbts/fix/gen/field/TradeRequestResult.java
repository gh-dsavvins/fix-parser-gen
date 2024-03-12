package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradeRequestResult extends LongRef {

  public static final long INVALID_OR_UNKNOWN_INSTRUMENT = 1;
  public static final long INVALID_DESTINATION_REQUESTED = 5;
  public static final long INVALID_TYPE_OF_TRADE_REQUESTED = 2;
  public static final long INVALID_PARTIES = 3;
  public static final long OTHER = 99;
  public static final long TRADEREQUESTTYPE_NOT_SUPPORTED = 8;
  public static final long INVALID_TRANSPORT_TYPE_REQUESTED = 4;
  public static final long UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST = 9;
  public static final long SUCCESSFUL = 0;

  public TradeRequestResult(Message message) {
    super(message, FixTag.tradeRequestResult);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SUCCESSFUL;
      case '1' -> INVALID_OR_UNKNOWN_INSTRUMENT;
      case '2' -> INVALID_TYPE_OF_TRADE_REQUESTED;
      case '3' -> INVALID_PARTIES;
      case '4' -> INVALID_TRANSPORT_TYPE_REQUESTED;
      case '5' -> INVALID_DESTINATION_REQUESTED;
      case '8' -> TRADEREQUESTTYPE_NOT_SUPPORTED;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}