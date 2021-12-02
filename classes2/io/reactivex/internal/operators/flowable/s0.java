// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import o7.c;
import io.reactivex.l;
import x5.q;
import o7.d;
import x5.g;

public final class s0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    private final g<? super d> I;
    private final q J;
    private final x5.a K;
    
    public s0(final l<T> l, final g<? super d> i, final q j, final x5.a k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I, this.J, this.K));
    }
    
    static final class a<T> implements q<T>, d
    {
        final c<? super T> G;
        final g<? super d> H;
        final x5.q I;
        final x5.a J;
        d K;
        
        a(final c<? super T> g, final g<? super d> h, final x5.q i, final x5.a j) {
            this.G = g;
            this.H = h;
            this.J = j;
            this.I = i;
        }
        
        public void b(final Throwable t) {
            if (this.K != j.G) {
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            final d k = this.K;
            final j g = j.G;
            if (k != g) {
                this.K = (d)g;
                try {
                    this.J.run();
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
                k.cancel();
            }
        }
        
        public void f() {
            if (this.K != j.G) {
                this.G.f();
            }
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
            try {
                this.I.a(n);
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
            this.K.v(n);
        }
        
        @Override
        public void z(final d k) {
            try {
                this.H.accept(k);
                if (j.o(this.K, k)) {
                    this.K = k;
                    this.G.z((d)this);
                }
            }
            finally {
                final Throwable t;
                b.b(t);
                k.cancel();
                this.K = (d)j.G;
                io.reactivex.internal.subscriptions.g.d(t, this.G);
            }
        }
    }
}
