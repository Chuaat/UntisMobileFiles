// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.functions.b;
import io.reactivex.subjects.e;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import x5.o;

public final class h2<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final o<? super b0<T>, ? extends g0<R>> H;
    
    public h2(final g0<T> g0, final o<? super b0<T>, ? extends g0<R>> h) {
        super(g0);
        this.H = h;
    }
    
    @Override
    protected void L5(i0<? super R> b) {
        final e<Object> r8 = e.r8();
        try {
            final g0 g0 = b.g((g0)this.H.apply((Object)r8), "The selector returned a null ObservableSource");
            b = new b<Object, Object>((i0<? super Object>)b);
            g0.c(b);
            super.G.c(new a<Object, Object>(r8, b));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            io.reactivex.internal.disposables.e.l(t, b);
        }
    }
    
    static final class a<T, R> implements i0<T>
    {
        final e<T> G;
        final AtomicReference<c> H;
        
        a(final e<T> g, final AtomicReference<c> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final c c) {
            d.j(this.H, c);
        }
        
        @Override
        public void m(final T t) {
            this.G.m(t);
        }
    }
    
    static final class b<T, R> extends AtomicReference<c> implements i0<R>, c
    {
        private static final long I = 854110278590336484L;
        final i0<? super R> G;
        c H;
        
        b(final i0<? super R> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            d.b(this);
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            d.b(this);
        }
        
        @Override
        public void f() {
            d.b(this);
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final c h) {
            if (d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final R r) {
            this.G.m((Object)r);
        }
    }
}
