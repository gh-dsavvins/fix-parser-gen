package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MDEntryPositionNo extends LongRef {

  public MDEntryPositionNo(Message message) {
    super(message, FixTag.mDEntryPositionNo);
  }
}