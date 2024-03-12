package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class QuoteEntriesGroup2 extends AbstractGroup {

  public QuoteEntriesGroup2(AbstractMessage message) {
    super(message, FixTag.noQuoteEntries, FixTag.quoteEntryID, QuoteEntriesGroup2Comp::new);
  }

  public LongRef noQuoteEntries() {
    return countField;
  }

  public QuoteEntriesGroup2Comp quoteEntriesGroup2Comp(int ix) {
    return (QuoteEntriesGroup2Comp) components[ix];
  }
}