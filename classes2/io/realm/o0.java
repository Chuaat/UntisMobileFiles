// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.OsObjectStore;
import java.util.Locale;
import java.util.Set;
import java.util.Map;
import io.realm.internal.p;
import java.util.HashMap;
import java.util.List;
import io.realm.internal.r;
import java.util.Collections;
import io.realm.internal.Util;
import io.realm.internal.OsList;
import c6.h;

final class o0<T> extends s<T>
{
    @h
    private final String f;
    
    o0(final a a, final OsList list, @h final Class<T> clazz, @h final String f) {
        super(a, list, clazz);
        this.f = f;
    }
    
    private void A(final n0 n0, final long n2) {
        final io.realm.internal.q r = super.a.D().r();
        final Class<? extends n0> g = Util.g(n0.getClass());
        r.u((f0)super.a, n0, r.s(g, super.a, ((f0)super.a).x2(g).R(n2), super.a.H().j(g), true, Collections.EMPTY_LIST), new HashMap<n0, p>(), Collections.EMPTY_SET);
    }
    
    private boolean w(final a a, final n0 n0) {
        if (n0 instanceof p) {
            final p p2 = (p)n0;
            if (p2 instanceof k) {
                final String f = this.f;
                if (p2.S6().f() == a) {
                    final String p3 = ((k)n0).P8();
                    if (f.equals(p3)) {
                        return false;
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from list's. Type of the list is '%s', type of object is '%s'.", f, p3));
                }
                else {
                    if (a.H == p2.S6().f().H) {
                        throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                    }
                    throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
                }
            }
            else if (p2.S6().g() != null && p2.S6().f().getPath().equals(a.getPath())) {
                if (a == p2.S6().f()) {
                    return false;
                }
                throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
            }
        }
        return true;
    }
    
    private void x(final int i) {
        final int v = this.v();
        if (i >= 0 && v >= i) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(super.b.b0());
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    private <E extends n0> E y(final E e) {
        final f0 f0 = (f0)super.a;
        if (OsObjectStore.c(f0.J(), f0.D().r().l(e.getClass())) != null) {
            return f0.G0(e, new q[0]);
        }
        return f0.y0(e, new q[0]);
    }
    
    private boolean z(final n0 n0) {
        final a a = super.a;
        r0 r0;
        if (a instanceof f0) {
            r0 = a.H().m(n0.getClass());
        }
        else {
            r0 = super.a.H().n(((k)n0).P8());
        }
        return r0.z();
    }
    
    public void c(final Object o) {
        final n0 n0 = (n0)o;
        final boolean w = this.w(super.a, n0);
        if (this.z(n0)) {
            if (o instanceof k) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
            }
            this.A(n0, super.b.n());
        }
        else {
            n0 y = n0;
            if (w) {
                y = this.y(n0);
            }
            super.b.l(((p)y).S6().g().l0());
        }
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            throw new IllegalArgumentException("RealmList does not accept null values.");
        }
        if (o instanceof n0) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public T i(final int n) {
        return super.a.C((Class<T>)super.c, this.f, super.b.v(n));
    }
    
    @Override
    protected void l(final int n) {
        throw new RuntimeException("Should not reach here.");
    }
    
    public void m(final int n, final Object o) {
        this.x(n);
        final n0 n2 = (n0)o;
        final boolean w = this.w(super.a, n2);
        if (this.z(n2)) {
            if (o instanceof k) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
            }
            this.A(n2, super.b.o(n));
        }
        else {
            n0 y = n2;
            if (w) {
                y = this.y(n2);
            }
            super.b.G(n, ((p)y).S6().g().l0());
        }
    }
    
    @Override
    protected void t(final int n) {
        throw new RuntimeException("Should not reach here.");
    }
    
    @Override
    protected void u(final int n, final Object o) {
        final n0 n2 = (n0)o;
        final boolean w = this.w(super.a, n2);
        if (this.z(n2)) {
            if (o instanceof k) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
            }
            this.A(n2, super.b.p(n));
        }
        else {
            n0 y = n2;
            if (w) {
                y = this.y(n2);
            }
            super.b.Z(n, ((p)y).S6().g().l0());
        }
    }
}
