// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.text.c;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import m6.g;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0001\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0001\u001a\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0000H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a" }, d2 = { "", "v1", "v2", "c", "", "g", "Lkotlin/u1;", "d", "(II)I", "e", "Lkotlin/y1;", "h", "(JJ)J", "i", "", "v", "a", "(D)I", "b", "(D)J", "f", "j", "", "k", "base", "l", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "UnsignedKt")
public final class m2
{
    @y0
    public static final int a(final double v) {
        final boolean naN = Double.isNaN(v);
        int k = -1;
        if (!naN && v > f(0)) {
            if (v < f(-1)) {
                final double n = Integer.MAX_VALUE;
                int n2;
                if (v <= n) {
                    n2 = (int)v;
                }
                else {
                    n2 = u1.k((int)(v - n)) + u1.k(Integer.MAX_VALUE);
                }
                k = u1.k(n2);
            }
        }
        else {
            k = 0;
        }
        return k;
    }
    
    @y0
    public static final long b(final double v) {
        final boolean naN = Double.isNaN(v);
        long k = -1L;
        if (!naN && v > j(0L)) {
            if (v < j(-1L)) {
                long n;
                if (v < Long.MAX_VALUE) {
                    n = (long)v;
                }
                else {
                    n = y1.k((long)(v - 9.223372036854776E18)) - Long.MIN_VALUE;
                }
                k = y1.k(n);
            }
        }
        else {
            k = 0L;
        }
        return k;
    }
    
    @y0
    public static final int c(final int n, final int n2) {
        return k0.t(n ^ Integer.MIN_VALUE, n2 ^ Integer.MIN_VALUE);
    }
    
    @y0
    public static final int d(final int n, final int n2) {
        return u1.k((int)(((long)n & 0xFFFFFFFFL) / ((long)n2 & 0xFFFFFFFFL)));
    }
    
    @y0
    public static final int e(final int n, final int n2) {
        return u1.k((int)(((long)n & 0xFFFFFFFFL) % ((long)n2 & 0xFFFFFFFFL)));
    }
    
    @y0
    public static final double f(final int n) {
        return (Integer.MAX_VALUE & n) + (n >>> 31 << 30) * (double)2;
    }
    
    @y0
    public static final int g(final long n, final long n2) {
        return lcmp(n ^ Long.MIN_VALUE, n2 ^ Long.MIN_VALUE);
    }
    
    @y0
    public static final long h(long n, final long n2) {
        if (n2 < 0L) {
            if (g(n, n2) < 0) {
                n = y1.k(0L);
            }
            else {
                n = y1.k(1L);
            }
            return n;
        }
        if (n >= 0L) {
            return y1.k(n / n2);
        }
        boolean b = true;
        final long n3 = (n >>> 1) / n2 << 1;
        if (g(y1.k(n - n3 * n2), y1.k(n2)) < 0) {
            b = false;
        }
        return y1.k(n3 + (long)(b ? 1 : 0));
    }
    
    @y0
    public static final long i(long k, long n) {
        if (n < 0L) {
            if (g(k, n) >= 0) {
                k = y1.k(k - n);
            }
            return k;
        }
        if (k >= 0L) {
            k %= n;
        }
        else {
            k -= ((k >>> 1) / n << 1) * n;
            if (g(y1.k(k), y1.k(n)) < 0) {
                n = 0L;
            }
            k -= n;
        }
        return y1.k(k);
    }
    
    @y0
    public static final double j(final long n) {
        return (n >>> 11) * (double)2048 + (n & 0x7FFL);
    }
    
    @e
    public static final String k(final long n) {
        return l(n, 10);
    }
    
    @e
    public static final String l(long n, final int n2) {
        if (n >= 0L) {
            final String string = Long.toString(n, c.a(n2));
            k0.o(string, "java.lang.Long.toString(this, checkRadix(radix))");
            return string;
        }
        final long n3 = n2;
        final long n4 = (n >>> 1) / n3 << 1;
        final long n5 = n - n4 * n3;
        long i = n4;
        n = n5;
        if (n5 >= n3) {
            n = n5 - n3;
            i = n4 + 1L;
        }
        final StringBuilder sb = new StringBuilder();
        final String string2 = Long.toString(i, c.a(n2));
        k0.o(string2, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(string2);
        final String string3 = Long.toString(n, c.a(n2));
        k0.o(string3, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(string3);
        return sb.toString();
    }
}
