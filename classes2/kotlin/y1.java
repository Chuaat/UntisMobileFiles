// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.f;
import kotlin.jvm.internal.w;
import m6.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001`B\u0014\b\u0001\u0012\u0006\u0010]\u001a\u00020F\u00f8\u0001\u0000¢\u0006\u0004\b^\u00102J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\n\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\u001b\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0012J\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0014J\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0012J\u001b\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0014J\u001b\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u001b\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0010J\u001b\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b \u0010\u0012J\u001b\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\u0014J\u001b\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010\u0016J\u001b\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010\u0010J\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010\u0012J\u001b\u0010%\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010\u0014J\u001b\u0010&\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010\u0016J\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010)\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010\u0014J\u001b\u0010*\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010\u0016J\u001b\u0010+\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b/\u0010\fJ\u001b\u00100\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b0\u0010\u0016J\u0016\u00101\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b3\u00102J\u001b\u00105\u001a\u0002042\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b5\u00106J\u001e\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0004H\u0087\f\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b8\u0010\u0014J\u001e\u00109\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0004H\u0087\f\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b9\u0010\u0014J\u001b\u0010:\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b:\u0010\u0016J\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010\u0016J\u001b\u0010<\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010\u0016J\u0016\u0010=\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b=\u00102J\u0010\u0010?\u001a\u00020>H\u0087\b¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AH\u0087\b¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001a\u00020FH\u0087\b¢\u0006\u0004\bG\u00102J\u0016\u0010H\u001a\u00020\u0002H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bH\u0010@J\u0016\u0010I\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bI\u0010CJ\u0016\u0010J\u001a\u00020\nH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bJ\u0010EJ\u0016\u0010K\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\bK\u00102J\u0010\u0010M\u001a\u00020LH\u0087\b¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0004H\u00d6\u0001¢\u0006\u0004\bU\u0010EJ\u001a\u0010X\u001a\u00020W2\b\u0010\u0003\u001a\u0004\u0018\u00010VH\u00d6\u0003¢\u0006\u0004\bX\u0010YR\u001c\u0010]\u001a\u00020F8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\bU\u0010Z\u0012\u0004\b[\u0010\\\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006a" }, d2 = { "Lkotlin/y1;", "", "Lkotlin/q1;", "other", "", "f", "(JB)I", "Lkotlin/e2;", "j", "(JS)I", "Lkotlin/u1;", "i", "(JI)I", "h", "(JJ)I", "c0", "(JB)J", "l0", "(JS)J", "k0", "(JI)J", "i0", "(JJ)J", "M", "Q", "P", "O", "v0", "A0", "z0", "x0", "m", "s", "p", "o", "o0", "s0", "r0", "q0", "y", "B", "A", "z", "T", "(JB)B", "a0", "(JS)S", "V", "U", "I", "(J)J", "l", "Lkotlin/ranges/w;", "n0", "(JJ)Lkotlin/ranges/w;", "bitCount", "t0", "u0", "b", "b0", "S0", "K", "", "B0", "(J)B", "", "I0", "(J)S", "F0", "(J)I", "", "G0", "K0", "P0", "N0", "O0", "", "E0", "(J)F", "", "C0", "(J)D", "", "J0", "(J)Ljava/lang/String;", "G", "", "", "u", "(JLjava/lang/Object;)Z", "J", "getData$annotations", "()V", "data", "k", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e
@e1(version = "1.5")
@o2(markerClass = { r.class })
public final class y1 implements Comparable<y1>
{
    public static final long H = 0L;
    public static final long I = -1L;
    public static final int J = 8;
    public static final int K = 64;
    @org.jetbrains.annotations.e
    public static final a L;
    private final long G = g;
    
    static {
        L = new a(null);
    }
    
    @f
    private static final long A(final long n, final int n2) {
        return m2.h(n, k((long)n2 & 0xFFFFFFFFL));
    }
    
    @f
    private static final long A0(final long n, final short n2) {
        return k(n * k((long)n2 & 0xFFFFL));
    }
    
    @f
    private static final long B(final long n, final short n2) {
        return m2.h(n, k((long)n2 & 0xFFFFL));
    }
    
    @f
    private static final byte B0(final long n) {
        return (byte)n;
    }
    
    @f
    private static final double C0(final long n) {
        return m2.j(n);
    }
    
    @f
    private static final float E0(final long n) {
        return (float)m2.j(n);
    }
    
    @f
    private static final int F0(final long n) {
        return (int)n;
    }
    
    public static int G(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    @f
    private static final long G0(final long n) {
        return n;
    }
    
    @f
    private static final long I(final long n) {
        return k(n + 1L);
    }
    
    @f
    private static final short I0(final long n) {
        return (short)n;
    }
    
    @org.jetbrains.annotations.e
    public static String J0(final long n) {
        return m2.k(n);
    }
    
    @f
    private static final long K(final long n) {
        return k(~n);
    }
    
    @f
    private static final byte K0(final long n) {
        return q1.k((byte)n);
    }
    
    @f
    private static final long M(final long n, final byte b) {
        return k(n - k((long)b & 0xFFL));
    }
    
    @f
    private static final int N0(final long n) {
        return u1.k((int)n);
    }
    
    @f
    private static final long O(final long n, final long n2) {
        return k(n - n2);
    }
    
    @f
    private static final long O0(final long n) {
        return n;
    }
    
    @f
    private static final long P(final long n, final int n2) {
        return k(n - k((long)n2 & 0xFFFFFFFFL));
    }
    
    @f
    private static final short P0(final long n) {
        return e2.k((short)n);
    }
    
    @f
    private static final long Q(final long n, final short n2) {
        return k(n - k((long)n2 & 0xFFFFL));
    }
    
    @f
    private static final long S0(final long n, final long n2) {
        return k(n ^ n2);
    }
    
    @f
    private static final byte T(final long n, final byte b) {
        return q1.k((byte)m2.i(n, k((long)b & 0xFFL)));
    }
    
    @f
    private static final long U(final long n, final long n2) {
        return m2.i(n, n2);
    }
    
    @f
    private static final int V(final long n, final int n2) {
        return u1.k((int)m2.i(n, k((long)n2 & 0xFFFFFFFFL)));
    }
    
    @f
    private static final short a0(final long n, final short n2) {
        return e2.k((short)m2.i(n, k((long)n2 & 0xFFFFL)));
    }
    
    @f
    private static final long b(final long n, final long n2) {
        return k(n & n2);
    }
    
    @f
    private static final long b0(final long n, final long n2) {
        return k(n | n2);
    }
    
    @f
    private static final long c0(final long n, final byte b) {
        return k(n + k((long)b & 0xFFL));
    }
    
    @f
    private static final int f(final long n, final byte b) {
        return m2.g(n, k((long)b & 0xFFL));
    }
    
    @f
    private int g(final long n) {
        return h(this.G, n);
    }
    
    @f
    private static int h(final long n, final long n2) {
        return m2.g(n, n2);
    }
    
    @f
    private static final int i(final long n, final int n2) {
        return m2.g(n, k((long)n2 & 0xFFFFFFFFL));
    }
    
    @f
    private static final long i0(final long n, final long n2) {
        return k(n + n2);
    }
    
    @f
    private static final int j(final long n, final short n2) {
        return m2.g(n, k((long)n2 & 0xFFFFL));
    }
    
    @y0
    public static long k(final long n) {
        return n;
    }
    
    @f
    private static final long k0(final long n, final int n2) {
        return k(n + k((long)n2 & 0xFFFFFFFFL));
    }
    
    @f
    private static final long l(final long n) {
        return k(n - 1L);
    }
    
    @f
    private static final long l0(final long n, final short n2) {
        return k(n + k((long)n2 & 0xFFFFL));
    }
    
    @f
    private static final long m(final long n, final byte b) {
        return m2.h(n, k((long)b & 0xFFL));
    }
    
    @f
    private static final kotlin.ranges.w n0(final long n, final long n2) {
        return new kotlin.ranges.w(n, n2, null);
    }
    
    @f
    private static final long o(final long n, final long n2) {
        return m2.h(n, n2);
    }
    
    @f
    private static final long o0(final long n, final byte b) {
        return m2.i(n, k((long)b & 0xFFL));
    }
    
    @f
    private static final long p(final long n, final int n2) {
        return m2.h(n, k((long)n2 & 0xFFFFFFFFL));
    }
    
    @f
    private static final long q0(final long n, final long n2) {
        return m2.i(n, n2);
    }
    
    @f
    private static final long r0(final long n, final int n2) {
        return m2.i(n, k((long)n2 & 0xFFFFFFFFL));
    }
    
    @f
    private static final long s(final long n, final short n2) {
        return m2.h(n, k((long)n2 & 0xFFFFL));
    }
    
    @f
    private static final long s0(final long n, final short n2) {
        return m2.i(n, k((long)n2 & 0xFFFFL));
    }
    
    @f
    private static final long t0(final long n, final int n2) {
        return k(n << n2);
    }
    
    public static boolean u(final long n, final Object o) {
        return o instanceof y1 && n == ((y1)o).R0();
    }
    
    @f
    private static final long u0(final long n, final int n2) {
        return k(n >>> n2);
    }
    
    public static final boolean v(final long n, final long n2) {
        return n == n2;
    }
    
    @f
    private static final long v0(final long n, final byte b) {
        return k(n * k((long)b & 0xFFL));
    }
    
    @f
    private static final long x0(final long n, final long n2) {
        return k(n * n2);
    }
    
    @f
    private static final long y(final long n, final byte b) {
        return m2.h(n, k((long)b & 0xFFL));
    }
    
    @f
    private static final long z(final long n, final long n2) {
        return m2.h(n, n2);
    }
    
    @f
    private static final long z0(final long n, final int n2) {
        return k(n * k((long)n2 & 0xFFFFFFFFL));
    }
    
    public final /* synthetic */ long R0() {
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
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f" }, d2 = { "kotlin/y1$a", "", "Lkotlin/y1;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
