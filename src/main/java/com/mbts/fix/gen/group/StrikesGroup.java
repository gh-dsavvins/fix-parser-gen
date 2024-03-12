package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class StrikesGroup extends AbstractGroup {

  public StrikesGroup(AbstractMessage message) {
    super(message, FixTag.noStrikes, FixTag.symbol, StrikesGroupComp::new);
  }

  public LongRef noStrikes() {
    return countField;
  }

  public StrikesGroupComp strikesGroupComp(int ix) {
    return (StrikesGroupComp) components[ix];
  }
}