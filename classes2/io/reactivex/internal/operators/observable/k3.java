// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;

public final class k3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final j0 H;
    
    public k3(final g0<T> g0, final j0 h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        final a a = new a(i0);
        i0.l(a);
        a.a(this.H.e(new b((a<T>)a)));
    }
    
    static final class a<T> extends AtomicReference<c> implements i0<T>, c
    {
        private static final long I = 8094547886072529208L;
        final i0<? super T> G;
        final AtomicReference<c> H;
        
        a(final i0<? super T> g) {
            this.G = g;
            this.H = new AtomicReference<c>();
        }
        
        void a(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            d.b(this.H);
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
            d.j(this.H, c);
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
    }
    
    final class b implements Runnable
    {
        private final a<T> G;
        
        b(final a<T> g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            k3.this.G.c((i0<? super T>)this.G);
        }
    }
}
