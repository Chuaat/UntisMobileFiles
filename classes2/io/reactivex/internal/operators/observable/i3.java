// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;

public final class i3<T, U> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final g0<U> H;
    
    public i3(final g0<T> g0, final g0<U> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        final m<T> m = (m<T>)new m<Object>((i0<? super T>)i0);
        final io.reactivex.internal.disposables.a a = new io.reactivex.internal.disposables.a(2);
        m.l(a);
        final b b = new b((i0<? super Object>)m, a);
        this.H.c(new a(a, (b<T>)b, m));
        super.G.c(b);
    }
    
    final class a implements i0<U>
    {
        final io.reactivex.internal.disposables.a G;
        final b<T> H;
        final m<T> I;
        c J;
        
        a(final io.reactivex.internal.disposables.a g, final b<T> h, final m<T> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.dispose();
            this.I.b(t);
        }
        
        @Override
        public void f() {
            this.H.J = true;
        }
        
        @Override
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.b(1, j);
            }
        }
        
        @Override
        public void m(final U u) {
            this.J.dispose();
            this.H.J = true;
        }
    }
    
    static final class b<T> implements i0<T>
    {
        final i0<? super T> G;
        final io.reactivex.internal.disposables.a H;
        c I;
        volatile boolean J;
        boolean K;
        
        b(final i0<? super T> g, final io.reactivex.internal.disposables.a h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.dispose();
            this.G.b(t);
        }
        
        @Override
        public void f() {
            this.H.dispose();
            this.G.f();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.H.b(0, i);
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.K) {
                if (!this.J) {
                    return;
                }
                this.K = true;
            }
            this.G.m((Object)t);
        }
    }
}
