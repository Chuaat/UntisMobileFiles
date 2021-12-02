// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class n
{
    private static final boolean b(final c0 c0) {
        final j1 q0 = c0.Q0();
        w w;
        if (q0 instanceof w) {
            w = (w)q0;
        }
        else {
            w = null;
        }
        boolean b = false;
        if (w == null) {
            return false;
        }
        if (w.V0().O0() != w.W0().O0()) {
            b = true;
        }
        return b;
    }
}
