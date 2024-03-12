package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class InstrAttribGroup extends AbstractGroup {

  public InstrAttribGroup(AbstractMessage message) {
    super(message, FixTag.noInstrAttrib, FixTag.instrAttribType, InstrAttribGroupComp::new);
  }

  public LongRef noInstrAttrib() {
    return countField;
  }

  public InstrAttribGroupComp instrAttribGroupComp(int ix) {
    return (InstrAttribGroupComp) components[ix];
  }
}