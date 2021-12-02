// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import io.reactivex.subscribers.e;
import o7.c;
import io.reactivex.l;
import java.util.concurrent.TimeUnit;

public final class j0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final TimeUnit J;
    final io.reactivex.j0 K;
    final boolean L;
    
    public j0(final l<T> l, final long i, final TimeUnit j, final io.reactivex.j0 k, final boolean m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(o7.c<? super T> e) {
        if (!this.L) {
            e = new e<Object>((o7.c<? super Object>)e);
        }
        super.H.m6(new a<Object>((o7.c<? super Object>)e, this.I, this.J, this.K.c(), this.L));
    }
    
    static final class a<T> implements q<T>, d
    {
        final o7.c<? super T> G;
        final long H;
        final TimeUnit I;
        final io.reactivex.j0.c J;
        final boolean K;
        d L;
        
        a(final o7.c<? super T> g, final long h, final TimeUnit i, final io.reactivex.j0.c j, final boolean k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        public void b(final Throwable t) {
            final io.reactivex.j0.c j = this.J;
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
        
        public void cancel() {
            this.L.cancel();
            this.J.dispose();
        }
        
        public void f() {
            this.J.c(new j0.a.a(), this.H, this.I);
        }
        
        public void m(final T t) {
            this.J.c(new c(t), this.H, this.I);
        }
        
        public void v(final long n) {
            this.L.v(n);
        }
        
        @Override
        public void z(final d l) {
            if (j.o(this.L, l)) {
                this.L = l;
                this.G.z((d)this);
            }
        }
        
        final class a implements Runnable
        {
            @Override
            public void run() {
                try {
                    j0.a.this.G.f();
                }
                finally {
                    j0.a.this.J.dispose();
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
                    j0.a.this.G.b(this.G);
                }
                finally {
                    j0.a.this.J.dispose();
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
                j0.a.this.G.m((Object)this.G);
            }
        }
    }
}
