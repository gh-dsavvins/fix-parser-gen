package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class BidComponentsGroup extends AbstractGroup {

  public BidComponentsGroup(AbstractMessage message) {
    super(message, FixTag.noBidComponents, FixTag.listID, BidComponentsGroupComp::new);
  }

  public LongRef noBidComponents() {
    return countField;
  }

  public BidComponentsGroupComp bidComponentsGroupComp(int ix) {
    return (BidComponentsGroupComp) components[ix];
  }
}