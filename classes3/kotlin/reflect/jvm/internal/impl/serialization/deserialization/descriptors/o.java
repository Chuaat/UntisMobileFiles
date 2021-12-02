// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import java.util.List;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;

public final class o extends b
{
    public o(@e final n n, @e final a<? extends List<? extends c>> a) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)a, "compute");
        super(n, a);
    }
    
    @Override
    public boolean isEmpty() {
        return false;
    }
}
