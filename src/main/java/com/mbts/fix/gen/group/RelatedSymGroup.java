package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RelatedSymGroup extends AbstractGroup {

  public RelatedSymGroup(AbstractMessage message) {
    super(message, FixTag.noRelatedSym, FixTag.symbol, RelatedSymGroupComp::new);
  }

  public LongRef noRelatedSym() {
    return countField;
  }

  public RelatedSymGroupComp relatedSymGroupComp(int ix) {
    return (RelatedSymGroupComp) components[ix];
  }
}