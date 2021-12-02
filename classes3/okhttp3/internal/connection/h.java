// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import okhttp3.k;
import kotlin.collections.v;
import java.util.Collection;
import java.net.Socket;
import java.util.Iterator;
import kotlin.j2;
import okhttp3.i0;
import java.util.List;
import java.lang.ref.Reference;
import okhttp3.internal.concurrent.a;
import kotlin.jvm.internal.k0;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.e;
import okhttp3.internal.concurrent.d;
import kotlin.jvm.internal.w;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.internal.concurrent.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0019\u0018\u0000 \b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J.\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$¨\u0006-" }, d2 = { "Lokhttp3/internal/connection/h;", "", "Lokhttp3/internal/connection/f;", "connection", "", "now", "", "g", "f", "d", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/e;", "call", "", "Lokhttp3/i0;", "routes", "", "requireMultiplexed", "a", "Lkotlin/j2;", "h", "c", "e", "b", "okhttp3/internal/connection/h$b", "Lokhttp3/internal/connection/h$b;", "cleanupTask", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "cleanupQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "J", "keepAliveDurationNs", "I", "maxIdleConnections", "Lokhttp3/internal/concurrent/d;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/d;IJLjava/util/concurrent/TimeUnit;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class h
{
    public static final a f;
    private final long a;
    private final c b;
    private final h$b c;
    private final ConcurrentLinkedQueue<f> d;
    private final int e;
    
    static {
        f = new a(null);
    }
    
    public h(@e final d d, int e, final long n, @e final TimeUnit timeUnit) {
        k0.p((Object)d, "taskRunner");
        k0.p((Object)timeUnit, "timeUnit");
        this.e = e;
        this.a = timeUnit.toNanos(n);
        this.b = d.j();
        final StringBuilder sb = new StringBuilder();
        sb.append(okhttp3.internal.d.i);
        sb.append(" ConnectionPool");
        this.c = new okhttp3.internal.concurrent.a(sb.toString()) {
            final /* synthetic */ h e;
            
            @Override
            public long f() {
                return this.e.b(System.nanoTime());
            }
        };
        this.d = new ConcurrentLinkedQueue<f>();
        if (n > 0L) {
            e = 1;
        }
        else {
            e = 0;
        }
        if (e != 0) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("keepAliveDuration <= 0: ");
        sb2.append(n);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    private final int g(final f obj, final long n) {
        if (okhttp3.internal.d.h && !Thread.holdsLock(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(obj);
            throw new AssertionError((Object)sb.toString());
        }
        final List<Reference<okhttp3.internal.connection.e>> u = obj.u();
        int i = 0;
        while (i < u.size()) {
            final Reference<okhttp3.internal.connection.e> reference = u.get(i);
            if (reference.get() != null) {
                ++i;
            }
            else {
                final okhttp3.internal.connection.e.b b = (okhttp3.internal.connection.e.b)reference;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("A connection to ");
                sb2.append(obj.b().d().w());
                sb2.append(" was leaked. ");
                sb2.append("Did you forget to close a response body?");
                okhttp3.internal.platform.h.e.g().o(sb2.toString(), b.a());
                u.remove(i);
                obj.J(true);
                if (u.isEmpty()) {
                    obj.I(n - this.a);
                    return 0;
                }
                continue;
            }
        }
        return u.size();
    }
    
    public final boolean a(@e final okhttp3.a a, @e final okhttp3.internal.connection.e e, @org.jetbrains.annotations.f final List<i0> list, final boolean b) {
        k0.p((Object)a, "address");
        k0.p((Object)e, "call");
    Label_0070_Outer:
        for (final f f : this.d) {
            k0.o((Object)f, "connection");
            while (true) {
                if (b) {
                    try {
                        if (f.C()) {
                            if (f.A(a, list)) {
                                e.c(f);
                                return true;
                            }
                        }
                        final j2 a2 = j2.a;
                        continue Label_0070_Outer;
                    }
                    finally {
                    }
                    // monitorexit(f)
                    break;
                }
                continue;
            }
        }
        return false;
    }
    
    public final long b(final long n) {
        final Iterator<f> iterator = this.d.iterator();
        int n2 = 0;
        long n3 = Long.MIN_VALUE;
        final f o = null;
        int n4 = 0;
        while (iterator.hasNext()) {
            final f f = iterator.next();
            k0.o((Object)f, "connection");
            synchronized (f) {
                if (this.g(f, n) > 0) {
                    ++n4;
                }
                else {
                    ++n2;
                    final long n5 = n - f.w();
                    if (n5 > n3) {
                        final j2 a = j2.a;
                        n3 = n5;
                    }
                    else {
                        final j2 a2 = j2.a;
                    }
                }
                continue;
            }
            break;
        }
        final long a3 = this.a;
        if (n3 < a3 && n2 <= this.e) {
            if (n2 > 0) {
                return a3 - n3;
            }
            if (n4 > 0) {
                return a3;
            }
            return -1L;
        }
        else {
            k0.m((Object)o);
            synchronized (o) {
                if (o.u().isEmpty() ^ true) {
                    return 0L;
                }
                if (o.w() + n3 != n) {
                    return 0L;
                }
                o.J(true);
                this.d.remove(o);
                // monitorexit(o)
                okhttp3.internal.d.n(o.d());
                if (this.d.isEmpty()) {
                    this.b.a();
                }
                return 0L;
            }
        }
    }
    
    public final boolean c(@e final f f) {
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
        final boolean x = f.x();
        final boolean b = true;
        boolean b2;
        if (!x && this.e != 0) {
            okhttp3.internal.concurrent.c.p(this.b, this.c, 0L, 2, null);
            b2 = false;
        }
        else {
            f.J(true);
            this.d.remove(f);
            b2 = b;
            if (this.d.isEmpty()) {
                this.b.a();
                b2 = b;
            }
        }
        return b2;
    }
    
    public final int d() {
        return this.d.size();
    }
    
    public final void e() {
        final Iterator<f> iterator = this.d.iterator();
        k0.o((Object)iterator, "connections.iterator()");
        while (iterator.hasNext()) {
            final f f = iterator.next();
            k0.o((Object)f, "connection");
            synchronized (f) {
                Socket d;
                if (f.u().isEmpty()) {
                    iterator.remove();
                    f.J(true);
                    d = f.d();
                }
                else {
                    d = null;
                }
                // monitorexit(f)
                if (d != null) {
                    okhttp3.internal.d.n(d);
                    continue;
                }
                continue;
            }
            break;
        }
        if (this.d.isEmpty()) {
            this.b.a();
        }
    }
    
    public final int f() {
        final ConcurrentLinkedQueue<f> d = this.d;
        final boolean b = d instanceof Collection;
        int n = 0;
        int n2 = 0;
        if (!b || !d.isEmpty()) {
            final Iterator<Object> iterator = d.iterator();
            while (true) {
                n = n2;
                if (iterator.hasNext()) {
                    final f f = iterator.next();
                    k0.o((Object)f, "it");
                    synchronized (f) {
                        final boolean empty = f.u().isEmpty();
                        // monitorexit(f)
                        if (!empty) {
                            continue;
                        }
                        final int n3 = n2 + 1;
                        if ((n2 = n3) < 0) {
                            v.V();
                            n2 = n3;
                            continue;
                        }
                        continue;
                    }
                    break;
                }
                break;
            }
        }
        return n;
    }
    
    public final void h(@e final f f) {
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
        this.d.add(f);
        okhttp3.internal.concurrent.c.p(this.b, this.c, 0L, 2, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "okhttp3/internal/connection/h$a", "", "Lokhttp3/k;", "connectionPool", "Lokhttp3/internal/connection/h;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final h a(@e final k k) {
            k0.p((Object)k, "connectionPool");
            return k.c();
        }
    }
}
