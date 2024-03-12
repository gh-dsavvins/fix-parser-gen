package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class UnderlyingsGroup extends AbstractGroup {

  public UnderlyingsGroup(AbstractMessage message) {
    super(message, FixTag.noUnderlyings, FixTag.underlyingSymbol, UnderlyingsGroupComp::new);
  }

  public LongRef noUnderlyings() {
    return countField;
  }

  public UnderlyingsGroupComp underlyingsGroupComp(int ix) {
    return (UnderlyingsGroupComp) components[ix];
  }
}