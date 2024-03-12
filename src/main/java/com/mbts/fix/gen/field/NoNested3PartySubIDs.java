package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NoNested3PartySubIDs extends LongRef {

  public NoNested3PartySubIDs(Message message) {
    super(message, FixTag.noNested3PartySubIDs);
  }
}