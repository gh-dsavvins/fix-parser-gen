package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class LegSecurityAltIDGroupComp extends AbstractGroupComponent {

  private final LegSecurityAltID legSecurityAltID;
  private final LegSecurityAltIDSource legSecurityAltIDSource;

  public LegSecurityAltIDGroupComp(AbstractMessage message) {
    super(message);
    legSecurityAltID = new LegSecurityAltID(message);
    legSecurityAltIDSource = new LegSecurityAltIDSource(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 605 -> legSecurityAltID.map(version, bytes, fldBeg);
      case 606 -> legSecurityAltIDSource.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 605 -> legSecurityAltID;
      case 606 -> legSecurityAltIDSource;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = legSecurityAltID.write(valBeg);
    valBeg = legSecurityAltIDSource.write(valBeg);
    return valBeg; 
  }
}