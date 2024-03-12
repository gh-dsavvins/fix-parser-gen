package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NetworkRequestType extends LongRef {

  public static final long STOP_SUBSCRIBING = 4;
  public static final long LEVEL_OF_DETAIL_THEN_NOCOMPIDS_BECOMES_REQUIRED = 8;
  public static final long SUBSCRIBE = 2;
  public static final long SNAPSHOT = 1;

  public NetworkRequestType(Message message) {
    super(message, FixTag.networkRequestType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> SNAPSHOT;
      case '2' -> SUBSCRIBE;
      case '4' -> STOP_SUBSCRIBING;
      case '8' -> LEVEL_OF_DETAIL_THEN_NOCOMPIDS_BECOMES_REQUIRED;
      default -> throw new RuntimeException("value");
    };
  }
}