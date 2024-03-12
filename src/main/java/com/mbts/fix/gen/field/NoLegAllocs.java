package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NoLegAllocs extends LongRef {

  public NoLegAllocs(Message message) {
    super(message, FixTag.noLegAllocs);
  }
}