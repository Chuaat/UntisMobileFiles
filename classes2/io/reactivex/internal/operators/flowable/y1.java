// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.n0;
import o7.b;
import io.reactivex.k0;

public final class y1<T> extends k0<T>
{
    final b<T> G;
    final T H;
    
    public y1(final b<T> g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.e((c)new a((n0<? super Object>)n0, this.H));
    }
    
    static final class a<T> implements q<T>, c
    {
        final n0<? super T> G;
        final T H;
        d I;
        T J;
        
        a(final n0<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.I = (d)j.G;
            this.J = null;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.cancel();
            this.I = (d)j.G;
        }
        
        public void f() {
            this.I = (d)j.G;
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
            return this.I == j.G;
        }
        
        public void m(final T j) {
            this.J = j;
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
