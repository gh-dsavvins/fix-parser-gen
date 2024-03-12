package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Signature extends StringRef {

  public Signature(Message message) {
    super(message, FixTag.signature);
  }
}