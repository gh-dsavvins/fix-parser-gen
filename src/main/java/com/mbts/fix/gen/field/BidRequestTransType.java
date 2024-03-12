package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BidRequestTransType extends StringRef {

  public static final String CANCEL = "C";
  public static final String NEW = "N";

  public BidRequestTransType(Message message) {
    super(message, FixTag.bidRequestTransType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'C' -> CANCEL;
      case 'N' -> NEW;
      default -> throw new RuntimeException("value");
    };
  }
}