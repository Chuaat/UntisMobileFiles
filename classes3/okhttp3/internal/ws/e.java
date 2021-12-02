// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.ws;

import okio.n;
import okio.o;
import okhttp3.c0;
import kotlin.text.s;
import java.net.ProtocolException;
import okhttp3.g0;
import java.net.SocketTimeoutException;
import java.io.IOException;
import java.io.Closeable;
import kotlin.jvm.internal.j1$f;
import kotlin.jvm.internal.j1$h;
import java.util.concurrent.TimeUnit;
import kotlin.j2;
import okhttp3.internal.concurrent.d;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import java.util.Random;
import okhttp3.l0;
import okhttp3.e0;
import okio.p;
import java.util.ArrayDeque;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.concurrent.a;
import okhttp3.d0;
import java.util.List;
import kotlin.Metadata;
import okhttp3.k0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u000554-+/BA\u0012\u0006\u0010y\u001a\u00020x\u0012\u0006\u0010I\u001a\u00020\r\u0012\u0006\u0010g\u001a\u00020c\u0012\u0006\u0010W\u001a\u00020U\u0012\u0006\u0010o\u001a\u00020\u000f\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010_\u001a\u00020\u000f¢\u0006\u0004\bz\u0010{J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012J!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#J\u0006\u0010&\u001a\u00020\u000bJ\u0006\u0010'\u001a\u00020\bJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bJ\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001bH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0006H\u0016J\u000e\u00106\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0006J\u001a\u00107\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001bH\u0016J \u00109\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001b2\u0006\u00108\u001a\u00020\u000fJ\u000f\u0010:\u001a\u00020\u0004H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000bH\u0000¢\u0006\u0004\b<\u0010=J\u001c\u0010@\u001a\u00020\u000b2\n\u0010/\u001a\u00060>j\u0002`?2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010FR\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010HR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010AR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010SR\u0016\u0010W\u001a\u00020U8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010VR\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\\R\u0016\u0010_\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010aR\u001c\u0010g\u001a\u00020c8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bd\u0010fR\u0016\u0010i\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010hR\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020j0X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010ZR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010hR\u0016\u0010m\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\\R\u0016\u0010n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\\R\u0016\u0010o\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0016\u0010q\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010\\R\u0016\u0010r\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010^R\u0018\u0010t\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010hR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010uR\u0016\u0010w\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010A¨\u0006|" }, d2 = { "Lokhttp3/internal/ws/e;", "Lokhttp3/k0;", "Lokhttp3/internal/ws/h$a;", "Lokhttp3/internal/ws/f;", "", "w", "Lokio/p;", "data", "", "formatOpcode", "D", "Lkotlin/j2;", "C", "Lokhttp3/e0;", "k", "", "f", "cancel", "Lokhttp3/c0;", "client", "s", "Lokhttp3/g0;", "response", "Lokhttp3/internal/connection/c;", "exchange", "q", "(Lokhttp3/g0;Lokhttp3/internal/connection/c;)V", "", "name", "Lokhttp3/internal/ws/e$d;", "streams", "v", "x", "z", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "p", "F", "E", "A", "B", "text", "d", "bytes", "c", "payload", "e", "g", "code", "reason", "h", "b", "a", "y", "close", "cancelAfterCloseMillis", "r", "G", "()Z", "H", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "t", "Z", "awaitingPong", "Lokhttp3/internal/ws/f;", "extensions", "Lokhttp3/internal/ws/h;", "Lokhttp3/internal/ws/h;", "reader", "Lokhttp3/e0;", "originalRequest", "o", "failed", "Lokhttp3/internal/ws/i;", "Lokhttp3/internal/ws/i;", "writer", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "taskQueue", "Lokhttp3/internal/concurrent/a;", "Lokhttp3/internal/concurrent/a;", "writerTask", "Ljava/util/Random;", "Ljava/util/Random;", "random", "Ljava/util/ArrayDeque;", "i", "Ljava/util/ArrayDeque;", "pongQueue", "I", "sentPingCount", "J", "minimumDeflateSize", "Lokhttp3/e;", "Lokhttp3/e;", "call", "Lokhttp3/l0;", "u", "Lokhttp3/l0;", "()Lokhttp3/l0;", "listener", "Ljava/lang/String;", "key", "", "j", "messageAndCloseQueue", "receivedPingCount", "receivedPongCount", "pingIntervalMillis", "m", "receivedCloseCode", "queueSize", "n", "receivedCloseReason", "Lokhttp3/internal/ws/e$d;", "l", "enqueuedClose", "Lokhttp3/internal/concurrent/d;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/d;Lokhttp3/e0;Lokhttp3/l0;Ljava/util/Random;JLokhttp3/internal/ws/f;J)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class e implements k0, h.a
{
    private static final long A = 16777216L;
    private static final long B = 60000L;
    public static final long C = 1024L;
    public static final b D;
    private static final List<d0> z;
    private final String a;
    private e b;
    private okhttp3.internal.concurrent.a c;
    private h d;
    private i e;
    private okhttp3.internal.concurrent.c f;
    private String g;
    private d h;
    private final ArrayDeque<p> i;
    private final ArrayDeque<Object> j;
    private long k;
    private boolean l;
    private int m;
    private String n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private final e0 t;
    @org.jetbrains.annotations.e
    private final l0 u;
    private final Random v;
    private final long w;
    private f x;
    private long y;
    
    static {
        D = new b(null);
        z = v.k((Object)d0.I);
    }
    
    public e(@org.jetbrains.annotations.e final okhttp3.internal.concurrent.d d, @org.jetbrains.annotations.e final e0 t, @org.jetbrains.annotations.e final l0 u, @org.jetbrains.annotations.e final Random v, final long w, @org.jetbrains.annotations.f final f x, final long y) {
        kotlin.jvm.internal.k0.p((Object)d, "taskRunner");
        kotlin.jvm.internal.k0.p((Object)t, "originalRequest");
        kotlin.jvm.internal.k0.p((Object)u, "listener");
        kotlin.jvm.internal.k0.p((Object)v, "random");
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.f = d.j();
        this.i = new ArrayDeque<p>();
        this.j = new ArrayDeque<Object>();
        this.m = -1;
        if (kotlin.jvm.internal.k0.g((Object)"GET", (Object)t.m())) {
            final p.a l = okio.p.L;
            final byte[] bytes = new byte[16];
            v.nextBytes(bytes);
            final j2 a = j2.a;
            this.a = okio.p.a.p(l, bytes, 0, 0, 3, null).g();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Request must be GET: ");
        sb.append(t.m());
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final void C() {
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
        final okhttp3.internal.concurrent.a c = this.c;
        if (c != null) {
            okhttp3.internal.concurrent.c.p(this.f, c, 0L, 2, null);
        }
    }
    
    private final boolean D(final p p2, final int n) {
        synchronized (this) {
            if (this.o || this.l) {
                return false;
            }
            if (this.k + p2.size() > 16777216L) {
                this.close(1001, null);
                return false;
            }
            this.k += p2.size();
            this.j.add(new c(n, p2));
            this.C();
            return true;
        }
    }
    
    public static final /* synthetic */ ArrayDeque j(final e e) {
        return e.j;
    }
    
    public static final /* synthetic */ String l(final e e) {
        return e.g;
    }
    
    public static final /* synthetic */ void n(final e e, final f x) {
        e.x = x;
    }
    
    private final boolean w(final f f) {
        if (f.f) {
            return false;
        }
        if (f.b != null) {
            return false;
        }
        final Integer d = f.d;
        if (d != null) {
            final int intValue = d;
            if (8 > intValue || 15 < intValue) {
                return false;
            }
        }
        return true;
    }
    
    public final int A() {
        synchronized (this) {
            return this.q;
        }
    }
    
    public final int B() {
        synchronized (this) {
            return this.r;
        }
    }
    
    public final int E() {
        synchronized (this) {
            return this.p;
        }
    }
    
    public final void F() throws InterruptedException {
        this.f.u();
        this.f.l().await(10L, TimeUnit.SECONDS);
    }
    
    public final boolean G() throws IOException {
        final j1$h j1$h = new j1$h();
        j1$h.G = null;
        final j1$f j1$f = new j1$f();
        j1$f.G = -1;
        final j1$h j1$h2 = new j1$h();
        j1$h2.G = null;
        final j1$h j1$h3 = new j1$h();
        j1$h3.G = null;
        final j1$h j1$h4 = new j1$h();
        j1$h4.G = null;
        final j1$h j1$h5 = new j1$h();
        j1$h5.G = null;
        synchronized (this) {
            if (this.o) {
                return false;
            }
            final i e = this.e;
            final p p = this.i.poll();
            if (p == null) {
                final Object poll = this.j.poll();
                j1$h.G = poll;
                if (poll instanceof a) {
                    final int m = this.m;
                    j1$f.G = m;
                    j1$h2.G = this.n;
                    if (m != -1) {
                        j1$h3.G = this.h;
                        this.h = null;
                        j1$h4.G = this.d;
                        this.d = null;
                        j1$h5.G = this.e;
                        this.e = null;
                        this.f.u();
                    }
                    else {
                        final Object g = j1$h.G;
                        if (g == null) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                        }
                        final long a = ((a)g).a();
                        final okhttp3.internal.concurrent.c f = this.f;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.g);
                        sb.append(" cancel");
                        final String string = sb.toString();
                        f.n(new okhttp3.internal.concurrent.a(true) {
                            final /* synthetic */ e g;
                            
                            @Override
                            public long f() {
                                this.g.cancel();
                                return -1L;
                            }
                        }, TimeUnit.MILLISECONDS.toNanos(a));
                    }
                }
                else if (poll == null) {
                    return false;
                }
            }
            final j2 a2 = j2.a;
            // monitorexit(this)
            Label_0392: {
                if (p == null) {
                    break Label_0392;
                }
                try {
                    kotlin.jvm.internal.k0.m((Object)e);
                    e.g(p);
                    // iftrue(Label_0486:, !g2 instanceof c)
                    // iftrue(Label_0656:, !g2 instanceof a)
                    // iftrue(Label_0640:, g2 == null)
                    // iftrue(Label_0470:, g2 == null)
                Block_18_Outer:
                    while (true) {
                        Object g2 = null;
                    Block_14:
                        while (true) {
                            Label_0573: {
                                break Label_0573;
                                final a a3 = (a)g2;
                                kotlin.jvm.internal.k0.m((Object)e);
                                e.c(a3.b(), a3.c());
                                try {
                                    if (j1$h3.G != null) {
                                        final l0 u = this.u;
                                        final int g3 = j1$f.G;
                                        final String s = (String)j1$h2.G;
                                        kotlin.jvm.internal.k0.m((Object)s);
                                        u.onClosed(this, g3, s);
                                    }
                                    final d d = (d)j1$h3.G;
                                    if (d != null) {
                                        okhttp3.internal.d.l(d);
                                    }
                                    final h h = (h)j1$h4.G;
                                    if (h != null) {
                                        okhttp3.internal.d.l(h);
                                    }
                                    final i i = (i)j1$h5.G;
                                    if (i != null) {
                                        okhttp3.internal.d.l(i);
                                    }
                                    return true;
                                }
                                finally {}
                            }
                            try {
                                Label_0640: {
                                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                                }
                                Label_0656:
                                throw new AssertionError();
                            }
                            finally {}
                            g2 = j1$h.G;
                            break Block_14;
                            Label_0486: {
                                continue;
                            }
                        }
                        final c c = (c)g2;
                        kotlin.jvm.internal.k0.m((Object)e);
                        e.e(c.b(), c.a());
                        synchronized (this) {
                            this.k -= c.a().size();
                            continue Block_18_Outer;
                        }
                        break;
                    }
                    Label_0470: {
                        throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                    }
                }
                finally {}
            }
            final d d2 = (d)j1$h3.G;
            if (d2 != null) {
                okhttp3.internal.d.l(d2);
            }
            final h h2 = (h)j1$h4.G;
            if (h2 != null) {
                okhttp3.internal.d.l(h2);
            }
            final i j = (i)j1$h5.G;
            if (j != null) {
                okhttp3.internal.d.l(j);
            }
        }
    }
    
    public final void H() {
        synchronized (this) {
            if (this.o) {
                return;
            }
            final i e = this.e;
            if (e == null) {
                return;
            }
            int p;
            if (this.s) {
                p = this.p;
            }
            else {
                p = -1;
            }
            ++this.p;
            this.s = true;
            final j2 a = j2.a;
            // monitorexit(this)
            if (p != -1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("sent ping but didn't receive pong within ");
                sb.append(this.w);
                sb.append("ms (after ");
                sb.append(p - 1);
                sb.append(" successful ping/pongs)");
                this.t(new SocketTimeoutException(sb.toString()), null);
                return;
            }
            try {
                e.f(okio.p.K);
            }
            catch (IOException ex) {
                this.t(ex, null);
            }
        }
    }
    
    @Override
    public boolean a(@org.jetbrains.annotations.e final p p) {
        kotlin.jvm.internal.k0.p((Object)p, "bytes");
        return this.D(p, 2);
    }
    
    @Override
    public boolean b(@org.jetbrains.annotations.e final String s) {
        kotlin.jvm.internal.k0.p((Object)s, "text");
        return this.D(okio.p.L.l(s), 1);
    }
    
    @Override
    public void c(@org.jetbrains.annotations.e final p p) throws IOException {
        kotlin.jvm.internal.k0.p((Object)p, "bytes");
        this.u.onMessage(this, p);
    }
    
    @Override
    public void cancel() {
        final e b = this.b;
        kotlin.jvm.internal.k0.m((Object)b);
        b.cancel();
    }
    
    @Override
    public boolean close(final int n, @org.jetbrains.annotations.f final String s) {
        return this.r(n, s, 60000L);
    }
    
    @Override
    public void d(@org.jetbrains.annotations.e final String s) throws IOException {
        kotlin.jvm.internal.k0.p((Object)s, "text");
        this.u.onMessage(this, s);
    }
    
    @Override
    public void e(@org.jetbrains.annotations.e final p e) {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)e, "payload");
            if (!this.o && (!this.l || !this.j.isEmpty())) {
                this.i.add(e);
                this.C();
                ++this.q;
            }
        }
    }
    
    @Override
    public long f() {
        synchronized (this) {
            return this.k;
        }
    }
    
    @Override
    public void g(@org.jetbrains.annotations.e final p p) {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)p, "payload");
            ++this.r;
            this.s = false;
        }
    }
    
    @Override
    public void h(final int m, @org.jetbrains.annotations.e final String n) {
        kotlin.jvm.internal.k0.p((Object)n, "reason");
        final int n2 = 1;
        if (m != -1) {
            synchronized (this) {
                int n3;
                if (this.m == -1) {
                    n3 = n2;
                }
                else {
                    n3 = 0;
                }
                if (n3 != 0) {
                    this.m = m;
                    this.n = n;
                    final boolean l = this.l;
                    Closeable h = null;
                    Closeable d;
                    i e;
                    if (l && this.j.isEmpty()) {
                        h = this.h;
                        this.h = null;
                        d = this.d;
                        this.d = null;
                        e = this.e;
                        this.e = null;
                        this.f.u();
                    }
                    else {
                        d = (e = null);
                    }
                    final j2 a = j2.a;
                    // monitorexit(this)
                    try {
                        this.u.onClosing(this, m, n);
                        if (h != null) {
                            this.u.onClosed(this, m, n);
                        }
                        return;
                    }
                    finally {
                        if (h != null) {
                            okhttp3.internal.d.l(h);
                        }
                        if (d != null) {
                            okhttp3.internal.d.l(d);
                        }
                        if (e != null) {
                            okhttp3.internal.d.l(e);
                        }
                    }
                }
                throw new IllegalStateException("already closed".toString());
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e0 k() {
        return this.t;
    }
    
    public final void p(final long timeout, @org.jetbrains.annotations.e final TimeUnit unit) throws InterruptedException {
        kotlin.jvm.internal.k0.p((Object)unit, "timeUnit");
        this.f.l().await(timeout, unit);
    }
    
    public final void q(@org.jetbrains.annotations.e final g0 g0, @org.jetbrains.annotations.f final okhttp3.internal.connection.c c) throws IOException {
        kotlin.jvm.internal.k0.p((Object)g0, "response");
        if (g0.x() != 101) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected HTTP 101 response but was '");
            sb.append(g0.x());
            sb.append(' ');
            sb.append(g0.M());
            sb.append('\'');
            throw new ProtocolException(sb.toString());
        }
        final String g2 = g0.G(g0, "Connection", null, 2, null);
        if (!kotlin.text.s.K1("Upgrade", g2, true)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected 'Connection' header value 'Upgrade' but was '");
            sb2.append(g2);
            sb2.append('\'');
            throw new ProtocolException(sb2.toString());
        }
        final String g3 = g0.G(g0, "Upgrade", null, 2, null);
        if (!kotlin.text.s.K1("websocket", g3, true)) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Expected 'Upgrade' header value 'websocket' but was '");
            sb3.append(g3);
            sb3.append('\'');
            throw new ProtocolException(sb3.toString());
        }
        final String g4 = g0.G(g0, "Sec-WebSocket-Accept", null, 2, null);
        final p.a l = okio.p.L;
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(this.a);
        sb4.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        final String g5 = l.l(sb4.toString()).C0().g();
        if (kotlin.jvm.internal.k0.g((Object)g5, (Object)g4) ^ true) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Expected 'Sec-WebSocket-Accept' header value '");
            sb5.append(g5);
            sb5.append("' but was '");
            sb5.append(g4);
            sb5.append('\'');
            throw new ProtocolException(sb5.toString());
        }
        if (c != null) {
            return;
        }
        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
    }
    
    public final boolean r(final int n, @org.jetbrains.annotations.f String string, final long n2) {
        synchronized (this) {
            okhttp3.internal.ws.g.w.d(n);
            p l = null;
            if (string != null) {
                l = okio.p.L.l(string);
                if (l.size() > 123L) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("reason.size() > 123: ");
                    sb.append(string);
                    string = sb.toString();
                    throw new IllegalArgumentException(string.toString());
                }
            }
            if (!this.o && !this.l) {
                this.l = true;
                this.j.add(new a(n, l, n2));
                this.C();
                return true;
            }
            return false;
        }
    }
    
    public final void s(@org.jetbrains.annotations.e final c0 c0) {
        kotlin.jvm.internal.k0.p((Object)c0, "client");
        if (this.t.i("Sec-WebSocket-Extensions") != null) {
            this.t(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        final c0 f = c0.g0().r(okhttp3.s.a).f0(okhttp3.internal.ws.e.z).f();
        final e0 b = this.t.n().n("Upgrade", "websocket").n("Connection", "Upgrade").n("Sec-WebSocket-Key", this.a).n("Sec-WebSocket-Version", "13").n("Sec-WebSocket-Extensions", "permessage-deflate").b();
        final okhttp3.internal.connection.e b2 = new okhttp3.internal.connection.e(f, b, true);
        kotlin.jvm.internal.k0.m((Object)(this.b = b2));
        b2.q1(new okhttp3.f(b) {
            final /* synthetic */ e a;
            final /* synthetic */ e0 b;
            
            @Override
            public void a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g0 g0) {
                kotlin.jvm.internal.k0.p((Object)e, "call");
                kotlin.jvm.internal.k0.p((Object)g0, "response");
                Object o = g0.y();
                try {
                    this.a.q(g0, (okhttp3.internal.connection.c)o);
                    kotlin.jvm.internal.k0.m(o);
                    final d m = ((okhttp3.internal.connection.c)o).m();
                    o = f.h.a(g0.J());
                    e.n(this.a, (okhttp3.internal.ws.f)o);
                    if (!e.this.w((okhttp3.internal.ws.f)o)) {
                        synchronized (this.a) {
                            e.j(this.a).clear();
                            this.a.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        o = new StringBuilder();
                        ((StringBuilder)o).append(okhttp3.internal.d.i);
                        ((StringBuilder)o).append(" WebSocket ");
                        ((StringBuilder)o).append(this.b.q().V());
                        o = ((StringBuilder)o).toString();
                        this.a.v((String)o, m);
                        this.a.u().onOpen(this.a, g0);
                        this.a.x();
                    }
                    catch (Exception ex) {
                        this.a.t(ex, null);
                    }
                }
                catch (IOException ex2) {
                    if (o != null) {
                        ((okhttp3.internal.connection.c)o).v();
                    }
                    this.a.t(ex2, g0);
                    okhttp3.internal.d.l(g0);
                }
            }
            
            @Override
            public void b(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final IOException ex) {
                kotlin.jvm.internal.k0.p((Object)e, "call");
                kotlin.jvm.internal.k0.p((Object)ex, "e");
                this.a.t(ex, null);
            }
        });
    }
    
    public final void t(@org.jetbrains.annotations.e final Exception ex, @org.jetbrains.annotations.f final g0 g0) {
        kotlin.jvm.internal.k0.p((Object)ex, "e");
        synchronized (this) {
            if (this.o) {
                return;
            }
            this.o = true;
            final d h = this.h;
            this.h = null;
            final h d = this.d;
            this.d = null;
            final i e = this.e;
            this.e = null;
            this.f.u();
            final j2 a = j2.a;
            // monitorexit(this)
            try {
                this.u.onFailure(this, ex, g0);
            }
            finally {
                if (h != null) {
                    okhttp3.internal.d.l(h);
                }
                if (d != null) {
                    okhttp3.internal.d.l(d);
                }
                if (e != null) {
                    okhttp3.internal.d.l(e);
                }
            }
        }
    }
    
    @org.jetbrains.annotations.e
    public final l0 u() {
        return this.u;
    }
    
    public final void v(@org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final d h) throws IOException {
        kotlin.jvm.internal.k0.p((Object)s, "name");
        kotlin.jvm.internal.k0.p((Object)h, "streams");
        final f x = this.x;
        kotlin.jvm.internal.k0.m((Object)x);
        synchronized (this) {
            this.g = s;
            this.h = h;
            this.e = new i(h.a(), h.b(), this.v, x.a, x.i(h.a()), this.y);
            this.c = new e();
            final long w = this.w;
            if (w != 0L) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(w);
                final okhttp3.internal.concurrent.c f = this.f;
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(" ping");
                final String string = sb.toString();
                f.n(new okhttp3.internal.concurrent.a() {
                    final /* synthetic */ e g;
                    
                    @Override
                    public long f() {
                        this.g.H();
                        return nanos;
                    }
                }, nanos);
            }
            if (this.j.isEmpty() ^ true) {
                this.C();
            }
            final j2 a = j2.a;
            // monitorexit(this)
            this.d = new h(h.a(), h.c(), (h.a)this, x.a, x.i(h.a() ^ true));
        }
    }
    
    public final void x() throws IOException {
        while (this.m == -1) {
            final h d = this.d;
            kotlin.jvm.internal.k0.m((Object)d);
            d.b();
        }
    }
    
    public final boolean y(@org.jetbrains.annotations.e final p e) {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)e, "payload");
            boolean b;
            if (!this.o && (!this.l || !this.j.isEmpty())) {
                this.i.add(e);
                this.C();
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    public final boolean z() throws IOException {
        boolean b = false;
        try {
            final h d = this.d;
            kotlin.jvm.internal.k0.m((Object)d);
            d.b();
            if (this.m == -1) {
                b = true;
            }
        }
        catch (Exception ex) {
            this.t(ex, null);
        }
        return b;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0019\u0010\u0010\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013" }, d2 = { "okhttp3/internal/ws/e$a", "", "", "c", "J", "a", "()J", "cancelAfterCloseMillis", "Lokio/p;", "b", "Lokio/p;", "()Lokio/p;", "reason", "", "I", "()I", "code", "<init>", "(ILokio/p;J)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private final int a;
        @org.jetbrains.annotations.f
        private final p b;
        private final long c;
        
        public a(final int a, @org.jetbrains.annotations.f final p b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final long a() {
            return this.c;
        }
        
        public final int b() {
            return this.a;
        }
        
        @org.jetbrains.annotations.f
        public final p c() {
            return this.b;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "okhttp3/internal/ws/e$b", "", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "Lokhttp3/d0;", "ONLY_HTTP1", "Ljava/util/List;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e" }, d2 = { "okhttp3/internal/ws/e$c", "", "", "a", "I", "b", "()I", "formatOpcode", "Lokio/p;", "Lokio/p;", "()Lokio/p;", "data", "<init>", "(ILokio/p;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class c
    {
        private final int a;
        @org.jetbrains.annotations.e
        private final p b;
        
        public c(final int a, @org.jetbrains.annotations.e final p b) {
            kotlin.jvm.internal.k0.p((Object)b, "data");
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        public final p a() {
            return this.b;
        }
        
        public final int b() {
            return this.a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "okhttp3/internal/ws/e$d", "Ljava/io/Closeable;", "Lokio/n;", "I", "Lokio/n;", "b", "()Lokio/n;", "sink", "", "G", "Z", "a", "()Z", "client", "Lokio/o;", "H", "Lokio/o;", "c", "()Lokio/o;", "source", "<init>", "(ZLokio/o;Lokio/n;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public abstract static class d implements Closeable
    {
        private final boolean G;
        @org.jetbrains.annotations.e
        private final o H;
        @org.jetbrains.annotations.e
        private final n I;
        
        public d(final boolean g, @org.jetbrains.annotations.e final o h, @org.jetbrains.annotations.e final n i) {
            kotlin.jvm.internal.k0.p((Object)h, "source");
            kotlin.jvm.internal.k0.p((Object)i, "sink");
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public final boolean a() {
            return this.G;
        }
        
        @org.jetbrains.annotations.e
        public final n b() {
            return this.I;
        }
        
        @org.jetbrains.annotations.e
        public final o c() {
            return this.H;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006" }, d2 = { "okhttp3/internal/ws/e$e", "Lokhttp3/internal/concurrent/a;", "", "f", "<init>", "(Lokhttp3/internal/ws/e;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class e extends a
    {
        public e() {
            final StringBuilder sb = new StringBuilder();
            sb.append(okhttp3.internal.ws.e.l(okhttp3.internal.ws.e.this));
            sb.append(" writer");
            super(sb.toString(), false, 2, null);
        }
        
        @Override
        public long f() {
            try {
                if (okhttp3.internal.ws.e.this.G()) {
                    return 0L;
                }
            }
            catch (IOException ex) {
                okhttp3.internal.ws.e.this.t(ex, null);
            }
            return -1L;
        }
    }
}
