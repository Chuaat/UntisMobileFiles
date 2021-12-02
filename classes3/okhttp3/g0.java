// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.io.IOException;
import okio.o;
import okio.r0;
import okio.m;
import java.util.List;
import m6.h;
import m6.g;
import kotlin.jvm.internal.k0;
import okhttp3.internal.connection.c;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u001eB}\b\u0000\u0012\u0006\u0010P\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u0005\u0012\u0006\u0010L\u001a\u00020\u000b\u0012\u0006\u0010D\u001a\u00020\b\u0012\b\u0010^\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010H\u001a\u00020\u0016\u0012\b\u0010a\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0000\u0012\b\u00104\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010[\u001a\u00020\u001a\u0012\u0006\u0010Y\u001a\u00020\u001a\u0012\b\u0010:\u001a\u0004\u0018\u000105¢\u0006\u0004\bc\u0010dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0011\u001a\u00020\u000bJ\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0007J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020 J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b$\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b%\u0010#J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0012J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH\u0007¢\u0006\u0004\b-\u0010,J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020\u000bH\u0016R\u001b\u00104\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010#R\u001e\u0010:\u001a\u0004\u0018\u0001058\u0001@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010=\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b6\u0010\u0007R\u0013\u0010A\u001a\u00020>8F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0019\u0010D\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010\nR\u0019\u0010H\u001a\u00020\u00168\u0007@\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010\u0018R\u0013\u0010J\u001a\u00020(8G@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010*R\u0019\u0010L\u001a\u00020\u000b8\u0007@\u0006¢\u0006\f\n\u0004\bG\u0010K\u001a\u0004\bE\u0010\rR\u0013\u0010M\u001a\u00020>8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0019\u0010P\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u0010\u0004R\u0018\u0010S\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010V\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bU\u0010#R\u0019\u0010Y\u001a\u00020\u001a8\u0007@\u0006¢\u0006\f\n\u0004\bW\u0010G\u001a\u0004\bX\u0010,R\u0019\u0010[\u001a\u00020\u001a8\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bZ\u0010,R\u001b\u0010^\u001a\u0004\u0018\u00010\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b?\u0010\\\u001a\u0004\b]\u0010\u0010R\u001b\u0010a\u001a\u0004\u0018\u00010\u001c8\u0007@\u0006¢\u0006\f\n\u0004\bU\u0010_\u001a\u0004\b`\u0010\u001fR\u001b\u0010b\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\bW\u0010#¨\u0006e" }, d2 = { "Lokhttp3/g0;", "Ljava/io/Closeable;", "Lokhttp3/e0;", "o", "()Lokhttp3/e0;", "Lokhttp3/d0;", "k", "()Lokhttp3/d0;", "", "d", "()I", "", "g", "()Ljava/lang/String;", "Lokhttp3/u;", "e", "()Lokhttp3/u;", "name", "", "H", "defaultValue", "F", "Lokhttp3/v;", "f", "()Lokhttp3/v;", "Y", "", "byteCount", "Lokhttp3/h0;", "R", "a", "()Lokhttp3/h0;", "Lokhttp3/g0$a;", "Q", "h", "()Lokhttp3/g0;", "c", "j", "Lokhttp3/h;", "w", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "q", "()J", "n", "Lkotlin/j2;", "close", "toString", "P", "Lokhttp3/g0;", "t", "cacheResponse", "Lokhttp3/internal/connection/c;", "T", "Lokhttp3/internal/connection/c;", "y", "()Lokhttp3/internal/connection/c;", "exchange", "I", "Lokhttp3/d0;", "protocol", "", "L", "()Z", "isSuccessful", "K", "x", "code", "M", "Lokhttp3/v;", "J", "headers", "s", "cacheControl", "Ljava/lang/String;", "message", "isRedirect", "Lokhttp3/e0;", "W", "request", "G", "Lokhttp3/d;", "lazyCacheControl", "O", "N", "networkResponse", "S", "V", "receivedResponseAtMillis", "X", "sentRequestAtMillis", "Lokhttp3/u;", "C", "handshake", "Lokhttp3/h0;", "r", "body", "priorResponse", "<init>", "(Lokhttp3/e0;Lokhttp3/d0;Ljava/lang/String;ILokhttp3/u;Lokhttp3/v;Lokhttp3/h0;Lokhttp3/g0;Lokhttp3/g0;Lokhttp3/g0;JJLokhttp3/internal/connection/c;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class g0 implements Closeable
{
    private d G;
    @e
    private final e0 H;
    @e
    private final d0 I;
    @e
    private final String J;
    private final int K;
    @f
    private final u L;
    @e
    private final v M;
    @f
    private final h0 N;
    @f
    private final g0 O;
    @f
    private final g0 P;
    @f
    private final g0 Q;
    private final long R;
    private final long S;
    @f
    private final c T;
    
    public g0(@e final e0 h, @e final d0 i, @e final String j, final int k, @f final u l, @e final v m, @f final h0 n, @f final g0 o, @f final g0 p13, @f final g0 q, final long r, final long s, @f final c t) {
        k0.p((Object)h, "request");
        k0.p((Object)i, "protocol");
        k0.p((Object)j, "message");
        k0.p((Object)m, "headers");
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p13;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
    }
    
    public static /* synthetic */ String G(final g0 g0, final String s, String s2, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        return g0.F(s, s2);
    }
    
    @g(name = "handshake")
    @f
    public final u C() {
        return this.L;
    }
    
    @h
    @f
    public final String D(@e final String s) {
        return G(this, s, null, 2, null);
    }
    
    @h
    @f
    public final String F(@e String h, @f String s) {
        k0.p((Object)h, "name");
        h = this.M.h(h);
        if (h != null) {
            s = h;
        }
        return s;
    }
    
    @e
    public final List<String> H(@e final String s) {
        k0.p((Object)s, "name");
        return this.M.w(s);
    }
    
    @g(name = "headers")
    @e
    public final v J() {
        return this.M;
    }
    
    public final boolean K() {
        final int k = this.K;
        if (k != 307 && k != 308) {
            switch (k) {
                default: {
                    return false;
                }
                case 300:
                case 301:
                case 302:
                case 303: {
                    break;
                }
            }
        }
        return true;
    }
    
    public final boolean L() {
        final int k = this.K;
        if (200 <= k) {
            if (299 >= k) {
                return true;
            }
        }
        return false;
    }
    
    @g(name = "message")
    @e
    public final String M() {
        return this.J;
    }
    
    @g(name = "networkResponse")
    @f
    public final g0 N() {
        return this.O;
    }
    
    @e
    public final a Q() {
        return new a(this);
    }
    
    @e
    public final h0 R(final long a) throws IOException {
        final h0 n = this.N;
        k0.m((Object)n);
        final o peek = n.source().peek();
        final m m = new m();
        peek.v(a);
        m.w0(peek, Math.min(a, peek.z().h0()));
        return h0.Companion.f(m, this.N.contentType(), m.h0());
    }
    
    @g(name = "priorResponse")
    @f
    public final g0 S() {
        return this.Q;
    }
    
    @g(name = "protocol")
    @e
    public final d0 T() {
        return this.I;
    }
    
    @g(name = "receivedResponseAtMillis")
    public final long V() {
        return this.S;
    }
    
    @g(name = "request")
    @e
    public final e0 W() {
        return this.H;
    }
    
    @g(name = "sentRequestAtMillis")
    public final long X() {
        return this.R;
    }
    
    @e
    public final v Y() throws IOException {
        final c t = this.T;
        if (t != null) {
            return t.u();
        }
        throw new IllegalStateException("trailers not available".toString());
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "body", imports = {}))
    @g(name = "-deprecated_body")
    @f
    public final h0 a() {
        return this.N;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "cacheControl", imports = {}))
    @g(name = "-deprecated_cacheControl")
    @e
    public final d b() {
        return this.s();
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "cacheResponse", imports = {}))
    @g(name = "-deprecated_cacheResponse")
    @f
    public final g0 c() {
        return this.P;
    }
    
    @Override
    public void close() {
        final h0 n = this.N;
        if (n != null) {
            n.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "code", imports = {}))
    @g(name = "-deprecated_code")
    public final int d() {
        return this.K;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "handshake", imports = {}))
    @g(name = "-deprecated_handshake")
    @f
    public final u e() {
        return this.L;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "headers", imports = {}))
    @g(name = "-deprecated_headers")
    @e
    public final v f() {
        return this.M;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "message", imports = {}))
    @g(name = "-deprecated_message")
    @e
    public final String g() {
        return this.J;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "networkResponse", imports = {}))
    @g(name = "-deprecated_networkResponse")
    @f
    public final g0 h() {
        return this.O;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "priorResponse", imports = {}))
    @g(name = "-deprecated_priorResponse")
    @f
    public final g0 j() {
        return this.Q;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "protocol", imports = {}))
    @g(name = "-deprecated_protocol")
    @e
    public final d0 k() {
        return this.I;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "receivedResponseAtMillis", imports = {}))
    @g(name = "-deprecated_receivedResponseAtMillis")
    public final long n() {
        return this.S;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "request", imports = {}))
    @g(name = "-deprecated_request")
    @e
    public final e0 o() {
        return this.H;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "sentRequestAtMillis", imports = {}))
    @g(name = "-deprecated_sentRequestAtMillis")
    public final long q() {
        return this.R;
    }
    
    @g(name = "body")
    @f
    public final h0 r() {
        return this.N;
    }
    
    @g(name = "cacheControl")
    @e
    public final d s() {
        d g;
        if ((g = this.G) == null) {
            g = d.p.c(this.M);
            this.G = g;
        }
        return g;
    }
    
    @g(name = "cacheResponse")
    @f
    public final g0 t() {
        return this.P;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.I);
        sb.append(", code=");
        sb.append(this.K);
        sb.append(", message=");
        sb.append(this.J);
        sb.append(", url=");
        sb.append(this.H.q());
        sb.append('}');
        return sb.toString();
    }
    
    @e
    public final List<okhttp3.h> w() {
        final v m = this.M;
        final int k = this.K;
        String s;
        if (k != 401) {
            if (k != 407) {
                return (List<okhttp3.h>)kotlin.collections.v.E();
            }
            s = "Proxy-Authenticate";
        }
        else {
            s = "WWW-Authenticate";
        }
        return okhttp3.internal.http.e.b(m, s);
    }
    
    @g(name = "code")
    public final int x() {
        return this.K;
    }
    
    @g(name = "exchange")
    @f
    public final c y() {
        return this.T;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b&\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bi\u0010jB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bi\u00106J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020(H\u0016J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\b\u00101\u001a\u00020\u0004H\u0016R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u00106R$\u0010&\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00103\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010D\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u00100R\"\u0010\u001d\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010F\u001a\u0004\b?\u0010G\"\u0004\bH\u0010IR\"\u0010+\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010T\u001a\u0004\b7\u0010U\"\u0004\bT\u0010VR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010W\u001a\u0004\bJ\u0010X\"\u0004\bY\u0010ZR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010C\u001a\u0004\be\u0010L\"\u0004\bf\u0010NR$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u00103\u001a\u0004\bg\u00104\"\u0004\bh\u00106¨\u0006k" }, d2 = { "okhttp3/g0$a", "", "", "name", "Lokhttp3/g0;", "response", "Lkotlin/j2;", "f", "e", "Lokhttp3/e0;", "request", "Lokhttp3/g0$a;", "E", "Lokhttp3/d0;", "protocol", "B", "", "code", "g", "message", "y", "Lokhttp3/u;", "handshake", "u", "value", "v", "a", "D", "Lokhttp3/v;", "headers", "w", "Lokhttp3/h0;", "body", "b", "networkResponse", "z", "cacheResponse", "d", "priorResponse", "A", "", "sentRequestAtMillis", "F", "receivedResponseAtMillis", "C", "Lokhttp3/internal/connection/c;", "deferredTrailers", "x", "(Lokhttp3/internal/connection/c;)V", "c", "i", "Lokhttp3/g0;", "()Lokhttp3/g0;", "H", "(Lokhttp3/g0;)V", "j", "p", "O", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "m", "Lokhttp3/internal/connection/c;", "k", "()Lokhttp3/internal/connection/c;", "J", "exchange", "Lokhttp3/v$a;", "Lokhttp3/v$a;", "()Lokhttp3/v$a;", "L", "(Lokhttp3/v$a;)V", "l", "r", "()J", "Q", "(J)V", "Lokhttp3/d0;", "q", "()Lokhttp3/d0;", "P", "(Lokhttp3/d0;)V", "I", "()I", "(I)V", "Lokhttp3/u;", "()Lokhttp3/u;", "K", "(Lokhttp3/u;)V", "Lokhttp3/h0;", "h", "()Lokhttp3/h0;", "G", "(Lokhttp3/h0;)V", "Lokhttp3/e0;", "s", "()Lokhttp3/e0;", "R", "(Lokhttp3/e0;)V", "t", "S", "o", "N", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static class a
    {
        @f
        private e0 a;
        @f
        private d0 b;
        private int c;
        @f
        private String d;
        @f
        private u e;
        @e
        private v.a f;
        @f
        private h0 g;
        @f
        private g0 h;
        @f
        private g0 i;
        @f
        private g0 j;
        private long k;
        private long l;
        @f
        private c m;
        
        public a() {
            this.c = -1;
            this.f = new v.a();
        }
        
        public a(@e final g0 g0) {
            k0.p((Object)g0, "response");
            this.c = -1;
            this.a = g0.W();
            this.b = g0.T();
            this.c = g0.x();
            this.d = g0.M();
            this.e = g0.C();
            this.f = g0.J().p();
            this.g = g0.r();
            this.h = g0.N();
            this.i = g0.t();
            this.j = g0.S();
            this.k = g0.X();
            this.l = g0.V();
            this.m = g0.y();
        }
        
        private final void e(final g0 g0) {
            if (g0 != null && g0.r() != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }
        
        private final void f(final String s, final g0 g0) {
            if (g0 != null) {
                final h0 r = g0.r();
                final int n = 1;
                if (r != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.append(".body != null");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if (g0.N() != null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s);
                    sb2.append(".networkResponse != null");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                if (g0.t() != null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(s);
                    sb3.append(".cacheResponse != null");
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                int n2;
                if (g0.S() == null) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(s);
                    sb4.append(".priorResponse != null");
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
            }
        }
        
        @e
        public a A(@f final g0 j) {
            this.e(j);
            this.j = j;
            return this;
        }
        
        @e
        public a B(@e final d0 b) {
            k0.p((Object)b, "protocol");
            this.b = b;
            return this;
        }
        
        @e
        public a C(final long l) {
            this.l = l;
            return this;
        }
        
        @e
        public a D(@e final String s) {
            k0.p((Object)s, "name");
            this.f.l(s);
            return this;
        }
        
        @e
        public a E(@e final e0 a) {
            k0.p((Object)a, "request");
            this.a = a;
            return this;
        }
        
        @e
        public a F(final long k) {
            this.k = k;
            return this;
        }
        
        public final void G(@f final h0 g) {
            this.g = g;
        }
        
        public final void H(@f final g0 i) {
            this.i = i;
        }
        
        public final void I(final int c) {
            this.c = c;
        }
        
        public final void J(@f final c m) {
            this.m = m;
        }
        
        public final void K(@f final u e) {
            this.e = e;
        }
        
        public final void L(@e final v.a f) {
            k0.p((Object)f, "<set-?>");
            this.f = f;
        }
        
        public final void M(@f final String d) {
            this.d = d;
        }
        
        public final void N(@f final g0 h) {
            this.h = h;
        }
        
        public final void O(@f final g0 j) {
            this.j = j;
        }
        
        public final void P(@f final d0 b) {
            this.b = b;
        }
        
        public final void Q(final long l) {
            this.l = l;
        }
        
        public final void R(@f final e0 a) {
            this.a = a;
        }
        
        public final void S(final long k) {
            this.k = k;
        }
        
        @e
        public a a(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            this.f.b(s, s2);
            return this;
        }
        
        @e
        public a b(@f final h0 g) {
            this.g = g;
            return this;
        }
        
        @e
        public g0 c() {
            final int c = this.c;
            if (c < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("code < 0: ");
                sb.append(this.c);
                throw new IllegalStateException(sb.toString().toString());
            }
            final e0 a = this.a;
            if (a == null) {
                throw new IllegalStateException("request == null".toString());
            }
            final d0 b = this.b;
            if (b == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            final String d = this.d;
            if (d != null) {
                return new g0(a, b, d, c, this.e, this.f.i(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            throw new IllegalStateException("message == null".toString());
        }
        
        @e
        public a d(@f final g0 i) {
            this.f("cacheResponse", i);
            this.i = i;
            return this;
        }
        
        @e
        public a g(final int c) {
            this.c = c;
            return this;
        }
        
        @f
        public final h0 h() {
            return this.g;
        }
        
        @f
        public final g0 i() {
            return this.i;
        }
        
        public final int j() {
            return this.c;
        }
        
        @f
        public final c k() {
            return this.m;
        }
        
        @f
        public final u l() {
            return this.e;
        }
        
        @e
        public final v.a m() {
            return this.f;
        }
        
        @f
        public final String n() {
            return this.d;
        }
        
        @f
        public final g0 o() {
            return this.h;
        }
        
        @f
        public final g0 p() {
            return this.j;
        }
        
        @f
        public final d0 q() {
            return this.b;
        }
        
        public final long r() {
            return this.l;
        }
        
        @f
        public final e0 s() {
            return this.a;
        }
        
        public final long t() {
            return this.k;
        }
        
        @e
        public a u(@f final u e) {
            this.e = e;
            return this;
        }
        
        @e
        public a v(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            this.f.m(s, s2);
            return this;
        }
        
        @e
        public a w(@e final v v) {
            k0.p((Object)v, "headers");
            this.f = v.p();
            return this;
        }
        
        public final void x(@e final c m) {
            k0.p((Object)m, "deferredTrailers");
            this.m = m;
        }
        
        @e
        public a y(@e final String d) {
            k0.p((Object)d, "message");
            this.d = d;
            return this;
        }
        
        @e
        public a z(@f final g0 h) {
            this.f("networkResponse", h);
            this.h = h;
            return this;
        }
    }
}
