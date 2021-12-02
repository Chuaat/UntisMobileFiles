// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.internal;

import kotlin.y0;
import kotlin.e1;
import kotlin.y1;
import kotlin.u1;
import kotlin.m2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a*\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0004\u001a*\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a*\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004\u001a*\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "Lkotlin/u1;", "a", "b", "c", "(III)I", "Lkotlin/y1;", "(JJJ)J", "start", "end", "", "step", "d", "", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class q
{
    private static final int a(int n, int c, final int n2) {
        n = m2.e(n, n2);
        final int e = m2.e(c, n2);
        c = m2.c(n, e);
        n = u1.k(n - e);
        if (c < 0) {
            n = u1.k(n + n2);
        }
        return n;
    }
    
    private static final long b(long n, long i, final long n2) {
        n = m2.i(n, n2);
        i = m2.i(i, n2);
        final int g = m2.g(n, i);
        n = y1.k(n - i);
        if (g < 0) {
            n = y1.k(n + n2);
        }
        return n;
    }
    
    @e1(version = "1.3")
    @y0
    public static final long c(long n, long k, final long n2) {
        final long n3 = lcmp(n2, 0L);
        if (n3 > 0) {
            if (m2.g(n, k) >= 0) {
                return k;
            }
            n = k - b(k, n, y1.k(n2));
        }
        else {
            if (n3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (m2.g(n, k) <= 0) {
                return k;
            }
            n = k + b(n, k, y1.k(-n2));
        }
        k = y1.k(n);
        return k;
    }
    
    @e1(version = "1.3")
    @y0
    public static final int d(int n, int k, final int n2) {
        if (n2 > 0) {
            if (m2.c(n, k) >= 0) {
                return k;
            }
            n = k - a(k, n, u1.k(n2));
        }
        else {
            if (n2 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (m2.c(n, k) <= 0) {
                return k;
            }
            n = k + a(n, k, u1.k(-n2));
        }
        k = u1.k(n);
        return k;
    }
}
