// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import java.util.concurrent.Callable;
import x5.o;
import io.reactivex.g0;

public final class x1<T, R> extends io.reactivex.internal.operators.observable.a<T, g0<? extends R>>
{
    final o<? super T, ? extends g0<? extends R>> H;
    final o<? super Throwable, ? extends g0<? extends R>> I;
    final Callable<? extends g0<? extends R>> J;
    
    public x1(final g0<T> g0, final o<? super T, ? extends g0<? extends R>> h, final o<? super Throwable, ? extends g0<? extends R>> i, final Callable<? extends g0<? extends R>> j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super g0<? extends R>> i0) {
        super.G.c(new a<Object, Object>((i0<? super g0<?>>)i0, this.H, this.I, this.J));
    }
    
    static final class a<T, R> implements i0<T>, c
    {
        final i0<? super g0<? extends R>> G;
        final o<? super T, ? extends g0<? extends R>> H;
        final o<? super Throwable, ? extends g0<? extends R>> I;
        final Callable<? extends g0<? extends R>> J;
        c K;
        
        a(final i0<? super g0<? extends R>> g, final o<? super T, ? extends g0<? extends R>> h, final o<? super Throwable, ? extends g0<? extends R>> i, final Callable<? extends g0<? extends R>> j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                this.G.m((Object)b.g((g0<?>)this.I.apply(t), "The onError ObservableSource returned is null"));
                this.G.f();
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void dispose() {
            this.K.dispose();
        }
        
        @Override
        public void f() {
            try {
                this.G.m((Object)b.g((g0<?>)this.J.call(), "The onComplete ObservableSource returned is null"));
                this.G.f();
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.G.b(t);
            }
        }
        
        @Override
        public boolean i() {
            return this.K.i();
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            try {
                this.G.m((Object)b.g((g0<?>)this.H.apply((Object)t), "The onNext ObservableSource returned is null"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(t2);
            }
        }
    }
}
