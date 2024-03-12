package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class Nested3PartySubIDsGroupComp extends AbstractGroupComponent {

  private final Nested3PartySubID nested3PartySubID;
  private final Nested3PartySubIDType nested3PartySubIDType;

  public Nested3PartySubIDsGroupComp(AbstractMessage message) {
    super(message);
    nested3PartySubID = new Nested3PartySubID(message);
    nested3PartySubIDType = new Nested3PartySubIDType(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 953 -> nested3PartySubID.map(version, bytes, fldBeg);
      case 954 -> nested3PartySubIDType.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 953 -> nested3PartySubID;
      case 954 -> nested3PartySubIDType;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = nested3PartySubID.write(valBeg);
    valBeg = nested3PartySubIDType.write(valBeg);
    return valBeg; 
  }
}