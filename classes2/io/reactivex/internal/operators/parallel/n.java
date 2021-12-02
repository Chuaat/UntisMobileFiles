// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.plugins.a;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import x5.c;
import io.reactivex.parallel.b;
import io.reactivex.l;

public final class n<T> extends l<T>
{
    final io.reactivex.parallel.b<? extends T> H;
    final x5.c<T, T, T> I;
    
    public n(final io.reactivex.parallel.b<? extends T> h, final x5.c<T, T, T> i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final b b = new b((o7.c<? super T>)c, this.H.F(), (x5.c<T, T, T>)this.I);
        c.z((d)b);
        this.H.Q((o7.c[])b.S);
    }
    
    static final class a<T> extends AtomicReference<d> implements q<T>
    {
        private static final long K = -7954444275102466525L;
        final b<T> G;
        final x5.c<T, T, T> H;
        T I;
        boolean J;
        
        a(final b<T> g, final x5.c<T, T, T> h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            j.b(this);
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.G.a(t);
        }
        
        public void f() {
            if (!this.J) {
                this.J = true;
                this.G.q(this.I);
            }
        }
        
        public void m(final T i) {
            if (!this.J) {
                final T j = this.I;
                Label_0016: {
                    if (j != null) {
                        try {
                            io.reactivex.internal.functions.b.g(this.H.b(j, i), "The reducer returned a null value");
                            break Label_0016;
                        }
                        finally {
                            io.reactivex.exceptions.b.b((Throwable)i);
                            this.get().cancel();
                            this.b((Throwable)i);
                        }
                        return;
                    }
                }
                this.I = i;
            }
        }
        
        @Override
        public void z(final d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
    
    static final class b<T> extends f<T>
    {
        private static final long X = -5370107872170712765L;
        final a<T>[] S;
        final c<T, T, T> T;
        final AtomicReference<n.c<T>> U;
        final AtomicInteger V;
        final AtomicReference<Throwable> W;
        
        b(final o7.c<? super T> c, final int newValue, final c<T, T, T> t) {
            super(c);
            this.U = new AtomicReference<n.c<T>>();
            this.V = new AtomicInteger();
            this.W = new AtomicReference<Throwable>();
            final a[] s = new a[newValue];
            for (int i = 0; i < newValue; ++i) {
                s[i] = new a((b<Object>)this, (c<Object, Object, Object>)t);
            }
            this.S = (a<T>[])s;
            this.T = t;
            this.V.lazySet(newValue);
        }
        
        void a(final Throwable newValue) {
            if (this.W.compareAndSet(null, newValue)) {
                this.cancel();
                super.H.b(newValue);
            }
            else if (newValue != this.W.get()) {
                io.reactivex.plugins.a.Y(newValue);
            }
        }
        
        @Override
        public void cancel() {
            final a<T>[] s = this.S;
            for (int length = s.length, i = 0; i < length; ++i) {
                s[i].a();
            }
        }
        
        n.c<T> n(final T t) {
            n.c c;
            int b;
            while (true) {
                if ((c = this.U.get()) == null && !this.U.compareAndSet(null, c = new n.c())) {
                    continue;
                }
                b = c.b();
                if (b >= 0) {
                    break;
                }
                this.U.compareAndSet(c, null);
            }
            if (b == 0) {
                c.G = (T)t;
            }
            else {
                c.H = (T)t;
            }
            if (c.a()) {
                this.U.compareAndSet(c, null);
                return (n.c<T>)c;
            }
            return null;
        }
        
        void q(final T t) {
            if (t != null) {
                while (true) {
                    final n.c<Object> n = this.n(t);
                    if (n != null) {
                        try {
                            io.reactivex.internal.functions.b.g(this.T.b((T)n.G, (T)n.H), "The reducer returned a null value");
                            continue;
                        }
                        finally {
                            io.reactivex.exceptions.b.b((Throwable)t);
                            this.a((Throwable)t);
                            return;
                        }
                        break;
                    }
                    break;
                }
            }
            if (this.V.decrementAndGet() == 0) {
                final n.c c = this.U.get();
                this.U.lazySet(null);
                if (c != null) {
                    this.g((T)c.G);
                }
                else {
                    super.H.f();
                }
            }
        }
    }
    
    static final class c<T> extends AtomicInteger
    {
        private static final long J = 473971317683868662L;
        T G;
        T H;
        final AtomicInteger I;
        
        c() {
            this.I = new AtomicInteger();
        }
        
        boolean a() {
            return this.I.incrementAndGet() == 2;
        }
        
        int b() {
            int value;
            do {
                value = this.get();
                if (value >= 2) {
                    return -1;
                }
            } while (!this.compareAndSet(value, value + 1));
            return value;
        }
    }
}
