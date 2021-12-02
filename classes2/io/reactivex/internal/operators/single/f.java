// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;
import io.reactivex.n0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.q0;
import io.reactivex.k0;

public final class f<T> extends k0<T>
{
    final q0<? extends T> G;
    final long H;
    final TimeUnit I;
    final j0 J;
    final boolean K;
    
    public f(final q0<? extends T> g, final long h, final TimeUnit i, final j0 j, final boolean k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final h h = new h();
        n0.l(h);
        this.G.c(new a(h, n0));
    }
    
    final class a implements n0<T>
    {
        private final h G;
        final n0<? super T> H;
        
        a(final h g, final n0<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            final h g = this.G;
            final j0 j = f.this.J;
            final f.a.a a = new f.a.a(t);
            final f i = f.this;
            long h;
            if (i.K) {
                h = i.H;
            }
            else {
                h = 0L;
            }
            g.a(j.f(a, h, i.I));
        }
        
        @Override
        public void d(final T t) {
            final h g = this.G;
            final j0 j = f.this.J;
            final b b = new b(t);
            final f i = f.this;
            g.a(j.f(b, i.H, i.I));
        }
        
        @Override
        public void l(final c c) {
            this.G.a(c);
        }
        
        final class a implements Runnable
        {
            private final Throwable G;
            
            a(final Throwable g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                f.a.this.H.b(this.G);
            }
        }
        
        final class b implements Runnable
        {
            private final T G;
            
            b(final T g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                f.a.this.H.d((Object)this.G);
            }
        }
    }
}
