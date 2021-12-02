// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.l;
import io.reactivex.n0;
import io.reactivex.i0;
import io.reactivex.q0;
import io.reactivex.b0;

public final class v0<T> extends b0<T>
{
    final q0<? extends T> G;
    
    public v0(final q0<? extends T> g) {
        this.G = g;
    }
    
    public static <T> n0<T> l8(final i0<? super T> i0) {
        return new a<T>(i0);
    }
    
    public void L5(final i0<? super T> i0) {
        this.G.c(l8(i0));
    }
    
    static final class a<T> extends l<T> implements n0<T>
    {
        private static final long Q = 3786543492451018833L;
        c P;
        
        a(final i0<? super T> i0) {
            super(i0);
        }
        
        @Override
        public void b(final Throwable t) {
            this.e(t);
        }
        
        @Override
        public void d(final T t) {
            this.c(t);
        }
        
        @Override
        public void dispose() {
            super.dispose();
            this.P.dispose();
        }
        
        @Override
        public void l(final c p) {
            if (d.l(this.P, p)) {
                this.P = p;
                super.H.l(this);
            }
        }
    }
}
