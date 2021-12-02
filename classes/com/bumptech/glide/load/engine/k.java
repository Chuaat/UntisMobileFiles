// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.b;
import java.util.concurrent.ExecutorService;
import com.bumptech.glide.util.e;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import com.bumptech.glide.request.i;
import java.util.Map;
import com.bumptech.glide.d;
import androidx.annotation.k0;
import com.bumptech.glide.load.g;
import androidx.annotation.b1;
import android.util.Log;
import com.bumptech.glide.load.engine.cache.j;

public class k implements m, j.a, p.a
{
    private static final String i = "Engine";
    private static final int j = 150;
    private static final boolean k;
    private final s a;
    private final o b;
    private final j c;
    private final b d;
    private final y e;
    private final c f;
    private final a g;
    private final com.bumptech.glide.load.engine.a h;
    
    static {
        k = Log.isLoggable("Engine", 2);
    }
    
    @b1
    k(final j c, final com.bumptech.glide.load.engine.cache.a.a a, final com.bumptech.glide.load.engine.executor.a a2, final com.bumptech.glide.load.engine.executor.a a3, final com.bumptech.glide.load.engine.executor.a a4, final com.bumptech.glide.load.engine.executor.a a5, s a6, final o o, final com.bumptech.glide.load.engine.a a7, final b b, final a a8, final y y, final boolean b2) {
        this.c = c;
        final c f = new c(a);
        this.f = f;
        com.bumptech.glide.load.engine.a h;
        if (a7 == null) {
            h = new com.bumptech.glide.load.engine.a(b2);
        }
        else {
            h = a7;
        }
        (this.h = h).g(this);
        o b3;
        if (o == null) {
            b3 = new o();
        }
        else {
            b3 = o;
        }
        this.b = b3;
        if (a6 == null) {
            a6 = new s();
        }
        this.a = a6;
        b d;
        if (b == null) {
            d = new b(a2, a3, a4, a5, this, this);
        }
        else {
            d = b;
        }
        this.d = d;
        a g;
        if (a8 == null) {
            g = new a(f);
        }
        else {
            g = a8;
        }
        this.g = g;
        y e;
        if (y == null) {
            e = new y();
        }
        else {
            e = y;
        }
        this.e = e;
        c.h((j.a)this);
    }
    
    public k(final j j, final com.bumptech.glide.load.engine.cache.a.a a, final com.bumptech.glide.load.engine.executor.a a2, final com.bumptech.glide.load.engine.executor.a a3, final com.bumptech.glide.load.engine.executor.a a4, final com.bumptech.glide.load.engine.executor.a a5, final boolean b) {
        this(j, a, a2, a3, a4, a5, null, null, null, null, null, null, b);
    }
    
    private p<?> f(final g g) {
        final v<?> g2 = this.c.g(g);
        p<?> p;
        if (g2 == null) {
            p = null;
        }
        else if (g2 instanceof p) {
            p = (p<?>)g2;
        }
        else {
            p = new p<Object>(g2, true, true, g, (p.a)this);
        }
        return p;
    }
    
    @k0
    private p<?> h(final g g) {
        final p<?> e = this.h.e(g);
        if (e != null) {
            e.b();
        }
        return e;
    }
    
    private p<?> i(final g g) {
        final p<?> f = this.f(g);
        if (f != null) {
            f.b();
            this.h.a(g, f);
        }
        return f;
    }
    
    @k0
    private p<?> j(final n n, final boolean b, final long n2) {
        if (!b) {
            return null;
        }
        final p<?> h = this.h(n);
        if (h != null) {
            if (com.bumptech.glide.load.engine.k.k) {
                k("Loaded resource from active resources", n2, n);
            }
            return h;
        }
        final p<?> i = this.i(n);
        if (i != null) {
            if (com.bumptech.glide.load.engine.k.k) {
                k("Loaded resource from cache", n2, n);
            }
            return i;
        }
        return null;
    }
    
    private static void k(final String str, final long n, final g obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(com.bumptech.glide.util.g.a(n));
        sb.append("ms, key: ");
        sb.append(obj);
        Log.v("Engine", sb.toString());
    }
    
    private <R> d n(final com.bumptech.glide.d d, final Object o, final g g, final int n, final int n2, final Class<?> clazz, final Class<R> clazz2, final com.bumptech.glide.h h, final com.bumptech.glide.load.engine.j j, final Map<Class<?>, com.bumptech.glide.load.n<?>> map, final boolean b, final boolean b2, final com.bumptech.glide.load.j i, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final i k, final Executor executor, final n n3, final long n4) {
        final l<?> a = this.a.a(n3, b6);
        if (a != null) {
            a.b(k, executor);
            if (k.k) {
                k("Added to existing load", n4, n3);
            }
            return new d(k, a);
        }
        final l<Object> a2 = this.d.a(n3, b3, b4, b5, b6);
        final h<R> a3 = this.g.a(d, o, n3, g, n, n2, clazz, clazz2, h, j, map, b, b2, b6, i, (h.b<R>)a2);
        this.a.d(n3, a2);
        a2.b(k, executor);
        a2.t(a3);
        if (k.k) {
            k("Started new load", n4, n3);
        }
        return new d(k, a2);
    }
    
    @Override
    public void a(@j0 final v<?> v) {
        this.e.a(v, true);
    }
    
    @Override
    public void b(final l<?> l, final g g, final p<?> p3) {
        // monitorenter(this)
        Label_0022: {
            if (p3 == null) {
                break Label_0022;
            }
            try {
                if (p3.d()) {
                    this.h.a(g, p3);
                }
                this.a.e(g, l);
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @Override
    public void c(final l<?> l, final g g) {
        synchronized (this) {
            this.a.e(g, l);
        }
    }
    
    @Override
    public void d(final g g, final p<?> p2) {
        this.h.d(g);
        if (p2.d()) {
            this.c.f(g, p2);
        }
        else {
            this.e.a(p2, false);
        }
    }
    
    public void e() {
        this.f.a().clear();
    }
    
    public <R> d g(final com.bumptech.glide.d d, final Object o, final g g, final int n, final int n2, final Class<?> clazz, final Class<R> clazz2, final com.bumptech.glide.h h, final com.bumptech.glide.load.engine.j j, final Map<Class<?>, com.bumptech.glide.load.n<?>> map, final boolean b, final boolean b2, final com.bumptech.glide.load.j i, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final i k, final Executor executor) {
        long b7;
        if (k.k) {
            b7 = com.bumptech.glide.util.g.b();
        }
        else {
            b7 = 0L;
        }
        final n a = this.b.a(o, g, n, n2, map, clazz, clazz2, i);
        synchronized (this) {
            final p<?> l = this.j(a, b3, b7);
            if (l == null) {
                return this.n(d, o, g, n, n2, clazz, clazz2, h, j, map, b, b2, i, b3, b4, b5, b6, k, executor, a, b7);
            }
            // monitorexit(this)
            k.c(l, com.bumptech.glide.load.a.K);
            return null;
        }
    }
    
    public void l(final v<?> v) {
        if (v instanceof p) {
            ((p)v).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
    
    @b1
    public void m() {
        this.d.b();
        this.f.b();
        this.h.h();
    }
    
    @b1
    static class a
    {
        final h.e a;
        final androidx.core.util.m.a<h<?>> b;
        private int c;
        
        a(final h.e a) {
            this.b = com.bumptech.glide.util.pool.a.e(150, (com.bumptech.glide.util.pool.a.d<h<?>>)new com.bumptech.glide.util.pool.a.d<h<?>>() {
                public h<?> a() {
                    final k.a a = com.bumptech.glide.load.engine.k.a.this;
                    return new h<Object>(a.a, a.b);
                }
            });
            this.a = a;
        }
        
         <R> h<R> a(final com.bumptech.glide.d d, final Object o, final n n, final g g, final int n2, final int n3, final Class<?> clazz, final Class<R> clazz2, final com.bumptech.glide.h h, final com.bumptech.glide.load.engine.j j, final Map<Class<?>, com.bumptech.glide.load.n<?>> map, final boolean b, final boolean b2, final boolean b3, final com.bumptech.glide.load.j i, final h.b<R> b4) {
            return (h<R>)com.bumptech.glide.util.k.d(this.b.b()).u(d, o, n, g, n2, n3, clazz, clazz2, h, j, map, b, b2, b3, i, (h.b<?>)b4, this.c++);
        }
    }
    
    @b1
    static class b
    {
        final com.bumptech.glide.load.engine.executor.a a;
        final com.bumptech.glide.load.engine.executor.a b;
        final com.bumptech.glide.load.engine.executor.a c;
        final com.bumptech.glide.load.engine.executor.a d;
        final m e;
        final p.a f;
        final androidx.core.util.m.a<l<?>> g;
        
        b(final com.bumptech.glide.load.engine.executor.a a, final com.bumptech.glide.load.engine.executor.a b, final com.bumptech.glide.load.engine.executor.a c, final com.bumptech.glide.load.engine.executor.a d, final m e, final p.a f) {
            this.g = com.bumptech.glide.util.pool.a.e(150, (com.bumptech.glide.util.pool.a.d<l<?>>)new com.bumptech.glide.util.pool.a.d<l<?>>() {
                public l<?> a() {
                    final b a = com.bumptech.glide.load.engine.k.b.this;
                    return new l<Object>(a.a, a.b, a.c, a.d, a.e, a.f, a.g);
                }
            });
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
         <R> l<R> a(final g g, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
            return (l<R>)com.bumptech.glide.util.k.d(this.g.b()).l(g, b, b2, b3, b4);
        }
        
        @b1
        void b() {
            com.bumptech.glide.util.e.c(this.a);
            com.bumptech.glide.util.e.c(this.b);
            com.bumptech.glide.util.e.c(this.c);
            com.bumptech.glide.util.e.c(this.d);
        }
    }
    
    private static class c implements e
    {
        private final a.a a;
        private volatile com.bumptech.glide.load.engine.cache.a b;
        
        c(final a.a a) {
            this.a = a;
        }
        
        @Override
        public com.bumptech.glide.load.engine.cache.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.h();
                    }
                    if (this.b == null) {
                        this.b = new b();
                    }
                }
            }
            return this.b;
        }
        
        @b1
        void b() {
            synchronized (this) {
                if (this.b == null) {
                    return;
                }
                this.b.clear();
            }
        }
    }
    
    public class d
    {
        private final l<?> a;
        private final i b;
        
        d(final i b, final l<?> a) {
            this.b = b;
            this.a = a;
        }
        
        public void a() {
            synchronized (com.bumptech.glide.load.engine.k.this) {
                this.a.s(this.b);
            }
        }
    }
}
