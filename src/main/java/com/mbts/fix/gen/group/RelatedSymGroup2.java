package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RelatedSymGroup2 extends AbstractGroup {

  public RelatedSymGroup2(AbstractMessage message) {
    super(message, FixTag.noRelatedSym, FixTag.symbol, RelatedSymGroup2Comp::new);
  }

  public LongRef noRelatedSym() {
    return countField;
  }

  public RelatedSymGroup2Comp relatedSymGroup2Comp(int ix) {
    return (RelatedSymGroup2Comp) components[ix];
  }
}