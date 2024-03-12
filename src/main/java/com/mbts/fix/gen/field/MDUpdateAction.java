package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MDUpdateAction extends StringRef {

  public static final String NEW = "0";
  public static final String CHANGE = "1";
  public static final String DELETE = "2";

  public MDUpdateAction(Message message) {
    super(message, FixTag.mDUpdateAction);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NEW;
      case '1' -> CHANGE;
      case '2' -> DELETE;
      default -> throw new RuntimeException("value");
    };
  }
}