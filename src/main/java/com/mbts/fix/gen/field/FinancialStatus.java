package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class FinancialStatus extends StringRef {

  public static final String BANKRUPT = "1";
  public static final String PENDING_DELISTING = "2";

  public FinancialStatus(Message message) {
    super(message, FixTag.financialStatus);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> BANKRUPT;
      case '2' -> PENDING_DELISTING;
      default -> throw new RuntimeException("value");
    };
  }
}