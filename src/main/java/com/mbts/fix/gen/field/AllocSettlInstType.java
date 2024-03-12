package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocSettlInstType extends LongRef {

  public static final long USE_DEFAULT_INSTRUCTIONS = 0;
  public static final long SSI_DB_IDS_PROVIDED = 3;
  public static final long DERIVE_FROM_PARAMETERS_PROVIDED = 1;
  public static final long FULL_DETAILS_PROVIDED = 2;
  public static final long PHONE_FOR_INSTRUCTIONS = 4;

  public AllocSettlInstType(Message message) {
    super(message, FixTag.allocSettlInstType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> USE_DEFAULT_INSTRUCTIONS;
      case '1' -> DERIVE_FROM_PARAMETERS_PROVIDED;
      case '2' -> FULL_DETAILS_PROVIDED;
      case '3' -> SSI_DB_IDS_PROVIDED;
      case '4' -> PHONE_FOR_INSTRUCTIONS;
      default -> throw new RuntimeException("value");
    };
  }
}