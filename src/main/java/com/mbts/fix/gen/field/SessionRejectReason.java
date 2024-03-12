package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SessionRejectReason extends LongRef {

  public static final long SIGNATURE_PROBLEM = 8;
  public static final long INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP = 16;
  public static final long DECRYPTION_PROBLEM = 7;
  public static final long COMPID_PROBLEM = 9;
  public static final long NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER = 17;
  public static final long TAG_SPECIFIED_WITHOUT_A_VALUE = 4;
  public static final long XML_VALIDATION_ERROR = 12;
  public static final long INVALID_TAG_NUMBER = 0;
  public static final long INVALID_MSGTYPE = 11;
  public static final long REQUIRED_TAG_MISSING = 1;
  public static final long UNDEFINED_TAG = 3;
  public static final long TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER = 14;
  public static final long VALUE_IS_INCORRECT = 5;
  public static final long TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE = 2;
  public static final long INCORRECT_DATA_FORMAT_FOR_VALUE = 6;
  public static final long REPEATING_GROUP_FIELDS_OUT_OF_ORDER = 15;
  public static final long OTHER = 99;
  public static final long TAG_APPEARS_MORE_THAN_ONCE = 13;
  public static final long SENDINGTIME_ACCURACY_PROBLEM = 10;

  public SessionRejectReason(Message message) {
    super(message, FixTag.sessionRejectReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> INVALID_TAG_NUMBER;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> REQUIRED_TAG_MISSING;
        case '0' -> SENDINGTIME_ACCURACY_PROBLEM;
        case '1' -> INVALID_MSGTYPE;
        case '2' -> XML_VALIDATION_ERROR;
        case '3' -> TAG_APPEARS_MORE_THAN_ONCE;
        case '4' -> TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER;
        case '5' -> REPEATING_GROUP_FIELDS_OUT_OF_ORDER;
        case '6' -> INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP;
        case '7' -> NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER;
        default -> throw new RuntimeException("value");
      };
      case '2' -> TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE;
      case '3' -> UNDEFINED_TAG;
      case '4' -> TAG_SPECIFIED_WITHOUT_A_VALUE;
      case '5' -> VALUE_IS_INCORRECT;
      case '6' -> INCORRECT_DATA_FORMAT_FOR_VALUE;
      case '7' -> DECRYPTION_PROBLEM;
      case '8' -> SIGNATURE_PROBLEM;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> COMPID_PROBLEM;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}