// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.kotlin;

import io.realm.j0;
import io.realm.f0;
import kotlin.jvm.internal.k0;
import io.realm.rx.a;
import kotlinx.coroutines.flow.i;
import io.realm.n0;
import org.jetbrains.annotations.e;
import io.realm.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a,\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00050\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0007" }, d2 = { "Lio/realm/n0;", "T", "Lio/realm/s0;", "Lkotlinx/coroutines/flow/i;", "b", "Lio/realm/rx/a;", "a", "realm-kotlin-extensions_baseRelease" }, k = 2, mv = { 1, 4, 0 })
public final class j
{
    @e
    public static final <T extends n0> i<a<s0<T>>> a(@e final s0<T> s0) {
        k0.q(s0, "$this$toChangesetFlow");
        final io.realm.a g = s0.G;
        kotlinx.coroutines.flow.i<a<s0<T>>> i;
        if (g instanceof f0) {
            final f0 f0 = (f0)g;
            final j0 d = f0.D();
            k0.h(d, "realmInstance.configuration");
            i = d.h().k(f0, s0);
        }
        else {
            if (!(g instanceof io.realm.j)) {
                throw new IllegalStateException("Wrong type of Realm.");
            }
            final io.realm.j j = (io.realm.j)g;
            final j0 d2 = j.D();
            k0.h(d2, "realmInstance.configuration");
            i = d2.h().m(j, s0);
        }
        k0.h(i, "realmInstance.configurat\u2026From(realmInstance, this)");
        return i;
    }
    
    @e
    public static final <T extends n0> i<s0<T>> b(@e final s0<T> s0) {
        k0.q(s0, "$this$toFlow");
        final io.realm.a g = s0.G;
        kotlinx.coroutines.flow.i<s0<T>> i;
        if (g instanceof f0) {
            final f0 f0 = (f0)g;
            final j0 d = f0.D();
            k0.h(d, "realmInstance.configuration");
            i = d.h().c(f0, s0);
        }
        else {
            if (!(g instanceof io.realm.j)) {
                throw new IllegalStateException("Wrong type of Realm.");
            }
            final io.realm.j j = (io.realm.j)g;
            final j0 d2 = j.D();
            k0.h(d2, "realmInstance.configuration");
            i = d2.h().g(j, s0);
        }
        k0.h(i, "realmInstance.configurat\u2026from(realmInstance, this)");
        return i;
    }
}
