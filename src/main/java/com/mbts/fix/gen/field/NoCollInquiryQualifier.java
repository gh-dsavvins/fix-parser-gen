package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NoCollInquiryQualifier extends LongRef {

  public NoCollInquiryQualifier(Message message) {
    super(message, FixTag.noCollInquiryQualifier);
  }
}