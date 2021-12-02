// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import rx.h;
import rx.exceptions.c;
import rx.o;
import rx.subscriptions.f;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import rx.i;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.util.atomic.e;
import rx.internal.util.unsafe.z;
import rx.internal.util.unsafe.n0;
import java.util.Queue;
import rx.n;
import rx.functions.p;
import rx.g;

public final class k2<T, R> implements g.b<R, T>
{
    final p<? super T, ? extends g<? extends R>> G;
    final int H;
    private final int I;
    
    public k2(final p<? super T, ? extends g<? extends R>> g, final int h, final int i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public n<? super T> a(final n<? super R> n) {
        final c c = new c(this.G, this.H, this.I, n);
        c.A();
        return (n<? super T>)c;
    }
    
    static final class a<T> extends n<T>
    {
        final c<?, T> L;
        final Queue<Object> M;
        volatile boolean N;
        Throwable O;
        
        public a(final c<?, T> l, final int n) {
            this.L = l;
            Object m;
            if (n0.f()) {
                m = new rx.internal.util.unsafe.z<Object>(n);
            }
            else {
                m = new e<Object>(n);
            }
            this.M = (Queue<Object>)m;
            this.v(n);
        }
        
        @Override
        public void b(final Throwable o) {
            this.O = o;
            this.N = true;
            this.L.x();
        }
        
        @Override
        public void c() {
            this.N = true;
            this.L.x();
        }
        
        @Override
        public void m(final T t) {
            this.M.offer(x.j(t));
            this.L.x();
        }
        
        void w(final long n) {
            this.v(n);
        }
    }
    
    static final class b extends AtomicLong implements i
    {
        private static final long H = -657299606803478389L;
        final c<?, ?> G;
        
        public b(final c<?, ?> g) {
            this.G = g;
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n > 0) {
                    rx.internal.operators.a.b(this, lng);
                    this.G.x();
                }
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    static final class c<T, R> extends n<T>
    {
        final p<? super T, ? extends g<? extends R>> L;
        final int M;
        final n<? super R> N;
        final Queue<a<R>> O;
        volatile boolean P;
        Throwable Q;
        volatile boolean R;
        final AtomicInteger S;
        private b T;
        
        public c(final p<? super T, ? extends g<? extends R>> l, final int m, final int n, final n<? super R> n2) {
            this.L = l;
            this.M = m;
            this.N = n2;
            this.O = new LinkedList<a<R>>();
            this.S = new AtomicInteger();
            long n3;
            if (n == Integer.MAX_VALUE) {
                n3 = Long.MAX_VALUE;
            }
            else {
                n3 = n;
            }
            this.v(n3);
        }
        
        void A() {
            this.T = new b((c<?, ?>)this);
            this.r(f.a(new rx.functions.a() {
                @Override
                public void call() {
                    c.this.R = true;
                    if (c.this.S.getAndIncrement() == 0) {
                        c.this.w();
                    }
                }
            }));
            this.N.r(this);
            this.N.s0(this.T);
        }
        
        @Override
        public void b(final Throwable q) {
            this.Q = q;
            this.P = true;
            this.x();
        }
        
        @Override
        public void c() {
            this.P = true;
            this.x();
        }
        
        @Override
        public void m(final T t) {
            try {
                final g g = (g)this.L.h((Object)t);
                if (this.R) {
                    return;
                }
                final a a = new a((c<?, Object>)this, this.M);
                synchronized (this.O) {
                    if (this.R) {
                        return;
                    }
                    this.O.add((a<R>)a);
                    // monitorexit(this.O)
                    if (this.R) {
                        return;
                    }
                    g.R6(a);
                    this.x();
                }
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.g(t2, this.N, t);
            }
        }
        
        void w() {
            Object o = this.O;
            synchronized (o) {
                final ArrayList<o> list = (ArrayList<o>)new ArrayList<Object>(this.O);
                this.O.clear();
                // monitorexit(o)
                o = list.iterator();
                while (((Iterator)o).hasNext()) {
                    ((Iterator<o>)o).next().i();
                }
            }
        }
        
        void x() {
            if (this.S.getAndIncrement() != 0) {
                return;
            }
            final b t = this.T;
            final n<? super R> n = this.N;
            int addAndGet = 1;
            while (!this.R) {
                final boolean p = this.P;
                Object o = this.O;
                synchronized (o) {
                    final a a = this.O.peek();
                    // monitorexit(o)
                    boolean b = false;
                    final boolean b2 = a == null;
                    if (p) {
                        o = this.Q;
                        if (o != null) {
                            this.w();
                            n.b((Throwable)o);
                            return;
                        }
                        if (b2) {
                            n.c();
                            return;
                        }
                    }
                    int n4 = 0;
                    Label_0357: {
                        Label_0354: {
                            if (!b2) {
                                final long value = t.get();
                                final Queue<Object> m = a.M;
                                long n2 = 0L;
                                while (true) {
                                    final boolean n3 = a.N;
                                    o = m.peek();
                                    final boolean b3 = o == null;
                                    if (n3) {
                                        final Throwable o2 = a.O;
                                        if (o2 != null) {
                                            this.w();
                                            n.b(o2);
                                            return;
                                        }
                                        if (b3) {
                                            synchronized (this.O) {
                                                this.O.poll();
                                                // monitorexit(this.O)
                                                a.i();
                                                this.v(1L);
                                                b = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (b3) {
                                        break;
                                    }
                                    if (value == n2) {
                                        break;
                                    }
                                    m.poll();
                                    try {
                                        n.m(x.e(o));
                                        ++n2;
                                        continue;
                                    }
                                    finally {
                                        rx.exceptions.c.g((Throwable)t, n, o);
                                        return;
                                    }
                                    break Label_0354;
                                }
                                if (n2 != 0L) {
                                    if (value != Long.MAX_VALUE) {
                                        rx.internal.operators.a.i(t, n2);
                                    }
                                    if (!b) {
                                        a.w(n2);
                                    }
                                }
                                n4 = addAndGet;
                                if (b) {
                                    continue;
                                }
                                break Label_0357;
                            }
                        }
                        n4 = addAndGet;
                    }
                    if ((addAndGet = this.S.addAndGet(-n4)) == 0) {
                        return;
                    }
                    continue;
                }
            }
            this.w();
        }
    }
}
