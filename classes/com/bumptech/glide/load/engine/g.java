// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import java.util.Iterator;
import com.bumptech.glide.load.resource.c;
import com.bumptech.glide.load.m;
import java.io.File;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.util.ArrayList;
import java.util.Map;
import com.bumptech.glide.load.j;
import com.bumptech.glide.d;
import com.bumptech.glide.load.model.n;
import java.util.List;

final class g<Transcode>
{
    private final List<n.a<?>> a;
    private final List<com.bumptech.glide.load.g> b;
    private d c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private h.e h;
    private j i;
    private Map<Class<?>, com.bumptech.glide.load.n<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private com.bumptech.glide.load.g n;
    private com.bumptech.glide.h o;
    private com.bumptech.glide.load.engine.j p;
    private boolean q;
    private boolean r;
    
    g() {
        this.a = new ArrayList<n.a<?>>();
        this.b = new ArrayList<com.bumptech.glide.load.g>();
    }
    
    void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }
    
    b b() {
        return this.c.b();
    }
    
    List<com.bumptech.glide.load.g> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            final List<n.a<?>> g = this.g();
            for (int size = g.size(), i = 0; i < size; ++i) {
                final n.a a = (n.a)g.get(i);
                if (!this.b.contains(((n.a)a).a)) {
                    this.b.add(((n.a)a).a);
                }
                for (int j = 0; j < ((n.a)a).b.size(); ++j) {
                    if (!this.b.contains(((n.a)a).b.get(j))) {
                        this.b.add(((n.a)a).b.get(j));
                    }
                }
            }
        }
        return this.b;
    }
    
    a d() {
        return this.h.a();
    }
    
    com.bumptech.glide.load.engine.j e() {
        return this.p;
    }
    
    int f() {
        return this.f;
    }
    
    List<n.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            final List<n<Object, ?>> i = this.c.h().i(this.d);
            for (int j = 0; j < i.size(); ++j) {
                final n.a<Object> b = i.get(j).b(this.d, this.e, this.f, this.i);
                if (b != null) {
                    this.a.add((n.a<?>)b);
                }
            }
        }
        return this.a;
    }
    
     <Data> t<Data, ?, Transcode> h(final Class<Data> clazz) {
        return this.c.h().h(clazz, this.g, this.k);
    }
    
    Class<?> i() {
        return this.d.getClass();
    }
    
    List<n<File, ?>> j(final File file) throws com.bumptech.glide.j.c {
        return this.c.h().i(file);
    }
    
    j k() {
        return this.i;
    }
    
    com.bumptech.glide.h l() {
        return this.o;
    }
    
    List<Class<?>> m() {
        return this.c.h().j(this.d.getClass(), this.g, this.k);
    }
    
     <Z> m<Z> n(final v<Z> v) {
        return this.c.h().k(v);
    }
    
    com.bumptech.glide.load.g o() {
        return this.n;
    }
    
     <X> com.bumptech.glide.load.d<X> p(final X x) throws com.bumptech.glide.j.e {
        return this.c.h().m(x);
    }
    
    Class<?> q() {
        return this.k;
    }
    
     <Z> com.bumptech.glide.load.n<Z> r(final Class<Z> obj) {
        com.bumptech.glide.load.n<?> n2;
        final com.bumptech.glide.load.n<?> n = n2 = this.j.get(obj);
        Label_0085: {
            if (n == null) {
                final Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.n<?>>> iterator = this.j.entrySet().iterator();
                Map.Entry<Class<?>, com.bumptech.glide.load.n<?>> entry;
                do {
                    n2 = n;
                    if (!iterator.hasNext()) {
                        break Label_0085;
                    }
                    entry = iterator.next();
                } while (!entry.getKey().isAssignableFrom(obj));
                n2 = entry.getValue();
            }
        }
        if (n2 != null) {
            return (com.bumptech.glide.load.n<Z>)n2;
        }
        if (this.j.isEmpty() && this.q) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Missing transformation for ");
            sb.append(obj);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (com.bumptech.glide.load.n<Z>)com.bumptech.glide.load.resource.c.c();
    }
    
    int s() {
        return this.e;
    }
    
    boolean t(final Class<?> clazz) {
        return this.h(clazz) != null;
    }
    
     <R> void u(final d c, final Object d, final com.bumptech.glide.load.g n, final int e, final int f, final com.bumptech.glide.load.engine.j p14, final Class<?> g, final Class<R> k, final com.bumptech.glide.h o, final j i, final Map<Class<?>, com.bumptech.glide.load.n<?>> j, final boolean q, final boolean r, final h.e h) {
        this.c = c;
        this.d = d;
        this.n = n;
        this.e = e;
        this.f = f;
        this.p = p14;
        this.g = g;
        this.h = h;
        this.k = (Class<Transcode>)k;
        this.o = o;
        this.i = i;
        this.j = j;
        this.q = q;
        this.r = r;
    }
    
    boolean v(final v<?> v) {
        return this.c.h().n(v);
    }
    
    boolean w() {
        return this.r;
    }
    
    boolean x(final com.bumptech.glide.load.g g) {
        final List<n.a<?>> g2 = this.g();
        for (int size = g2.size(), i = 0; i < size; ++i) {
            if (((n.a)(n.a)g2.get(i)).a.equals(g)) {
                return true;
            }
        }
        return false;
    }
}
