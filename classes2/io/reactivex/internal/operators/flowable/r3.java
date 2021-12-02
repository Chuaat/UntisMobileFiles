// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import io.reactivex.q;
import io.reactivex.n0;
import io.reactivex.l;
import y5.b;
import io.reactivex.k0;

public final class r3<T> extends k0<T> implements b<T>
{
    final l<T> G;
    final T H;
    
    public r3(final l<T> g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.m6(new a<Object>(n0, (Object)this.H));
    }
    
    @Override
    public l<T> g() {
        return io.reactivex.plugins.a.P(new p3((l<Object>)this.G, this.H, true));
    }
    
    static final class a<T> implements q<T>, c
    {
        final n0<? super T> G;
        final T H;
        d I;
        boolean J;
        T K;
        
        a(final n0<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.I = (d)j.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.cancel();
            this.I = (d)j.G;
        }
        
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            this.I = (d)j.G;
            final T k = this.K;
            this.K = null;
            T h;
            if ((h = k) == null) {
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
            return this.I == j.G;
        }
        
        public void m(final T k) {
            if (this.J) {
                return;
            }
            if (this.K != null) {
                this.J = true;
                this.I.cancel();
                this.I = (d)j.G;
                this.G.b(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.K = k;
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.l(this);
                i.v(Long.MAX_VALUE);
            }
        }
    }
}
