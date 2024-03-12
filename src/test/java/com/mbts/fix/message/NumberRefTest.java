package com.mbts.fix.message;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class NumberRefTest {

  @Test
  public void testToString() {
    StringRef actual = new StringRef();
    Random random = new Random();
    for(int i = 0; i < 1000; i++) {
      long nextLong = random.nextLong();
      String expected = Long.toString(nextLong);
      actual.newValueLength = 0;
      NumberRef.append(nextLong, actual);
      if(!actual.equals(expected)) {
        System.err.printf("expected: %s, actual: %s\n", expected, actual);
        Assertions.fail();
      }
    }
  }
}
