package com.mbts.fix.message;

import com.mbts.fix.api.FixDictionary;
import com.mbts.fix.gen.DefaultFixDictionary;
import com.mbts.fix.gen.message.ExecutionReport;
import org.junit.jupiter.api.Assertions;

import java.util.function.Function;

public class TestMessage {

  public static void main(String[] args) {
    final String data =
        ("8=FIX.4.4|9=309|35=8|49=ASX|56=CL1_FIX44|34=4|52=20060324-01:05:58|17=X-B-WOW-1494E9A0:58BD3F9D-1109|150=D|39=0|" +
        "11=184271|38=200|198=1494E9A0:58BD3F9D|526=4324|37=B-WOW-1494E9A0:58BD3F9D|" +
        "55=WOW|54=1|151=200|14=0|40=2|44=15|59=1|6=0|" +
            "453=3|" +
            "448=AAA35791|447=D|452=3|" +
            "448=8|447=D|452=4|" +
            "448=FIX11|447=D|452=36|" +
        "60=20060320-03:34:29|10=169|").replaceAll("\\|", "\u0001");
    FixDictionary dict = new DefaultFixDictionary();
    byte[] bytes = data.getBytes();
    ExecutionReport executionReport = new ExecutionReport();

    int COUNT = 10_000_000;
    Function<String, ExecutionReport> stringExecutionReportFunction = mt -> executionReport;
    long beg = System.nanoTime();
    for(int i = 0; i < COUNT; i++) {
      ExecutionReport map = dict.map(bytes, 0, bytes.length, stringExecutionReportFunction);
    }
    long end = System.nanoTime();
    double time = end - beg;
    double timePerMessage = time / COUNT;
    double timePerByte = timePerMessage / bytes.length;
    System.out.printf("timePerMessage: %16.2f, timePerByte: %16.2f\n", timePerMessage, timePerByte);
    Assertions.assertEquals("FIX.4.4", executionReport.beginString().toString());
    Assertions.assertEquals("184271", executionReport.clOrdID().toString());
  }

}
