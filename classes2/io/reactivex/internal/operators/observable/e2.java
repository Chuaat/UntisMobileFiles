// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.h;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;

public final class e2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final o<? super Throwable, ? extends g0<? extends T>> H;
    final boolean I;
    
    public e2(final g0<T> g0, final o<? super Throwable, ? extends g0<? extends T>> h, final boolean i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super T> i0) {
        final a<Object> a = new a<Object>((i0<? super Object>)i0, this.H, this.I);
        i0.l(a.J);
        super.G.c(a);
    }
    
    static final class a<T> implements i0<T>
    {
        final i0<? super T> G;
        final o<? super Throwable, ? extends g0<? extends T>> H;
        final boolean I;
        final h J;
        boolean K;
        boolean L;
        
        a(final i0<? super T> g, final o<? super Throwable, ? extends g0<? extends T>> h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = new h();
        }
        
        @Override
        public void b(final Throwable cause) {
            if (this.K) {
                if (this.L) {
                    io.reactivex.plugins.a.Y(cause);
                    return;
                }
                this.G.b(cause);
            }
            else {
                this.K = true;
                if (this.I && !(cause instanceof Exception)) {
                    this.G.b(cause);
                    return;
                }
                try {
                    final g0 g0 = (g0)this.H.apply(cause);
                    if (g0 == null) {
                        final NullPointerException ex = new NullPointerException("Observable is null");
                        ex.initCause(cause);
                        this.G.b(ex);
                        return;
                    }
                    g0.c(this);
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    this.G.b(new io.reactivex.exceptions.a(new Throwable[] { cause, t }));
                }
            }
        }
        
        @Override
        public void f() {
            if (this.L) {
                return;
            }
            this.L = true;
            this.K = true;
            this.G.f();
        }
        
        @Override
        public void l(final c c) {
            this.J.a(c);
        }
        
        @Override
        public void m(final T t) {
            if (this.L) {
                return;
            }
            this.G.m((Object)t);
        }
    }
}
