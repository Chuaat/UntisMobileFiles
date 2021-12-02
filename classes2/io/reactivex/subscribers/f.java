// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subscribers;

import java.util.List;
import io.reactivex.internal.util.k;
import x5.g;
import io.reactivex.internal.subscriptions.j;
import y5.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import o7.d;
import io.reactivex.q;
import io.reactivex.observers.a;

public class f<T> extends io.reactivex.observers.a<T, f<T>> implements q<T>, d, c
{
    private final o7.c<? super T> Q;
    private volatile boolean R;
    private final AtomicReference<d> S;
    private final AtomicLong T;
    private l<T> U;
    
    public f() {
        this((o7.c)a.G, Long.MAX_VALUE);
    }
    
    public f(final long n) {
        this((o7.c)a.G, n);
    }
    
    public f(final o7.c<? super T> c) {
        this(c, Long.MAX_VALUE);
    }
    
    public f(final o7.c<? super T> q, final long initialValue) {
        if (initialValue >= 0L) {
            this.Q = q;
            this.S = new AtomicReference<d>();
            this.T = new AtomicLong(initialValue);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
    
    public static <T> f<T> q0() {
        return new f<T>();
    }
    
    public static <T> f<T> r0(final long n) {
        return new f<T>(n);
    }
    
    public static <T> f<T> s0(final o7.c<? super T> c) {
        return new f<T>(c);
    }
    
    static String t0(final int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "SYNC";
        }
        if (i != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
        return "ASYNC";
    }
    
    public void b(final Throwable t) {
        if (!super.L) {
            super.L = true;
            if (this.S.get() == null) {
                super.I.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            super.K = Thread.currentThread();
            super.I.add(t);
            if (t == null) {
                super.I.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.Q.b(t);
        }
        finally {
            super.G.countDown();
        }
    }
    
    public final void cancel() {
        if (!this.R) {
            this.R = true;
            j.b(this.S);
        }
    }
    
    public final void dispose() {
        this.cancel();
    }
    
    public void f() {
        if (!super.L) {
            super.L = true;
            if (this.S.get() == null) {
                super.I.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            super.K = Thread.currentThread();
            ++super.J;
            this.Q.f();
        }
        finally {
            super.G.countDown();
        }
    }
    
    public final boolean i() {
        return this.R;
    }
    
    final f<T> k0() {
        if (this.U != null) {
            return this;
        }
        throw new AssertionError((Object)"Upstream is not fuseable.");
    }
    
    final f<T> l0(final int n) {
        final int n2 = super.N;
        if (n2 == n) {
            return this;
        }
        if (this.U != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fusion mode different. Expected: ");
            sb.append(t0(n));
            sb.append(", actual: ");
            sb.append(t0(n2));
            throw new AssertionError((Object)sb.toString());
        }
        throw this.b0("Upstream is not fuseable");
    }
    
    public void m(final T t) {
        if (!super.L) {
            super.L = true;
            if (this.S.get() == null) {
                super.I.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        super.K = Thread.currentThread();
        if (super.N == 2) {
            try {
                while (true) {
                    final Object poll = this.U.poll();
                    if (poll == null) {
                        break;
                    }
                    super.H.add(poll);
                }
            }
            finally {
                final Throwable t2;
                super.I.add(t2);
                ((d)this.U).cancel();
            }
            return;
        }
        super.H.add(t);
        if (t == null) {
            super.I.add(new NullPointerException("onNext received a null value"));
        }
        this.Q.m((Object)t);
    }
    
    final f<T> m0() {
        if (this.U == null) {
            return this;
        }
        throw new AssertionError((Object)"Upstream is fuseable.");
    }
    
    public final f<T> n0() {
        if (this.S.get() != null) {
            throw this.b0("Subscribed!");
        }
        if (super.I.isEmpty()) {
            return this;
        }
        throw this.b0("Not subscribed but errors found");
    }
    
    public final f<T> o0(final g<? super f<T>> g) {
        try {
            g.accept(this);
            return this;
        }
        finally {
            final Throwable t;
            throw k.f(t);
        }
    }
    
    public final f<T> p0() {
        if (this.S.get() != null) {
            return this;
        }
        throw this.b0("Not subscribed!");
    }
    
    public final boolean u0() {
        return this.S.get() != null;
    }
    
    public final void v(final long n) {
        j.d(this.S, this.T, n);
    }
    
    public final boolean v0() {
        return this.R;
    }
    
    protected void w0() {
    }
    
    public final f<T> x0(final long n) {
        this.v(n);
        return this;
    }
    
    final f<T> y0(final int m) {
        super.M = m;
        return this;
    }
    
    @Override
    public void z(final d d) {
        super.K = Thread.currentThread();
        if (d == null) {
            super.I.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!this.S.compareAndSet(null, d)) {
            d.cancel();
            if (this.S.get() != j.G) {
                final List<Throwable> i = (List<Throwable>)super.I;
                final StringBuilder sb = new StringBuilder();
                sb.append("onSubscribe received multiple subscriptions: ");
                sb.append(d);
                i.add(new IllegalStateException(sb.toString()));
            }
            return;
        }
        final int m = super.M;
        if (m != 0 && d instanceof l) {
            final l u = (l)d;
            this.U = (l<T>)u;
            if ((super.N = u.E(m)) == 1) {
                super.L = true;
                super.K = Thread.currentThread();
                try {
                    while (true) {
                        final Object poll = this.U.poll();
                        if (poll == null) {
                            break;
                        }
                        super.H.add(poll);
                    }
                    ++super.J;
                }
                finally {
                    final Throwable t;
                    super.I.add(t);
                }
                return;
            }
        }
        this.Q.z(d);
        final long andSet = this.T.getAndSet(0L);
        if (andSet != 0L) {
            d.v(andSet);
        }
        this.w0();
    }
    
    enum a implements q<Object>
    {
        G;
        
        public void b(final Throwable t) {
        }
        
        public void f() {
        }
        
        public void m(final Object o) {
        }
        
        @Override
        public void z(final d d) {
        }
    }
}
