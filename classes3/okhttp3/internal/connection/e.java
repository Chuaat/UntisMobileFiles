// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import java.lang.ref.WeakReference;
import kotlin.m;
import okhttp3.q;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.Closeable;
import okhttp3.x;
import okhttp3.internal.http.b;
import java.util.Collection;
import kotlin.collections.v;
import java.util.ArrayList;
import okio.t0;
import okhttp3.g0;
import java.util.Iterator;
import java.lang.ref.Reference;
import okhttp3.g;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.d0;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import okhttp3.a;
import okhttp3.w;
import java.net.Socket;
import okhttp3.j;
import java.io.InterruptedIOException;
import java.io.IOException;
import kotlin.j2;
import java.util.concurrent.TimeUnit;
import okio.k;
import kotlin.jvm.internal.k0;
import okhttp3.e0;
import okhttp3.c0;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.s;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001[\u0018\u00002\u00020\u0001:\u0002~\u007fB\u001f\u0012\u0006\u0010{\u001a\u00020v\u0012\u0006\u0010C\u001a\u00020\u0014\u0012\u0006\u0010X\u001a\u00020\u0017¢\u0006\u0004\b|\u0010}J\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u000f\u0010\u001f\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0017J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)J;\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b1\u0010\bJ\u0011\u00103\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\b3\u00104J\u0006\u0010\u0005\u001a\u00020\u0002J\u0017\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0017H\u0000¢\u0006\u0004\b6\u00107J\u0006\u00108\u001a\u00020\u0017J\u000f\u00109\u001a\u00020\u000fH\u0000¢\u0006\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0019\u0010C\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR(\u0010I\u001a\u0004\u0018\u00010&2\b\u0010D\u001a\u0004\u0018\u00010&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010,\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010FR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010OR\u0016\u0010R\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010KR\u0016\u0010T\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010KR\u0019\u0010X\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010KR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R(\u0010*\u001a\u0004\u0018\u00010)2\b\u0010D\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010KR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010m\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010`\u001a\u0004\bj\u0010b\"\u0004\bk\u0010lR\u001c\u0010r\u001a\u00020n8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\bp\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010tR\u0019\u0010{\u001a\u00020v8\u0006@\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010z¨\u0006\u0080\u0001" }, d2 = { "Lokhttp3/internal/connection/e;", "Lokhttp3/e;", "Lkotlin/j2;", "f", "Ljava/io/IOException;", "E", "e", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "F", "Lokhttp3/w;", "url", "Lokhttp3/a;", "i", "", "H", "Lokio/k;", "D", "g", "Lokhttp3/e0;", "k", "cancel", "", "K", "Lokhttp3/g0;", "p", "Lokhttp3/f;", "responseCallback", "q1", "G", "v", "()Lokhttp3/g0;", "request", "newExchangeFinder", "j", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/connection/c;", "w", "(Lokhttp3/internal/http/g;)Lokhttp3/internal/connection/c;", "Lokhttp3/internal/connection/f;", "connection", "c", "exchange", "requestDone", "responseDone", "x", "(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "y", "Ljava/net/Socket;", "A", "()Ljava/net/Socket;", "closeExchange", "l", "(Z)V", "B", "z", "()Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "W", "Lokhttp3/e0;", "u", "()Lokhttp3/e0;", "originalRequest", "<set-?>", "O", "Lokhttp3/internal/connection/c;", "t", "()Lokhttp3/internal/connection/c;", "interceptorScopedExchange", "Q", "Z", "responseBodyOpen", "T", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "connectionPool", "N", "timeoutEarlyExit", "S", "canceled", "X", "s", "()Z", "forWebSocket", "R", "expectMoreExchanges", "okhttp3/internal/connection/e$c", "I", "Lokhttp3/internal/connection/e$c;", "timeout", "M", "Lokhttp3/internal/connection/f;", "n", "()Lokhttp3/internal/connection/f;", "P", "requestBodyOpen", "Lokhttp3/internal/connection/d;", "L", "Lokhttp3/internal/connection/d;", "exchangeFinder", "U", "q", "C", "(Lokhttp3/internal/connection/f;)V", "connectionToCancel", "Lokhttp3/s;", "Lokhttp3/s;", "r", "()Lokhttp3/s;", "eventListener", "", "Ljava/lang/Object;", "callStackTrace", "Lokhttp3/c0;", "V", "Lokhttp3/c0;", "m", "()Lokhttp3/c0;", "client", "<init>", "(Lokhttp3/c0;Lokhttp3/e0;Z)V", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class e implements okhttp3.e
{
    private final h G;
    @org.jetbrains.annotations.e
    private final s H;
    private final e$c I;
    private final AtomicBoolean J;
    private Object K;
    private d L;
    @org.jetbrains.annotations.f
    private f M;
    private boolean N;
    @org.jetbrains.annotations.f
    private c O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private volatile boolean S;
    private volatile c T;
    @org.jetbrains.annotations.f
    private volatile f U;
    @org.jetbrains.annotations.e
    private final c0 V;
    @org.jetbrains.annotations.e
    private final e0 W;
    private final boolean X;
    
    public e(@org.jetbrains.annotations.e final c0 v, @org.jetbrains.annotations.e final e0 w, final boolean x) {
        k0.p((Object)v, "client");
        k0.p((Object)w, "originalRequest");
        this.V = v;
        this.W = w;
        this.X = x;
        this.G = v.T().c();
        this.H = v.Y().a(this);
        final k i = new k() {
            final /* synthetic */ e n;
            
            @Override
            protected void D() {
                this.n.cancel();
            }
        };
        i.i(v.P(), TimeUnit.MILLISECONDS);
        final j2 a = j2.a;
        this.I = i;
        this.J = new AtomicBoolean();
        this.R = true;
    }
    
    private final <E extends IOException> E F(final E cause) {
        if (this.N) {
            return cause;
        }
        if (!this.I.y()) {
            return cause;
        }
        final IOException ex = new InterruptedIOException("timeout");
        if (cause != null) {
            ex.initCause(cause);
        }
        return (E)ex;
    }
    
    private final String H() {
        final StringBuilder sb = new StringBuilder();
        String str;
        if (this.K()) {
            str = "canceled ";
        }
        else {
            str = "";
        }
        sb.append(str);
        String str2;
        if (this.X) {
            str2 = "web socket";
        }
        else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(this.z());
        return sb.toString();
    }
    
    public static final /* synthetic */ e$c a(final e e) {
        return e.I;
    }
    
    private final <E extends IOException> E d(final E e) {
        final boolean h = okhttp3.internal.d.h;
        if (h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        final f m = this.M;
        if (m != null) {
            if (h && Thread.holdsLock(m)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                final Thread currentThread2 = Thread.currentThread();
                k0.o((Object)currentThread2, "Thread.currentThread()");
                sb2.append(currentThread2.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(m);
                throw new AssertionError((Object)sb2.toString());
            }
            synchronized (m) {
                final Socket a = this.A();
                // monitorexit(m)
                if (this.M == null) {
                    if (a != null) {
                        okhttp3.internal.d.n(a);
                    }
                    this.H.l(this, m);
                }
                else if (a != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        final IOException f = this.F((IOException)e);
        if (e != null) {
            final s h2 = this.H;
            k0.m((Object)f);
            h2.e(this, f);
        }
        else {
            this.H.d(this);
        }
        return (E)f;
    }
    
    private final void f() {
        this.K = okhttp3.internal.platform.h.e.g().k("response.body().close()");
        this.H.f(this);
    }
    
    private final okhttp3.a i(final w w) {
        SSLSocketFactory p;
        Object c0;
        g r;
        if (w.G()) {
            p = this.V.p0();
            c0 = this.V.c0();
            r = this.V.R();
        }
        else {
            p = null;
            c0 = (r = (g)p);
        }
        return new okhttp3.a(w.F(), w.N(), this.V.X(), this.V.o0(), p, (HostnameVerifier)c0, r, this.V.k0(), this.V.j0(), this.V.i0(), this.V.U(), this.V.l0());
    }
    
    @org.jetbrains.annotations.f
    public final Socket A() {
        final f m = this.M;
        k0.m((Object)m);
        if (okhttp3.internal.d.h && !Thread.holdsLock(m)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(m);
            throw new AssertionError((Object)sb.toString());
        }
        final List<Reference<e>> u = m.u();
        final Iterator<Reference<e>> iterator = u.iterator();
        boolean b = false;
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (k0.g((Object)iterator.next().get(), (Object)this)) {
                    if (n != -1) {
                        b = true;
                    }
                    if (b) {
                        u.remove(n);
                        this.M = null;
                        if (u.isEmpty()) {
                            m.I(System.nanoTime());
                            if (this.G.c(m)) {
                                return m.d();
                            }
                        }
                        return null;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                else {
                    ++n;
                }
            }
            n = -1;
            continue;
        }
    }
    
    public final boolean B() {
        final d l = this.L;
        k0.m((Object)l);
        return l.e();
    }
    
    public final void C(@org.jetbrains.annotations.f final f u) {
        this.U = u;
    }
    
    @org.jetbrains.annotations.e
    public k D() {
        return this.I;
    }
    
    public final void E() {
        if (this.N ^ true) {
            this.N = true;
            this.I.y();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @Override
    public boolean G() {
        return this.J.get();
    }
    
    @Override
    public boolean K() {
        return this.S;
    }
    
    public final void c(@org.jetbrains.annotations.e final f f) {
        k0.p((Object)f, "connection");
        if (okhttp3.internal.d.h && !Thread.holdsLock(f)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(f);
            throw new AssertionError((Object)sb.toString());
        }
        if (this.M == null) {
            this.M = f;
            f.u().add(new b(this, this.K));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @Override
    public void cancel() {
        if (this.S) {
            return;
        }
        this.S = true;
        final c t = this.T;
        if (t != null) {
            t.b();
        }
        final f u = this.U;
        if (u != null) {
            u.k();
        }
        this.H.g(this);
    }
    
    @org.jetbrains.annotations.e
    public e g() {
        return new e(this.V, this.W, this.X);
    }
    
    public final void j(@org.jetbrains.annotations.e final e0 e0, final boolean b) {
        k0.p((Object)e0, "request");
        if (this.O == null) {
            synchronized (this) {
                if (!(this.Q ^ true)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (this.P ^ true) {
                    final j2 a = j2.a;
                    // monitorexit(this)
                    if (b) {
                        this.L = new d(this.G, this.i(e0.q()), this, this.H);
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e0 k() {
        return this.W;
    }
    
    public final void l(final boolean b) {
        synchronized (this) {
            if (this.R) {
                final j2 a = j2.a;
                // monitorexit(this)
                if (b) {
                    final c t = this.T;
                    if (t != null) {
                        t.d();
                    }
                }
                this.O = null;
                return;
            }
            throw new IllegalStateException("released".toString());
        }
    }
    
    @org.jetbrains.annotations.e
    public final c0 m() {
        return this.V;
    }
    
    @org.jetbrains.annotations.f
    public final f n() {
        return this.M;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public g0 p() {
        if (this.J.compareAndSet(false, true)) {
            this.I.x();
            this.f();
            try {
                this.V.W().d(this);
                return this.v();
            }
            finally {
                this.V.W().i(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }
    
    @org.jetbrains.annotations.f
    public final f q() {
        return this.U;
    }
    
    @Override
    public void q1(@org.jetbrains.annotations.e final okhttp3.f f) {
        k0.p((Object)f, "responseCallback");
        if (this.J.compareAndSet(false, true)) {
            this.f();
            this.V.W().c(new a(f));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }
    
    @org.jetbrains.annotations.e
    public final s r() {
        return this.H;
    }
    
    public final boolean s() {
        return this.X;
    }
    
    @org.jetbrains.annotations.f
    public final c t() {
        return this.O;
    }
    
    @org.jetbrains.annotations.e
    public final e0 u() {
        return this.W;
    }
    
    @org.jetbrains.annotations.e
    public final g0 v() throws IOException {
        final ArrayList<okhttp3.internal.http.j> list = new ArrayList<okhttp3.internal.http.j>();
        v.q0((Collection)list, (Iterable)this.V.d0());
        list.add(new okhttp3.internal.http.j(this.V));
        list.add((okhttp3.internal.http.j)new okhttp3.internal.http.a(this.V.V()));
        list.add((okhttp3.internal.http.j)new okhttp3.internal.cache.a(this.V.O()));
        list.add((okhttp3.internal.http.j)okhttp3.internal.connection.a.b);
        if (!this.X) {
            v.q0((Collection)list, (Iterable)this.V.f0());
        }
        list.add((okhttp3.internal.http.j)new okhttp3.internal.http.b(this.X));
        final okhttp3.internal.http.g g = new okhttp3.internal.http.g(this, list, 0, null, this.W, this.V.S(), this.V.m0(), this.V.r0());
        boolean b = false;
        try {
            final g0 e = g.e(this.W);
            if (!this.K()) {
                this.y(null);
                return e;
            }
            okhttp3.internal.d.l(e);
            throw new IOException("Canceled");
        }
        catch (IOException ex) {
            try {
                final IOException y = this.y(ex);
                if (y == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw y;
            }
            finally {
                b = true;
            }
        }
        if (!b) {
            this.y(null);
        }
        throw;
    }
    
    @org.jetbrains.annotations.e
    public final c w(@org.jetbrains.annotations.e final okhttp3.internal.http.g g) {
        k0.p((Object)g, "chain");
        synchronized (this) {
            if (!this.R) {
                throw new IllegalStateException("released".toString());
            }
            if (this.Q ^ true) {
                if (this.P ^ true) {
                    final j2 a = j2.a;
                    // monitorexit(this)
                    final d l = this.L;
                    k0.m((Object)l);
                    final c c = new c(this, this.H, l, l.a(this.V, g));
                    this.O = c;
                    this.T = c;
                    synchronized (this) {
                        this.P = true;
                        this.Q = true;
                        // monitorexit(this)
                        if (!this.S) {
                            return c;
                        }
                        throw new IOException("Canceled");
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
    
    public final <E extends IOException> E x(@org.jetbrains.annotations.e final c c, final boolean b, final boolean b2, final E e) {
        k0.p((Object)c, "exchange");
        final boolean g = k0.g((Object)c, (Object)this.T);
        boolean b3 = true;
        if (g ^ true) {
            return e;
        }
        // monitorenter(this)
        boolean b4 = false;
        Label_0137: {
            Label_0064: {
                Label_0053: {
                    if (b) {
                        Label_0181: {
                            try {
                                if (this.P) {
                                    break Label_0064;
                                }
                            }
                            finally {
                                break Label_0181;
                            }
                            break Label_0053;
                        }
                    }
                    // monitorexit(this)
                }
                if (!b2 || !this.Q) {
                    b3 = false;
                    break Label_0137;
                }
            }
            if (b) {
                this.P = false;
            }
            if (b2) {
                this.Q = false;
            }
            final boolean p4 = this.P;
            b4 = (!p4 && !this.Q);
            if (p4 || this.Q || this.R) {
                b3 = false;
            }
        }
        final j2 a = j2.a;
        // monitorexit(this)
        if (b4) {
            this.T = null;
            final f m = this.M;
            if (m != null) {
                m.z();
            }
        }
        if (b3) {
            return this.d(e);
        }
        return e;
    }
    
    @org.jetbrains.annotations.f
    public final IOException y(@org.jetbrains.annotations.f final IOException ex) {
        synchronized (this) {
            final boolean r = this.R;
            int n2;
            final int n = n2 = 0;
            if (r) {
                this.R = false;
                n2 = n;
                if (!this.P) {
                    n2 = n;
                    if (!this.Q) {
                        n2 = 1;
                    }
                }
            }
            final j2 a = j2.a;
            // monitorexit(this)
            IOException d = ex;
            if (n2 != 0) {
                d = this.d(ex);
            }
            return d;
        }
    }
    
    @org.jetbrains.annotations.e
    public final String z() {
        return this.W.q().V();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0013\u0010\u000e\u001a\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0015\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010 \u001a\u00020\u001d8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#" }, d2 = { "okhttp3/internal/connection/e$a", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/e$a;", "Lokhttp3/internal/connection/e;", "other", "Lkotlin/j2;", "f", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "run", "Lokhttp3/e0;", "e", "()Lokhttp3/e0;", "request", "Lokhttp3/f;", "H", "Lokhttp3/f;", "responseCallback", "b", "()Lokhttp3/internal/connection/e;", "call", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "G", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "d", "()Ljava/lang/String;", "host", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/f;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class a implements Runnable
    {
        @org.jetbrains.annotations.e
        private volatile AtomicInteger G;
        private final okhttp3.f H;
        
        public a(final okhttp3.f h) {
            k0.p((Object)h, "responseCallback");
            this.H = h;
            this.G = new AtomicInteger(0);
        }
        
        public final void a(@org.jetbrains.annotations.e final ExecutorService executorService) {
            k0.p((Object)executorService, "executorService");
            final q w = e.this.m().W();
            if (okhttp3.internal.d.h) {
                if (Thread.holdsLock(w)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Thread ");
                    final Thread currentThread = Thread.currentThread();
                    k0.o((Object)currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append(" MUST NOT hold lock on ");
                    sb.append(w);
                    throw new AssertionError((Object)sb.toString());
                }
            }
            try {
                try {
                    executorService.execute(this);
                }
                finally {}
            }
            catch (RejectedExecutionException cause) {
                final InterruptedIOException ex = new InterruptedIOException("executor rejected");
                ex.initCause(cause);
                e.this.y(ex);
                this.H.b(e.this, ex);
                e.this.m().W().h(this);
            }
            return;
            e.this.m().W().h(this);
        }
        
        @org.jetbrains.annotations.e
        public final e b() {
            return e.this;
        }
        
        @org.jetbrains.annotations.e
        public final AtomicInteger c() {
            return this.G;
        }
        
        @org.jetbrains.annotations.e
        public final String d() {
            return e.this.u().q().F();
        }
        
        @org.jetbrains.annotations.e
        public final e0 e() {
            return e.this.u();
        }
        
        public final void f(@org.jetbrains.annotations.e final a a) {
            k0.p((Object)a, "other");
            this.G = a.G;
        }
        
        @Override
        public void run() {
            final StringBuilder sb = new StringBuilder();
            sb.append("OkHttp ");
            sb.append(e.this.z());
            final String string = sb.toString();
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "currentThread");
            final String name = currentThread.getName();
            currentThread.setName(string);
            try {
                while (true) {
                    e.a(e.this).x();
                    while (true) {
                        boolean b;
                        try {
                            final g0 v = e.this.v();
                            try {
                                this.H.a(e.this, v);
                                final q q = e.this.m().W();
                                q.h(this);
                            }
                            catch (IOException ex2) {}
                        }
                        catch (IOException obj) {
                            b = false;
                        }
                        finally {
                            b = false;
                        }
                        final IOException obj;
                        try {
                            e.this.cancel();
                            if (!b) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("canceled due to ");
                                sb2.append(obj);
                                final IOException ex = new IOException(sb2.toString());
                                m.a((Throwable)ex, (Throwable)obj);
                                this.H.b(e.this, ex);
                            }
                            throw obj;
                        }
                        finally {}
                        if (b) {
                            final okhttp3.internal.platform.h g = okhttp3.internal.platform.h.e.g();
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Callback failure for ");
                            sb3.append(e.this.H());
                            g.m(sb3.toString(), 4, obj);
                        }
                        else {
                            this.H.b(e.this, obj);
                        }
                        final q q = e.this.m().W();
                        continue;
                    }
                }
            }
            finally {
                currentThread.setName(name);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b" }, d2 = { "okhttp3/internal/connection/e$b", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/e;", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lokhttp3/internal/connection/e;Ljava/lang/Object;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b extends WeakReference<e>
    {
        @org.jetbrains.annotations.f
        private final Object a;
        
        public b(@org.jetbrains.annotations.e final e referent, @org.jetbrains.annotations.f final Object a) {
            k0.p((Object)referent, "referent");
            super(referent);
            this.a = a;
        }
        
        @org.jetbrains.annotations.f
        public final Object a() {
            return this.a;
        }
    }
}
