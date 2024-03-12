package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class UnderlyingSecurityExchange extends StringRef {

  public UnderlyingSecurityExchange(Message message) {
    super(message, FixTag.underlyingSecurityExchange);
  }
}