// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import kotlin.h0;
import m6.h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import java.util.List;
import org.jetbrains.annotations.e;

public final class c1
{
    @e
    public static final k0 a(@e final c0 c0) {
        kotlin.jvm.internal.k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        k0 k0;
        if (q0 instanceof k0) {
            k0 = (k0)q0;
        }
        else {
            k0 = null;
        }
        if (k0 != null) {
            return k0;
        }
        throw new IllegalStateException(kotlin.jvm.internal.k0.C("This is should be simple type: ", (Object)c0).toString());
    }
    
    @h
    @e
    public static final c0 b(@e final c0 c0, @e final List<? extends y0> list, @e final g g) {
        kotlin.jvm.internal.k0.p((Object)c0, "<this>");
        kotlin.jvm.internal.k0.p((Object)list, "newArguments");
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return e(c0, list, g, null, 4, null);
    }
    
    @h
    @e
    public static final c0 c(@e final c0 c0, @e final List<? extends y0> list, @e final g g, @e final List<? extends y0> list2) {
        kotlin.jvm.internal.k0.p((Object)c0, "<this>");
        kotlin.jvm.internal.k0.p((Object)list, "newArguments");
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        kotlin.jvm.internal.k0.p((Object)list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == c0.M0()) && g == ((a)c0).getAnnotations()) {
            return c0;
        }
        final j1 q0 = c0.Q0();
        j1 j1;
        if (q0 instanceof w) {
            final d0 a = d0.a;
            final w w = (w)q0;
            j1 = d0.d(d(w.V0(), list, g), d(w.W0(), list2, g));
        }
        else {
            if (!(q0 instanceof k0)) {
                throw new h0();
            }
            j1 = d((k0)q0, list, g);
        }
        return j1;
    }
    
    @h
    @e
    public static final k0 d(@e final k0 k0, @e final List<? extends y0> list, @e final g g) {
        kotlin.jvm.internal.k0.p((Object)k0, "<this>");
        kotlin.jvm.internal.k0.p((Object)list, "newArguments");
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        if (list.isEmpty() && g == ((a)k0).getAnnotations()) {
            return k0;
        }
        if (list.isEmpty()) {
            return k0.V0(g);
        }
        final d0 a = d0.a;
        return d0.i(g, k0.N0(), list, k0.O0(), null, 16, null);
    }
    
    public static /* synthetic */ c0 e(final c0 c0, List m0, g annotations, List list, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            m0 = c0.M0();
        }
        if ((n & 0x2) != 0x0) {
            annotations = ((a)c0).getAnnotations();
        }
        if ((n & 0x4) != 0x0) {
            list = m0;
        }
        return c(c0, m0, annotations, list);
    }
}
