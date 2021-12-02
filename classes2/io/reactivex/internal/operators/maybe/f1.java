// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.y;

public final class f1<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final y<? extends T> H;
    
    public f1(final y<T> y, final y<? extends T> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, (y<? extends T>)this.H));
    }
    
    static final class a<T> extends AtomicReference<c> implements v<T>, c
    {
        private static final long I = -2223459372976438024L;
        final v<? super T> G;
        final y<? extends T> H;
        
        a(final v<? super T> g, final y<? extends T> h) {
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
                this.H.c(new f1.a.a<Object>(this.G, this));
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
        
        static final class a<T> implements v<T>
        {
            final v<? super T> G;
            final AtomicReference<c> H;
            
            a(final v<? super T> g, final AtomicReference<c> h) {
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
            public void f() {
                this.G.f();
            }
            
            @Override
            public void l(final c c) {
                d.j(this.H, c);
            }
        }
    }
}
