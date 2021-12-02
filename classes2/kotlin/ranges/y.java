// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.q1;
import kotlin.e2;
import kotlin.m2;
import kotlin.y1;
import kotlin.q;
import kotlin.u1;
import java.util.NoSuchElementException;
import kotlin.random.h;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.r;
import kotlin.o2;
import kotlin.e1;
import kotlin.random.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u001a\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0087\b\u00f8\u0001\u0000\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007\u00f8\u0001\u0000\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0013*\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010 \u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\"H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\"H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010)\u001a\u00020(*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010+\u001a\u00020(*\u00020\u00012\u0006\u0010'\u001a\u00020\u0001H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010.\u001a\u00020-*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020(*\u00020\"2\u0006\u0010'\u001a\u00020\"H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020(*\u00020(H\u0007\u001a\f\u00103\u001a\u00020-*\u00020-H\u0007\u001a\u0015\u00106\u001a\u00020(*\u00020(2\u0006\u00105\u001a\u000204H\u0087\u0004\u001a\u0015\u00108\u001a\u00020-*\u00020-2\u0006\u00105\u001a\u000207H\u0087\u0004\u001a\u001f\u00109\u001a\u00020\u0000*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u001f\u0010;\u001a\u00020\u0000*\u00020\u00012\u0006\u0010'\u001a\u00020\u0001H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u00020\u0004*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010?\u001a\u00020\u0000*\u00020\"2\u0006\u0010'\u001a\u00020\"H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001e\u0010B\u001a\u00020\u0001*\u00020\u00012\u0006\u0010A\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001e\u0010D\u001a\u00020\u0005*\u00020\u00052\u0006\u0010A\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a\u001e\u0010F\u001a\u00020\u0018*\u00020\u00182\u0006\u0010A\u001a\u00020\u0018H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a\u001e\u0010H\u001a\u00020\"*\u00020\"2\u0006\u0010A\u001a\u00020\"H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a\u001e\u0010K\u001a\u00020\u0001*\u00020\u00012\u0006\u0010J\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bK\u0010C\u001a\u001e\u0010L\u001a\u00020\u0005*\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bL\u0010E\u001a\u001e\u0010M\u001a\u00020\u0018*\u00020\u00182\u0006\u0010J\u001a\u00020\u0018H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bM\u0010G\u001a\u001e\u0010N\u001a\u00020\"*\u00020\"2\u0006\u0010J\u001a\u00020\"H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a&\u0010O\u001a\u00020\u0001*\u00020\u00012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010J\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a&\u0010Q\u001a\u00020\u0005*\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a&\u0010S\u001a\u00020\u0018*\u00020\u00182\u0006\u0010A\u001a\u00020\u00182\u0006\u0010J\u001a\u00020\u0018H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a&\u0010U\u001a\u00020\"*\u00020\"2\u0006\u0010A\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"H\u0007\u00f8\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a$\u0010Y\u001a\u00020\u0001*\u00020\u00012\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00010WH\u0007\u00f8\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a$\u0010[\u001a\u00020\u0005*\u00020\u00052\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050WH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]" }, d2 = { "Lkotlin/ranges/t;", "Lkotlin/u1;", "A", "(Lkotlin/ranges/t;)I", "Lkotlin/ranges/w;", "Lkotlin/y1;", "C", "(Lkotlin/ranges/w;)J", "Lkotlin/random/f;", "random", "B", "(Lkotlin/ranges/t;Lkotlin/random/f;)I", "D", "(Lkotlin/ranges/w;Lkotlin/random/f;)J", "E", "G", "F", "H", "element", "", "t", "(Lkotlin/ranges/t;Lkotlin/u1;)Z", "p", "(Lkotlin/ranges/w;Lkotlin/y1;)Z", "Lkotlin/q1;", "value", "o", "(Lkotlin/ranges/t;B)Z", "r", "(Lkotlin/ranges/w;B)Z", "q", "(Lkotlin/ranges/w;I)Z", "u", "(Lkotlin/ranges/t;J)Z", "Lkotlin/e2;", "s", "(Lkotlin/ranges/t;S)Z", "v", "(Lkotlin/ranges/w;S)Z", "to", "Lkotlin/ranges/r;", "y", "(BB)Lkotlin/ranges/r;", "x", "(II)Lkotlin/ranges/r;", "Lkotlin/ranges/u;", "z", "(JJ)Lkotlin/ranges/u;", "w", "(SS)Lkotlin/ranges/r;", "I", "J", "", "step", "K", "", "L", "O", "(BB)Lkotlin/ranges/t;", "N", "(II)Lkotlin/ranges/t;", "P", "(JJ)Lkotlin/ranges/w;", "M", "(SS)Lkotlin/ranges/t;", "minimumValue", "b", "(II)I", "d", "(JJ)J", "c", "(BB)B", "a", "(SS)S", "maximumValue", "f", "h", "g", "e", "k", "(III)I", "m", "(JJJ)J", "l", "(BBB)B", "j", "(SSS)S", "Lkotlin/ranges/g;", "range", "n", "(ILkotlin/ranges/g;)I", "i", "(JLkotlin/ranges/g;)J", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/ranges/URangesKt")
class y
{
    public y() {
    }
    
    @e1(version = "1.5")
    @kotlin.internal.f
    @o2(markerClass = { r.class })
    private static final int A(final t t) {
        return B(t, f.H);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int B(@e final t t, @e final f f) {
        k0.p(t, "$this$random");
        k0.p(f, "random");
        try {
            return h.h(f, t);
        }
        catch (IllegalArgumentException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @e1(version = "1.5")
    @kotlin.internal.f
    @o2(markerClass = { r.class })
    private static final long C(final w w) {
        return D(w, f.H);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long D(@e final w w, @e final f f) {
        k0.p(w, "$this$random");
        k0.p(f, "random");
        try {
            return h.l(f, w);
        }
        catch (IllegalArgumentException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @e1(version = "1.5")
    @kotlin.internal.f
    @o2(markerClass = { q.class, r.class })
    private static final u1 E(final t t) {
        return F(t, f.H);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class, r.class })
    @org.jetbrains.annotations.f
    public static final u1 F(@e final t t, @e final f f) {
        k0.p(t, "$this$randomOrNull");
        k0.p(f, "random");
        if (t.isEmpty()) {
            return null;
        }
        return u1.d(h.h(f, t));
    }
    
    @e1(version = "1.5")
    @kotlin.internal.f
    @o2(markerClass = { q.class, r.class })
    private static final y1 G(final w w) {
        return H(w, f.H);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class, r.class })
    @org.jetbrains.annotations.f
    public static final y1 H(@e final w w, @e final f f) {
        k0.p(w, "$this$randomOrNull");
        k0.p(f, "random");
        if (w.isEmpty()) {
            return null;
        }
        return y1.d(h.l(f, w));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final kotlin.ranges.r I(@e final kotlin.ranges.r r) {
        k0.p(r, "$this$reversed");
        return r.J.a(r.n(), r.k(), -r.o());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final u J(@e final u u) {
        k0.p(u, "$this$reversed");
        return u.J.a(u.n(), u.k(), -u.o());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final kotlin.ranges.r K(@e final kotlin.ranges.r r, int i) {
        k0.p(r, "$this$step");
        p.a(i > 0, i);
        final kotlin.ranges.r.a j = r.J;
        final int k = r.k();
        final int n = r.n();
        if (r.o() <= 0) {
            i = -i;
        }
        return j.a(k, n, i);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final u L(@e final u u, long l) {
        k0.p(u, "$this$step");
        p.a(l > 0L, l);
        final u.a j = u.J;
        final long k = u.k();
        final long n = u.n();
        if (u.o() <= 0L) {
            l = -l;
        }
        return j.a(k, n, l);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final t M(final short n, final short n2) {
        final int n3 = n2 & 0xFFFF;
        if (k0.t(n3, 0) <= 0) {
            return t.L.a();
        }
        return new t(u1.k(n & 0xFFFF), u1.k(u1.k(n3) - 1), null);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final t N(final int n, final int n2) {
        if (m2.c(n2, 0) <= 0) {
            return t.L.a();
        }
        return new t(n, u1.k(n2 - 1), null);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final t O(final byte b, final byte b2) {
        final int n = b2 & 0xFF;
        if (k0.t(n, 0) <= 0) {
            return t.L.a();
        }
        return new t(u1.k(b & 0xFF), u1.k(u1.k(n) - 1), null);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final w P(final long n, final long n2) {
        if (m2.g(n2, 0L) <= 0) {
            return w.L.a();
        }
        return new w(n, y1.k(n2 - y1.k((long)1 & 0xFFFFFFFFL)), null);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final short a(final short n, final short n2) {
        short n3 = n;
        if (k0.t(n & 0xFFFF, 0xFFFF & n2) < 0) {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int b(final int n, final int n2) {
        int n3 = n;
        if (m2.c(n, n2) < 0) {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final byte c(final byte b, final byte b2) {
        byte b3 = b;
        if (k0.t(b & 0xFF, b2 & 0xFF) < 0) {
            b3 = b2;
        }
        return b3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long d(final long n, final long n2) {
        long n3 = n;
        if (m2.g(n, n2) < 0) {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final short e(final short n, final short n2) {
        short n3 = n;
        if (k0.t(n & 0xFFFF, 0xFFFF & n2) > 0) {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int f(final int n, final int n2) {
        int n3 = n;
        if (m2.c(n, n2) > 0) {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final byte g(final byte b, final byte b2) {
        byte b3 = b;
        if (k0.t(b & 0xFF, b2 & 0xFF) > 0) {
            b3 = b2;
        }
        return b3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long h(final long n, final long n2) {
        long n3 = n;
        if (m2.g(n, n2) > 0) {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long i(final long n, @e final g<y1> obj) {
        k0.p(obj, "range");
        if (obj instanceof kotlin.ranges.f) {
            return kotlin.ranges.q.G(y1.d(n), (kotlin.ranges.f<y1>)obj).R0();
        }
        if (!obj.isEmpty()) {
            y1 y1;
            if (m2.g(n, obj.b().R0()) < 0) {
                y1 = obj.b();
            }
            else {
                final long r0 = n;
                if (m2.g(n, obj.i().R0()) <= 0) {
                    return r0;
                }
                y1 = obj.i();
            }
            return y1.R0();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final short j(final short n, final short n2, final short n3) {
        final int n4 = n2 & 0xFFFF;
        final int n5 = n3 & 0xFFFF;
        if (k0.t(n4, n5) > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(e2.G0(n3));
            sb.append(" is less than minimum ");
            sb.append(e2.G0(n2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        final int n6 = 0xFFFF & n;
        if (k0.t(n6, n4) < 0) {
            return n2;
        }
        if (k0.t(n6, n5) > 0) {
            return n3;
        }
        return n;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int k(final int n, final int n2, final int n3) {
        if (m2.c(n2, n3) > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(u1.J0(n3));
            sb.append(" is less than minimum ");
            sb.append(u1.J0(n2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (m2.c(n, n2) < 0) {
            return n2;
        }
        if (m2.c(n, n3) > 0) {
            return n3;
        }
        return n;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final byte l(final byte b, final byte b2, final byte b3) {
        final int n = b2 & 0xFF;
        final int n2 = b3 & 0xFF;
        if (k0.t(n, n2) > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(q1.G0(b3));
            sb.append(" is less than minimum ");
            sb.append(q1.G0(b2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        final int n3 = b & 0xFF;
        if (k0.t(n3, n) < 0) {
            return b2;
        }
        if (k0.t(n3, n2) > 0) {
            return b3;
        }
        return b;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long m(final long n, final long n2, final long n3) {
        if (m2.g(n2, n3) > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(y1.J0(n3));
            sb.append(" is less than minimum ");
            sb.append(y1.J0(n2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (m2.g(n, n2) < 0) {
            return n2;
        }
        if (m2.g(n, n3) > 0) {
            return n3;
        }
        return n;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int n(final int n, @e final g<u1> obj) {
        k0.p(obj, "range");
        if (obj instanceof kotlin.ranges.f) {
            return kotlin.ranges.q.G(u1.d(n), (kotlin.ranges.f<u1>)obj).R0();
        }
        if (!obj.isEmpty()) {
            u1 u1;
            if (m2.c(n, obj.b().R0()) < 0) {
                u1 = obj.b();
            }
            else {
                final int r0 = n;
                if (m2.c(n, obj.i().R0()) <= 0) {
                    return r0;
                }
                u1 = obj.i();
            }
            return u1.R0();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final boolean o(@e final t t, final byte b) {
        k0.p(t, "$this$contains");
        return t.q(u1.k(b & 0xFF));
    }
    
    @e1(version = "1.5")
    @kotlin.internal.f
    @o2(markerClass = { r.class })
    private static final boolean p(final w w, final y1 y1) {
        k0.p(w, "$this$contains");
        return y1 != null && w.q(y1.R0());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final boolean q(@e final w w, final int n) {
        k0.p(w, "$this$contains");
        return w.q(y1.k((long)n & 0xFFFFFFFFL));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final boolean r(@e final w w, final byte b) {
        k0.p(w, "$this$contains");
        return w.q(y1.k((long)b & 0xFFL));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final boolean s(@e final t t, final short n) {
        k0.p(t, "$this$contains");
        return t.q(u1.k(n & 0xFFFF));
    }
    
    @e1(version = "1.5")
    @kotlin.internal.f
    @o2(markerClass = { r.class })
    private static final boolean t(final t t, final u1 u1) {
        k0.p(t, "$this$contains");
        return u1 != null && t.q(u1.R0());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final boolean u(@e final t t, final long n) {
        k0.p(t, "$this$contains");
        return y1.k(n >>> 32) == 0L && t.q(u1.k((int)n));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final boolean v(@e final w w, final short n) {
        k0.p(w, "$this$contains");
        return w.q(y1.k((long)n & 0xFFFFL));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final kotlin.ranges.r w(final short n, final short n2) {
        return kotlin.ranges.r.J.a(u1.k(n & 0xFFFF), u1.k(n2 & 0xFFFF), -1);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final kotlin.ranges.r x(final int n, final int n2) {
        return kotlin.ranges.r.J.a(n, n2, -1);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final kotlin.ranges.r y(final byte b, final byte b2) {
        return kotlin.ranges.r.J.a(u1.k(b & 0xFF), u1.k(b2 & 0xFF), -1);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final u z(final long n, final long n2) {
        return u.J.a(n, n2, -1L);
    }
}
