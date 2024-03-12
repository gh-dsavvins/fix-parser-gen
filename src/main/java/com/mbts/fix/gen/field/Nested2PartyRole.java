package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Nested2PartyRole extends LongRef {

  public Nested2PartyRole(Message message) {
    super(message, FixTag.nested2PartyRole);
  }
}