package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OwnershipType extends StringRef {

  public static final String JOINT_INVESTORS = "J";
  public static final String JOINT_TRUSTEES = "2";
  public static final String TENANTS_IN_COMMON = "T";

  public OwnershipType(Message message) {
    super(message, FixTag.ownershipType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '2' -> JOINT_TRUSTEES;
      case 'J' -> JOINT_INVESTORS;
      case 'T' -> TENANTS_IN_COMMON;
      default -> throw new RuntimeException("value");
    };
  }
}