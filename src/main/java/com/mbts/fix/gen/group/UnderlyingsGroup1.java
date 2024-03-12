package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class UnderlyingsGroup1 extends AbstractGroup {

  public UnderlyingsGroup1(AbstractMessage message) {
    super(message, FixTag.noUnderlyings, FixTag.underlyingSymbol, UnderlyingsGroup1Comp::new);
  }

  public LongRef noUnderlyings() {
    return countField;
  }

  public UnderlyingsGroup1Comp underlyingsGroup1Comp(int ix) {
    return (UnderlyingsGroup1Comp) components[ix];
  }
}