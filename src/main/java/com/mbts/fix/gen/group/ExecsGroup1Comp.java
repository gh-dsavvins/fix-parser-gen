package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class ExecsGroup1Comp extends AbstractGroupComponent {

  private final ExecID execID;

  public ExecsGroup1Comp(AbstractMessage message) {
    super(message);
    execID = new ExecID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 17 -> execID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 17 -> execID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = execID.write(valBeg);
    return valBeg; 
  }
}