package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ExerciseMethod extends StringRef {

  public static final String AUTOMATIC = "A";
  public static final String MANUAL = "M";

  public ExerciseMethod(Message message) {
    super(message, FixTag.exerciseMethod);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> AUTOMATIC;
      case 'M' -> MANUAL;
      default -> throw new RuntimeException("value");
    };
  }
}