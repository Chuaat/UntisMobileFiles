// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.comparisons;

import kotlin.internal.f;
import org.jetbrains.annotations.e;
import kotlin.m2;
import kotlin.r;
import kotlin.o2;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\"\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\nH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a&\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0015\u001a\u00020\u0014\"\u00020\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\n\u0010\u0015\u001a\u00020\u0018\"\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a&\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\n\u0010\u0015\u001a\u00020\u001b\"\u00020\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a&\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\n\u0010\u0015\u001a\u00020\u001e\"\u00020\nH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\"\u0010!\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\u0003\u001a\"\u0010\"\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010\u0006\u001a\"\u0010#\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010\t\u001a\"\u0010$\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010\u000b\u001a+\u0010%\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010\r\u001a+\u0010&\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010\u000f\u001a+\u0010'\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010\u0011\u001a+\u0010(\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\nH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010\u0013\u001a&\u0010)\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0015\u001a\u00020\u0014\"\u00020\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010\u0017\u001a&\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\n\u0010\u0015\u001a\u00020\u0018\"\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010\u001a\u001a&\u0010+\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\n\u0010\u0015\u001a\u00020\u001b\"\u00020\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010\u001d\u001a&\u0010,\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\n\u0010\u0015\u001a\u00020\u001e\"\u00020\nH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-" }, d2 = { "Lkotlin/u1;", "a", "b", "(II)I", "Lkotlin/y1;", "j", "(JJ)J", "Lkotlin/q1;", "c", "(BB)B", "Lkotlin/e2;", "(SS)S", "g", "(III)I", "k", "(JJJ)J", "i", "(BBB)B", "f", "(SSS)S", "Lkotlin/v1;", "other", "d", "(I[I)I", "Lkotlin/z1;", "e", "(J[J)J", "Lkotlin/r1;", "h", "(B[B)B", "Lkotlin/f2;", "l", "(S[S)S", "n", "v", "o", "m", "s", "w", "u", "r", "p", "q", "t", "x", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/comparisons/UComparisonsKt")
class i
{
    public i() {
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final short a(final short n, final short n2) {
        short n3;
        if (k0.t(n & 0xFFFF, 0xFFFF & n2) >= 0) {
            n3 = n;
        }
        else {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static int b(int n, final int n2) {
        if (m2.c(n, n2) < 0) {
            n = n2;
        }
        return n;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final byte c(final byte b, final byte b2) {
        byte b3;
        if (k0.t(b & 0xFF, b2 & 0xFF) >= 0) {
            b3 = b;
        }
        else {
            b3 = b2;
        }
        return b3;
    }
    
    @e1(version = "1.4")
    @r
    public static final int d(int b, @e final int... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            b = h.b(b, array[i]);
        }
        return b;
    }
    
    @e1(version = "1.4")
    @r
    public static final long e(long j, @e final long... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            j = h.j(j, array[i]);
        }
        return j;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final short f(final short n, final short n2, final short n3) {
        return a(n, a(n2, n3));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final int g(final int n, final int n2, final int n3) {
        return h.b(n, h.b(n2, n3));
    }
    
    @e1(version = "1.4")
    @r
    public static final byte h(final byte b, @e final byte... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n = 0;
        byte b2 = b;
        byte c;
        for (int i = n; i < length; ++i, b2 = c) {
            c = c(b2, array[i]);
        }
        return b2;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final byte i(final byte b, final byte b2, final byte b3) {
        return c(b, c(b2, b3));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static long j(long n, final long n2) {
        if (m2.g(n, n2) < 0) {
            n = n2;
        }
        return n;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final long k(final long n, final long n2, final long n3) {
        return h.j(n, h.j(n2, n3));
    }
    
    @e1(version = "1.4")
    @r
    public static final short l(final short n, @e final short... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n2 = 0;
        short n3 = n;
        short a;
        for (int i = n2; i < length; ++i, n3 = a) {
            a = a(n3, array[i]);
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final short m(final short n, final short n2) {
        short n3;
        if (k0.t(n & 0xFFFF, 0xFFFF & n2) <= 0) {
            n3 = n;
        }
        else {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static int n(int n, final int n2) {
        if (m2.c(n, n2) > 0) {
            n = n2;
        }
        return n;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final byte o(final byte b, final byte b2) {
        byte b3;
        if (k0.t(b & 0xFF, b2 & 0xFF) <= 0) {
            b3 = b;
        }
        else {
            b3 = b2;
        }
        return b3;
    }
    
    @e1(version = "1.4")
    @r
    public static final int p(int i, @e final int... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n = 0;
        int n2 = i;
        for (i = n; i < length; ++i) {
            n2 = h.n(n2, array[i]);
        }
        return n2;
    }
    
    @e1(version = "1.4")
    @r
    public static final long q(long v, @e final long... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            v = h.v(v, array[i]);
        }
        return v;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final short r(final short n, final short n2, final short n3) {
        return m(n, m(n2, n3));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final int s(final int n, final int n2, final int n3) {
        return h.n(n, h.n(n2, n3));
    }
    
    @e1(version = "1.4")
    @r
    public static final byte t(final byte b, @e final byte... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n = 0;
        byte b2 = b;
        byte o;
        for (int i = n; i < length; ++i, b2 = o) {
            o = o(b2, array[i]);
        }
        return b2;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final byte u(final byte b, final byte b2, final byte b3) {
        return o(b, o(b2, b3));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static long v(long n, final long n2) {
        if (m2.g(n, n2) > 0) {
            n = n2;
        }
        return n;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { r.class })
    private static final long w(final long n, final long n2, final long n3) {
        return h.v(n, h.v(n2, n3));
    }
    
    @e1(version = "1.4")
    @r
    public static final short x(final short n, @e final short... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n2 = 0;
        short n3 = n;
        short m;
        for (int i = n2; i < length; ++i, n3 = m) {
            m = m(n3, array[i]);
        }
        return n3;
    }
}
