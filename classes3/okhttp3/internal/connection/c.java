// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import okio.m;
import java.net.ProtocolException;
import okio.u;
import okhttp3.v;
import okhttp3.internal.http.h;
import okio.r0;
import okio.d0;
import okhttp3.h0;
import okhttp3.g0;
import java.net.SocketException;
import okhttp3.f0;
import okio.p0;
import okhttp3.e0;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import okhttp3.s;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002$\u001dB'\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u0010:\u001a\u000206\u0012\u0006\u0010+\u001a\u00020'\u0012\u0006\u0010=\u001a\u00020;¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J9\u0010$\u001a\u00028\u0000\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010&\u001a\u00020\u0004R\u001c\u0010+\u001a\u00020'8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001c\u00100\u001a\u00020,8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R$\u00105\u001a\u00020\t2\u0006\u00101\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b3\u00104R\u001c\u0010:\u001a\u0002068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0016\u0010?\u001a\u00020\t8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u00104R\u001c\u0010D\u001a\u00020@8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010A\u001a\u0004\bB\u0010C¨\u0006G" }, d2 = { "Lokhttp3/internal/connection/c;", "", "Ljava/io/IOException;", "e", "Lkotlin/j2;", "t", "Lokhttp3/e0;", "request", "w", "", "duplex", "Lokio/p0;", "c", "f", "s", "expectContinue", "Lokhttp3/g0$a;", "q", "Lokhttp3/g0;", "response", "r", "Lokhttp3/h0;", "p", "Lokhttp3/v;", "u", "Lokhttp3/internal/ws/e$d;", "m", "v", "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "Lokhttp3/internal/connection/d;", "Lokhttp3/internal/connection/d;", "j", "()Lokhttp3/internal/connection/d;", "finder", "Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/e;", "g", "()Lokhttp3/internal/connection/e;", "call", "<set-?>", "Z", "l", "()Z", "isDuplex", "Lokhttp3/s;", "Lokhttp3/s;", "i", "()Lokhttp3/s;", "eventListener", "Lokhttp3/internal/http/d;", "Lokhttp3/internal/http/d;", "codec", "k", "isCoalescedConnection", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "h", "()Lokhttp3/internal/connection/f;", "connection", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/s;Lokhttp3/internal/connection/d;Lokhttp3/internal/http/d;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    private boolean a;
    @e
    private final f b;
    @e
    private final okhttp3.internal.connection.e c;
    @e
    private final s d;
    @e
    private final d e;
    private final okhttp3.internal.http.d f;
    
    public c(@e final okhttp3.internal.connection.e c, @e final s d, @e final d e, @e final okhttp3.internal.http.d f) {
        k0.p((Object)c, "call");
        k0.p((Object)d, "eventListener");
        k0.p((Object)e, "finder");
        k0.p((Object)f, "codec");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = f.e();
    }
    
    private final void t(final IOException ex) {
        this.e.h(ex);
        this.f.e().N(this.c, ex);
    }
    
    public final <E extends IOException> E a(final long n, final boolean b, final boolean b2, final E e) {
        if (e != null) {
            this.t(e);
        }
        if (b2) {
            final s d = this.d;
            final okhttp3.internal.connection.e c = this.c;
            if (e != null) {
                d.s(c, e);
            }
            else {
                d.q(c, n);
            }
        }
        if (b) {
            if (e != null) {
                this.d.x(this.c, e);
            }
            else {
                this.d.v(this.c, n);
            }
        }
        return this.c.x(this, b2, b, e);
    }
    
    public final void b() {
        this.f.cancel();
    }
    
    @e
    public final p0 c(@e final e0 e0, final boolean a) throws IOException {
        k0.p((Object)e0, "request");
        this.a = a;
        final f0 f = e0.f();
        k0.m((Object)f);
        final long a2 = f.a();
        this.d.r(this.c);
        return new a(this.f.i(e0, a2), a2);
    }
    
    public final void d() {
        this.f.cancel();
        this.c.x(this, true, true, (IOException)null);
    }
    
    public final void e() throws IOException {
        try {
            this.f.a();
        }
        catch (IOException ex) {
            this.d.s(this.c, ex);
            this.t(ex);
            throw ex;
        }
    }
    
    public final void f() throws IOException {
        try {
            this.f.f();
        }
        catch (IOException ex) {
            this.d.s(this.c, ex);
            this.t(ex);
            throw ex;
        }
    }
    
    @e
    public final okhttp3.internal.connection.e g() {
        return this.c;
    }
    
    @e
    public final f h() {
        return this.b;
    }
    
    @e
    public final s i() {
        return this.d;
    }
    
    @e
    public final d j() {
        return this.e;
    }
    
    public final boolean k() {
        return k0.g((Object)this.e.d().w().F(), (Object)this.b.b().d().w().F()) ^ true;
    }
    
    public final boolean l() {
        return this.a;
    }
    
    @e
    public final okhttp3.internal.ws.e.d m() throws SocketException {
        this.c.E();
        return this.f.e().E(this);
    }
    
    public final void n() {
        this.f.e().G();
    }
    
    public final void o() {
        this.c.x(this, true, false, (IOException)null);
    }
    
    @e
    public final h0 p(@e final g0 g0) throws IOException {
        k0.p((Object)g0, "response");
        try {
            final String g2 = g0.G(g0, "Content-Type", null, 2, null);
            final long g3 = this.f.g(g0);
            return new h(g2, g3, d0.d(new b(this.f.c(g0), g3)));
        }
        catch (IOException ex) {
            this.d.x(this.c, ex);
            this.t(ex);
            throw ex;
        }
    }
    
    @org.jetbrains.annotations.f
    public final g0.a q(final boolean b) throws IOException {
        try {
            final g0.a d = this.f.d(b);
            if (d != null) {
                d.x(this);
            }
            return d;
        }
        catch (IOException ex) {
            this.d.x(this.c, ex);
            this.t(ex);
            throw ex;
        }
    }
    
    public final void r(@e final g0 g0) {
        k0.p((Object)g0, "response");
        this.d.y(this.c, g0);
    }
    
    public final void s() {
        this.d.z(this.c);
    }
    
    @e
    public final v u() throws IOException {
        return this.f.h();
    }
    
    public final void v() {
        this.a(-1L, true, true, (IOException)null);
    }
    
    public final void w(@e final e0 e0) throws IOException {
        k0.p((Object)e0, "request");
        try {
            this.d.u(this.c);
            this.f.b(e0);
            this.d.t(this.c, e0);
        }
        catch (IOException ex) {
            this.d.s(this.c, ex);
            this.t(ex);
            throw ex;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001d" }, d2 = { "okhttp3/internal/connection/c$a", "Lokio/u;", "Ljava/io/IOException;", "E", "e", "c", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "close", "K", "J", "contentLength", "", "Z", "closed", "I", "bytesReceived", "H", "completed", "Lokio/p0;", "delegate", "<init>", "(Lokhttp3/internal/connection/c;Lokio/p0;J)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class a extends u
    {
        private boolean H;
        private long I;
        private boolean J;
        private final long K;
        
        public a(final p0 p4, final long k) {
            k0.p((Object)p4, "delegate");
            super(p4);
            this.K = k;
        }
        
        private final <E extends IOException> E c(final E e) {
            if (this.H) {
                return e;
            }
            this.H = true;
            return okhttp3.internal.connection.c.this.a(this.I, false, true, e);
        }
        
        @Override
        public void close() throws IOException {
            if (this.J) {
                return;
            }
            this.J = true;
            final long k = this.K;
            if (k != -1L) {
                if (this.I != k) {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
            try {
                super.close();
                this.c((IOException)null);
            }
            catch (IOException ex) {
                throw this.c(ex);
            }
        }
        
        @Override
        public void flush() throws IOException {
            try {
                super.flush();
            }
            catch (IOException ex) {
                throw this.c(ex);
            }
        }
        
        @Override
        public void t3(@e final m m, final long n) throws IOException {
            k0.p((Object)m, "source");
            if (this.J ^ true) {
                final long k = this.K;
                if (k != -1L) {
                    if (this.I + n > k) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("expected ");
                        sb.append(this.K);
                        sb.append(" bytes but received ");
                        sb.append(this.I + n);
                        throw new ProtocolException(sb.toString());
                    }
                }
                try {
                    super.t3(m, n);
                    this.I += n;
                    return;
                }
                catch (IOException ex) {
                    throw this.c(ex);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u001e" }, d2 = { "okhttp3/internal/connection/c$b", "Lokio/v;", "Lokio/m;", "sink", "", "byteCount", "read", "Lkotlin/j2;", "close", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "H", "Z", "invokeStartEvent", "I", "completed", "K", "J", "contentLength", "G", "bytesReceived", "closed", "Lokio/r0;", "delegate", "<init>", "(Lokhttp3/internal/connection/c;Lokio/r0;J)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class b extends v
    {
        private long G;
        private boolean H;
        private boolean I;
        private boolean J;
        private final long K;
        
        public b(final r0 r0, final long k) {
            k0.p((Object)r0, "delegate");
            super(r0);
            this.K = k;
            this.H = true;
            if (k == 0L) {
                this.a((IOException)null);
            }
        }
        
        public final <E extends IOException> E a(final E e) {
            if (this.I) {
                return e;
            }
            this.I = true;
            if (e == null && this.H) {
                this.H = false;
                okhttp3.internal.connection.c.this.i().w(okhttp3.internal.connection.c.this.g());
            }
            return okhttp3.internal.connection.c.this.a(this.G, true, false, e);
        }
        
        @Override
        public void close() throws IOException {
            if (this.J) {
                return;
            }
            this.J = true;
            try {
                super.close();
                this.a((IOException)null);
            }
            catch (IOException ex) {
                throw this.a(ex);
            }
        }
        
        @Override
        public long read(@e final m m, long read) throws IOException {
            k0.p((Object)m, "sink");
            if (this.J ^ true) {
                try {
                    read = this.delegate().read(m, read);
                    if (this.H) {
                        this.H = false;
                        okhttp3.internal.connection.c.this.i().w(okhttp3.internal.connection.c.this.g());
                    }
                    if (read == -1L) {
                        this.a((IOException)null);
                        return -1L;
                    }
                    final long n = this.G + read;
                    final long k = this.K;
                    if (k != -1L && n > k) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("expected ");
                        sb.append(this.K);
                        sb.append(" bytes but received ");
                        sb.append(n);
                        throw new ProtocolException(sb.toString());
                    }
                    this.G = n;
                    if (n == k) {
                        this.a((IOException)null);
                    }
                    return read;
                }
                catch (IOException ex) {
                    throw this.a(ex);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }
}
