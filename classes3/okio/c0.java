// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lokio/c0;", "Lokio/r0;", "Lokio/m;", "sink", "", "byteCount", "read", "Lkotlin/j2;", "close", "Lokio/t0;", "timeout", "", "toString", "Ljava/io/InputStream;", "G", "Ljava/io/InputStream;", "input", "H", "Lokio/t0;", "<init>", "(Ljava/io/InputStream;Lokio/t0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
final class c0 implements r0
{
    private final InputStream G;
    private final t0 H;
    
    public c0(@e final InputStream g, @e final t0 h) {
        k0.p((Object)g, "input");
        k0.p((Object)h, "timeout");
        this.G = g;
        this.H = h;
    }
    
    @Override
    public void close() {
        this.G.close();
    }
    
    @Override
    public long read(@e final m m, long h0) {
        k0.p((Object)m, "sink");
        final long n = lcmp(h0, 0L);
        if (n == 0) {
            return 0L;
        }
        if (n >= 0) {
            try {
                this.H.h();
                final m0 m2 = m.m0(1);
                final int read = this.G.read(m2.a, m2.c, (int)Math.min(h0, 8192 - m2.c));
                if (read == -1) {
                    if (m2.b == m2.c) {
                        m.G = m2.b();
                        n0.d(m2);
                    }
                    return -1L;
                }
                m2.c += read;
                h0 = m.h0();
                final long n2 = read;
                m.d0(h0 + n2);
                return n2;
            }
            catch (AssertionError cause) {
                if (d0.k(cause)) {
                    throw new IOException(cause);
                }
                throw cause;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(h0);
        throw new IllegalArgumentException(sb.toString().toString());
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
        sb.append("source(");
        sb.append(this.G);
        sb.append(')');
        return sb.toString();
    }
}
