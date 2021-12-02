// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import org.jetbrains.annotations.e;
import kotlin.v1;
import kotlin.f2;
import kotlin.jvm.internal.k0;
import kotlin.r;
import kotlin.m2;
import kotlin.z1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a*\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\t\u001a*\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000e\u001a*\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a*\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f" }, d2 = { "Lkotlin/r1;", "array", "", "left", "right", "b", "([BII)I", "Lkotlin/j2;", "f", "([BII)V", "Lkotlin/f2;", "c", "([SII)I", "g", "([SII)V", "Lkotlin/v1;", "d", "([III)I", "h", "([III)V", "Lkotlin/z1;", "a", "([JII)I", "e", "([JII)V", "fromIndex", "toIndex", "j", "k", "l", "i", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class r1
{
    @r
    private static final int a(final long[] array, int i, int n) {
        final long r = z1.r(array, (i + n) / 2);
        while (i <= n) {
            int n2 = i;
            int n3;
            while (true) {
                n3 = n;
                if (m2.g(z1.r(array, n2), r) >= 0) {
                    break;
                }
                ++n2;
            }
            while (m2.g(z1.r(array, n3), r) > 0) {
                --n3;
            }
            if ((i = n2) <= (n = n3)) {
                final long r2 = z1.r(array, n2);
                z1.B(array, n2, z1.r(array, n3));
                z1.B(array, n3, r2);
                i = n2 + 1;
                n = n3 - 1;
            }
        }
        return i;
    }
    
    @r
    private static final int b(final byte[] array, int i, int n) {
        final byte r = kotlin.r1.r(array, (i + n) / 2);
        while (i <= n) {
            int n2 = i;
            int n3;
            while (true) {
                final byte r2 = kotlin.r1.r(array, n2);
                i = (r & 0xFF);
                n3 = n;
                if (k0.t(r2 & 0xFF, i) >= 0) {
                    break;
                }
                ++n2;
            }
            while (k0.t(kotlin.r1.r(array, n3) & 0xFF, i) > 0) {
                --n3;
            }
            if ((i = n2) <= (n = n3)) {
                final byte r3 = kotlin.r1.r(array, n2);
                kotlin.r1.B(array, n2, kotlin.r1.r(array, n3));
                kotlin.r1.B(array, n3, r3);
                i = n2 + 1;
                n = n3 - 1;
            }
        }
        return i;
    }
    
    @r
    private static final int c(final short[] array, int i, int n) {
        final short r = f2.r(array, (i + n) / 2);
        while (i <= n) {
            int n2 = i;
            int n3;
            while (true) {
                final short r2 = f2.r(array, n2);
                i = (r & 0xFFFF);
                n3 = n;
                if (k0.t(r2 & 0xFFFF, i) >= 0) {
                    break;
                }
                ++n2;
            }
            while (k0.t(f2.r(array, n3) & 0xFFFF, i) > 0) {
                --n3;
            }
            if ((i = n2) <= (n = n3)) {
                final short r3 = f2.r(array, n2);
                f2.B(array, n2, f2.r(array, n3));
                f2.B(array, n3, r3);
                i = n2 + 1;
                n = n3 - 1;
            }
        }
        return i;
    }
    
    @r
    private static final int d(final int[] array, int i, int n) {
        final int r = v1.r(array, (i + n) / 2);
        while (i <= n) {
            int n2 = i;
            int n3;
            while (true) {
                n3 = n;
                if (m2.c(v1.r(array, n2), r) >= 0) {
                    break;
                }
                ++n2;
            }
            while (m2.c(v1.r(array, n3), r) > 0) {
                --n3;
            }
            if ((i = n2) <= (n = n3)) {
                i = v1.r(array, n2);
                v1.B(array, n2, v1.r(array, n3));
                v1.B(array, n3, i);
                i = n2 + 1;
                n = n3 - 1;
            }
        }
        return i;
    }
    
    @r
    private static final void e(final long[] array, final int n, final int n2) {
        final int a = a(array, n, n2);
        final int n3 = a - 1;
        if (n < n3) {
            e(array, n, n3);
        }
        if (a < n2) {
            e(array, a, n2);
        }
    }
    
    @r
    private static final void f(final byte[] array, final int n, final int n2) {
        final int b = b(array, n, n2);
        final int n3 = b - 1;
        if (n < n3) {
            f(array, n, n3);
        }
        if (b < n2) {
            f(array, b, n2);
        }
    }
    
    @r
    private static final void g(final short[] array, final int n, final int n2) {
        final int c = c(array, n, n2);
        final int n3 = c - 1;
        if (n < n3) {
            g(array, n, n3);
        }
        if (c < n2) {
            g(array, c, n2);
        }
    }
    
    @r
    private static final void h(final int[] array, final int n, final int n2) {
        final int d = d(array, n, n2);
        final int n3 = d - 1;
        if (n < n3) {
            h(array, n, n3);
        }
        if (d < n2) {
            h(array, d, n2);
        }
    }
    
    @r
    public static final void i(@e final long[] array, final int n, final int n2) {
        k0.p(array, "array");
        e(array, n, n2 - 1);
    }
    
    @r
    public static final void j(@e final byte[] array, final int n, final int n2) {
        k0.p(array, "array");
        f(array, n, n2 - 1);
    }
    
    @r
    public static final void k(@e final short[] array, final int n, final int n2) {
        k0.p(array, "array");
        g(array, n, n2 - 1);
    }
    
    @r
    public static final void l(@e final int[] array, final int n, final int n2) {
        k0.p(array, "array");
        h(array, n, n2 - 1);
    }
}
