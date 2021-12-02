// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.g0;
import io.reactivex.a0;
import x5.o;

public final class i0<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final o<? super T, ? extends a0<R>> H;
    
    public i0(final g0<T> g0, final o<? super T, ? extends a0<R>> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final io.reactivex.i0<? super R> i0) {
        super.G.c(new a<Object, Object>(i0, this.H));
    }
    
    static final class a<T, R> implements i0<T>, c
    {
        final i0<? super R> G;
        final o<? super T, ? extends a0<R>> H;
        boolean I;
        c J;
        
        a(final i0<? super R> g, final o<? super T, ? extends a0<R>> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.I) {
                if (t instanceof a0) {
                    final a0 a0 = (a0)t;
                    if (a0.g()) {
                        io.reactivex.plugins.a.Y(a0.d());
                    }
                }
                return;
            }
            try {
                final a0<? super R> a2 = b.g((a0<? super R>)this.H.apply((Object)t), "The selector returned a null Notification");
                if (a2.g()) {
                    this.J.dispose();
                    this.b(a2.d());
                }
                else if (a2.f()) {
                    this.J.dispose();
                    this.f();
                }
                else {
                    this.G.m(a2.e());
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.J.dispose();
                this.b(t2);
            }
        }
    }
}
