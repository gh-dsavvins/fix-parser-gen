package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocTransType extends StringRef {

  public static final String REPLACE = "1";
  public static final String NEW = "0";
  public static final String CANCEL = "2";

  public AllocTransType(Message message) {
    super(message, FixTag.allocTransType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NEW;
      case '1' -> REPLACE;
      case '2' -> CANCEL;
      default -> throw new RuntimeException("value");
    };
  }
}