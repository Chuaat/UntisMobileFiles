// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.exceptions.b;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.r;

public final class g4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final r<? super T> I;
    
    public g4(final l<T> l, final r<? super T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, (r<? super T>)this.I));
    }
    
    static final class a<T> implements q<T>, d
    {
        final c<? super T> G;
        final r<? super T> H;
        d I;
        boolean J;
        
        a(final c<? super T> g, final r<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (!this.J) {
                this.J = true;
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            this.I.cancel();
        }
        
        public void f() {
            if (!this.J) {
                this.J = true;
                this.G.f();
            }
        }
        
        public void m(final T t) {
            if (!this.J) {
                this.G.m((Object)t);
                try {
                    if (this.H.a((Object)t)) {
                        this.J = true;
                        this.I.cancel();
                        this.G.f();
                    }
                }
                finally {
                    final Throwable t2;
                    b.b(t2);
                    this.I.cancel();
                    this.b(t2);
                }
            }
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
    }
}
