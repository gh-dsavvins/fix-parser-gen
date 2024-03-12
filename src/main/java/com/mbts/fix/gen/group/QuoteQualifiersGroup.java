package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class QuoteQualifiersGroup extends AbstractGroup {

  public QuoteQualifiersGroup(AbstractMessage message) {
    super(message, FixTag.noQuoteQualifiers, FixTag.quoteQualifier, QuoteQualifiersGroupComp::new);
  }

  public LongRef noQuoteQualifiers() {
    return countField;
  }

  public QuoteQualifiersGroupComp quoteQualifiersGroupComp(int ix) {
    return (QuoteQualifiersGroupComp) components[ix];
  }
}