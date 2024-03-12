package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MatchStatus extends StringRef {

  public static final String COMPARED_MATCHED_OR_AFFIRMED = "0";
  public static final String UNCOMPARED_UNMATCHED_OR_UNAFFIRMED = "1";
  public static final String ADVISORY_OR_ALERT = "2";

  public MatchStatus(Message message) {
    super(message, FixTag.matchStatus);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> COMPARED_MATCHED_OR_AFFIRMED;
      case '1' -> UNCOMPARED_UNMATCHED_OR_UNAFFIRMED;
      case '2' -> ADVISORY_OR_ALERT;
      default -> throw new RuntimeException("value");
    };
  }
}