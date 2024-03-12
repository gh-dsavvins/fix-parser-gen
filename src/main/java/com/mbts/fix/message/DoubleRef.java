package com.mbts.fix.message;

import com.mbts.fix.api.Field;
import com.mbts.fix.api.Message;
import com.mbts.fix.api.Tag;

import static com.mbts.fix.Environment.*;

public class DoubleRef extends NumberRef {

  private static final long[] MULTIPLIERS = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000 };
  private int exponent;
  private long mantissa;

  public DoubleRef(Message message, Tag tag) {
    super(message, tag);
  }

  public DoubleRef() {
    this(null, null);
  }

  void parse() {
    exponent = 0;
    mantissa = 0;
    byte[] bytes = message.bytes;
    int beg = valBeg;
    boolean negative = false;
    if(bytes[beg] == '-') {
      negative = true;
      beg++;
    }
    for (int i = beg; i < valLim; i++) {
      byte c = bytes[i];
      if(c == '.') {
        exponent = valLim - i - 1;
      } else {
        mantissa *= 10;
        mantissa += c - '0';
      }
    }
    if(negative) {
      mantissa = -mantissa;
    }
    exponent = -exponent;
    parsed = true;
  }

  public DoubleRef set(long mantissa, int exponent) {
    if(exponent > 0) {
      throw new RuntimeException("exponent can not be positive");
    }
    this.mantissa = mantissa;
    this.exponent = exponent;
    writeNewBytes();
    onValueSet();
    return this;
  }

  public DoubleRef set(double val, int exponent) {
    if(exponent > 0) {
      throw new RuntimeException("exponent can not be positive");
    }
    this.exponent = exponent;
    this.mantissa = (long) (val * MULTIPLIERS[-exponent]);
    writeNewBytes();
    onValueSet();
    return this;
  }

  private void writeNewBytes() {
    int exponentAbs = -exponent;
    boolean negative = mantissa < 0;
    int digits = stringSize(mantissa);
    chars(mantissa, digits, buf);
    int negChars = negative ? 1 : 0;
    int dotChars = exponentAbs > 0 ? 1 : 0;
    digits -= negChars;
    int zeroes = 0;
    if(exponentAbs >= digits) {
      zeroes += 1 + (exponentAbs - digits);
    }
    int charLen = negChars + zeroes + dotChars + digits;
    int dotIx = (charLen - exponentAbs) - 1;
    int digitStartIndex = charLen - digits;
    if(exponentAbs < digits) {
      digitStartIndex--;
    }
    ensureCapacity(charLen);
    int skip = 0;
    for(int i = 0; i < charLen; i++) {
      byte c;
      if(i == 0 && mantissa < 0) {
        c = buf[i];
      } else {
        if(exponent == 0) {
          c = buf[i];
        } else if(i == dotIx) {
          skip++;
          c = '.';
        } else if(i < digitStartIndex) {
          skip++;
          c = '0';
        } else {
          c = buf[i - skip];
        }
      }
      newValue[i] = c;
    }
    newValueLength = charLen;
  }

  public double value() {
    long mantissa = mantissa();
    if(mantissa == UNSET_LONG) {
      return UNSET_DOUBLE;
    }
    int thisExponent = exponent();
    int exponent = thisExponent == UNSET_INT ? 0 : -thisExponent;
    if(exponent == 0) {
      return (double) mantissa;
    }
    return (double) mantissa / MULTIPLIERS[exponent];
  }

  public long mantissa() {
    if(dirty()) {
      return mantissa;
    }
    if(!mapped()) {
      return UNSET_LONG;
    }
    if(!parsed) {
      parse();
    }
    return mantissa;
  }

  public int exponent() {
    if(dirty()) {
      return exponent;
    }
    if(!mapped()) {
      return UNSET_INT;
    }
    if(!parsed) {
      parse();
    }
    return exponent;
  }

  @Override
  public void unset() {
    super.unset();
    mantissa = UNSET_LONG;
    exponent = UNSET_INT;
  }

  @Override
  public String toString() {
    return dirty() ? new String(newValue, 0, newValueLength)
        : mapped() ? new String(message.bytes, valBeg, valLen())
        : UNSET_STR;
  }
}
