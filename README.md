# fix-parser-gen

A zero-allocation FIX protocol parser for Java, generated from a QuickFIX XML dictionary (FIX 4.4).

The generator turns the dictionary into typed Java classes for every field, group and message. Messages are mapped rather than parsed: each field stores the offsets of its value in the raw bytes and decodes it only when read. Message objects are reused, so parsing creates no garbage.

## Required JVM flag

Run with:

```
-XX:-DontCompileHugeMethods
```

By default, HotSpot never JIT-compiles a method larger than 8,000 bytes of bytecode. Some of the generated `map(int)` methods are larger than that (`ExecutionReport` is 15,290 bytes), so without this flag they stay interpreted and parsing is about 6× slower.

## Test results

`LatencyTest`: 10,000,000 messages, cycling through 42 real FIX messages (ExecutionReport, NewOrderSingle, OrderCancelRequest, OrderCancelReplaceRequest, Reject), single thread, JDK 18, with `-XX:-DontCompileHugeMethods`.

```
time:                 2637104250 nanos
avg message size:          234.31 bytes
time per byte               1.13 nanos
clock per byte              3.93
time per message          263.71 nanos
```

**About 264 ns per message, or 1.1 ns per byte.**
