package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MultiLegRptTypeReq extends LongRef {

  public static final long REPORT_BY_MULTILEG_SECURITY_AND_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY = 1;
  public static final long REPORT_BY_MULITLEG_SECURITY_ONLY = 0;
  public static final long REPORT_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY_ONLY = 2;

  public MultiLegRptTypeReq(Message message) {
    super(message, FixTag.multiLegRptTypeReq);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> REPORT_BY_MULITLEG_SECURITY_ONLY;
      case '1' -> REPORT_BY_MULTILEG_SECURITY_AND_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY;
      case '2' -> REPORT_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY_ONLY;
      default -> throw new RuntimeException("value");
    };
  }
}