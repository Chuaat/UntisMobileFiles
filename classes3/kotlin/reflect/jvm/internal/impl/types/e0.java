// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class e0
{
    public static final boolean a(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        return q0 instanceof t || (q0 instanceof w && ((w)q0).U0() instanceof t);
    }
    
    public static final boolean b(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return f1.l(c0);
    }
}
