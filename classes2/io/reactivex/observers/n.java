// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.util.k;
import x5.g;
import java.util.List;
import io.reactivex.internal.disposables.d;
import y5.j;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.n0;
import io.reactivex.v;
import io.reactivex.disposables.c;
import io.reactivex.i0;

public class n<T> extends io.reactivex.observers.a<T, n<T>> implements i0<T>, c, v<T>, n0<T>, f
{
    private final i0<? super T> Q;
    private final AtomicReference<c> R;
    private j<T> S;
    
    public n() {
        this(a.G);
    }
    
    public n(final i0<? super T> q) {
        this.R = new AtomicReference<c>();
        this.Q = q;
    }
    
    public static <T> n<T> q0() {
        return new n<T>();
    }
    
    public static <T> n<T> r0(final i0<? super T> i0) {
        return new n<T>(i0);
    }
    
    static String s0(final int i) {
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
    
    @Override
    public void b(final Throwable t) {
        if (!super.L) {
            super.L = true;
            if (this.R.get() == null) {
                super.I.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            super.K = Thread.currentThread();
            if (t == null) {
                super.I.add(new NullPointerException("onError received a null Throwable"));
            }
            else {
                super.I.add(t);
            }
            this.Q.b(t);
        }
        finally {
            super.G.countDown();
        }
    }
    
    public final void cancel() {
        this.dispose();
    }
    
    @Override
    public void d(final T t) {
        this.m(t);
        this.f();
    }
    
    @Override
    public final void dispose() {
        d.b(this.R);
    }
    
    @Override
    public void f() {
        if (!super.L) {
            super.L = true;
            if (this.R.get() == null) {
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
    
    @Override
    public final boolean i() {
        return d.d(this.R.get());
    }
    
    final n<T> k0() {
        if (this.S != null) {
            return this;
        }
        throw new AssertionError((Object)"Upstream is not fuseable.");
    }
    
    @Override
    public void l(final c c) {
        super.K = Thread.currentThread();
        if (c == null) {
            super.I.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!this.R.compareAndSet(null, c)) {
            c.dispose();
            if (this.R.get() != d.G) {
                final List<Throwable> i = (List<Throwable>)super.I;
                final StringBuilder sb = new StringBuilder();
                sb.append("onSubscribe received multiple subscriptions: ");
                sb.append(c);
                i.add(new IllegalStateException(sb.toString()));
            }
            return;
        }
        final int m = super.M;
        if (m != 0 && c instanceof j) {
            final j s = (j)c;
            this.S = (j<T>)s;
            if ((super.N = s.E(m)) == 1) {
                super.L = true;
                super.K = Thread.currentThread();
                try {
                    while (true) {
                        final Object poll = this.S.poll();
                        if (poll == null) {
                            break;
                        }
                        super.H.add(poll);
                    }
                    ++super.J;
                    this.R.lazySet(d.G);
                }
                finally {
                    final Throwable t;
                    super.I.add(t);
                }
                return;
            }
        }
        this.Q.l(c);
    }
    
    final n<T> l0(final int n) {
        final int n2 = super.N;
        if (n2 == n) {
            return this;
        }
        if (this.S != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fusion mode different. Expected: ");
            sb.append(s0(n));
            sb.append(", actual: ");
            sb.append(s0(n2));
            throw new AssertionError((Object)sb.toString());
        }
        throw this.b0("Upstream is not fuseable");
    }
    
    @Override
    public void m(final T t) {
        if (!super.L) {
            super.L = true;
            if (this.R.get() == null) {
                super.I.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        super.K = Thread.currentThread();
        if (super.N == 2) {
            try {
                while (true) {
                    final Object poll = this.S.poll();
                    if (poll == null) {
                        break;
                    }
                    super.H.add(poll);
                }
            }
            finally {
                final Throwable t2;
                super.I.add(t2);
                this.S.dispose();
            }
            return;
        }
        super.H.add(t);
        if (t == null) {
            super.I.add(new NullPointerException("onNext received a null value"));
        }
        this.Q.m((Object)t);
    }
    
    final n<T> m0() {
        if (this.S == null) {
            return this;
        }
        throw new AssertionError((Object)"Upstream is fuseable.");
    }
    
    public final n<T> n0() {
        if (this.R.get() != null) {
            throw this.b0("Subscribed!");
        }
        if (super.I.isEmpty()) {
            return this;
        }
        throw this.b0("Not subscribed but errors found");
    }
    
    public final n<T> o0(final g<? super n<T>> g) {
        try {
            g.accept(this);
            return this;
        }
        finally {
            final Throwable t;
            throw k.f(t);
        }
    }
    
    public final n<T> p0() {
        if (this.R.get() != null) {
            return this;
        }
        throw this.b0("Not subscribed!");
    }
    
    public final boolean t0() {
        return this.R.get() != null;
    }
    
    public final boolean u0() {
        return this.i();
    }
    
    final n<T> v0(final int m) {
        super.M = m;
        return this;
    }
    
    enum a implements i0<Object>
    {
        G;
        
        @Override
        public void b(final Throwable t) {
        }
        
        @Override
        public void f() {
        }
        
        @Override
        public void l(final c c) {
        }
        
        @Override
        public void m(final Object o) {
        }
    }
}
