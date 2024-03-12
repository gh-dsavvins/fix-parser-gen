package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteCondition extends StringRef {

  public static final String CONSOLIDATED_BEST = "D";
  public static final String OPEN = "A";
  public static final String EXCHANGE_BEST = "C";
  public static final String LOCKED = "E";
  public static final String CROSSED = "F";
  public static final String NON_FIRM = "I";
  public static final String FAST_TRADING = "H";
  public static final String CLOSED = "B";
  public static final String DEPTH = "G";

  public QuoteCondition(Message message) {
    super(message, FixTag.quoteCondition);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> OPEN;
      case 'B' -> CLOSED;
      case 'C' -> EXCHANGE_BEST;
      case 'D' -> CONSOLIDATED_BEST;
      case 'E' -> LOCKED;
      case 'F' -> CROSSED;
      case 'G' -> DEPTH;
      case 'H' -> FAST_TRADING;
      case 'I' -> NON_FIRM;
      default -> throw new RuntimeException("value");
    };
  }
}