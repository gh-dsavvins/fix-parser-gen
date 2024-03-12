package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocLinkID extends StringRef {

  public AllocLinkID(Message message) {
    super(message, FixTag.allocLinkID);
  }
}