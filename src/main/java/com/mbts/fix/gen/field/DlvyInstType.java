package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DlvyInstType extends StringRef {

  public static final String SECURITIES = "S";
  public static final String CASH = "C";

  public DlvyInstType(Message message) {
    super(message, FixTag.dlvyInstType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'C' -> CASH;
      case 'S' -> SECURITIES;
      default -> throw new RuntimeException("value");
    };
  }
}