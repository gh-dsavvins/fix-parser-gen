package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ProcessCode extends StringRef {

  public static final String SOFT_DOLLAR = "1";
  public static final String PLAN_SPONSOR = "6";
  public static final String REGULAR = "0";
  public static final String SOFT_DOLLAR_STEP_IN = "4";
  public static final String STEP_IN = "2";
  public static final String STEP_OUT = "3";
  public static final String SOFT_DOLLAR_STEP_OUT = "5";

  public ProcessCode(Message message) {
    super(message, FixTag.processCode);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> REGULAR;
      case '1' -> SOFT_DOLLAR;
      case '2' -> STEP_IN;
      case '3' -> STEP_OUT;
      case '4' -> SOFT_DOLLAR_STEP_IN;
      case '5' -> SOFT_DOLLAR_STEP_OUT;
      case '6' -> PLAN_SPONSOR;
      default -> throw new RuntimeException("value");
    };
  }
}