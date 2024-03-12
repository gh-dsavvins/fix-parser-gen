package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class TradesGroup extends AbstractGroup {

  public TradesGroup(AbstractMessage message) {
    super(message, FixTag.noTrades, FixTag.tradeReportID, TradesGroupComp::new);
  }

  public LongRef noTrades() {
    return countField;
  }

  public TradesGroupComp tradesGroupComp(int ix) {
    return (TradesGroupComp) components[ix];
  }
}