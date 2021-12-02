// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.e2;
import kotlin.y1;
import kotlin.u1;
import org.jetbrains.annotations.f;
import kotlin.q1;
import kotlin.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.r;
import kotlin.o2;
import kotlin.e1;
import kotlin.m2;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0016\u0010\u000f\u001a\u00020\u0000*\u00020\u0003H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0011\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0006*\u00020\u0003H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0016\u0010\u0017\u001a\u00020\t*\u00020\u0003H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0016\u0010\u001b\u001a\u00020\f*\u00020\u0003H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0000*\u00020\u0003H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010 \u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000\u001a\u0011\u0010!\u001a\u0004\u0018\u00010\u0006*\u00020\u0003H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000\u001a\u0011\u0010#\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010$\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000\u001a\u0011\u0010%\u001a\u0004\u0018\u00010\f*\u00020\u0003H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010&\u001a\u0004\u0018\u00010\f*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'" }, d2 = { "Lkotlin/q1;", "", "radix", "", "b", "(BI)Ljava/lang/String;", "Lkotlin/e2;", "d", "(SI)Ljava/lang/String;", "Lkotlin/u1;", "c", "(II)Ljava/lang/String;", "Lkotlin/y1;", "a", "(JI)Ljava/lang/String;", "e", "(Ljava/lang/String;)B", "f", "(Ljava/lang/String;I)B", "q", "(Ljava/lang/String;)S", "r", "(Ljava/lang/String;I)S", "i", "(Ljava/lang/String;)I", "j", "(Ljava/lang/String;I)I", "m", "(Ljava/lang/String;)J", "n", "(Ljava/lang/String;I)J", "g", "h", "s", "t", "k", "l", "o", "p", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "UStringsKt")
public final class i0
{
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final String a(final long n, final int n2) {
        return m2.l(n, c.a(n2));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final String b(final byte b, final int n) {
        final String string = Integer.toString(b & 0xFF, c.a(n));
        k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final String c(final int n, final int n2) {
        final String string = Long.toString((long)n & 0xFFFFFFFFL, c.a(n2));
        k0.o((Object)string, "java.lang.Long.toString(this, checkRadix(radix))");
        return string;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @e
    public static final String d(final short n, final int n2) {
        final String string = Integer.toString(n & 0xFFFF, c.a(n2));
        k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final byte e(@e final String s) {
        k0.p((Object)s, "$this$toUByte");
        final q1 g = g(s);
        if (g != null) {
            return g.O0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final byte f(@e final String s, final int n) {
        k0.p((Object)s, "$this$toUByte");
        final q1 h = h(s, n);
        if (h != null) {
            return h.O0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final q1 g(@e final String s) {
        k0.p((Object)s, "$this$toUByteOrNull");
        return h(s, 10);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final q1 h(@e final String s, int r0) {
        k0.p((Object)s, "$this$toUByteOrNull");
        final u1 l = l(s, r0);
        if (l == null) {
            return null;
        }
        r0 = l.R0();
        if (m2.c(r0, u1.k(255)) > 0) {
            return null;
        }
        return q1.d(q1.k((byte)r0));
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int i(@e final String s) {
        k0.p((Object)s, "$this$toUInt");
        final u1 k = k(s);
        if (k != null) {
            return k.R0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final int j(@e final String s, final int n) {
        k0.p((Object)s, "$this$toUInt");
        final u1 l = l(s, n);
        if (l != null) {
            return l.R0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final u1 k(@e final String s) {
        k0.p((Object)s, "$this$toUIntOrNull");
        return l(s, 10);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final u1 l(@e final String s, final int n) {
        k0.p((Object)s, "$this$toUIntOrNull");
        c.a(n);
        final int length = s.length();
        if (length == 0) {
            return null;
        }
        int k = 0;
        final char char1 = s.charAt(0);
        final int t = k0.t((int)char1, 48);
        int n2 = 1;
        if (t < 0) {
            if (length == 1 || char1 != '+') {
                return null;
            }
        }
        else {
            n2 = 0;
        }
        final int i = u1.k(n);
        int n3 = 119304647;
        int d;
        for (int j = n2; j < length; ++j, n3 = d) {
            final int b = kotlin.text.d.b(s.charAt(j), n);
            if (b < 0) {
                return null;
            }
            d = n3;
            if (m2.c(k, n3) > 0 && (n3 != 119304647 || m2.c(k, d = m2.d(-1, i)) > 0)) {
                return null;
            }
            final int l = u1.k(k * i);
            k = u1.k(u1.k(b) + l);
            if (m2.c(k, l) < 0) {
                return null;
            }
        }
        return u1.d(k);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long m(@e final String s) {
        k0.p((Object)s, "$this$toULong");
        final y1 o = o(s);
        if (o != null) {
            return o.R0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final long n(@e final String s, final int n) {
        k0.p((Object)s, "$this$toULong");
        final y1 p2 = p(s, n);
        if (p2 != null) {
            return p2.R0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final y1 o(@e final String s) {
        k0.p((Object)s, "$this$toULongOrNull");
        return p(s, 10);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final y1 p(@e final String s, final int n) {
        k0.p((Object)s, "$this$toULongOrNull");
        c.a(n);
        final int length = s.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        final char char1 = s.charAt(0);
        if (k0.t((int)char1, 48) < 0) {
            if (length == 1 || char1 != '+') {
                return null;
            }
            i = 1;
        }
        final long k = y1.k((long)n);
        long j = 0L;
        long n2 = 512409557603043100L;
        while (i < length) {
            final int b = d.b(s.charAt(i), n);
            if (b < 0) {
                return null;
            }
            long h = n2;
            if (m2.g(j, n2) > 0 && (n2 != 512409557603043100L || m2.g(j, h = m2.h(-1L, k)) > 0)) {
                return null;
            }
            final long l = y1.k(j * k);
            j = y1.k(y1.k((long)u1.k(b) & 0xFFFFFFFFL) + l);
            if (m2.g(j, l) < 0) {
                return null;
            }
            ++i;
            n2 = h;
        }
        return y1.d(j);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final short q(@e final String s) {
        k0.p((Object)s, "$this$toUShort");
        final e2 s2 = s(s);
        if (s2 != null) {
            return s2.O0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    public static final short r(@e final String s, final int n) {
        k0.p((Object)s, "$this$toUShort");
        final e2 t = t(s, n);
        if (t != null) {
            return t.O0();
        }
        a0.U0(s);
        throw new w();
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final e2 s(@e final String s) {
        k0.p((Object)s, "$this$toUShortOrNull");
        return t(s, 10);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @f
    public static final e2 t(@e final String s, int r0) {
        k0.p((Object)s, "$this$toUShortOrNull");
        final u1 l = l(s, r0);
        if (l == null) {
            return null;
        }
        r0 = l.R0();
        if (m2.c(r0, u1.k(65535)) > 0) {
            return null;
        }
        return e2.d(e2.k((short)r0));
    }
}
