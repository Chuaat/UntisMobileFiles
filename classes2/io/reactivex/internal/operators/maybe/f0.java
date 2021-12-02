// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import java.util.NoSuchElementException;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.n0;
import io.reactivex.q0;
import x5.o;
import io.reactivex.y;
import io.reactivex.k0;

public final class f0<T, R> extends k0<R>
{
    final y<T> G;
    final o<? super T, ? extends q0<? extends R>> H;
    
    public f0(final y<T> g, final o<? super T, ? extends q0<? extends R>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        this.G.c(new a<Object, Object>(n0, this.H));
    }
    
    static final class a<T, R> extends AtomicReference<c> implements v<T>, c
    {
        private static final long I = 4827726964688405508L;
        final n0<? super R> G;
        final o<? super T, ? extends q0<? extends R>> H;
        
        a(final n0<? super R> g, final o<? super T, ? extends q0<? extends R>> h) {
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
                final q0 q0 = io.reactivex.internal.functions.b.g((q0)this.H.apply((Object)t), "The mapper returned a null SingleSource");
                if (!this.i()) {
                    q0.c(new b(this, this.G));
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
        public void f() {
            this.G.b(new NoSuchElementException());
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
        final n0<? super R> H;
        
        b(final AtomicReference<c> g, final n0<? super R> h) {
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
