// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.a;
import rx.o;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class d3<T> implements b<T, T>
{
    final long G;
    final TimeUnit H;
    final j I;
    
    public d3(final long g, final TimeUnit h, final j i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final rx.observers.g<Object> g = new rx.observers.g<Object>((n<? super Object>)n);
        final j.a a = this.I.a();
        n.r(a);
        final a a2 = new a<Object>(g);
        n.r(a2);
        final long g2 = this.G;
        a.e(a2, g2, g2, this.H);
        return (n<? super T>)a2;
    }
    
    static final class a<T> extends n<T> implements rx.functions.a
    {
        private static final Object N;
        private final n<? super T> L;
        final AtomicReference<Object> M;
        
        static {
            N = new Object();
        }
        
        public a(final n<? super T> l) {
            this.M = new AtomicReference<Object>(a.N);
            this.L = l;
        }
        
        private void w() {
            final AtomicReference<Object> m = this.M;
            final Object n = a.N;
            final Object andSet = m.getAndSet(n);
            if (andSet != n) {
                try {
                    this.L.m((Object)andSet);
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.f(t, this);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
            this.i();
        }
        
        @Override
        public void c() {
            this.w();
            this.L.c();
            this.i();
        }
        
        @Override
        public void call() {
            this.w();
        }
        
        @Override
        public void f() {
            this.v(Long.MAX_VALUE);
        }
        
        @Override
        public void m(final T newValue) {
            this.M.set(newValue);
        }
    }
}
