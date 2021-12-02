// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.f;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;
import io.reactivex.j0;

public final class r extends j0
{
    private static final String J = "rx2.single-priority";
    private static final String K = "RxSingleScheduler";
    static final k L;
    static final ScheduledExecutorService M;
    final ThreadFactory H;
    final AtomicReference<ScheduledExecutorService> I;
    
    static {
        (M = Executors.newScheduledThreadPool(0)).shutdown();
        L = new k("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5))), true);
    }
    
    public r() {
        this(r.L);
    }
    
    public r(final ThreadFactory h) {
        final AtomicReference<ScheduledExecutorService> i = new AtomicReference<ScheduledExecutorService>();
        this.I = i;
        this.H = h;
        i.lazySet(l(h));
    }
    
    static ScheduledExecutorService l(final ThreadFactory threadFactory) {
        return p.a(threadFactory);
    }
    
    @f
    @Override
    public c c() {
        return new a(this.I.get());
    }
    
    @f
    @Override
    public io.reactivex.disposables.c f(@f final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final m m = new m(io.reactivex.plugins.a.b0(runnable));
        Label_0040: {
            if (n > 0L) {
                break Label_0040;
            }
            try {
                Object o = this.I.get().submit((Callable<V>)m);
                while (true) {
                    m.b((Future<?>)o);
                    return m;
                    o = this.I.get().schedule((Callable<T>)m, n, timeUnit);
                    continue;
                }
            }
            catch (RejectedExecutionException ex) {
                io.reactivex.plugins.a.Y(ex);
                return e.G;
            }
        }
    }
    
    @f
    @Override
    public io.reactivex.disposables.c g(@f final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final Runnable b0 = io.reactivex.plugins.a.b0(runnable);
        if (n2 <= 0L) {
            final ScheduledExecutorService scheduledExecutorService = this.I.get();
            final io.reactivex.internal.schedulers.f f = new io.reactivex.internal.schedulers.f(b0, scheduledExecutorService);
            Label_0054: {
                if (n > 0L) {
                    break Label_0054;
                }
                try {
                    Object o = scheduledExecutorService.submit((Callable<V>)f);
                    while (true) {
                        f.b((Future<?>)o);
                        return f;
                        o = scheduledExecutorService.schedule((Callable<T>)f, n, timeUnit);
                        continue;
                    }
                }
                catch (RejectedExecutionException ex) {
                    io.reactivex.plugins.a.Y(ex);
                    return e.G;
                }
            }
        }
        final l l = new l(b0);
        l.b(this.I.get().scheduleAtFixedRate(l, n, n2, timeUnit));
        return l;
    }
    
    @Override
    public void h() {
        final ScheduledExecutorService scheduledExecutorService = this.I.get();
        final ScheduledExecutorService m = r.M;
        if (scheduledExecutorService != m) {
            final ScheduledExecutorService scheduledExecutorService2 = this.I.getAndSet(m);
            if (scheduledExecutorService2 != m) {
                scheduledExecutorService2.shutdownNow();
            }
        }
    }
    
    @Override
    public void j() {
        ScheduledExecutorService scheduledExecutorService = null;
        ScheduledExecutorService expectedValue;
        ScheduledExecutorService l;
        do {
            expectedValue = this.I.get();
            if (expectedValue != r.M) {
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                return;
            }
            if ((l = scheduledExecutorService) == null) {
                l = l(this.H);
            }
            scheduledExecutorService = l;
        } while (!this.I.compareAndSet(expectedValue, l));
    }
    
    static final class a extends c
    {
        final ScheduledExecutorService G;
        final io.reactivex.disposables.b H;
        volatile boolean I;
        
        a(final ScheduledExecutorService g) {
            this.G = g;
            this.H = new io.reactivex.disposables.b();
        }
        
        @f
        @Override
        public io.reactivex.disposables.c c(@f final Runnable runnable, final long n, @f final TimeUnit timeUnit) {
            if (this.I) {
                return e.G;
            }
            final n n2 = new n(io.reactivex.plugins.a.b0(runnable), this.H);
            this.H.b(n2);
            Label_0059: {
                if (n > 0L) {
                    break Label_0059;
                }
                try {
                    Object o = this.G.submit((Callable<V>)n2);
                    while (true) {
                        n2.a((Future<?>)o);
                        return n2;
                        o = this.G.schedule((Callable<T>)n2, n, timeUnit);
                        continue;
                    }
                }
                catch (RejectedExecutionException ex) {
                    this.dispose();
                    io.reactivex.plugins.a.Y(ex);
                    return e.G;
                }
            }
        }
        
        @Override
        public void dispose() {
            if (!this.I) {
                this.I = true;
                this.H.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return this.I;
        }
    }
}
