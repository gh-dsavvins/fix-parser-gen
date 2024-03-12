package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class EventsGroupComp extends AbstractGroupComponent {

  private final EventType eventType;
  private final EventDate eventDate;
  private final EventPx eventPx;
  private final EventText eventText;

  public EventsGroupComp(AbstractMessage message) {
    super(message);
    eventType = new EventType(message);
    eventDate = new EventDate(message);
    eventPx = new EventPx(message);
    eventText = new EventText(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 865 -> eventType.map(version, bytes, fldBeg);
      case 866 -> eventDate.map(version, bytes, fldBeg);
      case 867 -> eventPx.map(version, bytes, fldBeg);
      case 868 -> eventText.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 865 -> eventType;
      case 866 -> eventDate;
      case 867 -> eventPx;
      case 868 -> eventText;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = eventType.write(valBeg);
    valBeg = eventDate.write(valBeg);
    valBeg = eventPx.write(valBeg);
    valBeg = eventText.write(valBeg);
    return valBeg; 
  }
}