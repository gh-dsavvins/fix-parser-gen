package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradeReportType extends LongRef {

  public static final long LOCKED_IN_TRADE_BREAK = 7;
  public static final long SUBMIT = 0;
  public static final long ADDENDUM = 4;
  public static final long DECLINE = 3;
  public static final long ACCEPT = 2;
  public static final long NO_WAS = 5;
  public static final long TRADE_REPORT_CANCEL = 6;
  public static final long ALLEGED = 1;

  public TradeReportType(Message message) {
    super(message, FixTag.tradeReportType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SUBMIT;
      case '1' -> ALLEGED;
      case '2' -> ACCEPT;
      case '3' -> DECLINE;
      case '4' -> ADDENDUM;
      case '5' -> NO_WAS;
      case '6' -> TRADE_REPORT_CANCEL;
      case '7' -> LOCKED_IN_TRADE_BREAK;
      default -> throw new RuntimeException("value");
    };
  }
}