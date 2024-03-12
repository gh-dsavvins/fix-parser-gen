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
public class MultilegOrderCancelReplace extends AbstractMessage {

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
  private final OrderID orderID = new OrderID(this);
  private final OrigClOrdID origClOrdID = new OrigClOrdID(this);
  private final ClOrdID clOrdID = new ClOrdID(this);
  private final SecondaryClOrdID secondaryClOrdID = new SecondaryClOrdID(this);
  private final ClOrdLinkID clOrdLinkID = new ClOrdLinkID(this);
  private final OrigOrdModTime origOrdModTime = new OrigOrdModTime(this);
  private final PartyIDsGroup partyIDsGroup = new PartyIDsGroup(this);
  private final TradeOriginationDate tradeOriginationDate = new TradeOriginationDate(this);
  private final TradeDate tradeDate = new TradeDate(this);
  private final Account account = new Account(this);
  private final AcctIDSource acctIDSource = new AcctIDSource(this);
  private final AccountType accountType = new AccountType(this);
  private final DayBookingInst dayBookingInst = new DayBookingInst(this);
  private final BookingUnit bookingUnit = new BookingUnit(this);
  private final PreallocMethod preallocMethod = new PreallocMethod(this);
  private final AllocID allocID = new AllocID(this);
  private final AllocsGroup3 allocsGroup3 = new AllocsGroup3(this);
  private final SettlType settlType = new SettlType(this);
  private final SettlDate settlDate = new SettlDate(this);
  private final CashMargin cashMargin = new CashMargin(this);
  private final ClearingFeeIndicator clearingFeeIndicator = new ClearingFeeIndicator(this);
  private final HandlInst handlInst = new HandlInst(this);
  private final ExecInst execInst = new ExecInst(this);
  private final MinQty minQty = new MinQty(this);
  private final MaxFloor maxFloor = new MaxFloor(this);
  private final ExDestination exDestination = new ExDestination(this);
  private final TradingSessionsGroup tradingSessionsGroup = new TradingSessionsGroup(this);
  private final ProcessCode processCode = new ProcessCode(this);
  private final Side side = new Side(this);
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
  private final UnderlyingsGroup underlyingsGroup = new UnderlyingsGroup(this);
  private final PrevClosePx prevClosePx = new PrevClosePx(this);
  private final LegsGroup6 legsGroup6 = new LegsGroup6(this);
  private final LocateReqd locateReqd = new LocateReqd(this);
  private final TransactTime transactTime = new TransactTime(this);
  private final QtyType qtyType = new QtyType(this);
  private final OrderQty orderQty = new OrderQty(this);
  private final CashOrderQty cashOrderQty = new CashOrderQty(this);
  private final OrderPercent orderPercent = new OrderPercent(this);
  private final RoundingDirection roundingDirection = new RoundingDirection(this);
  private final RoundingModulus roundingModulus = new RoundingModulus(this);
  private final OrdType ordType = new OrdType(this);
  private final PriceType priceType = new PriceType(this);
  private final Price price = new Price(this);
  private final StopPx stopPx = new StopPx(this);
  private final Currency currency = new Currency(this);
  private final ComplianceID complianceID = new ComplianceID(this);
  private final SolicitedFlag solicitedFlag = new SolicitedFlag(this);
  private final IOIID iOIID = new IOIID(this);
  private final QuoteID quoteID = new QuoteID(this);
  private final TimeInForce timeInForce = new TimeInForce(this);
  private final EffectiveTime effectiveTime = new EffectiveTime(this);
  private final ExpireDate expireDate = new ExpireDate(this);
  private final ExpireTime expireTime = new ExpireTime(this);
  private final GTBookingInst gTBookingInst = new GTBookingInst(this);
  private final Commission commission = new Commission(this);
  private final CommType commType = new CommType(this);
  private final CommCurrency commCurrency = new CommCurrency(this);
  private final FundRenewWaiv fundRenewWaiv = new FundRenewWaiv(this);
  private final OrderCapacity orderCapacity = new OrderCapacity(this);
  private final OrderRestrictions orderRestrictions = new OrderRestrictions(this);
  private final CustOrderCapacity custOrderCapacity = new CustOrderCapacity(this);
  private final ForexReq forexReq = new ForexReq(this);
  private final SettlCurrency settlCurrency = new SettlCurrency(this);
  private final BookingType bookingType = new BookingType(this);
  private final Text text = new Text(this);
  private final EncodedTextLen encodedTextLen = new EncodedTextLen(this);
  private final EncodedText encodedText = new EncodedText(this);
  private final PositionEffect positionEffect = new PositionEffect(this);
  private final CoveredOrUncovered coveredOrUncovered = new CoveredOrUncovered(this);
  private final MaxShow maxShow = new MaxShow(this);
  private final PegOffsetValue pegOffsetValue = new PegOffsetValue(this);
  private final PegMoveType pegMoveType = new PegMoveType(this);
  private final PegOffsetType pegOffsetType = new PegOffsetType(this);
  private final PegLimitType pegLimitType = new PegLimitType(this);
  private final PegRoundDirection pegRoundDirection = new PegRoundDirection(this);
  private final PegScope pegScope = new PegScope(this);
  private final DiscretionInst discretionInst = new DiscretionInst(this);
  private final DiscretionOffsetValue discretionOffsetValue = new DiscretionOffsetValue(this);
  private final DiscretionMoveType discretionMoveType = new DiscretionMoveType(this);
  private final DiscretionOffsetType discretionOffsetType = new DiscretionOffsetType(this);
  private final DiscretionLimitType discretionLimitType = new DiscretionLimitType(this);
  private final DiscretionRoundDirection discretionRoundDirection = new DiscretionRoundDirection(this);
  private final DiscretionScope discretionScope = new DiscretionScope(this);
  private final TargetStrategy targetStrategy = new TargetStrategy(this);
  private final TargetStrategyParameters targetStrategyParameters = new TargetStrategyParameters(this);
  private final ParticipationRate participationRate = new ParticipationRate(this);
  private final CancellationRights cancellationRights = new CancellationRights(this);
  private final MoneyLaunderingStatus moneyLaunderingStatus = new MoneyLaunderingStatus(this);
  private final RegistID registID = new RegistID(this);
  private final Designation designation = new Designation(this);
  private final MultiLegRptTypeReq multiLegRptTypeReq = new MultiLegRptTypeReq(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public MultilegOrderCancelReplace() {
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
    valLim = orderID.write(valLim);
    valLim = origClOrdID.write(valLim);
    valLim = clOrdID.write(valLim);
    valLim = secondaryClOrdID.write(valLim);
    valLim = clOrdLinkID.write(valLim);
    valLim = origOrdModTime.write(valLim);
    valLim = partyIDsGroup.write(valLim);
    valLim = tradeOriginationDate.write(valLim);
    valLim = tradeDate.write(valLim);
    valLim = account.write(valLim);
    valLim = acctIDSource.write(valLim);
    valLim = accountType.write(valLim);
    valLim = dayBookingInst.write(valLim);
    valLim = bookingUnit.write(valLim);
    valLim = preallocMethod.write(valLim);
    valLim = allocID.write(valLim);
    valLim = allocsGroup3.write(valLim);
    valLim = settlType.write(valLim);
    valLim = settlDate.write(valLim);
    valLim = cashMargin.write(valLim);
    valLim = clearingFeeIndicator.write(valLim);
    valLim = handlInst.write(valLim);
    valLim = execInst.write(valLim);
    valLim = minQty.write(valLim);
    valLim = maxFloor.write(valLim);
    valLim = exDestination.write(valLim);
    valLim = tradingSessionsGroup.write(valLim);
    valLim = processCode.write(valLim);
    valLim = side.write(valLim);
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
    valLim = underlyingsGroup.write(valLim);
    valLim = prevClosePx.write(valLim);
    valLim = legsGroup6.write(valLim);
    valLim = locateReqd.write(valLim);
    valLim = transactTime.write(valLim);
    valLim = qtyType.write(valLim);
    valLim = orderQty.write(valLim);
    valLim = cashOrderQty.write(valLim);
    valLim = orderPercent.write(valLim);
    valLim = roundingDirection.write(valLim);
    valLim = roundingModulus.write(valLim);
    valLim = ordType.write(valLim);
    valLim = priceType.write(valLim);
    valLim = price.write(valLim);
    valLim = stopPx.write(valLim);
    valLim = currency.write(valLim);
    valLim = complianceID.write(valLim);
    valLim = solicitedFlag.write(valLim);
    valLim = iOIID.write(valLim);
    valLim = quoteID.write(valLim);
    valLim = timeInForce.write(valLim);
    valLim = effectiveTime.write(valLim);
    valLim = expireDate.write(valLim);
    valLim = expireTime.write(valLim);
    valLim = gTBookingInst.write(valLim);
    valLim = commission.write(valLim);
    valLim = commType.write(valLim);
    valLim = commCurrency.write(valLim);
    valLim = fundRenewWaiv.write(valLim);
    valLim = orderCapacity.write(valLim);
    valLim = orderRestrictions.write(valLim);
    valLim = custOrderCapacity.write(valLim);
    valLim = forexReq.write(valLim);
    valLim = settlCurrency.write(valLim);
    valLim = bookingType.write(valLim);
    valLim = text.write(valLim);
    valLim = encodedTextLen.write(valLim);
    valLim = encodedText.write(valLim);
    valLim = positionEffect.write(valLim);
    valLim = coveredOrUncovered.write(valLim);
    valLim = maxShow.write(valLim);
    valLim = pegOffsetValue.write(valLim);
    valLim = pegMoveType.write(valLim);
    valLim = pegOffsetType.write(valLim);
    valLim = pegLimitType.write(valLim);
    valLim = pegRoundDirection.write(valLim);
    valLim = pegScope.write(valLim);
    valLim = discretionInst.write(valLim);
    valLim = discretionOffsetValue.write(valLim);
    valLim = discretionMoveType.write(valLim);
    valLim = discretionOffsetType.write(valLim);
    valLim = discretionLimitType.write(valLim);
    valLim = discretionRoundDirection.write(valLim);
    valLim = discretionScope.write(valLim);
    valLim = targetStrategy.write(valLim);
    valLim = targetStrategyParameters.write(valLim);
    valLim = participationRate.write(valLim);
    valLim = cancellationRights.write(valLim);
    valLim = moneyLaunderingStatus.write(valLim);
    valLim = registID.write(valLim);
    valLim = designation.write(valLim);
    valLim = multiLegRptTypeReq.write(valLim);
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
        if(bytes[fldBeg] == '=') {
          return account.map(version, bytes, beg); //1
        } else {
          switch(bytes[fldBeg]) {
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return checkSum.map(version, bytes, beg); //10
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return exDestination.map(version, bytes, beg); //100
                    }
                    break;
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
                return clOrdID.map(version, bytes, beg); //11
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return minQty.map(version, bytes, beg); //110
                    }
                    break;
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return maxFloor.map(version, bytes, beg); //111
                    }
                    break;
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return locateReqd.map(version, bytes, beg); //114
                    }
                    break;
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
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return quoteID.map(version, bytes, beg); //117
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
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return forexReq.map(version, bytes, beg); //121
                    }
                    break;
                  case '2':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return origSendingTime.map(version, bytes, beg); //122
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return expireTime.map(version, bytes, beg); //126
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
              }
              break;
            case '4':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return prevClosePx.map(version, bytes, beg); //140
                  }
                  break;
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
                if(bytes[fldBeg] == '2' && bytes[++fldBeg] == '=') {
                  return cashOrderQty.map(version, bytes, beg); //152
                }
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return securityType.map(version, bytes, beg); //167
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return effectiveTime.map(version, bytes, beg); //168
                  }
                  break;
              }
              break;
            case '8':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return execInst.map(version, bytes, beg); //18
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
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return coveredOrUncovered.map(version, bytes, beg); //203
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
            if(bytes[fldBeg] == '=') {
              return handlInst.map(version, bytes, beg); //21
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return maxShow.map(version, bytes, beg); //210
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return pegOffsetValue.map(version, bytes, beg); //211
                  }
                  break;
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
              }
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return securityIDSource.map(version, bytes, beg); //22
            } else {
              switch(bytes[fldBeg]) {
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
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return tradeOriginationDate.map(version, bytes, beg); //229
                  }
                  break;
              }
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return iOIID.map(version, bytes, beg); //23
            } else {
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return contractMultiplier.map(version, bytes, beg); //231
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return repoCollateralSecurityType.map(version, bytes, beg); //239
                  }
                  break;
              }
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
                  return legsGroup6.map(248, beg); //248
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(249, beg); //249
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
                  return legsGroup6.map(250, beg); //250
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(251, beg); //251
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(252, beg); //252
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(253, beg); //253
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(254, beg); //254
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
                  return legsGroup6.map(257, beg); //257
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
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
              return tradingSessionsGroup.map(336, beg); //336
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
              return orderID.map(version, bytes, beg); //37
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return complianceID.map(version, bytes, beg); //376
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return solicitedFlag.map(version, bytes, beg); //377
                  }
                  break;
              }
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return orderQty.map(version, bytes, beg); //38
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return tradingSessionsGroup.map(386, beg); //386
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return discretionInst.map(version, bytes, beg); //388
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return discretionOffsetValue.map(version, bytes, beg); //389
                  }
                  break;
              }
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
              return ordType.map(version, bytes, beg); //40
            }
            break;
          case '1':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return origClOrdID.map(version, bytes, beg); //41
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return priceType.map(version, bytes, beg); //423
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return gTBookingInst.map(version, bytes, beg); //427
                }
                break;
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return possDupFlag.map(version, bytes, beg); //43
            } else {
              switch(bytes[fldBeg]) {
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return expireDate.map(version, bytes, beg); //432
                  }
                  break;
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
            if(bytes[fldBeg] == '=') {
              return price.map(version, bytes, beg); //44
            } else {
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
                  return allocsGroup3.map(467, beg); //467
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return roundingDirection.map(version, bytes, beg); //468
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return roundingModulus.map(version, bytes, beg); //469
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
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return cancellationRights.map(version, bytes, beg); //480
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return moneyLaunderingStatus.map(version, bytes, beg); //481
                  }
                  break;
              }
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return senderCompID.map(version, bytes, beg); //49
            } else {
              switch(bytes[fldBeg]) {
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return designation.map(version, bytes, beg); //494
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return fundRenewWaiv.map(version, bytes, beg); //497
                  }
                  break;
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
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return registID.map(version, bytes, beg); //513
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return orderPercent.map(version, bytes, beg); //516
                }
                break;
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
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(524, beg); //524
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(525, beg); //525
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return secondaryClOrdID.map(version, bytes, beg); //526
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return orderCapacity.map(version, bytes, beg); //528
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return orderRestrictions.map(version, bytes, beg); //529
                  }
                  break;
              }
            }
            break;
          case '3':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(538, beg); //538
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(539, beg); //539
                }
                break;
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
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return cashMargin.map(version, bytes, beg); //544
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(545, beg); //545
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
                    return legsGroup6.map(555, beg); //555
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(556, beg); //556
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return targetCompID.map(version, bytes, beg); //56
            } else {
              switch(bytes[fldBeg]) {
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return multiLegRptTypeReq.map(version, bytes, beg); //563
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(564, beg); //564
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(565, beg); //565
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(566, beg); //566
                  }
                  break;
              }
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
            } else {
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return accountType.map(version, bytes, beg); //581
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return custOrderCapacity.map(version, bytes, beg); //582
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return clOrdLinkID.map(version, bytes, beg); //583
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return origOrdModTime.map(version, bytes, beg); //586
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(587, beg); //587
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(588, beg); //588
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return dayBookingInst.map(version, bytes, beg); //589
                  }
                  break;
              }
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return timeInForce.map(version, bytes, beg); //59
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return bookingUnit.map(version, bytes, beg); //590
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return preallocMethod.map(version, bytes, beg); //591
                  }
                  break;
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
                    return legsGroup6.map(596, beg); //596
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(597, beg); //597
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(598, beg); //598
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(599, beg); //599
                  }
                  break;
              }
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
              return transactTime.map(version, bytes, beg); //60
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(600, beg); //600
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(601, beg); //601
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(602, beg); //602
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(603, beg); //603
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(604, beg); //604
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(605, beg); //605
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(606, beg); //606
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(607, beg); //607
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(608, beg); //608
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(609, beg); //609
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
                  return legsGroup6.map(610, beg); //610
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(611, beg); //611
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(612, beg); //612
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(613, beg); //613
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(614, beg); //614
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(615, beg); //615
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(616, beg); //616
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(617, beg); //617
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(618, beg); //618
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(619, beg); //619
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
                  return legsGroup6.map(620, beg); //620
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(621, beg); //621
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(622, beg); //622
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(623, beg); //623
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(624, beg); //624
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return tradingSessionsGroup.map(625, beg); //625
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
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return hopsGroup.map(630, beg); //630
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return clearingFeeIndicator.map(version, bytes, beg); //635
                  }
                  break;
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
              if(bytes[fldBeg] == '4' && bytes[++fldBeg] == '=') {
                return legsGroup6.map(654, beg); //654
              }
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return acctIDSource.map(version, bytes, beg); //660
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return allocsGroup3.map(661, beg); //661
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return contractSettlMonth.map(version, bytes, beg); //667
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
                  return legsGroup6.map(670, beg); //670
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(671, beg); //671
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(672, beg); //672
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(673, beg); //673
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(674, beg); //674
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(675, beg); //675
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(683, beg); //683
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(687, beg); //687
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(688, beg); //688
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(689, beg); //689
                }
                break;
            }
            break;
          case '9':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(690, beg); //690
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return pool.map(version, bytes, beg); //691
                }
                break;
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
              return allocID.map(version, bytes, beg); //70
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
            switch(bytes[fldBeg]) {
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return allocsGroup3.map(736, beg); //736
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return legsGroup6.map(739, beg); //739
                }
                break;
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return legsGroup6.map(740, beg); //740
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
                    return legsGroup6.map(756, beg); //756
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(757, beg); //757
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(758, beg); //758
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(759, beg); //759
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
                  return legsGroup6.map(760, beg); //760
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
                  return legsGroup6.map(764, beg); //764
                }
                break;
            }
            break;
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return positionEffect.map(version, bytes, beg); //77
            } else {
              if(bytes[fldBeg] == '5' && bytes[++fldBeg] == '=') {
                return bookingType.map(version, bytes, beg); //775
              }
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return allocsGroup3.map(78, beg); //78
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return allocsGroup3.map(79, beg); //79
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
                return allocsGroup3.map(80, beg); //80
              } else {
                switch(bytes[fldBeg]) {
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
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup6.map(804, beg); //804
                    }
                    break;
                  case '5':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup6.map(805, beg); //805
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup6.map(806, beg); //806
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return legsGroup6.map(807, beg); //807
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
            case '3':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return pegMoveType.map(version, bytes, beg); //835
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return pegOffsetType.map(version, bytes, beg); //836
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return pegLimitType.map(version, bytes, beg); //837
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return pegRoundDirection.map(version, bytes, beg); //838
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
                    return pegScope.map(version, bytes, beg); //840
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return discretionMoveType.map(version, bytes, beg); //841
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return discretionOffsetType.map(version, bytes, beg); //842
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return discretionLimitType.map(version, bytes, beg); //843
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return discretionRoundDirection.map(version, bytes, beg); //844
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return discretionScope.map(version, bytes, beg); //846
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return targetStrategy.map(version, bytes, beg); //847
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return targetStrategyParameters.map(version, bytes, beg); //848
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return participationRate.map(version, bytes, beg); //849
                  }
                  break;
              }
              break;
            case '5':
              fldBeg++;
              if(bytes[fldBeg] == '4' && bytes[++fldBeg] == '=') {
                return qtyType.map(version, bytes, beg); //854
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
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
              }
              break;
            case '7':
              fldBeg++;
              switch(bytes[fldBeg]) {
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
                    return legsGroup6.map(942, beg); //942
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return strikeCurrency.map(version, bytes, beg); //947
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return allocsGroup3.map(948, beg); //948
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return allocsGroup3.map(949, beg); //949
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
                    return allocsGroup3.map(950, beg); //950
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return allocsGroup3.map(951, beg); //951
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return allocsGroup3.map(952, beg); //952
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return allocsGroup3.map(953, beg); //953
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return allocsGroup3.map(954, beg); //954
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(955, beg); //955
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return legsGroup6.map(956, beg); //956
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
            case '9':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return stopPx.map(version, bytes, beg); //99
              }
              break;
          }
        }
        break;
    }
    return unknownField(fldBeg);
  }
}