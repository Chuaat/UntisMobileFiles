// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.v;
import io.reactivex.i;
import io.reactivex.y;
import io.reactivex.s;

public final class o<T> extends s<T>
{
    final y<T> G;
    final i H;
    
    public o(final y<T> g, final i h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.H.c(new b<Object>(v, this.G));
    }
    
    static final class a<T> implements v<T>
    {
        final AtomicReference<c> G;
        final v<? super T> H;
        
        a(final AtomicReference<c> g, final v<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.H.d((Object)t);
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
    
    static final class b<T> extends AtomicReference<c> implements f, c
    {
        private static final long I = 703409937383992161L;
        final v<? super T> G;
        final y<T> H;
        
        b(final v<? super T> g, final y<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            this.H.c(new a<Object>(this, this.G));
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
