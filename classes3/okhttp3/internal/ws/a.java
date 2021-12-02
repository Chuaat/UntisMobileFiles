// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.io.c;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.p;
import okio.p0;
import okio.s;
import java.util.zip.Deflater;
import okio.m;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b" }, d2 = { "Lokhttp3/internal/ws/a;", "Ljava/io/Closeable;", "Lokio/m;", "Lokio/p;", "suffix", "", "b", "buffer", "Lkotlin/j2;", "a", "close", "J", "Z", "noContextTakeover", "Lokio/s;", "I", "Lokio/s;", "deflaterSink", "G", "Lokio/m;", "deflatedBytes", "Ljava/util/zip/Deflater;", "H", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Z)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a implements Closeable
{
    private final m G;
    private final Deflater H;
    private final s I;
    private final boolean J;
    
    public a(final boolean j) {
        this.J = j;
        final m g = new m();
        this.G = g;
        final Deflater h = new Deflater(-1, true);
        this.H = h;
        this.I = new s((p0)g, h);
    }
    
    private final boolean b(final m m, final p p2) {
        return m.Y2(m.h0() - p2.size(), p2);
    }
    
    public final void a(@e final m m) throws IOException {
        k0.p((Object)m, "buffer");
        if (this.G.h0() == 0L) {
            if (this.J) {
                this.H.reset();
            }
            this.I.t3(m, m.h0());
            this.I.flush();
            Label_0142: {
                if (this.b(this.G, b.a())) {
                    final long h0 = this.G.h0();
                    final long n = 4;
                    final m.a t = m.T(this.G, null, 1, null);
                    try {
                        t.d(h0 - n);
                        c.a((Closeable)t, (Throwable)null);
                        break Label_0142;
                    }
                    finally {
                        try {}
                        finally {
                            c.a((Closeable)t, (Throwable)m);
                        }
                    }
                }
                this.G.G0(0);
            }
            final m g = this.G;
            m.t3(g, g.h0());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public void close() throws IOException {
        this.I.close();
    }
}
