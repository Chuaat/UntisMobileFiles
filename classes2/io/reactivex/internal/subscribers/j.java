// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.k;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import io.reactivex.internal.util.e;
import java.util.NoSuchElementException;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import java.util.concurrent.Future;
import io.reactivex.q;
import java.util.concurrent.CountDownLatch;

public final class j<T> extends CountDownLatch implements q<T>, Future<T>, d
{
    T G;
    Throwable H;
    final AtomicReference<d> I;
    
    public j() {
        super(1);
        this.I = new AtomicReference<d>();
    }
    
    public void b(final Throwable h) {
        d expectedValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue == this || expectedValue == io.reactivex.internal.subscriptions.j.G) {
                a.Y(h);
                return;
            }
            this.H = h;
        } while (!this.I.compareAndSet(expectedValue, (d)this));
        this.countDown();
    }
    
    public void cancel() {
    }
    
    @Override
    public boolean cancel(final boolean b) {
        d expectedValue;
        io.reactivex.internal.subscriptions.j g;
        do {
            expectedValue = this.I.get();
            if (expectedValue != this) {
                g = io.reactivex.internal.subscriptions.j.G;
                if (expectedValue != g) {
                    continue;
                }
            }
            return false;
        } while (!this.I.compareAndSet(expectedValue, (d)g));
        if (expectedValue != null) {
            expectedValue.cancel();
        }
        this.countDown();
        return true;
    }
    
    public void f() {
        if (this.G == null) {
            this.b(new NoSuchElementException("The source is empty"));
            return;
        }
        d expectedValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue != this) {
                if (expectedValue != io.reactivex.internal.subscriptions.j.G) {
                    continue;
                }
            }
            return;
        } while (!this.I.compareAndSet(expectedValue, (d)this));
        this.countDown();
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
    public boolean isCancelled() {
        return this.I.get() == io.reactivex.internal.subscriptions.j.G;
    }
    
    @Override
    public boolean isDone() {
        return this.getCount() == 0L;
    }
    
    public void m(final T g) {
        if (this.G != null) {
            this.I.get().cancel();
            this.b(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.G = g;
    }
    
    public void v(final long n) {
    }
    
    @Override
    public void z(final d d) {
        io.reactivex.internal.subscriptions.j.l(this.I, d, Long.MAX_VALUE);
    }
}
