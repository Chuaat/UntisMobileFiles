// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import rx.subscriptions.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import rx.o;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import rx.subscriptions.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx.internal.util.n;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import rx.j;

public final class a extends j implements k
{
    private static final long I;
    private static final TimeUnit J;
    static final c K;
    static final a L;
    final ThreadFactory G;
    final AtomicReference<a> H;
    
    static {
        J = TimeUnit.SECONDS;
        (K = new c(n.I)).i();
        (L = new a(null, 0L, null)).e();
        I = Integer.getInteger("rx.io-scheduler.keepalive", 60);
    }
    
    public a(final ThreadFactory g) {
        this.G = g;
        this.H = new AtomicReference<a>(a.L);
        this.start();
    }
    
    @Override
    public j.a a() {
        return new b((a)this.H.get());
    }
    
    @Override
    public void shutdown() {
        a expectedValue;
        a l;
        do {
            expectedValue = this.H.get();
            l = a.L;
            if (expectedValue == l) {
                return;
            }
        } while (!this.H.compareAndSet(expectedValue, l));
        expectedValue.e();
    }
    
    @Override
    public void start() {
        final a newValue = new a(this.G, a.I, a.J);
        if (!this.H.compareAndSet(a.L, newValue)) {
            newValue.e();
        }
    }
    
    static final class a
    {
        private final ThreadFactory a;
        private final long b;
        private final ConcurrentLinkedQueue<c> c;
        private final rx.subscriptions.b d;
        private final ScheduledExecutorService e;
        private final Future<?> f;
        
        a(final ThreadFactory a, long nanos, final TimeUnit timeUnit) {
            this.a = a;
            if (timeUnit != null) {
                nanos = timeUnit.toNanos(nanos);
            }
            else {
                nanos = 0L;
            }
            this.b = nanos;
            this.c = new ConcurrentLinkedQueue<c>();
            this.d = new rx.subscriptions.b();
            final ScheduledExecutorService scheduledExecutorService = null;
            ScheduledExecutorService scheduledThreadPool;
            ScheduledFuture<?> scheduleWithFixedDelay;
            if (timeUnit != null) {
                scheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactory() {
                    @Override
                    public Thread newThread(final Runnable runnable) {
                        final Thread thread = a.newThread(runnable);
                        final StringBuilder sb = new StringBuilder();
                        sb.append(thread.getName());
                        sb.append(" (Evictor)");
                        thread.setName(sb.toString());
                        return thread;
                    }
                });
                h.x(scheduledThreadPool);
                scheduleWithFixedDelay = scheduledThreadPool.scheduleWithFixedDelay(new Runnable() {
                    @Override
                    public void run() {
                        rx.internal.schedulers.a.a.this.a();
                    }
                }, nanos, nanos, TimeUnit.NANOSECONDS);
            }
            else {
                scheduleWithFixedDelay = null;
                scheduledThreadPool = scheduledExecutorService;
            }
            this.e = scheduledThreadPool;
            this.f = scheduleWithFixedDelay;
        }
        
        void a() {
            if (!this.c.isEmpty()) {
                final long c = this.c();
                for (final c o : this.c) {
                    if (o.A() > c) {
                        break;
                    }
                    if (!this.c.remove(o)) {
                        continue;
                    }
                    this.d.e(o);
                }
            }
        }
        
        c b() {
            if (this.d.g()) {
                return rx.internal.schedulers.a.K;
            }
            while (!this.c.isEmpty()) {
                final c c = this.c.poll();
                if (c != null) {
                    return c;
                }
            }
            final c c2 = new c(this.a);
            this.d.a(c2);
            return c2;
        }
        
        long c() {
            return System.nanoTime();
        }
        
        void d(final c e) {
            e.C(this.c() + this.b);
            this.c.offer(e);
        }
        
        void e() {
            try {
                final Future<?> f = this.f;
                if (f != null) {
                    f.cancel(true);
                }
                final ScheduledExecutorService e = this.e;
                if (e != null) {
                    e.shutdownNow();
                }
            }
            finally {
                this.d.i();
            }
        }
    }
    
    static final class b extends j.a implements a
    {
        private final rx.subscriptions.b G;
        private final a H;
        private final c I;
        final AtomicBoolean J;
        
        b(final a h) {
            this.G = new rx.subscriptions.b();
            this.H = h;
            this.J = new AtomicBoolean();
            this.I = h.b();
        }
        
        @Override
        public o c(final a a) {
            return this.d(a, 0L, null);
        }
        
        @Override
        public void call() {
            this.H.d(this.I);
        }
        
        @Override
        public o d(final a a, final long n, final TimeUnit timeUnit) {
            if (this.G.g()) {
                return f.e();
            }
            final rx.internal.schedulers.j t = this.I.t(new a() {
                @Override
                public void call() {
                    if (b.this.g()) {
                        return;
                    }
                    a.call();
                }
            }, n, timeUnit);
            this.G.a(t);
            t.d(this.G);
            return t;
        }
        
        @Override
        public boolean g() {
            return this.G.g();
        }
        
        @Override
        public void i() {
            if (this.J.compareAndSet(false, true)) {
                this.I.c(this);
            }
            this.G.i();
        }
    }
    
    static final class c extends h
    {
        private long R;
        
        c(final ThreadFactory threadFactory) {
            super(threadFactory);
            this.R = 0L;
        }
        
        public long A() {
            return this.R;
        }
        
        public void C(final long r) {
            this.R = r;
        }
    }
}
