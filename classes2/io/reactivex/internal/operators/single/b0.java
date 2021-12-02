// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import io.reactivex.v;
import io.reactivex.y;
import x5.o;
import io.reactivex.q0;
import io.reactivex.s;

public final class b0<T, R> extends s<R>
{
    final q0<? extends T> G;
    final o<? super T, ? extends y<? extends R>> H;
    
    public b0(final q0<? extends T> g, final o<? super T, ? extends y<? extends R>> h) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        this.G.c(new b<Object, Object>(v, this.H));
    }
    
    static final class a<R> implements v<R>
    {
        final AtomicReference<c> G;
        final v<? super R> H;
        
        a(final AtomicReference<c> g, final v<? super R> h) {
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
        public void f() {
            this.H.f();
        }
        
        @Override
        public void l(final c c) {
            d.f(this.G, c);
        }
    }
    
    static final class b<T, R> extends AtomicReference<c> implements n0<T>, c
    {
        private static final long I = -5843758257109742742L;
        final v<? super R> G;
        final o<? super T, ? extends y<? extends R>> H;
        
        b(final v<? super R> g, final o<? super T, ? extends y<? extends R>> h) {
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
                final y y = io.reactivex.internal.functions.b.g((y)this.H.apply((Object)t), "The mapper returned a null MaybeSource");
                if (!this.i()) {
                    y.c(new a(this, this.G));
                }
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
}
