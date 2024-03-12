package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class DatesGroup extends AbstractGroup {

  public DatesGroup(AbstractMessage message) {
    super(message, FixTag.noDates, FixTag.tradeDate, DatesGroupComp::new);
  }

  public LongRef noDates() {
    return countField;
  }

  public DatesGroupComp datesGroupComp(int ix) {
    return (DatesGroupComp) components[ix];
  }
}