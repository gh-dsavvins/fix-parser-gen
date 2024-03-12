package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OptAttribute extends StringRef {

  public OptAttribute(Message message) {
    super(message, FixTag.optAttribute);
  }
}