// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.cache;

import java.util.concurrent.TimeUnit;
import okhttp3.v;
import okhttp3.internal.d;
import kotlin.text.s;
import java.util.Date;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import okhttp3.g0;
import org.jetbrains.annotations.f;
import okhttp3.e0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0005\u0003B\u001d\b\u0000\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/cache/c;", "", "Lokhttp3/g0;", "b", "Lokhttp3/g0;", "a", "()Lokhttp3/g0;", "cacheResponse", "Lokhttp3/e0;", "Lokhttp3/e0;", "()Lokhttp3/e0;", "networkRequest", "<init>", "(Lokhttp3/e0;Lokhttp3/g0;)V", "c", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    public static final a c;
    @f
    private final e0 a;
    @f
    private final g0 b;
    
    static {
        c = new a(null);
    }
    
    public c(@f final e0 a, @f final g0 b) {
        this.a = a;
        this.b = b;
    }
    
    @f
    public final g0 a() {
        return this.b;
    }
    
    @f
    public final e0 b() {
        return this.a;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n" }, d2 = { "okhttp3/internal/cache/c$a", "", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "request", "", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        public final boolean a(@e final g0 g0, @e final e0 e0) {
            k0.p((Object)g0, "response");
            k0.p((Object)e0, "request");
            final int x = g0.x();
            final boolean b = false;
            Label_0163: {
                if (x != 200 && x != 410 && x != 414 && x != 501 && x != 203 && x != 204) {
                    if (x != 307) {
                        if (x == 308 || x == 404 || x == 405) {
                            break Label_0163;
                        }
                        switch (x) {
                            default: {
                                return false;
                            }
                            case 302: {
                                break;
                            }
                            case 300:
                            case 301: {
                                break Label_0163;
                            }
                        }
                    }
                    if (g0.G(g0, "Expires", null, 2, null) == null && g0.s().n() == -1 && !g0.s().m() && !g0.s().l()) {
                        return false;
                    }
                }
            }
            boolean b2 = b;
            if (!g0.s().s()) {
                b2 = b;
                if (!e0.g().s()) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0018\u0010$\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0018\u0010&\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0018\u0010(\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006+" }, d2 = { "okhttp3/internal/cache/c$b", "", "", "g", "Lokhttp3/internal/cache/c;", "c", "", "d", "a", "Lokhttp3/e0;", "request", "f", "b", "J", "receivedResponseMillis", "Lokhttp3/g0;", "l", "Lokhttp3/g0;", "cacheResponse", "Ljava/util/Date;", "Ljava/util/Date;", "lastModified", "", "Ljava/lang/String;", "lastModifiedString", "", "i", "I", "ageSeconds", "k", "Lokhttp3/e0;", "e", "()Lokhttp3/e0;", "expires", "j", "nowMillis", "servedDate", "h", "etag", "sentRequestMillis", "servedDateString", "<init>", "(JLokhttp3/e0;Lokhttp3/g0;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private Date a;
        private String b;
        private Date c;
        private String d;
        private Date e;
        private long f;
        private long g;
        private String h;
        private int i;
        private final long j;
        @e
        private final e0 k;
        private final g0 l;
        
        public b(final long j, @e final e0 k, @f final g0 l) {
            k0.p((Object)k, "request");
            this.j = j;
            this.k = k;
            this.l = l;
            this.i = -1;
            if (l != null) {
                this.f = l.X();
                this.g = l.V();
                final v i = l.J();
                for (int n = 0; n < i.size(); ++n) {
                    final String n2 = i.n(n);
                    final String v = i.v(n);
                    if (s.K1(n2, "Date", true)) {
                        this.a = okhttp3.internal.http.c.a(v);
                        this.b = v;
                    }
                    else if (s.K1(n2, "Expires", true)) {
                        this.e = okhttp3.internal.http.c.a(v);
                    }
                    else if (s.K1(n2, "Last-Modified", true)) {
                        this.c = okhttp3.internal.http.c.a(v);
                        this.d = v;
                    }
                    else if (s.K1(n2, "ETag", true)) {
                        this.h = v;
                    }
                    else if (s.K1(n2, "Age", true)) {
                        this.i = d.f0(v, -1);
                    }
                }
            }
        }
        
        private final long a() {
            final Date a = this.a;
            long max = 0L;
            if (a != null) {
                max = Math.max(0L, this.g - a.getTime());
            }
            final int i = this.i;
            long max2 = max;
            if (i != -1) {
                max2 = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            final long g = this.g;
            return max2 + (g - this.f) + (this.j - g);
        }
        
        private final c c() {
            if (this.l == null) {
                return new c(this.k, null);
            }
            if (this.k.l() && this.l.C() == null) {
                return new c(this.k, null);
            }
            if (!okhttp3.internal.cache.c.c.a(this.l, this.k)) {
                return new c(this.k, null);
            }
            final okhttp3.d g = this.k.g();
            if (!g.r() && !this.f(this.k)) {
                final okhttp3.d s = this.l.s();
                final long a = this.a();
                long n;
                final long a2 = n = this.d();
                if (g.n() != -1) {
                    n = Math.min(a2, TimeUnit.SECONDS.toMillis(g.n()));
                }
                final int p = g.p();
                final long n2 = 0L;
                long millis;
                if (p != -1) {
                    millis = TimeUnit.SECONDS.toMillis(g.p());
                }
                else {
                    millis = 0L;
                }
                long millis2 = n2;
                if (!s.q()) {
                    millis2 = n2;
                    if (g.o() != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(g.o());
                    }
                }
                if (!s.r()) {
                    final long n3 = millis + a;
                    if (n3 < millis2 + n) {
                        final g0.a q = this.l.Q();
                        if (n3 >= n) {
                            q.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a > 86400000L && this.g()) {
                            q.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, q.c());
                    }
                }
                String s2 = this.h;
                String s3 = "If-Modified-Since";
                if (s2 != null) {
                    s3 = "If-None-Match";
                }
                else if (this.c != null) {
                    s2 = this.d;
                }
                else {
                    if (this.a == null) {
                        return new c(this.k, null);
                    }
                    s2 = this.b;
                }
                final v.a p2 = this.k.k().p();
                k0.m((Object)s2);
                p2.g(s3, s2);
                return new c(this.k.n().o(p2.i()).b(), this.l);
            }
            return new c(this.k, null);
        }
        
        private final long d() {
            final g0 l = this.l;
            k0.m((Object)l);
            final okhttp3.d s = l.s();
            if (s.n() != -1) {
                return TimeUnit.SECONDS.toMillis(s.n());
            }
            final Date e = this.e;
            long n = 0L;
            if (e != null) {
                final Date a = this.a;
                long n2;
                if (a != null) {
                    n2 = a.getTime();
                }
                else {
                    n2 = this.g;
                }
                final long n3 = e.getTime() - n2;
                if (n3 > 0L) {
                    n = n3;
                }
                return n;
            }
            long n4 = n;
            if (this.c != null) {
                n4 = n;
                if (this.l.W().q().O() == null) {
                    final Date a2 = this.a;
                    long n5;
                    if (a2 != null) {
                        n5 = a2.getTime();
                    }
                    else {
                        n5 = this.f;
                    }
                    final Date c = this.c;
                    k0.m((Object)c);
                    final long n6 = n5 - c.getTime();
                    n4 = n;
                    if (n6 > 0L) {
                        n4 = n6 / 10;
                    }
                }
            }
            return n4;
        }
        
        private final boolean f(final e0 e0) {
            return e0.i("If-Modified-Since") != null || e0.i("If-None-Match") != null;
        }
        
        private final boolean g() {
            final g0 l = this.l;
            k0.m((Object)l);
            return l.s().n() == -1 && this.e == null;
        }
        
        @e
        public final c b() {
            c c2;
            final c c = c2 = this.c();
            if (c.b() != null) {
                c2 = c;
                if (this.k.g().u()) {
                    c2 = new c(null, null);
                }
            }
            return c2;
        }
        
        @e
        public final e0 e() {
            return this.k;
        }
    }
}
