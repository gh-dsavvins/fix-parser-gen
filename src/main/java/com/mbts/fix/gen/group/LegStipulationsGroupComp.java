package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class LegStipulationsGroupComp extends AbstractGroupComponent {

  private final LegStipulationType legStipulationType;
  private final LegStipulationValue legStipulationValue;

  public LegStipulationsGroupComp(AbstractMessage message) {
    super(message);
    legStipulationType = new LegStipulationType(message);
    legStipulationValue = new LegStipulationValue(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 688 -> legStipulationType.map(version, bytes, fldBeg);
      case 689 -> legStipulationValue.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 688 -> legStipulationType;
      case 689 -> legStipulationValue;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = legStipulationType.write(valBeg);
    valBeg = legStipulationValue.write(valBeg);
    return valBeg; 
  }
}