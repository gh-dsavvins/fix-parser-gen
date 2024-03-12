package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class YieldType extends StringRef {

  public static final String CURRENT_YIELD = "CURRENT";
  public static final String MARK_TO_MARKET_YIELD = "MARK";
  public static final String TAX_EQUIVALENT_YIELD = "TAXEQUIV";
  public static final String YIELD_TO_AVERAGE_MATURITY = "AVGMATURITY";
  public static final String YIELD_TO_SHORTEST_AVERAGE_LIFE = "SHORTAVGLIFE";
  public static final String YIELD_TO_NEXT_CALL = "CALL";
  public static final String INVERSE_FLOATER_BOND_YIELD = "INVERSEFLOATER";
  public static final String CLOSING_YIELD_MOST_RECENT_MONTH = "LASTMONTH";
  public static final String AFTER_TAX_YIELD = "AFTERTAX";
  public static final String BOOK_YIELD = "BOOK";
  public static final String TRUE_YIELD = "TRUE";
  public static final String YIELD_WITH_INFLATION_ASSUMPTION = "INFLATION";
  public static final String GOVERNMENT_EQUIVALENT_YIELD = "GOVTEQUIV";
  public static final String YIELD_TO_TENDER_DATE = "TENDER";
  public static final String TRUE_GROSS_YIELD = "GROSS";
  public static final String YIELD_TO_NEXT_PUT = "PUT";
  public static final String PREVIOUS_CLOSE_YIELD = "PREVCLOSE";
  public static final String PROCEEDS_YIELD = "PROCEEDS";
  public static final String YIELD_VALUE_OF_1_32 = "VALUE1/32";
  public static final String MOST_RECENT_CLOSING_YIELD = "LASTCLOSE";
  public static final String YIELD_CHANGE_SINCE_CLOSE = "CHANGE";
  public static final String CLOSING_YIELD_MOST_RECENT_QUARTER = "LASTQUARTER";
  public static final String YIELD_TO_NEXT_REFUND = "NEXTREFUND";
  public static final String YIELD_TO_LONGEST_AVERAGE_LIFE = "LONGAVGLIFE";
  public static final String CLOSING_YIELD_MOST_RECENT_YEAR = "LASTYEAR";
  public static final String OPEN_AVERAGE_YIELD = "OPENAVG";
  public static final String SEMI_ANNUAL_YIELD = "SEMIANNUAL";
  public static final String COMPOUND_YIELD = "COMPOUND";
  public static final String ANNUAL_YIELD = "ANNUAL";
  public static final String YIELD_AT_ISSUE = "ATISSUE";
  public static final String CLOSING_YIELD = "CLOSE";
  public static final String SIMPLE_YIELD = "SIMPLE";
  public static final String YIELD_TO_WORST = "WORST";
  public static final String YIELD_TO_MATURITY = "MATURITY";

  public YieldType(Message message) {
    super(message, FixTag.yieldType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> 
      switch(bytes[valBeg + 1]) {
        case 'F' -> AFTER_TAX_YIELD;
        case 'N' -> ANNUAL_YIELD;
        case 'T' -> YIELD_AT_ISSUE;
        case 'V' -> YIELD_TO_AVERAGE_MATURITY;
        default -> throw new RuntimeException("value");
      };
      case 'B' -> BOOK_YIELD;
      case 'C' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> YIELD_TO_NEXT_CALL;
        case 'H' -> YIELD_CHANGE_SINCE_CLOSE;
        case 'L' -> CLOSING_YIELD;
        case 'O' -> COMPOUND_YIELD;
        case 'U' -> CURRENT_YIELD;
        default -> throw new RuntimeException("value");
      };
      case 'G' -> 
      switch(bytes[valBeg + 1]) {
        case 'O' -> GOVERNMENT_EQUIVALENT_YIELD;
        case 'R' -> TRUE_GROSS_YIELD;
        default -> throw new RuntimeException("value");
      };
      case 'I' -> 
      switch(bytes[valBeg + 1]) {
        case 'N' -> 
        switch(bytes[valBeg + 2]) {
          case 'F' -> YIELD_WITH_INFLATION_ASSUMPTION;
          case 'V' -> INVERSE_FLOATER_BOND_YIELD;
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'L' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> 
        switch(bytes[valBeg + 2]) {
          case 'S' -> 
          switch(bytes[valBeg + 3]) {
            case 'T' -> 
            switch(bytes[valBeg + 4]) {
              case 'C' -> MOST_RECENT_CLOSING_YIELD;
              case 'M' -> CLOSING_YIELD_MOST_RECENT_MONTH;
              case 'Q' -> CLOSING_YIELD_MOST_RECENT_QUARTER;
              case 'Y' -> CLOSING_YIELD_MOST_RECENT_YEAR;
              default -> throw new RuntimeException("value");
            };
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        case 'O' -> YIELD_TO_LONGEST_AVERAGE_LIFE;
        default -> throw new RuntimeException("value");
      };
      case 'M' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> 
        switch(bytes[valBeg + 2]) {
          case 'R' -> MARK_TO_MARKET_YIELD;
          case 'T' -> YIELD_TO_MATURITY;
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'N' -> YIELD_TO_NEXT_REFUND;
      case 'O' -> OPEN_AVERAGE_YIELD;
      case 'P' -> 
      switch(bytes[valBeg + 1]) {
        case 'R' -> 
        switch(bytes[valBeg + 2]) {
          case 'E' -> PREVIOUS_CLOSE_YIELD;
          case 'O' -> PROCEEDS_YIELD;
          default -> throw new RuntimeException("value");
        };
        case 'U' -> YIELD_TO_NEXT_PUT;
        default -> throw new RuntimeException("value");
      };
      case 'S' -> 
      switch(bytes[valBeg + 1]) {
        case 'E' -> SEMI_ANNUAL_YIELD;
        case 'H' -> YIELD_TO_SHORTEST_AVERAGE_LIFE;
        case 'I' -> SIMPLE_YIELD;
        default -> throw new RuntimeException("value");
      };
      case 'T' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> TAX_EQUIVALENT_YIELD;
        case 'E' -> YIELD_TO_TENDER_DATE;
        case 'R' -> TRUE_YIELD;
        default -> throw new RuntimeException("value");
      };
      case 'V' -> YIELD_VALUE_OF_1_32;
      case 'W' -> YIELD_TO_WORST;
      default -> throw new RuntimeException("value");
    };
  }
}