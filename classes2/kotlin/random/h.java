// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.ranges.w;
import kotlin.ranges.t;
import kotlin.o2;
import kotlin.r;
import kotlin.e1;
import kotlin.r1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.y1;
import kotlin.u1;
import kotlin.m2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a&\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0016\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a&\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0015H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001e\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a2\u0010\"\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001cH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\"\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\"\u0010'\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0000\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)" }, d2 = { "Lkotlin/random/f;", "Lkotlin/u1;", "g", "(Lkotlin/random/f;)I", "until", "j", "(Lkotlin/random/f;I)I", "from", "i", "(Lkotlin/random/f;II)I", "Lkotlin/ranges/t;", "range", "h", "(Lkotlin/random/f;Lkotlin/ranges/t;)I", "Lkotlin/y1;", "k", "(Lkotlin/random/f;)J", "m", "(Lkotlin/random/f;J)J", "n", "(Lkotlin/random/f;JJ)J", "Lkotlin/ranges/w;", "l", "(Lkotlin/random/f;Lkotlin/ranges/w;)J", "Lkotlin/r1;", "array", "d", "(Lkotlin/random/f;[B)[B", "", "size", "c", "(Lkotlin/random/f;I)[B", "fromIndex", "toIndex", "e", "(Lkotlin/random/f;[BII)[B", "Lkotlin/j2;", "a", "(II)V", "b", "(JJ)V", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    public static final void a(final int n, final int n2) {
        if (m2.c(n2, n) > 0) {
            return;
        }
        throw new IllegalArgumentException(g.c(u1.d(n), u1.d(n2)).toString());
    }
    
    public static final void b(final long n, final long n2) {
        if (m2.g(n2, n) > 0) {
            return;
        }
        throw new IllegalArgumentException(g.c(y1.d(n), y1.d(n2)).toString());
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final byte[] c(@e final f f, final int n) {
        k0.p(f, "$this$nextUBytes");
        return r1.i(f.d(n));
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final byte[] d(@e final f f, @e final byte[] array) {
        k0.p(f, "$this$nextUBytes");
        k0.p(array, "array");
        f.e(array);
        return array;
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final byte[] e(@e final f f, @e final byte[] array, final int n, final int n2) {
        k0.p(f, "$this$nextUBytes");
        k0.p(array, "array");
        f.f(array, n, n2);
        return array;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int g(@e final f f) {
        k0.p(f, "$this$nextUInt");
        return u1.k(f.l());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int h(@e final f f, @e final t obj) {
        k0.p(f, "$this$nextUInt");
        k0.p(obj, "range");
        if (!obj.isEmpty()) {
            int n;
            if (m2.c(obj.n(), -1) < 0) {
                n = i(f, obj.k(), u1.k(obj.n() + 1));
            }
            else if (m2.c(obj.k(), 0) > 0) {
                n = u1.k(i(f, u1.k(obj.k() - 1), obj.n()) + 1);
            }
            else {
                n = g(f);
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot get random in empty range: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int i(@e final f f, final int n, final int n2) {
        k0.p(f, "$this$nextUInt");
        a(n, n2);
        return u1.k(f.n(n ^ Integer.MIN_VALUE, n2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int j(@e final f f, final int n) {
        k0.p(f, "$this$nextUInt");
        return i(f, 0, n);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long k(@e final f f) {
        k0.p(f, "$this$nextULong");
        return y1.k(f.o());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long l(@e final f f, @e final w obj) {
        k0.p(f, "$this$nextULong");
        k0.p(obj, "range");
        if (!obj.isEmpty()) {
            final int g = m2.g(obj.n(), -1L);
            final long k = obj.k();
            long n;
            if (g < 0) {
                n = n(f, k, y1.k(obj.n() + y1.k((long)1 & 0xFFFFFFFFL)));
            }
            else if (m2.g(k, 0L) > 0) {
                final long i = obj.k();
                final long n2 = (long)1 & 0xFFFFFFFFL;
                n = y1.k(n(f, y1.k(i - y1.k(n2)), obj.n()) + y1.k(n2));
            }
            else {
                n = k(f);
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot get random in empty range: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long m(@e final f f, final long n) {
        k0.p(f, "$this$nextULong");
        return n(f, 0L, n);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long n(@e final f f, final long n, final long n2) {
        k0.p(f, "$this$nextULong");
        b(n, n2);
        return y1.k(f.q(n ^ Long.MIN_VALUE, n2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
