package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CommType extends StringRef {

  public static final String _4 = "4";
  public static final String _5 = "5";
  public static final String PER_UNIT = "1";
  public static final String ABSOLUTE = "3";
  public static final String POINTS_PER_BOND_OR_CONTRACT_SUPPLY_CONTRACTMULTIPLIER = "6";
  public static final String PERCENTAGE = "2";

  public CommType(Message message) {
    super(message, FixTag.commType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> PER_UNIT;
      case '2' -> PERCENTAGE;
      case '3' -> ABSOLUTE;
      case '4' -> _4;
      case '5' -> _5;
      case '6' -> POINTS_PER_BOND_OR_CONTRACT_SUPPLY_CONTRACTMULTIPLIER;
      default -> throw new RuntimeException("value");
    };
  }
}