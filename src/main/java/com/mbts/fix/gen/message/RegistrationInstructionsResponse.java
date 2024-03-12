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
public class RegistrationInstructionsResponse extends AbstractMessage {

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
  private final RegistID registID = new RegistID(this);
  private final RegistTransType registTransType = new RegistTransType(this);
  private final RegistRefID registRefID = new RegistRefID(this);
  private final ClOrdID clOrdID = new ClOrdID(this);
  private final PartyIDsGroup partyIDsGroup = new PartyIDsGroup(this);
  private final Account account = new Account(this);
  private final AcctIDSource acctIDSource = new AcctIDSource(this);
  private final RegistStatus registStatus = new RegistStatus(this);
  private final RegistRejReasonCode registRejReasonCode = new RegistRejReasonCode(this);
  private final RegistRejReasonText registRejReasonText = new RegistRejReasonText(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public RegistrationInstructionsResponse() {
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
    valLim = registID.write(valLim);
    valLim = registTransType.write(valLim);
    valLim = registRefID.write(valLim);
    valLim = clOrdID.write(valLim);
    valLim = partyIDsGroup.write(valLim);
    valLim = account.write(valLim);
    valLim = acctIDSource.write(valLim);
    valLim = registStatus.write(valLim);
    valLim = registRejReasonCode.write(valLim);
    valLim = registRejReasonText.write(valLim);
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
          }
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
        }
        break;
      case '3':
        fldBeg++;
        switch(bytes[fldBeg]) {
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
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return senderCompID.map(version, bytes, beg); //49
            } else {
              if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
                return registRejReasonText.map(version, bytes, beg); //496
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
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return registStatus.map(version, bytes, beg); //506
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return registRejReasonCode.map(version, bytes, beg); //507
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return registRefID.map(version, bytes, beg); //508
                  }
                  break;
              }
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
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return registTransType.map(version, bytes, beg); //514
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return sendingTime.map(version, bytes, beg); //52
            } else {
              if(bytes[fldBeg] == '3' && bytes[++fldBeg] == '=') {
                return partyIDsGroup.map(523, beg); //523
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
        }
        break;
      case '6':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
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
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return acctIDSource.map(version, bytes, beg); //660
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