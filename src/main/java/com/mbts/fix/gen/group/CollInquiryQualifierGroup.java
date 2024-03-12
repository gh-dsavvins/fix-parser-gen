package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class CollInquiryQualifierGroup extends AbstractGroup {

  public CollInquiryQualifierGroup(AbstractMessage message) {
    super(message, FixTag.noCollInquiryQualifier, FixTag.collInquiryQualifier, CollInquiryQualifierGroupComp::new);
  }

  public LongRef noCollInquiryQualifier() {
    return countField;
  }

  public CollInquiryQualifierGroupComp collInquiryQualifierGroupComp(int ix) {
    return (CollInquiryQualifierGroupComp) components[ix];
  }
}