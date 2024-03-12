package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class StipulationsGroupComp extends AbstractGroupComponent {

  private final StipulationType stipulationType;
  private final StipulationValue stipulationValue;

  public StipulationsGroupComp(AbstractMessage message) {
    super(message);
    stipulationType = new StipulationType(message);
    stipulationValue = new StipulationValue(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 233 -> stipulationType.map(version, bytes, fldBeg);
      case 234 -> stipulationValue.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 233 -> stipulationType;
      case 234 -> stipulationValue;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = stipulationType.write(valBeg);
    valBeg = stipulationValue.write(valBeg);
    return valBeg; 
  }
}