package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class MDEntryTypesGroupComp extends AbstractGroupComponent {

  private final MDEntryType mDEntryType;

  public MDEntryTypesGroupComp(AbstractMessage message) {
    super(message);
    mDEntryType = new MDEntryType(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 269 -> mDEntryType.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 269 -> mDEntryType;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = mDEntryType.write(valBeg);
    return valBeg; 
  }
}