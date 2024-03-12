package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class UnderlyingSecurityType extends StringRef {

  public UnderlyingSecurityType(Message message) {
    super(message, FixTag.underlyingSecurityType);
  }
}