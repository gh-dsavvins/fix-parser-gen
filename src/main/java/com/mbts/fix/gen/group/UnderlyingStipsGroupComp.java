package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class UnderlyingStipsGroupComp extends AbstractGroupComponent {

  private final UnderlyingStipType underlyingStipType;
  private final UnderlyingStipValue underlyingStipValue;

  public UnderlyingStipsGroupComp(AbstractMessage message) {
    super(message);
    underlyingStipType = new UnderlyingStipType(message);
    underlyingStipValue = new UnderlyingStipValue(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 888 -> underlyingStipType.map(version, bytes, fldBeg);
      case 889 -> underlyingStipValue.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 888 -> underlyingStipType;
      case 889 -> underlyingStipValue;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = underlyingStipType.write(valBeg);
    valBeg = underlyingStipValue.write(valBeg);
    return valBeg; 
  }
}