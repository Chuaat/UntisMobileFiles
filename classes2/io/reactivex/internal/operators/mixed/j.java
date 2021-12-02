// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;
import io.reactivex.y;
import io.reactivex.b0;

public final class j<T, R> extends b0<R>
{
    final y<T> G;
    final o<? super T, ? extends g0<? extends R>> H;
    
    public j(final y<T> g, final o<? super T, ? extends g0<? extends R>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        final a<Object, Object> a = new a<Object, Object>((i0<? super Object>)i0, (o<? super Object, ? extends g0<?>>)this.H);
        i0.l(a);
        this.G.c(a);
    }
    
    static final class a<T, R> extends AtomicReference<c> implements i0<R>, v<T>, c
    {
        private static final long I = -8948264376121066672L;
        final i0<? super R> G;
        final o<? super T, ? extends g0<? extends R>> H;
        
        a(final i0<? super R> g, final o<? super T, ? extends g0<? extends R>> h) {
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
                b.g((g0)this.H.apply((Object)t), "The mapper returned a null Publisher").c(this);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(t2);
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
            d.f(this, c);
        }
        
        @Override
        public void m(final R r) {
            this.G.m((Object)r);
        }
    }
}
