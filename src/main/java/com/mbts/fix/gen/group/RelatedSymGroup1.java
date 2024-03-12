package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RelatedSymGroup1 extends AbstractGroup {

  public RelatedSymGroup1(AbstractMessage message) {
    super(message, FixTag.noRelatedSym, FixTag.symbol, RelatedSymGroup1Comp::new);
  }

  public LongRef noRelatedSym() {
    return countField;
  }

  public RelatedSymGroup1Comp relatedSymGroup1Comp(int ix) {
    return (RelatedSymGroup1Comp) components[ix];
  }
}