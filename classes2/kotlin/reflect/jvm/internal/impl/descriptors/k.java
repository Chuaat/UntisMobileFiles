// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class k
{
    public static final boolean a(@e final c0 c0) {
        k0.p(c0, "<this>");
        Label_0031: {
            if (!KotlinBuiltIns.isPrimitiveType(c0)) {
                final UnsignedTypes instance = UnsignedTypes.INSTANCE;
                if (!UnsignedTypes.isUnsignedType(c0)) {
                    break Label_0031;
                }
            }
            if (!f1.l(c0)) {
                return true;
            }
        }
        if (!KotlinBuiltIns.isString(c0)) {
            return false;
        }
        return true;
    }
}
