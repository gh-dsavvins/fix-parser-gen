package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OrdStatus extends StringRef {

  public static final String CALCULATED = "B";
  public static final String SUSPENDED = "9";
  public static final String NEW = "0";
  public static final String PARTIALLY_FILLED = "1";
  public static final String FILLED = "2";
  public static final String ACCEPTED_FOR_BIDDING = "D";
  public static final String PENDING_REPLACE = "E";
  public static final String PENDING_NEW = "A";
  public static final String STOPPED = "7";
  public static final String DONE_FOR_DAY = "3";
  public static final String REJECTED = "8";
  public static final String EXPIRED = "C";
  public static final String CANCELED = "4";
  public static final String PENDING_CANCEL = "6";

  public OrdStatus(Message message) {
    super(message, FixTag.ordStatus);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NEW;
      case '1' -> PARTIALLY_FILLED;
      case '2' -> FILLED;
      case '3' -> DONE_FOR_DAY;
      case '4' -> CANCELED;
      case '6' -> PENDING_CANCEL;
      case '7' -> STOPPED;
      case '8' -> REJECTED;
      case '9' -> SUSPENDED;
      case 'A' -> PENDING_NEW;
      case 'B' -> CALCULATED;
      case 'C' -> EXPIRED;
      case 'D' -> ACCEPTED_FOR_BIDDING;
      case 'E' -> PENDING_REPLACE;
      default -> throw new RuntimeException("value");
    };
  }
}