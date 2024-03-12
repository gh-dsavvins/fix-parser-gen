package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class UserStatus extends LongRef {

  public static final long USER_NOT_RECOGNISED = 3;
  public static final long PASSWORD_CHANGED = 5;
  public static final long PASSWORD_INCORRECT = 4;
  public static final long LOGGED_IN = 1;
  public static final long NOT_LOGGED_IN = 2;
  public static final long OTHER = 6;

  public UserStatus(Message message) {
    super(message, FixTag.userStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> LOGGED_IN;
      case '2' -> NOT_LOGGED_IN;
      case '3' -> USER_NOT_RECOGNISED;
      case '4' -> PASSWORD_INCORRECT;
      case '5' -> PASSWORD_CHANGED;
      case '6' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}