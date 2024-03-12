package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Nested3PartyRole extends LongRef {

  public Nested3PartyRole(Message message) {
    super(message, FixTag.nested3PartyRole);
  }
}