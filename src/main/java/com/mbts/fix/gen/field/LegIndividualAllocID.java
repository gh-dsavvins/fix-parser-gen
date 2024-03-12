package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LegIndividualAllocID extends StringRef {

  public LegIndividualAllocID(Message message) {
    super(message, FixTag.legIndividualAllocID);
  }
}