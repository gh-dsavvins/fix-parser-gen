package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class OrdersGroup2 extends AbstractGroup {

  public OrdersGroup2(AbstractMessage message) {
    super(message, FixTag.noOrders, FixTag.clOrdID, OrdersGroup2Comp::new);
  }

  public LongRef noOrders() {
    return countField;
  }

  public OrdersGroup2Comp ordersGroup2Comp(int ix) {
    return (OrdersGroup2Comp) components[ix];
  }
}