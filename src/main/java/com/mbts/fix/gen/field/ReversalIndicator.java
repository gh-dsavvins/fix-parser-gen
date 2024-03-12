package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ReversalIndicator extends StringRef {

  public ReversalIndicator(Message message) {
    super(message, FixTag.reversalIndicator);
  }
}