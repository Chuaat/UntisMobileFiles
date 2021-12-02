// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;

public final class c4<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final j0 H;
    
    public c4(final g0<T> g0, final j0 h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H));
    }
    
    static final class a<T> extends AtomicBoolean implements i0<T>, c
    {
        private static final long J = 1015244841293359600L;
        final i0<? super T> G;
        final j0 H;
        c I;
        
        a(final i0<? super T> g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.get()) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            if (this.compareAndSet(false, true)) {
                this.H.e(new c4.a.a());
            }
        }
        
        @Override
        public void f() {
            if (!this.get()) {
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.get();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.get()) {
                this.G.m((Object)t);
            }
        }
        
        final class a implements Runnable
        {
            @Override
            public void run() {
                c4.a.this.I.dispose();
            }
        }
    }
}
