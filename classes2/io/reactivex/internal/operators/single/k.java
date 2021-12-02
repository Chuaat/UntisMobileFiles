// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.v;
import io.reactivex.a0;
import x5.o;
import io.reactivex.k0;
import io.reactivex.annotations.e;
import io.reactivex.s;

@e
public final class k<T, R> extends s<R>
{
    final k0<T> G;
    final o<? super T, a0<R>> H;
    
    public k(final k0<T> g, final o<? super T, a0<R>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        this.G.c(new a<Object, Object>(v, (o<? super T, a0<?>>)this.H));
    }
    
    static final class a<T, R> implements n0<T>, c
    {
        final v<? super R> G;
        final o<? super T, a0<R>> H;
        c I;
        
        a(final v<? super R> g, final o<? super T, a0<R>> h) {
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
                final a0<R> a0 = b.g(this.H.apply((Object)t), "The selector returned a null Notification");
                if (a0.h()) {
                    this.G.d((Object)a0.e());
                }
                else if (a0.f()) {
                    this.G.f();
                }
                else {
                    this.G.b(a0.d());
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
            this.I.dispose();
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
