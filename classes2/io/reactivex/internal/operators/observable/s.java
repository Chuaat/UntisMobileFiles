// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.b;
import java.util.concurrent.Callable;

public final class s<T, U> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final Callable<? extends U> H;
    final b<? super U, ? super T> I;
    
    public s(final g0<T> g0, final Callable<? extends U> h, final b<? super U, ? super T> i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L5(final i0<? super U> i0) {
        try {
            super.G.c(new a<Object, Object>(i0, io.reactivex.internal.functions.b.g((Object)this.H.call(), "The initialSupplier returned a null value"), this.I));
        }
        finally {
            final Throwable t;
            e.l(t, i0);
        }
    }
    
    static final class a<T, U> implements i0<T>, c
    {
        final i0<? super U> G;
        final b<? super U, ? super T> H;
        final U I;
        c J;
        boolean K;
        
        a(final i0<? super U> g, final U i, final b<? super U, ? super T> h) {
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
            this.G.m((Object)this.I);
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
            if (this.K) {
                return;
            }
            try {
                this.H.a((Object)this.I, (Object)t);
            }
            finally {
                this.J.dispose();
                final Throwable t2;
                this.b(t2);
            }
        }
    }
}
