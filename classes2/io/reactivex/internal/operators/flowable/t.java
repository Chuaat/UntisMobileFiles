// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.e;
import io.reactivex.q;
import io.reactivex.n0;
import java.util.concurrent.Callable;
import io.reactivex.l;
import y5.b;
import io.reactivex.k0;

public final class t<T, U> extends k0<U> implements b<U>
{
    final l<T> G;
    final Callable<? extends U> H;
    final x5.b<? super U, ? super T> I;
    
    public t(final l<T> g, final Callable<? extends U> h, final x5.b<? super U, ? super T> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super U> n0) {
        try {
            this.G.m6(new a<Object, Object>(n0, io.reactivex.internal.functions.b.g((Object)this.H.call(), "The initialSupplier returned a null value"), this.I));
        }
        finally {
            final Throwable t;
            e.m(t, n0);
        }
    }
    
    @Override
    public l<U> g() {
        return io.reactivex.plugins.a.P((l<U>)new s((l<Object>)this.G, this.H, (x5.b<? super Object, ? super Object>)this.I));
    }
    
    static final class a<T, U> implements q<T>, c
    {
        final n0<? super U> G;
        final x5.b<? super U, ? super T> H;
        final U I;
        d J;
        boolean K;
        
        a(final n0<? super U> g, final U i, final x5.b<? super U, ? super T> h) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.J = (d)j.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.J.cancel();
            this.J = (d)j.G;
        }
        
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            this.J = (d)j.G;
            this.G.d((Object)this.I);
        }
        
        @Override
        public boolean i() {
            return this.J == j.G;
        }
        
        public void m(final T t) {
            if (this.K) {
                return;
            }
            try {
                this.H.a((Object)this.I, (Object)t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.J.cancel();
                this.b(t2);
            }
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.l(this);
                j.v(Long.MAX_VALUE);
            }
        }
    }
}
