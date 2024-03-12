package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DeleteReason extends StringRef {

  public static final String ERROR = "1";
  public static final String CANCELATION = "0";

  public DeleteReason(Message message) {
    super(message, FixTag.deleteReason);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> CANCELATION;
      case '1' -> ERROR;
      default -> throw new RuntimeException("value");
    };
  }
}