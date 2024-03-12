package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class CapacitiesGroup extends AbstractGroup {

  public CapacitiesGroup(AbstractMessage message) {
    super(message, FixTag.noCapacities, FixTag.orderCapacity, CapacitiesGroupComp::new);
  }

  public LongRef noCapacities() {
    return countField;
  }

  public CapacitiesGroupComp capacitiesGroupComp(int ix) {
    return (CapacitiesGroupComp) components[ix];
  }
}