// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import java.net.ProtocolException;
import java.net.UnknownServiceException;
import okhttp3.l;
import okhttp3.internal.http2.i;
import okhttp3.internal.http2.m;
import java.net.SocketException;
import okhttp3.f0;
import okio.t0;
import okhttp3.g0;
import java.util.concurrent.TimeUnit;
import okhttp3.c0;
import okhttp3.e0;
import java.security.Principal;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.v;
import okhttp3.internal.tls.c;
import kotlin.jvm.internal.m0;
import javax.net.ssl.SSLSocket;
import okhttp3.a;
import java.net.ConnectException;
import okhttp3.s;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Objects;
import java.io.IOException;
import okhttp3.internal.concurrent.d;
import java.util.Iterator;
import java.net.Proxy;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okhttp3.i0;
import java.lang.ref.Reference;
import java.util.List;
import okio.n;
import okio.o;
import okhttp3.d0;
import okhttp3.u;
import java.net.Socket;
import kotlin.Metadata;
import okhttp3.j;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0001RB\u001a\u0012\u0006\u0010k\u001a\u00020g\u0012\u0007\u0010\u0089\u0001\u001a\u00020\u001b¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J>\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u0010,\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u001bH\u0016J\u0006\u0010;\u001a\u00020\u000bJ\b\u0010=\u001a\u00020<H\u0016J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dJ\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0016J\n\u0010H\u001a\u0004\u0018\u00010 H\u0016J'\u0010L\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020N2\b\u0010G\u001a\u0004\u0018\u00010JH\u0000¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020QH\u0016J\b\u0010T\u001a\u00020SH\u0016R\u0018\u0010V\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010UR%\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0X0W8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bZ\u0010[R\"\u0010c\u001a\u00020]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010eR\u0019\u0010k\u001a\u00020g8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010h\u001a\u0004\bi\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010x\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\b^\u0010wR\"\u0010}\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010a\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010aR\u0017\u0010\u0080\u0001\u001a\u00020\u001d8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010vR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010UR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010\u0086\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010tR\u0018\u0010\u0089\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0088\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010a¨\u0006\u008d\u0001" }, d2 = { "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/http2/f$d;", "Lokhttp3/j;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/e;", "call", "Lokhttp3/s;", "eventListener", "Lkotlin/j2;", "q", "o", "Lokhttp3/internal/connection/b;", "connectionSpecSelector", "pingIntervalMillis", "t", "L", "p", "Lokhttp3/e0;", "tunnelRequest", "Lokhttp3/w;", "url", "r", "s", "", "Lokhttp3/i0;", "candidates", "", "H", "M", "Lokhttp3/u;", "handshake", "l", "G", "()V", "F", "z", "connectionRetryEnabled", "m", "Lokhttp3/a;", "address", "routes", "A", "(Lokhttp3/a;Ljava/util/List;)Z", "Lokhttp3/c0;", "client", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http/d;", "D", "(Lokhttp3/c0;Lokhttp3/internal/http/g;)Lokhttp3/internal/http/d;", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/internal/ws/e$d;", "E", "(Lokhttp3/internal/connection/c;)Lokhttp3/internal/ws/e$d;", "b", "k", "Ljava/net/Socket;", "d", "doExtensiveChecks", "B", "Lokhttp3/internal/http2/i;", "stream", "f", "Lokhttp3/internal/http2/f;", "connection", "Lokhttp3/internal/http2/m;", "settings", "e", "c", "failedRoute", "Ljava/io/IOException;", "failure", "n", "(Lokhttp3/c0;Lokhttp3/i0;Ljava/io/IOException;)V", "Lokhttp3/internal/connection/e;", "N", "(Lokhttp3/internal/connection/e;Ljava/io/IOException;)V", "Lokhttp3/d0;", "a", "", "toString", "Ljava/net/Socket;", "rawSocket", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "u", "()Ljava/util/List;", "calls", "", "J", "w", "()J", "I", "(J)V", "idleAtNs", "allocationLimit", "Lokhttp3/d0;", "protocol", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "v", "()Lokhttp3/internal/connection/h;", "connectionPool", "g", "Lokhttp3/internal/http2/f;", "http2Connection", "Lokio/n;", "i", "Lokio/n;", "sink", "j", "Z", "x", "()Z", "(Z)V", "noNewExchanges", "y", "()I", "K", "(I)V", "routeFailureCount", "successCount", "C", "isMultiplexed", "Lokio/o;", "h", "Lokio/o;", "source", "socket", "Lokhttp3/u;", "noCoalescedConnections", "Lokhttp3/i0;", "route", "refusedStreamCount", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/i0;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class f extends d implements j
{
    private static final String t = "throw with null exception";
    private static final int u = 21;
    public static final long v = 10000000000L;
    public static final a w;
    private Socket c;
    private Socket d;
    private u e;
    private d0 f;
    private okhttp3.internal.http2.f g;
    private o h;
    private n i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    @org.jetbrains.annotations.e
    private final List<Reference<okhttp3.internal.connection.e>> p;
    private long q;
    @org.jetbrains.annotations.e
    private final h r;
    private final i0 s;
    
    static {
        w = new a(null);
    }
    
    public f(@org.jetbrains.annotations.e final h r, @org.jetbrains.annotations.e final i0 s) {
        kotlin.jvm.internal.k0.p((Object)r, "connectionPool");
        kotlin.jvm.internal.k0.p((Object)s, "route");
        this.r = r;
        this.s = s;
        this.o = 1;
        this.p = new ArrayList<Reference<okhttp3.internal.connection.e>>();
        this.q = Long.MAX_VALUE;
    }
    
    private final boolean H(final List<i0> list) {
        final boolean b = list instanceof Collection;
        boolean b2 = true;
        if (!b || !list.isEmpty()) {
            for (final i0 i0 : list) {
                if (i0.e().type() == Proxy.Type.DIRECT && this.s.e().type() == Proxy.Type.DIRECT && kotlin.jvm.internal.k0.g((Object)this.s.g(), (Object)i0.g())) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    private final void L(final int n) throws IOException {
        final Socket d = this.d;
        kotlin.jvm.internal.k0.m((Object)d);
        final o h = this.h;
        kotlin.jvm.internal.k0.m((Object)h);
        final n i = this.i;
        kotlin.jvm.internal.k0.m((Object)i);
        d.setSoTimeout(0);
        final okhttp3.internal.http2.f a = new okhttp3.internal.http2.f.b(true, okhttp3.internal.concurrent.d.h).y(d, this.s.d().w().F(), h, i).k(this).l(n).a();
        this.g = a;
        this.o = okhttp3.internal.http2.f.p0.a().f();
        okhttp3.internal.http2.f.W0(a, false, null, 3, null);
    }
    
    private final boolean M(final okhttp3.w w) {
        if (okhttp3.internal.d.h && !Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            kotlin.jvm.internal.k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        final okhttp3.w w2 = this.s.d().w();
        final int n = w.N();
        final int n2 = w2.N();
        final boolean b = false;
        if (n != n2) {
            return false;
        }
        if (kotlin.jvm.internal.k0.g((Object)w.F(), (Object)w2.F())) {
            return true;
        }
        boolean b2 = b;
        if (!this.k) {
            final u e = this.e;
            b2 = b;
            if (e != null) {
                kotlin.jvm.internal.k0.m((Object)e);
                b2 = b;
                if (this.l(w, e)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static final /* synthetic */ u g(final f f) {
        return f.e;
    }
    
    public static final /* synthetic */ void j(final f f, final Socket d) {
        f.d = d;
    }
    
    private final boolean l(final okhttp3.w w, final u u) {
        final List<Certificate> m = u.m();
        final boolean empty = m.isEmpty();
        boolean b = true;
        if (empty ^ true) {
            final okhttp3.internal.tls.d c = okhttp3.internal.tls.d.c;
            final String f = w.F();
            final Certificate value = m.get(0);
            Objects.requireNonNull(value, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c.c(f, (X509Certificate)value)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    private final void o(final int n, final int soTimeout, final okhttp3.e e, final s s) throws IOException {
        final Proxy e2 = this.s.e();
        final okhttp3.a d = this.s.d();
        final Proxy.Type type = e2.type();
        Socket socket = null;
        Label_0085: {
            if (type != null) {
                final int n2 = okhttp3.internal.connection.g.a[type.ordinal()];
                if (n2 == 1 || n2 == 2) {
                    socket = d.u().createSocket();
                    kotlin.jvm.internal.k0.m((Object)socket);
                    break Label_0085;
                }
            }
            socket = new Socket(e2);
        }
        this.c = socket;
        s.j(e, this.s.g(), e2);
        socket.setSoTimeout(soTimeout);
        try {
            okhttp3.internal.platform.h.e.g().g(socket, this.s.g(), n);
            try {
                this.h = okio.d0.d(okio.d0.t(socket));
                this.i = okio.d0.c(okio.d0.o(socket));
            }
            catch (NullPointerException cause) {
                if (kotlin.jvm.internal.k0.g((Object)cause.getMessage(), (Object)"throw with null exception")) {
                    throw new IOException(cause);
                }
            }
        }
        catch (ConnectException cause2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.s.g());
            final ConnectException ex = new ConnectException(sb.toString());
            ex.initCause(cause2);
            throw ex;
        }
    }
    
    private final void p(final okhttp3.internal.connection.b b) throws IOException {
        final okhttp3.a d = this.s.d();
        final SSLSocketFactory v = d.v();
        Object a = null;
        final String s = null;
        X509Certificate x509Certificate = null;
        Label_0586: {
            try {
                kotlin.jvm.internal.k0.m((Object)v);
                final Socket socket = v.createSocket(this.c, d.w().F(), d.w().N(), true);
                if (socket != null) {
                    final SSLSocket d2 = (SSLSocket)socket;
                    try {
                        a = b.a(d2);
                        if (((l)a).k()) {
                            okhttp3.internal.platform.h.e.g().f(d2, d.w().F(), d.q());
                        }
                        d2.startHandshake();
                        final SSLSession session = d2.getSession();
                        final u.a e = okhttp3.u.e;
                        kotlin.jvm.internal.k0.o((Object)session, "sslSocketSession");
                        final u b2 = e.b(session);
                        final HostnameVerifier p = d.p();
                        kotlin.jvm.internal.k0.m((Object)p);
                        if (p.verify(d.w().F(), session)) {
                            final okhttp3.g l = d.l();
                            kotlin.jvm.internal.k0.m((Object)l);
                            this.e = new u(b2.o(), b2.g(), b2.k(), (n6.a<? extends List<? extends Certificate>>)new n6.a<List<? extends Certificate>>() {
                                @org.jetbrains.annotations.e
                                public final List<Certificate> a() {
                                    final okhttp3.internal.tls.c e = l.e();
                                    kotlin.jvm.internal.k0.m((Object)e);
                                    return e.a(b2.m(), d.w().F());
                                }
                            });
                            l.c(d.w().F(), (n6.a<? extends List<? extends X509Certificate>>)new n6.a<List<? extends X509Certificate>>() {
                                final /* synthetic */ f G;
                                
                                @org.jetbrains.annotations.e
                                public final List<X509Certificate> a() {
                                    final u g = okhttp3.internal.connection.f.g(this.G);
                                    kotlin.jvm.internal.k0.m((Object)g);
                                    final List<Certificate> m = g.m();
                                    final ArrayList list = new ArrayList<X509Certificate>(kotlin.collections.v.Y((Iterable)m, 10));
                                    for (final Certificate obj : m) {
                                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        list.add((X509Certificate)obj);
                                    }
                                    return (List<X509Certificate>)list;
                                }
                            });
                            String j = s;
                            if (((l)a).k()) {
                                j = okhttp3.internal.platform.h.e.g().j(d2);
                            }
                            this.d = d2;
                            this.h = okio.d0.d(okio.d0.t(d2));
                            this.i = okio.d0.c(okio.d0.o(d2));
                            d0 f;
                            if (j != null) {
                                f = okhttp3.d0.O.a(j);
                            }
                            else {
                                f = okhttp3.d0.I;
                            }
                            this.f = f;
                            okhttp3.internal.platform.h.e.g().c(d2);
                            return;
                        }
                        final List<Certificate> m = b2.m();
                        if (!(m.isEmpty() ^ true)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Hostname ");
                            sb.append(d.w().F());
                            sb.append(" not verified (no certificates)");
                            throw new SSLPeerUnverifiedException(sb.toString());
                        }
                        final Certificate value = m.get(0);
                        if (value == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                        a = value;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("\n              |Hostname ");
                        sb2.append(d.w().F());
                        sb2.append(" not verified:\n              |    certificate: ");
                        sb2.append(okhttp3.g.d.a((Certificate)a));
                        sb2.append("\n              |    DN: ");
                        final Principal subjectDN = ((X509Certificate)a).getSubjectDN();
                        kotlin.jvm.internal.k0.o((Object)subjectDN, "cert.subjectDN");
                        sb2.append(subjectDN.getName());
                        sb2.append("\n              |    subjectAltNames: ");
                        sb2.append(okhttp3.internal.tls.d.c.a((X509Certificate)a));
                        sb2.append("\n              ");
                        throw new SSLPeerUnverifiedException(kotlin.text.s.r(sb2.toString(), null, 1, null));
                    }
                    finally {
                        break Label_0586;
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            finally {
                x509Certificate = (X509Certificate)a;
            }
        }
        if (x509Certificate != null) {
            okhttp3.internal.platform.h.e.g().c((SSLSocket)x509Certificate);
        }
        if (x509Certificate != null) {
            okhttp3.internal.d.n((Socket)x509Certificate);
        }
    }
    
    private final void q(final int n, final int n2, final int n3, final okhttp3.e e, final s s) throws IOException {
        e0 e2 = this.s();
        final okhttp3.w q = e2.q();
        for (int i = 0; i < 21; ++i) {
            this.o(n, n2, e, s);
            e2 = this.r(n2, n3, e2, q);
            if (e2 == null) {
                break;
            }
            final Socket c = this.c;
            if (c != null) {
                okhttp3.internal.d.n(c);
            }
            this.c = null;
            this.i = null;
            this.h = null;
            s.h(e, this.s.g(), this.s.e(), null);
        }
    }
    
    private final e0 r(final int n, final int n2, e0 a, final okhttp3.w w) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(okhttp3.internal.d.a0(w, true));
        sb.append(" HTTP/1.1");
        final String string = sb.toString();
        while (true) {
            final o h = this.h;
            kotlin.jvm.internal.k0.m((Object)h);
            final n i = this.i;
            kotlin.jvm.internal.k0.m((Object)i);
            final okhttp3.internal.http1.b b = new okhttp3.internal.http1.b(null, this, h, i);
            final t0 timeout = h.timeout();
            final long n3 = n;
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            timeout.i(n3, milliseconds);
            i.timeout().i(n2, milliseconds);
            b.C(a.k(), string);
            b.a();
            final g0.a d = b.d(false);
            kotlin.jvm.internal.k0.m((Object)d);
            final g0 c = d.E(a).c();
            b.B(c);
            final int x = c.x();
            if (x != 200) {
                if (x != 407) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unexpected response code for CONNECT: ");
                    sb2.append(c.x());
                    throw new IOException(sb2.toString());
                }
                a = this.s.d().s().a(this.s, c);
                if (a == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (kotlin.text.s.K1("close", okhttp3.g0.G(c, "Connection", null, 2, null), true)) {
                    return a;
                }
                continue;
            }
            else {
                if (h.z().D1() && i.z().D1()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }
    
    private final e0 s() throws IOException {
        e0 b = new e0.a().D(this.s.d().w()).p("CONNECT", null).n("Host", okhttp3.internal.d.a0(this.s.d().w(), true)).n("Proxy-Connection", "Keep-Alive").n("User-Agent", "okhttp/4.9.0").b();
        final e0 a = this.s.d().s().a(this.s, new g0.a().E(b).B(okhttp3.d0.I).g(407).y("Preemptive Authenticate").b(okhttp3.internal.d.c).F(-1L).C(-1L).v("Proxy-Authenticate", "OkHttp-Preemptive").c());
        if (a != null) {
            b = a;
        }
        return b;
    }
    
    private final void t(final okhttp3.internal.connection.b b, final int n, final okhttp3.e e, final s s) throws IOException {
        if (this.s.d().v() != null) {
            s.C(e);
            this.p(b);
            s.B(e, this.e);
            if (this.f == okhttp3.d0.K) {
                this.L(n);
            }
            return;
        }
        final List<d0> q = this.s.d().q();
        final d0 l = okhttp3.d0.L;
        if (q.contains(l)) {
            this.d = this.c;
            this.f = l;
            this.L(n);
            return;
        }
        this.d = this.c;
        this.f = okhttp3.d0.I;
    }
    
    public final boolean A(@org.jetbrains.annotations.e final okhttp3.a a, @org.jetbrains.annotations.f final List<i0> list) {
        kotlin.jvm.internal.k0.p((Object)a, "address");
        if (okhttp3.internal.d.h && !Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            kotlin.jvm.internal.k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        if (this.p.size() >= this.o) {
            return false;
        }
        if (this.j) {
            return false;
        }
        if (!this.s.d().o(a)) {
            return false;
        }
        if (kotlin.jvm.internal.k0.g((Object)a.w().F(), (Object)this.b().d().w().F())) {
            return true;
        }
        if (this.g == null) {
            return false;
        }
        if (list == null) {
            return false;
        }
        if (!this.H(list)) {
            return false;
        }
        if (a.p() != okhttp3.internal.tls.d.c) {
            return false;
        }
        if (!this.M(a.w())) {
            return false;
        }
        try {
            final okhttp3.g l = a.l();
            kotlin.jvm.internal.k0.m((Object)l);
            final String f = a.w().F();
            final u c = this.c();
            kotlin.jvm.internal.k0.m((Object)c);
            l.a(f, c.m());
            return true;
        }
        catch (SSLPeerUnverifiedException ex) {
            return false;
        }
    }
    
    public final boolean B(final boolean b) {
        if (okhttp3.internal.d.h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            kotlin.jvm.internal.k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        final long nanoTime = System.nanoTime();
        final Socket c = this.c;
        kotlin.jvm.internal.k0.m((Object)c);
        final Socket d = this.d;
        kotlin.jvm.internal.k0.m((Object)d);
        final o h = this.h;
        kotlin.jvm.internal.k0.m((Object)h);
        if (!c.isClosed() && !d.isClosed() && !d.isInputShutdown()) {
            if (!d.isOutputShutdown()) {
                final okhttp3.internal.http2.f g = this.g;
                if (g != null) {
                    return g.a0(nanoTime);
                }
                synchronized (this) {
                    final long q = this.q;
                    // monitorexit(this)
                    return nanoTime - q < 10000000000L || !b || okhttp3.internal.d.K(d, h);
                }
            }
        }
        return false;
    }
    
    public final boolean C() {
        return this.g != null;
    }
    
    @org.jetbrains.annotations.e
    public final okhttp3.internal.http.d D(@org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final okhttp3.internal.http.g g) throws SocketException {
        kotlin.jvm.internal.k0.p((Object)c0, "client");
        kotlin.jvm.internal.k0.p((Object)g, "chain");
        final Socket d = this.d;
        kotlin.jvm.internal.k0.m((Object)d);
        final o h = this.h;
        kotlin.jvm.internal.k0.m((Object)h);
        final n i = this.i;
        kotlin.jvm.internal.k0.m((Object)i);
        final okhttp3.internal.http2.f g2 = this.g;
        okhttp3.internal.http.d d2;
        if (g2 != null) {
            d2 = new okhttp3.internal.http2.g(c0, this, g, g2);
        }
        else {
            d.setSoTimeout(g.b());
            final t0 timeout = h.timeout();
            final long n = g.o();
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            timeout.i(n, milliseconds);
            i.timeout().i(g.q(), milliseconds);
            d2 = new okhttp3.internal.http1.b(c0, this, h, i);
        }
        return d2;
    }
    
    @org.jetbrains.annotations.e
    public final okhttp3.internal.ws.e.d E(@org.jetbrains.annotations.e final okhttp3.internal.connection.c c) throws SocketException {
        kotlin.jvm.internal.k0.p((Object)c, "exchange");
        final Socket d = this.d;
        kotlin.jvm.internal.k0.m((Object)d);
        final o h = this.h;
        kotlin.jvm.internal.k0.m((Object)h);
        final n i = this.i;
        kotlin.jvm.internal.k0.m((Object)i);
        d.setSoTimeout(0);
        this.G();
        return new okhttp3.internal.ws.e.d(true) {
            @Override
            public void close() {
                c.a(-1L, true, true, (IOException)null);
            }
        };
    }
    
    public final void F() {
        synchronized (this) {
            this.k = true;
        }
    }
    
    public final void G() {
        synchronized (this) {
            this.j = true;
        }
    }
    
    public final void I(final long q) {
        this.q = q;
    }
    
    public final void J(final boolean j) {
        this.j = j;
    }
    
    public final void K(final int l) {
        this.l = l;
    }
    
    public final void N(@org.jetbrains.annotations.e final okhttp3.internal.connection.e e, @org.jetbrains.annotations.f final IOException ex) {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)e, "call");
            int n;
            if (ex instanceof okhttp3.internal.http2.n) {
                if (((okhttp3.internal.http2.n)ex).G == okhttp3.internal.http2.b.O) {
                    if (++this.n <= 1) {
                        return;
                    }
                    this.j = true;
                    n = this.l;
                }
                else {
                    if (((okhttp3.internal.http2.n)ex).G == okhttp3.internal.http2.b.P && e.K()) {
                        return;
                    }
                    this.j = true;
                    n = this.l;
                }
            }
            else {
                if (this.C() && !(ex instanceof okhttp3.internal.http2.a)) {
                    return;
                }
                this.j = true;
                if (this.m != 0) {
                    return;
                }
                if (ex != null) {
                    this.n(e.m(), this.s, ex);
                }
                n = this.l;
            }
            this.l = n + 1;
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public d0 a() {
        final d0 f = this.f;
        kotlin.jvm.internal.k0.m((Object)f);
        return f;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public i0 b() {
        return this.s;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public u c() {
        return this.e;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Socket d() {
        final Socket d = this.d;
        kotlin.jvm.internal.k0.m((Object)d);
        return d;
    }
    
    @Override
    public void e(@org.jetbrains.annotations.e final okhttp3.internal.http2.f f, @org.jetbrains.annotations.e final m m) {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)f, "connection");
            kotlin.jvm.internal.k0.p((Object)m, "settings");
            this.o = m.f();
        }
    }
    
    @Override
    public void f(@org.jetbrains.annotations.e final i i) throws IOException {
        kotlin.jvm.internal.k0.p((Object)i, "stream");
        i.d(okhttp3.internal.http2.b.O, null);
    }
    
    public final void k() {
        final Socket c = this.c;
        if (c != null) {
            okhttp3.internal.d.n(c);
        }
    }
    
    public final void m(final int n, final int n2, final int n3, final int n4, final boolean b, @org.jetbrains.annotations.e final okhttp3.e e, @org.jetbrains.annotations.e final s s) {
        kotlin.jvm.internal.k0.p((Object)e, "call");
        kotlin.jvm.internal.k0.p((Object)s, "eventListener");
        if (this.f == null) {
            Object str = this.s.d().m();
            final okhttp3.internal.connection.b b2 = new okhttp3.internal.connection.b((List<l>)str);
            if (this.s.d().v() == null) {
                if (!((List)str).contains(okhttp3.l.j)) {
                    throw new okhttp3.internal.connection.j(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
                str = this.s.d().w().F();
                if (!okhttp3.internal.platform.h.e.g().l((String)str)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("CLEARTEXT communication to ");
                    sb.append((String)str);
                    sb.append(" not permitted by network security policy");
                    throw new okhttp3.internal.connection.j(new UnknownServiceException(sb.toString()));
                }
            }
            else if (this.s.d().q().contains(okhttp3.d0.L)) {
                throw new okhttp3.internal.connection.j(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            okhttp3.internal.connection.j j = null;
            do {
                try {
                    Label_0263: {
                        if (this.s.f()) {
                            this.q(n, n2, n3, e, s);
                            str = this.c;
                            if (str == null) {
                                break Label_0263;
                            }
                            break Label_0263;
                        }
                        try {
                            this.o(n, n2, e, s);
                            try {
                                this.t(b2, n4, e, s);
                                s.h(e, this.s.g(), this.s.e(), this.f);
                                if (this.s.f() && this.c == null) {
                                    throw new okhttp3.internal.connection.j(new ProtocolException("Too many tunnel connections attempted: 21"));
                                }
                                this.q = System.nanoTime();
                                return;
                            }
                            catch (IOException str) {}
                        }
                        catch (IOException str) {}
                    }
                }
                catch (IOException ex) {}
                final Socket d = this.d;
                if (d != null) {
                    okhttp3.internal.d.n(d);
                }
                final Socket c = this.c;
                if (c != null) {
                    okhttp3.internal.d.n(c);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                s.i(e, this.s.g(), this.s.e(), null, (IOException)str);
                if (j == null) {
                    j = new okhttp3.internal.connection.j((IOException)str);
                }
                else {
                    j.a((IOException)str);
                }
            } while (b && b2.b((IOException)str));
            throw j;
        }
        throw new IllegalStateException("already connected".toString());
    }
    
    public final void n(@org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final i0 i0, @org.jetbrains.annotations.e final IOException ex) {
        kotlin.jvm.internal.k0.p((Object)c0, "client");
        kotlin.jvm.internal.k0.p((Object)i0, "failedRoute");
        kotlin.jvm.internal.k0.p((Object)ex, "failure");
        if (i0.e().type() != Proxy.Type.DIRECT) {
            final okhttp3.a d = i0.d();
            d.t().connectFailed(d.w().Z(), i0.e().address(), ex);
        }
        c0.b0().b(i0);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.s.d().w().F());
        sb.append(':');
        sb.append(this.s.d().w().N());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.s.e());
        sb.append(" hostAddress=");
        sb.append(this.s.g());
        sb.append(" cipherSuite=");
        final u e = this.e;
        Object g = null;
        Label_0139: {
            if (e != null) {
                g = e.g();
                if (g != null) {
                    break Label_0139;
                }
            }
            g = "none";
        }
        sb.append(g);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
    
    @org.jetbrains.annotations.e
    public final List<Reference<okhttp3.internal.connection.e>> u() {
        return this.p;
    }
    
    @org.jetbrains.annotations.e
    public final h v() {
        return this.r;
    }
    
    public final long w() {
        return this.q;
    }
    
    public final boolean x() {
        return this.j;
    }
    
    public final int y() {
        return this.l;
    }
    
    public final void z() {
        synchronized (this) {
            ++this.m;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "okhttp3/internal/connection/f$a", "", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/i0;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lokhttp3/internal/connection/f;", "a", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final f a(@org.jetbrains.annotations.e final h h, @org.jetbrains.annotations.e final i0 i0, @org.jetbrains.annotations.e final Socket socket, final long n) {
            kotlin.jvm.internal.k0.p((Object)h, "connectionPool");
            kotlin.jvm.internal.k0.p((Object)i0, "route");
            kotlin.jvm.internal.k0.p((Object)socket, "socket");
            final f f = new f(h, i0);
            okhttp3.internal.connection.f.j(f, socket);
            f.I(n);
            return f;
        }
    }
}
