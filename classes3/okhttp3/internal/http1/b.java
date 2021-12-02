// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http1;

import okio.m;
import java.net.ProtocolException;
import java.io.EOFException;
import java.io.IOException;
import okhttp3.internal.http.k;
import java.net.Proxy;
import okhttp3.internal.http.i;
import java.util.concurrent.TimeUnit;
import okio.p0;
import okhttp3.g0;
import kotlin.text.s;
import okhttp3.e0;
import okio.t0;
import okio.r0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okio.n;
import okio.o;
import org.jetbrains.annotations.e;
import okhttp3.internal.connection.f;
import okhttp3.c0;
import okhttp3.v;
import kotlin.Metadata;
import okhttp3.internal.http.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 H2\u00020\u0001:\u0007\u001e\u0016\u001a&-\u001d\u0019B)\u0012\b\u0010*\u001a\u0004\u0018\u00010(\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u00107\u001a\u000205¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0016J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u001c\u0010/\u001a\u00020+8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00100R\u001a\u00104\u001a\u00020#*\u00020\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0013\u0010=\u001a\u00020#8F@\u0006¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u00104\u001a\u00020#*\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010D¨\u0006I" }, d2 = { "Lokhttp3/internal/http1/b;", "Lokhttp3/internal/http/d;", "Lokio/p0;", "w", "z", "", "length", "Lokio/r0;", "y", "Lokhttp3/w;", "url", "x", "A", "Lokio/w;", "timeout", "Lkotlin/j2;", "s", "Lokhttp3/e0;", "request", "contentLength", "i", "cancel", "b", "Lokhttp3/g0;", "response", "g", "c", "Lokhttp3/v;", "h", "f", "a", "headers", "", "requestLine", "C", "", "expectContinue", "Lokhttp3/g0$a;", "d", "B", "Lokhttp3/c0;", "Lokhttp3/c0;", "client", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "e", "()Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/v;", "trailers", "u", "(Lokhttp3/g0;)Z", "isChunked", "Lokio/n;", "Lokio/n;", "sink", "Lokio/o;", "Lokio/o;", "source", "v", "()Z", "isClosed", "t", "(Lokhttp3/e0;)Z", "Lokhttp3/internal/http1/a;", "Lokhttp3/internal/http1/a;", "headersReader", "", "I", "state", "<init>", "(Lokhttp3/c0;Lokhttp3/internal/connection/f;Lokio/o;Lokio/n;)V", "r", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class b implements okhttp3.internal.http.d
{
    private static final long j = -1L;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final int p = 5;
    private static final int q = 6;
    public static final d r;
    private int c;
    private final okhttp3.internal.http1.a d;
    private v e;
    private final c0 f;
    @org.jetbrains.annotations.e
    private final okhttp3.internal.connection.f g;
    private final o h;
    private final n i;
    
    static {
        r = new d(null);
    }
    
    public b(@org.jetbrains.annotations.f final c0 f, @org.jetbrains.annotations.e final okhttp3.internal.connection.f g, @org.jetbrains.annotations.e final o h, @org.jetbrains.annotations.e final n i) {
        k0.p((Object)g, "connection");
        k0.p((Object)h, "source");
        k0.p((Object)i, "sink");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.d = new okhttp3.internal.http1.a(h);
    }
    
    private final r0 A() {
        if (this.c == 4) {
            this.c = 5;
            this.e().G();
            return new g();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final /* synthetic */ c0 k(final b b) {
        return b.f;
    }
    
    public static final /* synthetic */ okhttp3.internal.http1.a l(final b b) {
        return b.d;
    }
    
    public static final /* synthetic */ n m(final b b) {
        return b.i;
    }
    
    public static final /* synthetic */ o n(final b b) {
        return b.h;
    }
    
    public static final /* synthetic */ int o(final b b) {
        return b.c;
    }
    
    public static final /* synthetic */ v p(final b b) {
        return b.e;
    }
    
    public static final /* synthetic */ void q(final b b, final int c) {
        b.c = c;
    }
    
    public static final /* synthetic */ void r(final b b, final v e) {
        b.e = e;
    }
    
    private final void s(final okio.w w) {
        final t0 l = w.l();
        w.m(t0.d);
        l.a();
        l.b();
    }
    
    private final boolean t(final e0 e0) {
        return s.K1("chunked", e0.i("Transfer-Encoding"), true);
    }
    
    private final boolean u(final g0 g0) {
        return s.K1("chunked", g0.G(g0, "Transfer-Encoding", null, 2, null), true);
    }
    
    private final p0 w() {
        final int c = this.c;
        boolean b = true;
        if (c != 1) {
            b = false;
        }
        if (b) {
            this.c = 2;
            return new b();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final r0 x(final okhttp3.w w) {
        if (this.c == 4) {
            this.c = 5;
            return new c(w);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final r0 y(final long n) {
        if (this.c == 4) {
            this.c = 5;
            return new e(n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final p0 z() {
        final int c = this.c;
        boolean b = true;
        if (c != 1) {
            b = false;
        }
        if (b) {
            this.c = 2;
            return new f();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void B(@org.jetbrains.annotations.e final g0 g0) {
        k0.p((Object)g0, "response");
        final long x = okhttp3.internal.d.x(g0);
        if (x == -1L) {
            return;
        }
        final r0 y = this.y(x);
        okhttp3.internal.d.T(y, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        y.close();
    }
    
    public final void C(@org.jetbrains.annotations.e final v v, @org.jetbrains.annotations.e final String s) {
        k0.p((Object)v, "headers");
        k0.p((Object)s, "requestLine");
        final int c = this.c;
        final int n = 0;
        if (c == 0) {
            this.i.Q2(s).Q2("\r\n");
            for (int size = v.size(), i = n; i < size; ++i) {
                this.i.Q2(v.n(i)).Q2(": ").Q2(v.v(i)).Q2("\r\n");
            }
            this.i.Q2("\r\n");
            this.c = 1;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @Override
    public void a() {
        this.i.flush();
    }
    
    @Override
    public void b(@org.jetbrains.annotations.e final e0 e0) {
        k0.p((Object)e0, "request");
        final i a = okhttp3.internal.http.i.a;
        final Proxy.Type type = this.e().b().e().type();
        k0.o((Object)type, "connection.route().proxy.type()");
        this.C(e0.k(), a.a(e0, type));
    }
    
    @org.jetbrains.annotations.e
    @Override
    public r0 c(@org.jetbrains.annotations.e final g0 g0) {
        k0.p((Object)g0, "response");
        long x;
        if (!okhttp3.internal.http.e.c(g0)) {
            x = 0L;
        }
        else {
            if (this.u(g0)) {
                return this.x(g0.W().q());
            }
            x = okhttp3.internal.d.x(g0);
            if (x == -1L) {
                return this.A();
            }
        }
        return this.y(x);
    }
    
    @Override
    public void cancel() {
        this.e().k();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public g0.a d(final boolean b) {
        final int c = this.c;
        int n = 1;
        if (c != 1) {
            if (c == 3) {
                n = n;
            }
            else {
                n = 0;
            }
        }
        if (n != 0) {
            try {
                final k b2 = okhttp3.internal.http.k.h.b(this.d.c());
                Object w = new g0.a().B(b2.a).g(b2.b).y(b2.c).w(this.d.b());
                if (b && b2.b == 100) {
                    w = null;
                }
                else if (b2.b == 100) {
                    this.c = 3;
                }
                else {
                    this.c = 4;
                }
                return (g0.a)w;
            }
            catch (EOFException cause) {
                final String v = this.e().b().d().w().V();
                final StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(v);
                throw new IOException(sb.toString(), cause);
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("state: ");
        sb2.append(this.c);
        throw new IllegalStateException(sb2.toString().toString());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public okhttp3.internal.connection.f e() {
        return this.g;
    }
    
    @Override
    public void f() {
        this.i.flush();
    }
    
    @Override
    public long g(@org.jetbrains.annotations.e final g0 g0) {
        k0.p((Object)g0, "response");
        long x;
        if (!okhttp3.internal.http.e.c(g0)) {
            x = 0L;
        }
        else if (this.u(g0)) {
            x = -1L;
        }
        else {
            x = okhttp3.internal.d.x(g0);
        }
        return x;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public v h() {
        if (this.c == 6) {
            v v = this.e;
            if (v == null) {
                v = okhttp3.internal.d.b;
            }
            return v;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public p0 i(@org.jetbrains.annotations.e final e0 e0, final long n) {
        k0.p((Object)e0, "request");
        if (e0.f() != null && e0.f().p()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        p0 p2;
        if (this.t(e0)) {
            p2 = this.w();
        }
        else {
            if (n == -1L) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            p2 = this.z();
        }
        return p2;
    }
    
    public final boolean v() {
        return this.c == 6;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001c\u0010\u0003\u001a\u00020\u000b8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a" }, d2 = { "okhttp3/internal/http1/b$a", "Lokio/r0;", "Lokio/t0;", "timeout", "Lokio/m;", "sink", "", "byteCount", "read", "Lkotlin/j2;", "c", "Lokio/w;", "G", "Lokio/w;", "b", "()Lokio/w;", "", "H", "Z", "a", "()Z", "d", "(Z)V", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private abstract class a implements r0
    {
        @org.jetbrains.annotations.e
        private final okio.w G;
        private boolean H;
        
        public a() {
            this.G = new okio.w(b.n(b.this).timeout());
        }
        
        protected final boolean a() {
            return this.H;
        }
        
        @org.jetbrains.annotations.e
        protected final okio.w b() {
            return this.G;
        }
        
        public final void c() {
            if (b.o(b.this) == 6) {
                return;
            }
            if (b.o(b.this) == 5) {
                b.this.s(this.G);
                b.q(b.this, 6);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("state: ");
            sb.append(b.o(b.this));
            throw new IllegalStateException(sb.toString());
        }
        
        protected final void d(final boolean h) {
            this.H = h;
        }
        
        @Override
        public long read(@org.jetbrains.annotations.e final m m, long read) {
            k0.p((Object)m, "sink");
            try {
                read = b.n(b.this).read(m, read);
                return read;
            }
            catch (IOException ex) {
                b.this.e().G();
                this.c();
                throw ex;
            }
        }
        
        @org.jetbrains.annotations.e
        @Override
        public t0 timeout() {
            return this.G;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0016\u0010\u0003\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "okhttp3/internal/http1/b$b", "Lokio/p0;", "Lokio/t0;", "timeout", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "close", "Lokio/w;", "G", "Lokio/w;", "", "H", "Z", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class b implements p0
    {
        private final okio.w G;
        private boolean H;
        
        public b() {
            this.G = new okio.w(okhttp3.internal.http1.b.m(okhttp3.internal.http1.b.this).timeout());
        }
        
        @Override
        public void close() {
            synchronized (this) {
                if (this.H) {
                    return;
                }
                this.H = true;
                okhttp3.internal.http1.b.m(okhttp3.internal.http1.b.this).Q2("0\r\n\r\n");
                okhttp3.internal.http1.b.this.s(this.G);
                okhttp3.internal.http1.b.q(okhttp3.internal.http1.b.this, 3);
            }
        }
        
        @Override
        public void flush() {
            synchronized (this) {
                if (this.H) {
                    return;
                }
                okhttp3.internal.http1.b.m(okhttp3.internal.http1.b.this).flush();
            }
        }
        
        @Override
        public void t3(@org.jetbrains.annotations.e final m m, final long n) {
            k0.p((Object)m, "source");
            if (!(this.H ^ true)) {
                throw new IllegalStateException("closed".toString());
            }
            if (n == 0L) {
                return;
            }
            okhttp3.internal.http1.b.m(okhttp3.internal.http1.b.this).A3(n);
            okhttp3.internal.http1.b.m(okhttp3.internal.http1.b.this).Q2("\r\n");
            okhttp3.internal.http1.b.m(okhttp3.internal.http1.b.this).t3(m, n);
            okhttp3.internal.http1.b.m(okhttp3.internal.http1.b.this).Q2("\r\n");
        }
        
        @org.jetbrains.annotations.e
        @Override
        public t0 timeout() {
            return this.G;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0013¨\u0006\u0017" }, d2 = { "okhttp3/internal/http1/b$c", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lkotlin/j2;", "e", "Lokio/m;", "sink", "", "byteCount", "read", "close", "Lokhttp3/w;", "L", "Lokhttp3/w;", "url", "", "K", "Z", "hasMoreChunks", "J", "bytesRemainingInChunk", "<init>", "(Lokhttp3/internal/http1/b;Lokhttp3/w;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class c extends a
    {
        private long J;
        private boolean K;
        private final okhttp3.w L;
        
        public c(final okhttp3.w l) {
            k0.p((Object)l, "url");
            this.L = l;
            this.J = -1L;
            this.K = true;
        }
        
        private final void e() {
            if (this.J != -1L) {
                b.n(b.this).e4();
            }
            try {
                this.J = b.n(b.this).L5();
                final String e4 = b.n(b.this).e4();
                if (e4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                final String string = s.B5(e4).toString();
                if (this.J >= 0L && (string.length() <= 0 || s.u2(string, ";", false, 2, null))) {
                    if (this.J == 0L) {
                        this.K = false;
                        final b m = b.this;
                        b.r(m, b.l(m).b());
                        final c0 k = b.k(b.this);
                        k0.m((Object)k);
                        final okhttp3.o v = k.V();
                        final okhttp3.w l = this.L;
                        final v p = b.p(b.this);
                        k0.m((Object)p);
                        okhttp3.internal.http.e.g(v, l, p);
                        ((a)this).c();
                    }
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("expected chunk size and optional extensions");
                sb.append(" but was \"");
                sb.append(this.J);
                sb.append(string);
                sb.append('\"');
                throw new ProtocolException(sb.toString());
            }
            catch (NumberFormatException ex) {
                throw new ProtocolException(ex.getMessage());
            }
        }
        
        @Override
        public void close() {
            if (((a)this).a()) {
                return;
            }
            if (this.K && !okhttp3.internal.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.e().G();
                ((a)this).c();
            }
            ((a)this).d(true);
        }
        
        @Override
        public long read(@org.jetbrains.annotations.e final m m, long read) {
            k0.p((Object)m, "sink");
            if (read < 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(read);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (!(true ^ ((a)this).a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.K) {
                return -1L;
            }
            final long j = this.J;
            if (j == 0L || j == -1L) {
                this.e();
                if (!this.K) {
                    return -1L;
                }
            }
            read = super.read(m, Math.min(read, this.J));
            if (read != -1L) {
                this.J -= read;
                return read;
            }
            b.this.e().G();
            final ProtocolException ex = new ProtocolException("unexpected end of stream");
            ((a)this).c();
            throw ex;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010" }, d2 = { "okhttp3/internal/http1/b$d", "", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class d
    {
        private d() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\n¨\u0006\u000e" }, d2 = { "okhttp3/internal/http1/b$e", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lokio/m;", "sink", "", "byteCount", "read", "Lkotlin/j2;", "close", "J", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/b;J)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class e extends a
    {
        private long J;
        
        public e(final long j) {
            this.J = j;
            if (j == 0L) {
                ((a)this).c();
            }
        }
        
        @Override
        public void close() {
            if (((a)this).a()) {
                return;
            }
            if (this.J != 0L && !okhttp3.internal.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.e().G();
                ((a)this).c();
            }
            ((a)this).d(true);
        }
        
        @Override
        public long read(@org.jetbrains.annotations.e final m m, long read) {
            k0.p((Object)m, "sink");
            if (read < 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(read);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (!(true ^ ((a)this).a())) {
                throw new IllegalStateException("closed".toString());
            }
            final long j = this.J;
            if (j == 0L) {
                return -1L;
            }
            read = super.read(m, Math.min(j, read));
            if (read != -1L) {
                final long i = this.J - read;
                this.J = i;
                if (i == 0L) {
                    ((a)this).c();
                }
                return read;
            }
            b.this.e().G();
            final ProtocolException ex = new ProtocolException("unexpected end of stream");
            ((a)this).c();
            throw ex;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "okhttp3/internal/http1/b$f", "Lokio/p0;", "Lokio/t0;", "timeout", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "close", "", "H", "Z", "closed", "Lokio/w;", "G", "Lokio/w;", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class f implements p0
    {
        private final okio.w G;
        private boolean H;
        
        public f() {
            this.G = new okio.w(b.m(b.this).timeout());
        }
        
        @Override
        public void close() {
            if (this.H) {
                return;
            }
            this.H = true;
            b.this.s(this.G);
            b.q(b.this, 3);
        }
        
        @Override
        public void flush() {
            if (this.H) {
                return;
            }
            b.m(b.this).flush();
        }
        
        @Override
        public void t3(@org.jetbrains.annotations.e final m m, final long n) {
            k0.p((Object)m, "source");
            if (this.H ^ true) {
                okhttp3.internal.d.k(m.h0(), 0L, n);
                b.m(b.this).t3(m, n);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
        
        @org.jetbrains.annotations.e
        @Override
        public t0 timeout() {
            return this.G;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "okhttp3/internal/http1/b$g", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lokio/m;", "sink", "", "byteCount", "read", "Lkotlin/j2;", "close", "", "J", "Z", "inputExhausted", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class g extends a
    {
        private boolean J;
        
        public g() {
        }
        
        @Override
        public void close() {
            if (((a)this).a()) {
                return;
            }
            if (!this.J) {
                ((a)this).c();
            }
            ((a)this).d(true);
        }
        
        @Override
        public long read(@org.jetbrains.annotations.e final m m, long read) {
            k0.p((Object)m, "sink");
            if (read < 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(read);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (!(((a)this).a() ^ true)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.J) {
                return -1L;
            }
            read = super.read(m, read);
            if (read == -1L) {
                this.J = true;
                ((a)this).c();
                return -1L;
            }
            return read;
        }
    }
}
