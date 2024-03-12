package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AcctIDSource extends LongRef {

  public static final long TFM = 3;
  public static final long DTCC_CODE = 5;
  public static final long OMGEO = 4;
  public static final long OTHER = 99;
  public static final long SID_CODE = 2;
  public static final long BIC = 1;

  public AcctIDSource(Message message) {
    super(message, FixTag.acctIDSource);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> BIC;
      case '2' -> SID_CODE;
      case '3' -> TFM;
      case '4' -> OMGEO;
      case '5' -> DTCC_CODE;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}