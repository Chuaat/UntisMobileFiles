// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.Util;
import io.realm.internal.c;
import java.util.Set;
import java.util.HashMap;
import c6.h;
import io.realm.internal.b;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.Table;
import java.util.Map;

public abstract class t0
{
    static final String h = "Null or empty class names are not allowed";
    private final Map<String, Table> a;
    private final Map<Class<? extends n0>, Table> b;
    private final Map<Class<? extends n0>, r0> c;
    private final Map<String, r0> d;
    private OsKeyPathMapping e;
    final a f;
    private final b g;
    
    t0(final a f, @h final b g) {
        this.a = new HashMap<String, Table>();
        this.b = new HashMap<Class<? extends n0>, Table>();
        this.c = new HashMap<Class<? extends n0>, r0>();
        this.d = new HashMap<String, r0>();
        this.e = null;
        this.f = f;
        this.g = g;
    }
    
    private void a() {
        if (this.q()) {
            return;
        }
        throw new IllegalStateException("Attempt to use column key before set.");
    }
    
    private boolean r(final Class<? extends n0> clazz, final Class<? extends n0> obj) {
        return clazz.equals(obj);
    }
    
    void b(String q, final String s) {
        q = Table.Q(q);
        if (this.f.J().hasTable(q)) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    void c(final String s, final String s2) {
        if (s != null && !s.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(s2);
    }
    
    public boolean d(final String s) {
        return this.f.J().hasTable(Table.Q(s));
    }
    
    public abstract r0 e(final String p0);
    
    public void f() {
        this.e = new OsKeyPathMapping(this.f.K.getNativePtr());
    }
    
    public abstract r0 g(final String p0, final String p1, final Class<?> p2, final l... p3);
    
    @h
    public abstract r0 h(final String p0);
    
    public abstract Set<r0> i();
    
    final c j(final Class<? extends n0> clazz) {
        this.a();
        return this.g.a(clazz);
    }
    
    protected final c k(final String s) {
        this.a();
        return this.g.b(s);
    }
    
    final OsKeyPathMapping l() {
        return this.e;
    }
    
    r0 m(final Class<? extends n0> clazz) {
        r0 r0 = this.c.get(clazz);
        if (r0 != null) {
            return r0;
        }
        final Class<? extends n0> g = Util.g(clazz);
        if (this.r(g, clazz)) {
            r0 = this.c.get(g);
        }
        r0 r2;
        if ((r2 = r0) == null) {
            r2 = new o(this.f, this, this.o(clazz), this.j(g));
            this.c.put(g, r2);
        }
        if (this.r(g, clazz)) {
            this.c.put(clazz, r2);
        }
        return r2;
    }
    
    r0 n(final String s) {
        final String q = Table.Q(s);
        final r0 r0 = this.d.get(q);
        if (r0 != null && r0.v().c0()) {
            final r0 r2 = r0;
            if (r0.l().equals(s)) {
                return r2;
            }
        }
        if (!this.f.J().hasTable(q)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The class ");
            sb.append(s);
            sb.append(" doesn't exist in this Realm.");
            throw new IllegalArgumentException(sb.toString());
        }
        final a f = this.f;
        final r0 r2 = new o(f, this, f.J().getTable(q));
        this.d.put(q, r2);
        return r2;
    }
    
    Table o(final Class<? extends n0> clazz) {
        Table table = this.b.get(clazz);
        if (table != null) {
            return table;
        }
        final Class<? extends n0> g = Util.g(clazz);
        if (this.r(g, clazz)) {
            table = this.b.get(g);
        }
        Table table2;
        if ((table2 = table) == null) {
            table2 = this.f.J().getTable(Table.Q(this.f.D().r().l(g)));
            this.b.put(g, table2);
        }
        if (this.r(g, clazz)) {
            this.b.put(clazz, table2);
        }
        return table2;
    }
    
    Table p(String q) {
        q = Table.Q(q);
        final Table table = this.a.get(q);
        if (table != null) {
            return table;
        }
        final Table table2 = this.f.J().getTable(q);
        this.a.put(q, table2);
        return table2;
    }
    
    final boolean q() {
        return this.g != null;
    }
    
    final void s(final String s, final r0 r0) {
        this.d.put(s, r0);
    }
    
    void t() {
        final b g = this.g;
        if (g != null) {
            g.c();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }
    
    public abstract void u(final String p0);
    
    final r0 v(final String s) {
        return this.d.remove(s);
    }
    
    public abstract r0 w(final String p0, final String p1);
}
