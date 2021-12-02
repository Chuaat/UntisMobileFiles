// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class g0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    final boolean K;
    
    public g0(final io.reactivex.g0<T> g0, final long h, final TimeUnit i, final j0 j, final boolean k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L5(i0<? super T> m) {
        if (!this.K) {
            m = new m<Object>(m);
        }
        super.G.c(new a<Object>(m, this.H, this.I, this.J.c(), this.K));
    }
    
    static final class a<T> implements i0<T>, io.reactivex.disposables.c
    {
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        final boolean K;
        io.reactivex.disposables.c L;
        
        a(final i0<? super T> g, final long h, final TimeUnit i, final j0.c j, final boolean k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        @Override
        public void b(final Throwable t) {
            final j0.c j = this.J;
            final b b = new b(t);
            long h;
            if (this.K) {
                h = this.H;
            }
            else {
                h = 0L;
            }
            j.c(b, h, this.I);
        }
        
        @Override
        public void dispose() {
            this.L.dispose();
            this.J.dispose();
        }
        
        @Override
        public void f() {
            this.J.c(new g0.a.a(), this.H, this.I);
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c l) {
            if (d.l(this.L, l)) {
                this.L = l;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            this.J.c(new c(t), this.H, this.I);
        }
        
        final class a implements Runnable
        {
            @Override
            public void run() {
                try {
                    g0.a.this.G.f();
                }
                finally {
                    g0.a.this.J.dispose();
                }
            }
        }
        
        final class b implements Runnable
        {
            private final Throwable G;
            
            b(final Throwable g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                try {
                    g0.a.this.G.b(this.G);
                }
                finally {
                    g0.a.this.J.dispose();
                }
            }
        }
        
        final class c implements Runnable
        {
            private final T G;
            
            c(final T g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                g0.a.this.G.m((Object)this.G);
            }
        }
    }
}
