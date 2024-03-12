package com.mbts.fix.gen.message;

import com.mbts.fix.gen.group.*;
import com.mbts.fix.api.*;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.gen.field.*;
import java.util.function.BiFunction;
import lombok.Getter;
import com.mbts.fix.message.*; 

@Getter
@SuppressWarnings ("unused")
public class Confirmation extends AbstractMessage {

  private final BeginString beginString = new BeginString(this);
  private final BodyLength bodyLength = new BodyLength(this);
  private final MsgType msgType = new MsgType(this);
  private final SenderCompID senderCompID = new SenderCompID(this);
  private final TargetCompID targetCompID = new TargetCompID(this);
  private final OnBehalfOfCompID onBehalfOfCompID = new OnBehalfOfCompID(this);
  private final DeliverToCompID deliverToCompID = new DeliverToCompID(this);
  private final SecureDataLen secureDataLen = new SecureDataLen(this);
  private final SecureData secureData = new SecureData(this);
  private final MsgSeqNum msgSeqNum = new MsgSeqNum(this);
  private final SenderSubID senderSubID = new SenderSubID(this);
  private final SenderLocationID senderLocationID = new SenderLocationID(this);
  private final TargetSubID targetSubID = new TargetSubID(this);
  private final TargetLocationID targetLocationID = new TargetLocationID(this);
  private final OnBehalfOfSubID onBehalfOfSubID = new OnBehalfOfSubID(this);
  private final OnBehalfOfLocationID onBehalfOfLocationID = new OnBehalfOfLocationID(this);
  private final DeliverToSubID deliverToSubID = new DeliverToSubID(this);
  private final DeliverToLocationID deliverToLocationID = new DeliverToLocationID(this);
  private final PossDupFlag possDupFlag = new PossDupFlag(this);
  private final PossResend possResend = new PossResend(this);
  private final SendingTime sendingTime = new SendingTime(this);
  private final OrigSendingTime origSendingTime = new OrigSendingTime(this);
  private final XmlDataLen xmlDataLen = new XmlDataLen(this);
  private final XmlData xmlData = new XmlData(this);
  private final MessageEncoding messageEncoding = new MessageEncoding(this);
  private final LastMsgSeqNumProcessed lastMsgSeqNumProcessed = new LastMsgSeqNumProcessed(this);
  private final HopsGroup hopsGroup = new HopsGroup(this);
  private final ConfirmID confirmID = new ConfirmID(this);
  private final ConfirmRefID confirmRefID = new ConfirmRefID(this);
  private final ConfirmReqID confirmReqID = new ConfirmReqID(this);
  private final ConfirmTransType confirmTransType = new ConfirmTransType(this);
  private final ConfirmType confirmType = new ConfirmType(this);
  private final CopyMsgIndicator copyMsgIndicator = new CopyMsgIndicator(this);
  private final LegalConfirm legalConfirm = new LegalConfirm(this);
  private final ConfirmStatus confirmStatus = new ConfirmStatus(this);
  private final PartyIDsGroup partyIDsGroup = new PartyIDsGroup(this);
  private final OrdersGroup1 ordersGroup1 = new OrdersGroup1(this);
  private final AllocID allocID = new AllocID(this);
  private final SecondaryAllocID secondaryAllocID = new SecondaryAllocID(this);
  private final IndividualAllocID individualAllocID = new IndividualAllocID(this);
  private final TransactTime transactTime = new TransactTime(this);
  private final TradeDate tradeDate = new TradeDate(this);
  private final TrdRegTimestampsGroup trdRegTimestampsGroup = new TrdRegTimestampsGroup(this);
  private final Symbol symbol = new Symbol(this);
  private final SymbolSfx symbolSfx = new SymbolSfx(this);
  private final SecurityID securityID = new SecurityID(this);
  private final SecurityIDSource securityIDSource = new SecurityIDSource(this);
  private final SecurityAltIDGroup securityAltIDGroup = new SecurityAltIDGroup(this);
  private final Product product = new Product(this);
  private final CFICode cFICode = new CFICode(this);
  private final SecurityType securityType = new SecurityType(this);
  private final SecuritySubType securitySubType = new SecuritySubType(this);
  private final MaturityMonthYear maturityMonthYear = new MaturityMonthYear(this);
  private final MaturityDate maturityDate = new MaturityDate(this);
  private final PutOrCall putOrCall = new PutOrCall(this);
  private final CouponPaymentDate couponPaymentDate = new CouponPaymentDate(this);
  private final IssueDate issueDate = new IssueDate(this);
  private final RepoCollateralSecurityType repoCollateralSecurityType = new RepoCollateralSecurityType(this);
  private final RepurchaseTerm repurchaseTerm = new RepurchaseTerm(this);
  private final RepurchaseRate repurchaseRate = new RepurchaseRate(this);
  private final Factor factor = new Factor(this);
  private final CreditRating creditRating = new CreditRating(this);
  private final InstrRegistry instrRegistry = new InstrRegistry(this);
  private final CountryOfIssue countryOfIssue = new CountryOfIssue(this);
  private final StateOrProvinceOfIssue stateOrProvinceOfIssue = new StateOrProvinceOfIssue(this);
  private final LocaleOfIssue localeOfIssue = new LocaleOfIssue(this);
  private final RedemptionDate redemptionDate = new RedemptionDate(this);
  private final StrikePrice strikePrice = new StrikePrice(this);
  private final StrikeCurrency strikeCurrency = new StrikeCurrency(this);
  private final OptAttribute optAttribute = new OptAttribute(this);
  private final ContractMultiplier contractMultiplier = new ContractMultiplier(this);
  private final CouponRate couponRate = new CouponRate(this);
  private final SecurityExchange securityExchange = new SecurityExchange(this);
  private final Issuer issuer = new Issuer(this);
  private final EncodedIssuerLen encodedIssuerLen = new EncodedIssuerLen(this);
  private final EncodedIssuer encodedIssuer = new EncodedIssuer(this);
  private final SecurityDesc securityDesc = new SecurityDesc(this);
  private final EncodedSecurityDescLen encodedSecurityDescLen = new EncodedSecurityDescLen(this);
  private final EncodedSecurityDesc encodedSecurityDesc = new EncodedSecurityDesc(this);
  private final Pool pool = new Pool(this);
  private final ContractSettlMonth contractSettlMonth = new ContractSettlMonth(this);
  private final CPProgram cPProgram = new CPProgram(this);
  private final CPRegType cPRegType = new CPRegType(this);
  private final EventsGroup eventsGroup = new EventsGroup(this);
  private final DatedDate datedDate = new DatedDate(this);
  private final InterestAccrualDate interestAccrualDate = new InterestAccrualDate(this);
  private final DeliveryForm deliveryForm = new DeliveryForm(this);
  private final PctAtRisk pctAtRisk = new PctAtRisk(this);
  private final InstrAttribGroup instrAttribGroup = new InstrAttribGroup(this);
  private final AgreementDesc agreementDesc = new AgreementDesc(this);
  private final AgreementID agreementID = new AgreementID(this);
  private final AgreementDate agreementDate = new AgreementDate(this);
  private final AgreementCurrency agreementCurrency = new AgreementCurrency(this);
  private final TerminationType terminationType = new TerminationType(this);
  private final StartDate startDate = new StartDate(this);
  private final EndDate endDate = new EndDate(this);
  private final DeliveryType deliveryType = new DeliveryType(this);
  private final MarginRatio marginRatio = new MarginRatio(this);
  private final UnderlyingsGroup underlyingsGroup = new UnderlyingsGroup(this);
  private final LegsGroup1 legsGroup1 = new LegsGroup1(this);
  private final YieldType yieldType = new YieldType(this);
  private final Yield yield = new Yield(this);
  private final YieldCalcDate yieldCalcDate = new YieldCalcDate(this);
  private final YieldRedemptionDate yieldRedemptionDate = new YieldRedemptionDate(this);
  private final YieldRedemptionPrice yieldRedemptionPrice = new YieldRedemptionPrice(this);
  private final YieldRedemptionPriceType yieldRedemptionPriceType = new YieldRedemptionPriceType(this);
  private final AllocQty allocQty = new AllocQty(this);
  private final QtyType qtyType = new QtyType(this);
  private final Side side = new Side(this);
  private final Currency currency = new Currency(this);
  private final LastMkt lastMkt = new LastMkt(this);
  private final CapacitiesGroup capacitiesGroup = new CapacitiesGroup(this);
  private final AllocAccount allocAccount = new AllocAccount(this);
  private final AllocAcctIDSource allocAcctIDSource = new AllocAcctIDSource(this);
  private final AllocAccountType allocAccountType = new AllocAccountType(this);
  private final AvgPx avgPx = new AvgPx(this);
  private final AvgPxPrecision avgPxPrecision = new AvgPxPrecision(this);
  private final PriceType priceType = new PriceType(this);
  private final AvgParPx avgParPx = new AvgParPx(this);
  private final Spread spread = new Spread(this);
  private final BenchmarkCurveCurrency benchmarkCurveCurrency = new BenchmarkCurveCurrency(this);
  private final BenchmarkCurveName benchmarkCurveName = new BenchmarkCurveName(this);
  private final BenchmarkCurvePoint benchmarkCurvePoint = new BenchmarkCurvePoint(this);
  private final BenchmarkPrice benchmarkPrice = new BenchmarkPrice(this);
  private final BenchmarkPriceType benchmarkPriceType = new BenchmarkPriceType(this);
  private final BenchmarkSecurityID benchmarkSecurityID = new BenchmarkSecurityID(this);
  private final BenchmarkSecurityIDSource benchmarkSecurityIDSource = new BenchmarkSecurityIDSource(this);
  private final ReportedPx reportedPx = new ReportedPx(this);
  private final Text text = new Text(this);
  private final EncodedTextLen encodedTextLen = new EncodedTextLen(this);
  private final EncodedText encodedText = new EncodedText(this);
  private final ProcessCode processCode = new ProcessCode(this);
  private final GrossTradeAmt grossTradeAmt = new GrossTradeAmt(this);
  private final NumDaysInterest numDaysInterest = new NumDaysInterest(this);
  private final ExDate exDate = new ExDate(this);
  private final AccruedInterestRate accruedInterestRate = new AccruedInterestRate(this);
  private final AccruedInterestAmt accruedInterestAmt = new AccruedInterestAmt(this);
  private final InterestAtMaturity interestAtMaturity = new InterestAtMaturity(this);
  private final EndAccruedInterestAmt endAccruedInterestAmt = new EndAccruedInterestAmt(this);
  private final StartCash startCash = new StartCash(this);
  private final EndCash endCash = new EndCash(this);
  private final Concession concession = new Concession(this);
  private final TotalTakedown totalTakedown = new TotalTakedown(this);
  private final NetMoney netMoney = new NetMoney(this);
  private final MaturityNetMoney maturityNetMoney = new MaturityNetMoney(this);
  private final SettlCurrAmt settlCurrAmt = new SettlCurrAmt(this);
  private final SettlCurrency settlCurrency = new SettlCurrency(this);
  private final SettlCurrFxRate settlCurrFxRate = new SettlCurrFxRate(this);
  private final SettlCurrFxRateCalc settlCurrFxRateCalc = new SettlCurrFxRateCalc(this);
  private final SettlType settlType = new SettlType(this);
  private final SettlDate settlDate = new SettlDate(this);
  private final SettlDeliveryType settlDeliveryType = new SettlDeliveryType(this);
  private final StandInstDbType standInstDbType = new StandInstDbType(this);
  private final StandInstDbName standInstDbName = new StandInstDbName(this);
  private final StandInstDbID standInstDbID = new StandInstDbID(this);
  private final DlvyInstGroup dlvyInstGroup = new DlvyInstGroup(this);
  private final Commission commission = new Commission(this);
  private final CommType commType = new CommType(this);
  private final CommCurrency commCurrency = new CommCurrency(this);
  private final FundRenewWaiv fundRenewWaiv = new FundRenewWaiv(this);
  private final SharedCommission sharedCommission = new SharedCommission(this);
  private final StipulationsGroup stipulationsGroup = new StipulationsGroup(this);
  private final MiscFeesGroup miscFeesGroup = new MiscFeesGroup(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public Confirmation() {
    super();
    beginString.set("FIX.4.4");
    bodyLength.set(999);
  }

  @Override
  protected AbstractField msgType() {
    return beginString;
  }

  @Override
  protected void writeUnmapped() {
    valBeg = 24;
    valLim = 24;
    int bodyBeg = 24;
    valLim = confirmID.write(valLim);
    valLim = confirmRefID.write(valLim);
    valLim = confirmReqID.write(valLim);
    valLim = confirmTransType.write(valLim);
    valLim = confirmType.write(valLim);
    valLim = copyMsgIndicator.write(valLim);
    valLim = legalConfirm.write(valLim);
    valLim = confirmStatus.write(valLim);
    valLim = partyIDsGroup.write(valLim);
    valLim = ordersGroup1.write(valLim);
    valLim = allocID.write(valLim);
    valLim = secondaryAllocID.write(valLim);
    valLim = individualAllocID.write(valLim);
    valLim = transactTime.write(valLim);
    valLim = tradeDate.write(valLim);
    valLim = trdRegTimestampsGroup.write(valLim);
    valLim = symbol.write(valLim);
    valLim = symbolSfx.write(valLim);
    valLim = securityID.write(valLim);
    valLim = securityIDSource.write(valLim);
    valLim = securityAltIDGroup.write(valLim);
    valLim = product.write(valLim);
    valLim = cFICode.write(valLim);
    valLim = securityType.write(valLim);
    valLim = securitySubType.write(valLim);
    valLim = maturityMonthYear.write(valLim);
    valLim = maturityDate.write(valLim);
    valLim = putOrCall.write(valLim);
    valLim = couponPaymentDate.write(valLim);
    valLim = issueDate.write(valLim);
    valLim = repoCollateralSecurityType.write(valLim);
    valLim = repurchaseTerm.write(valLim);
    valLim = repurchaseRate.write(valLim);
    valLim = factor.write(valLim);
    valLim = creditRating.write(valLim);
    valLim = instrRegistry.write(valLim);
    valLim = countryOfIssue.write(valLim);
    valLim = stateOrProvinceOfIssue.write(valLim);
    valLim = localeOfIssue.write(valLim);
    valLim = redemptionDate.write(valLim);
    valLim = strikePrice.write(valLim);
    valLim = strikeCurrency.write(valLim);
    valLim = optAttribute.write(valLim);
    valLim = contractMultiplier.write(valLim);
    valLim = couponRate.write(valLim);
    valLim = securityExchange.write(valLim);
    valLim = issuer.write(valLim);
    valLim = encodedIssuerLen.write(valLim);
    valLim = encodedIssuer.write(valLim);
    valLim = securityDesc.write(valLim);
    valLim = encodedSecurityDescLen.write(valLim);
    valLim = encodedSecurityDesc.write(valLim);
    valLim = pool.write(valLim);
    valLim = contractSettlMonth.write(valLim);
    valLim = cPProgram.write(valLim);
    valLim = cPRegType.write(valLim);
    valLim = eventsGroup.write(valLim);
    valLim = datedDate.write(valLim);
    valLim = interestAccrualDate.write(valLim);
    valLim = deliveryForm.write(valLim);
    valLim = pctAtRisk.write(valLim);
    valLim = instrAttribGroup.write(valLim);
    valLim = agreementDesc.write(valLim);
    valLim = agreementID.write(valLim);
    valLim = agreementDate.write(valLim);
    valLim = agreementCurrency.write(valLim);
    valLim = terminationType.write(valLim);
    valLim = startDate.write(valLim);
    valLim = endDate.write(valLim);
    valLim = deliveryType.write(valLim);
    valLim = marginRatio.write(valLim);
    valLim = underlyingsGroup.write(valLim);
    valLim = legsGroup1.write(valLim);
    valLim = yieldType.write(valLim);
    valLim = yield.write(valLim);
    valLim = yieldCalcDate.write(valLim);
    valLim = yieldRedemptionDate.write(valLim);
    valLim = yieldRedemptionPrice.write(valLim);
    valLim = yieldRedemptionPriceType.write(valLim);
    valLim = allocQty.write(valLim);
    valLim = qtyType.write(valLim);
    valLim = side.write(valLim);
    valLim = currency.write(valLim);
    valLim = lastMkt.write(valLim);
    valLim = capacitiesGroup.write(valLim);
    valLim = allocAccount.write(valLim);
    valLim = allocAcctIDSource.write(valLim);
    valLim = allocAccountType.write(valLim);
    valLim = avgPx.write(valLim);
    valLim = avgPxPrecision.write(valLim);
    valLim = priceType.write(valLim);
    valLim = avgParPx.write(valLim);
    valLim = spread.write(valLim);
    valLim = benchmarkCurveCurrency.write(valLim);
    valLim = benchmarkCurveName.write(valLim);
    valLim = benchmarkCurvePoint.write(valLim);
    valLim = benchmarkPrice.write(valLim);
    valLim = benchmarkPriceType.write(valLim);
    valLim = benchmarkSecurityID.write(valLim);
    valLim = benchmarkSecurityIDSource.write(valLim);
    valLim = reportedPx.write(valLim);
    valLim = text.write(valLim);
    valLim = encodedTextLen.write(valLim);
    valLim = encodedText.write(valLim);
    valLim = processCode.write(valLim);
    valLim = grossTradeAmt.write(valLim);
    valLim = numDaysInterest.write(valLim);
    valLim = exDate.write(valLim);
    valLim = accruedInterestRate.write(valLim);
    valLim = accruedInterestAmt.write(valLim);
    valLim = interestAtMaturity.write(valLim);
    valLim = endAccruedInterestAmt.write(valLim);
    valLim = startCash.write(valLim);
    valLim = endCash.write(valLim);
    valLim = concession.write(valLim);
    valLim = totalTakedown.write(valLim);
    valLim = netMoney.write(valLim);
    valLim = maturityNetMoney.write(valLim);
    valLim = settlCurrAmt.write(valLim);
    valLim = settlCurrency.write(valLim);
    valLim = settlCurrFxRate.write(valLim);
    valLim = settlCurrFxRateCalc.write(valLim);
    valLim = settlType.write(valLim);
    valLim = settlDate.write(valLim);
    valLim = settlDeliveryType.write(valLim);
    valLim = standInstDbType.write(valLim);
    valLim = standInstDbName.write(valLim);
    valLim = standInstDbID.write(valLim);
    valLim = dlvyInstGroup.write(valLim);
    valLim = commission.write(valLim);
    valLim = commType.write(valLim);
    valLim = commCurrency.write(valLim);
    valLim = fundRenewWaiv.write(valLim);
    valLim = sharedCommission.write(valLim);
    valLim = stipulationsGroup.write(valLim);
    valLim = miscFeesGroup.write(valLim);
    int bodyLim = valLim;
    writeUnmapped(bodyLength, bodyLim - bodyBeg, beginString, checkSum);
  }

  @Override
  protected Tag unknownTag() {
    return FixTag.unknown;
  }

  @Override
  protected int writeMapped() {
    int fldLim = super.writeMapped();
    calcAndWriteBodyLengthMapped(bodyLength, beginString);
    calcAndWriteCheckSum(checkSum);
    return fldLim;
  }

  @Override
  public Field map(int fldBeg) {
    int beg = fldBeg;
    switch(bytes[fldBeg]) {
      case '1':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return checkSum.map(version, bytes, beg); //10
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return issuer.map(version, bytes, beg); //106
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return securityDesc.map(version, bytes, beg); //107
                  }
                  break;
              }
            }
            break;
          case '1':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup1.map(11, beg); //11
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return onBehalfOfCompID.map(version, bytes, beg); //115
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return onBehalfOfSubID.map(version, bytes, beg); //116
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return netMoney.map(version, bytes, beg); //118
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return settlCurrAmt.map(version, bytes, beg); //119
                  }
                  break;
              }
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return commission.map(version, bytes, beg); //12
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return settlCurrency.map(version, bytes, beg); //120
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return origSendingTime.map(version, bytes, beg); //122
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return deliverToCompID.map(version, bytes, beg); //128
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return deliverToSubID.map(version, bytes, beg); //129
                  }
                  break;
              }
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return commType.map(version, bytes, beg); //13
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return miscFeesGroup.map(136, beg); //136
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return miscFeesGroup.map(137, beg); //137
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return miscFeesGroup.map(138, beg); //138
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return miscFeesGroup.map(139, beg); //139
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return senderLocationID.map(version, bytes, beg); //142
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return targetLocationID.map(version, bytes, beg); //143
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return onBehalfOfLocationID.map(version, bytes, beg); //144
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return deliverToLocationID.map(version, bytes, beg); //145
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return currency.map(version, bytes, beg); //15
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return settlCurrFxRate.map(version, bytes, beg); //155
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return settlCurrFxRateCalc.map(version, bytes, beg); //156
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return numDaysInterest.map(version, bytes, beg); //157
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return accruedInterestRate.map(version, bytes, beg); //158
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return accruedInterestAmt.map(version, bytes, beg); //159
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(165, beg); //165
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityType.map(version, bytes, beg); //167
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return standInstDbType.map(version, bytes, beg); //169
                }
                break;
            }
            break;
          case '7':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return standInstDbName.map(version, bytes, beg); //170
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return standInstDbID.map(version, bytes, beg); //171
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return settlDeliveryType.map(version, bytes, beg); //172
                }
                break;
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '8' && bytes[++fldBeg] == '=') {
              return ordersGroup1.map(198, beg); //198
            }
            break;
        }
        break;
      case '2':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return maturityMonthYear.map(version, bytes, beg); //200
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return putOrCall.map(version, bytes, beg); //201
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return strikePrice.map(version, bytes, beg); //202
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return optAttribute.map(version, bytes, beg); //206
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityExchange.map(version, bytes, beg); //207
                }
                break;
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return xmlDataLen.map(version, bytes, beg); //212
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return xmlData.map(version, bytes, beg); //213
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return spread.map(version, bytes, beg); //218
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return securityIDSource.map(version, bytes, beg); //22
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return benchmarkCurveCurrency.map(version, bytes, beg); //220
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return benchmarkCurveName.map(version, bytes, beg); //221
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return benchmarkCurvePoint.map(version, bytes, beg); //222
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return couponRate.map(version, bytes, beg); //223
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return couponPaymentDate.map(version, bytes, beg); //224
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return issueDate.map(version, bytes, beg); //225
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return repurchaseTerm.map(version, bytes, beg); //226
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return repurchaseRate.map(version, bytes, beg); //227
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return factor.map(version, bytes, beg); //228
                  }
                  break;
              }
            }
            break;
          case '3':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return exDate.map(version, bytes, beg); //230
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return contractMultiplier.map(version, bytes, beg); //231
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return stipulationsGroup.map(232, beg); //232
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return stipulationsGroup.map(233, beg); //233
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return stipulationsGroup.map(234, beg); //234
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return yieldType.map(version, bytes, beg); //235
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return yield.map(version, bytes, beg); //236
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return totalTakedown.map(version, bytes, beg); //237
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return concession.map(version, bytes, beg); //238
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return repoCollateralSecurityType.map(version, bytes, beg); //239
                }
                break;
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return redemptionDate.map(version, bytes, beg); //240
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(241, beg); //241
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(242, beg); //242
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(243, beg); //243
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(244, beg); //244
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(245, beg); //245
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(246, beg); //246
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(247, beg); //247
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(248, beg); //248
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(249, beg); //249
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(250, beg); //250
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(251, beg); //251
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(252, beg); //252
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(253, beg); //253
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(254, beg); //254
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return creditRating.map(version, bytes, beg); //255
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(256, beg); //256
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(257, beg); //257
                }
                break;
            }
            break;
        }
        break;
      case '3':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return lastMkt.map(version, bytes, beg); //30
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(305, beg); //305
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(306, beg); //306
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(307, beg); //307
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(308, beg); //308
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(309, beg); //309
                  }
                  break;
              }
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(310, beg); //310
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(311, beg); //311
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(312, beg); //312
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(313, beg); //313
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(315, beg); //315
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(316, beg); //316
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(317, beg); //317
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(318, beg); //318
                }
                break;
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return msgSeqNum.map(version, bytes, beg); //34
            } else {
              switch(bytes[fldBeg]) {
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return messageEncoding.map(version, bytes, beg); //347
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedIssuerLen.map(version, bytes, beg); //348
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedIssuer.map(version, bytes, beg); //349
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return msgType.map(version, bytes, beg); //35
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedSecurityDescLen.map(version, bytes, beg); //350
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedSecurityDesc.map(version, bytes, beg); //351
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedTextLen.map(version, bytes, beg); //354
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedText.map(version, bytes, beg); //355
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(362, beg); //362
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(363, beg); //363
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(364, beg); //364
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(365, beg); //365
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return lastMsgSeqNumProcessed.map(version, bytes, beg); //369
                }
                break;
            }
            break;
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup1.map(37, beg); //37
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup1.map(38, beg); //38
            } else {
              if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
                return grossTradeAmt.map(version, bytes, beg); //381
              }
            }
            break;
        }
        break;
      case '4':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '3' && bytes[++fldBeg] == '=') {
              return priceType.map(version, bytes, beg); //423
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return possDupFlag.map(version, bytes, beg); //43
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(435, beg); //435
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(436, beg); //436
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(447, beg); //447
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(448, beg); //448
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(452, beg); //452
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(453, beg); //453
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityAltIDGroup.map(454, beg); //454
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityAltIDGroup.map(455, beg); //455
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityAltIDGroup.map(456, beg); //456
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(457, beg); //457
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(458, beg); //458
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(459, beg); //459
                }
                break;
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return product.map(version, bytes, beg); //460
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return cFICode.map(version, bytes, beg); //461
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(462, beg); //462
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(463, beg); //463
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return individualAllocID.map(version, bytes, beg); //467
                }
                break;
            }
            break;
          case '7':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return countryOfIssue.map(version, bytes, beg); //470
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return stateOrProvinceOfIssue.map(version, bytes, beg); //471
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return localeOfIssue.map(version, bytes, beg); //472
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return commCurrency.map(version, bytes, beg); //479
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return securityID.map(version, bytes, beg); //48
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return senderCompID.map(version, bytes, beg); //49
            } else {
              if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
                return fundRenewWaiv.map(version, bytes, beg); //497
              }
            }
            break;
        }
        break;
      case '5':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return senderSubID.map(version, bytes, beg); //50
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return sendingTime.map(version, bytes, beg); //52
            } else {
              switch(bytes[fldBeg]) {
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return partyIDsGroup.map(523, beg); //523
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup1.map(526, beg); //526
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return capacitiesGroup.map(528, beg); //528
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return capacitiesGroup.map(529, beg); //529
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return side.map(version, bytes, beg); //54
            } else {
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return maturityDate.map(version, bytes, beg); //541
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(542, beg); //542
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return instrRegistry.map(version, bytes, beg); //543
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return symbol.map(version, bytes, beg); //55
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(555, beg); //555
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(556, beg); //556
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return targetCompID.map(version, bytes, beg); //56
            }
            break;
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return targetSubID.map(version, bytes, beg); //57
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return text.map(version, bytes, beg); //58
            }
            break;
          case '9':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(592, beg); //592
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(593, beg); //593
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(594, beg); //594
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(595, beg); //595
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(596, beg); //596
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(597, beg); //597
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(598, beg); //598
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(599, beg); //599
                }
                break;
            }
            break;
        }
        break;
      case '6':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return avgPx.map(version, bytes, beg); //6
        } else {
          switch(bytes[fldBeg]) {
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return transactTime.map(version, bytes, beg); //60
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(600, beg); //600
                    }
                    break;
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(601, beg); //601
                    }
                    break;
                  case '2':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(602, beg); //602
                    }
                    break;
                  case '3':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(603, beg); //603
                    }
                    break;
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(604, beg); //604
                    }
                    break;
                  case '5':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(605, beg); //605
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(606, beg); //606
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(607, beg); //607
                    }
                    break;
                  case '8':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(608, beg); //608
                    }
                    break;
                  case '9':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup1.map(609, beg); //609
                    }
                    break;
                }
              }
              break;
            case '1':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(610, beg); //610
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(611, beg); //611
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(612, beg); //612
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(613, beg); //613
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(614, beg); //614
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(615, beg); //615
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(616, beg); //616
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(617, beg); //617
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(618, beg); //618
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(619, beg); //619
                  }
                  break;
              }
              break;
            case '2':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(620, beg); //620
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(621, beg); //621
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(622, beg); //622
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(623, beg); //623
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(624, beg); //624
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return hopsGroup.map(627, beg); //627
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return hopsGroup.map(628, beg); //628
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return hopsGroup.map(629, beg); //629
                  }
                  break;
              }
              break;
            case '3':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return settlType.map(version, bytes, beg); //63
              } else {
                if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                  return hopsGroup.map(630, beg); //630
                }
              }
              break;
            case '4':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return settlDate.map(version, bytes, beg); //64
              }
              break;
            case '5':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return symbolSfx.map(version, bytes, beg); //65
              } else {
                if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                  return legalConfirm.map(version, bytes, beg); //650
                }
              }
              break;
            case '6':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup1.map(66, beg); //66
              } else {
                switch(bytes[fldBeg]) {
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return allocAcctIDSource.map(version, bytes, beg); //661
                    }
                    break;
                  case '2':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return benchmarkPrice.map(version, bytes, beg); //662
                    }
                    break;
                  case '3':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return benchmarkPriceType.map(version, bytes, beg); //663
                    }
                    break;
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return confirmID.map(version, bytes, beg); //664
                    }
                    break;
                  case '5':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return confirmStatus.map(version, bytes, beg); //665
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return confirmTransType.map(version, bytes, beg); //666
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return contractSettlMonth.map(version, bytes, beg); //667
                    }
                    break;
                  case '8':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return deliveryForm.map(version, bytes, beg); //668
                    }
                    break;
                }
              }
              break;
            case '9':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return pool.map(version, bytes, beg); //691
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return yieldRedemptionDate.map(version, bytes, beg); //696
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return yieldRedemptionPrice.map(version, bytes, beg); //697
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return yieldRedemptionPriceType.map(version, bytes, beg); //698
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return benchmarkSecurityID.map(version, bytes, beg); //699
                  }
                  break;
              }
              break;
          }
        }
        break;
      case '7':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return allocID.map(version, bytes, beg); //70
            } else {
              if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
                return yieldCalcDate.map(version, bytes, beg); //701
              }
            }
            break;
          case '1':
            fldBeg++;
            if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
              return underlyingsGroup.map(711, beg); //711
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup1.map(73, beg); //73
            } else {
              switch(bytes[fldBeg]) {
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return interestAtMaturity.map(version, bytes, beg); //738
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(739, beg); //739
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return avgPxPrecision.map(version, bytes, beg); //74
            } else {
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return legsGroup1.map(740, beg); //740
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return tradeDate.map(version, bytes, beg); //75
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup1.map(756, beg); //756
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup1.map(757, beg); //757
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup1.map(758, beg); //758
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup1.map(759, beg); //759
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup1.map(760, beg); //760
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return benchmarkSecurityIDSource.map(version, bytes, beg); //761
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securitySubType.map(version, bytes, beg); //762
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingsGroup.map(763, beg); //763
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup1.map(764, beg); //764
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return trdRegTimestampsGroup.map(768, beg); //768
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return trdRegTimestampsGroup.map(769, beg); //769
                }
                break;
            }
            break;
          case '7':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return trdRegTimestampsGroup.map(770, beg); //770
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return trdRegTimestampsGroup.map(771, beg); //771
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return confirmRefID.map(version, bytes, beg); //772
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return confirmType.map(version, bytes, beg); //773
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(781, beg); //781
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(782, beg); //782
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(783, beg); //783
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(784, beg); //784
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(785, beg); //785
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(786, beg); //786
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return dlvyInstGroup.map(787, beg); //787
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return terminationType.map(version, bytes, beg); //788
                }
                break;
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return allocAccount.map(version, bytes, beg); //79
            } else {
              switch(bytes[fldBeg]) {
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return secondaryAllocID.map(version, bytes, beg); //793
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return copyMsgIndicator.map(version, bytes, beg); //797
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return allocAccountType.map(version, bytes, beg); //798
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup1.map(799, beg); //799
                  }
                  break;
              }
            }
            break;
        }
        break;
      case '8':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return beginString.map(version, bytes, beg); //8
        } else {
          switch(bytes[fldBeg]) {
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return allocQty.map(version, bytes, beg); //80
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup1.map(800, beg); //800
                    }
                    break;
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return dlvyInstGroup.map(801, beg); //801
                    }
                    break;
                  case '2':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return partyIDsGroup.map(802, beg); //802
                    }
                    break;
                  case '3':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return partyIDsGroup.map(803, beg); //803
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup1.map(806, beg); //806
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup1.map(807, beg); //807
                    }
                    break;
                }
              }
              break;
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return processCode.map(version, bytes, beg); //81
              } else {
                if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                  return underlyingsGroup.map(810, beg); //810
                }
              }
              break;
            case '5':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return dlvyInstGroup.map(85, beg); //85
              } else {
                switch(bytes[fldBeg]) {
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return qtyType.map(version, bytes, beg); //854
                    }
                    break;
                  case '8':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return sharedCommission.map(version, bytes, beg); //858
                    }
                    break;
                  case '9':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return confirmReqID.map(version, bytes, beg); //859
                    }
                    break;
                }
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return avgParPx.map(version, bytes, beg); //860
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return reportedPx.map(version, bytes, beg); //861
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return capacitiesGroup.map(862, beg); //862
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return capacitiesGroup.map(863, beg); //863
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return eventsGroup.map(864, beg); //864
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return eventsGroup.map(865, beg); //865
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return eventsGroup.map(866, beg); //866
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return eventsGroup.map(867, beg); //867
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return eventsGroup.map(868, beg); //868
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return pctAtRisk.map(version, bytes, beg); //869
                  }
                  break;
              }
              break;
            case '7':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return instrAttribGroup.map(870, beg); //870
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return instrAttribGroup.map(871, beg); //871
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return instrAttribGroup.map(872, beg); //872
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return datedDate.map(version, bytes, beg); //873
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return interestAccrualDate.map(version, bytes, beg); //874
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return cPProgram.map(version, bytes, beg); //875
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return cPRegType.map(version, bytes, beg); //876
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(877, beg); //877
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(878, beg); //878
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(879, beg); //879
                  }
                  break;
              }
              break;
            case '8':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(882, beg); //882
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(883, beg); //883
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(884, beg); //884
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(885, beg); //885
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(886, beg); //886
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(887, beg); //887
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(888, beg); //888
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(889, beg); //889
                  }
                  break;
              }
              break;
            case '9':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return signature.map(version, bytes, beg); //89
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return maturityNetMoney.map(version, bytes, beg); //890
                    }
                    break;
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return miscFeesGroup.map(891, beg); //891
                    }
                    break;
                  case '8':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return marginRatio.map(version, bytes, beg); //898
                    }
                    break;
                }
              }
              break;
          }
        }
        break;
      case '9':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return bodyLength.map(version, bytes, beg); //9
        } else {
          switch(bytes[fldBeg]) {
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return secureDataLen.map(version, bytes, beg); //90
              }
              break;
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return secureData.map(version, bytes, beg); //91
              } else {
                switch(bytes[fldBeg]) {
                  case '3':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return agreementDesc.map(version, bytes, beg); //913
                    }
                    break;
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return agreementID.map(version, bytes, beg); //914
                    }
                    break;
                  case '5':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return agreementDate.map(version, bytes, beg); //915
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return startDate.map(version, bytes, beg); //916
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return endDate.map(version, bytes, beg); //917
                    }
                    break;
                  case '8':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return agreementCurrency.map(version, bytes, beg); //918
                    }
                    break;
                  case '9':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return deliveryType.map(version, bytes, beg); //919
                    }
                    break;
                }
              }
              break;
            case '2':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return endAccruedInterestAmt.map(version, bytes, beg); //920
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return startCash.map(version, bytes, beg); //921
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return endCash.map(version, bytes, beg); //922
                  }
                  break;
              }
              break;
            case '3':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return signatureLength.map(version, bytes, beg); //93
              }
              break;
            case '4':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingsGroup.map(941, beg); //941
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(942, beg); //942
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return strikeCurrency.map(version, bytes, beg); //947
                  }
                  break;
              }
              break;
            case '5':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(955, beg); //955
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup1.map(956, beg); //956
                  }
                  break;
              }
              break;
            case '7':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return possResend.map(version, bytes, beg); //97
              }
              break;
          }
        }
        break;
    }
    return unknownField(fldBeg);
  }
}