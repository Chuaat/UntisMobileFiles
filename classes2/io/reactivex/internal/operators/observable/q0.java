// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.NoSuchElementException;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class q0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final T I;
    final boolean J;
    
    public q0(final g0<T> g0, final long h, final T i, final boolean j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H, (Object)this.I, this.J));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        final long H;
        final T I;
        final boolean J;
        c K;
        long L;
        boolean M;
        
        a(final i0<? super T> g, final long h, final T i, final boolean j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.M) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.M = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.K.dispose();
        }
        
        @Override
        public void f() {
            if (!this.M) {
                this.M = true;
                final T i = this.I;
                if (i == null && this.J) {
                    this.G.b(new NoSuchElementException());
                }
                else {
                    if (i != null) {
                        this.G.m((Object)i);
                    }
                    this.G.f();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.K.i();
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.M) {
                return;
            }
            final long l = this.L;
            if (l == this.H) {
                this.M = true;
                this.K.dispose();
                this.G.m((Object)t);
                this.G.f();
                return;
            }
            this.L = l + 1L;
        }
    }
}
