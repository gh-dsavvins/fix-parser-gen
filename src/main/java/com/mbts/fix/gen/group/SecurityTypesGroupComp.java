package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class SecurityTypesGroupComp extends AbstractGroupComponent {

  private final SecurityType securityType;
  private final SecuritySubType securitySubType;
  private final Product product;
  private final CFICode cFICode;

  public SecurityTypesGroupComp(AbstractMessage message) {
    super(message);
    securityType = new SecurityType(message);
    securitySubType = new SecuritySubType(message);
    product = new Product(message);
    cFICode = new CFICode(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 167 -> securityType.map(version, bytes, fldBeg);
      case 762 -> securitySubType.map(version, bytes, fldBeg);
      case 460 -> product.map(version, bytes, fldBeg);
      case 461 -> cFICode.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 167 -> securityType;
      case 762 -> securitySubType;
      case 460 -> product;
      case 461 -> cFICode;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = securityType.write(valBeg);
    valBeg = securitySubType.write(valBeg);
    valBeg = product.write(valBeg);
    valBeg = cFICode.write(valBeg);
    return valBeg; 
  }
}