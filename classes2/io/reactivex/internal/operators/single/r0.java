// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import java.util.concurrent.CancellationException;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import o7.b;
import io.reactivex.q0;
import io.reactivex.k0;

public final class r0<T, U> extends k0<T>
{
    final q0<T> G;
    final o7.b<U> H;
    
    public r0(final q0<T> g, final o7.b<U> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final a<Object> a = new a<Object>((n0<? super Object>)n0);
        n0.l(a);
        this.H.e((o7.c)a.H);
        this.G.c(a);
    }
    
    static final class a<T> extends AtomicReference<c> implements n0<T>, c
    {
        private static final long I = -622603812305745221L;
        final n0<? super T> G;
        final b H;
        
        a(final n0<? super T> g) {
            this.G = g;
            this.H = new b((a<?>)this);
        }
        
        void a(final Throwable t) {
            final c c = this.get();
            final d g = d.G;
            if (c != g) {
                final d d = this.getAndSet(g);
                if (d != g) {
                    if (d != null) {
                        d.dispose();
                    }
                    this.G.b(t);
                    return;
                }
            }
            io.reactivex.plugins.a.Y(t);
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.a();
            final c c = this.get();
            final d g = d.G;
            if (c != g && this.getAndSet(g) != g) {
                this.G.b(t);
                return;
            }
            io.reactivex.plugins.a.Y(t);
        }
        
        @Override
        public void d(final T t) {
            this.H.a();
            final d g = d.G;
            if (this.getAndSet(g) != g) {
                this.G.d((Object)t);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
            this.H.a();
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
    
    static final class b extends AtomicReference<o7.d> implements q<Object>
    {
        private static final long H = 5170026210238877381L;
        final a<?> G;
        
        b(final a<?> g) {
            this.G = g;
        }
        
        public void a() {
            j.b(this);
        }
        
        public void b(final Throwable t) {
            this.G.a(t);
        }
        
        public void f() {
            final j value = ((AtomicReference<j>)this).get();
            final j g = j.G;
            if (value != g) {
                this.lazySet((o7.d)g);
                this.G.a(new CancellationException());
            }
        }
        
        public void m(final Object o) {
            if (j.b(this)) {
                this.G.a(new CancellationException());
            }
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
}
