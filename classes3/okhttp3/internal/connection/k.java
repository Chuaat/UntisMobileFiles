// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import java.util.NoSuchElementException;
import java.util.Collection;
import java.net.URI;
import okhttp3.internal.d;
import kotlin.jvm.internal.m0;
import java.util.Iterator;
import java.net.SocketAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okhttp3.s;
import okhttp3.e;
import okhttp3.a;
import okhttp3.i0;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0002\u001d\fB'\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&¨\u0006+" }, d2 = { "Lokhttp3/internal/connection/k;", "", "Lokhttp3/w;", "url", "Ljava/net/Proxy;", "proxy", "Lkotlin/j2;", "g", "", "c", "e", "f", "b", "Lokhttp3/internal/connection/k$b;", "d", "", "Ljava/net/InetSocketAddress;", "Ljava/util/List;", "inetSocketAddresses", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "routeDatabase", "", "I", "nextProxyIndex", "Lokhttp3/s;", "h", "Lokhttp3/s;", "eventListener", "a", "proxies", "Lokhttp3/a;", "Lokhttp3/a;", "address", "", "Lokhttp3/i0;", "postponedRoutes", "Lokhttp3/e;", "Lokhttp3/e;", "call", "<init>", "(Lokhttp3/a;Lokhttp3/internal/connection/i;Lokhttp3/e;Lokhttp3/s;)V", "i", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class k
{
    public static final a i;
    private List<? extends Proxy> a;
    private int b;
    private List<? extends InetSocketAddress> c;
    private final List<i0> d;
    private final okhttp3.a e;
    private final i f;
    private final e g;
    private final s h;
    
    static {
        i = new a(null);
    }
    
    public k(@org.jetbrains.annotations.e final okhttp3.a e, @org.jetbrains.annotations.e final i f, @org.jetbrains.annotations.e final e g, @org.jetbrains.annotations.e final s h) {
        k0.p((Object)e, "address");
        k0.p((Object)f, "routeDatabase");
        k0.p((Object)g, "call");
        k0.p((Object)h, "eventListener");
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a = (List<? extends Proxy>)v.E();
        this.c = (List<? extends InetSocketAddress>)v.E();
        this.d = new ArrayList<i0>();
        this.g(e.w(), e.r());
    }
    
    public static final /* synthetic */ okhttp3.a a(final k k) {
        return k.e;
    }
    
    private final boolean c() {
        return this.b < this.a.size();
    }
    
    private final Proxy e() throws IOException {
        if (this.c()) {
            final Proxy proxy = (Proxy)this.a.get(this.b++);
            this.f(proxy);
            return proxy;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.e.w().F());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.a);
        throw new SocketException(sb.toString());
    }
    
    private final void f(final Proxy proxy) throws IOException {
        final ArrayList<InetSocketAddress> c = new ArrayList<InetSocketAddress>();
        this.c = c;
        String str;
        int j;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            final SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(((InetSocketAddress)address).getClass());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            final a i = k.i;
            final InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
            str = i.a(inetSocketAddress);
            j = inetSocketAddress.getPort();
        }
        else {
            str = this.e.w().F();
            j = this.e.w().N();
        }
        if (1 <= j && 65535 >= j) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                c.add(InetSocketAddress.createUnresolved(str, j));
            }
            else {
                this.h.n(this.g, str);
                final List<InetAddress> a = this.e.n().a(str);
                if (a.isEmpty()) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.e.n());
                    sb2.append(" returned no addresses for ");
                    sb2.append(str);
                    throw new UnknownHostException(sb2.toString());
                }
                this.h.m(this.g, str, a);
                final Iterator<InetAddress> iterator = a.iterator();
                while (iterator.hasNext()) {
                    c.add(new InetSocketAddress(iterator.next(), j));
                }
            }
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("No route to ");
        sb3.append(str);
        sb3.append(':');
        sb3.append(j);
        sb3.append("; port is out of range");
        throw new SocketException(sb3.toString());
    }
    
    private final void g(final okhttp3.w w, final Proxy proxy) {
        final n6.a<List<? extends Proxy>> a = (n6.a<List<? extends Proxy>>)new n6.a<List<? extends Proxy>>() {
            final /* synthetic */ k G;
            
            @org.jetbrains.annotations.e
            public final List<Proxy> a() {
                final Proxy h = proxy;
                if (h != null) {
                    return (List<Proxy>)v.k((Object)h);
                }
                final URI z = w.Z();
                if (z.getHost() == null) {
                    return okhttp3.internal.d.z(Proxy.NO_PROXY);
                }
                final List<Proxy> select = k.a(this.G).t().select(z);
                if (select == null || select.isEmpty()) {
                    return okhttp3.internal.d.z(Proxy.NO_PROXY);
                }
                return (List<Proxy>)okhttp3.internal.d.c0((List<?>)select);
            }
        };
        this.h.p(this.g, w);
        final List<Proxy> a2 = a.a();
        this.a = a2;
        this.b = 0;
        this.h.o(this.g, w, a2);
    }
    
    public final boolean b() {
        final boolean c = this.c();
        boolean b = true;
        if (!c) {
            b = ((this.d.isEmpty() ^ true) && b);
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    public final b d() throws IOException {
        if (this.b()) {
            final ArrayList<i0> list = new ArrayList<i0>();
            while (this.c()) {
                final Proxy e = this.e();
                final Iterator<? extends InetSocketAddress> iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    final i0 i0 = new i0(this.e, e, (InetSocketAddress)iterator.next());
                    if (this.f.c(i0)) {
                        this.d.add(i0);
                    }
                    else {
                        list.add(i0);
                    }
                }
                if (list.isEmpty() ^ true) {
                    break;
                }
            }
            if (list.isEmpty()) {
                v.q0((Collection)list, (Iterable)this.d);
                this.d.clear();
            }
            return new b(list);
        }
        throw new NoSuchElementException();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t" }, d2 = { "okhttp3/internal/connection/k$a", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final String a(@org.jetbrains.annotations.e final InetSocketAddress inetSocketAddress) {
            k0.p((Object)inetSocketAddress, "$this$socketHost");
            final InetAddress address = inetSocketAddress.getAddress();
            String s;
            String s2;
            if (address != null) {
                s = address.getHostAddress();
                s2 = "address.hostAddress";
            }
            else {
                s = inetSocketAddress.getHostName();
                s2 = "hostName";
            }
            k0.o((Object)s, s2);
            return s;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010" }, d2 = { "okhttp3/internal/connection/k$b", "", "", "b", "Lokhttp3/i0;", "c", "", "Ljava/util/List;", "a", "()Ljava/util/List;", "routes", "", "I", "nextRouteIndex", "<init>", "(Ljava/util/List;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private int a;
        @org.jetbrains.annotations.e
        private final List<i0> b;
        
        public b(@org.jetbrains.annotations.e final List<i0> b) {
            k0.p((Object)b, "routes");
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        public final List<i0> a() {
            return this.b;
        }
        
        public final boolean b() {
            return this.a < this.b.size();
        }
        
        @org.jetbrains.annotations.e
        public final i0 c() {
            if (this.b()) {
                return this.b.get(this.a++);
            }
            throw new NoSuchElementException();
        }
    }
}
