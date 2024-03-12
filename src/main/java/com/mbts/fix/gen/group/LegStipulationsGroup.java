package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegStipulationsGroup extends AbstractGroup {

  public LegStipulationsGroup(AbstractMessage message) {
    super(message, FixTag.noLegStipulations, FixTag.legStipulationType, LegStipulationsGroupComp::new);
  }

  public LongRef noLegStipulations() {
    return countField;
  }

  public LegStipulationsGroupComp legStipulationsGroupComp(int ix) {
    return (LegStipulationsGroupComp) components[ix];
  }
}