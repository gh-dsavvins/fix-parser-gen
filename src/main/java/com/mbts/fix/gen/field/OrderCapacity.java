package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OrderCapacity extends StringRef {

  public static final String RISKLESS_PRINCIPAL = "R";
  public static final String PRINCIPAL = "P";
  public static final String AGENT_FOR_OTHER_MEMBER = "W";
  public static final String PROPRIETARY = "G";
  public static final String INDIVIDUAL = "I";
  public static final String AGENCY = "A";

  public OrderCapacity(Message message) {
    super(message, FixTag.orderCapacity);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> AGENCY;
      case 'G' -> PROPRIETARY;
      case 'I' -> INDIVIDUAL;
      case 'P' -> PRINCIPAL;
      case 'R' -> RISKLESS_PRINCIPAL;
      case 'W' -> AGENT_FOR_OTHER_MEMBER;
      default -> throw new RuntimeException("value");
    };
  }
}