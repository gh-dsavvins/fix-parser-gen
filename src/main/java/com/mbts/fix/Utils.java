package com.mbts.fix;

public class Utils {

  private static final int min_skip_before_mt_val = "8=FIX4.4|9=0|".length();

  public static int fieldEnd(byte[] bytes, int ix) {
    //noinspection StatementWithEmptyBody
    while (bytes[++ix] != Environment.FLD_CHAR) {}
    return ix;
  }

  public static int checksum(byte[] bytes, int msgBeg, int msgLim) {
    int sum = 0;
    for (int i = msgBeg; i < msgLim; i++) {
      sum += bytes[i];
    }
    return sum & 255;
  }

  @SuppressWarnings("StatementWithEmptyBody")
  public static int mtValBeg(byte[] bytes, int offset) {
    int out = offset + min_skip_before_mt_val;
    while(bytes[out++] != '3');
    while(bytes[out++] != '5');
    return out + 1;
  }
}