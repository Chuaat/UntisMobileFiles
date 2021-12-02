// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import x5.o;
import io.reactivex.q0;
import io.reactivex.k0;

public final class x<T, R> extends k0<R>
{
    final q0<? extends T> G;
    final o<? super T, ? extends q0<? extends R>> H;
    
    public x(final q0<? extends T> g, final o<? super T, ? extends q0<? extends R>> h) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        this.G.c(new a<Object, Object>(n0, this.H));
    }
    
    static final class a<T, R> extends AtomicReference<c> implements n0<T>, c
    {
        private static final long I = 3258103020495908596L;
        final n0<? super R> G;
        final o<? super T, ? extends q0<? extends R>> H;
        
        a(final n0<? super R> g, final o<? super T, ? extends q0<? extends R>> h) {
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
                final q0 q0 = b.g((q0)this.H.apply((Object)t), "The single returned by the mapper is null");
                if (!this.i()) {
                    q0.c(new x.a.a(this, this.G));
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
        
        static final class a<R> implements n0<R>
        {
            final AtomicReference<c> G;
            final n0<? super R> H;
            
            a(final AtomicReference<c> g, final n0<? super R> h) {
                this.G = g;
                this.H = h;
            }
            
            @Override
            public void b(final Throwable t) {
                this.H.b(t);
            }
            
            @Override
            public void d(final R r) {
                this.H.d((Object)r);
            }
            
            @Override
            public void l(final c c) {
                d.f(this.G, c);
            }
        }
    }
}
