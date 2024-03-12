package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class QuoteEntriesGroup extends AbstractGroup {

  public QuoteEntriesGroup(AbstractMessage message) {
    super(message, FixTag.noQuoteEntries, FixTag.symbol, QuoteEntriesGroupComp::new);
  }

  public LongRef noQuoteEntries() {
    return countField;
  }

  public QuoteEntriesGroupComp quoteEntriesGroupComp(int ix) {
    return (QuoteEntriesGroupComp) components[ix];
  }
}