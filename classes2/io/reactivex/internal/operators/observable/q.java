// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.r;
import y5.n;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.v;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;
import java.util.concurrent.Callable;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import java.util.Collection;

public final class q<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final long H;
    final long I;
    final TimeUnit J;
    final j0 K;
    final Callable<U> L;
    final int M;
    final boolean N;
    
    public q(final g0<T> g0, final long h, final long i, final TimeUnit j, final j0 k, final Callable<U> l, final int m, final boolean n) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    @Override
    protected void L5(final i0<? super U> i0) {
        if (this.H == this.I && this.M == Integer.MAX_VALUE) {
            super.G.c(new b(new m<Object>((i0<? super Collection>)i0), (Callable<Collection>)this.L, this.H, this.J, this.K));
            return;
        }
        final j0.c c = this.K.c();
        final long h = this.H;
        final long j = this.I;
        final g0<T> g = (g0<T>)super.G;
        if (h == j) {
            g.c((i0<? super T>)new a(new m<Object>((i0<? super Collection>)i0), (Callable<Collection>)this.L, this.H, this.J, this.M, this.N, c));
            return;
        }
        g.c((i0<? super T>)new c(new m<Object>((i0<? super Collection>)i0), (Callable<Collection>)this.L, this.H, this.I, this.J, c));
    }
    
    static final class a<T, U extends Collection<? super T>> extends v<T, U, U> implements Runnable, c
    {
        long A0;
        final Callable<U> q0;
        final long r0;
        final TimeUnit s0;
        final int t0;
        final boolean u0;
        final j0.c v0;
        U w0;
        c x0;
        c y0;
        long z0;
        
        a(final i0<? super U> i0, final Callable<U> q0, final long r0, final TimeUnit s0, final int t0, final boolean u0, final j0.c v0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.q0 = q0;
            this.r0 = r0;
            this.s0 = s0;
            this.t0 = t0;
            this.u0 = u0;
            this.v0 = v0;
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this) {
                this.w0 = null;
                // monitorexit(this)
                super.l0.b(t);
                this.v0.dispose();
            }
        }
        
        @Override
        public void dispose() {
            if (!super.n0) {
                super.n0 = true;
                this.y0.dispose();
                this.v0.dispose();
                synchronized (this) {
                    this.w0 = null;
                }
            }
        }
        
        @Override
        public void f() {
            this.v0.dispose();
            synchronized (this) {
                final Collection<? super T> w0 = this.w0;
                this.w0 = null;
                // monitorexit(this)
                super.m0.offer(w0);
                super.o0 = true;
                if (this.e()) {
                    io.reactivex.internal.util.v.d(super.m0, super.l0, false, this, this);
                }
            }
        }
        
        @Override
        public boolean i() {
            return super.n0;
        }
        
        @Override
        public void l(c v0) {
            if (d.l(this.y0, v0)) {
                this.y0 = v0;
                try {
                    this.w0 = b.g(this.q0.call(), "The buffer supplied is null");
                    super.l0.l(this);
                    v0 = this.v0;
                    final long r0 = this.r0;
                    this.x0 = ((j0.c)v0).d(this, r0, r0, this.s0);
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    v0.dispose();
                    e.l(t, super.l0);
                    this.v0.dispose();
                }
            }
        }
        
        @Override
        public void m(final T t) {
            synchronized (this) {
                final Collection<? super T> w0 = this.w0;
                if (w0 == null) {
                    return;
                }
                w0.add(t);
                if (w0.size() < this.t0) {
                    return;
                }
                this.w0 = null;
                ++this.z0;
                // monitorexit(this)
                if (this.u0) {
                    this.x0.dispose();
                }
                this.n((U)w0, false, this);
                try {
                    final Collection<? super T> w2 = b.g(this.q0.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.w0 = (U)w2;
                        ++this.A0;
                        // monitorexit(this)
                        if (this.u0) {
                            final j0.c v0 = this.v0;
                            final long r0 = this.r0;
                            this.x0 = v0.d(this, r0, r0, this.s0);
                        }
                    }
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    super.l0.b(t2);
                    this.dispose();
                }
            }
        }
        
        public void o(final i0<? super U> i0, final U u) {
            i0.m(u);
        }
        
        @Override
        public void run() {
            try {
                final Collection<? super T> w0 = b.g(this.q0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    final Collection<? super T> w2 = this.w0;
                    if (w2 != null && this.z0 == this.A0) {
                        this.w0 = (U)w0;
                        // monitorexit(this)
                        this.n((U)w2, false, this);
                    }
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.dispose();
                super.l0.b(t);
            }
        }
    }
    
    static final class b<T, U extends Collection<? super T>> extends v<T, U, U> implements Runnable, c
    {
        final Callable<U> q0;
        final long r0;
        final TimeUnit s0;
        final j0 t0;
        c u0;
        U v0;
        final AtomicReference<c> w0;
        
        b(final i0<? super U> i0, final Callable<U> q0, final long r0, final TimeUnit s0, final j0 t0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.w0 = new AtomicReference<c>();
            this.q0 = q0;
            this.r0 = r0;
            this.s0 = s0;
            this.t0 = t0;
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this) {
                this.v0 = null;
                // monitorexit(this)
                super.l0.b(t);
                d.b(this.w0);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this.w0);
            this.u0.dispose();
        }
        
        @Override
        public void f() {
            synchronized (this) {
                final Collection<? super T> v0 = this.v0;
                this.v0 = null;
                // monitorexit(this)
                if (v0 != null) {
                    super.m0.offer(v0);
                    super.o0 = true;
                    if (this.e()) {
                        io.reactivex.internal.util.v.d(super.m0, super.l0, false, null, this);
                    }
                }
                d.b(this.w0);
            }
        }
        
        @Override
        public boolean i() {
            return this.w0.get() == d.G;
        }
        
        @Override
        public void l(c g) {
            if (d.l(this.u0, g)) {
                this.u0 = g;
                try {
                    this.v0 = io.reactivex.internal.functions.b.g(this.q0.call(), "The buffer supplied is null");
                    super.l0.l(this);
                    if (!super.n0) {
                        final j0 t0 = this.t0;
                        final long r0 = this.r0;
                        g = t0.g(this, r0, r0, this.s0);
                        if (!this.w0.compareAndSet(null, g)) {
                            g.dispose();
                        }
                    }
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.dispose();
                    e.l(t2, super.l0);
                }
            }
        }
        
        @Override
        public void m(final T t) {
            synchronized (this) {
                final Collection<? super T> v0 = this.v0;
                if (v0 == null) {
                    return;
                }
                v0.add(t);
            }
        }
        
        public void o(final i0<? super U> i0, final U u) {
            super.l0.m(u);
        }
        
        @Override
        public void run() {
            try {
                final Collection<? super T> v0 = io.reactivex.internal.functions.b.g(this.q0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    final Collection<? super T> v2 = this.v0;
                    if (v2 != null) {
                        this.v0 = (U)v0;
                    }
                    // monitorexit(this)
                    if (v2 == null) {
                        d.b(this.w0);
                        return;
                    }
                    this.k((U)v2, false, this);
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                super.l0.b(t);
                this.dispose();
            }
        }
    }
    
    static final class c<T, U extends Collection<? super T>> extends v<T, U, U> implements Runnable, io.reactivex.disposables.c
    {
        final Callable<U> q0;
        final long r0;
        final long s0;
        final TimeUnit t0;
        final j0.c u0;
        final List<U> v0;
        io.reactivex.disposables.c w0;
        
        c(final i0<? super U> i0, final Callable<U> q0, final long r0, final long s0, final TimeUnit t0, final j0.c u0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.q0 = q0;
            this.r0 = r0;
            this.s0 = s0;
            this.t0 = t0;
            this.u0 = u0;
            this.v0 = new LinkedList<U>();
        }
        
        @Override
        public void b(final Throwable t) {
            super.o0 = true;
            this.r();
            super.l0.b(t);
            this.u0.dispose();
        }
        
        @Override
        public void dispose() {
            if (!super.n0) {
                super.n0 = true;
                this.r();
                this.w0.dispose();
                this.u0.dispose();
            }
        }
        
        @Override
        public void f() {
            synchronized (this) {
                final ArrayList<Collection> list = new ArrayList<Collection>((Collection<? extends U>)this.v0);
                this.v0.clear();
                // monitorexit(this)
                final Iterator<Object> iterator = (Iterator<Object>)list.iterator();
                while (iterator.hasNext()) {
                    super.m0.offer(iterator.next());
                }
                super.o0 = true;
                if (this.e()) {
                    io.reactivex.internal.util.v.d(super.m0, super.l0, false, this.u0, this);
                }
            }
        }
        
        @Override
        public boolean i() {
            return super.n0;
        }
        
        @Override
        public void l(io.reactivex.disposables.c u0) {
            if (d.l(this.w0, u0)) {
                this.w0 = u0;
                try {
                    final Collection<? super T> collection = io.reactivex.internal.functions.b.g(this.q0.call(), "The buffer supplied is null");
                    this.v0.add((U)collection);
                    super.l0.l(this);
                    u0 = this.u0;
                    final long s0 = this.s0;
                    ((j0.c)u0).d(this, s0, s0, this.t0);
                    this.u0.c(new b((U)collection), this.r0, this.t0);
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    u0.dispose();
                    e.l(t, super.l0);
                    this.u0.dispose();
                }
            }
        }
        
        @Override
        public void m(final T t) {
            synchronized (this) {
                final Iterator<U> iterator = this.v0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().add((Object)t);
                }
            }
        }
        
        public void o(final i0<? super U> i0, final U u) {
            i0.m(u);
        }
        
        void r() {
            synchronized (this) {
                this.v0.clear();
            }
        }
        
        @Override
        public void run() {
            if (super.n0) {
                return;
            }
            try {
                final Collection<? super T> collection = io.reactivex.internal.functions.b.g(this.q0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (super.n0) {
                        return;
                    }
                    this.v0.add((U)collection);
                    // monitorexit(this)
                    this.u0.c(new a((U)collection), this.r0, this.t0);
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                super.l0.b(t);
                this.dispose();
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
                synchronized (c.this) {
                    c.this.v0.remove(this.G);
                    // monitorexit(this.H)
                    final c h = c.this;
                    h.n(this.G, false, h.u0);
                }
            }
        }
        
        final class b implements Runnable
        {
            private final U G;
            
            b(final U g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                c c = q.c.this;
                synchronized (c) {
                    q.c.this.v0.remove(this.G);
                    // monitorexit(c)
                    c = q.c.this;
                    c.n(this.G, false, c.u0);
                }
            }
        }
    }
}
