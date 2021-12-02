// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.j0;

public final class z0<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final j0 H;
    
    public z0(final y<T> y, final j0 h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, this.H));
    }
    
    static final class a<T> extends AtomicReference<c> implements v<T>, c, Runnable
    {
        private static final long K = 8571289934935992137L;
        final v<? super T> G;
        final j0 H;
        T I;
        Throwable J;
        
        a(final v<? super T> g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable j) {
            this.J = j;
            d.f(this, this.H.e(this));
        }
        
        @Override
        public void d(final T i) {
            this.I = i;
            d.f(this, this.H.e(this));
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            d.f(this, this.H.e(this));
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
        
        @Override
        public void run() {
            final Throwable j = this.J;
            if (j != null) {
                this.J = null;
                this.G.b(j);
            }
            else {
                final T i = this.I;
                if (i != null) {
                    this.I = null;
                    this.G.d((Object)i);
                }
                else {
                    this.G.f();
                }
            }
        }
    }
}
