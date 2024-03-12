package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MultiLegReportingType extends StringRef {

  public static final String INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY = "2";
  public static final String SINGLE_SECURITY = "1";
  public static final String MULTI_LEG_SECURITY = "3";

  public MultiLegReportingType(Message message) {
    super(message, FixTag.multiLegReportingType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> SINGLE_SECURITY;
      case '2' -> INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY;
      case '3' -> MULTI_LEG_SECURITY;
      default -> throw new RuntimeException("value");
    };
  }
}