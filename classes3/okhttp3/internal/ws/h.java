// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.ws;

import okio.p;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.o;
import okio.m;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0010R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u000bR\u0016\u00107\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>" }, d2 = { "Lokhttp3/internal/ws/h;", "Ljava/io/Closeable;", "Lkotlin/j2;", "d", "c", "f", "g", "e", "b", "close", "", "I", "J", "frameLength", "", "G", "Z", "closed", "R", "isClient", "Lokhttp3/internal/ws/c;", "O", "Lokhttp3/internal/ws/c;", "messageInflater", "Lokio/o;", "S", "Lokio/o;", "a", "()Lokio/o;", "source", "Lokhttp3/internal/ws/h$a;", "T", "Lokhttp3/internal/ws/h$a;", "frameCallback", "V", "noContextTakeover", "U", "perMessageDeflate", "K", "isControlFrame", "isFinalFrame", "", "P", "[B", "maskKey", "Lokio/m;", "M", "Lokio/m;", "controlFrameBuffer", "N", "messageFrameBuffer", "", "H", "opcode", "L", "readingCompressedMessage", "Lokio/m$a;", "Q", "Lokio/m$a;", "maskCursor", "<init>", "(ZLokio/o;Lokhttp3/internal/ws/h$a;ZZ)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class h implements Closeable
{
    private boolean G;
    private int H;
    private long I;
    private boolean J;
    private boolean K;
    private boolean L;
    private final m M;
    private final m N;
    private c O;
    private final byte[] P;
    private final m.a Q;
    private final boolean R;
    @e
    private final o S;
    private final a T;
    private final boolean U;
    private final boolean V;
    
    public h(final boolean r, @e final o s, @e final a t, final boolean u, final boolean v) {
        k0.p((Object)s, "source");
        k0.p((Object)t, "frameCallback");
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
        this.V = v;
        this.M = new m();
        this.N = new m();
        final m.a a = null;
        byte[] p5;
        if (r) {
            p5 = null;
        }
        else {
            p5 = new byte[4];
        }
        this.P = p5;
        m.a q;
        if (r) {
            q = a;
        }
        else {
            q = new m.a();
        }
        this.Q = q;
    }
    
    private final void c() throws IOException {
        final long i = this.I;
        if (i > 0L) {
            this.S.S1(this.M, i);
            if (!this.R) {
                final m m = this.M;
                final m.a q = this.Q;
                k0.m((Object)q);
                m.S(q);
                this.Q.e(0L);
                final g w = g.w;
                final m.a q2 = this.Q;
                final byte[] p = this.P;
                k0.m((Object)p);
                w.c(q2, p);
                this.Q.close();
            }
        }
        switch (this.H) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown control opcode: ");
                sb.append(d.Y(this.H));
                throw new ProtocolException(sb.toString());
            }
            case 10: {
                this.T.g(this.M.D3());
                break;
            }
            case 9: {
                this.T.e(this.M.D3());
                break;
            }
            case 8: {
                int short1 = 1005;
                final long h0 = this.M.h0();
                if (h0 != 1L) {
                    String y4;
                    if (h0 != 0L) {
                        short1 = this.M.readShort();
                        y4 = this.M.y4();
                        final String b = g.w.b(short1);
                        if (b != null) {
                            throw new ProtocolException(b);
                        }
                    }
                    else {
                        y4 = "";
                    }
                    this.T.h(short1, y4);
                    this.G = true;
                    break;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            }
        }
    }
    
    private final void d() throws IOException, ProtocolException {
        if (!this.G) {
            long n = this.S.timeout().j();
            this.S.timeout().b();
            try {
                final int b = d.b(this.S.readByte(), 255);
                this.S.timeout().i(n, TimeUnit.NANOSECONDS);
                final int h = b & 0xF;
                this.H = h;
                final boolean b2 = false;
                final boolean j = (b & 0x80) != 0x0;
                this.J = j;
                final boolean k = (b & 0x8) != 0x0;
                this.K = k;
                if (k && !j) {
                    throw new ProtocolException("Control frames must be final.");
                }
                final boolean b3 = (b & 0x40) != 0x0;
                if (h != 1 && h != 2) {
                    if (b3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                }
                else {
                    boolean l;
                    if (b3) {
                        if (!this.U) {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        l = true;
                    }
                    else {
                        l = false;
                    }
                    this.L = l;
                }
                if ((b & 0x20) != 0x0) {
                    throw new ProtocolException("Unexpected rsv2 flag");
                }
                if ((b & 0x10) != 0x0) {
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                final int b4 = d.b(this.S.readByte(), 255);
                boolean b5 = b2;
                if ((b4 & 0x80) != 0x0) {
                    b5 = true;
                }
                if (b5 == this.R) {
                    String message;
                    if (this.R) {
                        message = "Server-sent frames must not be masked.";
                    }
                    else {
                        message = "Client-sent frames must be masked.";
                    }
                    throw new ProtocolException(message);
                }
                n = (b4 & 0x7F);
                this.I = n;
                if (n == 126) {
                    this.I = d.c(this.S.readShort(), 65535);
                }
                else if (n == 127) {
                    n = this.S.readLong();
                    this.I = n;
                    if (n < 0L) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Frame length 0x");
                        sb.append(d.Z(this.I));
                        sb.append(" > 0x7FFFFFFFFFFFFFFF");
                        throw new ProtocolException(sb.toString());
                    }
                }
                if (this.K && this.I > 125L) {
                    throw new ProtocolException("Control frame must be less than 125B.");
                }
                if (b5) {
                    final o s = this.S;
                    final byte[] p = this.P;
                    k0.m((Object)p);
                    s.readFully(p);
                }
                return;
            }
            finally {
                this.S.timeout().i(n, TimeUnit.NANOSECONDS);
            }
        }
        throw new IOException("closed");
    }
    
    private final void e() throws IOException {
        while (!this.G) {
            final long i = this.I;
            if (i > 0L) {
                this.S.S1(this.N, i);
                if (!this.R) {
                    final m n = this.N;
                    final m.a q = this.Q;
                    k0.m((Object)q);
                    n.S(q);
                    this.Q.e(this.N.h0() - this.I);
                    final g w = g.w;
                    final m.a q2 = this.Q;
                    final byte[] p = this.P;
                    k0.m((Object)p);
                    w.c(q2, p);
                    this.Q.close();
                }
            }
            if (this.J) {
                return;
            }
            this.g();
            if (this.H == 0) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected continuation opcode. Got: ");
            sb.append(d.Y(this.H));
            throw new ProtocolException(sb.toString());
        }
        throw new IOException("closed");
    }
    
    private final void f() throws IOException {
        final int h = this.H;
        if (h != 1 && h != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown opcode: ");
            sb.append(d.Y(h));
            throw new ProtocolException(sb.toString());
        }
        this.e();
        if (this.L) {
            c o = this.O;
            if (o == null) {
                o = new c(this.V);
                this.O = o;
            }
            o.a(this.N);
        }
        if (h == 1) {
            this.T.d(this.N.y4());
        }
        else {
            this.T.c(this.N.D3());
        }
    }
    
    private final void g() throws IOException {
        while (!this.G) {
            this.d();
            if (!this.K) {
                break;
            }
            this.c();
        }
    }
    
    @e
    public final o a() {
        return this.S;
    }
    
    public final void b() throws IOException {
        this.d();
        if (this.K) {
            this.c();
        }
        else {
            this.f();
        }
    }
    
    @Override
    public void close() throws IOException {
        final c o = this.O;
        if (o != null) {
            o.close();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u0010" }, d2 = { "okhttp3/internal/ws/h$a", "", "", "text", "Lkotlin/j2;", "d", "Lokio/p;", "bytes", "c", "payload", "e", "g", "", "code", "reason", "h", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface a
    {
        void c(@e final p p0) throws IOException;
        
        void d(@e final String p0) throws IOException;
        
        void e(@e final p p0);
        
        void g(@e final p p0);
        
        void h(final int p0, @e final String p1);
    }
}
