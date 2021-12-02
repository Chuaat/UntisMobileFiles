// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.ranges.t;
import kotlin.jvm.internal.k0;
import kotlin.internal.f;
import kotlin.jvm.internal.w;
import m6.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001ZB\u0014\b\u0001\u0012\u0006\u0010W\u001a\u00020;\u00f8\u0001\u0000¢\u0006\u0004\bX\u0010/J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006J\u001b\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u001b\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0006J\u001b\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\bJ\u001b\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006J\u001b\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\bJ\u001b\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013J\u001b\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0006J\u001b\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\bJ\u001b\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000bJ\u001b\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013J\u001b\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b \u0010\u0006J\u001b\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\bJ\u001b\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u001b\u0010#\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010\u0013J\u001b\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010\u0006J\u001b\u0010%\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010\bJ\u001b\u0010&\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010\u000bJ\u001b\u0010'\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010\u0013J\u001b\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010\u000bJ\u001b\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010\u0013J\u0016\u0010.\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b0\u0010/J\u001b\u00102\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b4\u0010+J\u001b\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b5\u0010+J\u001b\u00106\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b6\u0010+J\u0016\u00107\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b7\u0010/J\u0010\u00109\u001a\u000208H\u0087\b¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;H\u0087\b¢\u0006\u0004\b<\u0010/J\u0010\u0010=\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b=\u0010>J\u0010\u0010@\u001a\u00020?H\u0087\b¢\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bB\u0010:J\u0016\u0010C\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bC\u0010/J\u0016\u0010D\u001a\u00020\tH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bD\u0010>J\u0016\u0010E\u001a\u00020\fH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bE\u0010AJ\u0010\u0010G\u001a\u00020FH\u0087\b¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020IH\u0087\b¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0004H\u00d6\u0001¢\u0006\u0004\bO\u0010>J\u001a\u0010R\u001a\u00020Q2\b\u0010\u0003\u001a\u0004\u0018\u00010PH\u00d6\u0003¢\u0006\u0004\bR\u0010SR\u001c\u0010W\u001a\u00020;8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\bO\u0010T\u0012\u0004\bU\u0010V\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006[" }, d2 = { "Lkotlin/e2;", "", "Lkotlin/q1;", "other", "", "f", "(SB)I", "j", "(SS)I", "Lkotlin/u1;", "h", "(SI)I", "Lkotlin/y1;", "g", "(SJ)I", "c0", "l0", "k0", "i0", "(SJ)J", "M", "Q", "P", "O", "t0", "x0", "v0", "u0", "m", "s", "p", "o", "o0", "s0", "r0", "q0", "y", "B", "A", "z", "T", "(SB)B", "a0", "(SS)S", "V", "U", "I", "(S)S", "l", "Lkotlin/ranges/t;", "n0", "(SS)Lkotlin/ranges/t;", "b", "b0", "P0", "K", "", "z0", "(S)B", "", "F0", "C0", "(S)I", "", "E0", "(S)J", "I0", "N0", "J0", "K0", "", "B0", "(S)F", "", "A0", "(S)D", "", "G0", "(S)Ljava/lang/String;", "G", "", "", "u", "(SLjava/lang/Object;)Z", "S", "getData$annotations", "()V", "data", "k", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e
@e1(version = "1.5")
@o2(markerClass = { r.class })
public final class e2 implements Comparable<e2>
{
    public static final short H = 0;
    public static final short I = -1;
    public static final int J = 2;
    public static final int K = 16;
    @org.jetbrains.annotations.e
    public static final a L;
    private final short G = n;
    
    static {
        L = new a(null);
    }
    
    @f
    private static final int A(final short n, final int n2) {
        return m2.d(u1.k(n & 0xFFFF), n2);
    }
    
    @f
    private static final double A0(final short n) {
        return n & 0xFFFF;
    }
    
    @f
    private static final int B(final short n, final short n2) {
        return m2.d(u1.k(n & 0xFFFF), u1.k(n2 & 0xFFFF));
    }
    
    @f
    private static final float B0(final short n) {
        return (float)(n & 0xFFFF);
    }
    
    @f
    private static final int C0(final short n) {
        return n & 0xFFFF;
    }
    
    @f
    private static final long E0(final short n) {
        return (long)n & 0xFFFFL;
    }
    
    @f
    private static final short F0(final short n) {
        return n;
    }
    
    public static int G(final short n) {
        return n;
    }
    
    @org.jetbrains.annotations.e
    public static String G0(final short n) {
        return String.valueOf(n & 0xFFFF);
    }
    
    @f
    private static final short I(final short n) {
        return k((short)(n + 1));
    }
    
    @f
    private static final byte I0(final short n) {
        return q1.k((byte)n);
    }
    
    @f
    private static final int J0(final short n) {
        return u1.k(n & 0xFFFF);
    }
    
    @f
    private static final short K(final short n) {
        return k((short)~n);
    }
    
    @f
    private static final long K0(final short n) {
        return y1.k((long)n & 0xFFFFL);
    }
    
    @f
    private static final int M(final short n, final byte b) {
        return u1.k(u1.k(n & 0xFFFF) - u1.k(b & 0xFF));
    }
    
    @f
    private static final short N0(final short n) {
        return n;
    }
    
    @f
    private static final long O(final short n, final long n2) {
        return y1.k(y1.k((long)n & 0xFFFFL) - n2);
    }
    
    @f
    private static final int P(final short n, final int n2) {
        return u1.k(u1.k(n & 0xFFFF) - n2);
    }
    
    @f
    private static final short P0(final short n, final short n2) {
        return k((short)(n ^ n2));
    }
    
    @f
    private static final int Q(final short n, final short n2) {
        return u1.k(u1.k(n & 0xFFFF) - u1.k(n2 & 0xFFFF));
    }
    
    @f
    private static final byte T(final short n, final byte b) {
        return q1.k((byte)m2.e(u1.k(n & 0xFFFF), u1.k(b & 0xFF)));
    }
    
    @f
    private static final long U(final short n, final long n2) {
        return m2.i(y1.k((long)n & 0xFFFFL), n2);
    }
    
    @f
    private static final int V(final short n, final int n2) {
        return m2.e(u1.k(n & 0xFFFF), n2);
    }
    
    @f
    private static final short a0(final short n, final short n2) {
        return k((short)m2.e(u1.k(n & 0xFFFF), u1.k(n2 & 0xFFFF)));
    }
    
    @f
    private static final short b(final short n, final short n2) {
        return k((short)(n & n2));
    }
    
    @f
    private static final short b0(final short n, final short n2) {
        return k((short)(n | n2));
    }
    
    @f
    private static final int c0(final short n, final byte b) {
        return u1.k(u1.k(n & 0xFFFF) + u1.k(b & 0xFF));
    }
    
    @f
    private static final int f(final short n, final byte b) {
        return k0.t(n & 0xFFFF, b & 0xFF);
    }
    
    @f
    private static final int g(final short n, final long n2) {
        return m2.g(y1.k((long)n & 0xFFFFL), n2);
    }
    
    @f
    private static final int h(final short n, final int n2) {
        return m2.c(u1.k(n & 0xFFFF), n2);
    }
    
    @f
    private int i(final short n) {
        return j(this.G, n);
    }
    
    @f
    private static final long i0(final short n, final long n2) {
        return y1.k(y1.k((long)n & 0xFFFFL) + n2);
    }
    
    @f
    private static int j(final short n, final short n2) {
        return k0.t(n & 0xFFFF, n2 & 0xFFFF);
    }
    
    @y0
    public static short k(final short n) {
        return n;
    }
    
    @f
    private static final int k0(final short n, final int n2) {
        return u1.k(u1.k(n & 0xFFFF) + n2);
    }
    
    @f
    private static final short l(final short n) {
        return k((short)(n - 1));
    }
    
    @f
    private static final int l0(final short n, final short n2) {
        return u1.k(u1.k(n & 0xFFFF) + u1.k(n2 & 0xFFFF));
    }
    
    @f
    private static final int m(final short n, final byte b) {
        return m2.d(u1.k(n & 0xFFFF), u1.k(b & 0xFF));
    }
    
    @f
    private static final t n0(final short n, final short n2) {
        return new t(u1.k(n & 0xFFFF), u1.k(n2 & 0xFFFF), null);
    }
    
    @f
    private static final long o(final short n, final long n2) {
        return m2.h(y1.k((long)n & 0xFFFFL), n2);
    }
    
    @f
    private static final int o0(final short n, final byte b) {
        return m2.e(u1.k(n & 0xFFFF), u1.k(b & 0xFF));
    }
    
    @f
    private static final int p(final short n, final int n2) {
        return m2.d(u1.k(n & 0xFFFF), n2);
    }
    
    @f
    private static final long q0(final short n, final long n2) {
        return m2.i(y1.k((long)n & 0xFFFFL), n2);
    }
    
    @f
    private static final int r0(final short n, final int n2) {
        return m2.e(u1.k(n & 0xFFFF), n2);
    }
    
    @f
    private static final int s(final short n, final short n2) {
        return m2.d(u1.k(n & 0xFFFF), u1.k(n2 & 0xFFFF));
    }
    
    @f
    private static final int s0(final short n, final short n2) {
        return m2.e(u1.k(n & 0xFFFF), u1.k(n2 & 0xFFFF));
    }
    
    @f
    private static final int t0(final short n, final byte b) {
        return u1.k(u1.k(n & 0xFFFF) * u1.k(b & 0xFF));
    }
    
    public static boolean u(final short n, final Object o) {
        return o instanceof e2 && n == ((e2)o).O0();
    }
    
    @f
    private static final long u0(final short n, final long n2) {
        return y1.k(y1.k((long)n & 0xFFFFL) * n2);
    }
    
    public static final boolean v(final short n, final short n2) {
        return n == n2;
    }
    
    @f
    private static final int v0(final short n, final int n2) {
        return u1.k(u1.k(n & 0xFFFF) * n2);
    }
    
    @f
    private static final int x0(final short n, final short n2) {
        return u1.k(u1.k(n & 0xFFFF) * u1.k(n2 & 0xFFFF));
    }
    
    @f
    private static final int y(final short n, final byte b) {
        return m2.d(u1.k(n & 0xFFFF), u1.k(b & 0xFF));
    }
    
    @f
    private static final long z(final short n, final long n2) {
        return m2.h(y1.k((long)n & 0xFFFFL), n2);
    }
    
    @f
    private static final byte z0(final short n) {
        return (byte)n;
    }
    
    public final /* synthetic */ short O0() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return u(this.G, o);
    }
    
    @Override
    public int hashCode() {
        return G(this.G);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return G0(this.G);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f" }, d2 = { "kotlin/e2$a", "", "Lkotlin/e2;", "MAX_VALUE", "S", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
