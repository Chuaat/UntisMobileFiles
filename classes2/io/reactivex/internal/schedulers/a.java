// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.FutureTask;
import io.reactivex.disposables.c;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

abstract class a extends AtomicReference<Future<?>> implements c, io.reactivex.schedulers.a
{
    private static final long I = 1811839108042568751L;
    protected static final FutureTask<Void> J;
    protected static final FutureTask<Void> K;
    protected final Runnable G;
    protected Thread H;
    
    static {
        final Runnable b = io.reactivex.internal.functions.a.b;
        J = new FutureTask<Void>(b, null);
        K = new FutureTask<Void>(b, null);
    }
    
    a(final Runnable g) {
        this.G = g;
    }
    
    @Override
    public Runnable a() {
        return this.G;
    }
    
    public final void b(final Future<?> newValue) {
        Future<Void> expectedValue;
        do {
            expectedValue = ((AtomicReference<Future<Void>>)this).get();
            if (expectedValue == a.J) {
                break;
            }
            if (expectedValue == a.K) {
                newValue.cancel(this.H != Thread.currentThread());
                break;
            }
        } while (!((AtomicReference<Future<Void>>)this).compareAndSet(expectedValue, newValue));
    }
    
    @Override
    public final void dispose() {
        final Future<Void> expectedValue = ((AtomicReference<Future<Void>>)this).get();
        if (expectedValue != a.J) {
            final FutureTask<Void> k = a.K;
            if (expectedValue != k && ((AtomicReference<FutureTask<Void>>)this).compareAndSet(expectedValue, k) && expectedValue != null) {
                expectedValue.cancel(this.H != Thread.currentThread());
            }
        }
    }
    
    @Override
    public final boolean i() {
        final Future<Void> future = ((AtomicReference<Future<Void>>)this).get();
        return future == a.J || future == a.K;
    }
}
