// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.EOFException;
import java.util.zip.DataFormatException;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lokio/b0;", "Lokio/r0;", "Lkotlin/j2;", "c", "Lokio/m;", "sink", "", "byteCount", "read", "a", "", "b", "Lokio/t0;", "timeout", "close", "Lokio/o;", "I", "Lokio/o;", "source", "", "G", "bufferBytesHeldByInflater", "H", "Z", "closed", "Ljava/util/zip/Inflater;", "J", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/o;Ljava/util/zip/Inflater;)V", "(Lokio/r0;Ljava/util/zip/Inflater;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class b0 implements r0
{
    private int G;
    private boolean H;
    private final o I;
    private final Inflater J;
    
    public b0(@e final o i, @e final Inflater j) {
        k0.p((Object)i, "source");
        k0.p((Object)j, "inflater");
        this.I = i;
        this.J = j;
    }
    
    public b0(@e final r0 r0, @e final Inflater inflater) {
        k0.p((Object)r0, "source");
        k0.p((Object)inflater, "inflater");
        this(d0.d(r0), inflater);
    }
    
    private final void c() {
        final int g = this.G;
        if (g == 0) {
            return;
        }
        final int n = g - this.J.getRemaining();
        this.G -= n;
        this.I.skip(n);
    }
    
    public final long a(@e final m m, long n) throws IOException {
        k0.p((Object)m, "sink");
        final long n2 = lcmp(n, 0L);
        if (n2 >= 0) {
            if (this.H ^ true) {
                if (n2 == 0) {
                    return 0L;
                }
                try {
                    final m0 m2 = m.m0(1);
                    final int len = (int)Math.min(n, 8192 - m2.c);
                    this.b();
                    final int inflate = this.J.inflate(m2.a, m2.c, len);
                    this.c();
                    if (inflate > 0) {
                        m2.c += inflate;
                        final long h0 = m.h0();
                        n = inflate;
                        m.d0(h0 + n);
                        return n;
                    }
                    if (m2.b == m2.c) {
                        m.G = m2.b();
                        n0.d(m2);
                    }
                    return 0L;
                }
                catch (DataFormatException cause) {
                    throw new IOException(cause);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final boolean b() throws IOException {
        if (!this.J.needsInput()) {
            return false;
        }
        if (this.I.D1()) {
            return true;
        }
        final m0 g = this.I.z().G;
        k0.m((Object)g);
        final int c = g.c;
        final int b = g.b;
        final int n = c - b;
        this.G = n;
        this.J.setInput(g.a, b, n);
        return false;
    }
    
    @Override
    public void close() throws IOException {
        if (this.H) {
            return;
        }
        this.J.end();
        this.H = true;
        this.I.close();
    }
    
    @Override
    public long read(@e final m m, final long n) throws IOException {
        k0.p((Object)m, "sink");
        while (true) {
            final long a = this.a(m, n);
            if (a > 0L) {
                return a;
            }
            if (this.J.finished() || this.J.needsDictionary()) {
                return -1L;
            }
            if (!this.I.D1()) {
                continue;
            }
            throw new EOFException("source exhausted prematurely");
        }
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.I.timeout();
    }
}
