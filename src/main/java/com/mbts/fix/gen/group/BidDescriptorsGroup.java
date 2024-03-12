package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class BidDescriptorsGroup extends AbstractGroup {

  public BidDescriptorsGroup(AbstractMessage message) {
    super(message, FixTag.noBidDescriptors, FixTag.bidDescriptorType, BidDescriptorsGroupComp::new);
  }

  public LongRef noBidDescriptors() {
    return countField;
  }

  public BidDescriptorsGroupComp bidDescriptorsGroupComp(int ix) {
    return (BidDescriptorsGroupComp) components[ix];
  }
}