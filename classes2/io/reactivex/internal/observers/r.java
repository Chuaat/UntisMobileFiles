// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.k;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import io.reactivex.internal.util.e;
import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import java.util.concurrent.Future;
import io.reactivex.n0;
import java.util.concurrent.CountDownLatch;

public final class r<T> extends CountDownLatch implements n0<T>, Future<T>, c
{
    T G;
    Throwable H;
    final AtomicReference<c> I;
    
    public r() {
        super(1);
        this.I = new AtomicReference<c>();
    }
    
    @Override
    public void b(final Throwable h) {
        c expectedValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue == d.G) {
                a.Y(h);
                return;
            }
            this.H = h;
        } while (!this.I.compareAndSet(expectedValue, this));
        this.countDown();
    }
    
    @Override
    public boolean cancel(final boolean b) {
        c expectedValue;
        d g;
        do {
            expectedValue = this.I.get();
            if (expectedValue != this) {
                g = d.G;
                if (expectedValue != g) {
                    continue;
                }
            }
            return false;
        } while (!this.I.compareAndSet(expectedValue, g));
        if (expectedValue != null) {
            expectedValue.dispose();
        }
        this.countDown();
        return true;
    }
    
    @Override
    public void d(final T g) {
        final c expectedValue = this.I.get();
        if (expectedValue == d.G) {
            return;
        }
        this.G = g;
        this.I.compareAndSet(expectedValue, this);
        this.countDown();
    }
    
    @Override
    public void dispose() {
    }
    
    @Override
    public T get() throws InterruptedException, ExecutionException {
        if (this.getCount() != 0L) {
            e.b();
            this.await();
        }
        if (this.isCancelled()) {
            throw new CancellationException();
        }
        final Throwable h = this.H;
        if (h == null) {
            return this.G;
        }
        throw new ExecutionException(h);
    }
    
    @Override
    public T get(final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.getCount() != 0L) {
            e.b();
            if (!this.await(timeout, unit)) {
                throw new TimeoutException(k.e(timeout, unit));
            }
        }
        if (this.isCancelled()) {
            throw new CancellationException();
        }
        final Throwable h = this.H;
        if (h == null) {
            return this.G;
        }
        throw new ExecutionException(h);
    }
    
    @Override
    public boolean i() {
        return this.isDone();
    }
    
    @Override
    public boolean isCancelled() {
        return d.d(this.I.get());
    }
    
    @Override
    public boolean isDone() {
        return this.getCount() == 0L;
    }
    
    @Override
    public void l(final c c) {
        d.j(this.I, c);
    }
}
