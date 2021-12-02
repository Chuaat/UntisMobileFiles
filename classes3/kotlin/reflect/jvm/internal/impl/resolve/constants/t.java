// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class t
{
    @e
    public static final Collection<c0> a(@e final e0 e0) {
        k0.p((Object)e0, "<this>");
        return (Collection<c0>)v.L((Object[])new kotlin.reflect.jvm.internal.impl.types.k0[] { e0.w().getIntType(), e0.w().getLongType(), e0.w().getByteType(), e0.w().getShortType() });
    }
}
