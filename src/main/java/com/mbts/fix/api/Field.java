package com.mbts.fix.api;

public interface Field extends ByteRef, Tagged {
  boolean mapped();
  boolean dirty();
  void unset();
  <F extends Field> F map(long version, byte[] bytes, int fldBeg);
  int write(int offset);
}
