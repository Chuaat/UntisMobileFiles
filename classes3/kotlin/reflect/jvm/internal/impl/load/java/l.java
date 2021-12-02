// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

public final class l
{
    private static /* synthetic */ void a(final int n) {
        final Object[] args = new Object[3];
        if (n != 1 && n != 2) {
            if (n != 3) {
                args[0] = "propertyDescriptor";
            }
            else {
                args[0] = "memberDescriptor";
            }
        }
        else {
            args[0] = "companionObject";
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    args[2] = "isPropertyWithBackingFieldInOuterClass";
                }
                else {
                    args[2] = "hasJvmFieldAnnotation";
                }
            }
            else {
                args[2] = "isMappedIntrinsicCompanionObject";
            }
        }
        else {
            args[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    public static boolean b(@e final b b) {
        if (b == null) {
            a(3);
        }
        if (b instanceof q0) {
            final w u0 = ((q0)b).u0();
            if (u0 != null && ((a)u0).getAnnotations().B4(x.b)) {
                return true;
            }
        }
        return ((a)b).getAnnotations().B4(x.b);
    }
    
    public static boolean c(@e final m m) {
        boolean b = true;
        if (m == null) {
            a(1);
        }
        if (!d.x(m) || !d.w(m.c()) || d((kotlin.reflect.jvm.internal.impl.descriptors.e)m)) {
            b = false;
        }
        return b;
    }
    
    public static boolean d(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(2);
        }
        return CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, e);
    }
    
    public static boolean e(@e final q0 q0) {
        final boolean b = false;
        if (q0 == null) {
            a(0);
        }
        if (((b)q0).n() == b$a.H) {
            return false;
        }
        if (c(((d1)q0).c())) {
            return true;
        }
        boolean b2 = b;
        if (d.x(((d1)q0).c())) {
            b2 = b;
            if (b((b)q0)) {
                b2 = true;
            }
        }
        return b2;
    }
}
