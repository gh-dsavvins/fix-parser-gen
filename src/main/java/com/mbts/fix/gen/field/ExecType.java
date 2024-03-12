package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ExecType extends StringRef {

  public static final String CALCULATED = "B";
  public static final String SUSPENDED = "9";
  public static final String NEW = "0";
  public static final String TRADE = "F";
  public static final String PENDING_REPLACE = "E";
  public static final String PENDING_NEW = "A";
  public static final String STOPPED = "7";
  public static final String DONE_FOR_DAY = "3";
  public static final String REJECTED = "8";
  public static final String EXPIRED = "C";
  public static final String RESTATED = "D";
  public static final String CANCELED = "4";
  public static final String REPLACE = "5";
  public static final String ORDER_STATUS = "I";
  public static final String PENDING_CANCEL = "6";
  public static final String TRADE_CANCEL = "H";
  public static final String TRADE_CORRECT = "G";

  public ExecType(Message message) {
    super(message, FixTag.execType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NEW;
      case '3' -> DONE_FOR_DAY;
      case '4' -> CANCELED;
      case '5' -> REPLACE;
      case '6' -> PENDING_CANCEL;
      case '7' -> STOPPED;
      case '8' -> REJECTED;
      case '9' -> SUSPENDED;
      case 'A' -> PENDING_NEW;
      case 'B' -> CALCULATED;
      case 'C' -> EXPIRED;
      case 'D' -> RESTATED;
      case 'E' -> PENDING_REPLACE;
      case 'F' -> TRADE;
      case 'G' -> TRADE_CORRECT;
      case 'H' -> TRADE_CANCEL;
      case 'I' -> ORDER_STATUS;
      default -> throw new RuntimeException("value");
    };
  }
}