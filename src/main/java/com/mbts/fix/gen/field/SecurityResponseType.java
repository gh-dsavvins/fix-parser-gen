package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecurityResponseType extends LongRef {

  public static final long CAN_NOT_MATCH_SELECTION_CRITERIA = 6;
  public static final long ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE = 2;
  public static final long REJECT_SECURITY_PROPOSAL = 5;
  public static final long ACCEPT_SECURITY_PROPOSAL_AS_IS = 1;

  public SecurityResponseType(Message message) {
    super(message, FixTag.securityResponseType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ACCEPT_SECURITY_PROPOSAL_AS_IS;
      case '2' -> ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE;
      case '5' -> REJECT_SECURITY_PROPOSAL;
      case '6' -> CAN_NOT_MATCH_SELECTION_CRITERIA;
      default -> throw new RuntimeException("value");
    };
  }
}