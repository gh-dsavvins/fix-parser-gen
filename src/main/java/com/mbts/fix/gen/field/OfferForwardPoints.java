package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OfferForwardPoints extends StringRef {

  public OfferForwardPoints(Message message) {
    super(message, FixTag.offerForwardPoints);
  }
}