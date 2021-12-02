// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.u;
import io.reactivex.internal.util.v;
import o7.d;
import io.reactivex.internal.subscribers.n;
import io.reactivex.subscribers.e;
import o7.c;
import io.reactivex.l;
import java.util.concurrent.Callable;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import java.util.Collection;

public final class q<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, U>
{
    final long I;
    final long J;
    final TimeUnit K;
    final j0 L;
    final Callable<U> M;
    final int N;
    final boolean O;
    
    public q(final l<T> l, final long i, final long j, final TimeUnit k, final j0 m, final Callable<U> m2, final int n, final boolean o) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
        this.M = m2;
        this.N = n;
        this.O = o;
    }
    
    @Override
    protected void n6(final o7.c<? super U> c) {
        if (this.I == this.J && this.N == Integer.MAX_VALUE) {
            super.H.m6(new b((o7.c<? super Collection>)new e((o7.c<? super Object>)c), (Callable<Collection>)this.M, this.I, this.K, this.L));
            return;
        }
        final j0.c c2 = this.L.c();
        final long i = this.I;
        final long j = this.J;
        final l<T> h = (l<T>)super.H;
        if (i == j) {
            h.m6((io.reactivex.q<? super T>)new a((o7.c<? super Collection>)new e((o7.c<? super Object>)c), (Callable<Collection>)this.M, this.I, this.K, this.N, this.O, c2));
            return;
        }
        h.m6((io.reactivex.q<? super T>)new c((o7.c<? super Collection>)new e((o7.c<? super Object>)c), (Callable<Collection>)this.M, this.I, this.J, this.K, c2));
    }
    
    static final class a<T, U extends Collection<? super T>> extends n<T, U, U> implements d, Runnable, io.reactivex.disposables.c
    {
        final Callable<U> G0;
        final long H0;
        final TimeUnit I0;
        final int J0;
        final boolean K0;
        final j0.c L0;
        U M0;
        io.reactivex.disposables.c N0;
        d O0;
        long P0;
        long Q0;
        
        a(final c<? super U> c, final Callable<U> g0, final long h0, final TimeUnit i0, final int j0, final boolean k0, final j0.c l0) {
            super(c, new io.reactivex.internal.queue.a());
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = j0;
            this.K0 = k0;
            this.L0 = l0;
        }
        
        public void b(final Throwable t) {
            synchronized (this) {
                this.M0 = null;
                // monitorexit(this)
                super.B0.b(t);
                this.L0.dispose();
            }
        }
        
        public void cancel() {
            if (!super.D0) {
                super.D0 = true;
                this.dispose();
            }
        }
        
        public void dispose() {
            synchronized (this) {
                this.M0 = null;
                // monitorexit(this)
                this.O0.cancel();
                this.L0.dispose();
            }
        }
        
        public void f() {
            synchronized (this) {
                final Collection<? super T> m0 = this.M0;
                this.M0 = null;
                // monitorexit(this)
                super.C0.offer(m0);
                super.E0 = true;
                if (this.e()) {
                    v.e(super.C0, (c<? super U>)super.B0, false, this, this);
                }
                this.L0.dispose();
            }
        }
        
        public boolean i() {
            return this.L0.i();
        }
        
        public void m(final T t) {
            synchronized (this) {
                final Collection<? super T> m0 = this.M0;
                if (m0 == null) {
                    return;
                }
                m0.add(t);
                if (m0.size() < this.J0) {
                    return;
                }
                this.M0 = null;
                ++this.P0;
                // monitorexit(this)
                if (this.K0) {
                    this.N0.dispose();
                }
                this.o((U)m0, false, this);
                try {
                    final Collection<? super T> m2 = io.reactivex.internal.functions.b.g(this.G0.call(), "The supplied buffer is null");
                    synchronized (this) {
                        this.M0 = (U)m2;
                        ++this.Q0;
                        // monitorexit(this)
                        if (this.K0) {
                            final j0.c l0 = this.L0;
                            final long h0 = this.H0;
                            this.N0 = l0.d(this, h0, h0, this.I0);
                        }
                    }
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.cancel();
                    super.B0.b(t2);
                }
            }
        }
        
        public boolean q(final c<? super U> c, final U u) {
            c.m((Object)u);
            return true;
        }
        
        public void run() {
            try {
                final Collection<? super T> m0 = io.reactivex.internal.functions.b.g(this.G0.call(), "The supplied buffer is null");
                synchronized (this) {
                    final Collection<? super T> m2 = this.M0;
                    if (m2 != null && this.P0 == this.Q0) {
                        this.M0 = (U)m0;
                        // monitorexit(this)
                        this.o((U)m2, false, this);
                    }
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.cancel();
                super.B0.b(t);
            }
        }
        
        public void v(final long n) {
            this.p(n);
        }
        
        public void z(final d o0) {
            if (!j.o(this.O0, o0)) {
                return;
            }
            this.O0 = o0;
            try {
                this.M0 = io.reactivex.internal.functions.b.g(this.G0.call(), "The supplied buffer is null");
                super.B0.z((d)this);
                final j0.c l0 = this.L0;
                final long h0 = this.H0;
                this.N0 = l0.d(this, h0, h0, this.I0);
                o0.v(Long.MAX_VALUE);
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.L0.dispose();
                o0.cancel();
                g.d(t, (c<?>)super.B0);
            }
        }
    }
    
    static final class b<T, U extends Collection<? super T>> extends n<T, U, U> implements d, Runnable, io.reactivex.disposables.c
    {
        final Callable<U> G0;
        final long H0;
        final TimeUnit I0;
        final j0 J0;
        d K0;
        U L0;
        final AtomicReference<io.reactivex.disposables.c> M0;
        
        b(final c<? super U> c, final Callable<U> g0, final long h0, final TimeUnit i0, final j0 j0) {
            super(c, new io.reactivex.internal.queue.a());
            this.M0 = new AtomicReference<io.reactivex.disposables.c>();
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = j0;
        }
        
        public void b(final Throwable t) {
            io.reactivex.internal.disposables.d.b(this.M0);
            synchronized (this) {
                this.L0 = null;
                // monitorexit(this)
                super.B0.b(t);
            }
        }
        
        public void cancel() {
            super.D0 = true;
            this.K0.cancel();
            io.reactivex.internal.disposables.d.b(this.M0);
        }
        
        public void dispose() {
            this.cancel();
        }
        
        public void f() {
            io.reactivex.internal.disposables.d.b(this.M0);
            synchronized (this) {
                final Collection<? super T> l0 = this.L0;
                if (l0 == null) {
                    return;
                }
                this.L0 = null;
                // monitorexit(this)
                super.C0.offer(l0);
                super.E0 = true;
                if (this.e()) {
                    v.e(super.C0, (c<? super U>)super.B0, false, null, this);
                }
            }
        }
        
        public boolean i() {
            return this.M0.get() == io.reactivex.internal.disposables.d.G;
        }
        
        public void m(final T t) {
            synchronized (this) {
                final Collection<? super T> l0 = this.L0;
                if (l0 != null) {
                    l0.add(t);
                }
            }
        }
        
        public boolean q(final c<? super U> c, final U u) {
            super.B0.m((Object)u);
            return true;
        }
        
        public void run() {
            try {
                final Collection<? super T> l0 = io.reactivex.internal.functions.b.g(this.G0.call(), "The supplied buffer is null");
                synchronized (this) {
                    final Collection<? super T> l2 = this.L0;
                    if (l2 == null) {
                        return;
                    }
                    this.L0 = (U)l0;
                    // monitorexit(this)
                    this.n((U)l2, false, this);
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.cancel();
                super.B0.b(t);
            }
        }
        
        public void v(final long n) {
            this.p(n);
        }
        
        public void z(final d k0) {
            if (j.o(this.K0, k0)) {
                this.K0 = k0;
                try {
                    this.L0 = io.reactivex.internal.functions.b.g(this.G0.call(), "The supplied buffer is null");
                    super.B0.z((d)this);
                    if (!super.D0) {
                        k0.v(Long.MAX_VALUE);
                        final j0 j0 = this.J0;
                        final long h0 = this.H0;
                        final io.reactivex.disposables.c g = j0.g(this, h0, h0, this.I0);
                        if (!this.M0.compareAndSet(null, g)) {
                            g.dispose();
                        }
                    }
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    this.cancel();
                    g.d(t, (c<?>)super.B0);
                }
            }
        }
    }
    
    static final class c<T, U extends Collection<? super T>> extends n<T, U, U> implements d, Runnable
    {
        final Callable<U> G0;
        final long H0;
        final long I0;
        final TimeUnit J0;
        final j0.c K0;
        final List<U> L0;
        d M0;
        
        c(final o7.c<? super U> c, final Callable<U> g0, final long h0, final long i0, final TimeUnit j0, final j0.c k0) {
            super(c, new io.reactivex.internal.queue.a());
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = j0;
            this.K0 = k0;
            this.L0 = new LinkedList<U>();
        }
        
        public void b(final Throwable t) {
            super.E0 = true;
            this.K0.dispose();
            this.s();
            super.B0.b(t);
        }
        
        public void cancel() {
            super.D0 = true;
            this.M0.cancel();
            this.K0.dispose();
            this.s();
        }
        
        public void f() {
            synchronized (this) {
                final ArrayList<Collection> list = new ArrayList<Collection>((Collection<? extends U>)this.L0);
                this.L0.clear();
                // monitorexit(this)
                final Iterator<Object> iterator = (Iterator<Object>)list.iterator();
                while (iterator.hasNext()) {
                    super.C0.offer(iterator.next());
                }
                super.E0 = true;
                if (this.e()) {
                    v.e(super.C0, (o7.c<? super U>)super.B0, false, this.K0, this);
                }
            }
        }
        
        public void m(final T t) {
            synchronized (this) {
                final Iterator<U> iterator = this.L0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().add((Object)t);
                }
            }
        }
        
        public boolean q(final o7.c<? super U> c, final U u) {
            c.m((Object)u);
            return true;
        }
        
        public void run() {
            if (super.D0) {
                return;
            }
            try {
                final Collection<? super T> collection = io.reactivex.internal.functions.b.g(this.G0.call(), "The supplied buffer is null");
                synchronized (this) {
                    if (super.D0) {
                        return;
                    }
                    this.L0.add((U)collection);
                    // monitorexit(this)
                    this.K0.c(new a((U)collection), this.H0, this.J0);
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.cancel();
                super.B0.b(t);
            }
        }
        
        void s() {
            synchronized (this) {
                this.L0.clear();
            }
        }
        
        public void v(final long n) {
            this.p(n);
        }
        
        public void z(d k0) {
            if (!j.o(this.M0, k0)) {
                return;
            }
            this.M0 = k0;
            try {
                final Collection<? super T> collection = io.reactivex.internal.functions.b.g(this.G0.call(), "The supplied buffer is null");
                this.L0.add((U)collection);
                super.B0.z((d)this);
                k0.v(Long.MAX_VALUE);
                k0 = (d)this.K0;
                final long i0 = this.I0;
                ((j0.c)k0).d(this, i0, i0, this.J0);
                this.K0.c(new a((U)collection), this.H0, this.J0);
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.K0.dispose();
                k0.cancel();
                g.d(t, (o7.c<?>)super.B0);
            }
        }
        
        final class a implements Runnable
        {
            private final U G;
            
            a(final U g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                c c = io.reactivex.internal.operators.flowable.q.c.this;
                synchronized (c) {
                    io.reactivex.internal.operators.flowable.q.c.this.L0.remove(this.G);
                    // monitorexit(c)
                    c = io.reactivex.internal.operators.flowable.q.c.this;
                    c.o(this.G, false, c.K0);
                }
            }
        }
    }
}
