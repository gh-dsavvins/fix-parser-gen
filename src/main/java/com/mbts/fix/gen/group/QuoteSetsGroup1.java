package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class QuoteSetsGroup1 extends AbstractGroup {

  public QuoteSetsGroup1(AbstractMessage message) {
    super(message, FixTag.noQuoteSets, FixTag.quoteSetID, QuoteSetsGroup1Comp::new);
  }

  public LongRef noQuoteSets() {
    return countField;
  }

  public QuoteSetsGroup1Comp quoteSetsGroup1Comp(int ix) {
    return (QuoteSetsGroup1Comp) components[ix];
  }
}