package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SideMultiLegReportingType extends LongRef {

  public static final long INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY = 2;
  public static final long SINGLE_SECURITY = 1;
  public static final long MULTI_LEG_SECURITY = 3;

  public SideMultiLegReportingType(Message message) {
    super(message, FixTag.sideMultiLegReportingType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> SINGLE_SECURITY;
      case '2' -> INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY;
      case '3' -> MULTI_LEG_SECURITY;
      default -> throw new RuntimeException("value");
    };
  }
}