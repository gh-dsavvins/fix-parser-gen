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
public class Logon extends AbstractMessage {

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
  private final EncryptMethod encryptMethod = new EncryptMethod(this);
  private final HeartBtInt heartBtInt = new HeartBtInt(this);
  private final RawDataLength rawDataLength = new RawDataLength(this);
  private final RawData rawData = new RawData(this);
  private final ResetSeqNumFlag resetSeqNumFlag = new ResetSeqNumFlag(this);
  private final NextExpectedMsgSeqNum nextExpectedMsgSeqNum = new NextExpectedMsgSeqNum(this);
  private final MaxMessageSize maxMessageSize = new MaxMessageSize(this);
  private final MsgTypesGroup msgTypesGroup = new MsgTypesGroup(this);
  private final TestMessageIndicator testMessageIndicator = new TestMessageIndicator(this);
  private final Username username = new Username(this);
  private final Password password = new Password(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public Logon() {
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
    valLim = encryptMethod.write(valLim);
    valLim = heartBtInt.write(valLim);
    valLim = rawDataLength.write(valLim);
    valLim = rawData.write(valLim);
    valLim = resetSeqNumFlag.write(valLim);
    valLim = nextExpectedMsgSeqNum.write(valLim);
    valLim = maxMessageSize.write(valLim);
    valLim = msgTypesGroup.write(valLim);
    valLim = testMessageIndicator.write(valLim);
    valLim = username.write(valLim);
    valLim = password.write(valLim);
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
              if(bytes[fldBeg] == '8' && bytes[++fldBeg] == '=') {
                return heartBtInt.map(version, bytes, beg); //108
              }
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
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return resetSeqNumFlag.map(version, bytes, beg); //141
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
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '2' && bytes[++fldBeg] == '=') {
              return msgTypesGroup.map(372, beg); //372
            }
            break;
          case '8':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return maxMessageSize.map(version, bytes, beg); //383
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return msgTypesGroup.map(384, beg); //384
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return msgTypesGroup.map(385, beg); //385
                }
                break;
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
            if(bytes[fldBeg] == '4' && bytes[++fldBeg] == '=') {
              return testMessageIndicator.map(version, bytes, beg); //464
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
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return username.map(version, bytes, beg); //553
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return password.map(version, bytes, beg); //554
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
        }
        break;
      case '7':
        fldBeg++;
        if(bytes[fldBeg] == '8' && bytes[fldBeg++] == '9' && bytes[++fldBeg] == '=') {
          return nextExpectedMsgSeqNum.map(version, bytes, beg); //789
        }
        break;
      case '8':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return beginString.map(version, bytes, beg); //8
        } else {
          if(bytes[fldBeg] == '9' && bytes[++fldBeg] == '=') {
            return signature.map(version, bytes, beg); //89
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
            case '5':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return rawDataLength.map(version, bytes, beg); //95
              }
              break;
            case '6':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return rawData.map(version, bytes, beg); //96
              }
              break;
            case '7':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return possResend.map(version, bytes, beg); //97
              }
              break;
            case '8':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return encryptMethod.map(version, bytes, beg); //98
              }
              break;
          }
        }
        break;
    }
    return unknownField(fldBeg);
  }
}