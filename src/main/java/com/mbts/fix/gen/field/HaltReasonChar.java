package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class HaltReasonChar extends StringRef {

  public static final String ORDER_IMBALANCE = "I";
  public static final String ORDER_INFLUX = "E";
  public static final String NEWS_PENDING = "P";
  public static final String EQUIPMENT_CHANGEOVER = "X";
  public static final String ADDITIONAL_INFORMATION = "M";
  public static final String NEWS_DISSEMINATION = "D";

  public HaltReasonChar(Message message) {
    super(message, FixTag.haltReasonChar);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'D' -> NEWS_DISSEMINATION;
      case 'E' -> ORDER_INFLUX;
      case 'I' -> ORDER_IMBALANCE;
      case 'M' -> ADDITIONAL_INFORMATION;
      case 'P' -> NEWS_PENDING;
      case 'X' -> EQUIPMENT_CHANGEOVER;
      default -> throw new RuntimeException("value");
    };
  }
}