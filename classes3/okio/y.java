// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006," }, d2 = { "Lokio/y;", "Lokio/r0;", "Lkotlin/j2;", "b", "c", "Lokio/m;", "buffer", "", "offset", "byteCount", "d", "", "name", "", "expected", "actual", "a", "sink", "read", "Lokio/t0;", "timeout", "close", "Lokio/b0;", "J", "Lokio/b0;", "inflaterSource", "Ljava/util/zip/CRC32;", "K", "Ljava/util/zip/CRC32;", "crc", "Lokio/l0;", "H", "Lokio/l0;", "source", "", "G", "B", "section", "Ljava/util/zip/Inflater;", "I", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/r0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class y implements r0
{
    private byte G;
    private final l0 H;
    private final Inflater I;
    private final b0 J;
    private final CRC32 K;
    
    public y(@e final r0 r0) {
        k0.p((Object)r0, "source");
        final l0 h = new l0(r0);
        this.H = h;
        final Inflater i = new Inflater(true);
        this.I = i;
        this.J = new b0(h, i);
        this.K = new CRC32();
    }
    
    private final void a(String format, final int i, final int j) {
        if (j == i) {
            return;
        }
        format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[] { format, j, i }, 3));
        k0.o((Object)format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }
    
    private final void b() throws IOException {
        this.H.B5(10L);
        final byte f = this.H.G.F(3L);
        final int n = 1;
        final boolean b = (f >> 1 & 0x1) == 0x1;
        if (b) {
            this.d(this.H.G, 0L, 10L);
        }
        this.a("ID1ID2", 8075, this.H.readShort());
        this.H.skip(8L);
        if ((f >> 2 & 0x1) == 0x1) {
            this.H.B5(2L);
            if (b) {
                this.d(this.H.G, 0L, 2L);
            }
            final long n2 = this.H.G.P4();
            this.H.B5(n2);
            if (b) {
                this.d(this.H.G, 0L, n2);
            }
            this.H.skip(n2);
        }
        if ((f >> 3 & 0x1) == 0x1) {
            final long h5 = this.H.H5((byte)0);
            if (h5 == -1L) {
                throw new EOFException();
            }
            if (b) {
                this.d(this.H.G, 0L, h5 + 1L);
            }
            this.H.skip(h5 + 1L);
        }
        int n3;
        if ((f >> 4 & 0x1) == 0x1) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final long h6 = this.H.H5((byte)0);
            if (h6 == -1L) {
                throw new EOFException();
            }
            if (b) {
                this.d(this.H.G, 0L, h6 + 1L);
            }
            this.H.skip(h6 + 1L);
        }
        if (b) {
            this.a("FHCRC", this.H.P4(), (short)this.K.getValue());
            this.K.reset();
        }
    }
    
    private final void c() throws IOException {
        this.a("CRC", this.H.i4(), (int)this.K.getValue());
        this.a("ISIZE", this.H.i4(), (int)this.I.getBytesWritten());
    }
    
    private final void d(final m m, long n, long b) {
        m0 m2 = m.G;
        while (true) {
            k0.m((Object)m2);
            final int c = m2.c;
            final int b2 = m2.b;
            if (n < c - b2) {
                break;
            }
            n -= c - b2;
            m2 = m2.f;
        }
        while (b > 0L) {
            final int off = (int)(m2.b + n);
            final int len = (int)Math.min(m2.c - off, b);
            this.K.update(m2.a, off, len);
            b -= len;
            m2 = m2.f;
            k0.m((Object)m2);
            n = 0L;
        }
    }
    
    @Override
    public void close() throws IOException {
        this.J.close();
    }
    
    @Override
    public long read(@e final m m, long read) throws IOException {
        k0.p((Object)m, "sink");
        final long n = lcmp(read, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(read);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n == 0) {
            return 0L;
        }
        if (this.G == 0) {
            this.b();
            this.G = 1;
        }
        if (this.G == 1) {
            final long h0 = m.h0();
            read = this.J.read(m, read);
            if (read != -1L) {
                this.d(m, h0, read);
                return read;
            }
            this.G = 2;
        }
        if (this.G == 2) {
            this.c();
            this.G = 3;
            if (!this.H.D1()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.H.timeout();
    }
}
