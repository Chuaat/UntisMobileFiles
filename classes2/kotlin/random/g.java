// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.ranges.n;
import kotlin.ranges.k;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0007\u001a\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0014H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0000¨\u0006\u0019" }, d2 = { "", "seed", "Lkotlin/random/f;", "a", "", "b", "Lkotlin/ranges/k;", "range", "h", "Lkotlin/ranges/n;", "i", "value", "g", "bitCount", "j", "from", "until", "Lkotlin/j2;", "e", "f", "", "d", "", "", "c", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class g
{
    @e1(version = "1.3")
    @e
    public static final f a(final int n) {
        return new i(n, n >> 31);
    }
    
    @e1(version = "1.3")
    @e
    public static final f b(final long n) {
        return new i((int)n, (int)(n >> 32));
    }
    
    @e
    public static final String c(@e final Object obj, @e final Object obj2) {
        k0.p(obj, "from");
        k0.p(obj2, "until");
        final StringBuilder sb = new StringBuilder();
        sb.append("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }
    
    public static final void d(final double d, final double d2) {
        if (d2 > d) {
            return;
        }
        throw new IllegalArgumentException(c(d, d2).toString());
    }
    
    public static final void e(final int i, final int j) {
        if (j > i) {
            return;
        }
        throw new IllegalArgumentException(c(i, j).toString());
    }
    
    public static final void f(final long l, final long i) {
        if (i > l) {
            return;
        }
        throw new IllegalArgumentException(c(l, i).toString());
    }
    
    public static final int g(final int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }
    
    @e1(version = "1.3")
    public static final int h(@e final f f, @e final k obj) {
        k0.p(f, "$this$nextInt");
        k0.p(obj, "range");
        if (!obj.isEmpty()) {
            int n;
            if (obj.n() < Integer.MAX_VALUE) {
                n = f.n(obj.k(), obj.n() + 1);
            }
            else if (obj.k() > Integer.MIN_VALUE) {
                n = f.n(obj.k() - 1, obj.n()) + 1;
            }
            else {
                n = f.l();
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot get random in empty range: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.3")
    public static final long i(@e final f f, @e final n obj) {
        k0.p(f, "$this$nextLong");
        k0.p(obj, "range");
        if (!obj.isEmpty()) {
            final long n = obj.n();
            final long k = obj.k();
            long n2;
            if (n < Long.MAX_VALUE) {
                n2 = f.q(k, obj.n() + 1L);
            }
            else if (k > Long.MIN_VALUE) {
                n2 = f.q(obj.k() - 1L, obj.n()) + 1L;
            }
            else {
                n2 = f.o();
            }
            return n2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot get random in empty range: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int j(final int n, final int n2) {
        return n >>> 32 - n2 & -n2 >> 31;
    }
}
