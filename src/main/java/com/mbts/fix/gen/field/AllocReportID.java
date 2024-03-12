package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocReportID extends StringRef {

  public AllocReportID(Message message) {
    super(message, FixTag.allocReportID);
  }
}