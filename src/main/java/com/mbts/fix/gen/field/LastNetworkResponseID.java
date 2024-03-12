package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LastNetworkResponseID extends StringRef {

  public LastNetworkResponseID(Message message) {
    super(message, FixTag.lastNetworkResponseID);
  }
}