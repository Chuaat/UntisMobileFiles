// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class CompanionObjectMappingUtilsKt
{
    public static final boolean isMappedIntrinsicCompanionObject(@e final CompanionObjectMapping companionObjectMapping, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(companionObjectMapping, "<this>");
        k0.p(e, "classDescriptor");
        if (d.x((m)e)) {
            final Set<kotlin.reflect.jvm.internal.impl.name.a> classIds = companionObjectMapping.getClassIds();
            final kotlin.reflect.jvm.internal.impl.name.a h = a.h((h)e);
            kotlin.reflect.jvm.internal.impl.name.a g;
            if (h == null) {
                g = null;
            }
            else {
                g = h.g();
            }
            if (v.J1(classIds, g)) {
                return true;
            }
        }
        return false;
    }
}
