package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class ClearingInstructionsGroup extends AbstractGroup {

  public ClearingInstructionsGroup(AbstractMessage message) {
    super(message, FixTag.noClearingInstructions, FixTag.clearingInstruction, ClearingInstructionsGroupComp::new);
  }

  public LongRef noClearingInstructions() {
    return countField;
  }

  public ClearingInstructionsGroupComp clearingInstructionsGroupComp(int ix) {
    return (ClearingInstructionsGroupComp) components[ix];
  }
}