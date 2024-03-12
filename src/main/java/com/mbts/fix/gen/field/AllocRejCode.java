package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocRejCode extends LongRef {

  public static final long COMMISSION_DIFFERENCE = 4;
  public static final long UNKNOWN_LISTID = 6;
  public static final long OTHER = 7;
  public static final long UNKNOWN_OR_STALE_EXECID = 10;
  public static final long UNKNOWN_CLORDID = 12;
  public static final long CALCULATION_DIFFERENCE = 9;
  public static final long UNKNOWN_EXECUTING_BROKER_MNEMONIC = 3;
  public static final long INCORRECT_QUANTITY = 1;
  public static final long WAREHOUSE_REQUEST_REJECTED = 13;
  public static final long UNKNOWN_ORDERID = 5;
  public static final long UNKNOWN_ACCOUNT = 0;
  public static final long MISMATCHED_DATA_VALUE = 11;
  public static final long INCORRECT_AVERAGE_PRICE = 2;
  public static final long INCORRECT_ALLOCATED_QUANTITY = 8;

  public AllocRejCode(Message message) {
    super(message, FixTag.allocRejCode);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> UNKNOWN_ACCOUNT;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> INCORRECT_QUANTITY;
        case '0' -> UNKNOWN_OR_STALE_EXECID;
        case '1' -> MISMATCHED_DATA_VALUE;
        case '2' -> UNKNOWN_CLORDID;
        case '3' -> WAREHOUSE_REQUEST_REJECTED;
        default -> throw new RuntimeException("value");
      };
      case '2' -> INCORRECT_AVERAGE_PRICE;
      case '3' -> UNKNOWN_EXECUTING_BROKER_MNEMONIC;
      case '4' -> COMMISSION_DIFFERENCE;
      case '5' -> UNKNOWN_ORDERID;
      case '6' -> UNKNOWN_LISTID;
      case '7' -> OTHER;
      case '8' -> INCORRECT_ALLOCATED_QUANTITY;
      case '9' -> CALCULATION_DIFFERENCE;
      default -> throw new RuntimeException("value");
    };
  }
}