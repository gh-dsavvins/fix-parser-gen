package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class InstrRegistry extends StringRef {

  public InstrRegistry(Message message) {
    super(message, FixTag.instrRegistry);
  }
}