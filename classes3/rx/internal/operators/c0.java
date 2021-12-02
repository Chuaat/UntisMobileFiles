// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.d;
import rx.plugins.c;
import rx.internal.util.f;
import rx.internal.util.unsafe.z;
import rx.internal.util.unsafe.n0;
import rx.subscriptions.e;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Queue;
import rx.internal.producers.a;
import rx.i;
import rx.o;
import rx.n;
import rx.functions.p;
import rx.g;

public final class c0<T, R> implements a<R>
{
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    final g<? extends T> G;
    final p<? super T, ? extends g<? extends R>> H;
    final int I;
    final int J;
    
    public c0(final g<? extends T> g, final p<? super T, ? extends g<? extends R>> h, final int i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void a(final n<? super R> n) {
        rx.observers.g g;
        if (this.J == 0) {
            g = new rx.observers.g<Object>((n<? super Object>)n);
        }
        else {
            g = (rx.observers.g)n;
        }
        final d d = new d<Object, Object>(g, (p<? super Object, ? extends g<?>>)this.H, this.I, this.J);
        n.r(d);
        n.r(d.S);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                d.G(n);
            }
        });
        if (!n.g()) {
            this.G.R6((n<? super T>)d);
        }
    }
    
    static final class b<T, R> implements i
    {
        final R G;
        final d<T, R> H;
        boolean I;
        
        public b(final R g, final d<T, R> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void v(final long n) {
            if (!this.I && n > 0L) {
                this.I = true;
                final d<T, R> h = this.H;
                h.D(this.G);
                h.A(1L);
            }
        }
    }
    
    static final class c<T, R> extends n<R>
    {
        final d<T, R> L;
        long M;
        
        public c(final d<T, R> l) {
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.C(t, this.M);
        }
        
        @Override
        public void c() {
            this.L.A(this.M);
        }
        
        @Override
        public void m(final R r) {
            ++this.M;
            this.L.D(r);
        }
        
        @Override
        public void s0(final i i) {
            this.L.O.c(i);
        }
    }
    
    static final class d<T, R> extends n<T>
    {
        final n<? super R> L;
        final p<? super T, ? extends g<? extends R>> M;
        final int N;
        final rx.internal.producers.a O;
        final Queue<Object> P;
        final AtomicInteger Q;
        final AtomicReference<Throwable> R;
        final e S;
        volatile boolean T;
        volatile boolean U;
        
        public d(final n<? super R> l, final p<? super T, ? extends g<? extends R>> m, final int n, final int n2) {
            this.L = l;
            this.M = m;
            this.N = n2;
            this.O = new rx.internal.producers.a();
            this.Q = new AtomicInteger();
            this.R = new AtomicReference<Throwable>();
            Object p4;
            if (n0.f()) {
                p4 = new rx.internal.util.unsafe.z<Object>(n);
            }
            else {
                p4 = new rx.internal.util.atomic.e<Object>(n);
            }
            this.P = (Queue<Object>)p4;
            this.S = new e();
            this.v(n);
        }
        
        void A(final long n) {
            if (n != 0L) {
                this.O.b(n);
            }
            this.U = false;
            this.w();
        }
        
        void C(Throwable g, final long n) {
            if (!f.b(this.R, g)) {
                this.F(g);
            }
            else if (this.N == 0) {
                g = f.g(this.R);
                if (!f.d(g)) {
                    this.L.b(g);
                }
                this.i();
            }
            else {
                if (n != 0L) {
                    this.O.b(n);
                }
                this.U = false;
                this.w();
            }
        }
        
        void D(final R r) {
            this.L.m((Object)r);
        }
        
        void F(final Throwable t) {
            rx.plugins.c.I(t);
        }
        
        void G(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n > 0) {
                this.O.v(lng);
            }
            else if (n < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("n >= 0 required but it was ");
                sb.append(lng);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        
        @Override
        public void b(Throwable g) {
            if (f.b(this.R, g)) {
                this.T = true;
                if (this.N == 0) {
                    g = f.g(this.R);
                    if (!f.d(g)) {
                        this.L.b(g);
                    }
                    this.S.i();
                }
                else {
                    this.w();
                }
            }
            else {
                this.F(g);
            }
        }
        
        @Override
        public void c() {
            this.T = true;
            this.w();
        }
        
        @Override
        public void m(final T t) {
            if (!this.P.offer(x.j(t))) {
                this.i();
                this.b(new rx.exceptions.d());
            }
            else {
                this.w();
            }
        }
        
        void w() {
            if (this.Q.getAndIncrement() != 0) {
                return;
            }
            final int n = this.N;
        Label_0190_Outer:
            while (!this.L.g()) {
                if (!this.U) {
                    if (n == 1 && this.R.get() != null) {
                        final Throwable g = f.g(this.R);
                        if (!f.d(g)) {
                            this.L.b(g);
                        }
                        return;
                    }
                    final boolean t = this.T;
                    final Object poll = this.P.poll();
                    final boolean b = poll == null;
                    if (t && b) {
                        final Throwable g2 = f.g(this.R);
                        if (g2 == null) {
                            this.L.c();
                        }
                        else if (!f.d(g2)) {
                            this.L.b(g2);
                        }
                        return;
                    }
                    if (!b) {
                        while (true) {
                            try {
                                final g g3 = (g)this.M.h(x.e(poll));
                                if (g3 == null) {
                                    final NullPointerException ex = new NullPointerException("The source returned by the mapper was null");
                                    this.x(ex);
                                    return;
                                }
                                if (g3 == g.a2()) {
                                    this.v(1L);
                                    continue Label_0190_Outer;
                                }
                                if (g3 instanceof rx.internal.util.o) {
                                    final rx.internal.util.o<Object> o = (rx.internal.util.o<Object>)g3;
                                    this.U = true;
                                    this.O.c(new b<Object, Object>(o.G7(), (d<Object, Object>)this));
                                }
                                else {
                                    final c c = new c((d)this);
                                    this.S.b(c);
                                    if (c.g()) {
                                        return;
                                    }
                                    this.U = true;
                                    g3.R6(c);
                                }
                                this.v(1L);
                            }
                            finally {
                                final NullPointerException ex;
                                rx.exceptions.c.e(ex);
                                continue;
                            }
                            break;
                        }
                    }
                }
                if (this.Q.decrementAndGet() == 0) {
                    return;
                }
            }
        }
        
        void x(Throwable g) {
            this.i();
            if (f.b(this.R, g)) {
                g = f.g(this.R);
                if (!f.d(g)) {
                    this.L.b(g);
                }
            }
            else {
                this.F(g);
            }
        }
    }
}
