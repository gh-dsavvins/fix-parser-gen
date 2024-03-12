package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class AltMDSourceGroupComp extends AbstractGroupComponent {

  private final AltMDSourceID altMDSourceID;

  public AltMDSourceGroupComp(AbstractMessage message) {
    super(message);
    altMDSourceID = new AltMDSourceID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 817 -> altMDSourceID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 817 -> altMDSourceID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = altMDSourceID.write(valBeg);
    return valBeg; 
  }
}