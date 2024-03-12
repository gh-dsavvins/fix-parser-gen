package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class EventsGroup extends AbstractGroup {

  public EventsGroup(AbstractMessage message) {
    super(message, FixTag.noEvents, FixTag.eventType, EventsGroupComp::new);
  }

  public LongRef noEvents() {
    return countField;
  }

  public EventsGroupComp eventsGroupComp(int ix) {
    return (EventsGroupComp) components[ix];
  }
}