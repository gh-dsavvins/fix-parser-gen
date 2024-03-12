package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NetworkStatusResponseType extends LongRef {

  public static final long FULL = 1;
  public static final long INCREMENTAL_UPDATE = 2;

  public NetworkStatusResponseType(Message message) {
    super(message, FixTag.networkStatusResponseType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> FULL;
      case '2' -> INCREMENTAL_UPDATE;
      default -> throw new RuntimeException("value");
    };
  }
}