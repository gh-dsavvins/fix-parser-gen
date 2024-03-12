package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecondaryExecID extends StringRef {

  public SecondaryExecID(Message message) {
    super(message, FixTag.secondaryExecID);
  }
}