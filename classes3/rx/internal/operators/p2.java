// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.n;
import rx.functions.o;
import rx.functions.p;
import rx.g;

public final class p2<T, R> implements g.b<R, T>
{
    final p<? super T, ? extends R> G;
    final p<? super Throwable, ? extends R> H;
    final o<? extends R> I;
    
    public p2(final p<? super T, ? extends R> g, final p<? super Throwable, ? extends R> h, final o<? extends R> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public n<? super T> a(final n<? super R> n) {
        final b b = new b((n<? super R>)n, (p<? super T, ? extends R>)this.G, (p<? super Throwable, ? extends R>)this.H, (o<? extends R>)this.I);
        n.r(b);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                b.x(n);
            }
        });
        return (n<? super T>)b;
    }
    
    static final class b<T, R> extends n<T>
    {
        static final long U = Long.MIN_VALUE;
        static final long V = Long.MAX_VALUE;
        final n<? super R> L;
        final p<? super T, ? extends R> M;
        final p<? super Throwable, ? extends R> N;
        final rx.functions.o<? extends R> O;
        final AtomicLong P;
        final AtomicLong Q;
        final AtomicReference<i> R;
        long S;
        R T;
        
        public b(final n<? super R> l, final p<? super T, ? extends R> m, final p<? super Throwable, ? extends R> n, final rx.functions.o<? extends R> o) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = new AtomicLong();
            this.Q = new AtomicLong();
            this.R = new AtomicReference<i>();
        }
        
        void A() {
            long value;
            do {
                value = this.P.get();
                if ((value & Long.MIN_VALUE) != 0x0L) {
                    return;
                }
            } while (!this.P.compareAndSet(value, Long.MIN_VALUE | value));
            if (value != 0L || this.R.get() == null) {
                if (!this.L.g()) {
                    this.L.m((Object)this.T);
                }
                if (!this.L.g()) {
                    this.L.c();
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.w();
            try {
                this.T = (R)this.N.h(t);
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.g(t2, this.L, t);
            }
            this.A();
        }
        
        @Override
        public void c() {
            this.w();
            try {
                this.T = (R)this.O.call();
            }
            finally {
                final Throwable t;
                rx.exceptions.c.f(t, this.L);
            }
            this.A();
        }
        
        @Override
        public void m(final T t) {
            try {
                ++this.S;
                this.L.m((Object)this.M.h((Object)t));
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.g(t2, this.L, t);
            }
        }
        
        @Override
        public void s0(final i newValue) {
            if (this.R.compareAndSet(null, newValue)) {
                final long andSet = this.Q.getAndSet(0L);
                if (andSet != 0L) {
                    newValue.v(andSet);
                }
                return;
            }
            throw new IllegalStateException("Producer already set!");
        }
        
        void w() {
            final long s = this.S;
            if (s != 0L && this.R.get() != null) {
                rx.internal.operators.a.i(this.P, s);
            }
        }
        
        void x(long andSet) {
            final long n = lcmp(andSet, 0L);
            if (n < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("n >= 0 required but it was ");
                sb.append(andSet);
                throw new IllegalArgumentException(sb.toString());
            }
            if (n == 0) {
                return;
            }
            while (true) {
                final long value = this.P.get();
                if ((value & Long.MIN_VALUE) != 0x0L) {
                    final long n2 = Long.MAX_VALUE & value;
                    if (this.P.compareAndSet(value, Long.MIN_VALUE | rx.internal.operators.a.a(n2, andSet))) {
                        if (n2 == 0L) {
                            if (!this.L.g()) {
                                this.L.m((Object)this.T);
                            }
                            if (!this.L.g()) {
                                this.L.c();
                            }
                        }
                        return;
                    }
                    continue;
                }
                else {
                    if (this.P.compareAndSet(value, rx.internal.operators.a.a(value, andSet))) {
                        final AtomicReference<i> r = this.R;
                        final i i = r.get();
                        if (i != null) {
                            i.v(andSet);
                        }
                        else {
                            rx.internal.operators.a.b(this.Q, andSet);
                            final i j = r.get();
                            if (j != null) {
                                andSet = this.Q.getAndSet(0L);
                                if (andSet != 0L) {
                                    j.v(andSet);
                                }
                            }
                        }
                        return;
                    }
                    continue;
                }
            }
        }
    }
}
