package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteRequestType extends LongRef {

  public static final long MANUAL = 1;
  public static final long AUTOMATIC = 2;

  public QuoteRequestType(Message message) {
    super(message, FixTag.quoteRequestType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> MANUAL;
      case '2' -> AUTOMATIC;
      default -> throw new RuntimeException("value");
    };
  }
}