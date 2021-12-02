// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.n0;
import x5.o;
import io.reactivex.q0;

public final class k0<T, R> extends io.reactivex.k0<R>
{
    final q0<? extends T> G;
    final o<? super T, ? extends R> H;
    
    public k0(final q0<? extends T> g, final o<? super T, ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        this.G.c(new a<Object, Object>(n0, this.H));
    }
    
    static final class a<T, R> implements n0<T>
    {
        final n0<? super R> G;
        final o<? super T, ? extends R> H;
        
        a(final n0<? super R> g, final o<? super T, ? extends R> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            try {
                this.G.d((Object)b.g((Object)this.H.apply((Object)t), "The mapper function returned a null value."));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.b(t2);
            }
        }
        
        @Override
        public void l(final c c) {
            this.G.l(c);
        }
    }
}
