package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlInstMode extends StringRef {

  public static final String SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT = "4";
  public static final String REQUEST_REJECT = "5";
  public static final String STANDING_INSTRUCTIONS_PROVIDED = "1";

  public SettlInstMode(Message message) {
    super(message, FixTag.settlInstMode);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> STANDING_INSTRUCTIONS_PROVIDED;
      case '4' -> SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT;
      case '5' -> REQUEST_REJECT;
      default -> throw new RuntimeException("value");
    };
  }
}