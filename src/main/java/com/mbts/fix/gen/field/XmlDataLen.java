package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class XmlDataLen extends LongRef {

  public XmlDataLen(Message message) {
    super(message, FixTag.xmlDataLen);
  }
}