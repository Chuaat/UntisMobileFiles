// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class c extends g<Boolean>
{
    public c(final boolean b) {
        super(b);
    }
    
    @e
    public k0 c(@e final e0 e0) {
        kotlin.jvm.internal.k0.p((Object)e0, "module");
        final k0 booleanType = e0.w().getBooleanType();
        kotlin.jvm.internal.k0.o((Object)booleanType, "module.builtIns.booleanType");
        return booleanType;
    }
}
