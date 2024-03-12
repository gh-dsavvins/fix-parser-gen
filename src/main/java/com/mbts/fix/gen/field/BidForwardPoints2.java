package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BidForwardPoints2 extends StringRef {

  public BidForwardPoints2(Message message) {
    super(message, FixTag.bidForwardPoints2);
  }
}