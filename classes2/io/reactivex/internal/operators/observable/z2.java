// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.i0;
import io.reactivex.g0;
import java.util.concurrent.Callable;
import x5.c;

public final class z2<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final c<R, ? super T, R> H;
    final Callable<R> I;
    
    public z2(final g0<T> g0, final Callable<R> i, final c<R, ? super T, R> h) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super R> i0) {
        try {
            super.G.c(new a<Object, Object>(i0, this.H, b.g(this.I.call(), "The seed supplied is null")));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.l(t, i0);
        }
    }
    
    static final class a<T, R> implements i0<T>, c
    {
        final i0<? super R> G;
        final x5.c<R, ? super T, R> H;
        R I;
        c J;
        boolean K;
        
        a(final i0<? super R> g, final x5.c<R, ? super T, R> h, final R i) {
            this.G = g;
            this.H = h;
            this.I = i;
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
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
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
                this.G.m((Object)this.I);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.K) {
                return;
            }
            final R i = this.I;
            try {
                final R g = b.g(this.H.b(i, (Object)t), "The accumulator returned a null value");
                this.I = g;
                this.G.m((Object)g);
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
