// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.g0;
import io.reactivex.k0;

public final class u1<T> extends k0<T>
{
    final g0<T> G;
    final T H;
    
    public u1(final g0<T> g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, (Object)this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final n0<? super T> G;
        final T H;
        c I;
        T J;
        
        a(final n0<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.I = d.G;
            this.J = null;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            this.I = d.G;
        }
        
        @Override
        public void f() {
            this.I = d.G;
            T t = this.J;
            if (t != null) {
                this.J = null;
            }
            else {
                t = this.H;
                if (t == null) {
                    this.G.b(new NoSuchElementException());
                    return;
                }
            }
            this.G.d((Object)t);
        }
        
        @Override
        public boolean i() {
            return this.I == d.G;
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T j) {
            this.J = j;
        }
    }
}
