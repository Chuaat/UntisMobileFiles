// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import androidx.annotation.k0;
import java.util.concurrent.atomic.AtomicLong;

public final class w4 extends u5
{
    private static final AtomicLong l;
    @k0
    private v4 c;
    @k0
    private v4 d;
    private final PriorityBlockingQueue<u4<?>> e;
    private final BlockingQueue<u4<?>> f;
    private final Thread.UncaughtExceptionHandler g;
    private final Thread.UncaughtExceptionHandler h;
    private final Object i;
    private final Semaphore j;
    private volatile boolean k;
    
    static {
        l = new AtomicLong(Long.MIN_VALUE);
    }
    
    w4(final z4 z4) {
        super(z4);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue<u4<?>>();
        this.f = new LinkedBlockingQueue<u4<?>>();
        this.g = new t4(this, "Thread death: Uncaught exception on worker thread");
        this.h = new t4(this, "Thread death: Uncaught exception on network thread");
    }
    
    private final void A(final u4<?> e) {
        synchronized (this.i) {
            this.e.add(e);
            final v4 c = this.c;
            if (c == null) {
                (this.c = new v4("Measurement Worker", this.e)).setUncaughtExceptionHandler(this.g);
                this.c.start();
            }
            else {
                c.a();
            }
        }
    }
    
    @Override
    public final void d() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    @Override
    public final void e() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    @Override
    protected final boolean g() {
        return false;
    }
    
    @k0
    final <T> T o(AtomicReference<T> concat, final long n, String concat2, final Runnable runnable) {
        synchronized (concat) {
            super.a.b().w(runnable);
            try {
                concat.wait(n);
                // monitorexit(concat)
                final T value = ((AtomicReference<T>)concat).get();
                if (value == null) {
                    final l3 t = super.a.c().t();
                    if (concat2.length() != 0) {
                        concat = "Timed out waiting for ".concat(concat2);
                    }
                    else {
                        concat = new String("Timed out waiting for ");
                    }
                    t.a(concat);
                }
                return value;
            }
            catch (InterruptedException ex) {
                final l3 t2 = super.a.c().t();
                if (concat2.length() != 0) {
                    concat2 = "Interrupted waiting for ".concat(concat2);
                }
                else {
                    concat2 = new String("Interrupted waiting for ");
                }
                t2.a(concat2);
                return null;
            }
        }
    }
    
    public final <V> Future<V> p(final Callable<V> callable) throws IllegalStateException {
        this.h();
        x.k(callable);
        final u4<Object> u4 = new u4<Object>((Callable<Object>)callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                super.a.c().t().a("Callable skipped the worker queue.");
            }
            u4.run();
        }
        else {
            this.A(u4);
        }
        return (Future<V>)u4;
    }
    
    public final <V> Future<V> q(final Callable<V> callable) throws IllegalStateException {
        this.h();
        x.k(callable);
        final u4<Object> u4 = new u4<Object>((Callable<Object>)callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            u4.run();
        }
        else {
            this.A(u4);
        }
        return (Future<V>)u4;
    }
    
    public final void v(final Runnable runnable) throws IllegalStateException {
        this.h();
        x.k(runnable);
        final u4<Object> u4 = new u4<Object>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(u4);
            final v4 d = this.d;
            if (d == null) {
                (this.d = new v4("Measurement Network", this.f)).setUncaughtExceptionHandler(this.h);
                this.d.start();
            }
            else {
                d.a();
            }
        }
    }
    
    public final void w(final Runnable runnable) throws IllegalStateException {
        this.h();
        x.k(runnable);
        this.A(new u4<Object>(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void x(final Runnable runnable) throws IllegalStateException {
        this.h();
        x.k(runnable);
        this.A(new u4<Object>(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean z() {
        return Thread.currentThread() == this.c;
    }
}
