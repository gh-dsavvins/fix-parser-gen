package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosType extends StringRef {

  public static final String START_OF_DAY_QTY = "SOD";
  public static final String PIT_TRADE_QTY = "PIT";
  public static final String INTER_SPREAD_QTY = "IES";
  public static final String DELIVERY_QTY = "DLV";
  public static final String END_OF_DAY_QTY = "FIN";
  public static final String TOTAL_TRANSACTION_QTY = "TOT";
  public static final String CROSS_MARGIN_QTY = "XM";
  public static final String AS_OF_TRADE_QTY = "ASF";
  public static final String OPTION_EXERCISE_QTY = "EX";
  public static final String ELECTRONIC_TRADE_QTY = "ETR";
  public static final String ADJUSTMENT_QTY = "PA";
  public static final String TRANSACTION_QUANTITY = "TQ";
  public static final String INTRA_SPREAD_QTY = "IAS";
  public static final String OPTION_ASSIGNMENT = "AS";
  public static final String TRANSACTION_FROM_ASSIGNMENT = "TA";
  public static final String TRANSACTION_FROM_EXERCISE = "TX";
  public static final String TRANSFER_TRADE_QTY = "TRF";
  public static final String ALLOCATION_TRADE_QTY = "ALC";
  public static final String INTEGRAL_SPLIT = "SPL";

  public PosType(Message message) {
    super(message, FixTag.posType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> 
      switch(bytes[valBeg + 1]) {
        case 'L' -> ALLOCATION_TRADE_QTY;
        case 'S' -> 
        switch(bytes[valBeg + 2]) {
          case '' -> OPTION_ASSIGNMENT;
          case 'F' -> AS_OF_TRADE_QTY;
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'D' -> DELIVERY_QTY;
      case 'E' -> 
      switch(bytes[valBeg + 1]) {
        case 'T' -> ELECTRONIC_TRADE_QTY;
        case 'X' -> OPTION_EXERCISE_QTY;
        default -> throw new RuntimeException("value");
      };
      case 'F' -> END_OF_DAY_QTY;
      case 'I' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> INTRA_SPREAD_QTY;
        case 'E' -> INTER_SPREAD_QTY;
        default -> throw new RuntimeException("value");
      };
      case 'P' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> ADJUSTMENT_QTY;
        case 'I' -> PIT_TRADE_QTY;
        default -> throw new RuntimeException("value");
      };
      case 'S' -> 
      switch(bytes[valBeg + 1]) {
        case 'O' -> START_OF_DAY_QTY;
        case 'P' -> INTEGRAL_SPLIT;
        default -> throw new RuntimeException("value");
      };
      case 'T' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> TRANSACTION_FROM_ASSIGNMENT;
        case 'O' -> TOTAL_TRANSACTION_QTY;
        case 'Q' -> TRANSACTION_QUANTITY;
        case 'R' -> TRANSFER_TRADE_QTY;
        case 'X' -> TRANSACTION_FROM_EXERCISE;
        default -> throw new RuntimeException("value");
      };
      case 'X' -> CROSS_MARGIN_QTY;
      default -> throw new RuntimeException("value");
    };
  }
}