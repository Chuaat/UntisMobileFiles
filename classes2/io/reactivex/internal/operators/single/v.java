// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.n0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class v<T> extends k0<Boolean>
{
    final q0<? extends T> G;
    final q0<? extends T> H;
    
    public v(final q0<? extends T> g, final q0<? extends T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super Boolean> n0) {
        final AtomicInteger atomicInteger = new AtomicInteger();
        final Object[] array = { null, null };
        final b b = new b();
        n0.l(b);
        this.G.c(new a<Object>(0, b, array, n0, atomicInteger));
        this.H.c(new a<Object>(1, b, array, n0, atomicInteger));
    }
    
    static class a<T> implements n0<T>
    {
        final int G;
        final b H;
        final Object[] I;
        final n0<? super Boolean> J;
        final AtomicInteger K;
        
        a(final int g, final b h, final Object[] i, final n0<? super Boolean> j, final AtomicInteger k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        @Override
        public void b(final Throwable t) {
            int value;
            do {
                value = this.K.get();
                if (value >= 2) {
                    io.reactivex.plugins.a.Y(t);
                    return;
                }
            } while (!this.K.compareAndSet(value, 2));
            this.H.dispose();
            this.J.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.I[this.G] = t;
            if (this.K.incrementAndGet() == 2) {
                final n0<? super Boolean> j = this.J;
                final Object[] i = this.I;
                j.d(io.reactivex.internal.functions.b.c(i[0], i[1]));
            }
        }
        
        @Override
        public void l(final c c) {
            this.H.b(c);
        }
    }
}
