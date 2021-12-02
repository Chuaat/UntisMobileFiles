// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.plugins.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.Iterator;
import rx.o;
import java.util.Arrays;
import rx.n;
import rx.functions.y;
import rx.g;

public final class i4<T, R> implements g.a<R>
{
    final g<T> G;
    final g<?>[] H;
    final Iterable<g<?>> I;
    final y<R> J;
    
    public i4(final g<T> g, final g<?>[] h, final Iterable<g<?>> i, final y<R> j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void a(final n<? super R> n) {
        final rx.observers.g g = new rx.observers.g(n);
        g<?>[] h = this.H;
        int i = 0;
        int length;
        if (h != null) {
            length = h.length;
        }
        else {
            h = (g<?>[])new g[8];
            final Iterator<g<?>> iterator = this.I.iterator();
            length = 0;
            while (iterator.hasNext()) {
                final g<?> g2 = iterator.next();
                g<?>[] array = h;
                if (length == h.length) {
                    array = Arrays.copyOf(h, (length >> 2) + length);
                }
                array[length] = g2;
                ++length;
                h = array;
            }
        }
        final a a = new a((n<? super Object>)n, (y<Object>)this.J, length);
        g.r(a);
        while (i < length) {
            if (g.g()) {
                return;
            }
            final int n2 = i + 1;
            final b b = new b((a<?, ?>)a, n2);
            a.r(b);
            h[i].R6(b);
            i = n2;
        }
        this.G.R6((n<? super T>)a);
    }
    
    static final class a<T, R> extends n<T>
    {
        static final Object Q;
        final n<? super R> L;
        final y<R> M;
        final AtomicReferenceArray<Object> N;
        final AtomicInteger O;
        boolean P;
        
        static {
            Q = new Object();
        }
        
        public a(final n<? super R> l, final y<R> m, final int initialValue) {
            this.L = l;
            this.M = m;
            final AtomicReferenceArray<Object> n = new AtomicReferenceArray<Object>(initialValue + 1);
            for (int i = 0; i <= initialValue; ++i) {
                n.lazySet(i, a.Q);
            }
            this.N = n;
            this.O = new AtomicInteger(initialValue);
            this.v(0L);
        }
        
        void A(final int i, final Object newValue) {
            if (this.N.getAndSet(i, newValue) == a.Q) {
                this.O.decrementAndGet();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.P) {
                rx.plugins.c.I(t);
                return;
            }
            this.P = true;
            this.i();
            this.L.b(t);
        }
        
        @Override
        public void c() {
            if (this.P) {
                return;
            }
            this.P = true;
            this.i();
            this.L.c();
        }
        
        @Override
        public void m(final T newValue) {
            if (this.P) {
                return;
            }
            if (this.O.get() == 0) {
                final AtomicReferenceArray<Object> n = this.N;
                final int length = n.length();
                int i = 0;
                n.lazySet(0, newValue);
                final Object[] array = new Object[n.length()];
                while (i < length) {
                    array[i] = n.get(i);
                    ++i;
                }
                try {
                    this.L.m((Object)this.M.call(array));
                    return;
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.e(t);
                    this.b(t);
                    return;
                }
            }
            this.v(1L);
        }
        
        @Override
        public void s0(final i i) {
            super.s0(i);
            this.L.s0(i);
        }
        
        void w(final int i) {
            if (this.N.get(i) == a.Q) {
                this.c();
            }
        }
        
        void x(final int n, final Throwable t) {
            this.b(t);
        }
    }
    
    static final class b extends n<Object>
    {
        final a<?, ?> L;
        final int M;
        
        public b(final a<?, ?> l, final int m) {
            this.L = l;
            this.M = m;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.x(this.M, t);
        }
        
        @Override
        public void c() {
            this.L.w(this.M);
        }
        
        @Override
        public void m(final Object o) {
            this.L.A(this.M, o);
        }
    }
}
