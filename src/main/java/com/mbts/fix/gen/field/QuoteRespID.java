package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteRespID extends StringRef {

  public QuoteRespID(Message message) {
    super(message, FixTag.quoteRespID);
  }
}