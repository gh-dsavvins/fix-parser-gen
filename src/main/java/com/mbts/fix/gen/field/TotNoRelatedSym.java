package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TotNoRelatedSym extends LongRef {

  public TotNoRelatedSym(Message message) {
    super(message, FixTag.totNoRelatedSym);
  }
}