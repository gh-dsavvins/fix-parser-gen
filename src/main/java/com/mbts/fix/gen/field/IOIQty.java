package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class IOIQty extends StringRef {

  public static final String LARGE = "L";
  public static final String SMALL = "S";
  public static final String MEDIUM = "M";

  public IOIQty(Message message) {
    super(message, FixTag.iOIQty);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'L' -> LARGE;
      case 'M' -> MEDIUM;
      case 'S' -> SMALL;
      default -> throw new RuntimeException("value");
    };
  }
}