package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Scope extends StringRef {

  public static final String LOCAL = "1";
  public static final String NATIONAL = "2";
  public static final String GLOBAL = "3";

  public Scope(Message message) {
    super(message, FixTag.scope);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> LOCAL;
      case '2' -> NATIONAL;
      case '3' -> GLOBAL;
      default -> throw new RuntimeException("value");
    };
  }
}