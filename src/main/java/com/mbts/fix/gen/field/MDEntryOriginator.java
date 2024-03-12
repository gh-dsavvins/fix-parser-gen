package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MDEntryOriginator extends StringRef {

  public MDEntryOriginator(Message message) {
    super(message, FixTag.mDEntryOriginator);
  }
}