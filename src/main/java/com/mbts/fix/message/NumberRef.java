package com.mbts.fix.message;

import com.mbts.fix.api.Message;
import com.mbts.fix.api.Tag;

public abstract class NumberRef extends AbstractField {

  final byte[] buf;

  public NumberRef(Message message, Tag tag) {
    super(message, tag);
    this.buf = new byte[20];
  }

  static int stringSize(long x) {
    int d = 1;
    if (x >= 0) {
      d = 0;
      x = -x;
    }
    long p = -10;
    for (int i = 1; i < 19; i++) {
      if (x > p) {
        return i + d;
      }
      p = 10 * p;
    }
    return 19 + d;
  }

  static void chars(long i, int index, byte[] buf) {
    long q;
    int r;
    int charPos = index;
    boolean negative = (i < 0);
    if (!negative) {
      i = -i;
    }
    while (i <= Integer.MIN_VALUE) {
      q = i / 100;
      r = (int) ((q * 100) - i);
      i = q;
      buf[--charPos] = DigitOnes[r];
      buf[--charPos] = DigitTens[r];
    }
    int q2;
    int i2 = (int) i;
    while (i2 <= -100) {
      q2 = i2 / 100;
      r = (q2 * 100) - i2;
      i2 = q2;
      buf[--charPos] = DigitOnes[r];
      buf[--charPos] = DigitTens[r];
    }
    q2 = i2 / 10;
    r = (q2 * 10) - i2;
    buf[--charPos] = (byte) ('0' + r);
    if (q2 < 0) {
      buf[--charPos] = (byte) ('0' - q2);
    }
    if (negative) {
      buf[--charPos] = (byte) '-';
    }
  }

  static void append(long i, StringRef ref) {
    int stringSize = stringSize(i);
    ref.ensureCapacity(stringSize);
    long q;
    int r;
    int charPos = stringSize;
    boolean negative = (i < 0);
    if (!negative) {
      i = -i;
    }
    while (i <= Integer.MIN_VALUE) {
      q = i / 100;
      r = (int) ((q * 100) - i);
      i = q;
      ref.newValue[--charPos] = DigitOnes[r];
      ref.newValue[--charPos] = DigitTens[r];
    }
    int q2;
    int i2 = (int) i;
    while (i2 <= -100) {
      q2 = i2 / 100;
      r = (q2 * 100) - i2;
      i2 = q2;
      ref.newValue[--charPos] = DigitOnes[r];
      ref.newValue[--charPos] = DigitTens[r];
    }
    q2 = i2 / 10;
    r = (q2 * 10) - i2;
    ref.newValue[--charPos] = (byte) ('0' + r);
    if (q2 < 0) {
      ref.newValue[--charPos] = (byte) ('0' - q2);
    }
    if (negative) {
      ref.newValue[--charPos] = (byte) '-';
    }
    ref.newValueLength = stringSize;
  }

  private static final byte[] DigitTens = {
      '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
      '1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
      '2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
      '3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
      '4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
      '5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
      '6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
      '7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
      '8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
      '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'
  };

  private static final byte[] DigitOnes = {
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
  };
}