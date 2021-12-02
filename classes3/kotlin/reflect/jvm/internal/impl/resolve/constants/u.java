// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class u extends o<Short>
{
    public u(final short s) {
        super(s);
    }
    
    @e
    public k0 c(@e final e0 e0) {
        kotlin.jvm.internal.k0.p((Object)e0, "module");
        final k0 shortType = e0.w().getShortType();
        kotlin.jvm.internal.k0.o((Object)shortType, "module.builtIns.shortType");
        return shortType;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(((g<Number>)this).b().intValue());
        sb.append(".toShort()");
        return sb.toString();
    }
}
