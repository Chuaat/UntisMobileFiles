// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal;

import okhttp3.w;
import okhttp3.n;
import org.jetbrains.annotations.f;
import okhttp3.g0;
import okhttp3.e0;
import okhttp3.c;
import javax.net.ssl.SSLSocket;
import okhttp3.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okhttp3.v;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004\u001a\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¨\u0006 " }, d2 = { "", "currentTimeMillis", "Lokhttp3/w;", "url", "", "setCookie", "Lokhttp3/n;", "f", "cookie", "", "forObsoleteRfc2965", "e", "Lokhttp3/v$a;", "builder", "line", "a", "name", "value", "b", "Lokhttp3/c;", "cache", "Lokhttp3/e0;", "request", "Lokhttp3/g0;", "d", "Lokhttp3/l;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lkotlin/j2;", "c", "okhttp" }, k = 2, mv = { 1, 4, 0 })
@g(name = "Internal")
public final class b
{
    @e
    public static final v.a a(@e final v.a a, @e final String s) {
        k0.p((Object)a, "builder");
        k0.p((Object)s, "line");
        return a.f(s);
    }
    
    @e
    public static final v.a b(@e final v.a a, @e final String s, @e final String s2) {
        k0.p((Object)a, "builder");
        k0.p((Object)s, "name");
        k0.p((Object)s2, "value");
        return a.g(s, s2);
    }
    
    public static final void c(@e final l l, @e final SSLSocket sslSocket, final boolean b) {
        k0.p((Object)l, "connectionSpec");
        k0.p((Object)sslSocket, "sslSocket");
        l.f(sslSocket, b);
    }
    
    @f
    public static final g0 d(@e final c c, @e final e0 e0) {
        k0.p((Object)c, "cache");
        k0.p((Object)e0, "request");
        return c.f(e0);
    }
    
    @e
    public static final String e(@e final n n, final boolean b) {
        k0.p((Object)n, "cookie");
        return n.y(b);
    }
    
    @f
    public static final n f(final long n, @e final w w, @e final String s) {
        k0.p((Object)w, "url");
        k0.p((Object)s, "setCookie");
        return n.n.f(n, w, s);
    }
}
