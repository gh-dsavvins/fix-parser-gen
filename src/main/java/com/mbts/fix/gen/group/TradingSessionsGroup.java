package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class TradingSessionsGroup extends AbstractGroup {

  public TradingSessionsGroup(AbstractMessage message) {
    super(message, FixTag.noTradingSessions, FixTag.tradingSessionID, TradingSessionsGroupComp::new);
  }

  public LongRef noTradingSessions() {
    return countField;
  }

  public TradingSessionsGroupComp tradingSessionsGroupComp(int ix) {
    return (TradingSessionsGroupComp) components[ix];
  }
}