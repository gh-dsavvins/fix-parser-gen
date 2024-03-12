package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Nested2PartySubIDType extends LongRef {

  public Nested2PartySubIDType(Message message) {
    super(message, FixTag.nested2PartySubIDType);
  }
}