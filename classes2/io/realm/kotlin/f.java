// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.kotlin;

import io.realm.j0;
import io.realm.j;
import io.realm.f0;
import kotlin.jvm.internal.k0;
import io.realm.rx.a;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.e;
import io.realm.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00040\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0006" }, d2 = { "T", "Lio/realm/l0;", "Lkotlinx/coroutines/flow/i;", "b", "Lio/realm/rx/a;", "a", "realm-kotlin-extensions_baseRelease" }, k = 2, mv = { 1, 4, 0 })
public final class f
{
    @e
    public static final <T> i<a<l0<T>>> a(@e final l0<T> l0) {
        k0.q(l0, "$this$toChangesetFlow");
        final io.realm.a j = l0.J;
        kotlinx.coroutines.flow.i<a<l0<T>>> i;
        if (j instanceof f0) {
            final f0 f0 = (f0)j;
            final j0 d = f0.D();
            k0.h(d, "realmInstance.configuration");
            i = d.h().n(f0, l0);
        }
        else {
            if (!(j instanceof j)) {
                throw new IllegalStateException("Wrong type of Realm.");
            }
            final j k = (j)j;
            final j0 d2 = k.D();
            k0.h(d2, "realmInstance.configuration");
            i = d2.h().j(k, l0);
        }
        k0.h(i, "realmInstance.configurat\u2026From(realmInstance, this)");
        return i;
    }
    
    @e
    public static final <T> i<l0<T>> b(@e final l0<T> l0) {
        k0.q(l0, "$this$toFlow");
        final io.realm.a j = l0.J;
        kotlinx.coroutines.flow.i<l0<T>> i;
        if (j instanceof f0) {
            final f0 f0 = (f0)j;
            final j0 d = f0.D();
            k0.h(d, "realmInstance.configuration");
            i = d.h().a(f0, l0);
        }
        else {
            if (!(j instanceof j)) {
                throw new IllegalStateException("Wrong type of Realm.");
            }
            final j k = (j)j;
            final j0 d2 = k.D();
            k0.h(d2, "realmInstance.configuration");
            i = d2.h().b(k, l0);
        }
        k0.h(i, "realmInstance.configurat\u2026from(realmInstance, this)");
        return i;
    }
}
