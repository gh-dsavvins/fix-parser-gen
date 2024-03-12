package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CancellationRights extends StringRef {

  public static final String NO_INSTITUTIONAL = "O";
  public static final String NO_WAIVER_AGREEMENT = "M";
  public static final String NO_EXECUTION_ONLY = "N";
  public static final String YES = "Y";

  public CancellationRights(Message message) {
    super(message, FixTag.cancellationRights);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'M' -> NO_WAIVER_AGREEMENT;
      case 'N' -> NO_EXECUTION_ONLY;
      case 'O' -> NO_INSTITUTIONAL;
      case 'Y' -> YES;
      default -> throw new RuntimeException("value");
    };
  }
}