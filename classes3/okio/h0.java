// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "Lokio/h0;", "Lokio/p0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "close", "Lokio/t0;", "timeout", "", "toString", "Ljava/io/OutputStream;", "G", "Ljava/io/OutputStream;", "out", "H", "Lokio/t0;", "<init>", "(Ljava/io/OutputStream;Lokio/t0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
final class h0 implements p0
{
    private final OutputStream G;
    private final t0 H;
    
    public h0(@e final OutputStream g, @e final t0 h) {
        k0.p((Object)g, "out");
        k0.p((Object)h, "timeout");
        this.G = g;
        this.H = h;
    }
    
    @Override
    public void close() {
        this.G.close();
    }
    
    @Override
    public void flush() {
        this.G.flush();
    }
    
    @Override
    public void t3(@e final m m, long a) {
        k0.p((Object)m, "source");
        j.e(m.h0(), 0L, a);
        while (a > 0L) {
            this.H.h();
            final m0 g = m.G;
            k0.m((Object)g);
            final int len = (int)Math.min(a, g.c - g.b);
            this.G.write(g.a, g.b, len);
            g.b += len;
            final long n = len;
            final long n2 = a - n;
            m.d0(m.h0() - n);
            a = n2;
            if (g.b == g.c) {
                m.G = g.b();
                n0.d(g);
                a = n2;
            }
        }
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.H;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("sink(");
        sb.append(this.G);
        sb.append(')');
        return sb.toString();
    }
}
