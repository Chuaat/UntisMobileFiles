// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.functions.b;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.a0;
import x5.o;

public final class l0<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final o<? super T, ? extends a0<R>> I;
    
    public l0(final l<T> l, final o<? super T, ? extends a0<R>> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        super.H.m6(new a<Object, Object>(c, this.I));
    }
    
    static final class a<T, R> implements q<T>, d
    {
        final c<? super R> G;
        final o<? super T, ? extends a0<R>> H;
        boolean I;
        d J;
        
        a(final c<? super R> g, final o<? super T, ? extends a0<R>> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.G.b(t);
        }
        
        public void cancel() {
            this.J.cancel();
        }
        
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.G.f();
        }
        
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
                final a0<Object> a2 = b.g((a0<Object>)this.H.apply((Object)t), "The selector returned a null Notification");
                if (a2.g()) {
                    this.J.cancel();
                    this.b(a2.d());
                }
                else if (a2.f()) {
                    this.J.cancel();
                    this.f();
                }
                else {
                    this.G.m(a2.e());
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.J.cancel();
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.z((d)this);
            }
        }
    }
}
