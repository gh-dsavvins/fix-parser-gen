package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class CompIDsGroup1Comp extends AbstractGroupComponent {

  private final RefCompID refCompID;
  private final RefSubID refSubID;
  private final LocationID locationID;
  private final DeskID deskID;
  private final StatusValue statusValue;
  private final StatusText statusText;

  public CompIDsGroup1Comp(AbstractMessage message) {
    super(message);
    refCompID = new RefCompID(message);
    refSubID = new RefSubID(message);
    locationID = new LocationID(message);
    deskID = new DeskID(message);
    statusValue = new StatusValue(message);
    statusText = new StatusText(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 930 -> refCompID.map(version, bytes, fldBeg);
      case 931 -> refSubID.map(version, bytes, fldBeg);
      case 283 -> locationID.map(version, bytes, fldBeg);
      case 284 -> deskID.map(version, bytes, fldBeg);
      case 928 -> statusValue.map(version, bytes, fldBeg);
      case 929 -> statusText.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 930 -> refCompID;
      case 931 -> refSubID;
      case 283 -> locationID;
      case 284 -> deskID;
      case 928 -> statusValue;
      case 929 -> statusText;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = refCompID.write(valBeg);
    valBeg = refSubID.write(valBeg);
    valBeg = locationID.write(valBeg);
    valBeg = deskID.write(valBeg);
    valBeg = statusValue.write(valBeg);
    valBeg = statusText.write(valBeg);
    return valBeg; 
  }
}