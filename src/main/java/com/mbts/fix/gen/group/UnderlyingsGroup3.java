package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class UnderlyingsGroup3 extends AbstractGroup {

  public UnderlyingsGroup3(AbstractMessage message) {
    super(message, FixTag.noUnderlyings, FixTag.underlyingSymbol, UnderlyingsGroup3Comp::new);
  }

  public LongRef noUnderlyings() {
    return countField;
  }

  public UnderlyingsGroup3Comp underlyingsGroup3Comp(int ix) {
    return (UnderlyingsGroup3Comp) components[ix];
  }
}