package com.mbts.fix;

public interface Environment {
  int MAX_MSG_LEN = 1 << 10;
  char FLD_CHAR = '\u0001';
  String FLD_STR = "\u0001";
  long UNSET_LONG = Long.MIN_VALUE;
  int UNSET_INT = Integer.MIN_VALUE;
  char UNSET_CHAR = '\uFFFF';
  String UNSET_STR = String.valueOf(UNSET_CHAR);
  Boolean UNSET_BOOLEAN = null;
  double UNSET_DOUBLE = Double.NaN;
  int UNKNOWN_TAG_NUMBER = -1;
}
