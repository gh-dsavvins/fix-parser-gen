package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AsgnRptID extends StringRef {

  public AsgnRptID(Message message) {
    super(message, FixTag.asgnRptID);
  }
}