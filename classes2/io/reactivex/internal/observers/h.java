// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.e;
import java.util.concurrent.TimeUnit;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.f;
import io.reactivex.n0;
import java.util.concurrent.CountDownLatch;

public final class h<T> extends CountDownLatch implements n0<T>, f, v<T>
{
    T G;
    Throwable H;
    c I;
    volatile boolean J;
    
    public h() {
        super(1);
    }
    
    public boolean a(final long timeout, final TimeUnit unit) {
        if (this.getCount() != 0L) {
            try {
                e.b();
                if (!this.await(timeout, unit)) {
                    this.i();
                    return false;
                }
            }
            catch (InterruptedException ex) {
                this.i();
                throw k.f(ex);
            }
        }
        final Throwable h = this.H;
        if (h == null) {
            return true;
        }
        throw k.f(h);
    }
    
    @Override
    public void b(final Throwable h) {
        this.H = h;
        this.countDown();
    }
    
    public T c() {
        if (this.getCount() != 0L) {
            try {
                e.b();
                this.await();
            }
            catch (InterruptedException ex) {
                this.i();
                throw k.f(ex);
            }
        }
        final Throwable h = this.H;
        if (h == null) {
            return this.G;
        }
        throw k.f(h);
    }
    
    @Override
    public void d(final T g) {
        this.G = g;
        this.countDown();
    }
    
    public T e(T t) {
        if (this.getCount() != 0L) {
            try {
                e.b();
                this.await();
            }
            catch (InterruptedException ex) {
                this.i();
                throw k.f(ex);
            }
        }
        final Throwable h = this.H;
        if (h == null) {
            final T g = this.G;
            if (g != null) {
                t = g;
            }
            return t;
        }
        throw k.f(h);
    }
    
    @Override
    public void f() {
        this.countDown();
    }
    
    public Throwable g() {
        if (this.getCount() != 0L) {
            try {
                e.b();
                this.await();
            }
            catch (InterruptedException ex) {
                this.i();
                return ex;
            }
        }
        return this.H;
    }
    
    public Throwable h(final long timeout, final TimeUnit unit) {
        if (this.getCount() != 0L) {
            try {
                e.b();
                if (!this.await(timeout, unit)) {
                    this.i();
                    throw k.f(new TimeoutException(k.e(timeout, unit)));
                }
            }
            catch (InterruptedException ex) {
                this.i();
                throw k.f(ex);
            }
        }
        return this.H;
    }
    
    void i() {
        this.J = true;
        final c i = this.I;
        if (i != null) {
            i.dispose();
        }
    }
    
    @Override
    public void l(final c i) {
        this.I = i;
        if (this.J) {
            i.dispose();
        }
    }
}
