package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class EncryptMethod extends LongRef {

  public static final long NONE = 0;
  public static final long PEM_DES_MD5 = 6;
  public static final long PGP_DES = 4;
  public static final long PGP_DES_MD5 = 5;
  public static final long DES = 2;
  public static final long PKCS_DES = 3;
  public static final long PKCS = 1;

  public EncryptMethod(Message message) {
    super(message, FixTag.encryptMethod);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NONE;
      case '1' -> PKCS;
      case '2' -> DES;
      case '3' -> PKCS_DES;
      case '4' -> PGP_DES;
      case '5' -> PGP_DES_MD5;
      case '6' -> PEM_DES_MD5;
      default -> throw new RuntimeException("value");
    };
  }
}