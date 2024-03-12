package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class QuoteQualifiersGroupComp extends AbstractGroupComponent {

  private final QuoteQualifier quoteQualifier;

  public QuoteQualifiersGroupComp(AbstractMessage message) {
    super(message);
    quoteQualifier = new QuoteQualifier(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 695 -> quoteQualifier.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 695 -> quoteQualifier;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = quoteQualifier.write(valBeg);
    return valBeg; 
  }
}