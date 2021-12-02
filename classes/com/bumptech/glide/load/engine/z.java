// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.Collections;
import android.util.Log;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.model.n;

class z implements f, a
{
    private static final String N = "SourceGenerator";
    private final g<?> G;
    private final a H;
    private int I;
    private c J;
    private Object K;
    private volatile n.a<?> L;
    private d M;
    
    z(final g<?> g, final a h) {
        this.G = g;
        this.H = h;
    }
    
    private void c(final Object obj) {
        final long b = com.bumptech.glide.util.g.b();
        try {
            final com.bumptech.glide.load.d<Object> p = this.G.p(obj);
            final e e = new e(p, obj, this.G.k());
            this.M = new d(this.L.a, this.G.o());
            this.G.d().a(this.M, (com.bumptech.glide.load.engine.cache.a.b)e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.M);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(p);
                sb.append(", duration: ");
                sb.append(com.bumptech.glide.util.g.a(b));
                Log.v("SourceGenerator", sb.toString());
            }
            this.L.c.b();
            this.J = new c(Collections.singletonList(this.L.a), this.G, this);
        }
        finally {
            this.L.c.b();
        }
    }
    
    private boolean e() {
        return this.I < this.G.g().size();
    }
    
    private void j(final n.a<?> a) {
        this.L.c.e(this.G.l(), (com.bumptech.glide.load.data.d.a<?>)new com.bumptech.glide.load.data.d.a<Object>() {
            @Override
            public void c(@j0 final Exception ex) {
                if (z.this.g(a)) {
                    z.this.i(a, ex);
                }
            }
            
            @Override
            public void f(@k0 final Object o) {
                if (z.this.g(a)) {
                    z.this.h(a, o);
                }
            }
        });
    }
    
    @Override
    public boolean a() {
        final Object k = this.K;
        if (k != null) {
            this.K = null;
            this.c(k);
        }
        final c j = this.J;
        if (j != null && j.a()) {
            return true;
        }
        this.J = null;
        this.L = null;
        boolean b;
        for (b = false; !b && this.e(); b = true) {
            this.L = (n.a<?>)(n.a)this.G.g().get(this.I++);
            if (this.L != null && (this.G.e().c(this.L.c.d()) || this.G.t(this.L.c.a()))) {
                this.j(this.L);
            }
        }
        return b;
    }
    
    @Override
    public void b(final com.bumptech.glide.load.g g, final Exception ex, final com.bumptech.glide.load.data.d<?> d, final com.bumptech.glide.load.a a) {
        this.H.b(g, ex, d, this.L.c.d());
    }
    
    @Override
    public void cancel() {
        final n.a<?> l = this.L;
        if (l != null) {
            l.c.cancel();
        }
    }
    
    @Override
    public void d() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void f(final com.bumptech.glide.load.g g, final Object o, final com.bumptech.glide.load.data.d<?> d, final com.bumptech.glide.load.a a, final com.bumptech.glide.load.g g2) {
        this.H.f(g, o, d, this.L.c.d(), g);
    }
    
    boolean g(final n.a<?> a) {
        final n.a<?> l = this.L;
        return l != null && l == a;
    }
    
    void h(final n.a<?> a, final Object k) {
        final j e = this.G.e();
        if (k != null && e.c(a.c.d())) {
            this.K = k;
            this.H.d();
        }
        else {
            final a h = this.H;
            final com.bumptech.glide.load.g a2 = a.a;
            final com.bumptech.glide.load.data.d<?> c = a.c;
            h.f(a2, k, c, c.d(), this.M);
        }
    }
    
    void i(final n.a<?> a, @j0 final Exception ex) {
        final a h = this.H;
        final d m = this.M;
        final com.bumptech.glide.load.data.d<?> c = a.c;
        h.b(m, ex, c, c.d());
    }
}
