// 
// Decompiled by Procyon v0.5.36
// 

package rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.n;
import rx.functions.a;
import rx.functions.b;
import rx.functions.q;
import rx.h;
import rx.functions.c;
import rx.functions.o;
import rx.g;

public abstract class e<S, T> implements a<T>
{
    public static <S, T> e<S, T> b(final o<? extends S> o, final rx.functions.c<? super S, ? super h<? super T>> c) {
        return new g<S, T>(o, (q<? super S, ? super h<? super T>, ? extends S>)new q<S, h<? super T>, S>() {
            public S a(final S n, final h<? super T> h) {
                c.s(n, h);
                return n;
            }
        });
    }
    
    public static <S, T> e<S, T> c(final o<? extends S> o, final rx.functions.c<? super S, ? super h<? super T>> c, final b<? super S> b) {
        return new g<S, T>(o, (q<? super S, ? super h<? super T>, ? extends S>)new q<S, h<? super T>, S>() {
            public S a(final S n, final h<? super T> h) {
                c.s(n, h);
                return n;
            }
        }, b);
    }
    
    public static <S, T> e<S, T> d(final o<? extends S> o, final q<? super S, ? super h<? super T>, ? extends S> q) {
        return new g<S, T>(o, q);
    }
    
    public static <S, T> e<S, T> e(final o<? extends S> o, final q<? super S, ? super h<? super T>, ? extends S> q, final b<? super S> b) {
        return new g<S, T>(o, q, b);
    }
    
    public static <T> e<Void, T> f(final b<? super h<? super T>> b) {
        return new g<Void, T>(new q<Void, h<? super T>, Void>() {
            public Void a(final Void void1, final h<? super T> h) {
                b.h(h);
                return void1;
            }
        });
    }
    
    public static <T> e<Void, T> g(final b<? super h<? super T>> b, final rx.functions.a a) {
        return new g<Void, T>(new q<Void, h<? super T>, Void>() {
            public Void a(final Void void1, final h<? super T> h) {
                b.h(h);
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
            final f f = new f(n, this, this.i());
            n.r(f);
            n.s0(f);
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            n.b(t);
        }
    }
    
    protected abstract S i();
    
    protected abstract S m(final S p0, final h<? super T> p1);
    
    protected void n(final S n) {
    }
    
    static final class f<S, T> extends AtomicLong implements i, o, h<T>
    {
        private static final long L = -3736864024352728072L;
        private final n<? super T> G;
        private final e<S, T> H;
        private boolean I;
        private boolean J;
        private S K;
        
        f(final n<? super T> g, final e<S, T> h, final S k) {
            this.G = g;
            this.H = h;
            this.K = k;
        }
        
        private void h() {
            try {
                this.H.n(this.K);
            }
            finally {
                final Throwable t;
                rx.exceptions.c.e(t);
                rx.plugins.c.I(t);
            }
        }
        
        private void j() {
            final e<S, T> h = this.H;
            final n<? super T> g = this.G;
            try {
                do {
                    this.I = false;
                    this.l(h);
                } while (!this.o());
            }
            finally {
                final Throwable t;
                this.k(g, t);
            }
        }
        
        private void k(final n<? super T> n, final Throwable t) {
            if (this.J) {
                rx.plugins.c.I(t);
            }
            else {
                this.J = true;
                n.b(t);
                this.i();
            }
        }
        
        private void l(final e<S, T> e) {
            this.K = e.m(this.K, this);
        }
        
        private void n(long addAndGet) {
            final e<S, T> h = this.H;
            final n<? super T> g = this.G;
            while (true) {
                long n = addAndGet;
                try {
                    long n2;
                    do {
                        this.I = false;
                        this.l(h);
                        if (this.o()) {
                            return;
                        }
                        n2 = n;
                        if (this.I) {
                            n2 = n - 1L;
                        }
                        n = n2;
                    } while (n2 != 0L);
                    if ((addAndGet = this.addAndGet(-addAndGet)) <= 0L) {
                        this.o();
                        return;
                    }
                    continue;
                }
                finally {
                    this.k(g, (Throwable)h);
                }
            }
        }
        
        private boolean o() {
            if (!this.J && this.get() >= -1L) {
                return false;
            }
            this.set(-1L);
            this.h();
            return true;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.J) {
                this.J = true;
                if (!this.G.g()) {
                    this.G.b(t);
                }
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }
        
        @Override
        public void c() {
            if (!this.J) {
                this.J = true;
                if (!this.G.g()) {
                    this.G.c();
                }
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }
        
        @Override
        public boolean g() {
            return this.get() < 0L;
        }
        
        @Override
        public void i() {
            long value;
            do {
                value = this.get();
                if (this.compareAndSet(0L, -1L)) {
                    this.h();
                }
            } while (!this.compareAndSet(value, -2L));
        }
        
        @Override
        public void m(final T t) {
            if (!this.I) {
                this.I = true;
                this.G.m((Object)t);
                return;
            }
            throw new IllegalStateException("onNext called multiple times!");
        }
        
        @Override
        public void v(final long n) {
            if (n > 0L && rx.internal.operators.a.b(this, n) == 0L) {
                if (n == Long.MAX_VALUE) {
                    this.j();
                }
                else {
                    this.n(n);
                }
            }
        }
    }
    
    static final class g<S, T> extends e<S, T>
    {
        private final o<? extends S> G;
        private final q<? super S, ? super h<? super T>, ? extends S> H;
        private final b<? super S> I;
        
        public g(final o<? extends S> o, final q<? super S, ? super h<? super T>, ? extends S> q) {
            this(o, q, null);
        }
        
        g(final o<? extends S> g, final q<? super S, ? super h<? super T>, ? extends S> h, final b<? super S> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public g(final q<S, h<? super T>, S> q) {
            this(null, (q)q, null);
        }
        
        public g(final q<S, h<? super T>, S> q, final b<? super S> b) {
            this(null, (q)q, b);
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
        protected S m(final S n, final h<? super T> h) {
            return (S)this.H.s((Object)n, h);
        }
        
        @Override
        protected void n(final S n) {
            final b<? super S> i = this.I;
            if (i != null) {
                i.h(n);
            }
        }
    }
}
