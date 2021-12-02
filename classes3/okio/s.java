// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.zip.Deflater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!" }, d2 = { "Lokio/s;", "Lokio/p0;", "", "syncFlush", "Lkotlin/j2;", "a", "Lokio/m;", "source", "", "byteCount", "t3", "flush", "b", "()V", "close", "Lokio/t0;", "timeout", "", "toString", "G", "Z", "closed", "Lokio/n;", "H", "Lokio/n;", "sink", "Ljava/util/zip/Deflater;", "I", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/n;Ljava/util/zip/Deflater;)V", "(Lokio/p0;Ljava/util/zip/Deflater;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class s implements p0
{
    private boolean G;
    private final n H;
    private final Deflater I;
    
    public s(@e final n h, @e final Deflater i) {
        k0.p((Object)h, "sink");
        k0.p((Object)i, "deflater");
        this.H = h;
        this.I = i;
    }
    
    public s(@e final p0 p2, @e final Deflater deflater) {
        k0.p((Object)p2, "sink");
        k0.p((Object)deflater, "deflater");
        this(d0.c(p2), deflater);
    }
    
    @IgnoreJRERequirement
    private final void a(final boolean b) {
        final m z = this.H.z();
        m0 m0;
        while (true) {
            m0 = z.m0(1);
            final Deflater i = this.I;
            final byte[] a = m0.a;
            final int c = m0.c;
            final int n = 8192 - c;
            int n2;
            if (b) {
                n2 = i.deflate(a, c, n, 2);
            }
            else {
                n2 = i.deflate(a, c, n);
            }
            if (n2 > 0) {
                m0.c += n2;
                z.d0(z.h0() + n2);
                this.H.a2();
            }
            else {
                if (this.I.needsInput()) {
                    break;
                }
                continue;
            }
        }
        if (m0.b == m0.c) {
            z.G = m0.b();
            n0.d(m0);
        }
    }
    
    public final void b() {
        this.I.finish();
        this.a(false);
    }
    
    @Override
    public void close() throws IOException {
        if (this.G) {
            return;
        }
        try {
            this.b();
        }
        finally {}
        Throwable t = null;
        try {
            this.I.end();
        }
        finally {
            final Throwable t2;
            t = t2;
            if (t2 == null) {
                final Throwable t3;
                t = t3;
            }
        }
        Throwable t4 = null;
        try {
            this.H.close();
        }
        finally {
            t4 = t;
            if (t == null) {
                final Throwable t5;
                t4 = t5;
            }
        }
        this.G = true;
        if (t4 == null) {
            return;
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.a(true);
        this.H.flush();
    }
    
    @Override
    public void t3(@e final m m, long a) throws IOException {
        k0.p((Object)m, "source");
        j.e(m.h0(), 0L, a);
        while (a > 0L) {
            final m0 g = m.G;
            k0.m((Object)g);
            final int len = (int)Math.min(a, g.c - g.b);
            this.I.setInput(g.a, g.b, len);
            this.a(false);
            final long h0 = m.h0();
            final long n = len;
            m.d0(h0 - n);
            if ((g.b += len) == g.c) {
                m.G = g.b();
                n0.d(g);
            }
            a -= n;
        }
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.H.timeout();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DeflaterSink(");
        sb.append(this.H);
        sb.append(')');
        return sb.toString();
    }
}
