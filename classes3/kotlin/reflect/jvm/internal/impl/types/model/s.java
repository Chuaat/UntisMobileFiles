// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.h0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.k1;

public final class s
{
    @e
    public static final w a(@e final k1 k1) {
        k0.p((Object)k1, "<this>");
        final int n = a.a[k1.ordinal()];
        w w;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                w = kotlin.reflect.jvm.internal.impl.types.model.w.I;
            }
            else {
                w = kotlin.reflect.jvm.internal.impl.types.model.w.H;
            }
        }
        else {
            w = kotlin.reflect.jvm.internal.impl.types.model.w.J;
        }
        return w;
    }
}
