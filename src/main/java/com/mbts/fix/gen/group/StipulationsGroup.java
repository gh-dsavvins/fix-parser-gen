package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class StipulationsGroup extends AbstractGroup {

  public StipulationsGroup(AbstractMessage message) {
    super(message, FixTag.noStipulations, FixTag.stipulationType, StipulationsGroupComp::new);
  }

  public LongRef noStipulations() {
    return countField;
  }

  public StipulationsGroupComp stipulationsGroupComp(int ix) {
    return (StipulationsGroupComp) components[ix];
  }
}