package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecurityRequestType extends LongRef {

  public static final long REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED = 1;
  public static final long REQUEST_LIST_SECURITY_TYPES = 2;
  public static final long REQUEST_LIST_SECURITIES = 3;
  public static final long REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS = 0;

  public SecurityRequestType(Message message) {
    super(message, FixTag.securityRequestType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS;
      case '1' -> REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED;
      case '2' -> REQUEST_LIST_SECURITY_TYPES;
      case '3' -> REQUEST_LIST_SECURITIES;
      default -> throw new RuntimeException("value");
    };
  }
}