// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.f;
import m6.g;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u001f\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u0001*\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u0001*\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u0001*\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\f*\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\f*\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\f*\u00020\f2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\f*\u00020\f2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u0001*\u00020\u0017H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u0001*\u00020\u0017H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u0001*\u00020\u0017H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u0017*\u00020\u0017H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u0017*\u00020\u0017H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010!\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010 \u001a\u0017\u0010#\u001a\u00020\u0001*\u00020\"H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u0001*\u00020\"H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010$\u001a\u0017\u0010&\u001a\u00020\u0001*\u00020\"H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010$\u001a\u0017\u0010'\u001a\u00020\"*\u00020\"H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010)\u001a\u00020\"*\u00020\"H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010(\u001a\u001f\u0010*\u001a\u00020\"*\u00020\"2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020\"*\u00020\"2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-" }, d2 = { "Lkotlin/u1;", "", "g", "(I)I", "c", "k", "w", "A", "bitCount", "o", "(II)I", "s", "Lkotlin/y1;", "f", "(J)I", "b", "j", "v", "(J)J", "z", "m", "(JI)J", "q", "Lkotlin/q1;", "e", "(B)I", "a", "i", "u", "(B)B", "y", "n", "(BI)B", "r", "Lkotlin/e2;", "h", "(S)I", "d", "l", "x", "(S)S", "B", "p", "(SI)S", "t", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "UNumbersKt")
public final class d2
{
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int A(final int i) {
        return u1.k(Integer.lowestOneBit(i));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final short B(final short n) {
        return e2.k((short)Integer.lowestOneBit(n & 0xFFFF));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int a(final byte b) {
        return Integer.numberOfLeadingZeros(b & 0xFF) - 24;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int b(final long i) {
        return Long.numberOfLeadingZeros(i);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int c(final int i) {
        return Integer.numberOfLeadingZeros(i);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int d(final short n) {
        return Integer.numberOfLeadingZeros(n & 0xFFFF) - 16;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int e(final byte b) {
        return Integer.bitCount(u1.k(b & 0xFF));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int f(final long i) {
        return Long.bitCount(i);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int g(final int i) {
        return Integer.bitCount(i);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int h(final short n) {
        return Integer.bitCount(u1.k(n & 0xFFFF));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int i(final byte b) {
        return Integer.numberOfTrailingZeros(b | 0x100);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int j(final long i) {
        return Long.numberOfTrailingZeros(i);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int k(final int i) {
        return Integer.numberOfTrailingZeros(i);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int l(final short n) {
        return Integer.numberOfTrailingZeros(n | 0x10000);
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final long m(final long i, final int distance) {
        return y1.k(Long.rotateLeft(i, distance));
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final byte n(final byte b, final int n) {
        return q1.k(o0.Z0(b, n));
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final int o(final int i, final int distance) {
        return u1.k(Integer.rotateLeft(i, distance));
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final short p(final short n, final int n2) {
        return e2.k(o0.a1(n, n2));
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final long q(final long i, final int distance) {
        return y1.k(Long.rotateRight(i, distance));
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final byte r(final byte b, final int n) {
        return q1.k(o0.b1(b, n));
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final int s(final int i, final int distance) {
        return u1.k(Integer.rotateRight(i, distance));
    }
    
    @e1(version = "1.3")
    @f
    @o2(markerClass = { r.class })
    @q
    private static final short t(final short n, final int n2) {
        return e2.k(o0.c1(n, n2));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final byte u(final byte b) {
        return q1.k((byte)Integer.highestOneBit(b & 0xFF));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final long v(final long i) {
        return y1.k(Long.highestOneBit(i));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final int w(final int i) {
        return u1.k(Integer.highestOneBit(i));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final short x(final short n) {
        return e2.k((short)Integer.highestOneBit(n & 0xFFFF));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final byte y(final byte b) {
        return q1.k((byte)Integer.lowestOneBit(b & 0xFF));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class, q.class })
    private static final long z(final long i) {
        return y1.k(Long.lowestOneBit(i));
    }
}
