package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class UnderlyingSecurityAltIDGroupComp extends AbstractGroupComponent {

  private final UnderlyingSecurityAltID underlyingSecurityAltID;
  private final UnderlyingSecurityAltIDSource underlyingSecurityAltIDSource;

  public UnderlyingSecurityAltIDGroupComp(AbstractMessage message) {
    super(message);
    underlyingSecurityAltID = new UnderlyingSecurityAltID(message);
    underlyingSecurityAltIDSource = new UnderlyingSecurityAltIDSource(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 458 -> underlyingSecurityAltID.map(version, bytes, fldBeg);
      case 459 -> underlyingSecurityAltIDSource.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 458 -> underlyingSecurityAltID;
      case 459 -> underlyingSecurityAltIDSource;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = underlyingSecurityAltID.write(valBeg);
    valBeg = underlyingSecurityAltIDSource.write(valBeg);
    return valBeg; 
  }
}