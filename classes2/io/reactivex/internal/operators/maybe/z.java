// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.v;
import x5.r;
import io.reactivex.q0;
import io.reactivex.s;

public final class z<T> extends s<T>
{
    final q0<T> G;
    final r<? super T> H;
    
    public z(final q0<T> g, final r<? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.c(new a<Object>(v, this.H));
    }
    
    static final class a<T> implements n0<T>, c
    {
        final v<? super T> G;
        final r<? super T> H;
        c I;
        
        a(final v<? super T> g, final r<? super T> h) {
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
                if (this.H.a((Object)t)) {
                    this.G.d((Object)t);
                }
                else {
                    this.G.f();
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void dispose() {
            final c i = this.I;
            this.I = d.G;
            i.dispose();
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
    }
}
