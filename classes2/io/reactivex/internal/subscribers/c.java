// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.util.k;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.e;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.CountDownLatch;

public abstract class c<T> extends CountDownLatch implements q<T>
{
    T G;
    Throwable H;
    d I;
    volatile boolean J;
    
    public c() {
        super(1);
    }
    
    public final T a() {
        if (this.getCount() != 0L) {
            try {
                e.b();
                this.await();
            }
            catch (InterruptedException ex) {
                final d i = this.I;
                this.I = (d)j.G;
                if (i != null) {
                    i.cancel();
                }
                throw k.f(ex);
            }
        }
        final Throwable h = this.H;
        if (h == null) {
            return this.G;
        }
        throw k.f(h);
    }
    
    public final void f() {
        this.countDown();
    }
    
    @Override
    public final void z(final d i) {
        if (j.o(this.I, i)) {
            this.I = i;
            if (!this.J) {
                i.v(Long.MAX_VALUE);
                if (this.J) {
                    this.I = (d)j.G;
                    i.cancel();
                }
            }
        }
    }
}
