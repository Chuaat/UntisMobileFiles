// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import java.net.SocketTimeoutException;
import okio.k;
import java.io.EOFException;
import okio.m;
import okio.o;
import okio.r0;
import okio.p0;
import okio.t0;
import java.util.List;
import java.io.InterruptedIOException;
import kotlin.j2;
import okhttp3.internal.d;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.io.IOException;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import okhttp3.v;
import java.util.ArrayDeque;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 U2\u00020\u0001:\u0004+',\u001cB3\b\u0000\u0012\u0006\u0010F\u001a\u00020 \u0012\u0006\u0010a\u001a\u00020^\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bi\u0010jJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ$\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\u0016\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010'\u001a\u00020\u0010H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)J\u000f\u0010,\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010(J\u000f\u0010-\u001a\u00020\u0010H\u0000¢\u0006\u0004\b-\u0010(R \u00103\u001a\u00060.R\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00106\u001a\u00060.R\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R*\u0010<\u001a\u00020)2\u0006\u00107\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010-\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010=R \u0010\u001f\u001a\u00060?R\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010F\u001a\u00020 8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010ER\u0013\u0010I\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010K\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010HR*\u0010N\u001a\u00020)2\u0006\u00107\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R*\u0010Q\u001a\u00020)2\u0006\u00107\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\bO\u00109\"\u0004\bP\u0010;R \u0010W\u001a\u00060RR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010X\u001a\u0004\b/\u0010Y\"\u0004\bZ\u0010[R*\u0010]\u001a\u00020)2\u0006\u00107\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010-\u001a\u0004\bC\u00109\"\u0004\b\\\u0010;R\u0019\u0010a\u001a\u00020^8\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010_\u001a\u0004\bS\u0010`R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010b\u001a\u0004\b4\u0010c\"\u0004\bd\u0010eR\u001c\u0010h\u001a\b\u0012\u0004\u0012\u00020\b0f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010g¨\u0006k" }, d2 = { "Lokhttp3/internal/http2/i;", "", "Lokhttp3/internal/http2/b;", "errorCode", "Ljava/io/IOException;", "errorException", "", "e", "Lokhttp3/v;", "H", "I", "", "Lokhttp3/internal/http2/c;", "responseHeaders", "outFinished", "flushHeaders", "Lkotlin/j2;", "K", "trailers", "g", "Lokio/t0;", "x", "L", "Lokio/r0;", "q", "Lokio/p0;", "o", "rstStatusCode", "d", "f", "Lokio/o;", "source", "", "length", "y", "headers", "inFinished", "z", "A", "b", "()V", "", "delta", "a", "c", "J", "Lokhttp3/internal/http2/i$d;", "i", "Lokhttp3/internal/http2/i$d;", "n", "()Lokhttp3/internal/http2/i$d;", "readTimeout", "j", "u", "writeTimeout", "<set-?>", "l", "()J", "D", "(J)V", "readBytesAcknowledged", "Z", "hasResponseHeaders", "Lokhttp3/internal/http2/i$c;", "Lokhttp3/internal/http2/i$c;", "r", "()Lokhttp3/internal/http2/i$c;", "m", "k", "()I", "id", "w", "()Z", "isOpen", "v", "isLocallyInitiated", "t", "G", "writeBytesTotal", "s", "F", "writeBytesMaximum", "Lokhttp3/internal/http2/i$b;", "h", "Lokhttp3/internal/http2/i$b;", "p", "()Lokhttp3/internal/http2/i$b;", "sink", "Lokhttp3/internal/http2/b;", "()Lokhttp3/internal/http2/b;", "B", "(Lokhttp3/internal/http2/b;)V", "E", "readBytesTotal", "Lokhttp3/internal/http2/f;", "Lokhttp3/internal/http2/f;", "()Lokhttp3/internal/http2/f;", "connection", "Ljava/io/IOException;", "()Ljava/io/IOException;", "C", "(Ljava/io/IOException;)V", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "<init>", "(ILokhttp3/internal/http2/f;ZZLokhttp3/v;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class i
{
    public static final long o = 16384L;
    public static final a p;
    private long a;
    private long b;
    private long c;
    private long d;
    private final ArrayDeque<v> e;
    private boolean f;
    @e
    private final c g;
    @e
    private final b h;
    @e
    private final d i;
    @e
    private final d j;
    @f
    private okhttp3.internal.http2.b k;
    @f
    private IOException l;
    private final int m;
    @e
    private final okhttp3.internal.http2.f n;
    
    static {
        p = new a(null);
    }
    
    public i(final int m, @e final okhttp3.internal.http2.f n, final boolean b, final boolean b2, @f final v v) {
        k0.p((Object)n, "connection");
        this.m = m;
        this.n = n;
        this.d = n.N().e();
        final ArrayDeque<v> e = new ArrayDeque<v>();
        this.e = e;
        this.g = new c(n.M().e(), b2);
        this.h = new b(b);
        this.i = new d();
        this.j = new d();
        if (v != null) {
            if (!(this.v() ^ true)) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            e.add(v);
        }
        else if (!this.v()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }
    
    private final boolean e(final okhttp3.internal.http2.b k, final IOException l) {
        if (okhttp3.internal.d.h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.b() && this.h.c()) {
                return false;
            }
            this.k = k;
            this.l = l;
            this.notifyAll();
            final j2 a = j2.a;
            // monitorexit(this)
            this.n.s0(this.m);
            return true;
        }
    }
    
    public final void A(@e final okhttp3.internal.http2.b k) {
        synchronized (this) {
            k0.p((Object)k, "errorCode");
            if (this.k == null) {
                this.k = k;
                this.notifyAll();
            }
        }
    }
    
    public final void B(@f final okhttp3.internal.http2.b k) {
        this.k = k;
    }
    
    public final void C(@f final IOException l) {
        this.l = l;
    }
    
    public final void D(final long b) {
        this.b = b;
    }
    
    public final void E(final long a) {
        this.a = a;
    }
    
    public final void F(final long d) {
        this.d = d;
    }
    
    public final void G(final long c) {
        this.c = c;
    }
    
    @e
    public final v H() throws IOException {
        synchronized (this) {
            this.i.x();
            try {
                while (this.e.isEmpty() && this.k == null) {
                    this.J();
                }
                this.i.F();
                if (this.e.isEmpty() ^ true) {
                    final v removeFirst = this.e.removeFirst();
                    k0.o((Object)removeFirst, "headersQueue.removeFirst()");
                    return removeFirst;
                }
                IOException l = this.l;
                if (l == null) {
                    final okhttp3.internal.http2.b k = this.k;
                    k0.m((Object)k);
                    l = new n(k);
                }
                throw l;
            }
            finally {
                this.i.F();
            }
        }
    }
    
    @e
    public final v I() throws IOException {
        synchronized (this) {
            if (this.k != null) {
                IOException l = this.l;
                if (l == null) {
                    final okhttp3.internal.http2.b k = this.k;
                    k0.m((Object)k);
                    l = new n(k);
                }
                throw l;
            }
            if (this.g.b() && this.g.d().D1() && this.g.c().D1()) {
                v v = this.g.e();
                if (v == null) {
                    v = okhttp3.internal.d.b;
                }
                return v;
            }
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
    }
    
    public final void J() throws InterruptedIOException {
        try {
            this.wait();
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
    
    public final void K(@e final List<okhttp3.internal.http2.c> list, final boolean b, final boolean b2) throws IOException {
        k0.p((Object)list, "responseHeaders");
        if (okhttp3.internal.d.h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        // monitorenter(this)
        final int n = 1;
        try {
            this.f = true;
            if (b) {
                this.h.f(true);
            }
            final j2 a = j2.a;
            // monitorexit(this)
            int n2 = b2 ? 1 : 0;
            if (!b2) {
                synchronized (this.n) {
                    int n3;
                    if (this.n.Y() >= this.n.X()) {
                        n3 = n;
                    }
                    else {
                        n3 = 0;
                    }
                    // monitorexit(this.n)
                    n2 = n3;
                }
            }
            this.n.d1(this.m, b, list);
            if (n2 != 0) {
                this.n.flush();
            }
        }
        finally {
        }
        // monitorexit(this)
    }
    
    @e
    public final t0 L() {
        return this.j;
    }
    
    public final void a(final long n) {
        this.d += n;
        if (n > 0L) {
            this.notifyAll();
        }
    }
    
    public final void b() throws IOException {
        if (okhttp3.internal.d.h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        synchronized (this) {
            final boolean b = !this.g.b() && this.g.a() && (this.h.c() || this.h.b());
            final boolean w = this.w();
            final j2 a = j2.a;
            // monitorexit(this)
            if (b) {
                this.d(okhttp3.internal.http2.b.P, null);
            }
            else if (!w) {
                this.n.s0(this.m);
            }
        }
    }
    
    public final void c() throws IOException {
        if (this.h.b()) {
            throw new IOException("stream closed");
        }
        if (this.h.c()) {
            throw new IOException("stream finished");
        }
        if (this.k != null) {
            IOException l = this.l;
            if (l == null) {
                final okhttp3.internal.http2.b k = this.k;
                k0.m((Object)k);
                l = new n(k);
            }
            throw l;
        }
    }
    
    public final void d(@e final okhttp3.internal.http2.b b, @f final IOException ex) throws IOException {
        k0.p((Object)b, "rstStatusCode");
        if (!this.e(b, ex)) {
            return;
        }
        this.n.k1(this.m, b);
    }
    
    public final void f(@e final okhttp3.internal.http2.b b) {
        k0.p((Object)b, "errorCode");
        if (!this.e(b, null)) {
            return;
        }
        this.n.o1(this.m, b);
    }
    
    public final void g(@e final v v) {
        k0.p((Object)v, "trailers");
        synchronized (this) {
            final boolean c = this.h.c();
            boolean b = true;
            if (!(c ^ true)) {
                throw new IllegalStateException("already finished".toString());
            }
            if (v.size() == 0) {
                b = false;
            }
            if (b) {
                this.h.g(v);
                final j2 a = j2.a;
                return;
            }
            throw new IllegalArgumentException("trailers.size() == 0".toString());
        }
    }
    
    @e
    public final okhttp3.internal.http2.f h() {
        return this.n;
    }
    
    @f
    public final okhttp3.internal.http2.b i() {
        synchronized (this) {
            return this.k;
        }
    }
    
    @f
    public final IOException j() {
        return this.l;
    }
    
    public final int k() {
        return this.m;
    }
    
    public final long l() {
        return this.b;
    }
    
    public final long m() {
        return this.a;
    }
    
    @e
    public final d n() {
        return this.i;
    }
    
    @e
    public final p0 o() {
        synchronized (this) {
            if (this.f || this.v()) {
                final j2 a = j2.a;
                // monitorexit(this)
                return this.h;
            }
            throw new IllegalStateException("reply before requesting the sink".toString());
        }
    }
    
    @e
    public final b p() {
        return this.h;
    }
    
    @e
    public final r0 q() {
        return this.g;
    }
    
    @e
    public final c r() {
        return this.g;
    }
    
    public final long s() {
        return this.d;
    }
    
    public final long t() {
        return this.c;
    }
    
    @e
    public final d u() {
        return this.j;
    }
    
    public final boolean v() {
        final int m = this.m;
        final boolean b = true;
        return this.n.G() == ((m & 0x1) == 0x1) && b;
    }
    
    public final boolean w() {
        synchronized (this) {
            return this.k == null && ((!this.g.b() && !this.g.a()) || (!this.h.c() && !this.h.b()) || !this.f);
        }
    }
    
    @e
    public final t0 x() {
        return this.i;
    }
    
    public final void y(@e final o o, final int n) throws IOException {
        k0.p((Object)o, "source");
        if (okhttp3.internal.d.h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        this.g.f(o, n);
    }
    
    public final void z(@e final v v, final boolean b) {
        k0.p((Object)v, "headers");
        if (okhttp3.internal.d.h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        synchronized (this) {
            if (this.f && b) {
                this.g.j(v);
            }
            else {
                this.f = true;
                this.e.add(v);
            }
            if (b) {
                this.g.h(true);
            }
            final boolean w = this.w();
            this.notifyAll();
            final j2 a = j2.a;
            // monitorexit(this)
            if (!w) {
                this.n.s0(this.m);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/internal/http2/i$a", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006'" }, d2 = { "okhttp3/internal/http2/i$b", "Lokio/p0;", "", "outFinishedOnLastFrame", "Lkotlin/j2;", "a", "Lokio/m;", "source", "", "byteCount", "t3", "flush", "Lokio/t0;", "timeout", "close", "Lokhttp3/v;", "H", "Lokhttp3/v;", "d", "()Lokhttp3/v;", "g", "(Lokhttp3/v;)V", "trailers", "G", "Lokio/m;", "sendBuffer", "J", "Z", "c", "()Z", "f", "(Z)V", "finished", "I", "b", "e", "closed", "<init>", "(Lokhttp3/internal/http2/i;Z)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class b implements p0
    {
        private final m G;
        @f
        private v H;
        private boolean I;
        private boolean J;
        
        public b(final boolean j) {
            this.J = j;
            this.G = new m();
        }
        
        private final void a(final boolean b) throws IOException {
            synchronized (okhttp3.internal.http2.i.this) {
                okhttp3.internal.http2.i.this.u().x();
                try {
                    while (okhttp3.internal.http2.i.this.t() >= okhttp3.internal.http2.i.this.s() && !this.J && !this.I && okhttp3.internal.http2.i.this.i() == null) {
                        okhttp3.internal.http2.i.this.J();
                    }
                    okhttp3.internal.http2.i.this.u().F();
                    okhttp3.internal.http2.i.this.c();
                    final long min = Math.min(okhttp3.internal.http2.i.this.s() - okhttp3.internal.http2.i.this.t(), this.G.h0());
                    final i k = okhttp3.internal.http2.i.this;
                    k.G(k.t() + min);
                    final boolean b2 = b && min == this.G.h0() && okhttp3.internal.http2.i.this.i() == null;
                    final j2 a = j2.a;
                    // monitorexit(this.K)
                    okhttp3.internal.http2.i.this.u().x();
                    try {
                        okhttp3.internal.http2.i.this.h().a1(okhttp3.internal.http2.i.this.k(), b2, this.G, min);
                    }
                    finally {
                        okhttp3.internal.http2.i.this.u().F();
                    }
                }
                finally {
                    okhttp3.internal.http2.i.this.u().F();
                }
            }
        }
        
        public final boolean b() {
            return this.I;
        }
        
        public final boolean c() {
            return this.J;
        }
        
        @Override
        public void close() throws IOException {
            final i k = okhttp3.internal.http2.i.this;
            if (okhttp3.internal.d.h && Thread.holdsLock(k)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                final Thread currentThread = Thread.currentThread();
                k0.o((Object)currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(k);
                throw new AssertionError((Object)sb.toString());
            }
            Object o = okhttp3.internal.http2.i.this;
            synchronized (o) {
                if (this.I) {
                    return;
                }
                final boolean b = okhttp3.internal.http2.i.this.i() == null;
                final j2 a = j2.a;
                // monitorexit(o)
                if (!okhttp3.internal.http2.i.this.p().J) {
                    final boolean b2 = this.G.h0() > 0L;
                    if (this.H != null) {
                        while (this.G.h0() > 0L) {
                            this.a(false);
                        }
                        o = okhttp3.internal.http2.i.this.h();
                        final int i = okhttp3.internal.http2.i.this.k();
                        final v h = this.H;
                        k0.m((Object)h);
                        ((okhttp3.internal.http2.f)o).d1(i, b, okhttp3.internal.d.W(h));
                    }
                    else if (b2) {
                        while (this.G.h0() > 0L) {
                            this.a(true);
                        }
                    }
                    else if (b) {
                        okhttp3.internal.http2.i.this.h().a1(okhttp3.internal.http2.i.this.k(), true, null, 0L);
                    }
                }
                synchronized (okhttp3.internal.http2.i.this) {
                    this.I = true;
                    final j2 a2 = j2.a;
                    // monitorexit(this.K)
                    okhttp3.internal.http2.i.this.h().flush();
                    okhttp3.internal.http2.i.this.b();
                }
            }
        }
        
        @f
        public final v d() {
            return this.H;
        }
        
        public final void e(final boolean i) {
            this.I = i;
        }
        
        public final void f(final boolean j) {
            this.J = j;
        }
        
        @Override
        public void flush() throws IOException {
            final i k = okhttp3.internal.http2.i.this;
            if (okhttp3.internal.d.h && Thread.holdsLock(k)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                final Thread currentThread = Thread.currentThread();
                k0.o((Object)currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(k);
                throw new AssertionError((Object)sb.toString());
            }
            synchronized (okhttp3.internal.http2.i.this) {
                okhttp3.internal.http2.i.this.c();
                final j2 a = j2.a;
                // monitorexit(this.K)
                while (this.G.h0() > 0L) {
                    this.a(false);
                    okhttp3.internal.http2.i.this.h().flush();
                }
            }
        }
        
        public final void g(@f final v h) {
            this.H = h;
        }
        
        @Override
        public void t3(@e final m m, final long n) throws IOException {
            k0.p((Object)m, "source");
            final i k = okhttp3.internal.http2.i.this;
            if (okhttp3.internal.d.h && Thread.holdsLock(k)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                final Thread currentThread = Thread.currentThread();
                k0.o((Object)currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(k);
                throw new AssertionError((Object)sb.toString());
            }
            this.G.t3(m, n);
            while (this.G.h0() >= 16384L) {
                this.a(false);
            }
        }
        
        @e
        @Override
        public t0 timeout() {
            return okhttp3.internal.http2.i.this.u();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020 ¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0019\u0010-\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001e¨\u00060" }, d2 = { "okhttp3/internal/http2/i$c", "Lokio/r0;", "", "read", "Lkotlin/j2;", "k", "Lokio/m;", "sink", "byteCount", "Lokio/o;", "source", "f", "(Lokio/o;J)V", "Lokio/t0;", "timeout", "close", "K", "J", "maxByteCount", "Lokhttp3/v;", "I", "Lokhttp3/v;", "e", "()Lokhttp3/v;", "j", "(Lokhttp3/v;)V", "trailers", "H", "Lokio/m;", "c", "()Lokio/m;", "readBuffer", "", "Z", "a", "()Z", "g", "(Z)V", "closed", "L", "b", "h", "finished", "G", "d", "receiveBuffer", "<init>", "(Lokhttp3/internal/http2/i;JZ)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class c implements r0
    {
        @e
        private final m G;
        @e
        private final m H;
        @f
        private v I;
        private boolean J;
        private final long K;
        private boolean L;
        
        public c(final long k, final boolean l) {
            this.K = k;
            this.L = l;
            this.G = new m();
            this.H = new m();
        }
        
        private final void k(final long n) {
            final i m = okhttp3.internal.http2.i.this;
            if (okhttp3.internal.d.h && Thread.holdsLock(m)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                final Thread currentThread = Thread.currentThread();
                k0.o((Object)currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(m);
                throw new AssertionError((Object)sb.toString());
            }
            okhttp3.internal.http2.i.this.h().Z0(n);
        }
        
        public final boolean a() {
            return this.J;
        }
        
        public final boolean b() {
            return this.L;
        }
        
        @e
        public final m c() {
            return this.H;
        }
        
        @Override
        public void close() throws IOException {
            synchronized (okhttp3.internal.http2.i.this) {
                this.J = true;
                final long h0 = this.H.h0();
                this.H.c();
                final i m = okhttp3.internal.http2.i.this;
                if (m != null) {
                    m.notifyAll();
                    final j2 a = j2.a;
                    // monitorexit(this.M)
                    if (h0 > 0L) {
                        this.k(h0);
                    }
                    okhttp3.internal.http2.i.this.b();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
        
        @e
        public final m d() {
            return this.G;
        }
        
        @f
        public final v e() {
            return this.I;
        }
        
        public final void f(@e final o o, long n) throws IOException {
            k0.p((Object)o, "source");
            final i m = okhttp3.internal.http2.i.this;
            long n2 = n;
            if (okhttp3.internal.d.h) {
                if (Thread.holdsLock(m)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Thread ");
                    final Thread currentThread = Thread.currentThread();
                    k0.o((Object)currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append(" MUST NOT hold lock on ");
                    sb.append(m);
                    throw new AssertionError((Object)sb.toString());
                }
                n2 = n;
            }
            while (n2 > 0L) {
                synchronized (okhttp3.internal.http2.i.this) {
                    final boolean l = this.L;
                    n = this.H.h0();
                    final long k = this.K;
                    final int n3 = 1;
                    final boolean b = n + n2 > k;
                    final j2 a = j2.a;
                    // monitorexit(this.M)
                    if (b) {
                        o.skip(n2);
                        okhttp3.internal.http2.i.this.f(okhttp3.internal.http2.b.K);
                        return;
                    }
                    if (l) {
                        o.skip(n2);
                        return;
                    }
                    n = o.read(this.G, n2);
                    if (n != -1L) {
                        final long n4 = n2 - n;
                        final i i = okhttp3.internal.http2.i.this;
                        synchronized (okhttp3.internal.http2.i.this) {
                            if (this.J) {
                                n = this.G.h0();
                                this.G.c();
                            }
                            else {
                                int n5;
                                if (this.H.h0() == 0L) {
                                    n5 = n3;
                                }
                                else {
                                    n5 = 0;
                                }
                                this.H.z3(this.G);
                                if (n5 != 0) {
                                    final i j = okhttp3.internal.http2.i.this;
                                    if (j == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    j.notifyAll();
                                }
                                n = 0L;
                            }
                            // monitorexit(this.M)
                            n2 = n4;
                            if (n > 0L) {
                                this.k(n);
                                n2 = n4;
                                continue;
                            }
                            continue;
                        }
                    }
                    throw new EOFException();
                }
                break;
            }
        }
        
        public final void g(final boolean j) {
            this.J = j;
        }
        
        public final void h(final boolean l) {
            this.L = l;
        }
        
        public final void j(@f final v i) {
            this.I = i;
        }
        
        @Override
        public long read(@e final m m, final long n) throws IOException {
            k0.p((Object)m, "sink");
            if (n >= 0L) {
                while (true) {
                    Object j = null;
                    synchronized (okhttp3.internal.http2.i.this) {
                        okhttp3.internal.http2.i.this.n().x();
                        try {
                            if (okhttp3.internal.http2.i.this.i() != null) {
                                j = okhttp3.internal.http2.i.this.j();
                                if (j == null) {
                                    final okhttp3.internal.http2.b i = okhttp3.internal.http2.i.this.i();
                                    k0.m((Object)i);
                                    j = new n(i);
                                }
                            }
                            if (this.J) {
                                throw new IOException("stream closed");
                            }
                            long n3 = 0L;
                            boolean b = false;
                            Label_0293: {
                                if (this.H.h0() > 0L) {
                                    final m h = this.H;
                                    final long read = h.read(m, Math.min(n, h.h0()));
                                    final i k = okhttp3.internal.http2.i.this;
                                    k.E(k.m() + read);
                                    final long n2 = okhttp3.internal.http2.i.this.m() - okhttp3.internal.http2.i.this.l();
                                    n3 = read;
                                    if (j == null) {
                                        n3 = read;
                                        if (n2 >= okhttp3.internal.http2.i.this.h().M().e() / 2) {
                                            okhttp3.internal.http2.i.this.h().p1(okhttp3.internal.http2.i.this.k(), n2);
                                            final i l = okhttp3.internal.http2.i.this;
                                            l.D(l.m());
                                            n3 = read;
                                        }
                                    }
                                }
                                else {
                                    if (!this.L && j == null) {
                                        okhttp3.internal.http2.i.this.J();
                                        n3 = -1L;
                                        b = true;
                                        break Label_0293;
                                    }
                                    n3 = -1L;
                                }
                                b = false;
                            }
                            okhttp3.internal.http2.i.this.n().F();
                            final j2 a = j2.a;
                            // monitorexit(this.M)
                            if (b) {
                                continue;
                            }
                            if (n3 != -1L) {
                                this.k(n3);
                                return n3;
                            }
                            if (j == null) {
                                return -1L;
                            }
                            k0.m(j);
                            throw j;
                        }
                        finally {
                            okhttp3.internal.http2.i.this.n().F();
                        }
                    }
                    break;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        @Override
        public t0 timeout() {
            return okhttp3.internal.http2.i.this.n();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n" }, d2 = { "okhttp3/internal/http2/i$d", "Lokio/k;", "Lkotlin/j2;", "D", "Ljava/io/IOException;", "cause", "z", "F", "<init>", "(Lokhttp3/internal/http2/i;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class d extends k
    {
        @Override
        protected void D() {
            i.this.f(b.P);
            i.this.h().w0();
        }
        
        public final void F() throws IOException {
            if (!this.y()) {
                return;
            }
            throw this.z(null);
        }
        
        @e
        @Override
        protected IOException z(@f final IOException cause) {
            final SocketTimeoutException ex = new SocketTimeoutException("timeout");
            if (cause != null) {
                ex.initCause(cause);
            }
            return ex;
        }
    }
}
