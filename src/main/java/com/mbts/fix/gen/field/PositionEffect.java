package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PositionEffect extends StringRef {

  public static final String OPEN = "O";
  public static final String ROLLED = "R";
  public static final String FIFO = "F";
  public static final String CLOSE = "C";

  public PositionEffect(Message message) {
    super(message, FixTag.positionEffect);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'C' -> CLOSE;
      case 'F' -> FIFO;
      case 'O' -> OPEN;
      case 'R' -> ROLLED;
      default -> throw new RuntimeException("value");
    };
  }
}