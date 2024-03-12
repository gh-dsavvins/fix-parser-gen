package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class DistribInstsGroupComp extends AbstractGroupComponent {

  private final DistribPaymentMethod distribPaymentMethod;
  private final DistribPercentage distribPercentage;
  private final CashDistribCurr cashDistribCurr;
  private final CashDistribAgentName cashDistribAgentName;
  private final CashDistribAgentCode cashDistribAgentCode;
  private final CashDistribAgentAcctNumber cashDistribAgentAcctNumber;
  private final CashDistribPayRef cashDistribPayRef;
  private final CashDistribAgentAcctName cashDistribAgentAcctName;

  public DistribInstsGroupComp(AbstractMessage message) {
    super(message);
    distribPaymentMethod = new DistribPaymentMethod(message);
    distribPercentage = new DistribPercentage(message);
    cashDistribCurr = new CashDistribCurr(message);
    cashDistribAgentName = new CashDistribAgentName(message);
    cashDistribAgentCode = new CashDistribAgentCode(message);
    cashDistribAgentAcctNumber = new CashDistribAgentAcctNumber(message);
    cashDistribPayRef = new CashDistribPayRef(message);
    cashDistribAgentAcctName = new CashDistribAgentAcctName(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 477 -> distribPaymentMethod.map(version, bytes, fldBeg);
      case 512 -> distribPercentage.map(version, bytes, fldBeg);
      case 478 -> cashDistribCurr.map(version, bytes, fldBeg);
      case 498 -> cashDistribAgentName.map(version, bytes, fldBeg);
      case 499 -> cashDistribAgentCode.map(version, bytes, fldBeg);
      case 500 -> cashDistribAgentAcctNumber.map(version, bytes, fldBeg);
      case 501 -> cashDistribPayRef.map(version, bytes, fldBeg);
      case 502 -> cashDistribAgentAcctName.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 477 -> distribPaymentMethod;
      case 512 -> distribPercentage;
      case 478 -> cashDistribCurr;
      case 498 -> cashDistribAgentName;
      case 499 -> cashDistribAgentCode;
      case 500 -> cashDistribAgentAcctNumber;
      case 501 -> cashDistribPayRef;
      case 502 -> cashDistribAgentAcctName;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = distribPaymentMethod.write(valBeg);
    valBeg = distribPercentage.write(valBeg);
    valBeg = cashDistribCurr.write(valBeg);
    valBeg = cashDistribAgentName.write(valBeg);
    valBeg = cashDistribAgentCode.write(valBeg);
    valBeg = cashDistribAgentAcctNumber.write(valBeg);
    valBeg = cashDistribPayRef.write(valBeg);
    valBeg = cashDistribAgentAcctName.write(valBeg);
    return valBeg; 
  }
}