package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class StandInstDbType extends LongRef {

  public static final long DTC_SID = 1;
  public static final long ACCOUNTNET = 4;
  public static final long OTHER = 0;
  public static final long A_GLOBAL_CUSTODIAN = 3;
  public static final long THOMSON_ALERT = 2;

  public StandInstDbType(Message message) {
    super(message, FixTag.standInstDbType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> OTHER;
      case '1' -> DTC_SID;
      case '2' -> THOMSON_ALERT;
      case '3' -> A_GLOBAL_CUSTODIAN;
      case '4' -> ACCOUNTNET;
      default -> throw new RuntimeException("value");
    };
  }
}