package com.mbts.fix.api;

public interface Component {
  Field map(int tag, int fldBeg);
  int write(int valBeg);
  Field field(Tag tag);
}
