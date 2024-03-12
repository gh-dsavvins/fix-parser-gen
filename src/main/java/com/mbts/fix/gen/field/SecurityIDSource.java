package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecurityIDSource extends StringRef {

  public static final String CONSOLIDATED_TAPE_ASSOCIATION = "9";
  public static final String CUSIP = "1";
  public static final String SICOVAM = "E";
  public static final String CLEARING_HOUSE = "H";
  public static final String QUIK = "3";
  public static final String BELGIAN = "F";
  public static final String WERTPAPIER = "B";
  public static final String VALOREN = "D";
  public static final String ISO_CURRENCY_CODE = "6";
  public static final String BLOOMBERG_SYMBOL = "A";
  public static final String ISIN_NUMBER = "4";
  public static final String OPTIONS_PRICE_REPORTING_AUTHORITY = "J";
  public static final String ISO_COUNTRY_CODE = "7";
  public static final String RIC_CODE = "5";
  public static final String EXCHANGE_SYMBOL = "8";
  public static final String SEDOL = "2";
  public static final String ISDA_FPML_PRODUCT_SPECIFICATION = "I";
  public static final String COMMON = "G";
  public static final String DUTCH = "C";

  public SecurityIDSource(Message message) {
    super(message, FixTag.securityIDSource);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> CUSIP;
      case '2' -> SEDOL;
      case '3' -> QUIK;
      case '4' -> ISIN_NUMBER;
      case '5' -> RIC_CODE;
      case '6' -> ISO_CURRENCY_CODE;
      case '7' -> ISO_COUNTRY_CODE;
      case '8' -> EXCHANGE_SYMBOL;
      case '9' -> CONSOLIDATED_TAPE_ASSOCIATION;
      case 'A' -> BLOOMBERG_SYMBOL;
      case 'B' -> WERTPAPIER;
      case 'C' -> DUTCH;
      case 'D' -> VALOREN;
      case 'E' -> SICOVAM;
      case 'F' -> BELGIAN;
      case 'G' -> COMMON;
      case 'H' -> CLEARING_HOUSE;
      case 'I' -> ISDA_FPML_PRODUCT_SPECIFICATION;
      case 'J' -> OPTIONS_PRICE_REPORTING_AUTHORITY;
      default -> throw new RuntimeException("value");
    };
  }
}