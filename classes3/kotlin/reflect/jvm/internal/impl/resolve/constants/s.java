// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class s extends g<Void>
{
    public s() {
        super(null);
    }
    
    @e
    public k0 c(@e final e0 e0) {
        kotlin.jvm.internal.k0.p((Object)e0, "module");
        final k0 nullableNothingType = e0.w().getNullableNothingType();
        kotlin.jvm.internal.k0.o((Object)nullableNothingType, "module.builtIns.nullableNothingType");
        return nullableNothingType;
    }
}
