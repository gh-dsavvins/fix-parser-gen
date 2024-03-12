package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class QuoteSetsGroup extends AbstractGroup {

  public QuoteSetsGroup(AbstractMessage message) {
    super(message, FixTag.noQuoteSets, FixTag.quoteSetID, QuoteSetsGroupComp::new);
  }

  public LongRef noQuoteSets() {
    return countField;
  }

  public QuoteSetsGroupComp quoteSetsGroupComp(int ix) {
    return (QuoteSetsGroupComp) components[ix];
  }
}