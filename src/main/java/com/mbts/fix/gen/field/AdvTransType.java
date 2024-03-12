package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AdvTransType extends StringRef {

  public static final String CANCEL = "C";
  public static final String NEW = "N";
  public static final String REPLACE = "R";

  public AdvTransType(Message message) {
    super(message, FixTag.advTransType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'C' -> CANCEL;
      case 'N' -> NEW;
      case 'R' -> REPLACE;
      default -> throw new RuntimeException("value");
    };
  }
}