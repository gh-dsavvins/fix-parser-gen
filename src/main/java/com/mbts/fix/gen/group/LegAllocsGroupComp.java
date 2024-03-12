package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class LegAllocsGroupComp extends AbstractGroupComponent {

  private final LegAllocAccount legAllocAccount;
  private final LegIndividualAllocID legIndividualAllocID;
  private final Nested2PartyIDsGroup nested2PartyIDsGroup;
  private final LegAllocQty legAllocQty;
  private final LegAllocAcctIDSource legAllocAcctIDSource;
  private final LegSettlCurrency legSettlCurrency;

  public LegAllocsGroupComp(AbstractMessage message) {
    super(message);
    legAllocAccount = new LegAllocAccount(message);
    legIndividualAllocID = new LegIndividualAllocID(message);
    nested2PartyIDsGroup = new Nested2PartyIDsGroup(message);
    legAllocQty = new LegAllocQty(message);
    legAllocAcctIDSource = new LegAllocAcctIDSource(message);
    legSettlCurrency = new LegSettlCurrency(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 671 -> legAllocAccount.map(version, bytes, fldBeg);
      case 672 -> legIndividualAllocID.map(version, bytes, fldBeg);
      case 756,757,758,806,759,807,760 -> 
          nested2PartyIDsGroup.map(tag, fldBeg);
      case 673 -> legAllocQty.map(version, bytes, fldBeg);
      case 674 -> legAllocAcctIDSource.map(version, bytes, fldBeg);
      case 675 -> legSettlCurrency.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 671 -> legAllocAccount;
      case 672 -> legIndividualAllocID;
      case 756,757,758,806,759,807,760 -> 
          nested2PartyIDsGroup.field(tag);
      case 673 -> legAllocQty;
      case 674 -> legAllocAcctIDSource;
      case 675 -> legSettlCurrency;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = legAllocAccount.write(valBeg);
    valBeg = legIndividualAllocID.write(valBeg);
    valBeg = nested2PartyIDsGroup.write(valBeg);
    valBeg = legAllocQty.write(valBeg);
    valBeg = legAllocAcctIDSource.write(valBeg);
    valBeg = legSettlCurrency.write(valBeg);
    return valBeg; 
  }
}