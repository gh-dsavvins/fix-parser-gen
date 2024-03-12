package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlInstTransType extends StringRef {

  public static final String RESTATE = "T";
  public static final String CANCEL = "C";
  public static final String NEW = "N";
  public static final String REPLACE = "R";

  public SettlInstTransType(Message message) {
    super(message, FixTag.settlInstTransType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'C' -> CANCEL;
      case 'N' -> NEW;
      case 'R' -> REPLACE;
      case 'T' -> RESTATE;
      default -> throw new RuntimeException("value");
    };
  }
}