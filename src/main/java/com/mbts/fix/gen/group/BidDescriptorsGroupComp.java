package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class BidDescriptorsGroupComp extends AbstractGroupComponent {

  private final BidDescriptorType bidDescriptorType;
  private final BidDescriptor bidDescriptor;
  private final SideValueInd sideValueInd;
  private final LiquidityValue liquidityValue;
  private final LiquidityNumSecurities liquidityNumSecurities;
  private final LiquidityPctLow liquidityPctLow;
  private final LiquidityPctHigh liquidityPctHigh;
  private final EFPTrackingError eFPTrackingError;
  private final FairValue fairValue;
  private final OutsideIndexPct outsideIndexPct;
  private final ValueOfFutures valueOfFutures;

  public BidDescriptorsGroupComp(AbstractMessage message) {
    super(message);
    bidDescriptorType = new BidDescriptorType(message);
    bidDescriptor = new BidDescriptor(message);
    sideValueInd = new SideValueInd(message);
    liquidityValue = new LiquidityValue(message);
    liquidityNumSecurities = new LiquidityNumSecurities(message);
    liquidityPctLow = new LiquidityPctLow(message);
    liquidityPctHigh = new LiquidityPctHigh(message);
    eFPTrackingError = new EFPTrackingError(message);
    fairValue = new FairValue(message);
    outsideIndexPct = new OutsideIndexPct(message);
    valueOfFutures = new ValueOfFutures(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 399 -> bidDescriptorType.map(version, bytes, fldBeg);
      case 400 -> bidDescriptor.map(version, bytes, fldBeg);
      case 401 -> sideValueInd.map(version, bytes, fldBeg);
      case 404 -> liquidityValue.map(version, bytes, fldBeg);
      case 441 -> liquidityNumSecurities.map(version, bytes, fldBeg);
      case 402 -> liquidityPctLow.map(version, bytes, fldBeg);
      case 403 -> liquidityPctHigh.map(version, bytes, fldBeg);
      case 405 -> eFPTrackingError.map(version, bytes, fldBeg);
      case 406 -> fairValue.map(version, bytes, fldBeg);
      case 407 -> outsideIndexPct.map(version, bytes, fldBeg);
      case 408 -> valueOfFutures.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 399 -> bidDescriptorType;
      case 400 -> bidDescriptor;
      case 401 -> sideValueInd;
      case 404 -> liquidityValue;
      case 441 -> liquidityNumSecurities;
      case 402 -> liquidityPctLow;
      case 403 -> liquidityPctHigh;
      case 405 -> eFPTrackingError;
      case 406 -> fairValue;
      case 407 -> outsideIndexPct;
      case 408 -> valueOfFutures;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = bidDescriptorType.write(valBeg);
    valBeg = bidDescriptor.write(valBeg);
    valBeg = sideValueInd.write(valBeg);
    valBeg = liquidityValue.write(valBeg);
    valBeg = liquidityNumSecurities.write(valBeg);
    valBeg = liquidityPctLow.write(valBeg);
    valBeg = liquidityPctHigh.write(valBeg);
    valBeg = eFPTrackingError.write(valBeg);
    valBeg = fairValue.write(valBeg);
    valBeg = outsideIndexPct.write(valBeg);
    valBeg = valueOfFutures.write(valBeg);
    return valBeg; 
  }
}