// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001d¨\u0006!" }, d2 = { "Lokio/i0;", "Lokio/r0;", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/t0;", "timeout", "Lkotlin/j2;", "close", "K", "J", "pos", "G", "Lokio/m;", "buffer", "", "Z", "closed", "Lokio/o;", "L", "Lokio/o;", "upstream", "Lokio/m0;", "H", "Lokio/m0;", "expectedSegment", "", "I", "expectedPos", "<init>", "(Lokio/o;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class i0 implements r0
{
    private final m G;
    private m0 H;
    private int I;
    private boolean J;
    private long K;
    private final o L;
    
    public i0(@e final o l) {
        k0.p((Object)l, "upstream");
        this.L = l;
        final m z = l.z();
        this.G = z;
        final m0 g = z.G;
        this.H = g;
        int b;
        if (g != null) {
            b = g.b;
        }
        else {
            b = -1;
        }
        this.I = b;
    }
    
    @Override
    public void close() {
        this.J = true;
    }
    
    @Override
    public long read(@e final m m, long min) {
        k0.p((Object)m, "sink");
        final boolean b = false;
        final long n = lcmp(min, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(min);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!(this.J ^ true)) {
            throw new IllegalStateException("closed".toString());
        }
        final m0 h = this.H;
        int n2 = 0;
        Label_0101: {
            if (h != null) {
                final m0 g = this.G.G;
                n2 = (b ? 1 : 0);
                if (h != g) {
                    break Label_0101;
                }
                final int i = this.I;
                k0.m((Object)g);
                n2 = (b ? 1 : 0);
                if (i != g.b) {
                    break Label_0101;
                }
            }
            n2 = 1;
        }
        if (n2 == 0) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (n == 0) {
            return 0L;
        }
        if (!this.L.v(this.K + 1L)) {
            return -1L;
        }
        if (this.H == null) {
            final m0 g2 = this.G.G;
            if (g2 != null) {
                k0.m((Object)(this.H = g2));
                this.I = g2.b;
            }
        }
        min = Math.min(min, this.G.h0() - this.K);
        this.G.s(m, this.K, min);
        this.K += min;
        return min;
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.L.timeout();
    }
}
