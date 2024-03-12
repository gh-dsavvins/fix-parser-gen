package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class EndCash extends StringRef {

  public EndCash(Message message) {
    super(message, FixTag.endCash);
  }
}