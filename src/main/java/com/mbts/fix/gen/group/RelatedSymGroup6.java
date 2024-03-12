package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RelatedSymGroup6 extends AbstractGroup {

  public RelatedSymGroup6(AbstractMessage message) {
    super(message, FixTag.noRelatedSym, FixTag.symbol, RelatedSymGroup6Comp::new);
  }

  public LongRef noRelatedSym() {
    return countField;
  }

  public RelatedSymGroup6Comp relatedSymGroup6Comp(int ix) {
    return (RelatedSymGroup6Comp) components[ix];
  }
}