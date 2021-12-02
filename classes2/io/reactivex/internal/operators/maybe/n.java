// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import o7.c;
import io.reactivex.v;
import io.reactivex.y;
import o7.b;

public final class n<T, U> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final o7.b<U> H;
    
    public n(final y<T> y, final o7.b<U> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.H.e((c)new b((v<? super Object>)v, super.G));
    }
    
    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements v<T>
    {
        private static final long H = 706635022205076709L;
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
    
    static final class b<T> implements q<Object>, c
    {
        final a<T> G;
        y<T> H;
        o7.d I;
        
        b(final v<? super T> v, final y<T> h) {
            this.G = (a<T>)new a((v<? super Object>)v);
            this.H = h;
        }
        
        void a() {
            final y<T> h = this.H;
            this.H = null;
            h.c(this.G);
        }
        
        public void b(final Throwable t) {
            final o7.d i = this.I;
            final j g = j.G;
            if (i != g) {
                this.I = (o7.d)g;
                this.G.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.I.cancel();
            this.I = (o7.d)j.G;
            d.b(this.G);
        }
        
        public void f() {
            final o7.d i = this.I;
            final j g = j.G;
            if (i != g) {
                this.I = (o7.d)g;
                this.a();
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.G.get());
        }
        
        public void m(final Object o) {
            final o7.d i = this.I;
            final j g = j.G;
            if (i != g) {
                i.cancel();
                this.I = (o7.d)g;
                this.a();
            }
        }
        
        @Override
        public void z(final o7.d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.G.l(this);
                i.v(Long.MAX_VALUE);
            }
        }
    }
}
