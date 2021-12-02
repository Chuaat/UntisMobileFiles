// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class v0
{
    @f
    public static final k a(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        final boolean b = q0 instanceof k;
        k k = null;
        k i;
        if (b) {
            i = (k)q0;
        }
        else {
            i = null;
        }
        if (i != null) {
            if (i.L()) {
                k = i;
            }
        }
        return k;
    }
    
    public static final boolean b(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        k k;
        if (q0 instanceof k) {
            k = (k)q0;
        }
        else {
            k = null;
        }
        return k != null && k.L();
    }
}
