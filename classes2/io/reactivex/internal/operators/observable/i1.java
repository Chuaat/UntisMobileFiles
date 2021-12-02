// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.e;
import io.reactivex.exceptions.b;
import io.reactivex.i0;
import x5.g;
import io.reactivex.k;
import x5.c;
import java.util.concurrent.Callable;
import io.reactivex.b0;

public final class i1<T, S> extends b0<T>
{
    final Callable<S> G;
    final c<S, k<T>, S> H;
    final g<? super S> I;
    
    public i1(final Callable<S> g, final c<S, k<T>, S> h, final g<? super S> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super T> i0) {
        try {
            final a a = new a((i0<? super Object>)i0, (c<Object, ? super k<Object>, Object>)this.H, (g<? super Object>)this.I, this.G.call());
            i0.l(a);
            a.g();
        }
        finally {
            final Throwable t;
            b.b(t);
            e.l(t, i0);
        }
    }
    
    static final class a<T, S> implements k<T>, c
    {
        final i0<? super T> G;
        final x5.c<S, ? super k<T>, S> H;
        final g<? super S> I;
        S J;
        volatile boolean K;
        boolean L;
        boolean M;
        
        a(final i0<? super T> g, final x5.c<S, ? super k<T>, S> h, final g<? super S> i, final S j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        private void a(final S n) {
            try {
                this.I.accept((Object)n);
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.L) {
                io.reactivex.plugins.a.Y(t);
            }
            else {
                Throwable t2;
                if ((t2 = t) == null) {
                    t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.L = true;
                this.G.b(t2);
            }
        }
        
        @Override
        public void dispose() {
            this.K = true;
        }
        
        @Override
        public void f() {
            if (!this.L) {
                this.L = true;
                this.G.f();
            }
        }
        
        public void g() {
            S n = this.J;
            Label_0017: {
                if (!this.K) {
                    final x5.c<S, ? super k<T>, S> h = this.H;
                    while (!this.K) {
                        this.M = false;
                        try {
                            final S n2 = n = h.b(n, this);
                            if (this.L) {
                                this.K = true;
                                n = n2;
                                break;
                            }
                            continue;
                        }
                        finally {
                            final Throwable t;
                            b.b(t);
                            this.J = null;
                            this.K = true;
                            this.b(t);
                            break Label_0017;
                        }
                    }
                }
                this.J = null;
            }
            this.a(n);
        }
        
        @Override
        public boolean i() {
            return this.K;
        }
        
        @Override
        public void m(final T t) {
            if (!this.L) {
                RuntimeException ex;
                if (this.M) {
                    ex = new IllegalStateException("onNext already called in this generate turn");
                }
                else {
                    if (t != null) {
                        this.M = true;
                        this.G.m((Object)t);
                        return;
                    }
                    ex = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.b(ex);
            }
        }
    }
}
