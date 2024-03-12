package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class TrdRegTimestampsGroupComp extends AbstractGroupComponent {

  private final TrdRegTimestamp trdRegTimestamp;
  private final TrdRegTimestampType trdRegTimestampType;
  private final TrdRegTimestampOrigin trdRegTimestampOrigin;

  public TrdRegTimestampsGroupComp(AbstractMessage message) {
    super(message);
    trdRegTimestamp = new TrdRegTimestamp(message);
    trdRegTimestampType = new TrdRegTimestampType(message);
    trdRegTimestampOrigin = new TrdRegTimestampOrigin(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 769 -> trdRegTimestamp.map(version, bytes, fldBeg);
      case 770 -> trdRegTimestampType.map(version, bytes, fldBeg);
      case 771 -> trdRegTimestampOrigin.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 769 -> trdRegTimestamp;
      case 770 -> trdRegTimestampType;
      case 771 -> trdRegTimestampOrigin;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = trdRegTimestamp.write(valBeg);
    valBeg = trdRegTimestampType.write(valBeg);
    valBeg = trdRegTimestampOrigin.write(valBeg);
    return valBeg; 
  }
}