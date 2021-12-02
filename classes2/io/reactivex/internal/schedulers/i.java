// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import io.reactivex.plugins.a;
import io.reactivex.annotations.g;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.f;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;
import io.reactivex.disposables.c;
import io.reactivex.j0;

public class i extends j0.c implements c
{
    private final ScheduledExecutorService G;
    volatile boolean H;
    
    public i(final ThreadFactory threadFactory) {
        this.G = p.a(threadFactory);
    }
    
    @f
    @Override
    public c b(@f final Runnable runnable) {
        return this.c(runnable, 0L, null);
    }
    
    @f
    @Override
    public c c(@f final Runnable runnable, final long n, @f final TimeUnit timeUnit) {
        if (this.H) {
            return e.G;
        }
        return this.e(runnable, n, timeUnit, null);
    }
    
    @Override
    public void dispose() {
        if (!this.H) {
            this.H = true;
            this.G.shutdownNow();
        }
    }
    
    @f
    public n e(final Runnable runnable, final long n, @f final TimeUnit timeUnit, @g final io.reactivex.internal.disposables.c c) {
        final n n2 = new n(io.reactivex.plugins.a.b0(runnable), c);
        if (c != null && !c.b(n2)) {
            return n2;
        }
        while (true) {
            if (n <= 0L) {
                try {
                    Object o = this.G.submit((Callable<Object>)n2);
                    while (true) {
                        n2.a((Future<?>)o);
                        return n2;
                        o = this.G.schedule((Callable<T>)n2, n, timeUnit);
                        continue;
                    }
                }
                catch (RejectedExecutionException ex) {
                    if (c != null) {
                        c.a(n2);
                    }
                    io.reactivex.plugins.a.Y(ex);
                }
                return n2;
            }
            continue;
        }
    }
    
    public c f(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final m m = new m(io.reactivex.plugins.a.b0(runnable));
        Label_0034: {
            if (n > 0L) {
                break Label_0034;
            }
            try {
                Object o = this.G.submit((Callable<V>)m);
                while (true) {
                    m.b((Future<?>)o);
                    return m;
                    o = this.G.schedule((Callable<T>)m, n, timeUnit);
                    continue;
                }
            }
            catch (RejectedExecutionException ex) {
                io.reactivex.plugins.a.Y(ex);
                return e.G;
            }
        }
    }
    
    public c g(Runnable b0, final long n, final long n2, final TimeUnit timeUnit) {
        b0 = io.reactivex.plugins.a.b0(b0);
        if (n2 <= 0L) {
            final io.reactivex.internal.schedulers.f f = new io.reactivex.internal.schedulers.f(b0, this.G);
            Label_0047: {
                if (n > 0L) {
                    break Label_0047;
                }
                try {
                    Object o = this.G.submit((Callable<V>)f);
                    while (true) {
                        f.b((Future<?>)o);
                        return f;
                        o = this.G.schedule((Callable<T>)f, n, timeUnit);
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
        l.b(this.G.scheduleAtFixedRate(l, n, n2, timeUnit));
        return l;
    }
    
    public void h() {
        if (!this.H) {
            this.H = true;
            this.G.shutdown();
        }
    }
    
    @Override
    public boolean i() {
        return this.H;
    }
}
