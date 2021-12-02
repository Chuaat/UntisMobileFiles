// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.i0;
import io.reactivex.g0;
import x5.g;

public final class m0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final x5.g<? super T> H;
    
    public m0(final g0<T> g0, final x5.g<? super T> h) {
        super(g0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new a((i0<? super Object>)i0, (x5.g<? super Object>)this.H));
    }
    
    static final class a<T> extends io.reactivex.internal.observers.a<T, T>
    {
        final x5.g<? super T> L;
        
        a(final i0<? super T> i0, final x5.g<? super T> l) {
            super(i0);
            this.L = l;
        }
        
        @Override
        public int E(final int n) {
            return this.e(n);
        }
        
        @Override
        public void m(final T t) {
            super.G.m(t);
            if (super.K == 0) {
                try {
                    this.L.accept((Object)t);
                }
                finally {
                    final Throwable t2;
                    this.d(t2);
                }
            }
        }
        
        @io.reactivex.annotations.g
        @Override
        public T poll() throws Exception {
            final T poll = (T)super.I.poll();
            if (poll != null) {
                this.L.accept((Object)poll);
            }
            return (T)poll;
        }
    }
}
