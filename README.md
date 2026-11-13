# fix-parser-gen

A zero-allocation FIX protocol parser for Java, generated from a QuickFIX XML dictionary (FIX 4.4).

The generator turns the dictionary into typed Java classes for every field, group and message. Messages are mapped rather than parsed: each field stores the offsets of its value in the raw bytes and decodes it only when read. Message objects are reused, so parsing creates no garbage.

## Test results

`LatencyTest`: 10,000,000 messages, cycling through 42 real FIX messages (ExecutionReport, NewOrderSingle, OrderCancelRequest, OrderCancelReplaceRequest, Reject), single thread, JDK 18.

```
time:                16322509083 nanos
avg message size:          234.31 bytes
time per byte               6.97 nanos
clock per byte             24.31
time per message         1632.25 nanos
```

**About 1.6 µs per message, or 7 ns per byte.**
