package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AssignmentMethod extends StringRef {

  public static final String RANDOM = "R";
  public static final String PRORATA = "P";

  public AssignmentMethod(Message message) {
    super(message, FixTag.assignmentMethod);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'P' -> PRORATA;
      case 'R' -> RANDOM;
      default -> throw new RuntimeException("value");
    };
  }
}