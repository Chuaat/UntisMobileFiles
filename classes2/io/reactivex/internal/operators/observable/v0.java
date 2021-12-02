// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.r;

public final class v0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final r<? super T> H;
    
    public v0(final g0<T> g0, final r<? super T> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a((i0<? super Object>)i0, (r<? super Object>)this.H));
    }
    
    static final class a<T> extends io.reactivex.internal.observers.a<T, T>
    {
        final r<? super T> L;
        
        a(final i0<? super T> i0, final r<? super T> l) {
            super(i0);
            this.L = l;
        }
        
        @Override
        public int E(final int n) {
            return this.e(n);
        }
        
        @Override
        public void m(final T t) {
            if (super.K == 0) {
                try {
                    if (this.L.a((Object)t)) {
                        super.G.m(t);
                    }
                    return;
                }
                finally {
                    final Throwable t2;
                    this.d(t2);
                    return;
                }
            }
            super.G.m(null);
        }
        
        @io.reactivex.annotations.g
        @Override
        public T poll() throws Exception {
            T poll;
            do {
                poll = (T)super.I.poll();
            } while (poll != null && !this.L.a((Object)poll));
            return (T)poll;
        }
    }
}
