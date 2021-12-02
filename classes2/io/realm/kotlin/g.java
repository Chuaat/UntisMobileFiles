// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.kotlin;

import kotlin.p1;
import io.realm.q0;
import io.realm.p0;
import kotlin.jvm.internal.k0;
import io.realm.n0;
import io.realm.i0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\u001b\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0000\u001a)\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\f*\u00020\u0000*\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0012\u001a\u00020\u0001\"\b\b\u0000\u0010\f*\u00020\u0000*\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0014\u001a\u00020\u0001\"\b\b\u0000\u0010\f*\u00020\u0000*\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0014\u0010\u0010\u001a)\u0010\u0015\u001a\u00020\u0001\"\b\b\u0000\u0010\f*\u00020\u0000*\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0015\u0010\u0013\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0017" }, d2 = { "Lio/realm/n0;", "Lkotlin/j2;", "c", "", "h", "T", "d", "(Lio/realm/n0;)Lio/realm/n0;", "e", "g", "f", "i", "E", "Lio/realm/i0;", "listener", "a", "(Lio/realm/n0;Lio/realm/i0;)V", "Lio/realm/q0;", "b", "(Lio/realm/n0;Lio/realm/q0;)V", "k", "l", "j", "realm-kotlin-extensions_baseRelease" }, k = 2, mv = { 1, 4, 0 })
public final class g
{
    public static final <E extends n0> void a(@e final E e, @e final i0<E> i0) {
        k0.q(e, "$this$addChangeListener");
        k0.q(i0, "listener");
        p0.U7(e, i0);
    }
    
    public static final <E extends n0> void b(@e final E e, @e final q0<E> q0) {
        k0.q(e, "$this$addChangeListener");
        k0.q(q0, "listener");
        p0.V7(e, q0);
    }
    
    public static final void c(@e final n0 n0) {
        k0.q(n0, "$this$deleteFromRealm");
        p0.c8(n0);
    }
    
    @e
    public static final <T extends n0> T d(@e n0 e8) {
        k0.q(e8, "$this$freeze");
        e8 = p0.e8(e8);
        if (e8 != null) {
            return (T)e8;
        }
        throw new p1("null cannot be cast to non-null type T");
    }
    
    public static final boolean e(@e final n0 n0) {
        k0.q(n0, "$this$isFrozen");
        return p0.h8(n0);
    }
    
    public static final boolean f(@e final n0 n0) {
        k0.q(n0, "$this$isLoaded");
        return p0.i8(n0);
    }
    
    public static final boolean g(@e final n0 n0) {
        k0.q(n0, "$this$isManaged");
        return p0.j8(n0);
    }
    
    public static final boolean h(@e final n0 n0) {
        k0.q(n0, "$this$isValid");
        return p0.k8(n0);
    }
    
    public static final boolean i(@e final n0 n0) {
        k0.q(n0, "$this$load");
        return p0.l8(n0);
    }
    
    public static final void j(@e final n0 n0) {
        k0.q(n0, "$this$removeAllChangeListeners");
        p0.n8(n0);
    }
    
    public static final <E extends n0> void k(@e final E e, @e final i0<E> i0) {
        k0.q(e, "$this$removeChangeListener");
        k0.q(i0, "listener");
        p0.p8(e, i0);
    }
    
    public static final <E extends n0> void l(@e final E e, @e final q0<E> q0) {
        k0.q(e, "$this$removeChangeListener");
        k0.q(q0, "listener");
        p0.q8(e, q0);
    }
}
