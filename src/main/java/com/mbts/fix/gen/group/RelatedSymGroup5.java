package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RelatedSymGroup5 extends AbstractGroup {

  public RelatedSymGroup5(AbstractMessage message) {
    super(message, FixTag.noRelatedSym, FixTag.symbol, RelatedSymGroup5Comp::new);
  }

  public LongRef noRelatedSym() {
    return countField;
  }

  public RelatedSymGroup5Comp relatedSymGroup5Comp(int ix) {
    return (RelatedSymGroup5Comp) components[ix];
  }
}