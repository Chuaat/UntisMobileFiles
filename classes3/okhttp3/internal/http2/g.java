// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import java.net.ProtocolException;
import okhttp3.internal.http.k;
import java.util.Objects;
import java.util.Locale;
import java.util.ArrayList;
import okio.p0;
import okhttp3.v;
import okio.r0;
import okhttp3.g0;
import okio.t0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.e0;
import kotlin.jvm.internal.k0;
import okhttp3.c0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import okhttp3.internal.connection.f;
import okhttp3.d0;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u001c\u0010*\u001a\u00020'8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b\u0018\u0010)¨\u00060" }, d2 = { "Lokhttp3/internal/http2/g;", "Lokhttp3/internal/http/d;", "Lokhttp3/e0;", "request", "", "contentLength", "Lokio/p0;", "i", "Lkotlin/j2;", "b", "f", "a", "", "expectContinue", "Lokhttp3/g0$a;", "d", "Lokhttp3/g0;", "response", "g", "Lokio/r0;", "c", "Lokhttp3/v;", "h", "cancel", "e", "Z", "canceled", "Lokhttp3/internal/http2/f;", "Lokhttp3/internal/http2/f;", "http2Connection", "Lokhttp3/internal/http/g;", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/d0;", "Lokhttp3/d0;", "protocol", "Lokhttp3/internal/http2/i;", "Lokhttp3/internal/http2/i;", "stream", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "()Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/c0;", "client", "<init>", "(Lokhttp3/c0;Lokhttp3/internal/connection/f;Lokhttp3/internal/http/g;Lokhttp3/internal/http2/f;)V", "s", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class g implements d
{
    private static final String i = "connection";
    private static final String j = "host";
    private static final String k = "keep-alive";
    private static final String l = "proxy-connection";
    private static final String m = "transfer-encoding";
    private static final String n = "te";
    private static final String o = "encoding";
    private static final String p = "upgrade";
    private static final List<String> q;
    private static final List<String> r;
    public static final a s;
    private volatile i c;
    private final d0 d;
    private volatile boolean e;
    @e
    private final f f;
    private final okhttp3.internal.http.g g;
    private final okhttp3.internal.http2.f h;
    
    static {
        s = new a(null);
        q = okhttp3.internal.d.z("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
        r = okhttp3.internal.d.z("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    }
    
    public g(@e final c0 c0, @e final f f, @e final okhttp3.internal.http.g g, @e final okhttp3.internal.http2.f h) {
        k0.p((Object)c0, "client");
        k0.p((Object)f, "connection");
        k0.p((Object)g, "chain");
        k0.p((Object)h, "http2Connection");
        this.f = f;
        this.g = g;
        this.h = h;
        final List<d0> i0 = c0.i0();
        d0 d = d0.L;
        if (!i0.contains(d)) {
            d = d0.K;
        }
        this.d = d;
    }
    
    public static final /* synthetic */ List j() {
        return g.q;
    }
    
    public static final /* synthetic */ List k() {
        return g.r;
    }
    
    @Override
    public void a() {
        final i c = this.c;
        k0.m((Object)c);
        c.o().close();
    }
    
    @Override
    public void b(@e final e0 e0) {
        k0.p((Object)e0, "request");
        if (this.c != null) {
            return;
        }
        this.c = this.h.e0(okhttp3.internal.http2.g.s.a(e0), e0.f() != null);
        if (!this.e) {
            final i c = this.c;
            k0.m((Object)c);
            final t0 x = c.x();
            final long n = this.g.o();
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            x.i(n, milliseconds);
            final i c2 = this.c;
            k0.m((Object)c2);
            c2.L().i(this.g.q(), milliseconds);
            return;
        }
        final i c3 = this.c;
        k0.m((Object)c3);
        c3.f(okhttp3.internal.http2.b.P);
        throw new IOException("Canceled");
    }
    
    @e
    @Override
    public r0 c(@e final g0 g0) {
        k0.p((Object)g0, "response");
        final i c = this.c;
        k0.m((Object)c);
        return c.r();
    }
    
    @Override
    public void cancel() {
        this.e = true;
        final i c = this.c;
        if (c != null) {
            c.f(okhttp3.internal.http2.b.P);
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public g0.a d(final boolean b) {
        final i c = this.c;
        k0.m((Object)c);
        g0.a b2;
        final g0.a a = b2 = okhttp3.internal.http2.g.s.b(c.H(), this.d);
        if (b) {
            b2 = a;
            if (a.j() == 100) {
                b2 = null;
            }
        }
        return b2;
    }
    
    @e
    @Override
    public f e() {
        return this.f;
    }
    
    @Override
    public void f() {
        this.h.flush();
    }
    
    @Override
    public long g(@e final g0 g0) {
        k0.p((Object)g0, "response");
        long x;
        if (!okhttp3.internal.http.e.c(g0)) {
            x = 0L;
        }
        else {
            x = okhttp3.internal.d.x(g0);
        }
        return x;
    }
    
    @e
    @Override
    public v h() {
        final i c = this.c;
        k0.m((Object)c);
        return c.I();
    }
    
    @e
    @Override
    public p0 i(@e final e0 e0, final long n) {
        k0.p((Object)e0, "request");
        final i c = this.c;
        k0.m((Object)c);
        return c.o();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c" }, d2 = { "okhttp3/internal/http2/g$a", "", "Lokhttp3/e0;", "request", "", "Lokhttp3/internal/http2/c;", "a", "Lokhttp3/v;", "headerBlock", "Lokhttp3/d0;", "protocol", "Lokhttp3/g0$a;", "b", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final List<c> a(@e final e0 e0) {
            k0.p((Object)e0, "request");
            final v k = e0.k();
            final ArrayList list = new ArrayList<c>(k.size() + 4);
            list.add(new c(okhttp3.internal.http2.c.k, e0.m()));
            list.add(new c(okhttp3.internal.http2.c.l, okhttp3.internal.http.i.a.c(e0.q())));
            final String i = e0.i("Host");
            if (i != null) {
                list.add(new c(okhttp3.internal.http2.c.n, i));
            }
            list.add(new c(okhttp3.internal.http2.c.m, e0.q().X()));
            for (int j = 0; j < k.size(); ++j) {
                final String n = k.n(j);
                final Locale us = Locale.US;
                k0.o((Object)us, "Locale.US");
                Objects.requireNonNull(n, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase = n.toLowerCase(us);
                k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!okhttp3.internal.http2.g.j().contains(lowerCase) || (k0.g((Object)lowerCase, (Object)"te") && k0.g((Object)k.v(j), (Object)"trailers"))) {
                    list.add(new c(lowerCase, k.v(j)));
                }
            }
            return (List<c>)list;
        }
        
        @e
        public final g0.a b(@e final v v, @e final d0 d0) {
            k0.p((Object)v, "headerBlock");
            k0.p((Object)d0, "protocol");
            final v.a a = new v.a();
            final int size = v.size();
            k k = null;
            k b;
            for (int i = 0; i < size; ++i, k = b) {
                final String n = v.n(i);
                final String v2 = v.v(i);
                if (k0.g((Object)n, (Object)":status")) {
                    final k.a h = okhttp3.internal.http.k.h;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("HTTP/1.1 ");
                    sb.append(v2);
                    b = h.b(sb.toString());
                }
                else {
                    b = k;
                    if (!okhttp3.internal.http2.g.k().contains(n)) {
                        a.g(n, v2);
                        b = k;
                    }
                }
            }
            if (k != null) {
                return new g0.a().B(d0).g(k.b).y(k.c).w(a.i());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }
}
