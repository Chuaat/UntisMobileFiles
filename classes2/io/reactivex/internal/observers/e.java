// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.util.k;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import java.util.concurrent.CountDownLatch;

public abstract class e<T> extends CountDownLatch implements i0<T>, c
{
    T G;
    Throwable H;
    c I;
    volatile boolean J;
    
    public e() {
        super(1);
    }
    
    public final T a() {
        if (this.getCount() != 0L) {
            try {
                io.reactivex.internal.util.e.b();
                this.await();
            }
            catch (InterruptedException ex) {
                this.dispose();
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
    public final void dispose() {
        this.J = true;
        final c i = this.I;
        if (i != null) {
            i.dispose();
        }
    }
    
    @Override
    public final void f() {
        this.countDown();
    }
    
    @Override
    public final boolean i() {
        return this.J;
    }
    
    @Override
    public final void l(final c i) {
        this.I = i;
        if (this.J) {
            i.dispose();
        }
    }
}
