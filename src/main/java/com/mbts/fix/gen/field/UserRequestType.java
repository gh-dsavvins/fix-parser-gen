package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class UserRequestType extends LongRef {

  public static final long REQUEST_INDIVIDUAL_USER_STATUS = 4;
  public static final long CHANGEPASSWORDFORUSER = 3;
  public static final long LOGOFFUSER = 2;
  public static final long LOGONUSER = 1;

  public UserRequestType(Message message) {
    super(message, FixTag.userRequestType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> LOGONUSER;
      case '2' -> LOGOFFUSER;
      case '3' -> CHANGEPASSWORDFORUSER;
      case '4' -> REQUEST_INDIVIDUAL_USER_STATUS;
      default -> throw new RuntimeException("value");
    };
  }
}