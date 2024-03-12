package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ListStatusType extends LongRef {

  public static final long RESPONSE = 2;
  public static final long ALERT = 6;
  public static final long EXECSTARTED = 4;
  public static final long ALLDONE = 5;
  public static final long TIMED = 3;
  public static final long ACK = 1;

  public ListStatusType(Message message) {
    super(message, FixTag.listStatusType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ACK;
      case '2' -> RESPONSE;
      case '3' -> TIMED;
      case '4' -> EXECSTARTED;
      case '5' -> ALLDONE;
      case '6' -> ALERT;
      default -> throw new RuntimeException("value");
    };
  }
}