package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BookingType extends LongRef {

  public static final long CFD = 1;
  public static final long TOTAL_RETURN_SWAP = 2;
  public static final long REGULAR_BOOKING = 0;

  public BookingType(Message message) {
    super(message, FixTag.bookingType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> REGULAR_BOOKING;
      case '1' -> CFD;
      case '2' -> TOTAL_RETURN_SWAP;
      default -> throw new RuntimeException("value");
    };
  }
}