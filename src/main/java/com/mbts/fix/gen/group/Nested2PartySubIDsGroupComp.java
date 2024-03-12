package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class Nested2PartySubIDsGroupComp extends AbstractGroupComponent {

  private final Nested2PartySubID nested2PartySubID;
  private final Nested2PartySubIDType nested2PartySubIDType;

  public Nested2PartySubIDsGroupComp(AbstractMessage message) {
    super(message);
    nested2PartySubID = new Nested2PartySubID(message);
    nested2PartySubIDType = new Nested2PartySubIDType(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 760 -> nested2PartySubID.map(version, bytes, fldBeg);
      case 807 -> nested2PartySubIDType.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 760 -> nested2PartySubID;
      case 807 -> nested2PartySubIDType;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = nested2PartySubID.write(valBeg);
    valBeg = nested2PartySubIDType.write(valBeg);
    return valBeg; 
  }
}