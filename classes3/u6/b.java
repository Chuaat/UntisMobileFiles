// 
// Decompiled by Procyon v0.5.36
// 

package u6;

import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.k0;
import org.jetbrains.annotations.e;

public final class b implements a
{
    @e
    private final Iterable<Object> a;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.b<kotlin.reflect.jvm.internal.impl.descriptors.e, k0> b;
    
    public b(@e final n n, @e final Iterable<?> a) {
        kotlin.jvm.internal.k0.p((Object)n, "storageManager");
        kotlin.jvm.internal.k0.p((Object)a, "samWithReceiverResolvers");
        this.a = (Iterable<Object>)a;
        this.b = n.c();
    }
}
