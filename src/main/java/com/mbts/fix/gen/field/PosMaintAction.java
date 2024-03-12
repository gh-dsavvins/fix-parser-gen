package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosMaintAction extends LongRef {

  public static final long REPLACE_USED_TO_OVERRIDE_THE_OVERALL_TRANSACTION_QUANTITY_OR_SPECIFIC_ADD_MESSAGES_BASED_ON_THE_REFERENCE_ID = 2;
  public static final long NEW_USED_TO_INCREMENT_THE_OVERALL_TRANSACTION_QUANTITY = 1;
  public static final long CANCEL_USED_TO_REMOVE_THE_OVERALL_TRANSACTION_OR_SPECIFIC_ADD_MESSAGES_BASED_ON_REFERENCE_ID = 3;

  public PosMaintAction(Message message) {
    super(message, FixTag.posMaintAction);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> NEW_USED_TO_INCREMENT_THE_OVERALL_TRANSACTION_QUANTITY;
      case '2' -> REPLACE_USED_TO_OVERRIDE_THE_OVERALL_TRANSACTION_QUANTITY_OR_SPECIFIC_ADD_MESSAGES_BASED_ON_THE_REFERENCE_ID;
      case '3' -> CANCEL_USED_TO_REMOVE_THE_OVERALL_TRANSACTION_OR_SPECIFIC_ADD_MESSAGES_BASED_ON_REFERENCE_ID;
      default -> throw new RuntimeException("value");
    };
  }
}