package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class AllocsGroup2Comp extends AbstractGroupComponent {

  private final AllocAccount allocAccount;
  private final AllocAcctIDSource allocAcctIDSource;
  private final AllocPrice allocPrice;
  private final IndividualAllocID individualAllocID;
  private final IndividualAllocRejCode individualAllocRejCode;
  private final AllocText allocText;
  private final EncodedAllocTextLen encodedAllocTextLen;
  private final EncodedAllocText encodedAllocText;

  public AllocsGroup2Comp(AbstractMessage message) {
    super(message);
    allocAccount = new AllocAccount(message);
    allocAcctIDSource = new AllocAcctIDSource(message);
    allocPrice = new AllocPrice(message);
    individualAllocID = new IndividualAllocID(message);
    individualAllocRejCode = new IndividualAllocRejCode(message);
    allocText = new AllocText(message);
    encodedAllocTextLen = new EncodedAllocTextLen(message);
    encodedAllocText = new EncodedAllocText(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 79 -> allocAccount.map(version, bytes, fldBeg);
      case 661 -> allocAcctIDSource.map(version, bytes, fldBeg);
      case 366 -> allocPrice.map(version, bytes, fldBeg);
      case 467 -> individualAllocID.map(version, bytes, fldBeg);
      case 776 -> individualAllocRejCode.map(version, bytes, fldBeg);
      case 161 -> allocText.map(version, bytes, fldBeg);
      case 360 -> encodedAllocTextLen.map(version, bytes, fldBeg);
      case 361 -> encodedAllocText.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 79 -> allocAccount;
      case 661 -> allocAcctIDSource;
      case 366 -> allocPrice;
      case 467 -> individualAllocID;
      case 776 -> individualAllocRejCode;
      case 161 -> allocText;
      case 360 -> encodedAllocTextLen;
      case 361 -> encodedAllocText;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = allocAccount.write(valBeg);
    valBeg = allocAcctIDSource.write(valBeg);
    valBeg = allocPrice.write(valBeg);
    valBeg = individualAllocID.write(valBeg);
    valBeg = individualAllocRejCode.write(valBeg);
    valBeg = allocText.write(valBeg);
    valBeg = encodedAllocTextLen.write(valBeg);
    valBeg = encodedAllocText.write(valBeg);
    return valBeg; 
  }
}