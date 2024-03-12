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
public class OrderMassCancelReport extends AbstractMessage {

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
  private final ClOrdID clOrdID = new ClOrdID(this);
  private final SecondaryClOrdID secondaryClOrdID = new SecondaryClOrdID(this);
  private final OrderID orderID = new OrderID(this);
  private final SecondaryOrderID secondaryOrderID = new SecondaryOrderID(this);
  private final MassCancelRequestType massCancelRequestType = new MassCancelRequestType(this);
  private final MassCancelResponse massCancelResponse = new MassCancelResponse(this);
  private final MassCancelRejectReason massCancelRejectReason = new MassCancelRejectReason(this);
  private final TotalAffectedOrders totalAffectedOrders = new TotalAffectedOrders(this);
  private final AffectedOrdersGroup affectedOrdersGroup = new AffectedOrdersGroup(this);
  private final TradingSessionID tradingSessionID = new TradingSessionID(this);
  private final TradingSessionSubID tradingSessionSubID = new TradingSessionSubID(this);
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
  private final UnderlyingSymbol underlyingSymbol = new UnderlyingSymbol(this);
  private final UnderlyingSymbolSfx underlyingSymbolSfx = new UnderlyingSymbolSfx(this);
  private final UnderlyingSecurityID underlyingSecurityID = new UnderlyingSecurityID(this);
  private final UnderlyingSecurityIDSource underlyingSecurityIDSource = new UnderlyingSecurityIDSource(this);
  private final UnderlyingSecurityAltIDGroup underlyingSecurityAltIDGroup = new UnderlyingSecurityAltIDGroup(this);
  private final UnderlyingProduct underlyingProduct = new UnderlyingProduct(this);
  private final UnderlyingCFICode underlyingCFICode = new UnderlyingCFICode(this);
  private final UnderlyingSecurityType underlyingSecurityType = new UnderlyingSecurityType(this);
  private final UnderlyingSecuritySubType underlyingSecuritySubType = new UnderlyingSecuritySubType(this);
  private final UnderlyingMaturityMonthYear underlyingMaturityMonthYear = new UnderlyingMaturityMonthYear(this);
  private final UnderlyingMaturityDate underlyingMaturityDate = new UnderlyingMaturityDate(this);
  private final UnderlyingPutOrCall underlyingPutOrCall = new UnderlyingPutOrCall(this);
  private final UnderlyingCouponPaymentDate underlyingCouponPaymentDate = new UnderlyingCouponPaymentDate(this);
  private final UnderlyingIssueDate underlyingIssueDate = new UnderlyingIssueDate(this);
  private final UnderlyingRepoCollateralSecurityType underlyingRepoCollateralSecurityType = new UnderlyingRepoCollateralSecurityType(this);
  private final UnderlyingRepurchaseTerm underlyingRepurchaseTerm = new UnderlyingRepurchaseTerm(this);
  private final UnderlyingRepurchaseRate underlyingRepurchaseRate = new UnderlyingRepurchaseRate(this);
  private final UnderlyingFactor underlyingFactor = new UnderlyingFactor(this);
  private final UnderlyingCreditRating underlyingCreditRating = new UnderlyingCreditRating(this);
  private final UnderlyingInstrRegistry underlyingInstrRegistry = new UnderlyingInstrRegistry(this);
  private final UnderlyingCountryOfIssue underlyingCountryOfIssue = new UnderlyingCountryOfIssue(this);
  private final UnderlyingStateOrProvinceOfIssue underlyingStateOrProvinceOfIssue = new UnderlyingStateOrProvinceOfIssue(this);
  private final UnderlyingLocaleOfIssue underlyingLocaleOfIssue = new UnderlyingLocaleOfIssue(this);
  private final UnderlyingRedemptionDate underlyingRedemptionDate = new UnderlyingRedemptionDate(this);
  private final UnderlyingStrikePrice underlyingStrikePrice = new UnderlyingStrikePrice(this);
  private final UnderlyingStrikeCurrency underlyingStrikeCurrency = new UnderlyingStrikeCurrency(this);
  private final UnderlyingOptAttribute underlyingOptAttribute = new UnderlyingOptAttribute(this);
  private final UnderlyingContractMultiplier underlyingContractMultiplier = new UnderlyingContractMultiplier(this);
  private final UnderlyingCouponRate underlyingCouponRate = new UnderlyingCouponRate(this);
  private final UnderlyingSecurityExchange underlyingSecurityExchange = new UnderlyingSecurityExchange(this);
  private final UnderlyingIssuer underlyingIssuer = new UnderlyingIssuer(this);
  private final EncodedUnderlyingIssuerLen encodedUnderlyingIssuerLen = new EncodedUnderlyingIssuerLen(this);
  private final EncodedUnderlyingIssuer encodedUnderlyingIssuer = new EncodedUnderlyingIssuer(this);
  private final UnderlyingSecurityDesc underlyingSecurityDesc = new UnderlyingSecurityDesc(this);
  private final EncodedUnderlyingSecurityDescLen encodedUnderlyingSecurityDescLen = new EncodedUnderlyingSecurityDescLen(this);
  private final EncodedUnderlyingSecurityDesc encodedUnderlyingSecurityDesc = new EncodedUnderlyingSecurityDesc(this);
  private final UnderlyingCPProgram underlyingCPProgram = new UnderlyingCPProgram(this);
  private final UnderlyingCPRegType underlyingCPRegType = new UnderlyingCPRegType(this);
  private final UnderlyingCurrency underlyingCurrency = new UnderlyingCurrency(this);
  private final UnderlyingQty underlyingQty = new UnderlyingQty(this);
  private final UnderlyingPx underlyingPx = new UnderlyingPx(this);
  private final UnderlyingDirtyPrice underlyingDirtyPrice = new UnderlyingDirtyPrice(this);
  private final UnderlyingEndPrice underlyingEndPrice = new UnderlyingEndPrice(this);
  private final UnderlyingStartValue underlyingStartValue = new UnderlyingStartValue(this);
  private final UnderlyingCurrentValue underlyingCurrentValue = new UnderlyingCurrentValue(this);
  private final UnderlyingEndValue underlyingEndValue = new UnderlyingEndValue(this);
  private final UnderlyingStipsGroup underlyingStipsGroup = new UnderlyingStipsGroup(this);
  private final Side side = new Side(this);
  private final TransactTime transactTime = new TransactTime(this);
  private final Text text = new Text(this);
  private final EncodedTextLen encodedTextLen = new EncodedTextLen(this);
  private final EncodedText encodedText = new EncodedText(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public OrderMassCancelReport() {
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
    valLim = clOrdID.write(valLim);
    valLim = secondaryClOrdID.write(valLim);
    valLim = orderID.write(valLim);
    valLim = secondaryOrderID.write(valLim);
    valLim = massCancelRequestType.write(valLim);
    valLim = massCancelResponse.write(valLim);
    valLim = massCancelRejectReason.write(valLim);
    valLim = totalAffectedOrders.write(valLim);
    valLim = affectedOrdersGroup.write(valLim);
    valLim = tradingSessionID.write(valLim);
    valLim = tradingSessionSubID.write(valLim);
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
    valLim = underlyingSymbol.write(valLim);
    valLim = underlyingSymbolSfx.write(valLim);
    valLim = underlyingSecurityID.write(valLim);
    valLim = underlyingSecurityIDSource.write(valLim);
    valLim = underlyingSecurityAltIDGroup.write(valLim);
    valLim = underlyingProduct.write(valLim);
    valLim = underlyingCFICode.write(valLim);
    valLim = underlyingSecurityType.write(valLim);
    valLim = underlyingSecuritySubType.write(valLim);
    valLim = underlyingMaturityMonthYear.write(valLim);
    valLim = underlyingMaturityDate.write(valLim);
    valLim = underlyingPutOrCall.write(valLim);
    valLim = underlyingCouponPaymentDate.write(valLim);
    valLim = underlyingIssueDate.write(valLim);
    valLim = underlyingRepoCollateralSecurityType.write(valLim);
    valLim = underlyingRepurchaseTerm.write(valLim);
    valLim = underlyingRepurchaseRate.write(valLim);
    valLim = underlyingFactor.write(valLim);
    valLim = underlyingCreditRating.write(valLim);
    valLim = underlyingInstrRegistry.write(valLim);
    valLim = underlyingCountryOfIssue.write(valLim);
    valLim = underlyingStateOrProvinceOfIssue.write(valLim);
    valLim = underlyingLocaleOfIssue.write(valLim);
    valLim = underlyingRedemptionDate.write(valLim);
    valLim = underlyingStrikePrice.write(valLim);
    valLim = underlyingStrikeCurrency.write(valLim);
    valLim = underlyingOptAttribute.write(valLim);
    valLim = underlyingContractMultiplier.write(valLim);
    valLim = underlyingCouponRate.write(valLim);
    valLim = underlyingSecurityExchange.write(valLim);
    valLim = underlyingIssuer.write(valLim);
    valLim = encodedUnderlyingIssuerLen.write(valLim);
    valLim = encodedUnderlyingIssuer.write(valLim);
    valLim = underlyingSecurityDesc.write(valLim);
    valLim = encodedUnderlyingSecurityDescLen.write(valLim);
    valLim = encodedUnderlyingSecurityDesc.write(valLim);
    valLim = underlyingCPProgram.write(valLim);
    valLim = underlyingCPRegType.write(valLim);
    valLim = underlyingCurrency.write(valLim);
    valLim = underlyingQty.write(valLim);
    valLim = underlyingPx.write(valLim);
    valLim = underlyingDirtyPrice.write(valLim);
    valLim = underlyingEndPrice.write(valLim);
    valLim = underlyingStartValue.write(valLim);
    valLim = underlyingCurrentValue.write(valLim);
    valLim = underlyingEndValue.write(valLim);
    valLim = underlyingStipsGroup.write(valLim);
    valLim = side.write(valLim);
    valLim = transactTime.write(valLim);
    valLim = text.write(valLim);
    valLim = encodedTextLen.write(valLim);
    valLim = encodedText.write(valLim);
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
              return clOrdID.map(version, bytes, beg); //11
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
              }
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
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
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
              return securityType.map(version, bytes, beg); //167
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '8' && bytes[++fldBeg] == '=') {
              return secondaryOrderID.map(version, bytes, beg); //198
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
              }
            }
            break;
          case '3':
            fldBeg++;
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
                  return underlyingCouponPaymentDate.map(version, bytes, beg); //241
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingIssueDate.map(version, bytes, beg); //242
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRepoCollateralSecurityType.map(version, bytes, beg); //243
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRepurchaseTerm.map(version, bytes, beg); //244
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRepurchaseRate.map(version, bytes, beg); //245
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingFactor.map(version, bytes, beg); //246
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRedemptionDate.map(version, bytes, beg); //247
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
                  return creditRating.map(version, bytes, beg); //255
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCreditRating.map(version, bytes, beg); //256
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
                  return underlyingSecurityIDSource.map(version, bytes, beg); //305
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingIssuer.map(version, bytes, beg); //306
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityDesc.map(version, bytes, beg); //307
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityExchange.map(version, bytes, beg); //308
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityID.map(version, bytes, beg); //309
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
                  return underlyingSecurityType.map(version, bytes, beg); //310
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSymbol.map(version, bytes, beg); //311
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSymbolSfx.map(version, bytes, beg); //312
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingMaturityMonthYear.map(version, bytes, beg); //313
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingPutOrCall.map(version, bytes, beg); //315
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingStrikePrice.map(version, bytes, beg); //316
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingOptAttribute.map(version, bytes, beg); //317
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCurrency.map(version, bytes, beg); //318
                }
                break;
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
              return tradingSessionID.map(version, bytes, beg); //336
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
                  return encodedUnderlyingIssuerLen.map(version, bytes, beg); //362
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return encodedUnderlyingIssuer.map(version, bytes, beg); //363
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return encodedUnderlyingSecurityDescLen.map(version, bytes, beg); //364
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return encodedUnderlyingSecurityDesc.map(version, bytes, beg); //365
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
            }
            break;
        }
        break;
      case '4':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '1':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return affectedOrdersGroup.map(41, beg); //41
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
                    return underlyingCouponRate.map(version, bytes, beg); //435
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingContractMultiplier.map(version, bytes, beg); //436
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
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
                  return underlyingSecurityAltIDGroup.map(457, beg); //457
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityAltIDGroup.map(458, beg); //458
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityAltIDGroup.map(459, beg); //459
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
                  return underlyingProduct.map(version, bytes, beg); //462
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCFICode.map(version, bytes, beg); //463
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
              if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
                return secondaryClOrdID.map(version, bytes, beg); //526
              }
            }
            break;
          case '3':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return massCancelRequestType.map(version, bytes, beg); //530
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return massCancelResponse.map(version, bytes, beg); //531
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return massCancelRejectReason.map(version, bytes, beg); //532
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return totalAffectedOrders.map(version, bytes, beg); //533
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return affectedOrdersGroup.map(534, beg); //534
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return affectedOrdersGroup.map(535, beg); //535
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return affectedOrdersGroup.map(536, beg); //536
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
                    return underlyingMaturityDate.map(version, bytes, beg); //542
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
                  return underlyingCountryOfIssue.map(version, bytes, beg); //592
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingStateOrProvinceOfIssue.map(version, bytes, beg); //593
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingLocaleOfIssue.map(version, bytes, beg); //594
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingInstrRegistry.map(version, bytes, beg); //595
                }
                break;
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
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return tradingSessionSubID.map(version, bytes, beg); //625
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
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return hopsGroup.map(630, beg); //630
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return symbolSfx.map(version, bytes, beg); //65
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
              return contractSettlMonth.map(version, bytes, beg); //667
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
              return pool.map(version, bytes, beg); //691
            }
            break;
        }
        break;
      case '7':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securitySubType.map(version, bytes, beg); //762
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecuritySubType.map(version, bytes, beg); //763
                }
                break;
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
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return underlyingPx.map(version, bytes, beg); //810
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
                    return underlyingCPProgram.map(version, bytes, beg); //877
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingCPRegType.map(version, bytes, beg); //878
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingQty.map(version, bytes, beg); //879
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
                    return underlyingDirtyPrice.map(version, bytes, beg); //882
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingEndPrice.map(version, bytes, beg); //883
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStartValue.map(version, bytes, beg); //884
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingCurrentValue.map(version, bytes, beg); //885
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingEndValue.map(version, bytes, beg); //886
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStipsGroup.map(887, beg); //887
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStipsGroup.map(888, beg); //888
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStipsGroup.map(889, beg); //889
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
                    return underlyingStrikeCurrency.map(version, bytes, beg); //941
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