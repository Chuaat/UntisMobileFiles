// 
// Decompiled by Procyon v0.5.36
// 

package okio.internal;

import okio.m0;
import kotlin.collections.m;
import okio.j;
import okio.p;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.q;
import okio.o0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a]\u0010\u0012\u001a\u00020\u0010*\u00020\u00062K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0080\b\u00f8\u0001\u0000\u001aj\u0010\u0015\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0082\b\u001a\u001d\u0010\u0017\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u001a\r\u0010\u001b\u001a\u00020\n*\u00020\u0006H\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010\"\u001a\u00020!*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010#\u001a\u00020!*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010%\u001a\u00020!*\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0080\b\u001a\r\u0010&\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'" }, d2 = { "", "", "value", "fromIndex", "toIndex", "b", "Lokio/o0;", "pos", "n", "Lkotlin/Function3;", "", "Lkotlin/t0;", "name", "data", "offset", "byteCount", "Lkotlin/j2;", "action", "m", "beginIndex", "endIndex", "l", "Lokio/p;", "i", "", "f", "d", "j", "Lokio/m;", "buffer", "k", "other", "otherOffset", "", "g", "h", "", "c", "e", "okio" }, k = 2, mv = { 1, 4, 1 })
public final class e
{
    public static final int b(@org.jetbrains.annotations.e final int[] array, final int n, int i, int n2) {
        k0.p((Object)array, "$this$binarySearch");
        --n2;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int n4 = array[n3];
            if (n4 < n) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -i - 1;
    }
    
    public static final boolean c(@org.jetbrains.annotations.e final o0 o0, @f final Object o2) {
        k0.p((Object)o0, "$this$commonEquals");
        boolean b = true;
        if (o2 != o0) {
            if (o2 instanceof p) {
                final p p2 = (p)o2;
                if (p2.size() == o0.size() && o0.u0(0, p2, 0, o0.size())) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public static final int d(@org.jetbrains.annotations.e final o0 o0) {
        k0.p((Object)o0, "$this$commonGetSize");
        return o0.Y0()[o0.Z0().length - 1];
    }
    
    public static final int e(@org.jetbrains.annotations.e final o0 o0) {
        k0.p((Object)o0, "$this$commonHashCode");
        final int y = o0.y();
        if (y != 0) {
            return y;
        }
        final int length = o0.Z0().length;
        int i = 0;
        int n = 0;
        int n2 = 1;
        while (i < length) {
            final int n3 = o0.Y0()[length + i];
            final int n4 = o0.Y0()[i];
            final byte[] array = o0.Z0()[i];
            for (int j = n3; j < n4 - n + n3; ++j) {
                n2 = n2 * 31 + array[j];
            }
            ++i;
            n = n4;
        }
        o0.A0(n2);
        return n2;
    }
    
    public static final byte f(@org.jetbrains.annotations.e final o0 o0, final int n) {
        k0.p((Object)o0, "$this$commonInternalGet");
        j.e(o0.Y0()[o0.Z0().length - 1], n, 1L);
        final int n2 = n(o0, n);
        int n3;
        if (n2 == 0) {
            n3 = 0;
        }
        else {
            n3 = o0.Y0()[n2 - 1];
        }
        return o0.Z0()[n2][n - n3 + o0.Y0()[o0.Z0().length + n2]];
    }
    
    public static final boolean g(@org.jetbrains.annotations.e final o0 o0, int n, @org.jetbrains.annotations.e final p p5, int n2, int i) {
        k0.p((Object)o0, "$this$commonRangeEquals");
        k0.p((Object)p5, "other");
        if (n >= 0 && n <= o0.size() - i) {
            final int a = i + n;
            final int n3 = n(o0, n);
            int n4;
            int n5;
            int n6;
            int n7;
            for (i = n, n = n3; i < a; i += n7, ++n) {
                if (n == 0) {
                    n4 = 0;
                }
                else {
                    n4 = o0.Y0()[n - 1];
                }
                n5 = o0.Y0()[n];
                n6 = o0.Y0()[o0.Z0().length + n];
                n7 = Math.min(a, n5 - n4 + n4) - i;
                if (!p5.v0(n2, o0.Z0()[n], n6 + (i - n4), n7)) {
                    return false;
                }
                n2 += n7;
            }
            return true;
        }
        return false;
    }
    
    public static final boolean h(@org.jetbrains.annotations.e final o0 o0, int i, @org.jetbrains.annotations.e final byte[] array, int n, int n2) {
        k0.p((Object)o0, "$this$commonRangeEquals");
        k0.p((Object)array, "other");
        if (i >= 0 && i <= o0.size() - n2 && n >= 0 && n <= array.length - n2) {
            int a;
            int n3;
            int n4;
            int n5;
            int n6;
            for (a = n2 + i, n2 = n(o0, i); i < a; i += n6, ++n2) {
                if (n2 == 0) {
                    n3 = 0;
                }
                else {
                    n3 = o0.Y0()[n2 - 1];
                }
                n4 = o0.Y0()[n2];
                n5 = o0.Y0()[o0.Z0().length + n2];
                n6 = Math.min(a, n4 - n3 + n3) - i;
                if (!j.d(o0.Z0()[n2], n5 + (i - n3), array, n, n6)) {
                    return false;
                }
                n += n6;
            }
            return true;
        }
        return false;
    }
    
    @org.jetbrains.annotations.e
    public static final p i(@org.jetbrains.annotations.e final o0 o0, final int n, int n2) {
        k0.p((Object)o0, "$this$commonSubstring");
        final int n3 = 0;
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex=");
            sb.append(n);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n2 > o0.size()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex=");
            sb2.append(n2);
            sb2.append(" > length(");
            sb2.append(o0.size());
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        final int b = n2 - n;
        if (b < 0) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex=");
            sb3.append(n2);
            sb3.append(" < beginIndex=");
            sb3.append(n);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (n == 0 && n2 == o0.size()) {
            return o0;
        }
        if (n == n2) {
            return p.K;
        }
        final int n4 = n(o0, n);
        final int n5 = n(o0, n2 - 1);
        final byte[][] array = (byte[][])m.M1((Object[])o0.Z0(), n4, n5 + 1);
        final int[] array2 = new int[array.length * 2];
        if (n4 <= n5) {
            n2 = n4;
            int n6 = 0;
            while (true) {
                array2[n6] = Math.min(o0.Y0()[n2] - n, b);
                array2[n6 + array.length] = o0.Y0()[o0.Z0().length + n2];
                if (n2 == n5) {
                    break;
                }
                ++n2;
                ++n6;
            }
        }
        if (n4 == 0) {
            n2 = n3;
        }
        else {
            n2 = o0.Y0()[n4 - 1];
        }
        final int length = array.length;
        array2[length] += n - n2;
        return new o0(array, array2);
    }
    
    @org.jetbrains.annotations.e
    public static final byte[] j(@org.jetbrains.annotations.e final o0 o0) {
        k0.p((Object)o0, "$this$commonToByteArray");
        final byte[] array = new byte[o0.size()];
        final int length = o0.Z0().length;
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < length) {
            final int n3 = o0.Y0()[length + i];
            final int n4 = o0.Y0()[i];
            final byte[] array2 = o0.Z0()[i];
            final int n5 = n4 - n;
            m.W0(array2, array, n2, n3, n3 + n5);
            n2 += n5;
            ++i;
            n = n4;
        }
        return array;
    }
    
    public static final void k(@org.jetbrains.annotations.e final o0 o0, @org.jetbrains.annotations.e final okio.m m, int i, final int n) {
        k0.p((Object)o0, "$this$commonWrite");
        k0.p((Object)m, "buffer");
        int n6;
        for (int a = i + n, n2 = n(o0, i); i < a; i += n6, ++n2) {
            int n3;
            if (n2 == 0) {
                n3 = 0;
            }
            else {
                n3 = o0.Y0()[n2 - 1];
            }
            final int n4 = o0.Y0()[n2];
            final int n5 = o0.Y0()[o0.Z0().length + n2];
            n6 = Math.min(a, n4 - n3 + n3) - i;
            final int n7 = n5 + (i - n3);
            final m0 g = new m0(o0.Z0()[n2], n7, n7 + n6, true, false);
            final m0 g2 = m.G;
            if (g2 == null) {
                g.g = g;
                g.f = g;
                m.G = g;
            }
            else {
                k0.m((Object)g2);
                final m0 g3 = g2.g;
                k0.m((Object)g3);
                g3.c(g);
            }
        }
        m.d0(m.h0() + n);
    }
    
    private static final void l(final o0 o0, int n, final int a, final q<? super byte[], ? super Integer, ? super Integer, j2> q) {
        final int n2 = n(o0, n);
        int i;
        int n3;
        int n4;
        int n5;
        int j;
        for (i = n, n = n2; i < a; i += j, ++n) {
            if (n == 0) {
                n3 = 0;
            }
            else {
                n3 = o0.Y0()[n - 1];
            }
            n4 = o0.Y0()[n];
            n5 = o0.Y0()[o0.Z0().length + n];
            j = Math.min(a, n4 - n3 + n3) - i;
            q.invoke((Object)o0.Z0()[n], (Object)(n5 + (i - n3)), (Object)j);
        }
    }
    
    public static final void m(@org.jetbrains.annotations.e final o0 o0, @org.jetbrains.annotations.e final q<? super byte[], ? super Integer, ? super Integer, j2> q) {
        k0.p((Object)o0, "$this$forEachSegment");
        k0.p((Object)q, "action");
        final int length = o0.Z0().length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int j = o0.Y0()[length + i];
            final int n2 = o0.Y0()[i];
            q.invoke((Object)o0.Z0()[i], (Object)j, (Object)(n2 - n));
            ++i;
            n = n2;
        }
    }
    
    public static final int n(@org.jetbrains.annotations.e final o0 o0, int b) {
        k0.p((Object)o0, "$this$segment");
        b = b(o0.Y0(), b + 1, 0, o0.Z0().length);
        if (b < 0) {
            b ^= -1;
        }
        return b;
    }
}
