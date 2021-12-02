// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import io.reactivex.plugins.a;
import java.util.concurrent.Future;
import io.reactivex.disposables.c;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class n extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, c
{
    private static final long H = -6120223772001106981L;
    static final Object I;
    static final Object J;
    static final Object K;
    static final Object L;
    static final int M = 0;
    static final int N = 1;
    static final int O = 2;
    final Runnable G;
    
    static {
        I = new Object();
        J = new Object();
        K = new Object();
        L = new Object();
    }
    
    public n(final Runnable g, final io.reactivex.internal.disposables.c newValue) {
        super(3);
        this.G = g;
        ((AtomicReferenceArray<io.reactivex.internal.disposables.c>)this).lazySet(0, newValue);
    }
    
    public void a(final Future<?> newValue) {
        Object value;
        do {
            value = this.get(1);
            if (value == n.L) {
                return;
            }
            if (value == n.J) {
                newValue.cancel(false);
                return;
            }
            if (value == n.K) {
                newValue.cancel(true);
            }
        } while (!this.compareAndSet(1, value, newValue));
    }
    
    @Override
    public Object call() {
        this.run();
        return null;
    }
    
    @Override
    public void dispose() {
        while (true) {
            Future value;
            Object j;
            boolean b;
            do {
                value = ((AtomicReferenceArray<Future>)this).get(1);
                if (value != n.L) {
                    j = n.J;
                    if (value != j) {
                        final Object k = n.K;
                        if (value != k) {
                            b = (this.get(2) != Thread.currentThread());
                            if (b) {
                                j = k;
                                continue;
                            }
                            continue;
                        }
                    }
                }
                io.reactivex.internal.disposables.c value2;
                Object i;
                do {
                    value2 = ((AtomicReferenceArray<io.reactivex.internal.disposables.c>)this).get(0);
                    if (value2 != n.L) {
                        i = n.I;
                        if (value2 != i) {
                            if (value2 != null) {
                                continue;
                            }
                        }
                    }
                    return;
                } while (!((AtomicReferenceArray<io.reactivex.internal.disposables.c>)this).compareAndSet(0, value2, i));
                value2.c(this);
                return;
            } while (!((AtomicReferenceArray<Future>)this).compareAndSet(1, value, j));
            if (value != null) {
                value.cancel(b);
            }
            continue;
        }
    }
    
    @Override
    public boolean i() {
        boolean b = false;
        final Object value = this.get(0);
        if (value == n.I || value == n.L) {
            b = true;
        }
        return b;
    }
    
    @Override
    public void run() {
        ((AtomicReferenceArray<Thread>)this).lazySet(2, Thread.currentThread());
        Label_0025: {
            try {
                this.G.run();
                break Label_0025;
            }
            finally {
                try {
                    final Throwable t;
                    a.Y(t);
                    this.lazySet(2, null);
                    final io.reactivex.internal.disposables.c value = ((AtomicReferenceArray<io.reactivex.internal.disposables.c>)this).get(0);
                    if (value != n.I && this.compareAndSet(0, value, n.L) && value != null) {
                        value.c(this);
                    }
                    Object value2;
                    do {
                        value2 = this.get(1);
                    } while (value2 != n.J && value2 != n.K && !this.compareAndSet(1, value2, n.L));
                }
                finally {
                    this.lazySet(2, null);
                    final io.reactivex.internal.disposables.c value3 = ((AtomicReferenceArray<io.reactivex.internal.disposables.c>)this).get(0);
                    if (value3 != n.I && this.compareAndSet(0, value3, n.L) && value3 != null) {
                        value3.c(this);
                    }
                    Object value4;
                    do {
                        value4 = this.get(1);
                    } while (value4 != n.J && value4 != n.K && !this.compareAndSet(1, value4, n.L));
                }
            }
        }
    }
}
