package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MDEntryDate extends StringRef {

  public MDEntryDate(Message message) {
    super(message, FixTag.mDEntryDate);
  }
}