package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PublishTrdIndicator extends StringRef {

  public static final String YES = "Y";
  public static final String NO = "N";

  public PublishTrdIndicator(Message message) {
    super(message, FixTag.publishTrdIndicator);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'N' -> NO;
      case 'Y' -> YES;
      default -> throw new RuntimeException("value");
    };
  }
}