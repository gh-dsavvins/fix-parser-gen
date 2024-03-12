package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlCurrency extends StringRef {

  public SettlCurrency(Message message) {
    super(message, FixTag.settlCurrency);
  }
}