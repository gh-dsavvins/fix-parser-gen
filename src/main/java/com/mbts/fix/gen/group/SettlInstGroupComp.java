package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class SettlInstGroupComp extends AbstractGroupComponent {

  private final SettlInstID settlInstID;
  private final SettlInstTransType settlInstTransType;
  private final SettlInstRefID settlInstRefID;
  private final PartyIDsGroup partyIDsGroup;
  private final Side side;
  private final Product product;
  private final SecurityType securityType;
  private final CFICode cFICode;
  private final EffectiveTime effectiveTime;
  private final ExpireTime expireTime;
  private final LastUpdateTime lastUpdateTime;
  private final SettlDeliveryType settlDeliveryType;
  private final StandInstDbType standInstDbType;
  private final StandInstDbName standInstDbName;
  private final StandInstDbID standInstDbID;
  private final DlvyInstGroup dlvyInstGroup;
  private final PaymentMethod paymentMethod;
  private final PaymentRef paymentRef;
  private final CardHolderName cardHolderName;
  private final CardNumber cardNumber;
  private final CardStartDate cardStartDate;
  private final CardExpDate cardExpDate;
  private final CardIssNum cardIssNum;
  private final PaymentDate paymentDate;
  private final PaymentRemitterID paymentRemitterID;

  public SettlInstGroupComp(AbstractMessage message) {
    super(message);
    settlInstID = new SettlInstID(message);
    settlInstTransType = new SettlInstTransType(message);
    settlInstRefID = new SettlInstRefID(message);
    partyIDsGroup = new PartyIDsGroup(message);
    side = new Side(message);
    product = new Product(message);
    securityType = new SecurityType(message);
    cFICode = new CFICode(message);
    effectiveTime = new EffectiveTime(message);
    expireTime = new ExpireTime(message);
    lastUpdateTime = new LastUpdateTime(message);
    settlDeliveryType = new SettlDeliveryType(message);
    standInstDbType = new StandInstDbType(message);
    standInstDbName = new StandInstDbName(message);
    standInstDbID = new StandInstDbID(message);
    dlvyInstGroup = new DlvyInstGroup(message);
    paymentMethod = new PaymentMethod(message);
    paymentRef = new PaymentRef(message);
    cardHolderName = new CardHolderName(message);
    cardNumber = new CardNumber(message);
    cardStartDate = new CardStartDate(message);
    cardExpDate = new CardExpDate(message);
    cardIssNum = new CardIssNum(message);
    paymentDate = new PaymentDate(message);
    paymentRemitterID = new PaymentRemitterID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 162 -> settlInstID.map(version, bytes, fldBeg);
      case 163 -> settlInstTransType.map(version, bytes, fldBeg);
      case 214 -> settlInstRefID.map(version, bytes, fldBeg);
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.map(tag, fldBeg);
      case 54 -> side.map(version, bytes, fldBeg);
      case 460 -> product.map(version, bytes, fldBeg);
      case 167 -> securityType.map(version, bytes, fldBeg);
      case 461 -> cFICode.map(version, bytes, fldBeg);
      case 168 -> effectiveTime.map(version, bytes, fldBeg);
      case 126 -> expireTime.map(version, bytes, fldBeg);
      case 779 -> lastUpdateTime.map(version, bytes, fldBeg);
      case 172 -> settlDeliveryType.map(version, bytes, fldBeg);
      case 169 -> standInstDbType.map(version, bytes, fldBeg);
      case 170 -> standInstDbName.map(version, bytes, fldBeg);
      case 171 -> standInstDbID.map(version, bytes, fldBeg);
      case 784,801,785,786,787,85,165,781,782,783 -> 
          dlvyInstGroup.map(tag, fldBeg);
      case 492 -> paymentMethod.map(version, bytes, fldBeg);
      case 476 -> paymentRef.map(version, bytes, fldBeg);
      case 488 -> cardHolderName.map(version, bytes, fldBeg);
      case 489 -> cardNumber.map(version, bytes, fldBeg);
      case 503 -> cardStartDate.map(version, bytes, fldBeg);
      case 490 -> cardExpDate.map(version, bytes, fldBeg);
      case 491 -> cardIssNum.map(version, bytes, fldBeg);
      case 504 -> paymentDate.map(version, bytes, fldBeg);
      case 505 -> paymentRemitterID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 162 -> settlInstID;
      case 163 -> settlInstTransType;
      case 214 -> settlInstRefID;
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.field(tag);
      case 54 -> side;
      case 460 -> product;
      case 167 -> securityType;
      case 461 -> cFICode;
      case 168 -> effectiveTime;
      case 126 -> expireTime;
      case 779 -> lastUpdateTime;
      case 172 -> settlDeliveryType;
      case 169 -> standInstDbType;
      case 170 -> standInstDbName;
      case 171 -> standInstDbID;
      case 784,801,785,786,787,85,165,781,782,783 -> 
          dlvyInstGroup.field(tag);
      case 492 -> paymentMethod;
      case 476 -> paymentRef;
      case 488 -> cardHolderName;
      case 489 -> cardNumber;
      case 503 -> cardStartDate;
      case 490 -> cardExpDate;
      case 491 -> cardIssNum;
      case 504 -> paymentDate;
      case 505 -> paymentRemitterID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = settlInstID.write(valBeg);
    valBeg = settlInstTransType.write(valBeg);
    valBeg = settlInstRefID.write(valBeg);
    valBeg = partyIDsGroup.write(valBeg);
    valBeg = side.write(valBeg);
    valBeg = product.write(valBeg);
    valBeg = securityType.write(valBeg);
    valBeg = cFICode.write(valBeg);
    valBeg = effectiveTime.write(valBeg);
    valBeg = expireTime.write(valBeg);
    valBeg = lastUpdateTime.write(valBeg);
    valBeg = settlDeliveryType.write(valBeg);
    valBeg = standInstDbType.write(valBeg);
    valBeg = standInstDbName.write(valBeg);
    valBeg = standInstDbID.write(valBeg);
    valBeg = dlvyInstGroup.write(valBeg);
    valBeg = paymentMethod.write(valBeg);
    valBeg = paymentRef.write(valBeg);
    valBeg = cardHolderName.write(valBeg);
    valBeg = cardNumber.write(valBeg);
    valBeg = cardStartDate.write(valBeg);
    valBeg = cardExpDate.write(valBeg);
    valBeg = cardIssNum.write(valBeg);
    valBeg = paymentDate.write(valBeg);
    valBeg = paymentRemitterID.write(valBeg);
    return valBeg; 
  }
}