package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollAsgnRespType extends LongRef {

  public static final long DECLINED = 2;
  public static final long REJECTED = 3;
  public static final long ACCEPTED = 1;
  public static final long RECEIVED = 0;

  public CollAsgnRespType(Message message) {
    super(message, FixTag.collAsgnRespType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> RECEIVED;
      case '1' -> ACCEPTED;
      case '2' -> DECLINED;
      case '3' -> REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}