// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.NoSuchElementException;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.g0;
import io.reactivex.k0;

public final class e3<T> extends k0<T>
{
    final g0<? extends T> G;
    final T H;
    
    public e3(final g0<? extends T> g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    public void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, (Object)this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final n0<? super T> G;
        final T H;
        c I;
        T J;
        boolean K;
        
        a(final n0<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            final T j = this.J;
            this.J = null;
            T h;
            if ((h = j) == null) {
                h = this.H;
            }
            if (h != null) {
                this.G.d((Object)h);
            }
            else {
                this.G.b(new NoSuchElementException());
            }
        }
        
        @Override
        public boolean i() {
            return this.I.i();
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
            if (this.K) {
                return;
            }
            if (this.J != null) {
                this.K = true;
                this.I.dispose();
                this.G.b(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.J = j;
        }
    }
}
