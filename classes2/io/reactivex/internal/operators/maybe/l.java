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
import java.util.concurrent.TimeUnit;

public final class l<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    
    public l(final y<T> y, final long h, final TimeUnit i, final j0 j) {
        super(y);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, this.H, this.I, this.J));
    }
    
    static final class a<T> extends AtomicReference<c> implements v<T>, c, Runnable
    {
        private static final long M = 5566860102500855068L;
        final v<? super T> G;
        final long H;
        final TimeUnit I;
        final j0 J;
        T K;
        Throwable L;
        
        a(final v<? super T> g, final long h, final TimeUnit i, final j0 j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            d.f(this, this.J.f(this, this.H, this.I));
        }
        
        @Override
        public void b(final Throwable l) {
            this.L = l;
            this.a();
        }
        
        @Override
        public void d(final T k) {
            this.K = k;
            this.a();
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            this.a();
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
            final Throwable l = this.L;
            if (l != null) {
                this.G.b(l);
            }
            else {
                final T k = this.K;
                if (k != null) {
                    this.G.d((Object)k);
                }
                else {
                    this.G.f();
                }
            }
        }
    }
}
