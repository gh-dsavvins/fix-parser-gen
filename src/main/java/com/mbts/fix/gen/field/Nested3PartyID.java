package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Nested3PartyID extends StringRef {

  public Nested3PartyID(Message message) {
    super(message, FixTag.nested3PartyID);
  }
}