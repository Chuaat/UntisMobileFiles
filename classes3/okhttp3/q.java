// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.Collection;
import java.util.Collections;
import kotlin.collections.v;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.util.ArrayList;
import okhttp3.internal.d;
import kotlin.j2;
import java.util.Deque;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import okhttp3.internal.connection.e;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010-\u001a\u00020\u001e¢\u0006\u0004\b;\u0010=J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 R \u0010#\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R.\u0010+\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0013\u0010-\u001a\u00020\u001e8G@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0018\u0010/\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R \u00100\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"R*\u00101\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"¨\u0006>" }, d2 = { "Lokhttp3/q;", "", "", "host", "Lokhttp3/internal/connection/e$a;", "Lokhttp3/internal/connection/e;", "f", "", "m", "T", "Ljava/util/Deque;", "calls", "call", "Lkotlin/j2;", "g", "(Ljava/util/Deque;Ljava/lang/Object;)V", "c", "(Lokhttp3/internal/connection/e$a;)V", "b", "d", "(Lokhttp3/internal/connection/e;)V", "h", "i", "", "Lokhttp3/e;", "n", "p", "", "o", "q", "Ljava/util/concurrent/ExecutorService;", "a", "()Ljava/util/concurrent/ExecutorService;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "runningAsyncCalls", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "j", "()Ljava/lang/Runnable;", "r", "(Ljava/lang/Runnable;)V", "idleCallback", "e", "executorService", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "readyAsyncCalls", "maxRequests", "I", "k", "()I", "s", "(I)V", "maxRequestsPerHost", "l", "t", "runningSyncCalls", "<init>", "()V", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class q
{
    private int a;
    private int b;
    @f
    private Runnable c;
    private ExecutorService d;
    private final ArrayDeque<e.a> e;
    private final ArrayDeque<e.a> f;
    private final ArrayDeque<e> g;
    
    public q() {
        this.a = 64;
        this.b = 5;
        this.e = new ArrayDeque<e.a>();
        this.f = new ArrayDeque<e.a>();
        this.g = new ArrayDeque<e>();
    }
    
    public q(@org.jetbrains.annotations.e final ExecutorService d) {
        k0.p((Object)d, "executorService");
        this();
        this.d = d;
    }
    
    private final e.a f(final String s) {
        for (final e.a a : this.f) {
            if (k0.g((Object)a.d(), (Object)s)) {
                return a;
            }
        }
        for (final e.a a2 : this.e) {
            if (k0.g((Object)a2.d(), (Object)s)) {
                return a2;
            }
        }
        return null;
    }
    
    private final <T> void g(final Deque<T> deque, final T t) {
        synchronized (this) {
            if (deque.remove(t)) {
                final Runnable c = this.c;
                final j2 a = j2.a;
                // monitorexit(this)
                if (!this.m() && c != null) {
                    c.run();
                }
                return;
            }
            throw new AssertionError((Object)"Call wasn't in-flight!");
        }
    }
    
    private final boolean m() {
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
        final ArrayList<e.a> list = new ArrayList<e.a>();
        synchronized (this) {
            final Iterator<e.a> iterator = this.e.iterator();
            k0.o((Object)iterator, "readyAsyncCalls.iterator()");
            while (iterator.hasNext()) {
                final e.a e = iterator.next();
                if (this.f.size() >= this.a) {
                    break;
                }
                if (e.c().get() >= this.b) {
                    continue;
                }
                iterator.remove();
                e.c().incrementAndGet();
                k0.o((Object)e, "asyncCall");
                list.add(e);
                this.f.add(e);
            }
            final int q = this.q();
            int i = 0;
            final boolean b = q > 0;
            final j2 a = j2.a;
            // monitorexit(this)
            while (i < list.size()) {
                ((e.a)list.get(i)).a(this.e());
                ++i;
            }
            return b;
        }
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "executorService", imports = {}))
    @g(name = "-deprecated_executorService")
    @org.jetbrains.annotations.e
    public final ExecutorService a() {
        return this.e();
    }
    
    public final void b() {
        synchronized (this) {
            final Iterator<e.a> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().b().cancel();
            }
            final Iterator<e.a> iterator2 = this.f.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().b().cancel();
            }
            final Iterator<e> iterator3 = this.g.iterator();
            while (iterator3.hasNext()) {
                iterator3.next().cancel();
            }
        }
    }
    
    public final void c(@org.jetbrains.annotations.e final e.a e) {
        k0.p((Object)e, "call");
        synchronized (this) {
            this.e.add(e);
            if (!e.b().s()) {
                final e.a f = this.f(e.d());
                if (f != null) {
                    e.f(f);
                }
            }
            final j2 a = j2.a;
            // monitorexit(this)
            this.m();
        }
    }
    
    public final void d(@org.jetbrains.annotations.e final e e) {
        synchronized (this) {
            k0.p((Object)e, "call");
            this.g.add(e);
        }
    }
    
    @g(name = "executorService")
    @org.jetbrains.annotations.e
    public final ExecutorService e() {
        synchronized (this) {
            if (this.d == null) {
                final TimeUnit seconds = TimeUnit.SECONDS;
                final SynchronousQueue<Runnable> workQueue = new SynchronousQueue<Runnable>();
                final StringBuilder sb = new StringBuilder();
                sb.append(okhttp3.internal.d.i);
                sb.append(" Dispatcher");
                this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, seconds, workQueue, okhttp3.internal.d.U(sb.toString(), false));
            }
            final ExecutorService d = this.d;
            k0.m((Object)d);
            return d;
        }
    }
    
    public final void h(@org.jetbrains.annotations.e final e.a a) {
        k0.p((Object)a, "call");
        a.c().decrementAndGet();
        this.g(this.f, a);
    }
    
    public final void i(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.g(this.g, e);
    }
    
    @f
    public final Runnable j() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final int k() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final int l() {
        synchronized (this) {
            return this.b;
        }
    }
    
    @org.jetbrains.annotations.e
    public final List<okhttp3.e> n() {
        synchronized (this) {
            final ArrayDeque<e.a> e = this.e;
            final ArrayList list = new ArrayList<okhttp3.e>(v.Y((Iterable)e, 10));
            final Iterator<Object> iterator = e.iterator();
            while (iterator.hasNext()) {
                list.add(((e.a)iterator.next()).b());
            }
            final List<okhttp3.e> unmodifiableList = Collections.unmodifiableList((List<? extends okhttp3.e>)list);
            k0.o((Object)unmodifiableList, "Collections.unmodifiable\u2026yncCalls.map { it.call })");
            return unmodifiableList;
        }
    }
    
    public final int o() {
        synchronized (this) {
            return this.e.size();
        }
    }
    
    @org.jetbrains.annotations.e
    public final List<okhttp3.e> p() {
        synchronized (this) {
            final ArrayDeque<e> g = this.g;
            final ArrayDeque<e.a> f = this.f;
            final ArrayList list = new ArrayList<e>(v.Y((Iterable)f, 10));
            final Iterator<Object> iterator = f.iterator();
            while (iterator.hasNext()) {
                list.add(((e.a)iterator.next()).b());
            }
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)v.q4((Collection)g, (Iterable)list));
            k0.o((Object)unmodifiableList, "Collections.unmodifiable\u2026yncCalls.map { it.call })");
            return (List<okhttp3.e>)unmodifiableList;
        }
    }
    
    public final int q() {
        synchronized (this) {
            return this.f.size() + this.g.size();
        }
    }
    
    public final void r(@f final Runnable c) {
        synchronized (this) {
            this.c = c;
        }
    }
    
    public final void s(final int n) {
        boolean b = true;
        if (n < 1) {
            b = false;
        }
        if (b) {
            synchronized (this) {
                this.a = n;
                final j2 a = j2.a;
                // monitorexit(this)
                this.m();
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("max < 1: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final void t(final int n) {
        boolean b = true;
        if (n < 1) {
            b = false;
        }
        if (b) {
            synchronized (this) {
                this.b = n;
                final j2 a = j2.a;
                // monitorexit(this)
                this.m();
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("max < 1: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
