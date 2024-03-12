package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class BidComponentsGroup1 extends AbstractGroup {

  public BidComponentsGroup1(AbstractMessage message) {
    super(message, FixTag.noBidComponents, FixTag.commission, BidComponentsGroup1Comp::new);
  }

  public LongRef noBidComponents() {
    return countField;
  }

  public BidComponentsGroup1Comp bidComponentsGroup1Comp(int ix) {
    return (BidComponentsGroup1Comp) components[ix];
  }
}