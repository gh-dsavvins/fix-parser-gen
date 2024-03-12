package com.mbts.fix.message;

public class StringRefPool {

  private static final int MAX_SIZE = Byte.MAX_VALUE;

  private final StringRef[] pool;
  private int pointer;

  public StringRefPool(AbstractMessage message) {
    this.pool = new StringRef[MAX_SIZE];
    for (int i = 0; i < MAX_SIZE; i++) {
      this.pool[i] = new StringRef(message, message.unknownTag());
    }
  }

  public StringRef next() {
    return pool[pointer++];
  }

  public void reset() {
    pointer = 0;
  }

  public int size() {
    return pointer;
  }

  public StringRef at(int i) {
    return pool[i];
  }
}
