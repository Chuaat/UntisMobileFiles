// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.n0;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.q0;
import x5.o;
import io.reactivex.y;
import io.reactivex.s;

public final class g0<T, R> extends s<R>
{
    final y<T> G;
    final o<? super T, ? extends q0<? extends R>> H;
    
    public g0(final y<T> g, final o<? super T, ? extends q0<? extends R>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        this.G.c(new a<Object, Object>(v, this.H));
    }
    
    static final class a<T, R> extends AtomicReference<c> implements v<T>, c
    {
        private static final long I = 4827726964688405508L;
        final v<? super R> G;
        final o<? super T, ? extends q0<? extends R>> H;
        
        a(final v<? super R> g, final o<? super T, ? extends q0<? extends R>> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            try {
                io.reactivex.internal.functions.b.g((q0)this.H.apply((Object)t), "The mapper returned a null SingleSource").c(new b(this, this.G));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.b(t2);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
    }
    
    static final class b<R> implements n0<R>
    {
        final AtomicReference<c> G;
        final v<? super R> H;
        
        b(final AtomicReference<c> g, final v<? super R> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.b(t);
        }
        
        @Override
        public void d(final R r) {
            this.H.d((Object)r);
        }
        
        @Override
        public void l(final c c) {
            d.f(this.G, c);
        }
    }
}
