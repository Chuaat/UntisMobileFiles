// 
// Decompiled by Procyon v0.5.36
// 

package okio.internal;

import java.io.EOFException;
import okio.r0;
import okio.p;
import okio.t0;
import okio.n;
import okio.m;
import okio.p0;
import org.jetbrains.annotations.e;
import okio.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0080\b\u001a%\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0080\b\u001a%\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0016H\u0080\b\u001a%\u0010\u0018\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0019H\u0080\b\u001a\u001d\u0010\u001b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010 \u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\"\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010#\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010$\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010%\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\r\u0010&\u001a\u00020\t*\u00020\u0000H\u0080\b\u001a\r\u0010\u001c\u001a\u00020\t*\u00020\u0000H\u0080\b\u001a\r\u0010'\u001a\u00020\u0005*\u00020\u0000H\u0080\b\u001a\r\u0010(\u001a\u00020\u0005*\u00020\u0000H\u0080\b\u001a\r\u0010*\u001a\u00020)*\u00020\u0000H\u0080\b\u001a\r\u0010+\u001a\u00020\u000e*\u00020\u0000H\u0080\b¨\u0006," }, d2 = { "Lokio/k0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "l", "Lokio/p;", "byteString", "Lokio/n;", "g", "", "offset", "h", "", "string", "w", "beginIndex", "endIndex", "x", "codePoint", "y", "", "j", "k", "Lokio/r0;", "m", "i", "b", "n", "s", "u", "v", "q", "r", "t", "o", "p", "c", "d", "a", "Lokio/t0;", "e", "f", "okio" }, k = 2, mv = { 1, 4, 1 })
public final class c
{
    public static final void a(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonClose");
        if (k0.H) {
            return;
        }
        try {
            if (k0.G.h0() > 0L) {
                final p0 i = k0.I;
                final m g = k0.G;
                i.t3(g, g.h0());
            }
        }
        finally {}
        Throwable t = null;
        try {
            k0.I.close();
        }
        finally {
            final Throwable t2;
            t = t2;
            if (t2 == null) {
                final Throwable t3;
                t = t3;
            }
        }
        k0.H = true;
        if (t == null) {
            return;
        }
        throw t;
    }
    
    @e
    public static final n b(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonEmit");
        if (k0.H ^ true) {
            final long h0 = k0.G.h0();
            if (h0 > 0L) {
                k0.I.t3(k0.G, h0);
            }
            return k0;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n c(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonEmitCompleteSegments");
        if (k0.H ^ true) {
            final long f = k0.G.f();
            if (f > 0L) {
                k0.I.t3(k0.G, f);
            }
            return k0;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public static final void d(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonFlush");
        if (k0.H ^ true) {
            if (k0.G.h0() > 0L) {
                final p0 i = k0.I;
                final m g = k0.G;
                i.t3(g, g.h0());
            }
            k0.I.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final t0 e(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonTimeout");
        return k0.I.timeout();
    }
    
    @e
    public static final String f(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonToString");
        final StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(k0.I);
        sb.append(')');
        return sb.toString();
    }
    
    @e
    public static final n g(@e final k0 k0, @e final p p2) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWrite");
        kotlin.jvm.internal.k0.p((Object)p2, "byteString");
        if (k0.H ^ true) {
            k0.G.p0(p2);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n h(@e final k0 k0, @e final p p4, final int n, final int n2) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWrite");
        kotlin.jvm.internal.k0.p((Object)p4, "byteString");
        if (k0.H ^ true) {
            k0.G.s0(p4, n, n2);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n i(@e final k0 k0, @e final r0 r0, long n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWrite");
        kotlin.jvm.internal.k0.p((Object)r0, "source");
        while (n > 0L) {
            final long read = r0.read(k0.G, n);
            if (read == -1L) {
                throw new EOFException();
            }
            n -= read;
            k0.a2();
        }
        return k0;
    }
    
    @e
    public static final n j(@e final k0 k0, @e final byte[] array) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWrite");
        kotlin.jvm.internal.k0.p((Object)array, "source");
        if (k0.H ^ true) {
            k0.G.y0(array);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n k(@e final k0 k0, @e final byte[] array, final int n, final int n2) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWrite");
        kotlin.jvm.internal.k0.p((Object)array, "source");
        if (k0.H ^ true) {
            k0.G.D0(array, n, n2);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public static final void l(@e final k0 k0, @e final m m, final long n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWrite");
        kotlin.jvm.internal.k0.p((Object)m, "source");
        if (k0.H ^ true) {
            k0.G.t3(m, n);
            k0.a2();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public static final long m(@e final k0 k0, @e final r0 r0) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteAll");
        kotlin.jvm.internal.k0.p((Object)r0, "source");
        long n = 0L;
        while (true) {
            final long read = r0.read(k0.G, 8192);
            if (read == -1L) {
                break;
            }
            n += read;
            k0.a2();
        }
        return n;
    }
    
    @e
    public static final n n(@e final k0 k0, final int n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteByte");
        if (k0.H ^ true) {
            k0.G.G0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n o(@e final k0 k0, final long n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteDecimalLong");
        if (k0.H ^ true) {
            k0.G.H0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n p(@e final k0 k0, final long n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteHexadecimalUnsignedLong");
        if (k0.H ^ true) {
            k0.G.L0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n q(@e final k0 k0, final int n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteInt");
        if (k0.H ^ true) {
            k0.G.M0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n r(@e final k0 k0, final int n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteIntLe");
        if (k0.H ^ true) {
            k0.G.N0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n s(@e final k0 k0, final long n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteLong");
        if (k0.H ^ true) {
            k0.G.Q0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n t(@e final k0 k0, final long n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteLongLe");
        if (k0.H ^ true) {
            k0.G.W0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n u(@e final k0 k0, final int n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteShort");
        if (k0.H ^ true) {
            k0.G.Z0(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n v(@e final k0 k0, final int n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteShortLe");
        if (k0.H ^ true) {
            k0.G.a1(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n w(@e final k0 k0, @e final String s) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteUtf8");
        kotlin.jvm.internal.k0.p((Object)s, "string");
        if (k0.H ^ true) {
            k0.G.p1(s);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n x(@e final k0 k0, @e final String s, final int n, final int n2) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteUtf8");
        kotlin.jvm.internal.k0.p((Object)s, "string");
        if (k0.H ^ true) {
            k0.G.t1(s, n, n2);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    public static final n y(@e final k0 k0, final int n) {
        kotlin.jvm.internal.k0.p((Object)k0, "$this$commonWriteUtf8CodePoint");
        if (k0.H ^ true) {
            k0.G.v1(n);
            return k0.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
}
