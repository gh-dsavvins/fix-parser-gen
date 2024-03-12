package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RoutingIDsGroup extends AbstractGroup {

  public RoutingIDsGroup(AbstractMessage message) {
    super(message, FixTag.noRoutingIDs, FixTag.routingType, RoutingIDsGroupComp::new);
  }

  public LongRef noRoutingIDs() {
    return countField;
  }

  public RoutingIDsGroupComp routingIDsGroupComp(int ix) {
    return (RoutingIDsGroupComp) components[ix];
  }
}