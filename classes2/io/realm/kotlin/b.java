// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.kotlin;

import io.realm.j0;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.e;
import io.realm.j;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Lio/realm/j;", "Lkotlinx/coroutines/flow/i;", "a", "realm-kotlin-extensions_baseRelease" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    @e
    public static final i<j> a(@e final j j) {
        k0.q(j, "$this$toflow");
        final j0 d = j.D();
        k0.h(d, "configuration");
        final i<j> e = d.h().e(j);
        k0.h(e, "configuration.flowFactory.from(this)");
        return e;
    }
}
