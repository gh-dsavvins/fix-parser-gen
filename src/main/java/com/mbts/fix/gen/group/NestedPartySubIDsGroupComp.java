package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class NestedPartySubIDsGroupComp extends AbstractGroupComponent {

  private final NestedPartySubID nestedPartySubID;
  private final NestedPartySubIDType nestedPartySubIDType;

  public NestedPartySubIDsGroupComp(AbstractMessage message) {
    super(message);
    nestedPartySubID = new NestedPartySubID(message);
    nestedPartySubIDType = new NestedPartySubIDType(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 545 -> nestedPartySubID.map(version, bytes, fldBeg);
      case 805 -> nestedPartySubIDType.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 545 -> nestedPartySubID;
      case 805 -> nestedPartySubIDType;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = nestedPartySubID.write(valBeg);
    valBeg = nestedPartySubIDType.write(valBeg);
    return valBeg; 
  }
}