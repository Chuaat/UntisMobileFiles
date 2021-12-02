// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.n0;
import io.reactivex.q0;
import io.reactivex.y;
import y5.f;
import io.reactivex.k0;

public final class g1<T> extends k0<T> implements f<T>
{
    final y<T> G;
    final q0<? extends T> H;
    
    public g1(final y<T> g, final q0<? extends T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    @Override
    public y<T> source() {
        return this.G;
    }
    
    static final class a<T> extends AtomicReference<c> implements v<T>, c
    {
        private static final long I = 4603919676453758899L;
        final n0<? super T> G;
        final q0<? extends T> H;
        
        a(final n0<? super T> g, final q0<? extends T> h) {
            this.G = g;
            this.H = h;
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
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            final c expectedValue = this.get();
            if (expectedValue != d.G && this.compareAndSet(expectedValue, null)) {
                this.H.c(new g1.a.a<Object>(this.G, this));
            }
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
        
        static final class a<T> implements n0<T>
        {
            final n0<? super T> G;
            final AtomicReference<c> H;
            
            a(final n0<? super T> g, final AtomicReference<c> h) {
                this.G = g;
                this.H = h;
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
            public void l(final c c) {
                d.j(this.H, c);
            }
        }
    }
}
