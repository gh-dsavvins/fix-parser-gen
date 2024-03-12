package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlCurrFxRateCalc extends StringRef {

  public static final String MULTIPLY = "M";
  public static final String DIVIDE = "D";

  public SettlCurrFxRateCalc(Message message) {
    super(message, FixTag.settlCurrFxRateCalc);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'D' -> DIVIDE;
      case 'M' -> MULTIPLY;
      default -> throw new RuntimeException("value");
    };
  }
}