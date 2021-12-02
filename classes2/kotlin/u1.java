// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.ranges.t;
import kotlin.internal.f;
import kotlin.jvm.internal.w;
import m6.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\\B\u0014\b\u0001\u0012\u0006\u0010Y\u001a\u00020\u0004\u00f8\u0001\u0000¢\u0006\u0004\bZ\u0010/J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\n\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006J\u001b\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\tJ\u001b\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0006J\u001b\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\tJ\u001b\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006J\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\tJ\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013J\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0006J\u001b\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\tJ\u001b\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000bJ\u001b\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013J\u001b\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b \u0010\u0006J\u001b\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\tJ\u001b\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u001b\u0010#\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010\u0013J\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010\u0006J\u001b\u0010%\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010\tJ\u001b\u0010&\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010\u000bJ\u001b\u0010'\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010\u0013J\u001b\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010\u000bJ\u001b\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010\u0013J\u0016\u0010.\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b0\u0010/J\u001b\u00102\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b2\u00103J\u001e\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0004H\u0087\f\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b5\u0010\u000bJ\u001e\u00106\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0004H\u0087\f\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b6\u0010\u000bJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00108\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00109\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b9\u0010\u000bJ\u0016\u0010:\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b:\u0010/J\u0010\u0010<\u001a\u00020;H\u0087\b¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>H\u0087\b¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\bA\u0010/J\u0010\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0004\bC\u0010DJ\u0016\u0010E\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bE\u0010=J\u0016\u0010F\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bF\u0010@J\u0016\u0010G\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bG\u0010/J\u0016\u0010H\u001a\u00020\fH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bH\u0010DJ\u0010\u0010J\u001a\u00020IH\u0087\b¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020LH\u0087\b¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0004H\u00d6\u0001¢\u0006\u0004\bR\u0010/J\u001a\u0010U\u001a\u00020T2\b\u0010\u0003\u001a\u0004\u0018\u00010SH\u00d6\u0003¢\u0006\u0004\bU\u0010VR\u001c\u0010Y\u001a\u00020\u00048\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\bR\u0010.\u0012\u0004\bW\u0010X\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006]" }, d2 = { "Lkotlin/u1;", "", "Lkotlin/q1;", "other", "", "f", "(IB)I", "Lkotlin/e2;", "j", "(IS)I", "i", "(II)I", "Lkotlin/y1;", "g", "(IJ)I", "c0", "l0", "k0", "i0", "(IJ)J", "M", "Q", "P", "O", "v0", "A0", "z0", "x0", "m", "s", "p", "o", "o0", "s0", "r0", "q0", "y", "B", "A", "z", "T", "(IB)B", "a0", "(IS)S", "V", "U", "I", "(I)I", "l", "Lkotlin/ranges/t;", "n0", "(II)Lkotlin/ranges/t;", "bitCount", "t0", "u0", "b", "b0", "S0", "K", "", "B0", "(I)B", "", "I0", "(I)S", "F0", "", "G0", "(I)J", "K0", "P0", "N0", "O0", "", "E0", "(I)F", "", "C0", "(I)D", "", "J0", "(I)Ljava/lang/String;", "G", "", "", "u", "(ILjava/lang/Object;)Z", "getData$annotations", "()V", "data", "k", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e
@e1(version = "1.5")
@o2(markerClass = { r.class })
public final class u1 implements Comparable<u1>
{
    public static final int H = 0;
    public static final int I = -1;
    public static final int J = 4;
    public static final int K = 32;
    @org.jetbrains.annotations.e
    public static final a L;
    private final int G = g;
    
    static {
        L = new a(null);
    }
    
    @f
    private static final int A(final int n, final int n2) {
        return m2.d(n, n2);
    }
    
    @f
    private static final int A0(final int n, final short n2) {
        return k(n * k(n2 & 0xFFFF));
    }
    
    @f
    private static final int B(final int n, final short n2) {
        return m2.d(n, k(n2 & 0xFFFF));
    }
    
    @f
    private static final byte B0(final int n) {
        return (byte)n;
    }
    
    @f
    private static final double C0(final int n) {
        return m2.f(n);
    }
    
    @f
    private static final float E0(final int n) {
        return (float)m2.f(n);
    }
    
    @f
    private static final int F0(final int n) {
        return n;
    }
    
    public static int G(final int n) {
        return n;
    }
    
    @f
    private static final long G0(final int n) {
        return (long)n & 0xFFFFFFFFL;
    }
    
    @f
    private static final int I(final int n) {
        return k(n + 1);
    }
    
    @f
    private static final short I0(final int n) {
        return (short)n;
    }
    
    @org.jetbrains.annotations.e
    public static String J0(final int n) {
        return String.valueOf((long)n & 0xFFFFFFFFL);
    }
    
    @f
    private static final int K(final int n) {
        return k(~n);
    }
    
    @f
    private static final byte K0(final int n) {
        return q1.k((byte)n);
    }
    
    @f
    private static final int M(final int n, final byte b) {
        return k(n - k(b & 0xFF));
    }
    
    @f
    private static final int N0(final int n) {
        return n;
    }
    
    @f
    private static final long O(final int n, final long n2) {
        return y1.k(y1.k((long)n & 0xFFFFFFFFL) - n2);
    }
    
    @f
    private static final long O0(final int n) {
        return y1.k((long)n & 0xFFFFFFFFL);
    }
    
    @f
    private static final int P(final int n, final int n2) {
        return k(n - n2);
    }
    
    @f
    private static final short P0(final int n) {
        return e2.k((short)n);
    }
    
    @f
    private static final int Q(final int n, final short n2) {
        return k(n - k(n2 & 0xFFFF));
    }
    
    @f
    private static final int S0(final int n, final int n2) {
        return k(n ^ n2);
    }
    
    @f
    private static final byte T(final int n, final byte b) {
        return q1.k((byte)m2.e(n, k(b & 0xFF)));
    }
    
    @f
    private static final long U(final int n, final long n2) {
        return m2.i(y1.k((long)n & 0xFFFFFFFFL), n2);
    }
    
    @f
    private static final int V(final int n, final int n2) {
        return m2.e(n, n2);
    }
    
    @f
    private static final short a0(final int n, final short n2) {
        return e2.k((short)m2.e(n, k(n2 & 0xFFFF)));
    }
    
    @f
    private static final int b(final int n, final int n2) {
        return k(n & n2);
    }
    
    @f
    private static final int b0(final int n, final int n2) {
        return k(n | n2);
    }
    
    @f
    private static final int c0(final int n, final byte b) {
        return k(n + k(b & 0xFF));
    }
    
    @f
    private static final int f(final int n, final byte b) {
        return m2.c(n, k(b & 0xFF));
    }
    
    @f
    private static final int g(final int n, final long n2) {
        return m2.g(y1.k((long)n & 0xFFFFFFFFL), n2);
    }
    
    @f
    private int h(final int n) {
        return i(this.G, n);
    }
    
    @f
    private static int i(final int n, final int n2) {
        return m2.c(n, n2);
    }
    
    @f
    private static final long i0(final int n, final long n2) {
        return y1.k(y1.k((long)n & 0xFFFFFFFFL) + n2);
    }
    
    @f
    private static final int j(final int n, final short n2) {
        return m2.c(n, k(n2 & 0xFFFF));
    }
    
    @y0
    public static int k(final int n) {
        return n;
    }
    
    @f
    private static final int k0(final int n, final int n2) {
        return k(n + n2);
    }
    
    @f
    private static final int l(final int n) {
        return k(n - 1);
    }
    
    @f
    private static final int l0(final int n, final short n2) {
        return k(n + k(n2 & 0xFFFF));
    }
    
    @f
    private static final int m(final int n, final byte b) {
        return m2.d(n, k(b & 0xFF));
    }
    
    @f
    private static final t n0(final int n, final int n2) {
        return new t(n, n2, null);
    }
    
    @f
    private static final long o(final int n, final long n2) {
        return m2.h(y1.k((long)n & 0xFFFFFFFFL), n2);
    }
    
    @f
    private static final int o0(final int n, final byte b) {
        return m2.e(n, k(b & 0xFF));
    }
    
    @f
    private static final int p(final int n, final int n2) {
        return m2.d(n, n2);
    }
    
    @f
    private static final long q0(final int n, final long n2) {
        return m2.i(y1.k((long)n & 0xFFFFFFFFL), n2);
    }
    
    @f
    private static final int r0(final int n, final int n2) {
        return m2.e(n, n2);
    }
    
    @f
    private static final int s(final int n, final short n2) {
        return m2.d(n, k(n2 & 0xFFFF));
    }
    
    @f
    private static final int s0(final int n, final short n2) {
        return m2.e(n, k(n2 & 0xFFFF));
    }
    
    @f
    private static final int t0(final int n, final int n2) {
        return k(n << n2);
    }
    
    public static boolean u(final int n, final Object o) {
        return o instanceof u1 && n == ((u1)o).R0();
    }
    
    @f
    private static final int u0(final int n, final int n2) {
        return k(n >>> n2);
    }
    
    public static final boolean v(final int n, final int n2) {
        return n == n2;
    }
    
    @f
    private static final int v0(final int n, final byte b) {
        return k(n * k(b & 0xFF));
    }
    
    @f
    private static final long x0(final int n, final long n2) {
        return y1.k(y1.k((long)n & 0xFFFFFFFFL) * n2);
    }
    
    @f
    private static final int y(final int n, final byte b) {
        return m2.d(n, k(b & 0xFF));
    }
    
    @f
    private static final long z(final int n, final long n2) {
        return m2.h(y1.k((long)n & 0xFFFFFFFFL), n2);
    }
    
    @f
    private static final int z0(final int n, final int n2) {
        return k(n * n2);
    }
    
    public final /* synthetic */ int R0() {
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
        return J0(this.G);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000b" }, d2 = { "kotlin/u1$a", "", "Lkotlin/u1;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
