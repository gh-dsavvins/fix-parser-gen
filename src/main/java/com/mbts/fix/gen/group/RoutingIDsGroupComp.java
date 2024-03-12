package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class RoutingIDsGroupComp extends AbstractGroupComponent {

  private final RoutingType routingType;
  private final RoutingID routingID;

  public RoutingIDsGroupComp(AbstractMessage message) {
    super(message);
    routingType = new RoutingType(message);
    routingID = new RoutingID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 216 -> routingType.map(version, bytes, fldBeg);
      case 217 -> routingID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 216 -> routingType;
      case 217 -> routingID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = routingType.write(valBeg);
    valBeg = routingID.write(valBeg);
    return valBeg; 
  }
}