package com.mbts.fix.message;

import com.mbts.fix.api.ByteRef;

public abstract class AbstractByteRef implements ByteRef {

  protected int valBeg;
  protected int valLim;

  public int valBeg() {
    return valBeg;
  }

  public void valBeg(int valBeg) {
    this.valBeg = valBeg;
  }

  public int valLim() {
    return valLim;
  }

  public void valLim(int valLim) {
    this.valLim = valLim;
  }

  public int valLen() {
    return valLim - valBeg;
  }
}
