package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TimeInForce extends StringRef {

  public static final String AT_THE_CLOSE = "7";
  public static final String IMMEDIATE_OR_CANCEL = "3";
  public static final String GOOD_TILL_DATE = "6";
  public static final String DAY = "0";
  public static final String AT_THE_OPENING = "2";
  public static final String GOOD_TILL_CROSSING = "5";
  public static final String GOOD_TILL_CANCEL = "1";
  public static final String FILL_OR_KILL = "4";

  public TimeInForce(Message message) {
    super(message, FixTag.timeInForce);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> DAY;
      case '1' -> GOOD_TILL_CANCEL;
      case '2' -> AT_THE_OPENING;
      case '3' -> IMMEDIATE_OR_CANCEL;
      case '4' -> FILL_OR_KILL;
      case '5' -> GOOD_TILL_CROSSING;
      case '6' -> GOOD_TILL_DATE;
      case '7' -> AT_THE_CLOSE;
      default -> throw new RuntimeException("value");
    };
  }
}