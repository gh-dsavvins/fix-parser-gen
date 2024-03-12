package com.mbts.fix.api;

import com.mbts.fix.message.StringRef;

public interface Message extends ByteRef {
  byte[] bytes();
  <M extends Message> M map(byte[] bytes, int offset, int length);
  <M extends Message> M write();
  boolean mapped();
  void reset();
  <M extends Message> M copy(Message from);
  long version();
  Field unknownField(int fldBeg);
  String toDebugFixString();
}
