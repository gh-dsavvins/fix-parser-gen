package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class ContraBrokersGroup extends AbstractGroup {

  public ContraBrokersGroup(AbstractMessage message) {
    super(message, FixTag.noContraBrokers, FixTag.contraBroker, ContraBrokersGroupComp::new);
  }

  public LongRef noContraBrokers() {
    return countField;
  }

  public ContraBrokersGroupComp contraBrokersGroupComp(int ix) {
    return (ContraBrokersGroupComp) components[ix];
  }
}