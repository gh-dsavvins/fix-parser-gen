package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradeReportRejectReason extends LongRef {

  public static final long INVALID_PARTY_INFORMATION = 1;
  public static final long UNKNOWN_INSTRUMENT = 2;
  public static final long OTHER = 99;
  public static final long INVALID_TRADE_TYPE = 4;
  public static final long SUCCESSFUL = 0;
  public static final long UNAUTHORIZED_TO_REPORT_TRADES = 3;

  public TradeReportRejectReason(Message message) {
    super(message, FixTag.tradeReportRejectReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SUCCESSFUL;
      case '1' -> INVALID_PARTY_INFORMATION;
      case '2' -> UNKNOWN_INSTRUMENT;
      case '3' -> UNAUTHORIZED_TO_REPORT_TRADES;
      case '4' -> INVALID_TRADE_TYPE;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}