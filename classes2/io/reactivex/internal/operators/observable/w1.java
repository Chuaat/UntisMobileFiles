// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import io.reactivex.internal.functions.b;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;

public final class w1<T, U> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final o<? super T, ? extends U> H;
    
    public w1(final g0<T> g0, final o<? super T, ? extends U> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super U> i0) {
        super.G.c(new a<Object, Object>(i0, this.H));
    }
    
    static final class a<T, U> extends io.reactivex.internal.observers.a<T, U>
    {
        final x5.o<? super T, ? extends U> L;
        
        a(final i0<? super U> i0, final x5.o<? super T, ? extends U> l) {
            super(i0);
            this.L = l;
        }
        
        @Override
        public int E(final int n) {
            return this.e(n);
        }
        
        @Override
        public void m(final T t) {
            if (super.J) {
                return;
            }
            if (super.K != 0) {
                super.G.m(null);
                return;
            }
            try {
                super.G.m(b.g((Object)this.L.apply((Object)t), "The mapper function returned a null value."));
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
        }
        
        @io.reactivex.annotations.g
        @Override
        public U poll() throws Exception {
            final Object poll = super.I.poll();
            U g;
            if (poll != null) {
                g = b.g((U)this.L.apply((Object)poll), "The mapper function returned a null value.");
            }
            else {
                g = null;
            }
            return g;
        }
    }
}
