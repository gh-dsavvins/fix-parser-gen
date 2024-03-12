package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class UnderlyingStipsGroup extends AbstractGroup {

  public UnderlyingStipsGroup(AbstractMessage message) {
    super(message, FixTag.noUnderlyingStips, FixTag.underlyingStipType, UnderlyingStipsGroupComp::new);
  }

  public LongRef noUnderlyingStips() {
    return countField;
  }

  public UnderlyingStipsGroupComp underlyingStipsGroupComp(int ix) {
    return (UnderlyingStipsGroupComp) components[ix];
  }
}