// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.log.RealmLog;
import java.util.Collections;
import io.realm.internal.r;
import io.realm.internal.h;
import io.reactivex.l;
import io.realm.rx.b;
import io.reactivex.b0;
import io.realm.internal.p;
import io.realm.annotations.f;
import io.realm.internal.i;

@f
public abstract class p0 implements n0, i
{
    static final String G = "'model' is null.";
    static final String H = "the object is already deleted.";
    static final String I = "the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.";
    
    public static <E extends n0> void U7(final E e, final i0<E> i0) {
        V7(e, new c0.c<E>(i0));
    }
    
    public static <E extends n0> void V7(final E e, final q0<E> q0) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (q0 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (e instanceof p) {
            final p p2 = (p)e;
            final a f = p2.S6().f();
            f.h();
            f.K.capabilities.c("Listeners cannot be used on current thread.");
            p2.S6().b(q0);
            return;
        }
        throw new IllegalArgumentException("Cannot add listener from this unmanaged RealmObject (created outside of Realm)");
    }
    
    public static <E extends n0> b0<b<E>> Y7(final E e) {
        if (!(e instanceof p)) {
            throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
        }
        final a f = ((p)e).S6().f();
        if (f instanceof f0) {
            return f.I.q().p((f0)f, e);
        }
        if (f instanceof j) {
            return (b0<b<E>>)f.I.q().l((j)f, (k)e);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((j)f).getClass());
        sb.append(" does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    public static <E extends n0> l<E> a8(final E e) {
        if (!(e instanceof p)) {
            throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
        }
        final a f = ((p)e).S6().f();
        if (f instanceof f0) {
            return f.I.q().d((f0)f, e);
        }
        if (f instanceof j) {
            return (l<E>)f.I.q().h((j)f, (k)e);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((j)f).getClass());
        sb.append(" does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    public static <E extends n0> void c8(final E e) {
        if (!(e instanceof p)) {
            throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
        }
        final p p = (p)e;
        if (p.S6().g() == null) {
            throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        if (p.S6().f() != null) {
            p.S6().f().h();
            final r g = p.S6().g();
            g.g().d0(g.l0());
            p.S6().s(h.G);
            return;
        }
        throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
    }
    
    public static <E extends n0> E e8(final E e) {
        if (!(e instanceof p)) {
            throw new IllegalArgumentException("It is only possible to freeze valid managed Realm objects.");
        }
        final p p = (p)e;
        final a f = p.S6().f();
        a w;
        if (f.N()) {
            w = f;
        }
        else {
            w = f.w();
        }
        final r i0 = p.S6().g().i0(w.K);
        if (w instanceof j) {
            return (E)new k(w, i0);
        }
        if (w instanceof f0) {
            final Class<? super n0> superclass = e.getClass().getSuperclass();
            return w.D().r().s((Class<E>)superclass, w, i0, f.H().j((Class<? extends n0>)superclass), false, Collections.emptyList());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown Realm type: ");
        sb.append(w.getClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }
    
    public static f0 g8(final n0 n0) {
        if (n0 == null) {
            throw new IllegalArgumentException("'model' is null.");
        }
        if (n0 instanceof k) {
            throw new IllegalStateException("the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.");
        }
        if (!(n0 instanceof p)) {
            return null;
        }
        final a f = ((p)n0).S6().f();
        f.h();
        if (k8(n0)) {
            return (f0)f;
        }
        throw new IllegalStateException("the object is already deleted.");
    }
    
    public static <E extends n0> boolean h8(final E e) {
        return e instanceof p && ((p)e).S6().f().N();
    }
    
    public static <E extends n0> boolean i8(final E e) {
        if (e instanceof p) {
            final p p = (p)e;
            p.S6().f().h();
            return p.S6().h();
        }
        return true;
    }
    
    public static <E extends n0> boolean j8(final E e) {
        return e instanceof p;
    }
    
    public static <E extends n0> boolean k8(@c6.h final E e) {
        final boolean b = e instanceof p;
        final boolean b2 = true;
        boolean b3 = true;
        if (b) {
            final r g = ((p)e).S6().g();
            if (g == null || !g.T()) {
                b3 = false;
            }
            return b3;
        }
        return e != null && b2;
    }
    
    public static <E extends n0> boolean l8(final E e) {
        if (i8((n0)e)) {
            return true;
        }
        if (e instanceof p) {
            ((p)e).S6().j();
            return true;
        }
        return false;
    }
    
    public static <E extends n0> void n8(final E e) {
        if (e instanceof p) {
            final p p = (p)e;
            final a f = p.S6().f();
            if (f.isClosed()) {
                RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", f.I.m());
            }
            p.S6().m();
            return;
        }
        throw new IllegalArgumentException("Cannot remove listeners from this unmanaged RealmObject (created outside of Realm)");
    }
    
    public static <E extends n0> void p8(final E e, final i0<E> i0) {
        q8(e, new c0.c(i0));
    }
    
    public static <E extends n0> void q8(final E e, final q0 q0) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (q0 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (e instanceof p) {
            final p p2 = (p)e;
            final a f = p2.S6().f();
            if (f.isClosed()) {
                RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", f.I.m());
            }
            p2.S6().n(q0);
            return;
        }
        throw new IllegalArgumentException("Cannot remove listener from this unmanaged RealmObject (created outside of Realm)");
    }
    
    @Override
    public boolean G0() {
        return j8(this);
    }
    
    @Override
    public final boolean T() {
        return k8(this);
    }
    
    public final <E extends n0> void T7(final i0<E> i0) {
        U7(this, (i0<n0>)i0);
    }
    
    public final <E extends n0> void W7(final q0<E> q0) {
        V7(this, (q0<n0>)q0);
    }
    
    public final <E extends p0> b0<b<E>> X7() {
        return Y7(this);
    }
    
    public final boolean Y4() {
        return l8(this);
    }
    
    public final <E extends p0> l<E> Z7() {
        return a8(this);
    }
    
    public final void b8() {
        c8(this);
    }
    
    public final <E extends n0> E d8() {
        return e8((E)this);
    }
    
    public final boolean e1() {
        return i8(this);
    }
    
    public f0 f8() {
        return g8(this);
    }
    
    public final void m8() {
        n8(this);
    }
    
    @Override
    public final boolean n6() {
        return h8(this);
    }
    
    public final void o8(final i0 i0) {
        p8(this, i0);
    }
    
    public final void r8(final q0 q0) {
        q8(this, q0);
    }
}
