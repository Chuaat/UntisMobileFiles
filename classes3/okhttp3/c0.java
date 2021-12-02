// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.Collections;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.Random;
import kotlin.z0;
import java.util.Objects;
import java.util.Iterator;
import okhttp3.internal.platform.h;
import java.util.Collection;
import okhttp3.internal.proxy.a;
import okhttp3.internal.d;
import kotlin.jvm.internal.w;
import okhttp3.internal.connection.i;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.SocketFactory;
import java.net.ProxySelector;
import java.net.Proxy;
import org.jetbrains.annotations.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\t\rB\u0014\b\u0000\u0012\u0007\u0010©\u0001\u001a\u00020\u000e¢\u0006\u0006\bª\u0001\u0010«\u0001B\u000b\b\u0016¢\u0006\u0006\bª\u0001\u0010¬\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010 J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020!H\u0007¢\u0006\u0004\b5\u0010#J\u000f\u00107\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0016H\u0007¢\u0006\u0004\b=\u0010\u0019J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0016H\u0007¢\u0006\u0004\b?\u0010\u0019J\u000f\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020FH\u0007¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020FH\u0007¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u00020FH\u0007¢\u0006\u0004\bK\u0010HJ\u000f\u0010L\u001a\u00020FH\u0007¢\u0006\u0004\bL\u0010HR\u0019\u0010P\u001a\u00020\u001e8G@\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010 R\u001b\u0010T\u001a\u0004\u0018\u00010/8G@\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u00101R\u0019\u0010W\u001a\u00020\u001e8G@\u0006¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010 R\u0019\u0010[\u001a\u00020\u00108G@\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\u0012R\u0019\u0010^\u001a\u00020\u00138G@\u0006¢\u0006\f\n\u0004\bK\u0010\\\u001a\u0004\b]\u0010\u0015R\u0019\u0010`\u001a\u00020\u001e8G@\u0006¢\u0006\f\n\u0004\b_\u0010N\u001a\u0004\bN\u0010 R\u0019\u0010d\u001a\u00020&8G@\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010(R\u0019\u0010h\u001a\u00020C8G@\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010ER\u0019\u0010l\u001a\u00020F8G@\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010HR\u001b\u0010r\u001a\u0004\u0018\u00010m8G@\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0019\u0010v\u001a\u00020\u001b8G@\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010\u001dR\u001b\u0010x\u001a\u0004\u0018\u00010)8G@\u0006¢\u0006\f\n\u0004\bp\u0010w\u001a\u0004\bM\u0010+R\u001f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G@\u0006¢\u0006\f\n\u0004\bj\u0010y\u001a\u0004\bz\u0010\u0019R\u001b\u0010\u0081\u0001\u001a\u00020|8G@\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00168G@\u0006¢\u0006\f\n\u0004\bN\u0010y\u001a\u0004\b}\u0010\u0019R\u001d\u0010\u0086\u0001\u001a\u00020!8G@\u0006¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010#R \u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G@\u0006¢\u0006\f\n\u0004\b~\u0010y\u001a\u0004\bi\u0010\u0019R\u001c\u0010\u008a\u0001\u001a\u0002068G@\u0006¢\u0006\u000e\n\u0005\bc\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u00108R\u001b\u0010\u008c\u0001\u001a\u00020@8G@\u0006¢\u0006\r\n\u0005\bO\u0010\u008b\u0001\u001a\u0004\bn\u0010BR\u001c\u0010\u008f\u0001\u001a\u0002028G@\u0006¢\u0006\u000e\n\u0005\b]\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u00104R\u001a\u0010\u0090\u0001\u001a\u00020F8G@\u0006¢\u0006\f\n\u0004\bz\u0010j\u001a\u0004\ba\u0010HR\u001b\u0010\u0092\u0001\u001a\u00020F8G@\u0006¢\u0006\r\n\u0004\b\u000f\u0010j\u001a\u0005\b\u0091\u0001\u0010HR\u001c\u0010\u0094\u0001\u001a\u00020F8G@\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010j\u001a\u0005\b\u0093\u0001\u0010HR\u0015\u0010\u0096\u0001\u001a\u0002098G@\u0006¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010;R!\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u00168G@\u0006¢\u0006\r\n\u0004\bu\u0010y\u001a\u0005\b\u0083\u0001\u0010\u0019R\u001a\u0010\u0098\u0001\u001a\u00020F8G@\u0006¢\u0006\f\n\u0004\b\u007f\u0010j\u001a\u0004\bQ\u0010HR\u001c\u0010\u009b\u0001\u001a\u00020,8G@\u0006¢\u0006\u000e\n\u0005\bg\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010.R\u001c\u0010\u009d\u0001\u001a\u00020!8G@\u0006¢\u0006\u000e\n\u0006\b\u009c\u0001\u0010\u0084\u0001\u001a\u0004\b_\u0010#R\u001d\u0010¡\u0001\u001a\u00030\u009e\u00018\u0006@\u0006¢\u0006\u000e\n\u0005\bS\u0010\u009f\u0001\u001a\u0005\be\u0010 \u0001R\u001a\u0010£\u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010¢\u0001R!\u0010¨\u0001\u001a\u0005\u0018\u00010¤\u00018G@\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001¨\u0006\u00ad\u0001" }, d2 = { "Lokhttp3/c0;", "", "Lokhttp3/e$a;", "Lokhttp3/k0$a;", "Lkotlin/j2;", "q0", "Lokhttp3/e0;", "request", "Lokhttp3/e;", "a", "Lokhttp3/l0;", "listener", "Lokhttp3/k0;", "b", "Lokhttp3/c0$a;", "g0", "Lokhttp3/q;", "n", "()Lokhttp3/q;", "Lokhttp3/k;", "j", "()Lokhttp3/k;", "", "Lokhttp3/x;", "v", "()Ljava/util/List;", "w", "Lokhttp3/s$c;", "r", "()Lokhttp3/s$c;", "", "D", "()Z", "Lokhttp3/b;", "c", "()Lokhttp3/b;", "s", "t", "Lokhttp3/o;", "m", "()Lokhttp3/o;", "Lokhttp3/c;", "d", "()Lokhttp3/c;", "Lokhttp3/r;", "q", "()Lokhttp3/r;", "Ljava/net/Proxy;", "z", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "B", "()Ljava/net/ProxySelector;", "A", "Ljavax/net/SocketFactory;", "E", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "F", "()Ljavax/net/ssl/SSLSocketFactory;", "Lokhttp3/l;", "l", "Lokhttp3/d0;", "y", "Ljavax/net/ssl/HostnameVerifier;", "u", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/g;", "g", "()Lokhttp3/g;", "", "f", "()I", "i", "C", "H", "x", "O", "Z", "a0", "followSslRedirects", "S", "Ljava/net/Proxy;", "j0", "proxy", "L", "n0", "retryOnConnectionFailure", "G", "Lokhttp3/q;", "W", "dispatcher", "Lokhttp3/k;", "T", "connectionPool", "N", "followRedirects", "P", "Lokhttp3/o;", "V", "cookieJar", "b0", "Lokhttp3/g;", "R", "certificatePinner", "f0", "I", "m0", "readTimeoutMillis", "Lokhttp3/internal/tls/c;", "c0", "Lokhttp3/internal/tls/c;", "Q", "()Lokhttp3/internal/tls/c;", "certificateChainCleaner", "K", "Lokhttp3/s$c;", "Y", "eventListenerFactory", "Lokhttp3/c;", "cache", "Ljava/util/List;", "d0", "interceptors", "", "i0", "J", "e0", "()J", "minWebSocketMessageToCompress", "protocols", "U", "Lokhttp3/b;", "k0", "proxyAuthenticator", "networkInterceptors", "Ljavax/net/SocketFactory;", "o0", "socketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Ljava/net/ProxySelector;", "l0", "proxySelector", "callTimeoutMillis", "r0", "writeTimeoutMillis", "h0", "pingIntervalMillis", "p0", "sslSocketFactory", "connectionSpecs", "connectTimeoutMillis", "Lokhttp3/r;", "X", "dns", "M", "authenticator", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "()Lokhttp3/internal/connection/i;", "routeDatabase", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "s0", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "builder", "<init>", "(Lokhttp3/c0$a;)V", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public class c0 implements Cloneable, e.a, k0.a
{
    @org.jetbrains.annotations.e
    private static final List<d0> k0;
    @org.jetbrains.annotations.e
    private static final List<l> l0;
    public static final b m0;
    @org.jetbrains.annotations.e
    private final q G;
    @org.jetbrains.annotations.e
    private final k H;
    @org.jetbrains.annotations.e
    private final List<x> I;
    @org.jetbrains.annotations.e
    private final List<x> J;
    @org.jetbrains.annotations.e
    private final s.c K;
    private final boolean L;
    @org.jetbrains.annotations.e
    private final okhttp3.b M;
    private final boolean N;
    private final boolean O;
    @org.jetbrains.annotations.e
    private final o P;
    @f
    private final c Q;
    @org.jetbrains.annotations.e
    private final r R;
    @f
    private final Proxy S;
    @org.jetbrains.annotations.e
    private final ProxySelector T;
    @org.jetbrains.annotations.e
    private final okhttp3.b U;
    @org.jetbrains.annotations.e
    private final SocketFactory V;
    private final SSLSocketFactory W;
    @f
    private final X509TrustManager X;
    @org.jetbrains.annotations.e
    private final List<l> Y;
    @org.jetbrains.annotations.e
    private final List<d0> Z;
    @org.jetbrains.annotations.e
    private final HostnameVerifier a0;
    @org.jetbrains.annotations.e
    private final g b0;
    @f
    private final okhttp3.internal.tls.c c0;
    private final int d0;
    private final int e0;
    private final int f0;
    private final int g0;
    private final int h0;
    private final long i0;
    @org.jetbrains.annotations.e
    private final i j0;
    
    static {
        m0 = new b(null);
        k0 = d.z(d0.K, d0.I);
        l0 = d.z(l.h, l.j);
    }
    
    public c0() {
        this(new a());
    }
    
    public c0(@org.jetbrains.annotations.e final a a) {
        kotlin.jvm.internal.k0.p((Object)a, "builder");
        this.G = a.E();
        this.H = a.B();
        this.I = d.c0((List<? extends x>)a.K());
        this.J = d.c0((List<? extends x>)a.M());
        this.K = a.G();
        this.L = a.T();
        this.M = a.v();
        this.N = a.H();
        this.O = a.I();
        this.P = a.D();
        this.Q = a.w();
        this.R = a.F();
        this.S = a.P();
        ProxySelector t = null;
        Label_0154: {
            if (a.P() == null) {
                t = a.R();
                if (t == null) {
                    t = ProxySelector.getDefault();
                }
                if (t != null) {
                    break Label_0154;
                }
            }
            t = okhttp3.internal.proxy.a.a;
        }
        this.T = t;
        this.U = a.Q();
        this.V = a.V();
        final List<l> c = a.C();
        this.Y = c;
        this.Z = a.O();
        this.a0 = a.J();
        this.d0 = a.x();
        this.e0 = a.A();
        this.f0 = a.S();
        this.g0 = a.X();
        this.h0 = a.N();
        this.i0 = a.L();
        i u = a.U();
        if (u == null) {
            u = new i();
        }
        this.j0 = u;
        final boolean b = c instanceof Collection;
        final boolean b2 = true;
        int n = 0;
        Label_0342: {
            if (b && c.isEmpty()) {
                n = (b2 ? 1 : 0);
            }
            else {
                final Iterator<Object> iterator = c.iterator();
                do {
                    n = (b2 ? 1 : 0);
                    if (iterator.hasNext()) {
                        continue;
                    }
                    break Label_0342;
                } while (!iterator.next().i());
                n = 0;
            }
        }
        g b3;
        if (n != 0) {
            this.W = null;
            this.c0 = null;
            this.X = null;
            b3 = g.c;
        }
        else {
            okhttp3.internal.tls.c c2;
            if (a.W() != null) {
                this.W = a.W();
                c2 = a.y();
                kotlin.jvm.internal.k0.m((Object)c2);
                this.c0 = c2;
                final X509TrustManager y = a.Y();
                kotlin.jvm.internal.k0.m((Object)y);
                this.X = y;
            }
            else {
                final h.a e = h.e;
                final X509TrustManager r = e.g().r();
                this.X = r;
                final h g = e.g();
                kotlin.jvm.internal.k0.m((Object)r);
                this.W = g.q(r);
                final okhttp3.internal.tls.c.a a2 = okhttp3.internal.tls.c.a;
                kotlin.jvm.internal.k0.m((Object)r);
                c2 = a2.a(r);
                this.c0 = c2;
            }
            final g z = a.z();
            kotlin.jvm.internal.k0.m((Object)c2);
            b3 = z.j(c2);
        }
        this.b0 = b3;
        this.q0();
    }
    
    public static final /* synthetic */ List I() {
        return c0.l0;
    }
    
    public static final /* synthetic */ List J() {
        return c0.k0;
    }
    
    public static final /* synthetic */ SSLSocketFactory L(final c0 c0) {
        return c0.W;
    }
    
    private final void q0() {
        final List<x> i = this.I;
        Objects.requireNonNull(i, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        final boolean contains = i.contains(null);
        final int n = 1;
        if (!(contains ^ true)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Null interceptor: ");
            sb.append(this.I);
            throw new IllegalStateException(sb.toString().toString());
        }
        final List<x> j = this.J;
        Objects.requireNonNull(j, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (j.contains(null) ^ true) {
            final List<l> y = this.Y;
            boolean b = false;
            Label_0115: {
                if (!(y instanceof Collection) || !y.isEmpty()) {
                    final Iterator<Object> iterator = y.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().i()) {
                            b = false;
                            break Label_0115;
                        }
                    }
                }
                b = true;
            }
            if (b) {
                if (this.W != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (this.c0 != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                int n2;
                if (this.X == null) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!kotlin.jvm.internal.k0.g((Object)this.b0, (Object)g.c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            else {
                if (this.W == null) {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
                if (this.c0 == null) {
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                }
                if (this.X == null) {
                    throw new IllegalStateException("x509TrustManager == null".toString());
                }
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Null network interceptor: ");
        sb2.append(this.J);
        throw new IllegalStateException(sb2.toString().toString());
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "proxyAuthenticator", imports = {}))
    @m6.g(name = "-deprecated_proxyAuthenticator")
    @org.jetbrains.annotations.e
    public final okhttp3.b A() {
        return this.U;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "proxySelector", imports = {}))
    @m6.g(name = "-deprecated_proxySelector")
    @org.jetbrains.annotations.e
    public final ProxySelector B() {
        return this.T;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "readTimeoutMillis", imports = {}))
    @m6.g(name = "-deprecated_readTimeoutMillis")
    public final int C() {
        return this.f0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "retryOnConnectionFailure", imports = {}))
    @m6.g(name = "-deprecated_retryOnConnectionFailure")
    public final boolean D() {
        return this.L;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "socketFactory", imports = {}))
    @m6.g(name = "-deprecated_socketFactory")
    @org.jetbrains.annotations.e
    public final SocketFactory E() {
        return this.V;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "sslSocketFactory", imports = {}))
    @m6.g(name = "-deprecated_sslSocketFactory")
    @org.jetbrains.annotations.e
    public final SSLSocketFactory F() {
        return this.p0();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "writeTimeoutMillis", imports = {}))
    @m6.g(name = "-deprecated_writeTimeoutMillis")
    public final int H() {
        return this.g0;
    }
    
    @m6.g(name = "authenticator")
    @org.jetbrains.annotations.e
    public final okhttp3.b N() {
        return this.M;
    }
    
    @m6.g(name = "cache")
    @f
    public final c O() {
        return this.Q;
    }
    
    @m6.g(name = "callTimeoutMillis")
    public final int P() {
        return this.d0;
    }
    
    @m6.g(name = "certificateChainCleaner")
    @f
    public final okhttp3.internal.tls.c Q() {
        return this.c0;
    }
    
    @m6.g(name = "certificatePinner")
    @org.jetbrains.annotations.e
    public final g R() {
        return this.b0;
    }
    
    @m6.g(name = "connectTimeoutMillis")
    public final int S() {
        return this.e0;
    }
    
    @m6.g(name = "connectionPool")
    @org.jetbrains.annotations.e
    public final k T() {
        return this.H;
    }
    
    @m6.g(name = "connectionSpecs")
    @org.jetbrains.annotations.e
    public final List<l> U() {
        return this.Y;
    }
    
    @m6.g(name = "cookieJar")
    @org.jetbrains.annotations.e
    public final o V() {
        return this.P;
    }
    
    @m6.g(name = "dispatcher")
    @org.jetbrains.annotations.e
    public final q W() {
        return this.G;
    }
    
    @m6.g(name = "dns")
    @org.jetbrains.annotations.e
    public final r X() {
        return this.R;
    }
    
    @m6.g(name = "eventListenerFactory")
    @org.jetbrains.annotations.e
    public final s.c Y() {
        return this.K;
    }
    
    @m6.g(name = "followRedirects")
    public final boolean Z() {
        return this.N;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e a(@org.jetbrains.annotations.e final e0 e0) {
        kotlin.jvm.internal.k0.p((Object)e0, "request");
        return new okhttp3.internal.connection.e(this, e0, false);
    }
    
    @m6.g(name = "followSslRedirects")
    public final boolean a0() {
        return this.O;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k0 b(@org.jetbrains.annotations.e final e0 e0, @org.jetbrains.annotations.e final l0 l0) {
        kotlin.jvm.internal.k0.p((Object)e0, "request");
        kotlin.jvm.internal.k0.p((Object)l0, "listener");
        final okhttp3.internal.ws.e e2 = new okhttp3.internal.ws.e(okhttp3.internal.concurrent.d.h, e0, l0, new Random(), this.h0, null, this.i0);
        e2.s(this);
        return e2;
    }
    
    @org.jetbrains.annotations.e
    public final i b0() {
        return this.j0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "authenticator", imports = {}))
    @m6.g(name = "-deprecated_authenticator")
    @org.jetbrains.annotations.e
    public final okhttp3.b c() {
        return this.M;
    }
    
    @m6.g(name = "hostnameVerifier")
    @org.jetbrains.annotations.e
    public final HostnameVerifier c0() {
        return this.a0;
    }
    
    @org.jetbrains.annotations.e
    public Object clone() {
        return super.clone();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "cache", imports = {}))
    @m6.g(name = "-deprecated_cache")
    @f
    public final c d() {
        return this.Q;
    }
    
    @m6.g(name = "interceptors")
    @org.jetbrains.annotations.e
    public final List<x> d0() {
        return this.I;
    }
    
    @m6.g(name = "minWebSocketMessageToCompress")
    public final long e0() {
        return this.i0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "callTimeoutMillis", imports = {}))
    @m6.g(name = "-deprecated_callTimeoutMillis")
    public final int f() {
        return this.d0;
    }
    
    @m6.g(name = "networkInterceptors")
    @org.jetbrains.annotations.e
    public final List<x> f0() {
        return this.J;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "certificatePinner", imports = {}))
    @m6.g(name = "-deprecated_certificatePinner")
    @org.jetbrains.annotations.e
    public final g g() {
        return this.b0;
    }
    
    @org.jetbrains.annotations.e
    public a g0() {
        return new a(this);
    }
    
    @m6.g(name = "pingIntervalMillis")
    public final int h0() {
        return this.h0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "connectTimeoutMillis", imports = {}))
    @m6.g(name = "-deprecated_connectTimeoutMillis")
    public final int i() {
        return this.e0;
    }
    
    @m6.g(name = "protocols")
    @org.jetbrains.annotations.e
    public final List<d0> i0() {
        return this.Z;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "connectionPool", imports = {}))
    @m6.g(name = "-deprecated_connectionPool")
    @org.jetbrains.annotations.e
    public final k j() {
        return this.H;
    }
    
    @m6.g(name = "proxy")
    @f
    public final Proxy j0() {
        return this.S;
    }
    
    @m6.g(name = "proxyAuthenticator")
    @org.jetbrains.annotations.e
    public final okhttp3.b k0() {
        return this.U;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "connectionSpecs", imports = {}))
    @m6.g(name = "-deprecated_connectionSpecs")
    @org.jetbrains.annotations.e
    public final List<l> l() {
        return this.Y;
    }
    
    @m6.g(name = "proxySelector")
    @org.jetbrains.annotations.e
    public final ProxySelector l0() {
        return this.T;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "cookieJar", imports = {}))
    @m6.g(name = "-deprecated_cookieJar")
    @org.jetbrains.annotations.e
    public final o m() {
        return this.P;
    }
    
    @m6.g(name = "readTimeoutMillis")
    public final int m0() {
        return this.f0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "dispatcher", imports = {}))
    @m6.g(name = "-deprecated_dispatcher")
    @org.jetbrains.annotations.e
    public final q n() {
        return this.G;
    }
    
    @m6.g(name = "retryOnConnectionFailure")
    public final boolean n0() {
        return this.L;
    }
    
    @m6.g(name = "socketFactory")
    @org.jetbrains.annotations.e
    public final SocketFactory o0() {
        return this.V;
    }
    
    @m6.g(name = "sslSocketFactory")
    @org.jetbrains.annotations.e
    public final SSLSocketFactory p0() {
        final SSLSocketFactory w = this.W;
        if (w != null) {
            return w;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "dns", imports = {}))
    @m6.g(name = "-deprecated_dns")
    @org.jetbrains.annotations.e
    public final r q() {
        return this.R;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "eventListenerFactory", imports = {}))
    @m6.g(name = "-deprecated_eventListenerFactory")
    @org.jetbrains.annotations.e
    public final s.c r() {
        return this.K;
    }
    
    @m6.g(name = "writeTimeoutMillis")
    public final int r0() {
        return this.g0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "followRedirects", imports = {}))
    @m6.g(name = "-deprecated_followRedirects")
    public final boolean s() {
        return this.N;
    }
    
    @m6.g(name = "x509TrustManager")
    @f
    public final X509TrustManager s0() {
        return this.X;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "followSslRedirects", imports = {}))
    @m6.g(name = "-deprecated_followSslRedirects")
    public final boolean t() {
        return this.O;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "hostnameVerifier", imports = {}))
    @m6.g(name = "-deprecated_hostnameVerifier")
    @org.jetbrains.annotations.e
    public final HostnameVerifier u() {
        return this.a0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "interceptors", imports = {}))
    @m6.g(name = "-deprecated_interceptors")
    @org.jetbrains.annotations.e
    public final List<x> v() {
        return this.I;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "networkInterceptors", imports = {}))
    @m6.g(name = "-deprecated_networkInterceptors")
    @org.jetbrains.annotations.e
    public final List<x> w() {
        return this.J;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "pingIntervalMillis", imports = {}))
    @m6.g(name = "-deprecated_pingIntervalMillis")
    public final int x() {
        return this.h0;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "protocols", imports = {}))
    @m6.g(name = "-deprecated_protocols")
    @org.jetbrains.annotations.e
    public final List<d0> y() {
        return this.Z;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "proxy", imports = {}))
    @m6.g(name = "-deprecated_proxy")
    @f
    public final Proxy z() {
        return this.S;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00f8\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u00e9\u0001\u0010\u00ea\u0001B\u0014\b\u0010\u0012\u0007\u0010\u00eb\u0001\u001a\u00020d¢\u0006\u0006\b\u00e9\u0001\u0010\u00ec\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nJ8\u0010\u0015\u001a\u00020\u00042#\b\u0004\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nJ8\u0010\u0019\u001a\u00020\u00042#\b\u0004\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020 J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020 J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*J\u0010\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-J\u000e\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200J\u0010\u00105\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u000103J\u000e\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206J\u000e\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020#J\u000e\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;J\u0010\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0007J\u0016\u0010C\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u0006\u0010B\u001a\u00020AJ\u0014\u0010G\u001a\u00020\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0DJ\u0014\u0010J\u001a\u00020\u00042\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0DJ\u000e\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KJ\u000e\u0010P\u001a\u00020\u00042\u0006\u0010O\u001a\u00020NJ\u0016\u0010U\u001a\u00020\u00042\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SJ\u0010\u0010X\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0007J\u0016\u0010Y\u001a\u00020\u00042\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SJ\u0010\u0010Z\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0007J\u0016\u0010[\u001a\u00020\u00042\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SJ\u0010\u0010\\\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0007J\u0016\u0010]\u001a\u00020\u00042\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SJ\u0010\u0010^\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0007J\u0016\u0010`\u001a\u00020\u00042\u0006\u0010_\u001a\u00020Q2\u0006\u0010T\u001a\u00020SJ\u0010\u0010a\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0007J\u000e\u0010c\u001a\u00020\u00042\u0006\u0010b\u001a\u00020QJ\u0006\u0010e\u001a\u00020dR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u00101\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010w\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010}\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R%\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u0019\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0086\u0001\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bX\u0010M\u001a\u0005\br\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R)\u0010\u008d\u0001\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bP\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R-\u0010I\u001a\b\u0012\u0004\u0012\u00020H0D8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b'\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R'\u0010$\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b/\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010L\u001a\u00020K8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b)\u0010\u009d\u0001\u001a\u0006\b\u0088\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R-\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010\u0093\u0001\u001a\u0006\b\u0087\u0001\u0010\u0095\u0001\"\u0006\b¡\u0001\u0010\u0097\u0001R)\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\b\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R'\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b%\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R%\u0010®\u0001\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010r\u001a\u0005\b¬\u0001\u0010t\"\u0005\b\u00ad\u0001\u0010vR*\u0010´\u0001\u001a\u0004\u0018\u00010A8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001c\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R&\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000@\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\r\u0010\u0093\u0001\u001a\u0006\bµ\u0001\u0010\u0095\u0001R&\u0010¹\u0001\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010r\u001a\u0005\b·\u0001\u0010t\"\u0005\b¸\u0001\u0010vR&\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\be\u0010M\u001a\u0006\bº\u0001\u0010\u0083\u0001\"\u0006\b»\u0001\u0010\u0085\u0001R,\u0010\u00c3\u0001\u001a\u0005\u0018\u00010¼\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010\u00c0\u0001\"\u0006\b\u00c1\u0001\u0010\u00c2\u0001R%\u0010\u00c5\u0001\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0005\b¿\u0001\u0010r\u001a\u0004\bq\u0010t\"\u0005\b\u00c4\u0001\u0010vR&\u0010\u00c9\u0001\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u00c6\u0001\u0010r\u001a\u0005\b\u00c7\u0001\u0010t\"\u0005\b\u00c8\u0001\u0010vR)\u00107\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bG\u0010\u00ca\u0001\u001a\u0006\b\u00cb\u0001\u0010\u00cc\u0001\"\u0006\b\u00cd\u0001\u0010\u00ce\u0001R,\u0010\u00d5\u0001\u001a\u0005\u0018\u00010\u00cf\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u00d0\u0001\u001a\u0006\b\u00d1\u0001\u0010\u00d2\u0001\"\u0006\b\u00d3\u0001\u0010\u00d4\u0001R&\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bU\u0010M\u001a\u0006\b\u00d6\u0001\u0010\u0083\u0001\"\u0006\b\u00d7\u0001\u0010\u0085\u0001R'\u0010<\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0005\u0010\u00d8\u0001\u001a\u0006\b\u00d9\u0001\u0010\u00da\u0001\"\u0006\b\u00db\u0001\u0010\u00dc\u0001R(\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u00dd\u0001\u001a\u0006\b\u00c6\u0001\u0010\u00de\u0001\"\u0006\b\u00df\u0001\u0010\u00e0\u0001R)\u0010.\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bY\u0010\u00e1\u0001\u001a\u0006\b½\u0001\u0010\u00e2\u0001\"\u0006\b\u00e3\u0001\u0010\u00e4\u0001R'\u00109\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b,\u0010\u0098\u0001\u001a\u0006\b\u00e5\u0001\u0010\u009a\u0001\"\u0006\b\u00e6\u0001\u0010\u009c\u0001R&\u0010\u00e8\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000@\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0018\u0010\u0093\u0001\u001a\u0006\b\u00e7\u0001\u0010\u0095\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u00ed\u0001" }, d2 = { "okhttp3/c0$a", "", "Lokhttp3/q;", "dispatcher", "Lokhttp3/c0$a;", "p", "Lokhttp3/k;", "connectionPool", "m", "", "Lokhttp3/x;", "a0", "interceptor", "c", "Lkotlin/Function1;", "Lokhttp3/x$a;", "Lkotlin/t0;", "name", "chain", "Lokhttp3/g0;", "block", "a", "(Ln6/l;)Lokhttp3/c0$a;", "c0", "d", "b", "Lokhttp3/s;", "eventListener", "r", "Lokhttp3/s$c;", "eventListenerFactory", "s", "", "retryOnConnectionFailure", "l0", "Lokhttp3/b;", "authenticator", "e", "followRedirects", "t", "followProtocolRedirects", "u", "Lokhttp3/o;", "cookieJar", "o", "Lokhttp3/c;", "cache", "g", "Lokhttp3/r;", "dns", "q", "Ljava/net/Proxy;", "proxy", "g0", "Ljava/net/ProxySelector;", "proxySelector", "i0", "proxyAuthenticator", "h0", "Ljavax/net/SocketFactory;", "socketFactory", "O0", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "P0", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Q0", "", "Lokhttp3/l;", "connectionSpecs", "n", "Lokhttp3/d0;", "protocols", "f0", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Z", "Lokhttp3/g;", "certificatePinner", "j", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "h", "Ljava/time/Duration;", "duration", "i", "k", "l", "j0", "k0", "R0", "S0", "interval", "d0", "e0", "bytes", "b0", "Lokhttp3/c0;", "f", "Lokhttp3/q;", "E", "()Lokhttp3/q;", "v0", "(Lokhttp3/q;)V", "Lokhttp3/r;", "F", "()Lokhttp3/r;", "w0", "(Lokhttp3/r;)V", "", "A", "I", "X", "()I", "M0", "(I)V", "writeTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "W", "()Ljavax/net/ssl/SSLSocketFactory;", "L0", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Lokhttp3/k;", "B", "()Lokhttp3/k;", "s0", "(Lokhttp3/k;)V", "()Z", "z0", "(Z)V", "followSslRedirects", "C", "J", "L", "()J", "B0", "(J)V", "minWebSocketMessageToCompress", "Lokhttp3/o;", "D", "()Lokhttp3/o;", "u0", "(Lokhttp3/o;)V", "Ljava/util/List;", "O", "()Ljava/util/List;", "D0", "(Ljava/util/List;)V", "Lokhttp3/b;", "v", "()Lokhttp3/b;", "m0", "(Lokhttp3/b;)V", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "A0", "(Ljavax/net/ssl/HostnameVerifier;)V", "t0", "Ljava/net/Proxy;", "P", "()Ljava/net/Proxy;", "E0", "(Ljava/net/Proxy;)V", "Lokhttp3/s$c;", "G", "()Lokhttp3/s$c;", "x0", "(Lokhttp3/s$c;)V", "N", "C0", "pingInterval", "Ljavax/net/ssl/X509TrustManager;", "Y", "()Ljavax/net/ssl/X509TrustManager;", "N0", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "K", "interceptors", "x", "o0", "callTimeout", "T", "I0", "Lokhttp3/internal/tls/c;", "w", "Lokhttp3/internal/tls/c;", "y", "()Lokhttp3/internal/tls/c;", "p0", "(Lokhttp3/internal/tls/c;)V", "certificateChainCleaner", "r0", "connectTimeout", "z", "S", "H0", "readTimeout", "Ljava/net/ProxySelector;", "R", "()Ljava/net/ProxySelector;", "G0", "(Ljava/net/ProxySelector;)V", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "U", "()Lokhttp3/internal/connection/i;", "J0", "(Lokhttp3/internal/connection/i;)V", "routeDatabase", "H", "y0", "Ljavax/net/SocketFactory;", "V", "()Ljavax/net/SocketFactory;", "K0", "(Ljavax/net/SocketFactory;)V", "Lokhttp3/g;", "()Lokhttp3/g;", "q0", "(Lokhttp3/g;)V", "Lokhttp3/c;", "()Lokhttp3/c;", "n0", "(Lokhttp3/c;)V", "Q", "F0", "M", "networkInterceptors", "<init>", "()V", "okHttpClient", "(Lokhttp3/c0;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private int A;
        private int B;
        private long C;
        @f
        private i D;
        @org.jetbrains.annotations.e
        private q a;
        @org.jetbrains.annotations.e
        private k b;
        @org.jetbrains.annotations.e
        private final List<x> c;
        @org.jetbrains.annotations.e
        private final List<x> d;
        @org.jetbrains.annotations.e
        private s.c e;
        private boolean f;
        @org.jetbrains.annotations.e
        private okhttp3.b g;
        private boolean h;
        private boolean i;
        @org.jetbrains.annotations.e
        private o j;
        @f
        private c k;
        @org.jetbrains.annotations.e
        private r l;
        @f
        private Proxy m;
        @f
        private ProxySelector n;
        @org.jetbrains.annotations.e
        private okhttp3.b o;
        @org.jetbrains.annotations.e
        private SocketFactory p;
        @f
        private SSLSocketFactory q;
        @f
        private X509TrustManager r;
        @org.jetbrains.annotations.e
        private List<l> s;
        @org.jetbrains.annotations.e
        private List<? extends d0> t;
        @org.jetbrains.annotations.e
        private HostnameVerifier u;
        @org.jetbrains.annotations.e
        private g v;
        @f
        private okhttp3.internal.tls.c w;
        private int x;
        private int y;
        private int z;
        
        public a() {
            this.a = new q();
            this.b = new k();
            this.c = new ArrayList<x>();
            this.d = new ArrayList<x>();
            this.e = d.e(s.a);
            this.f = true;
            final okhttp3.b a = okhttp3.b.a;
            this.g = a;
            this.h = true;
            this.i = true;
            this.j = o.a;
            this.l = r.a;
            this.o = a;
            final SocketFactory default1 = SocketFactory.getDefault();
            kotlin.jvm.internal.k0.o((Object)default1, "SocketFactory.getDefault()");
            this.p = default1;
            final b m0 = c0.m0;
            this.s = m0.a();
            this.t = m0.b();
            this.u = okhttp3.internal.tls.d.c;
            this.v = g.c;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }
        
        public a(@org.jetbrains.annotations.e final c0 c0) {
            kotlin.jvm.internal.k0.p((Object)c0, "okHttpClient");
            this();
            this.a = c0.W();
            this.b = c0.T();
            v.q0((Collection)this.c, (Iterable)c0.d0());
            v.q0((Collection)this.d, (Iterable)c0.f0());
            this.e = c0.Y();
            this.f = c0.n0();
            this.g = c0.N();
            this.h = c0.Z();
            this.i = c0.a0();
            this.j = c0.V();
            this.k = c0.O();
            this.l = c0.X();
            this.m = c0.j0();
            this.n = c0.l0();
            this.o = c0.k0();
            this.p = c0.o0();
            this.q = c0.L(c0);
            this.r = c0.s0();
            this.s = c0.U();
            this.t = c0.i0();
            this.u = c0.c0();
            this.v = c0.R();
            this.w = c0.Q();
            this.x = c0.P();
            this.y = c0.S();
            this.z = c0.m0();
            this.A = c0.r0();
            this.B = c0.h0();
            this.C = c0.e0();
            this.D = c0.b0();
        }
        
        public final int A() {
            return this.y;
        }
        
        public final void A0(@org.jetbrains.annotations.e final HostnameVerifier u) {
            kotlin.jvm.internal.k0.p((Object)u, "<set-?>");
            this.u = u;
        }
        
        @org.jetbrains.annotations.e
        public final k B() {
            return this.b;
        }
        
        public final void B0(final long c) {
            this.C = c;
        }
        
        @org.jetbrains.annotations.e
        public final List<l> C() {
            return this.s;
        }
        
        public final void C0(final int b) {
            this.B = b;
        }
        
        @org.jetbrains.annotations.e
        public final o D() {
            return this.j;
        }
        
        public final void D0(@org.jetbrains.annotations.e final List<? extends d0> t) {
            kotlin.jvm.internal.k0.p((Object)t, "<set-?>");
            this.t = t;
        }
        
        @org.jetbrains.annotations.e
        public final q E() {
            return this.a;
        }
        
        public final void E0(@f final Proxy m) {
            this.m = m;
        }
        
        @org.jetbrains.annotations.e
        public final r F() {
            return this.l;
        }
        
        public final void F0(@org.jetbrains.annotations.e final okhttp3.b o) {
            kotlin.jvm.internal.k0.p((Object)o, "<set-?>");
            this.o = o;
        }
        
        @org.jetbrains.annotations.e
        public final s.c G() {
            return this.e;
        }
        
        public final void G0(@f final ProxySelector n) {
            this.n = n;
        }
        
        public final boolean H() {
            return this.h;
        }
        
        public final void H0(final int z) {
            this.z = z;
        }
        
        public final boolean I() {
            return this.i;
        }
        
        public final void I0(final boolean f) {
            this.f = f;
        }
        
        @org.jetbrains.annotations.e
        public final HostnameVerifier J() {
            return this.u;
        }
        
        public final void J0(@f final i d) {
            this.D = d;
        }
        
        @org.jetbrains.annotations.e
        public final List<x> K() {
            return this.c;
        }
        
        public final void K0(@org.jetbrains.annotations.e final SocketFactory p) {
            kotlin.jvm.internal.k0.p((Object)p, "<set-?>");
            this.p = p;
        }
        
        public final long L() {
            return this.C;
        }
        
        public final void L0(@f final SSLSocketFactory q) {
            this.q = q;
        }
        
        @org.jetbrains.annotations.e
        public final List<x> M() {
            return this.d;
        }
        
        public final void M0(final int a) {
            this.A = a;
        }
        
        public final int N() {
            return this.B;
        }
        
        public final void N0(@f final X509TrustManager r) {
            this.r = r;
        }
        
        @org.jetbrains.annotations.e
        public final List<d0> O() {
            return (List<d0>)this.t;
        }
        
        @org.jetbrains.annotations.e
        public final a O0(@org.jetbrains.annotations.e final SocketFactory p) {
            kotlin.jvm.internal.k0.p((Object)p, "socketFactory");
            if (p instanceof SSLSocketFactory ^ true) {
                if (kotlin.jvm.internal.k0.g((Object)p, (Object)this.p) ^ true) {
                    this.D = null;
                }
                this.p = p;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }
        
        @f
        public final Proxy P() {
            return this.m;
        }
        
        @kotlin.i(level = kotlin.k.H, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @org.jetbrains.annotations.e
        public final a P0(@org.jetbrains.annotations.e final SSLSocketFactory q) {
            kotlin.jvm.internal.k0.p((Object)q, "sslSocketFactory");
            if (kotlin.jvm.internal.k0.g((Object)q, (Object)this.q) ^ true) {
                this.D = null;
            }
            this.q = q;
            final h.a e = okhttp3.internal.platform.h.e;
            final X509TrustManager s = e.g().s(q);
            if (s != null) {
                this.r = s;
                final h g = e.g();
                final X509TrustManager r = this.r;
                kotlin.jvm.internal.k0.m((Object)r);
                this.w = g.d(r);
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to extract the trust manager on ");
            sb.append(e.g());
            sb.append(", ");
            sb.append("sslSocketFactory is ");
            sb.append(q.getClass());
            throw new IllegalStateException(sb.toString());
        }
        
        @org.jetbrains.annotations.e
        public final okhttp3.b Q() {
            return this.o;
        }
        
        @org.jetbrains.annotations.e
        public final a Q0(@org.jetbrains.annotations.e final SSLSocketFactory q, @org.jetbrains.annotations.e final X509TrustManager r) {
            kotlin.jvm.internal.k0.p((Object)q, "sslSocketFactory");
            kotlin.jvm.internal.k0.p((Object)r, "trustManager");
            if ((kotlin.jvm.internal.k0.g((Object)q, (Object)this.q) ^ true) || (kotlin.jvm.internal.k0.g((Object)r, (Object)this.r) ^ true)) {
                this.D = null;
            }
            this.q = q;
            this.w = okhttp3.internal.tls.c.a.a(r);
            this.r = r;
            return this;
        }
        
        @f
        public final ProxySelector R() {
            return this.n;
        }
        
        @org.jetbrains.annotations.e
        public final a R0(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
            kotlin.jvm.internal.k0.p((Object)timeUnit, "unit");
            this.A = okhttp3.internal.d.j("timeout", n, timeUnit);
            return this;
        }
        
        public final int S() {
            return this.z;
        }
        
        @IgnoreJRERequirement
        @org.jetbrains.annotations.e
        public final a S0(@org.jetbrains.annotations.e final Duration duration) {
            kotlin.jvm.internal.k0.p((Object)duration, "duration");
            this.R0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
        
        public final boolean T() {
            return this.f;
        }
        
        @f
        public final i U() {
            return this.D;
        }
        
        @org.jetbrains.annotations.e
        public final SocketFactory V() {
            return this.p;
        }
        
        @f
        public final SSLSocketFactory W() {
            return this.q;
        }
        
        public final int X() {
            return this.A;
        }
        
        @f
        public final X509TrustManager Y() {
            return this.r;
        }
        
        @org.jetbrains.annotations.e
        public final a Z(@org.jetbrains.annotations.e final HostnameVerifier u) {
            kotlin.jvm.internal.k0.p((Object)u, "hostnameVerifier");
            if (kotlin.jvm.internal.k0.g((Object)u, (Object)this.u) ^ true) {
                this.D = null;
            }
            this.u = u;
            return this;
        }
        
        @m6.g(name = "-addInterceptor")
        @org.jetbrains.annotations.e
        public final a a(@org.jetbrains.annotations.e final n6.l<? super x.a, g0> l) {
            kotlin.jvm.internal.k0.p((Object)l, "block");
            return this.c(new x() {
                @org.jetbrains.annotations.e
                @Override
                public final g0 intercept(@org.jetbrains.annotations.e final x.a a) {
                    kotlin.jvm.internal.k0.p((Object)a, "chain");
                    return (g0)l.invoke((Object)a);
                }
            });
        }
        
        @org.jetbrains.annotations.e
        public final List<x> a0() {
            return this.c;
        }
        
        @m6.g(name = "-addNetworkInterceptor")
        @org.jetbrains.annotations.e
        public final a b(@org.jetbrains.annotations.e final n6.l<? super x.a, g0> l) {
            kotlin.jvm.internal.k0.p((Object)l, "block");
            return this.d(new x() {
                @org.jetbrains.annotations.e
                @Override
                public final g0 intercept(@org.jetbrains.annotations.e final x.a a) {
                    kotlin.jvm.internal.k0.p((Object)a, "chain");
                    return (g0)l.invoke((Object)a);
                }
            });
        }
        
        @org.jetbrains.annotations.e
        public final a b0(final long n) {
            if (n >= 0L) {
                this.C = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("minWebSocketMessageToCompress must be positive: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @org.jetbrains.annotations.e
        public final a c(@org.jetbrains.annotations.e final x x) {
            kotlin.jvm.internal.k0.p((Object)x, "interceptor");
            this.c.add(x);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final List<x> c0() {
            return this.d;
        }
        
        @org.jetbrains.annotations.e
        public final a d(@org.jetbrains.annotations.e final x x) {
            kotlin.jvm.internal.k0.p((Object)x, "interceptor");
            this.d.add(x);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a d0(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
            kotlin.jvm.internal.k0.p((Object)timeUnit, "unit");
            this.B = okhttp3.internal.d.j("interval", n, timeUnit);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a e(@org.jetbrains.annotations.e final okhttp3.b g) {
            kotlin.jvm.internal.k0.p((Object)g, "authenticator");
            this.g = g;
            return this;
        }
        
        @IgnoreJRERequirement
        @org.jetbrains.annotations.e
        public final a e0(@org.jetbrains.annotations.e final Duration duration) {
            kotlin.jvm.internal.k0.p((Object)duration, "duration");
            this.d0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final c0 f() {
            return new c0(this);
        }
        
        @org.jetbrains.annotations.e
        public final a f0(@org.jetbrains.annotations.e final List<? extends d0> list) {
            kotlin.jvm.internal.k0.p((Object)list, "protocols");
            final List l5 = kotlin.collections.v.L5((Collection)list);
            final d0 i = okhttp3.d0.L;
            final boolean contains = l5.contains(i);
            final int n = 0;
            if (!contains && !l5.contains(okhttp3.d0.I)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("protocols must contain h2_prior_knowledge or http/1.1: ");
                sb.append(l5);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            int n2 = 0;
            Label_0087: {
                if (l5.contains(i)) {
                    n2 = n;
                    if (l5.size() > 1) {
                        break Label_0087;
                    }
                }
                n2 = 1;
            }
            if (n2 == 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("protocols containing h2_prior_knowledge cannot use other protocols: ");
                sb2.append(l5);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            if (!(l5.contains(okhttp3.d0.H) ^ true)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("protocols must not contain http/1.0: ");
                sb3.append(l5);
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            if (l5.contains(null) ^ true) {
                l5.remove(okhttp3.d0.J);
                if (kotlin.jvm.internal.k0.g((Object)l5, (Object)this.t) ^ true) {
                    this.D = null;
                }
                final List<? extends d0> unmodifiableList = Collections.unmodifiableList((List<? extends d0>)l5);
                kotlin.jvm.internal.k0.o((Object)unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                this.t = unmodifiableList;
                return this;
            }
            throw new IllegalArgumentException("protocols must not contain null".toString());
        }
        
        @org.jetbrains.annotations.e
        public final a g(@f final c k) {
            this.k = k;
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a g0(@f final Proxy m) {
            if (kotlin.jvm.internal.k0.g((Object)m, (Object)this.m) ^ true) {
                this.D = null;
            }
            this.m = m;
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a h(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
            kotlin.jvm.internal.k0.p((Object)timeUnit, "unit");
            this.x = okhttp3.internal.d.j("timeout", n, timeUnit);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a h0(@org.jetbrains.annotations.e final okhttp3.b o) {
            kotlin.jvm.internal.k0.p((Object)o, "proxyAuthenticator");
            if (kotlin.jvm.internal.k0.g((Object)o, (Object)this.o) ^ true) {
                this.D = null;
            }
            this.o = o;
            return this;
        }
        
        @IgnoreJRERequirement
        @org.jetbrains.annotations.e
        public final a i(@org.jetbrains.annotations.e final Duration duration) {
            kotlin.jvm.internal.k0.p((Object)duration, "duration");
            this.h(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a i0(@org.jetbrains.annotations.e final ProxySelector n) {
            kotlin.jvm.internal.k0.p((Object)n, "proxySelector");
            if (kotlin.jvm.internal.k0.g((Object)n, (Object)this.n) ^ true) {
                this.D = null;
            }
            this.n = n;
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a j(@org.jetbrains.annotations.e final g v) {
            kotlin.jvm.internal.k0.p((Object)v, "certificatePinner");
            if (kotlin.jvm.internal.k0.g((Object)v, (Object)this.v) ^ true) {
                this.D = null;
            }
            this.v = v;
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a j0(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
            kotlin.jvm.internal.k0.p((Object)timeUnit, "unit");
            this.z = okhttp3.internal.d.j("timeout", n, timeUnit);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a k(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
            kotlin.jvm.internal.k0.p((Object)timeUnit, "unit");
            this.y = okhttp3.internal.d.j("timeout", n, timeUnit);
            return this;
        }
        
        @IgnoreJRERequirement
        @org.jetbrains.annotations.e
        public final a k0(@org.jetbrains.annotations.e final Duration duration) {
            kotlin.jvm.internal.k0.p((Object)duration, "duration");
            this.j0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
        
        @IgnoreJRERequirement
        @org.jetbrains.annotations.e
        public final a l(@org.jetbrains.annotations.e final Duration duration) {
            kotlin.jvm.internal.k0.p((Object)duration, "duration");
            this.k(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a l0(final boolean f) {
            this.f = f;
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final a m(@org.jetbrains.annotations.e final k b) {
            kotlin.jvm.internal.k0.p((Object)b, "connectionPool");
            this.b = b;
            return this;
        }
        
        public final void m0(@org.jetbrains.annotations.e final okhttp3.b g) {
            kotlin.jvm.internal.k0.p((Object)g, "<set-?>");
            this.g = g;
        }
        
        @org.jetbrains.annotations.e
        public final a n(@org.jetbrains.annotations.e final List<l> list) {
            kotlin.jvm.internal.k0.p((Object)list, "connectionSpecs");
            if (kotlin.jvm.internal.k0.g((Object)list, (Object)this.s) ^ true) {
                this.D = null;
            }
            this.s = okhttp3.internal.d.c0((List<? extends l>)list);
            return this;
        }
        
        public final void n0(@f final c k) {
            this.k = k;
        }
        
        @org.jetbrains.annotations.e
        public final a o(@org.jetbrains.annotations.e final o j) {
            kotlin.jvm.internal.k0.p((Object)j, "cookieJar");
            this.j = j;
            return this;
        }
        
        public final void o0(final int x) {
            this.x = x;
        }
        
        @org.jetbrains.annotations.e
        public final a p(@org.jetbrains.annotations.e final q a) {
            kotlin.jvm.internal.k0.p((Object)a, "dispatcher");
            this.a = a;
            return this;
        }
        
        public final void p0(@f final okhttp3.internal.tls.c w) {
            this.w = w;
        }
        
        @org.jetbrains.annotations.e
        public final a q(@org.jetbrains.annotations.e final r l) {
            kotlin.jvm.internal.k0.p((Object)l, "dns");
            if (kotlin.jvm.internal.k0.g((Object)l, (Object)this.l) ^ true) {
                this.D = null;
            }
            this.l = l;
            return this;
        }
        
        public final void q0(@org.jetbrains.annotations.e final g v) {
            kotlin.jvm.internal.k0.p((Object)v, "<set-?>");
            this.v = v;
        }
        
        @org.jetbrains.annotations.e
        public final a r(@org.jetbrains.annotations.e final s s) {
            kotlin.jvm.internal.k0.p((Object)s, "eventListener");
            this.e = okhttp3.internal.d.e(s);
            return this;
        }
        
        public final void r0(final int y) {
            this.y = y;
        }
        
        @org.jetbrains.annotations.e
        public final a s(@org.jetbrains.annotations.e final s.c e) {
            kotlin.jvm.internal.k0.p((Object)e, "eventListenerFactory");
            this.e = e;
            return this;
        }
        
        public final void s0(@org.jetbrains.annotations.e final k b) {
            kotlin.jvm.internal.k0.p((Object)b, "<set-?>");
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        public final a t(final boolean h) {
            this.h = h;
            return this;
        }
        
        public final void t0(@org.jetbrains.annotations.e final List<l> s) {
            kotlin.jvm.internal.k0.p((Object)s, "<set-?>");
            this.s = s;
        }
        
        @org.jetbrains.annotations.e
        public final a u(final boolean i) {
            this.i = i;
            return this;
        }
        
        public final void u0(@org.jetbrains.annotations.e final o j) {
            kotlin.jvm.internal.k0.p((Object)j, "<set-?>");
            this.j = j;
        }
        
        @org.jetbrains.annotations.e
        public final okhttp3.b v() {
            return this.g;
        }
        
        public final void v0(@org.jetbrains.annotations.e final q a) {
            kotlin.jvm.internal.k0.p((Object)a, "<set-?>");
            this.a = a;
        }
        
        @f
        public final c w() {
            return this.k;
        }
        
        public final void w0(@org.jetbrains.annotations.e final r l) {
            kotlin.jvm.internal.k0.p((Object)l, "<set-?>");
            this.l = l;
        }
        
        public final int x() {
            return this.x;
        }
        
        public final void x0(@org.jetbrains.annotations.e final s.c e) {
            kotlin.jvm.internal.k0.p((Object)e, "<set-?>");
            this.e = e;
        }
        
        @f
        public final okhttp3.internal.tls.c y() {
            return this.w;
        }
        
        public final void y0(final boolean h) {
            this.h = h;
        }
        
        @org.jetbrains.annotations.e
        public final g z() {
            return this.v;
        }
        
        public final void z0(final boolean i) {
            this.i = i;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r" }, d2 = { "okhttp3/c0$b", "", "", "Lokhttp3/d0;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lokhttp3/l;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        @org.jetbrains.annotations.e
        public final List<l> a() {
            return (List<l>)okhttp3.c0.I();
        }
        
        @org.jetbrains.annotations.e
        public final List<d0> b() {
            return (List<d0>)okhttp3.c0.J();
        }
    }
}
