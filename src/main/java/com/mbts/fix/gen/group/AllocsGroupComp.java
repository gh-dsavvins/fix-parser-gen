package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class AllocsGroupComp extends AbstractGroupComponent {

  private final AllocAccount allocAccount;
  private final AllocAcctIDSource allocAcctIDSource;
  private final AllocSettlCurrency allocSettlCurrency;
  private final IndividualAllocID individualAllocID;
  private final NestedPartyIDsGroup nestedPartyIDsGroup;
  private final AllocQty allocQty;

  public AllocsGroupComp(AbstractMessage message) {
    super(message);
    allocAccount = new AllocAccount(message);
    allocAcctIDSource = new AllocAcctIDSource(message);
    allocSettlCurrency = new AllocSettlCurrency(message);
    individualAllocID = new IndividualAllocID(message);
    nestedPartyIDsGroup = new NestedPartyIDsGroup(message);
    allocQty = new AllocQty(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 79 -> allocAccount.map(version, bytes, fldBeg);
      case 661 -> allocAcctIDSource.map(version, bytes, fldBeg);
      case 736 -> allocSettlCurrency.map(version, bytes, fldBeg);
      case 467 -> individualAllocID.map(version, bytes, fldBeg);
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.map(tag, fldBeg);
      case 80 -> allocQty.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 79 -> allocAccount;
      case 661 -> allocAcctIDSource;
      case 736 -> allocSettlCurrency;
      case 467 -> individualAllocID;
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.field(tag);
      case 80 -> allocQty;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = allocAccount.write(valBeg);
    valBeg = allocAcctIDSource.write(valBeg);
    valBeg = allocSettlCurrency.write(valBeg);
    valBeg = individualAllocID.write(valBeg);
    valBeg = nestedPartyIDsGroup.write(valBeg);
    valBeg = allocQty.write(valBeg);
    return valBeg; 
  }
}