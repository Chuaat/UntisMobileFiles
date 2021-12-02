// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class f3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    
    public f3(final g0<T> g0, final long h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        long H;
        c I;
        
        a(final i0<? super T> g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
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
            final long h = this.H;
            if (h != 0L) {
                this.H = h - 1L;
            }
            else {
                this.G.m((Object)t);
            }
        }
    }
}
