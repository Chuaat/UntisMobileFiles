// 
// Decompiled by Procyon v0.5.36
// 

package okio.internal;

import kotlin.text.c;
import okio.p0;
import okio.j;
import okio.r0;
import okio.d0;
import okio.i0;
import okio.o;
import okio.p;
import okio.t0;
import okio.g0;
import java.io.EOFException;
import okio.m;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0080\b\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0080\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b\u001a\r\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001e\u001a\u00020\u001d*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u000f\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u0000H\u0080\b\u001a\u0015\u0010\"\u001a\u00020\u001d*\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a\r\u0010#\u001a\u00020\u0012*\u00020\u0000H\u0080\b\u001a\r\u0010%\u001a\u00020$*\u00020\u0000H\u0080\b\u001a\r\u0010&\u001a\u00020$*\u00020\u0000H\u0080\b\u001a\r\u0010'\u001a\u00020\u0012*\u00020\u0000H\u0080\b\u001a\r\u0010(\u001a\u00020\u0012*\u00020\u0000H\u0080\b\u001a\r\u0010)\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010*\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010+\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010,\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\u0015\u0010-\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a%\u00100\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\u0080\b\u001a\u001d\u00102\u001a\u00020\u0003*\u00020\u00002\u0006\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0003H\u0080\b\u001a\u001d\u00104\u001a\u00020\u0003*\u00020\u00002\u0006\u00103\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0003H\u0080\b\u001a-\u00106\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u00101\u001a\u00020\r2\u0006\u00105\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0080\b\u001a\r\u00108\u001a\u000207*\u00020\u0000H\u0080\b\u001a\r\u00109\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u0010;\u001a\u00020:*\u00020\u0000H\u0080\b\u001a\r\u0010<\u001a\u00020\u001d*\u00020\u0000H\u0080\b¨\u0006=" }, d2 = { "Lokio/l0;", "Lokio/m;", "sink", "", "byteCount", "i", "", "b", "Lkotlin/j2;", "F", "E", "", "k", "Lokio/p;", "n", "o", "Lokio/g0;", "options", "", "G", "", "l", "m", "r", "offset", "h", "q", "Lokio/p0;", "j", "", "z", "A", "C", "limit", "D", "B", "", "x", "y", "t", "u", "v", "w", "p", "s", "H", "fromIndex", "toIndex", "c", "bytes", "d", "targetBytes", "e", "bytesOffset", "g", "Lokio/o;", "f", "a", "Lokio/t0;", "I", "J", "okio" }, k = 2, mv = { 1, 4, 1 })
public final class d
{
    @e
    public static final String A(@e final l0 l0, final long n) {
        k0.p((Object)l0, "$this$commonReadUtf8");
        l0.B5(n);
        return l0.G.t0(n);
    }
    
    public static final int B(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadUtf8CodePoint");
        l0.B5(1L);
        final byte f = l0.G.F(0L);
        long n;
        if ((f & 0xE0) == 0xC0) {
            n = 2L;
        }
        else if ((f & 0xF0) == 0xE0) {
            n = 3L;
        }
        else {
            if ((f & 0xF8) != 0xF0) {
                return l0.G.q3();
            }
            n = 4L;
        }
        l0.B5(n);
        return l0.G.q3();
    }
    
    @f
    public static final String C(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadUtf8Line");
        final long h5 = l0.H5((byte)10);
        String s;
        if (h5 == -1L) {
            if (l0.G.h0() != 0L) {
                s = l0.t0(l0.G.h0());
            }
            else {
                s = null;
            }
        }
        else {
            s = a.i0(l0.G, h5);
        }
        return s;
    }
    
    @e
    public static final String D(@e final l0 l0, final long n) {
        k0.p((Object)l0, "$this$commonReadUtf8LineStrict");
        if (n < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("limit < 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long n2;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = n + 1L;
        }
        final byte b = 10;
        final long v1 = l0.V1(b, 0L, n2);
        if (v1 != -1L) {
            return a.i0(l0.G, v1);
        }
        if (n2 < Long.MAX_VALUE && l0.v(n2) && l0.G.F(n2 - 1L) == (byte)13 && l0.v(1L + n2) && l0.G.F(n2) == b) {
            return a.i0(l0.G, n2);
        }
        final m m = new m();
        final m g = l0.G;
        g.s(m, 0L, Math.min(32, g.h0()));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("\\n not found: limit=");
        sb2.append(Math.min(l0.G.h0(), n));
        sb2.append(" content=");
        sb2.append(m.D3().E());
        sb2.append("\u2026");
        throw new EOFException(sb2.toString());
    }
    
    public static final boolean E(@e final l0 l0, final long lng) {
        k0.p((Object)l0, "$this$commonRequest");
        if (lng < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (l0.H ^ true) {
            while (l0.G.h0() < lng) {
                if (l0.I.read(l0.G, 8192) == -1L) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public static final void F(@e final l0 l0, final long n) {
        k0.p((Object)l0, "$this$commonRequire");
        if (l0.v(n)) {
            return;
        }
        throw new EOFException();
    }
    
    public static final int G(@e final l0 l0, @e final g0 g0) {
        k0.p((Object)l0, "$this$commonSelect");
        k0.p((Object)g0, "options");
        if (l0.H ^ true) {
            do {
                final int k0 = a.k0(l0.G, g0, true);
                if (k0 != -2) {
                    if (k0 != -1) {
                        l0.G.skip(g0.i()[k0].size());
                        return k0;
                    }
                    return -1;
                }
            } while (l0.I.read(l0.G, 8192) != -1L);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public static final void H(@e final l0 l0, long a) {
        k0.p((Object)l0, "$this$commonSkip");
        if (l0.H ^ true) {
            while (a > 0L) {
                if (l0.G.h0() == 0L && l0.I.read(l0.G, 8192) == -1L) {
                    throw new EOFException();
                }
                final long min = Math.min(a, l0.G.h0());
                l0.G.skip(min);
                a -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final t0 I(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonTimeout");
        return l0.I.timeout();
    }
    
    @e
    public static final String J(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonToString");
        final StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(l0.I);
        sb.append(')');
        return sb.toString();
    }
    
    public static final void a(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonClose");
        if (l0.H) {
            return;
        }
        l0.H = true;
        l0.I.close();
        l0.G.c();
    }
    
    public static final boolean b(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonExhausted");
        final boolean h = l0.H;
        boolean b = true;
        if (h ^ true) {
            if (!l0.G.D1() || l0.I.read(l0.G, 8192) != -1L) {
                b = false;
            }
            return b;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public static final long c(@e final l0 l0, final byte b, long max, final long lng) {
        k0.p((Object)l0, "$this$commonIndexOf");
        final boolean h = l0.H;
        boolean b2 = true;
        if (!(h ^ true)) {
            throw new IllegalStateException("closed".toString());
        }
        Label_0045: {
            if (0L <= max) {
                if (lng >= max) {
                    break Label_0045;
                }
            }
            b2 = false;
        }
        if (b2) {
            while (max < lng) {
                final long v1 = l0.G.V1(b, max, lng);
                if (v1 != -1L) {
                    return v1;
                }
                final long h2 = l0.G.h0();
                if (h2 >= lng) {
                    break;
                }
                if (l0.I.read(l0.G, 8192) == -1L) {
                    break;
                }
                max = Math.max(max, h2);
            }
            return -1L;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex=");
        sb.append(max);
        sb.append(" toIndex=");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final long d(@e final l0 l0, @e final p p3, long max) {
        k0.p((Object)l0, "$this$commonIndexOf");
        k0.p((Object)p3, "bytes");
        if (!(l0.H ^ true)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            final long v0 = l0.G.v0(p3, max);
            if (v0 != -1L) {
                return v0;
            }
            final long h0 = l0.G.h0();
            if (l0.I.read(l0.G, 8192) == -1L) {
                return -1L;
            }
            max = Math.max(max, h0 - p3.size() + 1L);
        }
    }
    
    public static final long e(@e final l0 l0, @e final p p3, long max) {
        k0.p((Object)l0, "$this$commonIndexOfElement");
        k0.p((Object)p3, "targetBytes");
        if (!(l0.H ^ true)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            final long y5 = l0.G.y5(p3, max);
            if (y5 != -1L) {
                return y5;
            }
            final long h0 = l0.G.h0();
            if (l0.I.read(l0.G, 8192) == -1L) {
                return -1L;
            }
            max = Math.max(max, h0);
        }
    }
    
    @e
    public static final o f(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonPeek");
        return d0.d(new i0(l0));
    }
    
    public static final boolean g(@e final l0 l0, final long n, @e final p p5, final int n2, final int n3) {
        k0.p((Object)l0, "$this$commonRangeEquals");
        k0.p((Object)p5, "bytes");
        if (!(l0.H ^ true)) {
            throw new IllegalStateException("closed".toString());
        }
        if (n >= 0L && n2 >= 0 && n3 >= 0 && p5.size() - n2 >= n3) {
            for (int i = 0; i < n3; ++i) {
                final long n4 = i + n;
                if (!l0.v(1L + n4)) {
                    return false;
                }
                if (l0.G.F(n4) != p5.u(n2 + i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final int h(@e final l0 l0, @e final byte[] array, final int n, int n2) {
        k0.p((Object)l0, "$this$commonRead");
        k0.p((Object)array, "sink");
        final long n3 = array.length;
        final long n4 = n;
        final long a = n2;
        j.e(n3, n4, a);
        if (l0.G.h0() == 0L && l0.I.read(l0.G, 8192) == -1L) {
            return -1;
        }
        n2 = (int)Math.min(a, l0.G.h0());
        return l0.G.read(array, n, n2);
    }
    
    public static final long i(@e final l0 l0, @e final m m, long min) {
        k0.p((Object)l0, "$this$commonRead");
        k0.p((Object)m, "sink");
        if (min < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(min);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!(true ^ l0.H)) {
            throw new IllegalStateException("closed".toString());
        }
        if (l0.G.h0() == 0L && l0.I.read(l0.G, 8192) == -1L) {
            return -1L;
        }
        min = Math.min(min, l0.G.h0());
        return l0.G.read(m, min);
    }
    
    public static final long j(@e final l0 l0, @e final p0 p2) {
        k0.p((Object)l0, "$this$commonReadAll");
        k0.p((Object)p2, "sink");
        long n = 0L;
        m g;
        while (true) {
            final long read = l0.I.read(l0.G, 8192);
            g = l0.G;
            if (read == -1L) {
                break;
            }
            final long f = g.f();
            if (f <= 0L) {
                continue;
            }
            n += f;
            p2.t3(l0.G, f);
        }
        long n2 = n;
        if (g.h0() > 0L) {
            n2 = n + l0.G.h0();
            final m g2 = l0.G;
            p2.t3(g2, g2.h0());
        }
        return n2;
    }
    
    public static final byte k(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadByte");
        l0.B5(1L);
        return l0.G.readByte();
    }
    
    @e
    public static final byte[] l(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadByteArray");
        l0.G.z3(l0.I);
        return l0.G.s1();
    }
    
    @e
    public static final byte[] m(@e final l0 l0, final long n) {
        k0.p((Object)l0, "$this$commonReadByteArray");
        l0.B5(n);
        return l0.G.v4(n);
    }
    
    @e
    public static final p n(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadByteString");
        l0.G.z3(l0.I);
        return l0.G.D3();
    }
    
    @e
    public static final p o(@e final l0 l0, final long n) {
        k0.p((Object)l0, "$this$commonReadByteString");
        l0.B5(n);
        return l0.G.E0(n);
    }
    
    public static final long p(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadDecimalLong");
        l0.B5(1L);
        long n = 0L;
        while (true) {
            final long n2 = n + 1L;
            if (!l0.v(n2)) {
                break;
            }
            final byte f = l0.G.F(n);
            if (f < (byte)48 || f > (byte)57) {
                final long n3 = lcmp(n, 0L);
                if (n3 != 0 || f != (byte)45) {
                    if (n3 != 0) {
                        break;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected leading [0-9] or '-' character but was 0x");
                    final String string = Integer.toString(f, c.a(c.a(16)));
                    k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
                    sb.append(string);
                    throw new NumberFormatException(sb.toString());
                }
            }
            n = n2;
        }
        return l0.G.b2();
    }
    
    public static final void q(@e final l0 l0, @e final m m, final long n) {
        k0.p((Object)l0, "$this$commonReadFully");
        k0.p((Object)m, "sink");
        try {
            l0.B5(n);
            l0.G.S1(m, n);
        }
        catch (EOFException ex) {
            m.z3(l0.G);
            throw ex;
        }
    }
    
    public static final void r(@e final l0 l0, @e final byte[] array) {
        k0.p((Object)l0, "$this$commonReadFully");
        k0.p((Object)array, "sink");
        try {
            l0.B5(array.length);
            l0.G.readFully(array);
        }
        catch (EOFException ex) {
            int n = 0;
            while (l0.G.h0() > 0L) {
                final m g = l0.G;
                final int read = g.read(array, n, (int)g.h0());
                if (read == -1) {
                    throw new AssertionError();
                }
                n += read;
            }
            throw ex;
        }
    }
    
    public static final long s(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadHexadecimalUnsignedLong");
        l0.B5(1L);
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            if (!l0.v(n2)) {
                break;
            }
            final byte f = l0.G.F(n);
            if ((f < (byte)48 || f > (byte)57) && (f < (byte)97 || f > (byte)102) && (f < (byte)65 || f > (byte)70)) {
                if (n != 0) {
                    break;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                final String string = Integer.toString(f, c.a(c.a(16)));
                k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            else {
                n = n2;
            }
        }
        return l0.G.L5();
    }
    
    public static final int t(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadInt");
        l0.B5(4L);
        return l0.G.readInt();
    }
    
    public static final int u(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadIntLe");
        l0.B5(4L);
        return l0.G.i4();
    }
    
    public static final long v(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadLong");
        l0.B5(8L);
        return l0.G.readLong();
    }
    
    public static final long w(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadLongLe");
        l0.B5(8L);
        return l0.G.Z4();
    }
    
    public static final short x(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadShort");
        l0.B5(2L);
        return l0.G.readShort();
    }
    
    public static final short y(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadShortLe");
        l0.B5(2L);
        return l0.G.P4();
    }
    
    @e
    public static final String z(@e final l0 l0) {
        k0.p((Object)l0, "$this$commonReadUtf8");
        l0.G.z3(l0.I);
        return l0.G.y4();
    }
}
