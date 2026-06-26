package com.mbts.fix.message;

import com.mbts.fix.api.FixDictionary;
import com.mbts.fix.api.Message;
import com.mbts.fix.gen.DefaultFixDictionary;
import com.mbts.fix.gen.field.MsgType;
import com.mbts.fix.gen.message.ExecutionReport;
import com.mbts.fix.gen.message.NewOrderSingle;
import com.mbts.fix.gen.message.OrderCancelReplaceRequest;
import com.mbts.fix.gen.message.OrderCancelRequest;
import com.mbts.fix.gen.message.Reject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;

public class LatencyTest {

    public static volatile Message msg;

    /**
     * @noinspection resource
     */
    public static void main(String[] args) throws IOException {

        int COUNT = 10_000_000;

        FixDictionary dict = new DefaultFixDictionary();
        ExecutionReport er = new ExecutionReport();
        NewOrderSingle nos = new NewOrderSingle();
        OrderCancelRequest ocr = new OrderCancelRequest();
        OrderCancelReplaceRequest ocrr = new OrderCancelReplaceRequest();
        Reject r = new Reject();

        Function<String, Message> fn = mt -> switch (mt) {
            case MsgType.ORDER_SINGLE -> nos;
            case MsgType.EXECUTION_REPORT -> er;
            case MsgType.ORDER_CANCEL_REQUEST -> ocr;
            case MsgType.ORDER_CANCEL_REPLACE_REQUEST -> ocrr;
            case MsgType.REJECT -> r;
            default -> null;
        };

        String path = LatencyTest.class.getClassLoader().getResource("42_test_messages_no_unknown.txt").getFile();
        byte[][] messages = Files.lines(Paths.get(path)).map(s -> s.replaceAll("\\|", "")).map(String::getBytes).toArray(byte[][]::new);
        byte[][] bytes = new byte[COUNT][];
        long totalBytes = 0;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = messages[i % messages.length];
            totalBytes += bytes[i].length;
        }

        for (int i = 0; i < COUNT; i++) {
            byte[] msgBytes = bytes[i];
            msg = dict.map(msgBytes, 0, msgBytes.length, fn);
        }

        long beg = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            byte[] msgBytes = bytes[i];
            msg = dict.map(msgBytes, 0, msgBytes.length, fn);
        }
        long end = System.nanoTime();
        long time = end - beg;
        double timePerByte = (double) time / (double) totalBytes;
        double clocksPerByte = timePerByte * 3.49;
        double nanosPerMessage = (double) time / (double) COUNT;
        System.out.printf(
                """
                        %-16s%16d nanos
                        %-16s%16.2f bytes
                        %-16s%16.2f nanos
                        %-16s%16.2f
                        %-16s%16.2f nanos
                        """,
                "time:", time,
                "avg message size:", (double) totalBytes / COUNT,
                "time per byte", timePerByte,
                "clock per byte", clocksPerByte,
                "time per message", nanosPerMessage);
    }
}
