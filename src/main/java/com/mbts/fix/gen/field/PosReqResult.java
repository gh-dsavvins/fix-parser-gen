package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosReqResult extends LongRef {

  public static final long OTHER = 99;
  public static final long NO_POSITIONS_FOUND_THAT_MATCH_CRITERIA = 2;
  public static final long INVALID_OR_UNSUPPORTED_REQUEST = 1;
  public static final long REQUEST_FOR_POSITION_NOT_SUPPORTED = 4;
  public static final long VALID_REQUEST = 0;
  public static final long NOT_AUTHORIZED_TO_REQUEST_POSITIONS = 3;

  public PosReqResult(Message message) {
    super(message, FixTag.posReqResult);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> VALID_REQUEST;
      case '1' -> INVALID_OR_UNSUPPORTED_REQUEST;
      case '2' -> NO_POSITIONS_FOUND_THAT_MATCH_CRITERIA;
      case '3' -> NOT_AUTHORIZED_TO_REQUEST_POSITIONS;
      case '4' -> REQUEST_FOR_POSITION_NOT_SUPPORTED;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}