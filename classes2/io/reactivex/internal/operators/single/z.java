// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.g;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.n0;
import o7.c;
import x5.o;
import io.reactivex.q0;
import io.reactivex.l;

public final class z<T, R> extends l<R>
{
    final q0<T> H;
    final o<? super T, ? extends Iterable<? extends R>> I;
    
    public z(final q0<T> h, final o<? super T, ? extends Iterable<? extends R>> i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        this.H.c(new a<Object, Object>(c, this.I));
    }
    
    static final class a<T, R> extends c<R> implements n0<T>
    {
        private static final long O = -8938804753851907758L;
        final o7.c<? super R> H;
        final x5.o<? super T, ? extends Iterable<? extends R>> I;
        final AtomicLong J;
        io.reactivex.disposables.c K;
        volatile Iterator<? extends R> L;
        volatile boolean M;
        boolean N;
        
        a(final o7.c<? super R> h, final x5.o<? super T, ? extends Iterable<? extends R>> i) {
            this.H = h;
            this.I = i;
            this.J = new AtomicLong();
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.N = true;
                return 2;
            }
            return 0;
        }
        
        @Override
        public void b(final Throwable t) {
            this.K = d.G;
            this.H.b(t);
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super R> h = this.H;
            Iterator<? extends R> iterator = this.L;
            if (this.N && iterator != null) {
                h.m((Object)null);
                h.f();
                return;
            }
            int n = 1;
            while (true) {
                if (iterator != null) {
                    final long value = this.J.get();
                    if (value == Long.MAX_VALUE) {
                        this.g(h, iterator);
                        return;
                    }
                    long n2 = 0L;
                    while (n2 != value) {
                        if (this.M) {
                            return;
                        }
                        try {
                            h.m(b.g((Object)iterator.next(), "The iterator returned a null value"));
                            if (this.M) {
                                return;
                            }
                            ++n2;
                            try {
                                if (!iterator.hasNext()) {
                                    h.f();
                                    return;
                                }
                                continue;
                            }
                            finally {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                h.b(t);
                                return;
                            }
                        }
                        finally {
                            io.reactivex.exceptions.b.b((Throwable)iterator);
                            h.b((Throwable)iterator);
                            return;
                        }
                        break;
                    }
                    if (n2 != 0L) {
                        io.reactivex.internal.util.d.e(this.J, n2);
                    }
                }
                final int addAndGet = this.addAndGet(-n);
                if (addAndGet == 0) {
                    return;
                }
                n = addAndGet;
                if (iterator != null) {
                    continue;
                }
                iterator = this.L;
                n = addAndGet;
            }
        }
        
        public void cancel() {
            this.M = true;
            this.K.dispose();
            this.K = d.G;
        }
        
        public void clear() {
            this.L = null;
        }
        
        @Override
        public void d(final T t) {
            try {
                final Iterator<? extends R> iterator = (Iterator<? extends R>)((Iterable)this.I.apply((Object)t)).iterator();
                if (!iterator.hasNext()) {
                    this.H.f();
                    return;
                }
                this.L = iterator;
                this.c();
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.H.b(t2);
            }
        }
        
        void g(final o7.c<? super R> c, final Iterator<? extends R> iterator) {
            while (!this.M) {
                try {
                    c.m(iterator.next());
                    if (this.M) {
                        return;
                    }
                    if (!iterator.hasNext()) {
                        c.f();
                        return;
                    }
                    continue;
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)iterator);
                    c.b((Throwable)iterator);
                }
            }
        }
        
        public boolean isEmpty() {
            return this.L == null;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.H.z((o7.d)this);
            }
        }
        
        @g
        public R poll() throws Exception {
            final Iterator<? extends R> l = this.L;
            if (l != null) {
                final R g = b.g((R)l.next(), "The iterator returned a null value");
                if (!l.hasNext()) {
                    this.L = null;
                }
                return g;
            }
            return null;
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.c();
            }
        }
    }
}
