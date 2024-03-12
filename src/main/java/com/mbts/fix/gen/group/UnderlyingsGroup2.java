package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class UnderlyingsGroup2 extends AbstractGroup {

  public UnderlyingsGroup2(AbstractMessage message) {
    super(message, FixTag.noUnderlyings, FixTag.underlyingSymbol, UnderlyingsGroup2Comp::new);
  }

  public LongRef noUnderlyings() {
    return countField;
  }

  public UnderlyingsGroup2Comp underlyingsGroup2Comp(int ix) {
    return (UnderlyingsGroup2Comp) components[ix];
  }
}