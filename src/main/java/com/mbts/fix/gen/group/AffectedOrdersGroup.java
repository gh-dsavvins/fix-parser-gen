package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class AffectedOrdersGroup extends AbstractGroup {

  public AffectedOrdersGroup(AbstractMessage message) {
    super(message, FixTag.noAffectedOrders, FixTag.origClOrdID, AffectedOrdersGroupComp::new);
  }

  public LongRef noAffectedOrders() {
    return countField;
  }

  public AffectedOrdersGroupComp affectedOrdersGroupComp(int ix) {
    return (AffectedOrdersGroupComp) components[ix];
  }
}