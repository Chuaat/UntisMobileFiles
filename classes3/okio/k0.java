// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.nio.ByteBuffer;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010>\u001a\u00020;¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J(\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001bH\u0016J \u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020 H\u0016J\u0018\u0010\"\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\fH\u0016J\u0010\u0010)\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\fH\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\fH\u0016J\u0010\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0001H\u0016J\b\u00101\u001a\u00020\u0001H\u0016J\b\u00103\u001a\u000202H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00106\u001a\u000205H\u0016J\b\u00107\u001a\u00020\u0007H\u0016J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u00020\u000fH\u0016R\u0016\u0010>\u001a\u00020;8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001d\u0010F\u001a\u00020\u00028\u00d6\u0002@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR\u0016\u0010I\u001a\u0002058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L" }, d2 = { "Lokio/k0;", "Lokio/n;", "Lokio/m;", "m", "source", "", "byteCount", "Lkotlin/j2;", "t3", "Lokio/p;", "byteString", "L4", "", "offset", "b1", "", "string", "Q2", "beginIndex", "endIndex", "v3", "codePoint", "V0", "Ljava/nio/charset/Charset;", "charset", "E3", "w5", "", "G4", "o3", "Ljava/nio/ByteBuffer;", "write", "Lokio/r0;", "z3", "P3", "b", "A", "s", "S0", "B2", "i", "i1", "A1", "v", "A5", "l1", "D5", "A3", "a2", "P0", "Ljava/io/OutputStream;", "G5", "flush", "", "isOpen", "close", "Lokio/t0;", "timeout", "toString", "Lokio/p0;", "I", "Lokio/p0;", "sink", "G", "Lokio/m;", "bufferField", "z", "()Lokio/m;", "getBuffer$annotations", "()V", "buffer", "H", "Z", "closed", "<init>", "(Lokio/p0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class k0 implements n
{
    @d
    @e
    public final m G;
    @d
    public boolean H;
    @d
    @e
    public final p0 I;
    
    public k0(@e final p0 i) {
        kotlin.jvm.internal.k0.p((Object)i, "sink");
        this.I = i;
        this.G = new m();
    }
    
    @e
    @Override
    public n A(final int n) {
        if (this.H ^ true) {
            this.G.G0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n A1(final int n) {
        if (this.H ^ true) {
            this.G.N0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n A3(final long n) {
        if (this.H ^ true) {
            this.G.L0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n A5(final long n) {
        if (this.H ^ true) {
            this.G.Q0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n B2(final int n) {
        if (this.H ^ true) {
            this.G.a1(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n D5(final long n) {
        if (this.H ^ true) {
            this.G.H0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n E3(@e final String s, @e final Charset charset) {
        kotlin.jvm.internal.k0.p((Object)s, "string");
        kotlin.jvm.internal.k0.p((Object)charset, "charset");
        if (this.H ^ true) {
            this.G.e1(s, charset);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n G4(@e final byte[] array) {
        kotlin.jvm.internal.k0.p((Object)array, "source");
        if (this.H ^ true) {
            this.G.y0(array);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public OutputStream G5() {
        return new OutputStream() {
            final /* synthetic */ k0 G;
            
            @Override
            public void close() {
                this.G.close();
            }
            
            @Override
            public void flush() {
                final k0 g = this.G;
                if (!g.H) {
                    g.flush();
                }
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.G);
                sb.append(".outputStream()");
                return sb.toString();
            }
            
            @Override
            public void write(final int n) {
                final k0 g = this.G;
                if (!g.H) {
                    g.G.G0((byte)n);
                    this.G.a2();
                    return;
                }
                throw new IOException("closed");
            }
            
            @Override
            public void write(@e final byte[] array, final int n, final int n2) {
                kotlin.jvm.internal.k0.p((Object)array, "data");
                final k0 g = this.G;
                if (!g.H) {
                    g.G.D0(array, n, n2);
                    this.G.a2();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }
    
    @e
    @Override
    public n L4(@e final p p) {
        kotlin.jvm.internal.k0.p((Object)p, "byteString");
        if (this.H ^ true) {
            this.G.p0(p);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n P0() {
        if (this.H ^ true) {
            final long h0 = this.G.h0();
            if (h0 > 0L) {
                this.I.t3(this.G, h0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n P3(@e final r0 r0, long n) {
        kotlin.jvm.internal.k0.p((Object)r0, "source");
        while (n > 0L) {
            final long read = r0.read(this.G, n);
            if (read == -1L) {
                throw new EOFException();
            }
            n -= read;
            this.a2();
        }
        return this;
    }
    
    @e
    @Override
    public n Q2(@e final String s) {
        kotlin.jvm.internal.k0.p((Object)s, "string");
        if (this.H ^ true) {
            this.G.p1(s);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n S0(final int n) {
        if (this.H ^ true) {
            this.G.Z0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n V0(final int n) {
        if (this.H ^ true) {
            this.G.v1(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n a2() {
        if (this.H ^ true) {
            final long f = this.G.f();
            if (f > 0L) {
                this.I.t3(this.G, f);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n b1(@e final p p3, final int n, final int n2) {
        kotlin.jvm.internal.k0.p((Object)p3, "byteString");
        if (this.H ^ true) {
            this.G.s0(p3, n, n2);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public void close() {
        if (!this.H) {
            try {
                if (this.G.h0() > 0L) {
                    final p0 i = this.I;
                    final m g = this.G;
                    i.t3(g, g.h0());
                }
            }
            finally {}
            Throwable t = null;
            try {
                this.I.close();
            }
            finally {
                final Throwable t2;
                t = t2;
                if (t2 == null) {
                    final Throwable t3;
                    t = t3;
                }
            }
            this.H = true;
            if (t != null) {
                throw t;
            }
        }
    }
    
    @Override
    public void flush() {
        if (this.H ^ true) {
            if (this.G.h0() > 0L) {
                final p0 i = this.I;
                final m g = this.G;
                i.t3(g, g.h0());
            }
            this.I.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n i1(final int n) {
        if (this.H ^ true) {
            this.G.M0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public boolean isOpen() {
        return this.H ^ true;
    }
    
    @e
    @Override
    public n l1(final long n) {
        if (this.H ^ true) {
            this.G.W0(n);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public m m() {
        return this.G;
    }
    
    @e
    @Override
    public n o3(@e final byte[] array, final int n, final int n2) {
        kotlin.jvm.internal.k0.p((Object)array, "source");
        if (this.H ^ true) {
            this.G.D0(array, n, n2);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public void t3(@e final m m, final long n) {
        kotlin.jvm.internal.k0.p((Object)m, "source");
        if (this.H ^ true) {
            this.G.t3(m, n);
            this.a2();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.I.timeout();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.I);
        sb.append(')');
        return sb.toString();
    }
    
    @e
    @Override
    public n v3(@e final String s, final int n, final int n2) {
        kotlin.jvm.internal.k0.p((Object)s, "string");
        if (this.H ^ true) {
            this.G.t1(s, n, n2);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public n w5(@e final String s, final int n, final int n2, @e final Charset charset) {
        kotlin.jvm.internal.k0.p((Object)s, "string");
        kotlin.jvm.internal.k0.p((Object)charset, "charset");
        if (this.H ^ true) {
            this.G.d1(s, n, n2, charset);
            return this.a2();
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public int write(@e final ByteBuffer byteBuffer) {
        kotlin.jvm.internal.k0.p((Object)byteBuffer, "source");
        if (this.H ^ true) {
            final int write = this.G.write(byteBuffer);
            this.a2();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public m z() {
        return this.G;
    }
    
    @Override
    public long z3(@e final r0 r0) {
        kotlin.jvm.internal.k0.p((Object)r0, "source");
        long n = 0L;
        while (true) {
            final long read = r0.read(this.G, 8192);
            if (read == -1L) {
                break;
            }
            n += read;
            this.a2();
        }
        return n;
    }
}
