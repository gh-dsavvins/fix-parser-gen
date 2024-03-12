package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllowableOneSidednessValue extends StringRef {

  public AllowableOneSidednessValue(Message message) {
    super(message, FixTag.allowableOneSidednessValue);
  }
}