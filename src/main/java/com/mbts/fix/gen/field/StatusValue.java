package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class StatusValue extends LongRef {

  public static final long CONNECTED = 1;
  public static final long NOT_CONNECTED_DOWN_EXPECTED_UP = 2;
  public static final long NOT_CONNECTED_DOWN_EXPECTED_DOWN = 3;
  public static final long IN_PROCESS = 4;

  public StatusValue(Message message) {
    super(message, FixTag.statusValue);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> CONNECTED;
      case '2' -> NOT_CONNECTED_DOWN_EXPECTED_UP;
      case '3' -> NOT_CONNECTED_DOWN_EXPECTED_DOWN;
      case '4' -> IN_PROCESS;
      default -> throw new RuntimeException("value");
    };
  }
}