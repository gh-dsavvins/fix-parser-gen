package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RelatedSymGroup4 extends AbstractGroup {

  public RelatedSymGroup4(AbstractMessage message) {
    super(message, FixTag.noRelatedSym, FixTag.symbol, RelatedSymGroup4Comp::new);
  }

  public LongRef noRelatedSym() {
    return countField;
  }

  public RelatedSymGroup4Comp relatedSymGroup4Comp(int ix) {
    return (RelatedSymGroup4Comp) components[ix];
  }
}