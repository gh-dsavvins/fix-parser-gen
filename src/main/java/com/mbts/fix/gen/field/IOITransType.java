package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class IOITransType extends StringRef {

  public static final String CANCEL = "C";
  public static final String NEW = "N";
  public static final String REPLACE = "R";

  public IOITransType(Message message) {
    super(message, FixTag.iOITransType);
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