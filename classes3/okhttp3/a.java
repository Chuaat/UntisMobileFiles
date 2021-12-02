// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.Objects;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import okhttp3.internal.d;
import kotlin.jvm.internal.k0;
import java.net.ProxySelector;
import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import org.jetbrains.annotations.f;
import javax.net.ssl.SSLSocketFactory;
import javax.net.SocketFactory;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b&\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010M\u001a\u00020+\u0012\u0006\u0010N\u001a\u00020&\u0012\u0006\u0010;\u001a\u00020\u0005\u0012\u0006\u0010L\u001a\u00020\b\u0012\b\u00102\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010F\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010I\u001a\u0004\u0018\u00010 \u0012\u0006\u0010@\u001a\u00020\u000b\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0006\u00105\u001a\u00020\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020&H\u0016J\u0017\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0000H\u0000¢\u0006\u0004\b)\u0010*J\b\u0010,\u001a\u00020+H\u0016R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8G@\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010\u0011R\u001b\u00102\u001a\u0004\u0018\u00010\u001a8\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u00105\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0016R\u0019\u00108\u001a\u00020\u00028G@\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b7\u0010\u0004R\u0019\u0010;\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010\u0007R\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8G@\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b<\u0010\u0011R\u0019\u0010@\u001a\u00020\u000b8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\rR\u001b\u0010C\u001a\u0004\u0018\u00010\u00178\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010\u0019R\u001b\u0010F\u001a\u0004\u0018\u00010\u001d8\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010\u001fR\u001b\u0010I\u001a\u0004\u0018\u00010 8\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010\"R\u0019\u0010L\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010\n¨\u0006Q" }, d2 = { "Lokhttp3/a;", "", "Lokhttp3/w;", "k", "()Lokhttp3/w;", "Lokhttp3/r;", "c", "()Lokhttp3/r;", "Ljavax/net/SocketFactory;", "i", "()Ljavax/net/SocketFactory;", "Lokhttp3/b;", "g", "()Lokhttp3/b;", "", "Lokhttp3/d0;", "e", "()Ljava/util/List;", "Lokhttp3/l;", "b", "Ljava/net/ProxySelector;", "h", "()Ljava/net/ProxySelector;", "Ljava/net/Proxy;", "f", "()Ljava/net/Proxy;", "Ljavax/net/ssl/SSLSocketFactory;", "j", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "d", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/g;", "a", "()Lokhttp3/g;", "other", "", "equals", "", "hashCode", "that", "o", "(Lokhttp3/a;)Z", "", "toString", "Ljava/util/List;", "q", "protocols", "Ljavax/net/ssl/SSLSocketFactory;", "v", "sslSocketFactory", "Ljava/net/ProxySelector;", "t", "proxySelector", "Lokhttp3/w;", "w", "url", "Lokhttp3/r;", "n", "dns", "m", "connectionSpecs", "Lokhttp3/b;", "s", "proxyAuthenticator", "Ljava/net/Proxy;", "r", "proxy", "Ljavax/net/ssl/HostnameVerifier;", "p", "hostnameVerifier", "Lokhttp3/g;", "l", "certificatePinner", "Ljavax/net/SocketFactory;", "u", "socketFactory", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILokhttp3/r;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/g;Lokhttp3/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    @e
    private final w a;
    @e
    private final List<d0> b;
    @e
    private final List<l> c;
    @e
    private final r d;
    @e
    private final SocketFactory e;
    @f
    private final SSLSocketFactory f;
    @f
    private final HostnameVerifier g;
    @f
    private final g h;
    @e
    private final b i;
    @f
    private final Proxy j;
    @e
    private final ProxySelector k;
    
    public a(@e final String s, final int n, @e final r d, @e final SocketFactory e, @f final SSLSocketFactory f, @f final HostnameVerifier g, @f final g h, @e final b i, @f final Proxy j, @e final List<? extends d0> list, @e final List<l> list2, @e final ProxySelector k) {
        k0.p((Object)s, "uriHost");
        k0.p((Object)d, "dns");
        k0.p((Object)e, "socketFactory");
        k0.p((Object)i, "proxyAuthenticator");
        k0.p((Object)list, "protocols");
        k0.p((Object)list2, "connectionSpecs");
        k0.p((Object)k, "proxySelector");
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        final w.a a = new w.a();
        String s2;
        if (f != null) {
            s2 = "https";
        }
        else {
            s2 = "http";
        }
        this.a = a.M(s2).x(s).D(n).h();
        this.b = okhttp3.internal.d.c0(list);
        this.c = okhttp3.internal.d.c0((List<? extends l>)list2);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "certificatePinner", imports = {}))
    @m6.g(name = "-deprecated_certificatePinner")
    @f
    public final g a() {
        return this.h;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "connectionSpecs", imports = {}))
    @m6.g(name = "-deprecated_connectionSpecs")
    @e
    public final List<l> b() {
        return this.c;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "dns", imports = {}))
    @m6.g(name = "-deprecated_dns")
    @e
    public final r c() {
        return this.d;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "hostnameVerifier", imports = {}))
    @m6.g(name = "-deprecated_hostnameVerifier")
    @f
    public final HostnameVerifier d() {
        return this.g;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "protocols", imports = {}))
    @m6.g(name = "-deprecated_protocols")
    @e
    public final List<d0> e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof a) {
            final w a = this.a;
            final a a2 = (a)o;
            if (k0.g((Object)a, (Object)a2.a) && this.o(a2)) {
                return true;
            }
        }
        return false;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "proxy", imports = {}))
    @m6.g(name = "-deprecated_proxy")
    @f
    public final Proxy f() {
        return this.j;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "proxyAuthenticator", imports = {}))
    @m6.g(name = "-deprecated_proxyAuthenticator")
    @e
    public final b g() {
        return this.i;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "proxySelector", imports = {}))
    @m6.g(name = "-deprecated_proxySelector")
    @e
    public final ProxySelector h() {
        return this.k;
    }
    
    @Override
    public int hashCode() {
        return (((((((((527 + this.a.hashCode()) * 31 + this.d.hashCode()) * 31 + this.i.hashCode()) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.k.hashCode()) * 31 + Objects.hashCode(this.j)) * 31 + Objects.hashCode(this.f)) * 31 + Objects.hashCode(this.g)) * 31 + Objects.hashCode(this.h);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "socketFactory", imports = {}))
    @m6.g(name = "-deprecated_socketFactory")
    @e
    public final SocketFactory i() {
        return this.e;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "sslSocketFactory", imports = {}))
    @m6.g(name = "-deprecated_sslSocketFactory")
    @f
    public final SSLSocketFactory j() {
        return this.f;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "url", imports = {}))
    @m6.g(name = "-deprecated_url")
    @e
    public final w k() {
        return this.a;
    }
    
    @m6.g(name = "certificatePinner")
    @f
    public final g l() {
        return this.h;
    }
    
    @m6.g(name = "connectionSpecs")
    @e
    public final List<l> m() {
        return this.c;
    }
    
    @m6.g(name = "dns")
    @e
    public final r n() {
        return this.d;
    }
    
    public final boolean o(@e final a a) {
        k0.p((Object)a, "that");
        return k0.g((Object)this.d, (Object)a.d) && k0.g((Object)this.i, (Object)a.i) && k0.g((Object)this.b, (Object)a.b) && k0.g((Object)this.c, (Object)a.c) && k0.g((Object)this.k, (Object)a.k) && k0.g((Object)this.j, (Object)a.j) && k0.g((Object)this.f, (Object)a.f) && k0.g((Object)this.g, (Object)a.g) && k0.g((Object)this.h, (Object)a.h) && this.a.N() == a.a.N();
    }
    
    @m6.g(name = "hostnameVerifier")
    @f
    public final HostnameVerifier p() {
        return this.g;
    }
    
    @m6.g(name = "protocols")
    @e
    public final List<d0> q() {
        return this.b;
    }
    
    @m6.g(name = "proxy")
    @f
    public final Proxy r() {
        return this.j;
    }
    
    @m6.g(name = "proxyAuthenticator")
    @e
    public final b s() {
        return this.i;
    }
    
    @m6.g(name = "proxySelector")
    @e
    public final ProxySelector t() {
        return this.k;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.F());
        sb.append(':');
        sb.append(this.a.N());
        sb.append(", ");
        StringBuilder sb2;
        Object obj;
        if (this.j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.j;
        }
        else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.k;
        }
        sb2.append(obj);
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }
    
    @m6.g(name = "socketFactory")
    @e
    public final SocketFactory u() {
        return this.e;
    }
    
    @m6.g(name = "sslSocketFactory")
    @f
    public final SSLSocketFactory v() {
        return this.f;
    }
    
    @m6.g(name = "url")
    @e
    public final w w() {
        return this.a;
    }
}
