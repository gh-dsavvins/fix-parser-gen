package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NoUnderlyingStips extends LongRef {

  public NoUnderlyingStips(Message message) {
    super(message, FixTag.noUnderlyingStips);
  }
}