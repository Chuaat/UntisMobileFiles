// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.disposables.c;
import x5.g;

public final class d1<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final g<? super c> H;
    final g<? super T> I;
    final g<? super Throwable> J;
    final x5.a K;
    final x5.a L;
    final x5.a M;
    
    public d1(final y<T> y, final g<? super c> h, final g<? super T> i, final g<? super Throwable> j, final x5.a k, final x5.a l, final x5.a m) {
        super(y);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, (d1<? super T>)this));
    }
    
    static final class a<T> implements v<T>, c
    {
        final v<? super T> G;
        final d1<T> H;
        c I;
        
        a(final v<? super T> g, final d1<T> h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            try {
                this.H.L.run();
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I == d.G) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.c(t);
        }
        
        void c(final Throwable t) {
            io.reactivex.exceptions.a a = null;
            try {
                this.H.J.accept(t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.I = d.G;
            this.G.b(a);
            this.a();
        }
        
        @Override
        public void d(final T t) {
            final c i = this.I;
            final d g = d.G;
            if (i == g) {
                return;
            }
            try {
                this.H.I.accept((Object)t);
                this.I = g;
                this.G.d((Object)t);
                this.a();
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.c(t2);
            }
        }
        
        @Override
        public void dispose() {
            try {
                this.H.M.run();
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
            this.I.dispose();
            this.I = d.G;
        }
        
        @Override
        public void f() {
            final c i = this.I;
            final d g = d.G;
            if (i == g) {
                return;
            }
            try {
                this.H.K.run();
                this.I = g;
                this.G.f();
                this.a();
            }
            finally {
                final Throwable t;
                b.b(t);
                this.c(t);
            }
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                try {
                    this.H.H.accept(i);
                    this.I = i;
                    this.G.l(this);
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    i.dispose();
                    this.I = d.G;
                    e.j(t, this.G);
                }
            }
        }
    }
}
