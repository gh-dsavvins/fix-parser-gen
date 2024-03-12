package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class MsgTypesGroup extends AbstractGroup {

  public MsgTypesGroup(AbstractMessage message) {
    super(message, FixTag.noMsgTypes, FixTag.refMsgType, MsgTypesGroupComp::new);
  }

  public LongRef noMsgTypes() {
    return countField;
  }

  public MsgTypesGroupComp msgTypesGroupComp(int ix) {
    return (MsgTypesGroupComp) components[ix];
  }
}