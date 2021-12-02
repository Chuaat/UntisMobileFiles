// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.g;

public final class f implements g
{
    @e
    private final m a;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.e b;
    
    public f(@e final m a, @e final kotlin.reflect.jvm.internal.impl.load.kotlin.e b) {
        k0.p((Object)a, "kotlinClassFinder");
        k0.p((Object)b, "deserializedDescriptorResolver");
        this.a = a;
        this.b = b;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.f a(@e final a a) {
        k0.p((Object)a, "classId");
        final o b = n.b(this.a, a);
        if (b == null) {
            return null;
        }
        k0.g((Object)b.c(), (Object)a);
        return this.b.k(b);
    }
}
