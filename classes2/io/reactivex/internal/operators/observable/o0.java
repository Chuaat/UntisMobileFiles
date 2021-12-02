// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.g;

public final class o0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final x5.g<? super T> H;
    final x5.g<? super Throwable> I;
    final x5.a J;
    final x5.a K;
    
    public o0(final g0<T> g0, final x5.g<? super T> h, final x5.g<? super Throwable> i, final x5.a j, final x5.a k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, (x5.g<? super T>)this.H, this.I, this.J, this.K));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        final x5.g<? super T> H;
        final x5.g<? super Throwable> I;
        final x5.a J;
        final x5.a K;
        c L;
        boolean M;
        
        a(final i0<? super T> g, final x5.g<? super T> h, final x5.g<? super Throwable> i, final x5.a j, final x5.a k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.M) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.M = true;
            io.reactivex.exceptions.a a = null;
            try {
                this.I.accept(t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.G.b(a);
            try {
                this.K.run();
            }
            finally {
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.L.dispose();
        }
        
        @Override
        public void f() {
            if (this.M) {
                return;
            }
            try {
                this.J.run();
                this.M = true;
                this.G.f();
                try {
                    this.K.run();
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.b(t2);
            }
        }
        
        @Override
        public boolean i() {
            return this.L.i();
        }
        
        @Override
        public void l(final c l) {
            if (d.l(this.L, l)) {
                this.L = l;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.M) {
                return;
            }
            try {
                this.H.accept((Object)t);
                this.G.m((Object)t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.L.dispose();
                this.b(t2);
            }
        }
    }
}
