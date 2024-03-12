package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OfferYield extends StringRef {

  public OfferYield(Message message) {
    super(message, FixTag.offerYield);
  }
}