package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class CapacitiesGroupComp extends AbstractGroupComponent {

  private final OrderCapacity orderCapacity;
  private final OrderRestrictions orderRestrictions;
  private final OrderCapacityQty orderCapacityQty;

  public CapacitiesGroupComp(AbstractMessage message) {
    super(message);
    orderCapacity = new OrderCapacity(message);
    orderRestrictions = new OrderRestrictions(message);
    orderCapacityQty = new OrderCapacityQty(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 528 -> orderCapacity.map(version, bytes, fldBeg);
      case 529 -> orderRestrictions.map(version, bytes, fldBeg);
      case 863 -> orderCapacityQty.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 528 -> orderCapacity;
      case 529 -> orderRestrictions;
      case 863 -> orderCapacityQty;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = orderCapacity.write(valBeg);
    valBeg = orderRestrictions.write(valBeg);
    valBeg = orderCapacityQty.write(valBeg);
    return valBeg; 
  }
}