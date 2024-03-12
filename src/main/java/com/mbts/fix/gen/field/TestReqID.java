package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TestReqID extends StringRef {

  public TestReqID(Message message) {
    super(message, FixTag.testReqID);
  }
}