package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CorporateAction extends StringRef {

  public static final String EX_DIVIDEND = "A";
  public static final String EX_RIGHTS = "C";
  public static final String EX_DISTRIBUTION = "B";
  public static final String NEW = "D";
  public static final String EX_INTEREST = "E";

  public CorporateAction(Message message) {
    super(message, FixTag.corporateAction);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> EX_DIVIDEND;
      case 'B' -> EX_DISTRIBUTION;
      case 'C' -> EX_RIGHTS;
      case 'D' -> NEW;
      case 'E' -> EX_INTEREST;
      default -> throw new RuntimeException("value");
    };
  }
}