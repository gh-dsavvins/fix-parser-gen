package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ListOrderStatus extends LongRef {

  public static final long REJECT = 7;
  public static final long ALL_DONE = 6;
  public static final long RECEIVEDFOREXECUTION = 2;
  public static final long INBIDDINGPROCESS = 1;
  public static final long EXECUTING = 3;
  public static final long CANCELING = 4;
  public static final long ALERT = 5;

  public ListOrderStatus(Message message) {
    super(message, FixTag.listOrderStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> INBIDDINGPROCESS;
      case '2' -> RECEIVEDFOREXECUTION;
      case '3' -> EXECUTING;
      case '4' -> CANCELING;
      case '5' -> ALERT;
      case '6' -> ALL_DONE;
      case '7' -> REJECT;
      default -> throw new RuntimeException("value");
    };
  }
}