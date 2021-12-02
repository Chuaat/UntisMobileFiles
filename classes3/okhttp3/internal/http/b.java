// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.h0;
import okio.n;
import okhttp3.f0;
import okhttp3.e0;
import okhttp3.internal.connection.c;
import java.net.ProtocolException;
import okhttp3.internal.d;
import okio.d0;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import okhttp3.g0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import okhttp3.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lokhttp3/internal/http/b;", "Lokhttp3/x;", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "intercept", "", "b", "Z", "forWebSocket", "<init>", "(Z)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class b implements x
{
    private final boolean b;
    
    public b(final boolean b) {
        this.b = b;
    }
    
    @e
    @Override
    public g0 intercept(@e final a a) throws IOException {
        k0.p((Object)a, "chain");
        final g g = (g)a;
        final c n = g.n();
        k0.m((Object)n);
        final e0 p = g.p();
        final f0 f = p.f();
        final long currentTimeMillis = System.currentTimeMillis();
        n.w(p);
        final boolean b = okhttp3.internal.http.f.b(p.m());
        final Object o = null;
        Object o2;
        boolean b3;
        if (b && f != null) {
            g0.a q;
            boolean b2;
            if (s.K1("100-continue", p.i("Expect"), true)) {
                n.f();
                q = n.q(true);
                n.s();
                b2 = false;
            }
            else {
                q = null;
                b2 = true;
            }
            if (q == null) {
                if (f.p()) {
                    n.f();
                    f.r(d0.c(n.c(p, true)));
                    o2 = q;
                    b3 = b2;
                }
                else {
                    final n c = d0.c(n.c(p, false));
                    f.r(c);
                    c.close();
                    o2 = q;
                    b3 = b2;
                }
            }
            else {
                n.o();
                o2 = q;
                b3 = b2;
                if (!n.h().C()) {
                    n.n();
                    o2 = q;
                    b3 = b2;
                }
            }
        }
        else {
            n.o();
            o2 = null;
            b3 = true;
        }
        if (f == null || !f.p()) {
            n.e();
        }
        Object o3 = o2;
        boolean b4 = b3;
        if (o2 == null) {
            final g0.a q2 = n.q(false);
            k0.m((Object)q2);
            o3 = q2;
            if (b4 = b3) {
                n.s();
                b4 = false;
                o3 = q2;
            }
        }
        g0 g2 = ((g0.a)o3).E(p).u(n.h().c()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
        int i;
        if ((i = g2.x()) == 100) {
            final g0.a q3 = n.q(false);
            k0.m((Object)q3);
            if (b4) {
                n.s();
            }
            g2 = q3.E(p).u(n.h().c()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
            i = g2.x();
        }
        n.r(g2);
        g0.a a2;
        h0 h0;
        if (this.b && i == 101) {
            a2 = g2.Q();
            h0 = d.c;
        }
        else {
            a2 = g2.Q();
            h0 = n.p(g2);
        }
        final g0 c2 = a2.b(h0).c();
        if (s.K1("close", c2.W().i("Connection"), true) || s.K1("close", g0.G(c2, "Connection", null, 2, null), true)) {
            n.n();
        }
        if (i == 204 || i == 205) {
            final h0 r = c2.r();
            long contentLength;
            if (r != null) {
                contentLength = r.contentLength();
            }
            else {
                contentLength = -1L;
            }
            if (contentLength > 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(i);
                sb.append(" had non-zero Content-Length: ");
                final h0 r2 = c2.r();
                Object value = o;
                if (r2 != null) {
                    value = r2.contentLength();
                }
                sb.append(value);
                throw new ProtocolException(sb.toString());
            }
        }
        return c2;
    }
}
