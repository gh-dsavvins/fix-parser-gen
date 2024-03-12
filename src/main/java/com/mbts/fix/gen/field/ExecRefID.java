package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ExecRefID extends StringRef {

  public ExecRefID(Message message) {
    super(message, FixTag.execRefID);
  }
}