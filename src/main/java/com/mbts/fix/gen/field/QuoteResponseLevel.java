package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteResponseLevel extends LongRef {

  public static final long ACKNOWLEDGE_ONLY_NEGATIVE_OR_ERRONEOUS_QUOTES = 1;
  public static final long ACKNOWLEDGE_EACH_QUOTE_MESSAGES = 2;
  public static final long NO_ACKNOWLEDGEMENT = 0;

  public QuoteResponseLevel(Message message) {
    super(message, FixTag.quoteResponseLevel);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NO_ACKNOWLEDGEMENT;
      case '1' -> ACKNOWLEDGE_ONLY_NEGATIVE_OR_ERRONEOUS_QUOTES;
      case '2' -> ACKNOWLEDGE_EACH_QUOTE_MESSAGES;
      default -> throw new RuntimeException("value");
    };
  }
}