// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.module;

import java.util.Collection;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¨\u0006\u0004" }, d2 = { "", "Lorg/koin/core/module/a;", "module", "a", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    @e
    public static final List<a> a(@e final List<a> list, @e final a a) {
        k0.q((Object)list, "$this$plus");
        k0.q((Object)a, "module");
        return (List<a>)v.q4((Collection)list, (Iterable)v.k((Object)a));
    }
}
