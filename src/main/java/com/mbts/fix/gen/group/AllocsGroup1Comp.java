package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class AllocsGroup1Comp extends AbstractGroupComponent {

  private final AllocAccount allocAccount;
  private final AllocAcctIDSource allocAcctIDSource;
  private final MatchStatus matchStatus;
  private final AllocPrice allocPrice;
  private final AllocQty allocQty;
  private final IndividualAllocID individualAllocID;
  private final ProcessCode processCode;
  private final NestedPartyIDsGroup nestedPartyIDsGroup;
  private final NotifyBrokerOfCredit notifyBrokerOfCredit;
  private final AllocHandlInst allocHandlInst;
  private final AllocText allocText;
  private final EncodedAllocTextLen encodedAllocTextLen;
  private final EncodedAllocText encodedAllocText;
  private final Commission commission;
  private final CommType commType;
  private final CommCurrency commCurrency;
  private final FundRenewWaiv fundRenewWaiv;
  private final AllocAvgPx allocAvgPx;
  private final AllocNetMoney allocNetMoney;
  private final SettlCurrAmt settlCurrAmt;
  private final AllocSettlCurrAmt allocSettlCurrAmt;
  private final SettlCurrency settlCurrency;
  private final AllocSettlCurrency allocSettlCurrency;
  private final SettlCurrFxRate settlCurrFxRate;
  private final SettlCurrFxRateCalc settlCurrFxRateCalc;
  private final AllocAccruedInterestAmt allocAccruedInterestAmt;
  private final AllocInterestAtMaturity allocInterestAtMaturity;
  private final MiscFeesGroup miscFeesGroup;
  private final ClearingInstructionsGroup clearingInstructionsGroup;
  private final AllocSettlInstType allocSettlInstType;
  private final SettlDeliveryType settlDeliveryType;
  private final StandInstDbType standInstDbType;
  private final StandInstDbName standInstDbName;
  private final StandInstDbID standInstDbID;
  private final DlvyInstGroup dlvyInstGroup;

  public AllocsGroup1Comp(AbstractMessage message) {
    super(message);
    allocAccount = new AllocAccount(message);
    allocAcctIDSource = new AllocAcctIDSource(message);
    matchStatus = new MatchStatus(message);
    allocPrice = new AllocPrice(message);
    allocQty = new AllocQty(message);
    individualAllocID = new IndividualAllocID(message);
    processCode = new ProcessCode(message);
    nestedPartyIDsGroup = new NestedPartyIDsGroup(message);
    notifyBrokerOfCredit = new NotifyBrokerOfCredit(message);
    allocHandlInst = new AllocHandlInst(message);
    allocText = new AllocText(message);
    encodedAllocTextLen = new EncodedAllocTextLen(message);
    encodedAllocText = new EncodedAllocText(message);
    commission = new Commission(message);
    commType = new CommType(message);
    commCurrency = new CommCurrency(message);
    fundRenewWaiv = new FundRenewWaiv(message);
    allocAvgPx = new AllocAvgPx(message);
    allocNetMoney = new AllocNetMoney(message);
    settlCurrAmt = new SettlCurrAmt(message);
    allocSettlCurrAmt = new AllocSettlCurrAmt(message);
    settlCurrency = new SettlCurrency(message);
    allocSettlCurrency = new AllocSettlCurrency(message);
    settlCurrFxRate = new SettlCurrFxRate(message);
    settlCurrFxRateCalc = new SettlCurrFxRateCalc(message);
    allocAccruedInterestAmt = new AllocAccruedInterestAmt(message);
    allocInterestAtMaturity = new AllocInterestAtMaturity(message);
    miscFeesGroup = new MiscFeesGroup(message);
    clearingInstructionsGroup = new ClearingInstructionsGroup(message);
    allocSettlInstType = new AllocSettlInstType(message);
    settlDeliveryType = new SettlDeliveryType(message);
    standInstDbType = new StandInstDbType(message);
    standInstDbName = new StandInstDbName(message);
    standInstDbID = new StandInstDbID(message);
    dlvyInstGroup = new DlvyInstGroup(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 79 -> allocAccount.map(version, bytes, fldBeg);
      case 661 -> allocAcctIDSource.map(version, bytes, fldBeg);
      case 573 -> matchStatus.map(version, bytes, fldBeg);
      case 366 -> allocPrice.map(version, bytes, fldBeg);
      case 80 -> allocQty.map(version, bytes, fldBeg);
      case 467 -> individualAllocID.map(version, bytes, fldBeg);
      case 81 -> processCode.map(version, bytes, fldBeg);
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.map(tag, fldBeg);
      case 208 -> notifyBrokerOfCredit.map(version, bytes, fldBeg);
      case 209 -> allocHandlInst.map(version, bytes, fldBeg);
      case 161 -> allocText.map(version, bytes, fldBeg);
      case 360 -> encodedAllocTextLen.map(version, bytes, fldBeg);
      case 361 -> encodedAllocText.map(version, bytes, fldBeg);
      case 12 -> commission.map(version, bytes, fldBeg);
      case 13 -> commType.map(version, bytes, fldBeg);
      case 479 -> commCurrency.map(version, bytes, fldBeg);
      case 497 -> fundRenewWaiv.map(version, bytes, fldBeg);
      case 153 -> allocAvgPx.map(version, bytes, fldBeg);
      case 154 -> allocNetMoney.map(version, bytes, fldBeg);
      case 119 -> settlCurrAmt.map(version, bytes, fldBeg);
      case 737 -> allocSettlCurrAmt.map(version, bytes, fldBeg);
      case 120 -> settlCurrency.map(version, bytes, fldBeg);
      case 736 -> allocSettlCurrency.map(version, bytes, fldBeg);
      case 155 -> settlCurrFxRate.map(version, bytes, fldBeg);
      case 156 -> settlCurrFxRateCalc.map(version, bytes, fldBeg);
      case 742 -> allocAccruedInterestAmt.map(version, bytes, fldBeg);
      case 741 -> allocInterestAtMaturity.map(version, bytes, fldBeg);
      case 136,137,138,139,891 -> 
          miscFeesGroup.map(tag, fldBeg);
      case 576,577 -> 
          clearingInstructionsGroup.map(tag, fldBeg);
      case 780 -> allocSettlInstType.map(version, bytes, fldBeg);
      case 172 -> settlDeliveryType.map(version, bytes, fldBeg);
      case 169 -> standInstDbType.map(version, bytes, fldBeg);
      case 170 -> standInstDbName.map(version, bytes, fldBeg);
      case 171 -> standInstDbID.map(version, bytes, fldBeg);
      case 784,801,785,786,787,85,165,781,782,783 -> 
          dlvyInstGroup.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 79 -> allocAccount;
      case 661 -> allocAcctIDSource;
      case 573 -> matchStatus;
      case 366 -> allocPrice;
      case 80 -> allocQty;
      case 467 -> individualAllocID;
      case 81 -> processCode;
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.field(tag);
      case 208 -> notifyBrokerOfCredit;
      case 209 -> allocHandlInst;
      case 161 -> allocText;
      case 360 -> encodedAllocTextLen;
      case 361 -> encodedAllocText;
      case 12 -> commission;
      case 13 -> commType;
      case 479 -> commCurrency;
      case 497 -> fundRenewWaiv;
      case 153 -> allocAvgPx;
      case 154 -> allocNetMoney;
      case 119 -> settlCurrAmt;
      case 737 -> allocSettlCurrAmt;
      case 120 -> settlCurrency;
      case 736 -> allocSettlCurrency;
      case 155 -> settlCurrFxRate;
      case 156 -> settlCurrFxRateCalc;
      case 742 -> allocAccruedInterestAmt;
      case 741 -> allocInterestAtMaturity;
      case 136,137,138,139,891 -> 
          miscFeesGroup.field(tag);
      case 576,577 -> 
          clearingInstructionsGroup.field(tag);
      case 780 -> allocSettlInstType;
      case 172 -> settlDeliveryType;
      case 169 -> standInstDbType;
      case 170 -> standInstDbName;
      case 171 -> standInstDbID;
      case 784,801,785,786,787,85,165,781,782,783 -> 
          dlvyInstGroup.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = allocAccount.write(valBeg);
    valBeg = allocAcctIDSource.write(valBeg);
    valBeg = matchStatus.write(valBeg);
    valBeg = allocPrice.write(valBeg);
    valBeg = allocQty.write(valBeg);
    valBeg = individualAllocID.write(valBeg);
    valBeg = processCode.write(valBeg);
    valBeg = nestedPartyIDsGroup.write(valBeg);
    valBeg = notifyBrokerOfCredit.write(valBeg);
    valBeg = allocHandlInst.write(valBeg);
    valBeg = allocText.write(valBeg);
    valBeg = encodedAllocTextLen.write(valBeg);
    valBeg = encodedAllocText.write(valBeg);
    valBeg = commission.write(valBeg);
    valBeg = commType.write(valBeg);
    valBeg = commCurrency.write(valBeg);
    valBeg = fundRenewWaiv.write(valBeg);
    valBeg = allocAvgPx.write(valBeg);
    valBeg = allocNetMoney.write(valBeg);
    valBeg = settlCurrAmt.write(valBeg);
    valBeg = allocSettlCurrAmt.write(valBeg);
    valBeg = settlCurrency.write(valBeg);
    valBeg = allocSettlCurrency.write(valBeg);
    valBeg = settlCurrFxRate.write(valBeg);
    valBeg = settlCurrFxRateCalc.write(valBeg);
    valBeg = allocAccruedInterestAmt.write(valBeg);
    valBeg = allocInterestAtMaturity.write(valBeg);
    valBeg = miscFeesGroup.write(valBeg);
    valBeg = clearingInstructionsGroup.write(valBeg);
    valBeg = allocSettlInstType.write(valBeg);
    valBeg = settlDeliveryType.write(valBeg);
    valBeg = standInstDbType.write(valBeg);
    valBeg = standInstDbName.write(valBeg);
    valBeg = standInstDbID.write(valBeg);
    valBeg = dlvyInstGroup.write(valBeg);
    return valBeg; 
  }
}