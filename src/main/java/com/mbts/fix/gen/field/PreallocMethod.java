package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PreallocMethod extends StringRef {

  public static final String DO_NOT_PRO_RATA_DISCUSS_FIRST = "1";
  public static final String PRO_RATA = "0";

  public PreallocMethod(Message message) {
    super(message, FixTag.preallocMethod);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> PRO_RATA;
      case '1' -> DO_NOT_PRO_RATA_DISCUSS_FIRST;
      default -> throw new RuntimeException("value");
    };
  }
}