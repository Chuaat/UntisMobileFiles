// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import java.security.Permission;

public final class d
{
    private static d f;
    private e a;
    private e b;
    private e c;
    private e d;
    private e e;
    
    protected d() {
        final o a = o.a;
        final s a2 = s.a;
        final b a3 = org.joda.time.convert.b.a;
        final f a4 = org.joda.time.convert.f.a;
        final j a5 = j.a;
        final k a6 = k.a;
        this.a = new e(new c[] { a, a2, a3, a4, a5, a6 });
        this.b = new e(new c[] { q.a, a, a2, a3, a4, a5, a6 });
        final n a7 = n.a;
        final p a8 = p.a;
        this.c = new e(new c[] { a7, a8, a2, a5, a6 });
        this.d = new e(new c[] { a7, r.a, a8, a2, a6 });
        this.e = new e(new c[] { a8, a2, a6 });
    }
    
    private void f() throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new org.joda.time.s("ConverterManager.alterDurationConverters"));
        }
    }
    
    private void g() throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new org.joda.time.s("ConverterManager.alterInstantConverters"));
        }
    }
    
    private void h() throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new org.joda.time.s("ConverterManager.alterIntervalConverters"));
        }
    }
    
    private void i() throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new org.joda.time.s("ConverterManager.alterPartialConverters"));
        }
    }
    
    private void j() throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new org.joda.time.s("ConverterManager.alterPeriodConverters"));
        }
    }
    
    public static d m() {
        if (d.f == null) {
            d.f = new d();
        }
        return d.f;
    }
    
    public g a(final g g) throws SecurityException {
        this.f();
        if (g == null) {
            return null;
        }
        final g[] array = { null };
        this.c = this.c.a(g, array);
        return array[0];
    }
    
    public h b(final h h) throws SecurityException {
        this.g();
        if (h == null) {
            return null;
        }
        final h[] array = { null };
        this.a = this.a.a(h, array);
        return array[0];
    }
    
    public i c(final i i) throws SecurityException {
        this.h();
        if (i == null) {
            return null;
        }
        final i[] array = { null };
        this.e = this.e.a(i, array);
        return array[0];
    }
    
    public l d(final l l) throws SecurityException {
        this.i();
        if (l == null) {
            return null;
        }
        final l[] array = { null };
        this.b = this.b.a(l, array);
        return array[0];
    }
    
    public m e(final m m) throws SecurityException {
        this.j();
        if (m == null) {
            return null;
        }
        final m[] array = { null };
        this.d = this.d.a(m, array);
        return array[0];
    }
    
    public g k(final Object o) {
        final e c = this.c;
        Class<?> class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        final g g = (g)c.e(class1);
        if (g != null) {
            return g;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No duration converter found for type: ");
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public g[] l() {
        final e c = this.c;
        final g[] array = new g[c.g()];
        c.b(array);
        return array;
    }
    
    public h n(final Object o) {
        final e a = this.a;
        Class<?> class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        final h h = (h)a.e(class1);
        if (h != null) {
            return h;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No instant converter found for type: ");
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public h[] o() {
        final e a = this.a;
        final h[] array = new h[a.g()];
        a.b(array);
        return array;
    }
    
    public i p(final Object o) {
        final e e = this.e;
        Class<?> class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        final i i = (i)e.e(class1);
        if (i != null) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No interval converter found for type: ");
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public i[] q() {
        final e e = this.e;
        final i[] array = new i[e.g()];
        e.b(array);
        return array;
    }
    
    public l r(final Object o) {
        final e b = this.b;
        Class<?> class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        final l l = (l)b.e(class1);
        if (l != null) {
            return l;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No partial converter found for type: ");
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public l[] s() {
        final e b = this.b;
        final l[] array = new l[b.g()];
        b.b(array);
        return array;
    }
    
    public m t(final Object o) {
        final e d = this.d;
        Class<?> class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        final m m = (m)d.e(class1);
        if (m != null) {
            return m;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No period converter found for type: ");
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ConverterManager[");
        sb.append(this.a.g());
        sb.append(" instant,");
        sb.append(this.b.g());
        sb.append(" partial,");
        sb.append(this.c.g());
        sb.append(" duration,");
        sb.append(this.d.g());
        sb.append(" period,");
        sb.append(this.e.g());
        sb.append(" interval]");
        return sb.toString();
    }
    
    public m[] u() {
        final e d = this.d;
        final m[] array = new m[d.g()];
        d.b(array);
        return array;
    }
    
    public g v(final g g) throws SecurityException {
        this.f();
        if (g == null) {
            return null;
        }
        final g[] array = { null };
        this.c = this.c.d(g, array);
        return array[0];
    }
    
    public h w(final h h) throws SecurityException {
        this.g();
        if (h == null) {
            return null;
        }
        final h[] array = { null };
        this.a = this.a.d(h, array);
        return array[0];
    }
    
    public i x(final i i) throws SecurityException {
        this.h();
        if (i == null) {
            return null;
        }
        final i[] array = { null };
        this.e = this.e.d(i, array);
        return array[0];
    }
    
    public l y(final l l) throws SecurityException {
        this.i();
        if (l == null) {
            return null;
        }
        final l[] array = { null };
        this.b = this.b.d(l, array);
        return array[0];
    }
    
    public m z(final m m) throws SecurityException {
        this.j();
        if (m == null) {
            return null;
        }
        final m[] array = { null };
        this.d = this.d.d(m, array);
        return array[0];
    }
}
