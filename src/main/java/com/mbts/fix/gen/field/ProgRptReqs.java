package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ProgRptReqs extends LongRef {

  public static final long BUYSIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUSREQUEST = 1;
  public static final long SELLSIDE_PERIODICALLY_SENDS_STATUS_USING_LISTSTATUS_PERIOD_OPTIONALLY_SPECIFIED_IN_PROGRESSPERIOD = 2;
  public static final long REAL_TIME_EXECUTION_REPORTS = 3;

  public ProgRptReqs(Message message) {
    super(message, FixTag.progRptReqs);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> BUYSIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUSREQUEST;
      case '2' -> SELLSIDE_PERIODICALLY_SENDS_STATUS_USING_LISTSTATUS_PERIOD_OPTIONALLY_SPECIFIED_IN_PROGRESSPERIOD;
      case '3' -> REAL_TIME_EXECUTION_REPORTS;
      default -> throw new RuntimeException("value");
    };
  }
}