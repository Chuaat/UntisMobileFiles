// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import java.util.Collection;
import com.bumptech.glide.util.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import androidx.annotation.j0;
import androidx.annotation.w;
import com.bumptech.glide.util.k;
import java.util.concurrent.Executor;
import com.bumptech.glide.request.i;
import androidx.annotation.b1;
import com.bumptech.glide.load.g;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.core.util.m;
import com.bumptech.glide.util.pool.c;
import com.bumptech.glide.util.pool.a;

class l<R> implements com.bumptech.glide.load.engine.h.b<R>, com.bumptech.glide.util.pool.a.f
{
    private static final c e0;
    final e G;
    private final com.bumptech.glide.util.pool.c H;
    private final p.a I;
    private final m.a<l<?>> J;
    private final c K;
    private final com.bumptech.glide.load.engine.m L;
    private final com.bumptech.glide.load.engine.executor.a M;
    private final com.bumptech.glide.load.engine.executor.a N;
    private final com.bumptech.glide.load.engine.executor.a O;
    private final com.bumptech.glide.load.engine.executor.a P;
    private final AtomicInteger Q;
    private g R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private v<?> W;
    com.bumptech.glide.load.a X;
    private boolean Y;
    q Z;
    private boolean a0;
    p<?> b0;
    private h<R> c0;
    private volatile boolean d0;
    
    static {
        e0 = new c();
    }
    
    l(final com.bumptech.glide.load.engine.executor.a a, final com.bumptech.glide.load.engine.executor.a a2, final com.bumptech.glide.load.engine.executor.a a3, final com.bumptech.glide.load.engine.executor.a a4, final com.bumptech.glide.load.engine.m m, final p.a a5, final m.a<l<?>> a6) {
        this(a, a2, a3, a4, m, a5, a6, l.e0);
    }
    
    @b1
    l(final com.bumptech.glide.load.engine.executor.a m, final com.bumptech.glide.load.engine.executor.a n, final com.bumptech.glide.load.engine.executor.a o, final com.bumptech.glide.load.engine.executor.a p8, final com.bumptech.glide.load.engine.m l, final p.a i, final m.a<l<?>> j, final c k) {
        this.G = new e();
        this.H = com.bumptech.glide.util.pool.c.a();
        this.Q = new AtomicInteger();
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p8;
        this.L = l;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    private com.bumptech.glide.load.engine.executor.a j() {
        com.bumptech.glide.load.engine.executor.a a;
        if (this.T) {
            a = this.O;
        }
        else if (this.U) {
            a = this.P;
        }
        else {
            a = this.N;
        }
        return a;
    }
    
    private boolean n() {
        return this.a0 || this.Y || this.d0;
    }
    
    private void r() {
        synchronized (this) {
            if (this.R != null) {
                this.G.clear();
                this.R = null;
                this.b0 = null;
                this.W = null;
                this.a0 = false;
                this.d0 = false;
                this.Y = false;
                this.c0.K(false);
                this.c0 = null;
                this.Z = null;
                this.X = null;
                this.J.a(this);
                return;
            }
            throw new IllegalArgumentException();
        }
    }
    
    @Override
    public void a(final q z) {
        synchronized (this) {
            this.Z = z;
            // monitorexit(this)
            this.o();
        }
    }
    
    void b(final i i, final Executor executor) {
        synchronized (this) {
            this.H.c();
            this.G.b(i, executor);
            final boolean y = this.Y;
            boolean b = true;
            Runnable runnable;
            if (y) {
                this.k(1);
                runnable = new b(i);
            }
            else {
                if (!this.a0) {
                    if (this.d0) {
                        b = false;
                    }
                    k.a(b, "Cannot add callbacks to a cancelled EngineJob");
                    return;
                }
                this.k(1);
                runnable = new a(i);
            }
            executor.execute(runnable);
        }
    }
    
    @Override
    public void c(final v<R> w, final com.bumptech.glide.load.a x) {
        synchronized (this) {
            this.W = w;
            this.X = x;
            // monitorexit(this)
            this.p();
        }
    }
    
    @Override
    public void d(final h<?> h) {
        this.j().execute(h);
    }
    
    @w("this")
    void e(final i i) {
        try {
            i.a(this.Z);
        }
        finally {
            final Throwable t;
            throw new com.bumptech.glide.load.engine.b(t);
        }
    }
    
    @w("this")
    void f(final i i) {
        try {
            i.c(this.b0, this.X);
        }
        finally {
            final Throwable t;
            throw new com.bumptech.glide.load.engine.b(t);
        }
    }
    
    @j0
    @Override
    public com.bumptech.glide.util.pool.c g() {
        return this.H;
    }
    
    void h() {
        if (this.n()) {
            return;
        }
        this.d0 = true;
        this.c0.h();
        this.L.c(this, this.R);
    }
    
    void i() {
        synchronized (this) {
            this.H.c();
            k.a(this.n(), "Not yet complete!");
            final int decrementAndGet = this.Q.decrementAndGet();
            k.a(decrementAndGet >= 0, "Can't decrement below 0");
            p<?> b0;
            if (decrementAndGet == 0) {
                b0 = this.b0;
                this.r();
            }
            else {
                b0 = null;
            }
            // monitorexit(this)
            if (b0 != null) {
                b0.e();
            }
        }
    }
    
    void k(final int delta) {
        synchronized (this) {
            k.a(this.n(), "Not yet complete!");
            if (this.Q.getAndAdd(delta) == 0) {
                final p<?> b0 = this.b0;
                if (b0 != null) {
                    b0.b();
                }
            }
        }
    }
    
    @b1
    l<R> l(final g r, final boolean s, final boolean t, final boolean u, final boolean v) {
        synchronized (this) {
            this.R = r;
            this.S = s;
            this.T = t;
            this.U = u;
            this.V = v;
            return this;
        }
    }
    
    boolean m() {
        synchronized (this) {
            return this.d0;
        }
    }
    
    void o() {
        synchronized (this) {
            this.H.c();
            if (this.d0) {
                this.r();
                return;
            }
            if (this.G.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (!this.a0) {
                this.a0 = true;
                final g r = this.R;
                final e h = this.G.h();
                this.k(h.size() + 1);
                // monitorexit(this)
                this.L.b(this, r, null);
                for (final d d : h) {
                    d.b.execute(new a(d.a));
                }
                this.i();
                return;
            }
            throw new IllegalStateException("Already failed once");
        }
    }
    
    void p() {
        synchronized (this) {
            this.H.c();
            if (this.d0) {
                this.W.a();
                this.r();
                return;
            }
            if (this.G.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (!this.Y) {
                this.b0 = this.K.a(this.W, this.S, this.R, this.I);
                this.Y = true;
                final e h = this.G.h();
                this.k(h.size() + 1);
                final g r = this.R;
                final p<?> b0 = this.b0;
                // monitorexit(this)
                this.L.b(this, r, b0);
                for (final d d : h) {
                    d.b.execute(new b(d.a));
                }
                this.i();
                return;
            }
            throw new IllegalStateException("Already have resource");
        }
    }
    
    boolean q() {
        return this.V;
    }
    
    void s(final i i) {
        synchronized (this) {
            this.H.c();
            this.G.k(i);
            if (this.G.isEmpty()) {
                this.h();
                if ((this.Y || this.a0) && this.Q.get() == 0) {
                    this.r();
                }
            }
        }
    }
    
    public void t(final h<R> c0) {
        synchronized (this) {
            this.c0 = c0;
            com.bumptech.glide.load.engine.executor.a a;
            if (c0.U()) {
                a = this.M;
            }
            else {
                a = this.j();
            }
            a.execute(c0);
        }
    }
    
    private class a implements Runnable
    {
        private final i G;
        
        a(final i g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            synchronized (this.G.h()) {
                synchronized (l.this) {
                    if (l.this.G.f(this.G)) {
                        l.this.e(this.G);
                    }
                    l.this.i();
                }
            }
        }
    }
    
    private class b implements Runnable
    {
        private final i G;
        
        b(final i g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            synchronized (this.G.h()) {
                synchronized (l.this) {
                    if (l.this.G.f(this.G)) {
                        l.this.b0.b();
                        l.this.f(this.G);
                        l.this.s(this.G);
                    }
                    l.this.i();
                }
            }
        }
    }
    
    @b1
    static class c
    {
        public <R> p<R> a(final v<R> v, final boolean b, final g g, final p.a a) {
            return new p<R>(v, b, true, g, a);
        }
    }
    
    static final class d
    {
        final i a;
        final Executor b;
        
        d(final i a, final Executor b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof d && this.a.equals(((d)o).a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
    
    static final class e implements Iterable<d>
    {
        private final List<d> G;
        
        e() {
            this(new ArrayList<d>(2));
        }
        
        e(final List<d> g) {
            this.G = g;
        }
        
        private static d i(final i i) {
            return new d(i, com.bumptech.glide.util.e.a());
        }
        
        void b(final i i, final Executor executor) {
            this.G.add(new d(i, executor));
        }
        
        void clear() {
            this.G.clear();
        }
        
        boolean f(final i i) {
            return this.G.contains(i(i));
        }
        
        e h() {
            return new e(new ArrayList<d>(this.G));
        }
        
        boolean isEmpty() {
            return this.G.isEmpty();
        }
        
        @j0
        @Override
        public Iterator<d> iterator() {
            return this.G.iterator();
        }
        
        void k(final i i) {
            this.G.remove(i(i));
        }
        
        int size() {
            return this.G.size();
        }
    }
}
