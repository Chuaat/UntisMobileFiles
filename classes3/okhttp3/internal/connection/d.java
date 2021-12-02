// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import okhttp3.internal.http2.b;
import okhttp3.internal.http2.n;
import okhttp3.w;
import okhttp3.internal.http.g;
import okhttp3.c0;
import java.net.Socket;
import java.io.IOException;
import java.util.List;
import okhttp3.j;
import kotlin.j2;
import kotlin.jvm.internal.k0;
import okhttp3.s;
import org.jetbrains.annotations.e;
import okhttp3.a;
import okhttp3.i0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b8\u00109J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u001c\u0010)\u001a\u00020%8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00106¨\u0006:" }, d2 = { "Lokhttp3/internal/connection/d;", "", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/f;", "c", "b", "Lokhttp3/i0;", "f", "Lokhttp3/c0;", "client", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http/d;", "a", "Ljava/io/IOException;", "e", "Lkotlin/j2;", "h", "Lokhttp3/w;", "url", "g", "I", "refusedStreamCount", "Lokhttp3/internal/connection/e;", "i", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/internal/connection/k;", "Lokhttp3/internal/connection/k;", "routeSelector", "Lokhttp3/a;", "Lokhttp3/a;", "d", "()Lokhttp3/a;", "address", "Lokhttp3/i0;", "nextRouteToTry", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "connectionPool", "otherFailureCount", "connectionShutdownCount", "Lokhttp3/s;", "j", "Lokhttp3/s;", "eventListener", "Lokhttp3/internal/connection/k$b;", "Lokhttp3/internal/connection/k$b;", "routeSelection", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/a;Lokhttp3/internal/connection/e;Lokhttp3/s;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d
{
    private k.b a;
    private k b;
    private int c;
    private int d;
    private int e;
    private i0 f;
    private final h g;
    @e
    private final a h;
    private final okhttp3.internal.connection.e i;
    private final s j;
    
    public d(@e final h g, @e final a h, @e final okhttp3.internal.connection.e i, @e final s j) {
        k0.p((Object)g, "connectionPool");
        k0.p((Object)h, "address");
        k0.p((Object)i, "call");
        k0.p((Object)j, "eventListener");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private final f b(int n, final int n2, final int n3, final int n4, final boolean b) throws IOException {
        if (!this.i.K()) {
            final f n5 = this.i.n();
            final int n6 = 1;
            if (n5 != null) {
                synchronized (n5) {
                    Socket a;
                    if (!n5.x() && this.g(n5.b().d().w())) {
                        a = null;
                    }
                    else {
                        a = this.i.A();
                    }
                    final j2 a2 = j2.a;
                    // monitorexit(n5)
                    if (this.i.n() != null) {
                        if (a == null) {
                            n = n6;
                        }
                        else {
                            n = 0;
                        }
                        if (n != 0) {
                            return n5;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    else {
                        if (a != null) {
                            okhttp3.internal.d.n(a);
                        }
                        this.j.l(this.i, n5);
                    }
                }
            }
            this.c = 0;
            this.d = 0;
            this.e = 0;
            final f n7;
            Label_0208: {
                Label_0194: {
                    if (!this.g.a(this.h, this.i, null, false)) {
                        i0 f = this.f;
                        List<i0> a5 = null;
                        Label_0409: {
                            Label_0245: {
                                if (f != null) {
                                    k0.m((Object)f);
                                    this.f = null;
                                }
                                else {
                                    final k.b a3 = this.a;
                                    if (a3 != null) {
                                        k0.m((Object)a3);
                                        if (a3.b()) {
                                            final k.b a4 = this.a;
                                            k0.m((Object)a4);
                                            f = a4.c();
                                            break Label_0245;
                                        }
                                    }
                                    k b2;
                                    if ((b2 = this.b) == null) {
                                        b2 = new k(this.h, this.i.m().b0(), this.i, this.j);
                                        this.b = b2;
                                    }
                                    final k.b d = b2.d();
                                    this.a = d;
                                    a5 = d.a();
                                    if (this.i.K()) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.g.a(this.h, this.i, a5, false)) {
                                        break Label_0194;
                                    }
                                    f = d.c();
                                    break Label_0409;
                                }
                            }
                            a5 = null;
                        }
                        final f f2 = new f(this.g, f);
                        this.i.C(f2);
                        try {
                            f2.m(n, n2, n3, n4, b, this.i, this.j);
                            this.i.C(null);
                            this.i.m().b0().a(f2.b());
                            if (this.g.a(this.h, this.i, a5, true)) {
                                k0.m((Object)this.i.n());
                                this.f = f;
                                okhttp3.internal.d.n(f2.d());
                                break Label_0208;
                            }
                            synchronized (f2) {
                                this.g.h(f2);
                                this.i.c(f2);
                                final j2 a6 = j2.a;
                                // monitorexit(f2)
                                this.j.k(this.i, f2);
                                return f2;
                            }
                        }
                        finally {
                            this.i.C(null);
                        }
                        throw new IOException("Canceled");
                    }
                }
                n7 = this.i.n();
                k0.m((Object)n7);
            }
            this.j.k(this.i, n7);
            return n7;
        }
        throw new IOException("Canceled");
    }
    
    private final f c(final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) throws IOException {
        while (true) {
            final f b3 = this.b(n, n2, n3, n4, b);
            if (b3.B(b2)) {
                return b3;
            }
            b3.G();
            if (this.f != null) {
                continue;
            }
            final k.b a = this.a;
            final int n5 = 1;
            if (a == null || a.b()) {
                continue;
            }
            final k b4 = this.b;
            int b5 = n5;
            if (b4 != null) {
                b5 = (b4.b() ? 1 : 0);
            }
            if (b5 != 0) {
                continue;
            }
            throw new IOException("exhausted all routes");
        }
    }
    
    private final i0 f() {
        if (this.c <= 1 && this.d <= 1) {
            if (this.e <= 0) {
                final f n = this.i.n();
                if (n != null) {
                    synchronized (n) {
                        if (n.y() != 0) {
                            return null;
                        }
                        if (!okhttp3.internal.d.i(n.b().d().w(), this.h.w())) {
                            return null;
                        }
                        return n.b();
                    }
                }
            }
        }
        return null;
    }
    
    @e
    public final okhttp3.internal.http.d a(@e final c0 c0, @e final g g) {
        k0.p((Object)c0, "client");
        k0.p((Object)g, "chain");
        try {
            return this.c(g.m(), g.o(), g.q(), c0.h0(), c0.n0(), k0.g((Object)g.p().m(), (Object)"GET") ^ true).D(c0, g);
        }
        catch (IOException ex) {
            this.h(ex);
            throw new okhttp3.internal.connection.j(ex);
        }
        catch (okhttp3.internal.connection.j j) {
            this.h(j.c());
            throw j;
        }
    }
    
    @e
    public final a d() {
        return this.h;
    }
    
    public final boolean e() {
        if (this.c == 0 && this.d == 0 && this.e == 0) {
            return false;
        }
        if (this.f != null) {
            return true;
        }
        final i0 f = this.f();
        if (f != null) {
            this.f = f;
            return true;
        }
        final k.b a = this.a;
        if (a != null && a.b()) {
            return true;
        }
        final k b = this.b;
        return b == null || b.b();
    }
    
    public final boolean g(@e final w w) {
        k0.p((Object)w, "url");
        final w w2 = this.h.w();
        return w.N() == w2.N() && k0.g((Object)w.F(), (Object)w2.F());
    }
    
    public final void h(@e final IOException ex) {
        k0.p((Object)ex, "e");
        this.f = null;
        if (ex instanceof n && ((n)ex).G == okhttp3.internal.http2.b.O) {
            ++this.c;
        }
        else if (ex instanceof okhttp3.internal.http2.a) {
            ++this.d;
        }
        else {
            ++this.e;
        }
    }
}
