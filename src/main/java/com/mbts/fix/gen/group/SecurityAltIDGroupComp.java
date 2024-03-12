package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class SecurityAltIDGroupComp extends AbstractGroupComponent {

  private final SecurityAltID securityAltID;
  private final SecurityAltIDSource securityAltIDSource;

  public SecurityAltIDGroupComp(AbstractMessage message) {
    super(message);
    securityAltID = new SecurityAltID(message);
    securityAltIDSource = new SecurityAltIDSource(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 455 -> securityAltID.map(version, bytes, fldBeg);
      case 456 -> securityAltIDSource.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 455 -> securityAltID;
      case 456 -> securityAltIDSource;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = securityAltID.write(valBeg);
    valBeg = securityAltIDSource.write(valBeg);
    return valBeg; 
  }
}