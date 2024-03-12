package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CashMargin extends StringRef {

  public static final String CASH = "1";
  public static final String MARGIN_OPEN = "2";
  public static final String MARGIN_CLOSE = "3";

  public CashMargin(Message message) {
    super(message, FixTag.cashMargin);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> CASH;
      case '2' -> MARGIN_OPEN;
      case '3' -> MARGIN_CLOSE;
      default -> throw new RuntimeException("value");
    };
  }
}