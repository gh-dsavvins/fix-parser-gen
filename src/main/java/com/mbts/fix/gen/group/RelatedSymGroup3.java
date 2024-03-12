package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RelatedSymGroup3 extends AbstractGroup {

  public RelatedSymGroup3(AbstractMessage message) {
    super(message, FixTag.noRelatedSym, FixTag.symbol, RelatedSymGroup3Comp::new);
  }

  public LongRef noRelatedSym() {
    return countField;
  }

  public RelatedSymGroup3Comp relatedSymGroup3Comp(int ix) {
    return (RelatedSymGroup3Comp) components[ix];
  }
}