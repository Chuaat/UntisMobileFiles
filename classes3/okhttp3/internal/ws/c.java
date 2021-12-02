// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.r0;
import okio.b0;
import java.util.zip.Inflater;
import okio.m;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lokhttp3/internal/ws/c;", "Ljava/io/Closeable;", "Lokio/m;", "buffer", "Lkotlin/j2;", "a", "close", "G", "Lokio/m;", "deflatedBytes", "Ljava/util/zip/Inflater;", "H", "Ljava/util/zip/Inflater;", "inflater", "Lokio/b0;", "I", "Lokio/b0;", "inflaterSource", "", "J", "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class c implements Closeable
{
    private final m G;
    private final Inflater H;
    private final b0 I;
    private final boolean J;
    
    public c(final boolean j) {
        this.J = j;
        final m g = new m();
        this.G = g;
        final Inflater h = new Inflater(true);
        this.H = h;
        this.I = new b0((r0)g, h);
    }
    
    public final void a(@e final m m) throws IOException {
        k0.p((Object)m, "buffer");
        if (this.G.h0() == 0L) {
            if (this.J) {
                this.H.reset();
            }
            this.G.z3(m);
            this.G.M0(65535);
            do {
                this.I.a(m, Long.MAX_VALUE);
            } while (this.H.getBytesRead() < this.H.getBytesRead() + this.G.h0());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public void close() throws IOException {
        this.I.close();
    }
}
