package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Pool extends StringRef {

  public Pool(Message message) {
    super(message, FixTag.pool);
  }
}