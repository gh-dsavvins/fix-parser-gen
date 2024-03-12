package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class EventType extends LongRef {

  public static final long CALL = 2;
  public static final long TENDER = 3;
  public static final long SINKING_FUND_CALL = 4;
  public static final long OTHER = 99;
  public static final long PUT = 1;

  public EventType(Message message) {
    super(message, FixTag.eventType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> PUT;
      case '2' -> CALL;
      case '3' -> TENDER;
      case '4' -> SINKING_FUND_CALL;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}