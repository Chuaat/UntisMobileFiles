// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.f0;
import okhttp3.e0;
import okhttp3.h0;
import okio.d0;
import okio.r0;
import okio.y;
import kotlin.text.s;
import okhttp3.internal.d;
import okhttp3.g0;
import java.util.Iterator;
import kotlin.collections.v;
import okhttp3.n;
import java.util.List;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okhttp3.o;
import kotlin.Metadata;
import okhttp3.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/http/a;", "Lokhttp3/x;", "", "Lokhttp3/n;", "cookies", "", "a", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "intercept", "Lokhttp3/o;", "b", "Lokhttp3/o;", "cookieJar", "<init>", "(Lokhttp3/o;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a implements x
{
    private final o b;
    
    public a(@e final o b) {
        k0.p((Object)b, "cookieJar");
        this.b = b;
    }
    
    private final String a(final List<n> list) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<n> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final n next = iterator.next();
            if (n < 0) {
                v.W();
            }
            final n n2 = next;
            if (n > 0) {
                sb.append("; ");
            }
            sb.append(n2.s());
            sb.append('=');
            sb.append(n2.z());
            ++n;
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    @Override
    public g0 intercept(@e final x.a a) throws IOException {
        k0.p((Object)a, "chain");
        final e0 k = a.k();
        final e0.a n = k.n();
        final f0 f = k.f();
        if (f != null) {
            final okhttp3.y b = f.b();
            if (b != null) {
                n.n("Content-Type", b.toString());
            }
            final long a2 = f.a();
            if (a2 != -1L) {
                n.n("Content-Length", String.valueOf(a2));
                n.t("Transfer-Encoding");
            }
            else {
                n.n("Transfer-Encoding", "chunked");
                n.t("Content-Length");
            }
        }
        final String i = k.i("Host");
        final int n2 = 0;
        if (i == null) {
            n.n("Host", d.b0(k.q(), false, 1, null));
        }
        if (k.i("Connection") == null) {
            n.n("Connection", "Keep-Alive");
        }
        int n3 = n2;
        if (k.i("Accept-Encoding") == null) {
            n3 = n2;
            if (k.i("Range") == null) {
                n.n("Accept-Encoding", "gzip");
                n3 = 1;
            }
        }
        final List<n> b2 = this.b.b(k.q());
        if (b2.isEmpty() ^ true) {
            n.n("Cookie", this.a(b2));
        }
        if (k.i("User-Agent") == null) {
            n.n("User-Agent", "okhttp/4.9.0");
        }
        final g0 e = a.e(n.b());
        okhttp3.internal.http.e.g(this.b, k.q(), e.J());
        final g0.a e2 = e.Q().E(k);
        if (n3 != 0 && s.K1("gzip", g0.G(e, "Content-Encoding", null, 2, null), true) && okhttp3.internal.http.e.c(e)) {
            final h0 r = e.r();
            if (r != null) {
                final y y = new y(r.source());
                e2.w(e.J().p().l("Content-Encoding").l("Content-Length").i());
                e2.b(new h(g0.G(e, "Content-Type", null, 2, null), -1L, d0.d(y)));
            }
        }
        return e2.c();
    }
}
