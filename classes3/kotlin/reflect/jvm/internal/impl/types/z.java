// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.h0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class z
{
    @e
    public static final w a(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return (w)c0.Q0();
    }
    
    public static final boolean b(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return c0.Q0() instanceof w;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.k0 c(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        kotlin.reflect.jvm.internal.impl.types.k0 v0;
        if (q0 instanceof w) {
            v0 = ((w)q0).V0();
        }
        else {
            if (!(q0 instanceof kotlin.reflect.jvm.internal.impl.types.k0)) {
                throw new h0();
            }
            v0 = (kotlin.reflect.jvm.internal.impl.types.k0)q0;
        }
        return v0;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.k0 d(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        kotlin.reflect.jvm.internal.impl.types.k0 w0;
        if (q0 instanceof w) {
            w0 = ((w)q0).W0();
        }
        else {
            if (!(q0 instanceof kotlin.reflect.jvm.internal.impl.types.k0)) {
                throw new h0();
            }
            w0 = (kotlin.reflect.jvm.internal.impl.types.k0)q0;
        }
        return w0;
    }
}
