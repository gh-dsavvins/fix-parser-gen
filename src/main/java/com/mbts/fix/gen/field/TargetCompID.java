package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TargetCompID extends StringRef {

  public TargetCompID(Message message) {
    super(message, FixTag.targetCompID);
  }
}