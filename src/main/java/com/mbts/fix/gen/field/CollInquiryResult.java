package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollInquiryResult extends LongRef {

  public static final long INVALID_OR_UNKNOWN_INSTRUMENT = 1;
  public static final long INVALID_OR_UNKNOWN_COLLATERAL_TYPE = 2;
  public static final long NO_COLLATERAL_FOUND_FOR_THE_ORDER_SPECIFIED = 7;
  public static final long UNAUTHORIZED_FOR_COLLATERAL_INQUIRY = 9;
  public static final long INVALID_DESTINATION_REQUESTED = 5;
  public static final long INVALID_PARTIES = 3;
  public static final long NO_COLLATERAL_FOUND_FOR_THE_TRADE_SPECIFIED = 6;
  public static final long OTHER = 99;
  public static final long INVALID_TRANSPORT_TYPE_REQUESTED = 4;
  public static final long SUCCESSFUL = 0;
  public static final long COLLATERAL_INQUIRY_TYPE_NOT_SUPPORTED = 8;

  public CollInquiryResult(Message message) {
    super(message, FixTag.collInquiryResult);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SUCCESSFUL;
      case '1' -> INVALID_OR_UNKNOWN_INSTRUMENT;
      case '2' -> INVALID_OR_UNKNOWN_COLLATERAL_TYPE;
      case '3' -> INVALID_PARTIES;
      case '4' -> INVALID_TRANSPORT_TYPE_REQUESTED;
      case '5' -> INVALID_DESTINATION_REQUESTED;
      case '6' -> NO_COLLATERAL_FOUND_FOR_THE_TRADE_SPECIFIED;
      case '7' -> NO_COLLATERAL_FOUND_FOR_THE_ORDER_SPECIFIED;
      case '8' -> COLLATERAL_INQUIRY_TYPE_NOT_SUPPORTED;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> UNAUTHORIZED_FOR_COLLATERAL_INQUIRY;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}