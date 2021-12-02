// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.util.zip.CRC32;
import org.jetbrains.annotations.e;
import java.util.zip.Deflater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0019\u001a\u00020\u000f8G@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006(" }, d2 = { "Lokio/x;", "Lokio/p0;", "Lkotlin/j2;", "d", "Lokio/m;", "buffer", "", "byteCount", "c", "source", "t3", "flush", "Lokio/t0;", "timeout", "close", "Ljava/util/zip/Deflater;", "a", "()Ljava/util/zip/Deflater;", "Ljava/util/zip/CRC32;", "K", "Ljava/util/zip/CRC32;", "crc", "H", "Ljava/util/zip/Deflater;", "b", "deflater", "Lokio/k0;", "G", "Lokio/k0;", "sink", "", "J", "Z", "closed", "Lokio/s;", "I", "Lokio/s;", "deflaterSink", "<init>", "(Lokio/p0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class x implements p0
{
    private final k0 G;
    @e
    private final Deflater H;
    private final s I;
    private boolean J;
    private final CRC32 K;
    
    public x(@e final p0 p) {
        kotlin.jvm.internal.k0.p((Object)p, "sink");
        final k0 g = new k0(p);
        this.G = g;
        final Deflater h = new Deflater(-1, true);
        this.H = h;
        this.I = new s(g, h);
        this.K = new CRC32();
        final m g2 = g.G;
        g2.Z0(8075);
        g2.G0(8);
        g2.G0(0);
        g2.M0(0);
        g2.G0(0);
        g2.G0(0);
    }
    
    private final void c(final m m, long a) {
        m0 m2 = m.G;
        while (true) {
            kotlin.jvm.internal.k0.m((Object)m2);
            if (a <= 0L) {
                break;
            }
            final int len = (int)Math.min(a, m2.c - m2.b);
            this.K.update(m2.a, m2.b, len);
            a -= len;
            m2 = m2.f;
        }
    }
    
    private final void d() {
        this.G.A1((int)this.K.getValue());
        this.G.A1((int)this.H.getBytesRead());
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "deflater", imports = {}))
    @g(name = "-deprecated_deflater")
    @e
    public final Deflater a() {
        return this.H;
    }
    
    @g(name = "deflater")
    @e
    public final Deflater b() {
        return this.H;
    }
    
    @Override
    public void close() throws IOException {
        if (this.J) {
            return;
        }
        try {
            this.I.b();
            this.d();
        }
        finally {}
        Throwable t = null;
        try {
            this.H.end();
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
            this.G.close();
        }
        finally {
            t4 = t;
            if (t == null) {
                final Throwable t5;
                t4 = t5;
            }
        }
        this.J = true;
        if (t4 == null) {
            return;
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.I.flush();
    }
    
    @Override
    public void t3(@e final m m, final long lng) throws IOException {
        kotlin.jvm.internal.k0.p((Object)m, "source");
        final long n = lcmp(lng, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n == 0) {
            return;
        }
        this.c(m, lng);
        this.I.t3(m, lng);
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.G.timeout();
    }
}
