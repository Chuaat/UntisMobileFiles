// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayDeque;
import rx.subjects.f;
import rx.o;
import java.util.concurrent.atomic.AtomicInteger;
import rx.i;
import rx.functions.a;
import rx.n;
import rx.g;

public final class e4<T> implements g.b<g<T>, T>
{
    final int G;
    final int H;
    
    public e4(final int g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public n<? super T> a(final n<? super g<T>> n) {
        final int h = this.H;
        final int g = this.G;
        if (h == g) {
            final a a = new a<Object>((n<? super g<Object>>)n, g);
            n.r(a.O);
            n.s0(a.x());
            return (n<? super T>)a;
        }
        rx.functions.a a2;
        i i;
        if (h > g) {
            a2 = new c<Object>((n<? super g<?>>)n, g, h);
            n.r(((c)a2).P);
            i = ((c)a2).A();
        }
        else {
            a2 = new b((n<? super g<Object>>)n, g, h);
            n.r(((b)a2).P);
            i = ((b)a2).C();
        }
        n.s0(i);
        return (n<? super T>)a2;
    }
    
    static final class a<T> extends n<T> implements rx.functions.a
    {
        final n<? super g<T>> L;
        final int M;
        final AtomicInteger N;
        final o O;
        int P;
        f<T, T> Q;
        
        public a(final n<? super g<T>> l, final int m) {
            this.L = l;
            this.M = m;
            this.N = new AtomicInteger(1);
            this.r(this.O = rx.subscriptions.f.a(this));
            this.v(0L);
        }
        
        @Override
        public void b(final Throwable t) {
            final f<T, T> q = this.Q;
            if (q != null) {
                this.Q = null;
                q.b(t);
            }
            this.L.b(t);
        }
        
        @Override
        public void c() {
            final f<T, T> q = this.Q;
            if (q != null) {
                this.Q = null;
                q.c();
            }
            this.L.c();
        }
        
        @Override
        public void call() {
            if (this.N.decrementAndGet() == 0) {
                this.i();
            }
        }
        
        @Override
        public void m(final T t) {
            int p = this.P;
            g<R> q = this.Q;
            if (p == 0) {
                this.N.getAndIncrement();
                q = rx.subjects.i.I7(this.M, this);
                this.Q = (f<T, T>)q;
                this.L.m((Object)q);
            }
            ++p;
            ((h<T>)q).m(t);
            if (p == this.M) {
                this.P = 0;
                this.Q = null;
                ((h)q).c();
            }
            else {
                this.P = p;
            }
        }
        
        i x() {
            return new i() {
                @Override
                public void v(long c) {
                    final long n = lcmp(c, 0L);
                    if (n >= 0) {
                        if (n != 0) {
                            c = rx.internal.operators.a.c(a.this.M, c);
                            rx.n.this.v(c);
                        }
                        return;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("n >= 0 required but it was ");
                    sb.append(c);
                    throw new IllegalArgumentException(sb.toString());
                }
            };
        }
    }
    
    static final class b<T> extends n<T> implements rx.functions.a
    {
        final n<? super g<T>> L;
        final int M;
        final int N;
        final AtomicInteger O;
        final o P;
        final ArrayDeque<f<T, T>> Q;
        final AtomicLong R;
        final AtomicInteger S;
        final Queue<f<T, T>> T;
        Throwable U;
        volatile boolean V;
        int W;
        int X;
        
        public b(final n<? super g<T>> l, final int m, final int n) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = new AtomicInteger(1);
            this.Q = new ArrayDeque<f<T, T>>();
            this.S = new AtomicInteger();
            this.R = new AtomicLong();
            this.r(this.P = rx.subscriptions.f.a(this));
            this.v(0L);
            this.T = new rx.internal.util.atomic.g<f<T, T>>((m + (n - 1)) / n);
        }
        
        boolean A(final boolean b, final boolean b2, final n<? super f<T, T>> n, final Queue<f<T, T>> queue) {
            if (n.g()) {
                queue.clear();
                return true;
            }
            if (b) {
                final Throwable u = this.U;
                if (u != null) {
                    queue.clear();
                    n.b(u);
                    return true;
                }
                if (b2) {
                    n.c();
                    return true;
                }
            }
            return false;
        }
        
        i C() {
            return new a();
        }
        
        void D() {
            final AtomicInteger s = this.S;
            if (s.getAndIncrement() != 0) {
                return;
            }
            final n<? super g<T>> l = this.L;
            final Queue<f<T, T>> t = this.T;
            int addAndGet = 1;
            do {
                final long value = this.R.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    final boolean v = this.V;
                    final f<T, T> f = t.poll();
                    final boolean b = f == null;
                    if (this.A(v, b, (n<? super f<T, T>>)l, t)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    l.m(f);
                    ++n;
                }
                if (n2 == 0 && this.A(this.V, t.isEmpty(), (n<? super f<T, T>>)l, t)) {
                    return;
                }
                if (n == 0L || value == Long.MAX_VALUE) {
                    continue;
                }
                this.R.addAndGet(-n);
            } while ((addAndGet = s.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void b(final Throwable u) {
            final Iterator<f<T, T>> iterator = this.Q.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(u);
            }
            this.Q.clear();
            this.U = u;
            this.V = true;
            this.D();
        }
        
        @Override
        public void c() {
            final Iterator<f<T, T>> iterator = this.Q.iterator();
            while (iterator.hasNext()) {
                iterator.next().c();
            }
            this.Q.clear();
            this.V = true;
            this.D();
        }
        
        @Override
        public void call() {
            if (this.O.decrementAndGet() == 0) {
                this.i();
            }
        }
        
        @Override
        public void m(final T t) {
            int w = this.W;
            final ArrayDeque<f<T, T>> q = this.Q;
            if (w == 0 && !this.L.g()) {
                this.O.getAndIncrement();
                final rx.subjects.i<Object> i7 = rx.subjects.i.I7(16, this);
                q.offer((f<T, T>)i7);
                this.T.offer((f<T, T>)i7);
                this.D();
            }
            final Iterator<f<T, T>> iterator = this.Q.iterator();
            while (iterator.hasNext()) {
                iterator.next().m(t);
            }
            final int x = this.X + 1;
            if (x == this.M) {
                this.X = x - this.N;
                final rx.subjects.i j = (rx.subjects.i)q.poll();
                if (j != null) {
                    j.c();
                }
            }
            else {
                this.X = x;
            }
            if (++w == this.N) {
                this.W = 0;
            }
            else {
                this.W = w;
            }
        }
        
        final class a extends AtomicBoolean implements i
        {
            private static final long H = 4625807964358024108L;
            
            @Override
            public void v(final long lng) {
                final long n = lcmp(lng, 0L);
                if (n >= 0) {
                    if (n != 0) {
                        final b g = b.this;
                        if (!this.get() && this.compareAndSet(false, true)) {
                            g.v(rx.internal.operators.a.a(rx.internal.operators.a.c(g.N, lng - 1L), g.M));
                        }
                        else {
                            rx.n.this.v(rx.internal.operators.a.c(g.N, lng));
                        }
                        rx.internal.operators.a.b(g.R, lng);
                        g.D();
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
    
    static final class c<T> extends n<T> implements rx.functions.a
    {
        final n<? super g<T>> L;
        final int M;
        final int N;
        final AtomicInteger O;
        final o P;
        int Q;
        f<T, T> R;
        
        public c(final n<? super g<T>> l, final int m, final int n) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = new AtomicInteger(1);
            this.r(this.P = rx.subscriptions.f.a(this));
            this.v(0L);
        }
        
        i A() {
            return new a();
        }
        
        @Override
        public void b(final Throwable t) {
            final f<T, T> r = this.R;
            if (r != null) {
                this.R = null;
                r.b(t);
            }
            this.L.b(t);
        }
        
        @Override
        public void c() {
            final f<T, T> r = this.R;
            if (r != null) {
                this.R = null;
                r.c();
            }
            this.L.c();
        }
        
        @Override
        public void call() {
            if (this.O.decrementAndGet() == 0) {
                this.i();
            }
        }
        
        @Override
        public void m(final T t) {
            int q = this.Q;
            g<R> r = this.R;
            if (q == 0) {
                this.O.getAndIncrement();
                r = rx.subjects.i.I7(this.M, this);
                this.R = (f<T, T>)r;
                this.L.m((Object)r);
            }
            ++q;
            if (r != null) {
                ((h<T>)r).m(t);
            }
            if (q == this.M) {
                this.Q = q;
                this.R = null;
                ((h)r).c();
            }
            else if (q == this.N) {
                this.Q = 0;
            }
            else {
                this.Q = q;
            }
        }
        
        final class a extends AtomicBoolean implements i
        {
            private static final long H = 4625807964358024108L;
            
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
