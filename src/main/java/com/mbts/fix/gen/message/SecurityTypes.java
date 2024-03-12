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
public class SecurityTypes extends AbstractMessage {

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
  private final SecurityReqID securityReqID = new SecurityReqID(this);
  private final SecurityResponseID securityResponseID = new SecurityResponseID(this);
  private final SecurityResponseType securityResponseType = new SecurityResponseType(this);
  private final TotNoSecurityTypes totNoSecurityTypes = new TotNoSecurityTypes(this);
  private final LastFragment lastFragment = new LastFragment(this);
  private final SecurityTypesGroup securityTypesGroup = new SecurityTypesGroup(this);
  private final Text text = new Text(this);
  private final EncodedTextLen encodedTextLen = new EncodedTextLen(this);
  private final EncodedText encodedText = new EncodedText(this);
  private final TradingSessionID tradingSessionID = new TradingSessionID(this);
  private final TradingSessionSubID tradingSessionSubID = new TradingSessionSubID(this);
  private final SubscriptionRequestType subscriptionRequestType = new SubscriptionRequestType(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public SecurityTypes() {
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
    valLim = securityReqID.write(valLim);
    valLim = securityResponseID.write(valLim);
    valLim = securityResponseType.write(valLim);
    valLim = totNoSecurityTypes.write(valLim);
    valLim = lastFragment.write(valLim);
    valLim = securityTypesGroup.write(valLim);
    valLim = text.write(valLim);
    valLim = encodedTextLen.write(valLim);
    valLim = encodedText.write(valLim);
    valLim = tradingSessionID.write(valLim);
    valLim = tradingSessionSubID.write(valLim);
    valLim = subscriptionRequestType.write(valLim);
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
            }
            break;
          case '1':
            fldBeg++;
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
              return securityTypesGroup.map(167, beg); //167
            }
            break;
        }
        break;
      case '2':
        fldBeg++;
        switch(bytes[fldBeg]) {
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
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '3' && bytes[++fldBeg] == '=') {
              return subscriptionRequestType.map(version, bytes, beg); //263
            }
            break;
        }
        break;
      case '3':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityReqID.map(version, bytes, beg); //320
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityResponseID.map(version, bytes, beg); //322
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityResponseType.map(version, bytes, beg); //323
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
              if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
                return messageEncoding.map(version, bytes, beg); //347
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return msgType.map(version, bytes, beg); //35
            } else {
              switch(bytes[fldBeg]) {
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
            if(bytes[fldBeg] == '9' && bytes[++fldBeg] == '=') {
              return lastMsgSeqNumProcessed.map(version, bytes, beg); //369
            }
            break;
        }
        break;
      case '4':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return possDupFlag.map(version, bytes, beg); //43
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityTypesGroup.map(460, beg); //460
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityTypesGroup.map(461, beg); //461
                }
                break;
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
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return totNoSecurityTypes.map(version, bytes, beg); //557
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityTypesGroup.map(558, beg); //558
                }
                break;
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
        }
        break;
      case '6':
        fldBeg++;
        switch(bytes[fldBeg]) {
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
        }
        break;
      case '7':
        fldBeg++;
        if(bytes[fldBeg] == '6' && bytes[fldBeg++] == '2' && bytes[++fldBeg] == '=') {
          return securityTypesGroup.map(762, beg); //762
        }
        break;
      case '8':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return beginString.map(version, bytes, beg); //8
        } else {
          switch(bytes[fldBeg]) {
            case '9':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return signature.map(version, bytes, beg); //89
              } else {
                if(bytes[fldBeg] == '3' && bytes[++fldBeg] == '=') {
                  return lastFragment.map(version, bytes, beg); //893
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
              }
              break;
            case '3':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return signatureLength.map(version, bytes, beg); //93
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