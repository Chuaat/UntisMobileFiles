// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.disposables.d;
import io.reactivex.subjects.j;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;

public final class e4<T> extends io.reactivex.internal.operators.observable.a<T, b0<T>>
{
    final long H;
    final long I;
    final int J;
    
    public e4(final g0<T> g0, final long h, final long i, final int j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super b0<T>> i0) {
        final long h = this.H;
        final long j = this.I;
        final g0<T> g = (g0<T>)super.G;
        if (h == j) {
            g.c(new a<Object>((i0<? super b0<? super T>>)i0, this.H, this.J));
        }
        else {
            g.c(new b<Object>((i0<? super b0<? super T>>)i0, this.H, this.I, this.J));
        }
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>, c, Runnable
    {
        private static final long N = -7481782523886138128L;
        final i0<? super b0<T>> G;
        final long H;
        final int I;
        long J;
        c K;
        j<T> L;
        volatile boolean M;
        
        a(final i0<? super b0<T>> g, final long h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            final j<T> l = this.L;
            if (l != null) {
                this.L = null;
                l.b(t);
            }
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.M = true;
        }
        
        @Override
        public void f() {
            final j<T> l = this.L;
            if (l != null) {
                this.L = null;
                l.f();
            }
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.M;
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            j<T> l;
            final j<T> j = l = this.L;
            if (j == null) {
                l = j;
                if (!this.M) {
                    l = io.reactivex.subjects.j.s8(this.I, this);
                    this.L = l;
                    this.G.m(l);
                }
            }
            if (l != null) {
                l.m(t);
                final long i = this.J + 1L;
                this.J = i;
                if (i >= this.H) {
                    this.J = 0L;
                    this.L = null;
                    l.f();
                    if (this.M) {
                        this.K.dispose();
                    }
                }
            }
        }
        
        @Override
        public void run() {
            if (this.M) {
                this.K.dispose();
            }
        }
    }
    
    static final class b<T> extends AtomicBoolean implements i0<T>, c, Runnable
    {
        private static final long Q = 3366976432059579510L;
        final i0<? super b0<T>> G;
        final long H;
        final long I;
        final int J;
        final ArrayDeque<j<T>> K;
        long L;
        volatile boolean M;
        long N;
        c O;
        final AtomicInteger P;
        
        b(final i0<? super b0<T>> g, final long h, final long i, final int j) {
            this.P = new AtomicInteger();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = new ArrayDeque<j<T>>();
        }
        
        @Override
        public void b(final Throwable t) {
            final ArrayDeque<j<T>> k = this.K;
            while (!k.isEmpty()) {
                k.poll().b(t);
            }
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.M = true;
        }
        
        @Override
        public void f() {
            final ArrayDeque<j<T>> k = this.K;
            while (!k.isEmpty()) {
                k.poll().f();
            }
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.M;
        }
        
        @Override
        public void l(final c o) {
            if (d.l(this.O, o)) {
                this.O = o;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final ArrayDeque<j<T>> k = this.K;
            final long l = this.L;
            final long i = this.I;
            if (l % i == 0L && !this.M) {
                this.P.getAndIncrement();
                final j<T> s8 = j.s8(this.J, this);
                k.offer(s8);
                this.G.m(s8);
            }
            final long n = this.N + 1L;
            final Iterator<j<T>> iterator = k.iterator();
            while (iterator.hasNext()) {
                iterator.next().m(t);
            }
            long n2 = n;
            if (n >= this.H) {
                k.poll().f();
                if (k.isEmpty() && this.M) {
                    this.O.dispose();
                    return;
                }
                n2 = n - i;
            }
            this.N = n2;
            this.L = l + 1L;
        }
        
        @Override
        public void run() {
            if (this.P.decrementAndGet() == 0 && this.M) {
                this.O.dispose();
            }
        }
    }
}
