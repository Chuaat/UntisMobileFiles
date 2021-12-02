// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.kotlin;

import org.jetbrains.annotations.e;
import io.realm.j0;
import io.realm.c0;
import kotlin.p1;
import io.realm.k;
import io.realm.j;
import io.realm.f0;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.flow.l;
import io.realm.w;
import io.realm.internal.p;
import io.realm.rx.b;
import kotlinx.coroutines.flow.i;
import io.realm.n0;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007" }, d2 = { "Lio/realm/n0;", "T", "Lkotlinx/coroutines/flow/i;", "b", "(Lio/realm/n0;)Lkotlinx/coroutines/flow/i;", "Lio/realm/rx/b;", "a", "realm-kotlin-extensions_baseRelease" }, k = 2, mv = { 1, 4, 0 })
public final class h
{
    @e
    public static final <T extends n0> i<b<T>> a(@f final T t) {
        if (t != null) {
            if (!(t instanceof p)) {
                return (i<b<T>>)l.Q0((Object)new b(t, null));
            }
            final c0 s6 = ((p)t).S6();
            k0.h(s6, "proxy.`realmGet$proxyState`()");
            final a f = s6.f();
            Object o;
            if (f instanceof f0) {
                final f0 f2 = (f0)f;
                final j0 d = f2.D();
                k0.h(d, "realm.configuration");
                o = d.h().i(f2, t);
            }
            else {
                if (!(f instanceof j)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(((j)f).getClass());
                    sb.append(" is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used.");
                    throw new UnsupportedOperationException(sb.toString());
                }
                final k k = (k)t;
                final j j = (j)f;
                final j0 d2 = j.D();
                k0.h(d2, "realm.configuration");
                o = d2.h().l(j, k);
                if (o == null) {
                    throw new p1("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T>?>");
                }
            }
            if (o != null) {
                return (i<b<T>>)o;
            }
        }
        Object o = l.Q0((Object)null);
        return (i<b<T>>)o;
    }
    
    @e
    public static final <T extends n0> i<T> b(@f final T t) {
        if (t != null) {
            if (!(t instanceof p)) {
                return (i<T>)l.Q0((Object)t);
            }
            final c0 s6 = ((p)t).S6();
            k0.h(s6, "proxy.`realmGet$proxyState`()");
            final a f = s6.f();
            Object o;
            if (f instanceof f0) {
                final f0 f2 = (f0)f;
                final j0 d = f2.D();
                k0.h(d, "realm.configuration");
                o = d.h().d(f2, t);
            }
            else {
                if (!(f instanceof j)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(((j)f).getClass());
                    sb.append(" is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used.");
                    throw new UnsupportedOperationException(sb.toString());
                }
                final k k = (k)t;
                final j j = (j)f;
                final j0 d2 = j.D();
                k0.h(d2, "realm.configuration");
                o = d2.h().h(j, k);
                if (o == null) {
                    throw new p1("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T?>");
                }
            }
            if (o != null) {
                return (i<T>)o;
            }
        }
        Object o = l.Q0((Object)null);
        return (i<T>)o;
    }
}
