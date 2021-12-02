// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import java.util.Collections;
import com.bumptech.glide.load.engine.cache.i;
import com.bumptech.glide.manager.f;
import android.content.Context;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.g;
import java.util.List;
import androidx.annotation.k0;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.load.engine.cache.l;
import com.bumptech.glide.load.engine.executor.a;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.k;
import java.util.Map;

public final class c
{
    private final Map<Class<?>, m<?, ?>> a;
    private k b;
    private e c;
    private b d;
    private j e;
    private a f;
    private a g;
    private com.bumptech.glide.load.engine.cache.a.a h;
    private l i;
    private d j;
    private int k;
    private com.bumptech.glide.b.a l;
    @k0
    private com.bumptech.glide.manager.l.b m;
    private a n;
    private boolean o;
    @k0
    private List<g<Object>> p;
    private boolean q;
    private boolean r;
    
    public c() {
        this.a = new androidx.collection.a<Class<?>, m<?, ?>>();
        this.k = 4;
        this.l = new com.bumptech.glide.b.a() {
            @j0
            @Override
            public h h() {
                return new h();
            }
        };
    }
    
    @j0
    public c a(@j0 final g<Object> g) {
        if (this.p == null) {
            this.p = new ArrayList<g<Object>>();
        }
        this.p.add(g);
        return this;
    }
    
    @j0
    com.bumptech.glide.b b(@j0 final Context context) {
        if (this.f == null) {
            this.f = com.bumptech.glide.load.engine.executor.a.j();
        }
        if (this.g == null) {
            this.g = com.bumptech.glide.load.engine.executor.a.f();
        }
        if (this.n == null) {
            this.n = com.bumptech.glide.load.engine.executor.a.c();
        }
        if (this.i == null) {
            this.i = new l.a(context).a();
        }
        if (this.j == null) {
            this.j = new f();
        }
        if (this.c == null) {
            final int b = this.i.b();
            if (b > 0) {
                this.c = new com.bumptech.glide.load.engine.bitmap_recycle.k(b);
            }
            else {
                this.c = new com.bumptech.glide.load.engine.bitmap_recycle.f();
            }
        }
        if (this.d == null) {
            this.d = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.i.a());
        }
        if (this.e == null) {
            this.e = new i(this.i.d());
        }
        if (this.h == null) {
            this.h = new com.bumptech.glide.load.engine.cache.h(context);
        }
        if (this.b == null) {
            this.b = new k(this.e, this.h, this.g, this.f, com.bumptech.glide.load.engine.executor.a.m(), this.n, this.o);
        }
        final List<g<Object>> p = this.p;
        Object p2;
        if (p == null) {
            p2 = Collections.emptyList();
        }
        else {
            p2 = Collections.unmodifiableList((List<?>)p);
        }
        this.p = (List<g<Object>>)p2;
        return new com.bumptech.glide.b(context, this.b, this.e, this.c, this.d, new com.bumptech.glide.manager.l(this.m), this.j, this.k, this.l, this.a, this.p, this.q, this.r);
    }
    
    @j0
    public c c(@k0 final a n) {
        this.n = n;
        return this;
    }
    
    @j0
    public c d(@k0 final b d) {
        this.d = d;
        return this;
    }
    
    @j0
    public c e(@k0 final e c) {
        this.c = c;
        return this;
    }
    
    @j0
    public c f(@k0 final d j) {
        this.j = j;
        return this;
    }
    
    @j0
    public c g(@j0 final com.bumptech.glide.b.a a) {
        this.l = com.bumptech.glide.util.k.d(a);
        return this;
    }
    
    @j0
    public c h(@k0 final h h) {
        return this.g(new com.bumptech.glide.b.a() {
            @j0
            @Override
            public h h() {
                h a = h;
                if (a == null) {
                    a = new h();
                }
                return a;
            }
        });
    }
    
    @j0
    public <T> c i(@j0 final Class<T> clazz, @k0 final m<?, T> m) {
        this.a.put(clazz, m);
        return this;
    }
    
    @j0
    public c j(@k0 final com.bumptech.glide.load.engine.cache.a.a h) {
        this.h = h;
        return this;
    }
    
    @j0
    public c k(@k0 final a g) {
        this.g = g;
        return this;
    }
    
    c l(final k b) {
        this.b = b;
        return this;
    }
    
    public c m(final boolean r) {
        if (!androidx.core.os.a.g()) {
            return this;
        }
        this.r = r;
        return this;
    }
    
    @j0
    public c n(final boolean o) {
        this.o = o;
        return this;
    }
    
    @j0
    public c o(final int k) {
        if (k >= 2 && k <= 6) {
            this.k = k;
            return this;
        }
        throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
    }
    
    public c p(final boolean q) {
        this.q = q;
        return this;
    }
    
    @j0
    public c q(@k0 final j e) {
        this.e = e;
        return this;
    }
    
    @j0
    public c r(@j0 final l.a a) {
        return this.s(a.a());
    }
    
    @j0
    public c s(@k0 final l i) {
        this.i = i;
        return this;
    }
    
    void t(@k0 final com.bumptech.glide.manager.l.b m) {
        this.m = m;
    }
    
    @Deprecated
    public c u(@k0 final a a) {
        return this.v(a);
    }
    
    @j0
    public c v(@k0 final a f) {
        this.f = f;
        return this;
    }
}
