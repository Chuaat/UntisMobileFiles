// 
// Decompiled by Procyon v0.5.36
// 

package rx.observables;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import rx.observers.f;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.p;
import rx.i;
import rx.n;
import rx.functions.c;
import rx.functions.b;
import rx.functions.r;
import rx.h;
import rx.functions.d;
import rx.functions.o;
import rx.g;

@r7.a
public abstract class a<S, T> implements g.a<T>
{
    public static <S, T> a<S, T> b(final o<? extends S> o, final d<? super S, Long, ? super rx.h<g<? extends T>>> d) {
        return new h<S, T>(o, (r<? super S, Long, ? super rx.h<g<? extends T>>, ? extends S>)new r<S, Long, rx.h<g<? extends T>>, S>() {
            public S a(final S n, final Long n2, final rx.h<g<? extends T>> h) {
                d.k(n, n2, h);
                return n;
            }
        });
    }
    
    public static <S, T> a<S, T> c(final o<? extends S> o, final d<? super S, Long, ? super rx.h<g<? extends T>>> d, final b<? super S> b) {
        return new h<S, T>(o, (r<? super S, Long, ? super rx.h<g<? extends T>>, ? extends S>)new r<S, Long, rx.h<g<? extends T>>, S>() {
            public S a(final S n, final Long n2, final rx.h<g<? extends T>> h) {
                d.k(n, n2, h);
                return n;
            }
        }, b);
    }
    
    public static <S, T> a<S, T> d(final o<? extends S> o, final r<? super S, Long, ? super rx.h<g<? extends T>>, ? extends S> r) {
        return new h<S, T>(o, r);
    }
    
    public static <S, T> a<S, T> e(final o<? extends S> o, final r<? super S, Long, ? super rx.h<g<? extends T>>, ? extends S> r, final b<? super S> b) {
        return new h<S, T>(o, r, b);
    }
    
    public static <T> a<Void, T> f(final rx.functions.c<Long, ? super rx.h<g<? extends T>>> c) {
        return new h<Void, T>(new r<Void, Long, rx.h<g<? extends T>>, Void>() {
            public Void a(final Void void1, final Long n, final rx.h<g<? extends T>> h) {
                c.s(n, h);
                return void1;
            }
        });
    }
    
    public static <T> a<Void, T> g(final rx.functions.c<Long, ? super rx.h<g<? extends T>>> c, final rx.functions.a a) {
        return new h<Void, T>(new r<Void, Long, rx.h<g<? extends T>>, Void>() {
            public Void a(final Void void1, final Long n, final rx.h<g<? extends T>> h) {
                c.s(n, h);
                return null;
            }
        }, new b<Void>() {
            public void a(final Void void1) {
                a.call();
            }
        });
    }
    
    public final void a(final n<? super T> n) {
        try {
            final Object i = this.i();
            final j<g<Object>> e7 = j.E7();
            final i j = new i((a<Object, Object>)this, i, e7);
            final n<T> n2 = new n<T>() {
                @Override
                public void b(final Throwable t) {
                    n.b(t);
                }
                
                @Override
                public void c() {
                    n.c();
                }
                
                @Override
                public void m(final T t) {
                    n.m(t);
                }
                
                @Override
                public void s0(final rx.i i) {
                    j.o(i);
                }
            };
            e7.V3().h1((p<? super Object, ? extends g<?>>)new p<g<T>, g<T>>() {
                public g<T> a(final g<T> g) {
                    return g.V3();
                }
            }).R6((n<? super Object>)n2);
            n.r(n2);
            n.r(j);
            n.s0(j);
        }
        finally {
            final Throwable t;
            n.b(t);
        }
    }
    
    protected abstract S i();
    
    protected abstract S m(final S p0, final long p1, final rx.h<g<? extends T>> p2);
    
    protected void n(final S n) {
    }
    
    static final class h<S, T> extends a<S, T>
    {
        private final o<? extends S> G;
        private final r<? super S, Long, ? super rx.h<g<? extends T>>, ? extends S> H;
        private final b<? super S> I;
        
        public h(final o<? extends S> o, final r<? super S, Long, ? super rx.h<g<? extends T>>, ? extends S> r) {
            this(o, r, null);
        }
        
        h(final o<? extends S> g, final r<? super S, Long, ? super rx.h<g<? extends T>>, ? extends S> h, final b<? super S> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public h(final r<S, Long, rx.h<g<? extends T>>, S> r) {
            this(null, (r)r, null);
        }
        
        public h(final r<S, Long, rx.h<g<? extends T>>, S> r, final b<? super S> b) {
            this(null, (r)r, b);
        }
        
        @Override
        protected S i() {
            final o<? extends S> g = this.G;
            S call;
            if (g == null) {
                call = null;
            }
            else {
                call = (S)g.call();
            }
            return call;
        }
        
        @Override
        protected S m(final S n, final long l, final rx.h<g<? extends T>> h) {
            return (S)this.H.k((Object)n, Long.valueOf(l), h);
        }
        
        @Override
        protected void n(final S n) {
            final b<? super S> i = this.I;
            if (i != null) {
                i.h(n);
            }
        }
    }
    
    static final class i<S, T> implements rx.i, o, h<g<? extends T>>
    {
        final AtomicBoolean G;
        private final a<S, T> H;
        private final f<g<? extends T>> I;
        final rx.subscriptions.b J;
        private boolean K;
        private boolean L;
        private S M;
        private final j<g<T>> N;
        boolean O;
        List<Long> P;
        rx.i Q;
        long R;
        
        public i(final a<S, T> h, final S m, final j<g<T>> n) {
            this.J = new rx.subscriptions.b();
            this.H = h;
            this.I = new f<g<? extends T>>(this);
            this.M = m;
            this.N = n;
            this.G = new AtomicBoolean();
        }
        
        private void j(final Throwable t) {
            if (this.K) {
                rx.plugins.c.I(t);
            }
            else {
                this.K = true;
                this.N.b(t);
                this.h();
            }
        }
        
        private void p(final g<? extends T> g) {
            final rx.internal.operators.g<Object> g2 = rx.internal.operators.g.G7();
            final n<T> n = new n<T>() {
                long L = n;
                final /* synthetic */ long M = i.this.R;
                
                @Override
                public void b(final Throwable t) {
                    g2.b(t);
                }
                
                @Override
                public void c() {
                    g2.c();
                    final long l = this.L;
                    if (l > 0L) {
                        i.this.n(l);
                    }
                }
                
                @Override
                public void m(final T t) {
                    --this.L;
                    g2.m(t);
                }
            };
            this.J.a(n);
            g.W1(new rx.functions.a() {
                @Override
                public void call() {
                    i.this.J.e(n);
                }
            }).z5(n);
            this.N.m((g<T>)g2);
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.K) {
                this.K = true;
                this.N.b(t);
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }
        
        @Override
        public void c() {
            if (!this.K) {
                this.K = true;
                this.N.c();
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }
        
        @Override
        public boolean g() {
            return this.G.get();
        }
        
        void h() {
            this.J.i();
            try {
                this.H.n(this.M);
            }
            finally {
                final Throwable t;
                this.j(t);
            }
        }
        
        @Override
        public void i() {
            if (this.G.compareAndSet(false, true)) {
                synchronized (this) {
                    if (this.O) {
                        (this.P = new ArrayList<Long>()).add(0L);
                        return;
                    }
                    this.O = true;
                    // monitorexit(this)
                    this.h();
                }
            }
        }
        
        public void k(final long n) {
            this.M = this.H.m(this.M, n, this.I);
        }
        
        public void l(final g<? extends T> g) {
            if (this.L) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.L = true;
            if (this.K) {
                return;
            }
            this.p(g);
        }
        
        public void n(final long n) {
            final long n2 = lcmp(n, 0L);
            if (n2 == 0) {
                return;
            }
            if (n2 >= 0) {
                synchronized (this) {
                    if (this.O) {
                        List<Long> p;
                        if ((p = this.P) == null) {
                            p = new ArrayList<Long>();
                            this.P = p;
                        }
                        p.add(n);
                        return;
                    }
                    this.O = true;
                    // monitorexit(this)
                    if (this.q(n)) {
                        return;
                    }
                    while (true) {
                        synchronized (this) {
                            final List<Long> p2 = this.P;
                            if (p2 == null) {
                                this.O = false;
                                return;
                            }
                            this.P = null;
                            // monitorexit(this)
                            final Iterator<Long> iterator = p2.iterator();
                            while (iterator.hasNext()) {
                                if (this.q(iterator.next())) {
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Request can't be negative! ");
            sb.append(n);
            throw new IllegalStateException(sb.toString());
        }
        
        void o(final rx.i q) {
            if (this.Q == null) {
                this.Q = q;
                return;
            }
            throw new IllegalStateException("setConcatProducer may be called at most once!");
        }
        
        boolean q(final long r) {
            if (this.g()) {
                this.h();
                return true;
            }
            try {
                this.L = false;
                this.k(this.R = r);
                if ((this.K && !this.J.d()) || this.g()) {
                    this.h();
                    return true;
                }
                if (!this.L) {
                    final IllegalStateException ex = new IllegalStateException("No events emitted!");
                }
                return false;
            }
            finally {
                final Throwable t;
                this.j(t);
                return true;
            }
        }
        
        @Override
        public void v(final long n) {
            final long n2 = lcmp(n, 0L);
            if (n2 == 0) {
                return;
            }
            if (n2 >= 0) {
                synchronized (this) {
                    final boolean o = this.O;
                    boolean b = true;
                    if (o) {
                        List<Long> p;
                        if ((p = this.P) == null) {
                            p = new ArrayList<Long>();
                            this.P = p;
                        }
                        p.add(n);
                    }
                    else {
                        this.O = true;
                        b = false;
                    }
                    // monitorexit(this)
                    this.Q.v(n);
                    if (b) {
                        return;
                    }
                    if (this.q(n)) {
                        return;
                    }
                    while (true) {
                        synchronized (this) {
                            final List<Long> p2 = this.P;
                            if (p2 == null) {
                                this.O = false;
                                return;
                            }
                            this.P = null;
                            // monitorexit(this)
                            final Iterator<Long> iterator = p2.iterator();
                            while (iterator.hasNext()) {
                                if (this.q(iterator.next())) {
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Request can't be negative! ");
            sb.append(n);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    static final class j<T> extends g<T> implements h<T>
    {
        private final a<T> H;
        
        protected j(final a<T> h) {
            super((g.a)h);
            this.H = h;
        }
        
        public static <T> j<T> E7() {
            return new j<T>(new a<T>());
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.G.b(t);
        }
        
        @Override
        public void c() {
            this.H.G.c();
        }
        
        @Override
        public void m(final T t) {
            this.H.G.m((Object)t);
        }
        
        static final class a<T> implements g.a<T>
        {
            n<? super T> G;
            
            public void a(final n<? super T> g) {
                synchronized (this) {
                    if (this.G == null) {
                        this.G = g;
                        return;
                    }
                    // monitorexit(this)
                    g.b(new IllegalStateException("There can be only one subscriber"));
                }
            }
        }
    }
}
