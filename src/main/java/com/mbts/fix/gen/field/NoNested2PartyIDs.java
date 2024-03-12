package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NoNested2PartyIDs extends LongRef {

  public NoNested2PartyIDs(Message message) {
    super(message, FixTag.noNested2PartyIDs);
  }
}