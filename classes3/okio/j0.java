// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.h0;
import n6.l;
import kotlin.jvm.internal.k0;
import java.util.concurrent.TimeUnit;
import kotlin.j2;
import java.io.IOException;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b1\u00102J&\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0082\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0004R\u001c\u0010\u0014\u001a\u00020\u00108\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0017\u001a\u00020\f8G@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u00020\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b%\u0010\u001dR\u0019\u0010\b\u001a\u00020\u00028G@\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u000bR$\u0010,\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010'\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001d¨\u00063" }, d2 = { "Lokio/j0;", "", "Lokio/p0;", "Lkotlin/Function1;", "Lkotlin/j2;", "Lkotlin/s;", "block", "f", "sink", "e", "a", "()Lokio/p0;", "Lokio/r0;", "b", "()Lokio/r0;", "d", "Lokio/m;", "Lokio/m;", "g", "()Lokio/m;", "buffer", "Lokio/r0;", "r", "source", "", "Z", "l", "()Z", "p", "(Z)V", "sourceClosed", "", "h", "J", "j", "()J", "maxBufferSize", "m", "canceled", "Lokio/p0;", "q", "i", "n", "(Lokio/p0;)V", "foldedSink", "c", "k", "o", "sinkClosed", "<init>", "(J)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class j0
{
    @e
    private final m a;
    private boolean b;
    private boolean c;
    private boolean d;
    @f
    private p0 e;
    @e
    private final p0 f;
    @e
    private final r0 g;
    private final long h;
    
    public j0(final long n) {
        this.h = n;
        this.a = new m();
        if (n >= 1L) {
            this.f = new p0() {
                private final t0 G = new t0();
                final /* synthetic */ j0 H;
                
                @Override
                public void close() {
                    Object o = this.H.g();
                    synchronized (o) {
                        if (this.H.k()) {
                            return;
                        }
                        p0 i = this.H.i();
                        if (i == null) {
                            if (this.H.l() && this.H.g().h0() > 0L) {
                                throw new IOException("source is closed");
                            }
                            this.H.o(true);
                            final m g = this.H.g();
                            if (g == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            g.notifyAll();
                            i = null;
                        }
                        final j2 a = j2.a;
                        // monitorexit(o)
                        if (i != null) {
                            final j0 h = this.H;
                            o = i.timeout();
                            final t0 timeout = h.q().timeout();
                            final long j = ((t0)o).j();
                            final long a2 = t0.e.a(timeout.j(), ((t0)o).j());
                            final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
                            ((t0)o).i(a2, nanoseconds);
                            if (((t0)o).f()) {
                                final long d = ((t0)o).d();
                                if (timeout.f()) {
                                    ((t0)o).e(Math.min(((t0)o).d(), timeout.d()));
                                }
                                try {
                                    i.close();
                                    ((t0)o).i(j, nanoseconds);
                                    if (timeout.f()) {
                                        ((t0)o).e(d);
                                    }
                                    return;
                                }
                                finally {
                                    ((t0)o).i(j, TimeUnit.NANOSECONDS);
                                    if (timeout.f()) {
                                        ((t0)o).e(d);
                                    }
                                }
                            }
                            if (timeout.f()) {
                                ((t0)o).e(timeout.d());
                            }
                            try {
                                i.close();
                                ((t0)o).i(j, nanoseconds);
                                if (timeout.f()) {
                                    ((t0)o).a();
                                }
                            }
                            finally {
                                ((t0)o).i(j, TimeUnit.NANOSECONDS);
                                if (timeout.f()) {
                                    ((t0)o).a();
                                }
                            }
                        }
                    }
                }
                
                @Override
                public void flush() {
                    Object o = this.H.g();
                    synchronized (o) {
                        if (!(this.H.k() ^ true)) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (!this.H.h()) {
                            p0 i = this.H.i();
                            if (i == null) {
                                if (this.H.l() && this.H.g().h0() > 0L) {
                                    throw new IOException("source is closed");
                                }
                                i = null;
                            }
                            final j2 a = j2.a;
                            // monitorexit(o)
                            if (i != null) {
                                final j0 h = this.H;
                                o = i.timeout();
                                final t0 timeout = h.q().timeout();
                                final long j = ((t0)o).j();
                                final long a2 = t0.e.a(timeout.j(), ((t0)o).j());
                                final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
                                ((t0)o).i(a2, nanoseconds);
                                if (((t0)o).f()) {
                                    final long d = ((t0)o).d();
                                    if (timeout.f()) {
                                        ((t0)o).e(Math.min(((t0)o).d(), timeout.d()));
                                    }
                                    try {
                                        i.flush();
                                        ((t0)o).i(j, nanoseconds);
                                        if (timeout.f()) {
                                            ((t0)o).e(d);
                                        }
                                        return;
                                    }
                                    finally {
                                        ((t0)o).i(j, TimeUnit.NANOSECONDS);
                                        if (timeout.f()) {
                                            ((t0)o).e(d);
                                        }
                                    }
                                }
                                if (timeout.f()) {
                                    ((t0)o).e(timeout.d());
                                }
                                try {
                                    i.flush();
                                    ((t0)o).i(j, nanoseconds);
                                    if (timeout.f()) {
                                        ((t0)o).a();
                                    }
                                }
                                finally {
                                    ((t0)o).i(j, TimeUnit.NANOSECONDS);
                                    if (timeout.f()) {
                                        ((t0)o).a();
                                    }
                                }
                            }
                            return;
                        }
                        throw new IOException("canceled");
                    }
                }
                
                @Override
                public void t3(@e final m m, long b) {
                    k0.p((Object)m, "source");
                    Object o = this.H.g();
                    synchronized (o) {
                        if (!(this.H.k() ^ true)) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (!this.H.h()) {
                            while (true) {
                                while (b > 0L) {
                                    final p0 i = this.H.i();
                                    if (i != null) {
                                        final j2 a = j2.a;
                                        // monitorexit(o)
                                        if (i != null) {
                                            final j0 h = this.H;
                                            o = i.timeout();
                                            final t0 timeout = h.q().timeout();
                                            final long j = ((t0)o).j();
                                            final long a2 = t0.e.a(timeout.j(), ((t0)o).j());
                                            final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
                                            ((t0)o).i(a2, nanoseconds);
                                            if (((t0)o).f()) {
                                                final long d = ((t0)o).d();
                                                if (timeout.f()) {
                                                    ((t0)o).e(Math.min(((t0)o).d(), timeout.d()));
                                                }
                                                try {
                                                    i.t3(m, b);
                                                    ((t0)o).i(j, nanoseconds);
                                                    if (timeout.f()) {
                                                        ((t0)o).e(d);
                                                    }
                                                    return;
                                                }
                                                finally {
                                                    ((t0)o).i(j, TimeUnit.NANOSECONDS);
                                                    if (timeout.f()) {
                                                        ((t0)o).e(d);
                                                    }
                                                }
                                            }
                                            if (timeout.f()) {
                                                ((t0)o).e(timeout.d());
                                            }
                                            try {
                                                i.t3(m, b);
                                                ((t0)o).i(j, nanoseconds);
                                                if (timeout.f()) {
                                                    ((t0)o).a();
                                                }
                                            }
                                            finally {
                                                ((t0)o).i(j, TimeUnit.NANOSECONDS);
                                                if (timeout.f()) {
                                                    ((t0)o).a();
                                                }
                                            }
                                        }
                                        return;
                                    }
                                    if (this.H.l()) {
                                        throw new IOException("source is closed");
                                    }
                                    final long a3 = this.H.j() - this.H.g().h0();
                                    if (a3 == 0L) {
                                        this.G.k(this.H.g());
                                        if (!this.H.h()) {
                                            continue;
                                        }
                                        throw new IOException("canceled");
                                    }
                                    else {
                                        final long min = Math.min(a3, b);
                                        this.H.g().t3(m, min);
                                        b -= min;
                                        final m g = this.H.g();
                                        if (g == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                        g.notifyAll();
                                    }
                                }
                                final p0 i = null;
                                continue;
                            }
                        }
                        throw new IOException("canceled");
                    }
                }
                
                @e
                @Override
                public t0 timeout() {
                    return this.G;
                }
            };
            this.g = new r0() {
                private final t0 G = new t0();
                final /* synthetic */ j0 H;
                
                @Override
                public void close() {
                    synchronized (this.H.g()) {
                        this.H.p(true);
                        final m g = this.H.g();
                        if (g != null) {
                            g.notifyAll();
                            final j2 a = j2.a;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                
                @Override
                public long read(@e m g, long read) {
                    k0.p((Object)g, "sink");
                    synchronized (this.H.g()) {
                        if (!(this.H.l() ^ true)) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (this.H.h()) {
                            throw new IOException("canceled");
                        }
                        while (this.H.g().h0() == 0L) {
                            if (this.H.k()) {
                                return -1L;
                            }
                            this.G.k(this.H.g());
                            if (!this.H.h()) {
                                continue;
                            }
                            throw new IOException("canceled");
                        }
                        read = this.H.g().read(g, read);
                        g = this.H.g();
                        if (g != null) {
                            g.notifyAll();
                            return read;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                
                @e
                @Override
                public t0 timeout() {
                    return this.G;
                }
            };
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("maxBufferSize < 1: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final void f(final p0 p2, final l<? super p0, j2> l) {
        final t0 timeout = p2.timeout();
        final t0 timeout2 = this.q().timeout();
        final long j = timeout.j();
        final long a = t0.e.a(timeout2.j(), timeout.j());
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        timeout.i(a, nanoseconds);
        Label_0220: {
            if (timeout.f()) {
                final long d = timeout.d();
                if (timeout2.f()) {
                    timeout.e(Math.min(timeout.d(), timeout2.d()));
                }
                try {
                    l.invoke((Object)p2);
                    h0.d(1);
                    timeout.i(j, nanoseconds);
                    if (timeout2.f()) {
                        timeout.e(d);
                        break Label_0220;
                    }
                    break Label_0220;
                }
                finally {
                    h0.d(1);
                    timeout.i(j, TimeUnit.NANOSECONDS);
                    if (timeout2.f()) {
                        timeout.e(d);
                    }
                    h0.c(1);
                }
            }
            if (timeout2.f()) {
                timeout.e(timeout2.d());
            }
            try {
                l.invoke((Object)p2);
                h0.d(1);
                timeout.i(j, nanoseconds);
                if (timeout2.f()) {
                    timeout.a();
                }
                h0.c(1);
            }
            finally {
                h0.d(1);
                timeout.i(j, TimeUnit.NANOSECONDS);
                if (timeout2.f()) {
                    timeout.a();
                }
                h0.c(1);
            }
        }
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "sink", imports = {}))
    @g(name = "-deprecated_sink")
    @e
    public final p0 a() {
        return this.f;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "source", imports = {}))
    @g(name = "-deprecated_source")
    @e
    public final r0 b() {
        return this.g;
    }
    
    public final void d() {
        synchronized (this.a) {
            this.b = true;
            this.a.c();
            final m a = this.a;
            if (a != null) {
                a.notifyAll();
                final j2 a2 = j2.a;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
        }
    }
    
    public final void e(@e final p0 p0) throws IOException {
        k0.p((Object)p0, "sink");
        while (true) {
            final m a = this.a;
            synchronized (a) {
                if (this.e != null) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.b) {
                    this.e = p0;
                    throw new IOException("canceled");
                }
                if (this.a.D1()) {
                    this.d = true;
                    this.e = p0;
                    return;
                }
                final boolean c = this.c;
                final m m = new m();
                final m a2 = this.a;
                m.t3(a2, a2.h0());
                final m a3 = this.a;
                if (a3 != null) {
                    a3.notifyAll();
                    final j2 a4 = j2.a;
                    // monitorexit(a)
                    try {
                        p0.t3(m, m.h0());
                        if (c) {
                            p0.close();
                            continue;
                        }
                        p0.flush();
                        continue;
                    }
                    finally {
                        synchronized (this.a) {
                            this.d = true;
                            final m a5 = this.a;
                            if (a5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            a5.notifyAll();
                            final j2 a6 = j2.a;
                        }
                        // monitorexit(this.a)
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
    }
    
    @e
    public final m g() {
        return this.a;
    }
    
    public final boolean h() {
        return this.b;
    }
    
    @f
    public final p0 i() {
        return this.e;
    }
    
    public final long j() {
        return this.h;
    }
    
    public final boolean k() {
        return this.c;
    }
    
    public final boolean l() {
        return this.d;
    }
    
    public final void m(final boolean b) {
        this.b = b;
    }
    
    public final void n(@f final p0 e) {
        this.e = e;
    }
    
    public final void o(final boolean c) {
        this.c = c;
    }
    
    public final void p(final boolean d) {
        this.d = d;
    }
    
    @g(name = "sink")
    @e
    public final p0 q() {
        return this.f;
    }
    
    @g(name = "source")
    @e
    public final r0 r() {
        return this.g;
    }
}
