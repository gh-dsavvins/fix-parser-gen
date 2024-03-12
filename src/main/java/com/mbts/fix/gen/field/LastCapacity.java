package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LastCapacity extends StringRef {

  public static final String AGENT = "1";
  public static final String CROSS_AS_AGENT = "2";
  public static final String PRINCIPAL = "4";
  public static final String CROSS_AS_PRINCIPAL = "3";

  public LastCapacity(Message message) {
    super(message, FixTag.lastCapacity);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> AGENT;
      case '2' -> CROSS_AS_AGENT;
      case '3' -> CROSS_AS_PRINCIPAL;
      case '4' -> PRINCIPAL;
      default -> throw new RuntimeException("value");
    };
  }
}