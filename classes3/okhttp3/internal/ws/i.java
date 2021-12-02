// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.ws;

import org.jetbrains.annotations.f;
import java.io.IOException;
import okio.p;
import kotlin.jvm.internal.k0;
import java.util.Random;
import org.jetbrains.annotations.e;
import okio.n;
import okio.m;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010;\u001a\u00020\u0019\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010-\u001a\u00020\u0019\u0012\u0006\u00109\u001a\u00020\u0019\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b<\u0010=J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0019\u0010\"\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010*R\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0019\u00103\u001a\u00020.8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u001bR\u0016\u0010;\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u001b¨\u0006>" }, d2 = { "Lokhttp3/internal/ws/i;", "Ljava/io/Closeable;", "", "opcode", "Lokio/p;", "payload", "Lkotlin/j2;", "d", "f", "g", "code", "reason", "c", "formatOpcode", "data", "e", "close", "Lokio/m;", "H", "Lokio/m;", "sinkBuffer", "", "K", "[B", "maskKey", "", "I", "Z", "writerClosed", "Ljava/util/Random;", "O", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "random", "", "R", "J", "minimumDeflateSize", "G", "messageBuffer", "Lokhttp3/internal/ws/a;", "Lokhttp3/internal/ws/a;", "messageDeflater", "P", "perMessageDeflate", "Lokio/n;", "N", "Lokio/n;", "b", "()Lokio/n;", "sink", "Lokio/m$a;", "L", "Lokio/m$a;", "maskCursor", "Q", "noContextTakeover", "M", "isClient", "<init>", "(ZLokio/n;Ljava/util/Random;ZZJ)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class i implements Closeable
{
    private final m G;
    private final m H;
    private boolean I;
    private a J;
    private final byte[] K;
    private final m.a L;
    private final boolean M;
    @e
    private final n N;
    @e
    private final Random O;
    private final boolean P;
    private final boolean Q;
    private final long R;
    
    public i(final boolean m, @e final n n, @e final Random o, final boolean p6, final boolean q, final long r) {
        k0.p((Object)n, "sink");
        k0.p((Object)o, "random");
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p6;
        this.Q = q;
        this.R = r;
        this.G = new m();
        this.H = n.z();
        final m.a a = null;
        byte[] k;
        if (m) {
            k = new byte[4];
        }
        else {
            k = null;
        }
        this.K = k;
        m.a l = a;
        if (m) {
            l = new m.a();
        }
        this.L = l;
    }
    
    private final void d(final int n, final p p2) throws IOException {
        if (this.I) {
            throw new IOException("closed");
        }
        final int size = p2.size();
        if (size <= 125L) {
            this.H.G0(n | 0x80);
            if (this.M) {
                this.H.G0(size | 0x80);
                final Random o = this.O;
                final byte[] k = this.K;
                k0.m((Object)k);
                o.nextBytes(k);
                this.H.y0(this.K);
                if (size > 0) {
                    final long h0 = this.H.h0();
                    this.H.p0(p2);
                    final m h2 = this.H;
                    final m.a l = this.L;
                    k0.m((Object)l);
                    h2.S(l);
                    this.L.e(h0);
                    g.w.c(this.L, this.K);
                    this.L.close();
                }
            }
            else {
                this.H.G0(size);
                this.H.p0(p2);
            }
            this.N.flush();
            return;
        }
        throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
    }
    
    @e
    public final Random a() {
        return this.O;
    }
    
    @e
    public final n b() {
        return this.N;
    }
    
    public final void c(final int n, @f final p p2) throws IOException {
        p p3 = p.K;
        if (n != 0 || p2 != null) {
            if (n != 0) {
                g.w.d(n);
            }
            final m m = new m();
            m.Z0(n);
            if (p2 != null) {
                m.p0(p2);
            }
            p3 = m.D3();
        }
        try {
            this.d(8, p3);
        }
        finally {
            this.I = true;
        }
    }
    
    @Override
    public void close() {
        final a j = this.J;
        if (j != null) {
            j.close();
        }
    }
    
    public final void e(int n, @e final p p2) throws IOException {
        k0.p((Object)p2, "data");
        if (!this.I) {
            this.G.p0(p2);
            final int n2 = 128;
            final int n3 = n |= 0x80;
            if (this.P) {
                n = n3;
                if (p2.size() >= this.R) {
                    a j = this.J;
                    if (j == null) {
                        j = new a(this.Q);
                        this.J = j;
                    }
                    j.a(this.G);
                    n = (n3 | 0x40);
                }
            }
            final long h0 = this.G.h0();
            this.H.G0(n);
            if (this.M) {
                n = n2;
            }
            else {
                n = 0;
            }
            if (h0 <= 125L) {
                this.H.G0((int)h0 | n);
            }
            else if (h0 <= 65535L) {
                this.H.G0(n | 0x7E);
                this.H.Z0((int)h0);
            }
            else {
                this.H.G0(n | 0x7F);
                this.H.Q0(h0);
            }
            if (this.M) {
                final Random o = this.O;
                final byte[] k = this.K;
                k0.m((Object)k);
                o.nextBytes(k);
                this.H.y0(this.K);
                if (h0 > 0L) {
                    final m g = this.G;
                    final m.a l = this.L;
                    k0.m((Object)l);
                    g.S(l);
                    this.L.e(0L);
                    okhttp3.internal.ws.g.w.c(this.L, this.K);
                    this.L.close();
                }
            }
            this.H.t3(this.G, h0);
            this.N.P0();
            return;
        }
        throw new IOException("closed");
    }
    
    public final void f(@e final p p) throws IOException {
        k0.p((Object)p, "payload");
        this.d(9, p);
    }
    
    public final void g(@e final p p) throws IOException {
        k0.p((Object)p, "payload");
        this.d(10, p);
    }
}
