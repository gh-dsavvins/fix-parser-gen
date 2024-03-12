package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class UnsolicitedIndicator extends StringRef {

  public static final String YES = "Y";
  public static final String NO = "N";

  public UnsolicitedIndicator(Message message) {
    super(message, FixTag.unsolicitedIndicator);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'N' -> NO;
      case 'Y' -> YES;
      default -> throw new RuntimeException("value");
    };
  }
}