package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Product extends LongRef {

  public static final long MORTGAGE = 10;
  public static final long COMMODITY = 2;
  public static final long MUNICIPAL = 11;
  public static final long OTHER = 12;
  public static final long GOVERNMENT = 6;
  public static final long LOAN = 8;
  public static final long AGENCY = 1;
  public static final long MONEYMARKET = 9;
  public static final long INDEX = 7;
  public static final long FINANCING = 13;
  public static final long CORPORATE = 3;
  public static final long CURRENCY = 4;
  public static final long EQUITY = 5;

  public Product(Message message) {
    super(message, FixTag.product);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> AGENCY;
        case '0' -> MORTGAGE;
        case '1' -> MUNICIPAL;
        case '2' -> OTHER;
        case '3' -> FINANCING;
        default -> throw new RuntimeException("value");
      };
      case '2' -> COMMODITY;
      case '3' -> CORPORATE;
      case '4' -> CURRENCY;
      case '5' -> EQUITY;
      case '6' -> GOVERNMENT;
      case '7' -> INDEX;
      case '8' -> LOAN;
      case '9' -> MONEYMARKET;
      default -> throw new RuntimeException("value");
    };
  }
}