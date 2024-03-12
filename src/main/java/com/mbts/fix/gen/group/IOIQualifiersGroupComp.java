package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class IOIQualifiersGroupComp extends AbstractGroupComponent {

  private final IOIQualifier iOIQualifier;

  public IOIQualifiersGroupComp(AbstractMessage message) {
    super(message);
    iOIQualifier = new IOIQualifier(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 104 -> iOIQualifier.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 104 -> iOIQualifier;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = iOIQualifier.write(valBeg);
    return valBeg; 
  }
}