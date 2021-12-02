// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.l;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class r3<T, U> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final g0<? extends U> H;
    
    public r3(final g0<T> g0, final g0<? extends U> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        final a<Object, Object> a = new a<Object, Object>((i0<? super Object>)i0);
        i0.l(a);
        this.H.c((i0<? super U>)a.I);
        super.G.c(a);
    }
    
    static final class a<T, U> extends AtomicInteger implements i0<T>, c
    {
        private static final long K = 1418547743690811973L;
        final i0<? super T> G;
        final AtomicReference<c> H;
        final r3.a.a I;
        final io.reactivex.internal.util.c J;
        
        a(final i0<? super T> g) {
            this.G = g;
            this.H = new AtomicReference<c>();
            this.I = new r3.a.a();
            this.J = new io.reactivex.internal.util.c();
        }
        
        void a() {
            d.b(this.H);
            l.a(this.G, this, this.J);
        }
        
        @Override
        public void b(final Throwable t) {
            d.b(this.I);
            l.c(this.G, t, this, this.J);
        }
        
        void c(final Throwable t) {
            d.b(this.H);
            l.c(this.G, t, this, this.J);
        }
        
        @Override
        public void dispose() {
            d.b(this.H);
            d.b(this.I);
        }
        
        @Override
        public void f() {
            d.b(this.I);
            l.a(this.G, this, this.J);
        }
        
        @Override
        public boolean i() {
            return d.d(this.H.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this.H, c);
        }
        
        @Override
        public void m(final T t) {
            l.e(this.G, t, this, this.J);
        }
        
        final class a extends AtomicReference<c> implements i0<U>
        {
            private static final long H = -8693423678067375039L;
            
            @Override
            public void b(final Throwable t) {
                r3.a.this.c(t);
            }
            
            @Override
            public void f() {
                r3.a.this.a();
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
            
            @Override
            public void m(final U u) {
                d.b(this);
                r3.a.this.a();
            }
        }
    }
}
