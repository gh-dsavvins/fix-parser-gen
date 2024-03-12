package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class CollInquiryQualifierGroupComp extends AbstractGroupComponent {

  private final CollInquiryQualifier collInquiryQualifier;

  public CollInquiryQualifierGroupComp(AbstractMessage message) {
    super(message);
    collInquiryQualifier = new CollInquiryQualifier(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 896 -> collInquiryQualifier.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 896 -> collInquiryQualifier;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = collInquiryQualifier.write(valBeg);
    return valBeg; 
  }
}