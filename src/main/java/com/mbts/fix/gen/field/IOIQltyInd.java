package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class IOIQltyInd extends StringRef {

  public static final String HIGH = "H";
  public static final String MEDIUM = "M";
  public static final String LOW = "L";

  public IOIQltyInd(Message message) {
    super(message, FixTag.iOIQltyInd);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'H' -> HIGH;
      case 'L' -> LOW;
      case 'M' -> MEDIUM;
      default -> throw new RuntimeException("value");
    };
  }
}