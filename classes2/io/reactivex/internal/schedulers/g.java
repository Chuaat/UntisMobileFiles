// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import io.reactivex.disposables.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import io.reactivex.disposables.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import io.reactivex.annotations.f;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;

public final class g extends j0
{
    private static final String J = "RxCachedThreadScheduler";
    static final k K;
    private static final String L = "RxCachedWorkerPoolEvictor";
    static final k M;
    private static final String N = "rx2.io-keep-alive-time";
    public static final long O = 60L;
    private static final long P;
    private static final TimeUnit Q;
    static final c R;
    private static final String S = "rx2.io-priority";
    static final a T;
    final ThreadFactory H;
    final AtomicReference<a> I;
    
    static {
        Q = TimeUnit.SECONDS;
        P = Long.getLong("rx2.io-keep-alive-time", 60L);
        (R = new c(new k("RxCachedThreadSchedulerShutdown"))).dispose();
        final int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5)));
        final k k = K = new k("RxCachedThreadScheduler", max);
        M = new k("RxCachedWorkerPoolEvictor", max);
        (T = new a(0L, null, k)).e();
    }
    
    public g() {
        this(g.K);
    }
    
    public g(final ThreadFactory h) {
        this.H = h;
        this.I = new AtomicReference<a>(g.T);
        this.j();
    }
    
    @f
    @Override
    public j0.c c() {
        return new b((a)this.I.get());
    }
    
    @Override
    public void h() {
        a expectedValue;
        a t;
        do {
            expectedValue = this.I.get();
            t = g.T;
            if (expectedValue == t) {
                return;
            }
        } while (!this.I.compareAndSet(expectedValue, t));
        expectedValue.e();
    }
    
    @Override
    public void j() {
        final a newValue = new a(g.P, g.Q, this.H);
        if (!this.I.compareAndSet(g.T, newValue)) {
            newValue.e();
        }
    }
    
    public int l() {
        return this.I.get().I.g();
    }
    
    static final class a implements Runnable
    {
        private final long G;
        private final ConcurrentLinkedQueue<c> H;
        final io.reactivex.disposables.b I;
        private final ScheduledExecutorService J;
        private final Future<?> K;
        private final ThreadFactory L;
        
        a(long nanos, final TimeUnit timeUnit, final ThreadFactory l) {
            if (timeUnit != null) {
                nanos = timeUnit.toNanos(nanos);
            }
            else {
                nanos = 0L;
            }
            this.G = nanos;
            this.H = new ConcurrentLinkedQueue<c>();
            this.I = new io.reactivex.disposables.b();
            this.L = l;
            ScheduledExecutorService scheduledThreadPool = null;
            ScheduledFuture<?> scheduleWithFixedDelay;
            if (timeUnit != null) {
                scheduledThreadPool = Executors.newScheduledThreadPool(1, g.M);
                scheduleWithFixedDelay = scheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            }
            else {
                scheduleWithFixedDelay = null;
            }
            this.J = scheduledThreadPool;
            this.K = scheduleWithFixedDelay;
        }
        
        void a() {
            if (!this.H.isEmpty()) {
                final long c = this.c();
                for (final c o : this.H) {
                    if (o.j() > c) {
                        break;
                    }
                    if (!this.H.remove(o)) {
                        continue;
                    }
                    this.I.a(o);
                }
            }
        }
        
        c b() {
            if (this.I.i()) {
                return g.R;
            }
            while (!this.H.isEmpty()) {
                final c c = this.H.poll();
                if (c != null) {
                    return c;
                }
            }
            final c c2 = new c(this.L);
            this.I.b(c2);
            return c2;
        }
        
        long c() {
            return System.nanoTime();
        }
        
        void d(final c e) {
            e.k(this.c() + this.G);
            this.H.offer(e);
        }
        
        void e() {
            this.I.dispose();
            final Future<?> k = this.K;
            if (k != null) {
                k.cancel(true);
            }
            final ScheduledExecutorService j = this.J;
            if (j != null) {
                j.shutdownNow();
            }
        }
        
        @Override
        public void run() {
            this.a();
        }
    }
    
    static final class b extends j0.c
    {
        private final io.reactivex.disposables.b G;
        private final g.a H;
        private final g.c I;
        final AtomicBoolean J;
        
        b(final g.a h) {
            this.J = new AtomicBoolean();
            this.H = h;
            this.G = new io.reactivex.disposables.b();
            this.I = h.b();
        }
        
        @f
        @Override
        public c c(@f final Runnable runnable, final long n, @f final TimeUnit timeUnit) {
            if (this.G.i()) {
                return e.G;
            }
            return this.I.e(runnable, n, timeUnit, this.G);
        }
        
        @Override
        public void dispose() {
            if (this.J.compareAndSet(false, true)) {
                this.G.dispose();
                this.H.d(this.I);
            }
        }
        
        @Override
        public boolean i() {
            return this.J.get();
        }
    }
    
    static final class c extends i
    {
        private long I;
        
        c(final ThreadFactory threadFactory) {
            super(threadFactory);
            this.I = 0L;
        }
        
        public long j() {
            return this.I;
        }
        
        public void k(final long i) {
            this.I = i;
        }
    }
}
