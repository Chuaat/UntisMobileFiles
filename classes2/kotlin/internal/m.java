// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.internal;

import kotlin.y0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0002\u001a \u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002\u001a \u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0001\u001a \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0001¨\u0006\u000b" }, d2 = { "", "a", "b", "e", "", "f", "c", "start", "end", "step", "d", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class m
{
    private static final int a(final int n, final int n2, final int n3) {
        return e(e(n, n3) - e(n2, n3), n3);
    }
    
    private static final long b(final long n, final long n2, final long n3) {
        return f(f(n, n3) - f(n2, n3), n3);
    }
    
    @y0
    public static final int c(final int n, int n2, final int n3) {
        if (n3 > 0) {
            if (n < n2) {
                n2 -= a(n2, n, n3);
            }
        }
        else {
            if (n3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (n > n2) {
                n2 += a(n, n2, -n3);
            }
        }
        return n2;
    }
    
    @y0
    public static final long d(final long n, long n2, final long n3) {
        final long n4 = lcmp(n3, 0L);
        if (n4 > 0) {
            if (n < n2) {
                n2 -= b(n2, n, n3);
            }
        }
        else {
            if (n4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (n > n2) {
                n2 += b(n, n2, -n3);
            }
        }
        return n2;
    }
    
    private static final int e(int n, final int n2) {
        n %= n2;
        if (n < 0) {
            n += n2;
        }
        return n;
    }
    
    private static final long f(long n, final long n2) {
        n %= n2;
        if (n < 0L) {
            n += n2;
        }
        return n;
    }
}
