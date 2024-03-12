package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollInquiryQualifier extends LongRef {

  public static final long FULLY_ASSIGNED = 6;
  public static final long OUTSTANDING_TRADES = 7;
  public static final long TRADEDATE = 0;
  public static final long GC_INSTRUMENT = 1;
  public static final long NOT_ASSIGNED = 4;
  public static final long PARTIALLY_ASSIGNED = 5;
  public static final long SUBSTITUTION_ELIGIBLE = 3;
  public static final long COLLATERALINSTRUMENT = 2;

  public CollInquiryQualifier(Message message) {
    super(message, FixTag.collInquiryQualifier);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> TRADEDATE;
      case '1' -> GC_INSTRUMENT;
      case '2' -> COLLATERALINSTRUMENT;
      case '3' -> SUBSTITUTION_ELIGIBLE;
      case '4' -> NOT_ASSIGNED;
      case '5' -> PARTIALLY_ASSIGNED;
      case '6' -> FULLY_ASSIGNED;
      case '7' -> OUTSTANDING_TRADES;
      default -> throw new RuntimeException("value");
    };
  }
}