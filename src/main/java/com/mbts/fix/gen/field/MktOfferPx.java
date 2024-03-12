package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MktOfferPx extends StringRef {

  public MktOfferPx(Message message) {
    super(message, FixTag.mktOfferPx);
  }
}