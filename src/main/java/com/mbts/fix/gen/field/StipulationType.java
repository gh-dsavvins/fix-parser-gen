package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class StipulationType extends StringRef {

  public static final String NUMBER_OF_PIECES = "PIECES";
  public static final String SUBSTITUTIONS_FREQUENCY = "SUBSFREQ";
  public static final String GEOGRAPHICS_AND_RANGE = "GEOG";
  public static final String ISSUE_SIZE_RANGE = "ISSUESIZE";
  public static final String STRUCTURE = "STRUCT";
  public static final String BARGAIN_CONDITIONS_SEE = "BGNCON";
  public static final String MARKET_SECTOR = "SECTOR";
  public static final String CUSTOM_START_END_DATE = "CUSTOMDATE";
  public static final String ISO_CURRENCY_CODE = "CURRENCY";
  public static final String YEAR_OR_YEAR_MONTH_OF_ISSUE = "ISSUE";
  public static final String PURPOSE = "PURPOSE";
  public static final String MINIMUM_QUANTITY = "MINQTY";
  public static final String WEIGHTED_AVERAGE_LIFE_COUPON_VALUE_IN_PERCENT = "WAL";
  public static final String MATURITY_YEAR_AND_MONTH = "MAT";
  public static final String MINIMUM_DENOMINATION = "MINDNOM";
  public static final String RESTRICTED = "RESTRICTED";
  public static final String SECURITYTYPE_INCLUDED_OR_EXCLUDED = "SECTYPE";
  public static final String MAXIMUM_SUBSTITUTIONS = "MAXSUBS";
  public static final String INSURED = "INSURED";
  public static final String LOOKBACK_DAYS = "LOOKBACK";
  public static final String PAYMENT_FREQUENCY_CALENDAR = "PAYFREQ";
  public static final String MATURITY_RANGE = "MATURITY";
  public static final String PRICE_RANGE = "PRICE";
  public static final String ISSUERS_TICKER = "ISSUER";
  public static final String WEIGHTED_AVERAGE_COUPONVALUE_IN_PERCENT = "WAC";
  public static final String COUPON_RANGE = "COUPON";
  public static final String WEIGHTED_AVERAGE_LOAN_AGE_VALUE_IN_MONTHS = "WALA";
  public static final String CALL_PROTECTION = "PROTECT";
  public static final String RATING_SOURCE_AND_RANGE = "RATING";
  public static final String TRADE_VARIANCE = "TRDVAR";
  public static final String AMT = "AMT";
  public static final String BENCHMARK_PRICE_SOURCE = "PXSOURCE";
  public static final String BANK_QUALIFIED = "BANKQUAL";
  public static final String POOLS_PER_LOT = "PPL";
  public static final String MINIMUM_INCREMENT = "MININCR";
  public static final String FREEFORM_TEXT = "TEXT";
  public static final String EXPLICIT_LOT_IDENTIFIER = "LOT";
  public static final String TYPE_OF_REDEMPTION_VALUES_ARE_NONCALLABLE_CALLABLE_PREFUNDED_ESCROWEDTOMATURITY_PUTABLE_CONVERTIBLE = "REDEMPTION";
  public static final String WHOLE_POOL = "WHOLE";
  public static final String WEIGHTED_AVERAGE_MATURITY_VALUE_IN_MONTHS = "WAM";
  public static final String VALUATION_DISCOUNT = "HAIRCUT";
  public static final String POOLS_PER_TRADE = "PPT";
  public static final String SUBSTITUTIONS_LEFT = "SUBSLEFT";
  public static final String POOLS_MAXIMUM = "PMAX";
  public static final String POOLS_PER_MILLION = "PPM";
  public static final String PRODUCTION_YEAR = "PROD";
  public static final String YIELD_RANGE = "YIELD";
  public static final String LOT_VARIANCE = "LOTVAR";
  public static final String AUTO_REINVESTMENT_AT_RATE_OR_BETTER = "AUTOREINV";
  public static final String PRICING_FREQUENCY = "PRICEFREQ";

  public StipulationType(Message message) {
    super(message, FixTag.stipulationType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> 
      switch(bytes[valBeg + 1]) {
        case 'M' -> AMT;
        case 'U' -> AUTO_REINVESTMENT_AT_RATE_OR_BETTER;
        default -> throw new RuntimeException("value");
      };
      case 'B' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> BANK_QUALIFIED;
        case 'G' -> BARGAIN_CONDITIONS_SEE;
        default -> throw new RuntimeException("value");
      };
      case 'C' -> 
      switch(bytes[valBeg + 1]) {
        case 'O' -> COUPON_RANGE;
        case 'U' -> 
        switch(bytes[valBeg + 2]) {
          case 'R' -> ISO_CURRENCY_CODE;
          case 'S' -> CUSTOM_START_END_DATE;
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'G' -> GEOGRAPHICS_AND_RANGE;
      case 'H' -> VALUATION_DISCOUNT;
      case 'I' -> 
      switch(bytes[valBeg + 1]) {
        case 'N' -> INSURED;
        case 'S' -> 
        switch(bytes[valBeg + 2]) {
          case 'S' -> 
          switch(bytes[valBeg + 3]) {
            case 'U' -> 
            switch(bytes[valBeg + 4]) {
              case 'E' -> 
              switch(bytes[valBeg + 5]) {
                case '' -> YEAR_OR_YEAR_MONTH_OF_ISSUE;
                case 'R' -> ISSUERS_TICKER;
                case 'S' -> ISSUE_SIZE_RANGE;
                default -> throw new RuntimeException("value");
              };
              default -> throw new RuntimeException("value");
            };
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'L' -> 
      switch(bytes[valBeg + 1]) {
        case 'O' -> 
        switch(bytes[valBeg + 2]) {
          case 'O' -> LOOKBACK_DAYS;
          case 'T' -> 
          switch(bytes[valBeg + 3]) {
            case '' -> EXPLICIT_LOT_IDENTIFIER;
            case 'V' -> LOT_VARIANCE;
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'M' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> 
        switch(bytes[valBeg + 2]) {
          case 'T' -> 
          switch(bytes[valBeg + 3]) {
            case '' -> MATURITY_YEAR_AND_MONTH;
            case 'U' -> MATURITY_RANGE;
            default -> throw new RuntimeException("value");
          };
          case 'X' -> MAXIMUM_SUBSTITUTIONS;
          default -> throw new RuntimeException("value");
        };
        case 'I' -> 
        switch(bytes[valBeg + 2]) {
          case 'N' -> 
          switch(bytes[valBeg + 3]) {
            case 'D' -> MINIMUM_DENOMINATION;
            case 'I' -> MINIMUM_INCREMENT;
            case 'Q' -> MINIMUM_QUANTITY;
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'P' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> PAYMENT_FREQUENCY_CALENDAR;
        case 'I' -> NUMBER_OF_PIECES;
        case 'M' -> POOLS_MAXIMUM;
        case 'P' -> 
        switch(bytes[valBeg + 2]) {
          case 'L' -> POOLS_PER_LOT;
          case 'M' -> POOLS_PER_MILLION;
          case 'T' -> POOLS_PER_TRADE;
          default -> throw new RuntimeException("value");
        };
        case 'R' -> 
        switch(bytes[valBeg + 2]) {
          case 'I' -> 
          switch(bytes[valBeg + 3]) {
            case 'C' -> 
            switch(bytes[valBeg + 4]) {
              case 'E' -> 
              switch(bytes[valBeg + 5]) {
                case '' -> PRICE_RANGE;
                case 'F' -> PRICING_FREQUENCY;
                default -> throw new RuntimeException("value");
              };
              default -> throw new RuntimeException("value");
            };
            default -> throw new RuntimeException("value");
          };
          case 'O' -> 
          switch(bytes[valBeg + 3]) {
            case 'D' -> PRODUCTION_YEAR;
            case 'T' -> CALL_PROTECTION;
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        case 'U' -> PURPOSE;
        case 'X' -> BENCHMARK_PRICE_SOURCE;
        default -> throw new RuntimeException("value");
      };
      case 'R' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> RATING_SOURCE_AND_RANGE;
        case 'E' -> 
        switch(bytes[valBeg + 2]) {
          case 'D' -> TYPE_OF_REDEMPTION_VALUES_ARE_NONCALLABLE_CALLABLE_PREFUNDED_ESCROWEDTOMATURITY_PUTABLE_CONVERTIBLE;
          case 'S' -> RESTRICTED;
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'S' -> 
      switch(bytes[valBeg + 1]) {
        case 'E' -> 
        switch(bytes[valBeg + 2]) {
          case 'C' -> 
          switch(bytes[valBeg + 3]) {
            case 'T' -> 
            switch(bytes[valBeg + 4]) {
              case 'O' -> MARKET_SECTOR;
              case 'Y' -> SECURITYTYPE_INCLUDED_OR_EXCLUDED;
              default -> throw new RuntimeException("value");
            };
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        case 'T' -> STRUCTURE;
        case 'U' -> 
        switch(bytes[valBeg + 2]) {
          case 'B' -> 
          switch(bytes[valBeg + 3]) {
            case 'S' -> 
            switch(bytes[valBeg + 4]) {
              case 'F' -> SUBSTITUTIONS_FREQUENCY;
              case 'L' -> SUBSTITUTIONS_LEFT;
              default -> throw new RuntimeException("value");
            };
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'T' -> 
      switch(bytes[valBeg + 1]) {
        case 'E' -> FREEFORM_TEXT;
        case 'R' -> TRADE_VARIANCE;
        default -> throw new RuntimeException("value");
      };
      case 'W' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> 
        switch(bytes[valBeg + 2]) {
          case 'C' -> WEIGHTED_AVERAGE_COUPONVALUE_IN_PERCENT;
          case 'L' -> 
          switch(bytes[valBeg + 3]) {
            case '' -> WEIGHTED_AVERAGE_LIFE_COUPON_VALUE_IN_PERCENT;
            case 'A' -> WEIGHTED_AVERAGE_LOAN_AGE_VALUE_IN_MONTHS;
            default -> throw new RuntimeException("value");
          };
          case 'M' -> WEIGHTED_AVERAGE_MATURITY_VALUE_IN_MONTHS;
          default -> throw new RuntimeException("value");
        };
        case 'H' -> WHOLE_POOL;
        default -> throw new RuntimeException("value");
      };
      case 'Y' -> YIELD_RANGE;
      default -> throw new RuntimeException("value");
    };
  }
}