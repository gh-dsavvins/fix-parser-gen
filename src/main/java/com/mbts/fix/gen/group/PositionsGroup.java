package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class PositionsGroup extends AbstractGroup {

  public PositionsGroup(AbstractMessage message) {
    super(message, FixTag.noPositions, FixTag.posType, PositionsGroupComp::new);
  }

  public LongRef noPositions() {
    return countField;
  }

  public PositionsGroupComp positionsGroupComp(int ix) {
    return (PositionsGroupComp) components[ix];
  }
}