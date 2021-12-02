// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import java.util.Queue;
import rx.exceptions.d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayDeque;
import java.util.ArrayList;
import rx.i;
import rx.o;
import rx.n;
import java.util.List;
import rx.g;

public final class v1<T> implements g.b<List<T>, T>
{
    final int G;
    final int H;
    
    public v1(final int g, final int h) {
        if (g <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (h > 0) {
            this.G = g;
            this.H = h;
            return;
        }
        throw new IllegalArgumentException("skip must be greater than 0");
    }
    
    public n<? super T> a(final n<? super List<T>> n) {
        final int h = this.H;
        final int g = this.G;
        if (h == g) {
            final a a = new a<Object>((n<? super List<Object>>)n, g);
            n.r(a);
            n.s0(a.x());
            return (n<? super T>)a;
        }
        o o;
        i i;
        if (h > g) {
            o = new c<Object>((n<? super List<?>>)n, g, h);
            n.r(o);
            i = ((c)o).A();
        }
        else {
            o = new b<Object>((n<? super List<Object>>)n, g, h);
            n.r(o);
            i = ((b)o).A();
        }
        n.s0(i);
        return (n<? super T>)o;
    }
    
    static final class a<T> extends n<T>
    {
        final n<? super List<T>> L;
        final int M;
        List<T> N;
        
        public a(final n<? super List<T>> l, final int m) {
            this.L = l;
            this.M = m;
            this.v(0L);
        }
        
        @Override
        public void b(final Throwable t) {
            this.N = null;
            this.L.b(t);
        }
        
        @Override
        public void c() {
            final List<T> n = this.N;
            if (n != null) {
                this.L.m(n);
            }
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            List<T> n;
            if ((n = this.N) == null) {
                n = new ArrayList<T>(this.M);
                this.N = n;
            }
            n.add(t);
            if (n.size() == this.M) {
                this.N = null;
                this.L.m(n);
            }
        }
        
        i x() {
            return new i() {
                @Override
                public void v(long c) {
                    final long n = lcmp(c, 0L);
                    if (n >= 0) {
                        if (n != 0) {
                            c = rx.internal.operators.a.c(c, a.this.M);
                            rx.n.this.v(c);
                        }
                        return;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("n >= required but it was ");
                    sb.append(c);
                    throw new IllegalArgumentException(sb.toString());
                }
            };
        }
    }
    
    static final class b<T> extends n<T>
    {
        final n<? super List<T>> L;
        final int M;
        final int N;
        long O;
        final ArrayDeque<List<T>> P;
        final AtomicLong Q;
        long R;
        
        public b(final n<? super List<T>> l, final int m, final int n) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.P = new ArrayDeque<List<T>>();
            this.Q = new AtomicLong();
            this.v(0L);
        }
        
        i A() {
            return new a();
        }
        
        @Override
        public void b(final Throwable t) {
            this.P.clear();
            this.L.b(t);
        }
        
        @Override
        public void c() {
            final long r = this.R;
            if (r != 0L) {
                if (r > this.Q.get()) {
                    final n<? super List<T>> l = this.L;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("More produced than requested? ");
                    sb.append(r);
                    l.b(new d(sb.toString()));
                    return;
                }
                this.Q.addAndGet(-r);
            }
            rx.internal.operators.a.d(this.Q, this.P, this.L);
        }
        
        @Override
        public void m(final T t) {
            final long o = this.O;
            if (o == 0L) {
                this.P.offer(new ArrayList<T>(this.M));
            }
            final long o2 = o + 1L;
            if (o2 == this.N) {
                this.O = 0L;
            }
            else {
                this.O = o2;
            }
            final Iterator<List<T>> iterator = this.P.iterator();
            while (iterator.hasNext()) {
                iterator.next().add(t);
            }
            final List<T> list = this.P.peek();
            if (list != null && list.size() == this.M) {
                this.P.poll();
                ++this.R;
                this.L.m((Object)list);
            }
        }
        
        final class a extends AtomicBoolean implements i
        {
            private static final long H = -4015894850868853147L;
            
            @Override
            public void v(final long n) {
                final b g = b.this;
                if (rx.internal.operators.a.g(g.Q, n, g.P, g.L) && n != 0L) {
                    if (!this.get() && this.compareAndSet(false, true)) {
                        g.v(rx.internal.operators.a.a(rx.internal.operators.a.c(g.N, n - 1L), g.M));
                    }
                    else {
                        g.v(rx.internal.operators.a.c(g.N, n));
                    }
                }
            }
        }
    }
    
    static final class c<T> extends n<T>
    {
        final n<? super List<T>> L;
        final int M;
        final int N;
        long O;
        List<T> P;
        
        public c(final n<? super List<T>> l, final int m, final int n) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.v(0L);
        }
        
        i A() {
            return new a();
        }
        
        @Override
        public void b(final Throwable t) {
            this.P = null;
            this.L.b(t);
        }
        
        @Override
        public void c() {
            final List<T> p = this.P;
            if (p != null) {
                this.P = null;
                this.L.m(p);
            }
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            final long o = this.O;
            List<T> p = this.P;
            if (o == 0L) {
                p = new ArrayList<T>(this.M);
                this.P = p;
            }
            final long o2 = o + 1L;
            if (o2 == this.N) {
                this.O = 0L;
            }
            else {
                this.O = o2;
            }
            if (p != null) {
                p.add(t);
                if (p.size() == this.M) {
                    this.P = null;
                    this.L.m(p);
                }
            }
        }
        
        final class a extends AtomicBoolean implements i
        {
            private static final long H = 3428177408082367154L;
            
            @Override
            public void v(final long lng) {
                final long n = lcmp(lng, 0L);
                if (n >= 0) {
                    if (n != 0) {
                        final c g = c.this;
                        if (!this.get() && this.compareAndSet(false, true)) {
                            g.v(rx.internal.operators.a.a(rx.internal.operators.a.c(lng, g.M), rx.internal.operators.a.c(g.N - g.M, lng - 1L)));
                        }
                        else {
                            g.v(rx.internal.operators.a.c(lng, g.N));
                        }
                    }
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("n >= 0 required but it was ");
                sb.append(lng);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
