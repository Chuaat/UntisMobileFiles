// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.q;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.TimeoutException;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;
import o7.b;

public final class k1<T, U> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final o7.b<U> H;
    final y<? extends T> I;
    
    public k1(final y<T> y, final o7.b<U> h, final y<? extends T> i) {
        super(y);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final b<Object, Object> b = new b<Object, Object>((v<? super Object>)v, this.I);
        v.l(b);
        this.H.e((o7.c)b.H);
        super.G.c(b);
    }
    
    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements v<T>
    {
        private static final long H = 8663801314800248617L;
        final v<? super T> G;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.j(this, c);
        }
    }
    
    static final class b<T, U> extends AtomicReference<c> implements v<T>, c
    {
        private static final long K = -5955289211445418871L;
        final v<? super T> G;
        final k1.c<T, U> H;
        final y<? extends T> I;
        final a<T> J;
        
        b(final v<? super T> g, final y<? extends T> i) {
            this.G = g;
            this.H = (k1.c<T, U>)new k1.c((b<Object, Object>)this);
            this.I = i;
            a<T> j;
            if (i != null) {
                j = (a<T>)new a((v<? super Object>)g);
            }
            else {
                j = null;
            }
            this.J = j;
        }
        
        public void a() {
            if (d.b(this)) {
                final y<? extends T> i = this.I;
                if (i == null) {
                    this.G.b(new TimeoutException());
                }
                else {
                    i.c(this.J);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            j.b(this.H);
            final d g = d.G;
            if (this.getAndSet(g) != g) {
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void c(final Throwable t) {
            if (d.b(this)) {
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void d(final T t) {
            j.b(this.H);
            final d g = d.G;
            if (this.getAndSet(g) != g) {
                this.G.d((Object)t);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
            j.b(this.H);
            final a<T> j = this.J;
            if (j != null) {
                d.b(j);
            }
        }
        
        @Override
        public void f() {
            j.b(this.H);
            final d g = d.G;
            if (this.getAndSet(g) != g) {
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
    }
    
    static final class c<T, U> extends AtomicReference<o7.d> implements q<Object>
    {
        private static final long H = 8663801314800248617L;
        final b<T, U> G;
        
        c(final b<T, U> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            this.G.c(t);
        }
        
        public void f() {
            this.G.a();
        }
        
        public void m(final Object o) {
            this.get().cancel();
            this.G.a();
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
}
