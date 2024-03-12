package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MsgDirection extends StringRef {

  public static final String SEND = "S";
  public static final String RECEIVE = "R";

  public MsgDirection(Message message) {
    super(message, FixTag.msgDirection);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'R' -> RECEIVE;
      case 'S' -> SEND;
      default -> throw new RuntimeException("value");
    };
  }
}