package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ApplQueueDepth extends LongRef {

  public ApplQueueDepth(Message message) {
    super(message, FixTag.applQueueDepth);
  }
}