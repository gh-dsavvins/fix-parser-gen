package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlInstSource extends StringRef {

  public static final String INVESTOR = "3";
  public static final String BROKERS_INSTRUCTIONS = "1";
  public static final String INSTITUTIONS_INSTRUCTIONS = "2";

  public SettlInstSource(Message message) {
    super(message, FixTag.settlInstSource);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> BROKERS_INSTRUCTIONS;
      case '2' -> INSTITUTIONS_INSTRUCTIONS;
      case '3' -> INVESTOR;
      default -> throw new RuntimeException("value");
    };
  }
}