// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.plugins.a;
import io.reactivex.exceptions.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import x5.d;
import io.reactivex.y;
import io.reactivex.k0;

public final class v<T> extends k0<Boolean>
{
    final y<? extends T> G;
    final y<? extends T> H;
    final d<? super T, ? super T> I;
    
    public v(final y<? extends T> g, final y<? extends T> h, final d<? super T, ? super T> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super Boolean> n0) {
        final a a = new a(n0, (d<? super Object, ? super Object>)this.I);
        n0.l(a);
        a.c(this.G, this.H);
    }
    
    static final class a<T> extends AtomicInteger implements c
    {
        final n0<? super Boolean> G;
        final b<T> H;
        final b<T> I;
        final d<? super T, ? super T> J;
        
        a(final n0<? super Boolean> g, final d<? super T, ? super T> j) {
            super(2);
            this.G = g;
            this.J = j;
            this.H = (b<T>)new b((a<Object>)this);
            this.I = (b<T>)new b((a<Object>)this);
        }
        
        void a() {
            if (this.decrementAndGet() == 0) {
                final Object h = this.H.H;
                final Object h2 = this.I.H;
                if (h != null && h2 != null) {
                    try {
                        this.G.d(this.J.a((Object)h, (Object)h2));
                        return;
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.G.b(t);
                        return;
                    }
                }
                this.G.d(h == null && h2 == null);
            }
        }
        
        void b(final b<T> b, final Throwable t) {
            if (this.getAndSet(0) > 0) {
                final b<T> h = this.H;
                if (b == h) {
                    this.I.a();
                }
                else {
                    h.a();
                }
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c(final y<? extends T> y, final y<? extends T> y2) {
            y.c(this.H);
            y2.c(this.I);
        }
        
        @Override
        public void dispose() {
            this.H.a();
            this.I.a();
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.H.get());
        }
    }
    
    static final class b<T> extends AtomicReference<c> implements v<T>
    {
        private static final long I = -3031974433025990931L;
        final a<T> G;
        Object H;
        
        b(final a<T> g) {
            this.G = g;
        }
        
        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(this, t);
        }
        
        @Override
        public void d(final T h) {
            this.H = h;
            this.G.a();
        }
        
        @Override
        public void f() {
            this.G.a();
        }
        
        @Override
        public void l(final c c) {
            io.reactivex.internal.disposables.d.j(this, c);
        }
    }
}
