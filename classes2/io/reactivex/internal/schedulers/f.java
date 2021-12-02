// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import io.reactivex.internal.functions.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.FutureTask;
import io.reactivex.disposables.c;
import java.util.concurrent.Callable;

final class f implements Callable<Void>, c
{
    static final FutureTask<Void> L;
    final Runnable G;
    final AtomicReference<Future<?>> H;
    final AtomicReference<Future<?>> I;
    final ExecutorService J;
    Thread K;
    
    static {
        L = new FutureTask<Void>(a.b, null);
    }
    
    f(final Runnable g, final ExecutorService j) {
        this.G = g;
        this.I = new AtomicReference<Future<?>>();
        this.H = new AtomicReference<Future<?>>();
        this.J = j;
    }
    
    public Void a() throws Exception {
        this.K = Thread.currentThread();
        try {
            this.G.run();
            this.c(this.J.submit((Callable<Object>)this));
            this.K = null;
        }
        finally {
            this.K = null;
            final Throwable t;
            io.reactivex.plugins.a.Y(t);
        }
        return null;
    }
    
    void b(final Future<?> newValue) {
        Future<?> expectedValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue == f.L) {
                newValue.cancel(this.K != Thread.currentThread());
            }
        } while (!this.I.compareAndSet(expectedValue, newValue));
    }
    
    void c(final Future<?> newValue) {
        Future<?> expectedValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue == f.L) {
                newValue.cancel(this.K != Thread.currentThread());
            }
        } while (!this.H.compareAndSet(expectedValue, newValue));
    }
    
    @Override
    public void dispose() {
        final AtomicReference<Future<?>> i = this.I;
        final FutureTask<Void> l = f.L;
        final FutureTask<Void> futureTask = i.getAndSet(l);
        final boolean b = true;
        if (futureTask != null && futureTask != l) {
            futureTask.cancel(this.K != Thread.currentThread());
        }
        final FutureTask<Void> futureTask2 = this.H.getAndSet(l);
        if (futureTask2 != null && futureTask2 != l) {
            futureTask2.cancel(this.K != Thread.currentThread() && b);
        }
    }
    
    @Override
    public boolean i() {
        return this.I.get() == f.L;
    }
}
