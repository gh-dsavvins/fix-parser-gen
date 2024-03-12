package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DKReason extends StringRef {

  public static final String OTHER = "Z";
  public static final String PRICE_EXCEEDS_LIMIT = "E";
  public static final String CALCULATION_DIFFERENCE = "F";
  public static final String WRONG_SIDE = "B";
  public static final String NO_MATCHING_ORDER = "D";
  public static final String QUANTITY_EXCEEDS_ORDER = "C";
  public static final String UNKNOWN_SYMBOL = "A";

  public DKReason(Message message) {
    super(message, FixTag.dKReason);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> UNKNOWN_SYMBOL;
      case 'B' -> WRONG_SIDE;
      case 'C' -> QUANTITY_EXCEEDS_ORDER;
      case 'D' -> NO_MATCHING_ORDER;
      case 'E' -> PRICE_EXCEEDS_LIMIT;
      case 'F' -> CALCULATION_DIFFERENCE;
      case 'Z' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}