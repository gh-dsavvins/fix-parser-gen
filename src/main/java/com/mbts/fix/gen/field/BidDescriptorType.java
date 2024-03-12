package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BidDescriptorType extends LongRef {

  public static final long SECTOR = 1;
  public static final long COUNTRY = 2;
  public static final long INDEX = 3;

  public BidDescriptorType(Message message) {
    super(message, FixTag.bidDescriptorType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> SECTOR;
      case '2' -> COUNTRY;
      case '3' -> INDEX;
      default -> throw new RuntimeException("value");
    };
  }
}