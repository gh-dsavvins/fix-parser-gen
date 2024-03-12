package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MDReqRejReason extends StringRef {

  public static final String INSUFFICIENT_PERMISSIONS = "3";
  public static final String UNSUPPORTED_MARKETDEPTH = "5";
  public static final String UNSUPPORTED_MDENTRYTYPE = "8";
  public static final String UNSUPPORTED_OPENCLOSESETTLEFLAG = "B";
  public static final String DUPLICATE_MDREQID = "1";
  public static final String UNSUPPORTED_MDIMPLICITDELETE = "C";
  public static final String UNKNOWN_SYMBOL = "0";
  public static final String UNSUPPORTED_TRADINGSESSIONID = "9";
  public static final String UNSUPPORTED_AGGREGATEDBOOK = "7";
  public static final String UNSUPPORTED_MDUPDATETYPE = "6";
  public static final String INSUFFICIENT_BANDWIDTH = "2";
  public static final String UNSUPPORTED_SCOPE = "A";
  public static final String UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE = "4";

  public MDReqRejReason(Message message) {
    super(message, FixTag.mDReqRejReason);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> UNKNOWN_SYMBOL;
      case '1' -> DUPLICATE_MDREQID;
      case '2' -> INSUFFICIENT_BANDWIDTH;
      case '3' -> INSUFFICIENT_PERMISSIONS;
      case '4' -> UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE;
      case '5' -> UNSUPPORTED_MARKETDEPTH;
      case '6' -> UNSUPPORTED_MDUPDATETYPE;
      case '7' -> UNSUPPORTED_AGGREGATEDBOOK;
      case '8' -> UNSUPPORTED_MDENTRYTYPE;
      case '9' -> UNSUPPORTED_TRADINGSESSIONID;
      case 'A' -> UNSUPPORTED_SCOPE;
      case 'B' -> UNSUPPORTED_OPENCLOSESETTLEFLAG;
      case 'C' -> UNSUPPORTED_MDIMPLICITDELETE;
      default -> throw new RuntimeException("value");
    };
  }
}