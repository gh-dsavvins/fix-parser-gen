package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecurityRequestResult extends LongRef {

  public static final long NO_INSTRUMENTS_FOUND_THAT_MATCH_SELECTION_CRITERIA = 2;
  public static final long INSTRUMENT_DATA_TEMPORARILY_UNAVAILABLE = 4;
  public static final long NOT_AUTHORIZED_TO_RETRIEVE_INSTRUMENT_DATA = 3;
  public static final long INVALID_OR_UNSUPPORTED_REQUEST = 1;
  public static final long REQUEST_FOR_INSTRUMENT_DATA_NOT_SUPPORTED = 5;
  public static final long VALID_REQUEST = 0;

  public SecurityRequestResult(Message message) {
    super(message, FixTag.securityRequestResult);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> VALID_REQUEST;
      case '1' -> INVALID_OR_UNSUPPORTED_REQUEST;
      case '2' -> NO_INSTRUMENTS_FOUND_THAT_MATCH_SELECTION_CRITERIA;
      case '3' -> NOT_AUTHORIZED_TO_RETRIEVE_INSTRUMENT_DATA;
      case '4' -> INSTRUMENT_DATA_TEMPORARILY_UNAVAILABLE;
      case '5' -> REQUEST_FOR_INSTRUMENT_DATA_NOT_SUPPORTED;
      default -> throw new RuntimeException("value");
    };
  }
}