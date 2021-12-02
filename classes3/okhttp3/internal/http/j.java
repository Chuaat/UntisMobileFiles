// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import java.util.Collection;
import java.util.List;
import okhttp3.internal.http2.a;
import java.io.Closeable;
import okhttp3.h0;
import kotlin.collections.v;
import kotlin.text.o;
import java.io.FileNotFoundException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.net.SocketTimeoutException;
import java.io.InterruptedIOException;
import java.io.IOException;
import okhttp3.i0;
import java.net.ProtocolException;
import java.net.Proxy;
import okhttp3.internal.connection.c;
import okhttp3.f0;
import okhttp3.internal.d;
import okhttp3.e0;
import okhttp3.g0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import kotlin.Metadata;
import okhttp3.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/http/j;", "Lokhttp3/x;", "Ljava/io/IOException;", "e", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/e0;", "userRequest", "", "requestSendStarted", "d", "c", "Lokhttp3/g0;", "userResponse", "Lokhttp3/internal/connection/c;", "exchange", "b", "", "method", "a", "", "defaultDelay", "f", "Lokhttp3/x$a;", "chain", "intercept", "Lokhttp3/c0;", "Lokhttp3/c0;", "client", "<init>", "(Lokhttp3/c0;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class j implements x
{
    private static final int c = 20;
    public static final a d;
    private final c0 b;
    
    static {
        d = new a(null);
    }
    
    public j(@e final c0 b) {
        k0.p((Object)b, "client");
        this.b = b;
    }
    
    private final e0 a(final g0 g0, final String s) {
        final boolean z = this.b.Z();
        f0 f = null;
        if (!z) {
            return null;
        }
        final String g2 = g0.G(g0, "Location", null, 2, null);
        if (g2 != null) {
            final okhttp3.w w = g0.W().q().W(g2);
            if (w != null) {
                if (!k0.g((Object)w.X(), (Object)g0.W().q().X()) && !this.b.a0()) {
                    return null;
                }
                final e0.a n = g0.W().n();
                if (okhttp3.internal.http.f.b(s)) {
                    final int x = g0.x();
                    final f a = okhttp3.internal.http.f.a;
                    final boolean b = a.d(s) || x == 308 || x == 307;
                    String s2;
                    if (a.c(s) && x != 308 && x != 307) {
                        s2 = "GET";
                    }
                    else {
                        s2 = s;
                        if (b) {
                            f = g0.W().f();
                            s2 = s;
                        }
                    }
                    n.p(s2, f);
                    if (!b) {
                        n.t("Transfer-Encoding");
                        n.t("Content-Length");
                        n.t("Content-Type");
                    }
                }
                if (!okhttp3.internal.d.i(g0.W().q(), w)) {
                    n.t("Authorization");
                }
                return n.D(w).b();
            }
        }
        return null;
    }
    
    private final e0 b(final g0 g0, final c c) throws IOException {
        i0 b = null;
        Label_0023: {
            if (c != null) {
                final okhttp3.internal.connection.f h = c.h();
                if (h != null) {
                    b = h.b();
                    break Label_0023;
                }
            }
            b = null;
        }
        final int x = g0.x();
        final String m = g0.W().m();
        if (x != 307 && x != 308) {
            if (x == 401) {
                return this.b.N().a(b, g0);
            }
            if (x != 421) {
                if (x != 503) {
                    if (x != 407) {
                        if (x != 408) {
                            switch (x) {
                                default: {
                                    return null;
                                }
                                case 300:
                                case 301:
                                case 302:
                                case 303: {
                                    break;
                                }
                            }
                        }
                        else {
                            if (!this.b.n0()) {
                                return null;
                            }
                            final f0 f = g0.W().f();
                            if (f != null && f.q()) {
                                return null;
                            }
                            final g0 s = g0.S();
                            if (s != null && s.x() == 408) {
                                return null;
                            }
                            if (this.f(g0, 0) > 0) {
                                return null;
                            }
                            return g0.W();
                        }
                    }
                    else {
                        k0.m((Object)b);
                        if (b.e().type() == Proxy.Type.HTTP) {
                            return this.b.k0().a(b, g0);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                }
                else {
                    final g0 s2 = g0.S();
                    if (s2 != null && s2.x() == 503) {
                        return null;
                    }
                    if (this.f(g0, Integer.MAX_VALUE) == 0) {
                        return g0.W();
                    }
                    return null;
                }
            }
            else {
                final f0 f2 = g0.W().f();
                if (f2 != null && f2.q()) {
                    return null;
                }
                if (c != null && c.k()) {
                    c.h().F();
                    return g0.W();
                }
                return null;
            }
        }
        return this.a(g0, m);
    }
    
    private final boolean c(final IOException ex, final boolean b) {
        final boolean b2 = ex instanceof ProtocolException;
        final boolean b3 = false;
        if (b2) {
            return false;
        }
        if (ex instanceof InterruptedIOException) {
            boolean b4 = b3;
            if (ex instanceof SocketTimeoutException) {
                b4 = b3;
                if (!b) {
                    b4 = true;
                }
            }
            return b4;
        }
        return (!(ex instanceof SSLHandshakeException) || !(ex.getCause() instanceof CertificateException)) && !(ex instanceof SSLPeerUnverifiedException);
    }
    
    private final boolean d(final IOException ex, final okhttp3.internal.connection.e e, final e0 e2, final boolean b) {
        return this.b.n0() && (!b || !this.e(ex, e2)) && this.c(ex, b) && e.B();
    }
    
    private final boolean e(final IOException ex, final e0 e0) {
        final f0 f = e0.f();
        return (f != null && f.q()) || ex instanceof FileNotFoundException;
    }
    
    private final int f(final g0 g0, final int n) {
        final String g2 = g0.G(g0, "Retry-After", null, 2, null);
        if (g2 == null) {
            return n;
        }
        if (new o("\\d+").i(g2)) {
            final Integer value = Integer.valueOf(g2);
            k0.o((Object)value, "Integer.valueOf(header)");
            return value;
        }
        return Integer.MAX_VALUE;
    }
    
    @e
    @Override
    public g0 intercept(@e x.a a) throws IOException {
        k0.p((Object)a, "chain");
        final g g = (g)a;
        a = (x.a)g.p();
        final okhttp3.internal.connection.e l = g.l();
        Object o = v.E();
        Object o2 = null;
        boolean b = true;
        int i = 0;
        while (true) {
            l.j((e0)a, b);
            try {
                b = l.K();
                if (!b) {
                    IOException b2 = null;
                    try {
                        final g0 g2 = (g0)(a = (x.a)g.e((e0)a));
                        if (o2 != null) {
                            a = (x.a)g2.Q().A(((g0)o2).Q().b(null).c()).c();
                        }
                        o2 = a;
                        final c t = l.t();
                        a = (x.a)this.b((g0)o2, t);
                        if (a == null) {
                            if (t != null && t.l()) {
                                l.E();
                            }
                            l.l(false);
                            return (g0)o2;
                        }
                        final f0 f = ((e0)a).f();
                        if (f != null) {
                            b = f.q();
                            if (b) {
                                l.l(false);
                                return (g0)o2;
                            }
                        }
                        final h0 r = ((g0)o2).r();
                        if (r != null) {
                            okhttp3.internal.d.l(r);
                        }
                        if (++i <= 20) {
                            l.l(true);
                            b = true;
                            continue;
                        }
                        a = (x.a)new StringBuilder();
                        ((StringBuilder)a).append("Too many follow-up requests: ");
                        ((StringBuilder)a).append(i);
                        o = new ProtocolException(((StringBuilder)a).toString());
                        throw o;
                    }
                    catch (IOException b2) {
                        b = !(b2 instanceof okhttp3.internal.http2.a);
                        if (!this.d(b2, l, (e0)a, b)) {
                            throw okhttp3.internal.d.j0(b2, (List<? extends Exception>)o);
                        }
                    }
                    catch (okhttp3.internal.connection.j j) {
                        if (!this.d(j.c(), l, (e0)a, false)) {
                            throw okhttp3.internal.d.j0(j.b(), (List<? extends Exception>)o);
                        }
                        b2 = j.b();
                    }
                    o = v.r4((Collection)o, (Object)b2);
                    l.l(true);
                    b = false;
                    continue;
                }
                throw new IOException("Canceled");
            }
            finally {
                l.l(true);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/internal/http/j$a", "", "", "MAX_FOLLOW_UPS", "I", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
