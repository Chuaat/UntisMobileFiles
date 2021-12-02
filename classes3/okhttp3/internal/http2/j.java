// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import java.util.List;
import org.jetbrains.annotations.f;
import java.util.logging.Level;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okio.n;
import org.jetbrains.annotations.e;
import okio.m;
import java.util.logging.Logger;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010?\u001a\u00020\u0016¢\u0006\u0004\bD\u0010EJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J$\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0019\u00105\u001a\u0002008\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010<R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006G" }, d2 = { "Lokhttp3/internal/http2/j;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lkotlin/j2;", "s", "b", "Lokhttp3/internal/http2/m;", "peerSettings", "a", "promisedStreamId", "", "Lokhttp3/internal/http2/c;", "requestHeaders", "n", "flush", "Lokhttp3/internal/http2/b;", "errorCode", "o", "j", "", "outFinished", "Lokio/m;", "source", "c", "flags", "buffer", "d", "settings", "q", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "", "debugData", "g", "windowSizeIncrement", "r", "length", "type", "e", "close", "headerBlock", "h", "Lokhttp3/internal/http2/d$b;", "J", "Lokhttp3/internal/http2/d$b;", "f", "()Lokhttp3/internal/http2/d$b;", "hpackWriter", "H", "I", "maxFrameSize", "G", "Lokio/m;", "hpackBuffer", "Z", "closed", "L", "client", "Lokio/n;", "K", "Lokio/n;", "sink", "<init>", "(Lokio/n;Z)V", "N", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class j implements Closeable
{
    private static final Logger M;
    public static final a N;
    private final m G;
    private int H;
    private boolean I;
    @e
    private final d.b J;
    private final n K;
    private final boolean L;
    
    static {
        N = new a(null);
        M = Logger.getLogger(okhttp3.internal.http2.e.class.getName());
    }
    
    public j(@e final n k, final boolean l) {
        k0.p((Object)k, "sink");
        this.K = k;
        this.L = l;
        final m g = new m();
        this.G = g;
        this.H = 16384;
        this.J = new d.b(0, false, g, 3, null);
    }
    
    private final void s(final int n, long b) throws IOException {
        while (b > 0L) {
            final long min = Math.min(this.H, b);
            b -= min;
            final int n2 = (int)min;
            int n3;
            if (b == 0L) {
                n3 = 4;
            }
            else {
                n3 = 0;
            }
            this.e(n, n2, 9, n3);
            this.K.t3(this.G, min);
        }
    }
    
    public final void a(@e final okhttp3.internal.http2.m m) throws IOException {
        synchronized (this) {
            k0.p((Object)m, "peerSettings");
            if (!this.I) {
                this.H = m.g(this.H);
                if (m.d() != -1) {
                    this.J.e(m.d());
                }
                this.e(0, 0, 4, 1);
                this.K.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void b() throws IOException {
        synchronized (this) {
            if (this.I) {
                throw new IOException("closed");
            }
            if (!this.L) {
                return;
            }
            final Logger m = j.M;
            if (m.isLoggable(Level.FINE)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(">> CONNECTION ");
                sb.append(okhttp3.internal.http2.e.a.E());
                m.fine(okhttp3.internal.d.v(sb.toString(), new Object[0]));
            }
            this.K.L4(okhttp3.internal.http2.e.a);
            this.K.flush();
        }
    }
    
    public final void c(final boolean b, final int n, @f final m m, final int n2) throws IOException {
        synchronized (this) {
            if (!this.I) {
                this.d(n, b ? 1 : 0, m, n2);
                return;
            }
            throw new IOException("closed");
        }
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this) {
            this.I = true;
            this.K.close();
        }
    }
    
    public final void d(final int n, final int n2, @f final m m, final int n3) throws IOException {
        this.e(n, n3, 0, n2);
        if (n3 > 0) {
            final n k = this.K;
            k0.m((Object)m);
            k.t3(m, n3);
        }
    }
    
    public final void e(final int i, final int j, final int n, final int n2) throws IOException {
        final Logger m = j.M;
        if (m.isLoggable(Level.FINE)) {
            m.fine(okhttp3.internal.http2.e.x.c(false, i, j, n, n2));
        }
        final int h = this.H;
        final int n3 = 1;
        if (j > h) {
            final StringBuilder sb = new StringBuilder();
            sb.append("FRAME_SIZE_ERROR length > ");
            sb.append(this.H);
            sb.append(": ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n4;
        if (((int)2147483648L & i) == 0x0) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            okhttp3.internal.d.k0(this.K, j);
            this.K.A(n & 0xFF);
            this.K.A(n2 & 0xFF);
            this.K.i1(i & Integer.MAX_VALUE);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("reserved bit set: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    @e
    public final d.b f() {
        return this.J;
    }
    
    public final void flush() throws IOException {
        synchronized (this) {
            if (!this.I) {
                this.K.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void g(int n, @e final b b, @e final byte[] array) throws IOException {
        synchronized (this) {
            k0.p((Object)b, "errorCode");
            k0.p((Object)array, "debugData");
            if (this.I) {
                throw new IOException("closed");
            }
            final int b2 = b.b();
            final int n2 = 0;
            if (b2 != -1) {
                this.e(0, array.length + 8, 7, 0);
                this.K.i1(n);
                this.K.i1(b.b());
                n = n2;
                if (array.length == 0) {
                    n = 1;
                }
                if ((n ^ 0x1) != 0x0) {
                    this.K.G4(array);
                }
                this.K.flush();
                return;
            }
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
    }
    
    public final void h(final boolean b, final int n, @e final List<c> list) throws IOException {
        synchronized (this) {
            k0.p((Object)list, "headerBlock");
            if (!this.I) {
                this.J.g(list);
                final long h0 = this.G.h0();
                final long min = Math.min(this.H, h0);
                final long n2 = lcmp(h0, min);
                int n3;
                if (n2 == 0) {
                    n3 = 4;
                }
                else {
                    n3 = 0;
                }
                int n4 = n3;
                if (b) {
                    n4 = (n3 | 0x1);
                }
                this.e(n, (int)min, 1, n4);
                this.K.t3(this.G, min);
                if (n2 > 0) {
                    this.s(n, h0 - min);
                }
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final int j() {
        return this.H;
    }
    
    public final void k(final boolean b, final int n, final int n2) throws IOException {
        synchronized (this) {
            if (!this.I) {
                int n3;
                if (b) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                this.e(0, 8, 6, n3);
                this.K.i1(n);
                this.K.i1(n2);
                this.K.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void n(final int n, final int n2, @e final List<c> list) throws IOException {
        synchronized (this) {
            k0.p((Object)list, "requestHeaders");
            if (!this.I) {
                this.J.g(list);
                final long h0 = this.G.h0();
                final int n3 = (int)Math.min(this.H - 4L, h0);
                final long n4 = n3;
                final long n5 = lcmp(h0, n4);
                int n6;
                if (n5 == 0) {
                    n6 = 4;
                }
                else {
                    n6 = 0;
                }
                this.e(n, n3 + 4, 5, n6);
                this.K.i1(n2 & Integer.MAX_VALUE);
                this.K.t3(this.G, n4);
                if (n5 > 0) {
                    this.s(n, h0 - n4);
                }
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void o(final int n, @e final b b) throws IOException {
        synchronized (this) {
            k0.p((Object)b, "errorCode");
            if (this.I) {
                throw new IOException("closed");
            }
            if (b.b() != -1) {
                this.e(n, 4, 3, 0);
                this.K.i1(b.b());
                this.K.flush();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
    
    public final void q(@e final okhttp3.internal.http2.m m) throws IOException {
        synchronized (this) {
            k0.p((Object)m, "settings");
            if (!this.I) {
                final int l = m.l();
                int i = 0;
                this.e(0, l * 6, 4, 0);
                while (i < 10) {
                    if (m.i(i)) {
                        int n;
                        if (i != 4) {
                            if (i != 7) {
                                n = i;
                            }
                            else {
                                n = 4;
                            }
                        }
                        else {
                            n = 3;
                        }
                        this.K.S0(n);
                        this.K.i1(m.b(i));
                    }
                    ++i;
                }
                this.K.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void r(final int n, final long lng) throws IOException {
        synchronized (this) {
            if (this.I) {
                throw new IOException("closed");
            }
            if (lng != 0L && lng <= 2147483647L) {
                this.e(n, 4, 8, 0);
                this.K.i1((int)lng);
                this.K.flush();
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b" }, d2 = { "okhttp3/internal/http2/j$a", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
