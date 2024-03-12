package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DayBookingInst extends StringRef {

  public static final String SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING = "1";
  public static final String ACCUMULATE = "2";
  public static final String CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR = "0";

  public DayBookingInst(Message message) {
    super(message, FixTag.dayBookingInst);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR;
      case '1' -> SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING;
      case '2' -> ACCUMULATE;
      default -> throw new RuntimeException("value");
    };
  }
}