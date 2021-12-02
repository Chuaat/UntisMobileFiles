// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.concurrent;

import java.util.concurrent.RejectedExecutionException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.v;
import java.util.logging.Level;
import kotlin.j2;
import kotlin.jvm.internal.w;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\b\u0000\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b9\u0010:J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J.\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086\b\u00f8\u0001\u0000J8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0086\b\u00f8\u0001\u0000J\u0006\u0010\u0011\u001a\u00020\u0010J'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u000f\u0010\u0017\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\bH\u0016R\"\u0010\u001e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u00020\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u0019\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020.8F@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010,R$\u00105\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\b \u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001a\u001a\u0004\b%\u0010\u0018\"\u0004\b7\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;" }, d2 = { "Lokhttp3/internal/concurrent/c;", "", "Lokhttp3/internal/concurrent/a;", "task", "", "delayNanos", "Lkotlin/j2;", "n", "", "name", "Lkotlin/Function0;", "block", "m", "", "cancelable", "c", "Ljava/util/concurrent/CountDownLatch;", "l", "recurrence", "q", "(Lokhttp3/internal/concurrent/a;JZ)Z", "a", "u", "b", "()Z", "toString", "Z", "j", "t", "(Z)V", "shutdown", "Lokhttp3/internal/concurrent/d;", "e", "Lokhttp3/internal/concurrent/d;", "k", "()Lokhttp3/internal/concurrent/d;", "taskRunner", "f", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "futureTasks", "", "i", "scheduledTasks", "Lokhttp3/internal/concurrent/a;", "()Lokhttp3/internal/concurrent/a;", "r", "(Lokhttp3/internal/concurrent/a;)V", "activeTask", "d", "s", "cancelActiveTask", "<init>", "(Lokhttp3/internal/concurrent/d;Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    private boolean a;
    @f
    private okhttp3.internal.concurrent.a b;
    @e
    private final List<okhttp3.internal.concurrent.a> c;
    private boolean d;
    @e
    private final d e;
    @e
    private final String f;
    
    public c(@e final d e, @e final String f) {
        k0.p((Object)e, "taskRunner");
        k0.p((Object)f, "name");
        this.e = e;
        this.f = f;
        this.c = new ArrayList<okhttp3.internal.concurrent.a>();
    }
    
    public final void a() {
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
        synchronized (this.e) {
            if (this.b()) {
                this.e.i(this);
            }
            final j2 a = j2.a;
        }
    }
    
    public final boolean b() {
        final okhttp3.internal.concurrent.a b = this.b;
        if (b != null) {
            k0.m((Object)b);
            if (b.a()) {
                this.d = true;
            }
        }
        boolean b2 = false;
        for (int i = this.c.size() - 1; i >= 0; --i) {
            if (this.c.get(i).a()) {
                final okhttp3.internal.concurrent.a a = this.c.get(i);
                if (okhttp3.internal.concurrent.d.j.a().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.a(a, this, "canceled");
                }
                this.c.remove(i);
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void c(@e final String s, final long n, final boolean b, @e final n6.a<j2> a) {
        k0.p((Object)s, "name");
        k0.p((Object)a, "block");
        this.n(new okhttp3.internal.concurrent.a(s) {
            final /* synthetic */ n6.a e;
            
            @Override
            public long f() {
                a.invoke();
                return -1L;
            }
        }, n);
    }
    
    @f
    public final okhttp3.internal.concurrent.a e() {
        return this.b;
    }
    
    public final boolean f() {
        return this.d;
    }
    
    @e
    public final List<okhttp3.internal.concurrent.a> g() {
        return this.c;
    }
    
    @e
    public final String h() {
        return this.f;
    }
    
    @e
    public final List<okhttp3.internal.concurrent.a> i() {
        synchronized (this.e) {
            return (List<okhttp3.internal.concurrent.a>)v.I5((Iterable)this.c);
        }
    }
    
    public final boolean j() {
        return this.a;
    }
    
    @e
    public final d k() {
        return this.e;
    }
    
    @e
    public final CountDownLatch l() {
        synchronized (this.e) {
            if (this.b == null && this.c.isEmpty()) {
                return new CountDownLatch(0);
            }
            final okhttp3.internal.concurrent.a b = this.b;
            if (b instanceof a) {
                return ((a)b).i();
            }
            for (final okhttp3.internal.concurrent.a a : this.c) {
                if (a instanceof a) {
                    return ((a)a).i();
                }
            }
            final a a2 = new a();
            if (this.q(a2, 0L, false)) {
                this.e.i(this);
            }
            return a2.i();
        }
    }
    
    public final void m(@e final String s, final long n, @e final n6.a<Long> a) {
        k0.p((Object)s, "name");
        k0.p((Object)a, "block");
        this.n(new okhttp3.internal.concurrent.a() {
            final /* synthetic */ n6.a e;
            
            @Override
            public long f() {
                return ((Number)a.invoke()).longValue();
            }
        }, n);
    }
    
    public final void n(@e final okhttp3.internal.concurrent.a a, final long n) {
        k0.p((Object)a, "task");
        synchronized (this.e) {
            if (!this.a) {
                if (this.q(a, n, false)) {
                    this.e.i(this);
                }
                final j2 a2 = j2.a;
                return;
            }
            if (a.a()) {
                if (okhttp3.internal.concurrent.d.j.a().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.a(a, this, "schedule canceled (queue is shutdown)");
                }
                return;
            }
            if (okhttp3.internal.concurrent.d.j.a().isLoggable(Level.FINE)) {
                okhttp3.internal.concurrent.b.a(a, this, "schedule failed (queue is shutdown)");
            }
            throw new RejectedExecutionException();
        }
    }
    
    public final boolean q(@e final okhttp3.internal.concurrent.a a, final long n, final boolean b) {
        k0.p((Object)a, "task");
        a.e(this);
        final long b2 = this.e.h().b();
        final long n2 = b2 + n;
        final int index = this.c.indexOf(a);
        final boolean b3 = false;
        if (index != -1) {
            if (a.c() <= n2) {
                if (okhttp3.internal.concurrent.d.j.a().isLoggable(Level.FINE)) {
                    b.a(a, this, "already scheduled");
                }
                return false;
            }
            this.c.remove(index);
        }
        a.g(n2);
        if (okhttp3.internal.concurrent.d.j.a().isLoggable(Level.FINE)) {
            StringBuilder sb;
            String str;
            if (b) {
                sb = new StringBuilder();
                str = "run again after ";
            }
            else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(b.b(n2 - b2));
            b.a(a, this, sb.toString());
        }
        final Iterator<okhttp3.internal.concurrent.a> iterator = this.c.iterator();
        int n3 = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (iterator.next().c() - b2 > n) {
                    int size = n3;
                    if (n3 == -1) {
                        size = this.c.size();
                    }
                    this.c.add(size, a);
                    boolean b4 = b3;
                    if (size == 0) {
                        b4 = true;
                    }
                    return b4;
                }
                ++n3;
            }
            n3 = -1;
            continue;
        }
    }
    
    public final void r(@f final okhttp3.internal.concurrent.a b) {
        this.b = b;
    }
    
    public final void s(final boolean d) {
        this.d = d;
    }
    
    public final void t(final boolean a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        return this.f;
    }
    
    public final void u() {
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
        synchronized (this.e) {
            this.a = true;
            if (this.b()) {
                this.e.i(this);
            }
            final j2 a = j2.a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "okhttp3/internal/concurrent/c$a", "Lokhttp3/internal/concurrent/a;", "", "f", "Ljava/util/concurrent/CountDownLatch;", "e", "Ljava/util/concurrent/CountDownLatch;", "i", "()Ljava/util/concurrent/CountDownLatch;", "latch", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private static final class a extends okhttp3.internal.concurrent.a
    {
        @e
        private final CountDownLatch e;
        
        public a() {
            final StringBuilder sb = new StringBuilder();
            sb.append(okhttp3.internal.d.i);
            sb.append(" awaitIdle");
            super(sb.toString(), false);
            this.e = new CountDownLatch(1);
        }
        
        @Override
        public long f() {
            this.e.countDown();
            return -1L;
        }
        
        @e
        public final CountDownLatch i() {
            return this.e;
        }
    }
}
