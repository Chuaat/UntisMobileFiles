// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.plugins.a;
import io.reactivex.b0;
import x5.b;
import java.util.concurrent.Callable;
import io.reactivex.g0;
import y5.d;
import io.reactivex.k0;

public final class t<T, U> extends k0<U> implements d<U>
{
    final g0<T> G;
    final Callable<? extends U> H;
    final b<? super U, ? super T> I;
    
    public t(final g0<T> g, final Callable<? extends U> h, final b<? super U, ? super T> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public b0<U> a() {
        return io.reactivex.plugins.a.R((b0<U>)new s((g0<Object>)this.G, this.H, (b<? super Object, ? super Object>)this.I));
    }
    
    @Override
    protected void e1(final n0<? super U> n0) {
        try {
            this.G.c(new a<Object, Object>(n0, io.reactivex.internal.functions.b.g((Object)this.H.call(), "The initialSupplier returned a null value"), this.I));
        }
        finally {
            final Throwable t;
            e.m(t, n0);
        }
    }
    
    static final class a<T, U> implements i0<T>, c
    {
        final n0<? super U> G;
        final b<? super U, ? super T> H;
        final U I;
        c J;
        boolean K;
        
        a(final n0<? super U> g, final U i, final b<? super U, ? super T> h) {
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
            this.G.d((Object)this.I);
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c j) {
            if (io.reactivex.internal.disposables.d.l(this.J, j)) {
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
