package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BusinessRejectReason extends LongRef {

  public static final long UNKOWN_ID = 1;
  public static final long UNKNOWN_SECURITY = 2;
  public static final long UNSUPPORTED_MESSAGE_TYPE = 3;
  public static final long NOT_AUTHORIZED = 6;
  public static final long CONDITIONALLY_REQUIRED_FIELD_MISSING = 5;
  public static final long OTHER = 0;
  public static final long APPLICATION_NOT_AVAILABLE = 4;
  public static final long DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME = 7;

  public BusinessRejectReason(Message message) {
    super(message, FixTag.businessRejectReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> OTHER;
      case '1' -> UNKOWN_ID;
      case '2' -> UNKNOWN_SECURITY;
      case '3' -> UNSUPPORTED_MESSAGE_TYPE;
      case '4' -> APPLICATION_NOT_AVAILABLE;
      case '5' -> CONDITIONALLY_REQUIRED_FIELD_MISSING;
      case '6' -> NOT_AUTHORIZED;
      case '7' -> DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME;
      default -> throw new RuntimeException("value");
    };
  }
}