package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class QuoteEntriesGroup1 extends AbstractGroup {

  public QuoteEntriesGroup1(AbstractMessage message) {
    super(message, FixTag.noQuoteEntries, FixTag.quoteEntryID, QuoteEntriesGroup1Comp::new);
  }

  public LongRef noQuoteEntries() {
    return countField;
  }

  public QuoteEntriesGroup1Comp quoteEntriesGroup1Comp(int ix) {
    return (QuoteEntriesGroup1Comp) components[ix];
  }
}