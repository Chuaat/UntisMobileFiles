// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.v;
import kotlin.collections.j1;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.e1;
import org.jetbrains.annotations.f;

public final class r
{
    @org.jetbrains.annotations.e
    public static final e a(@f final h h, @f final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f f, final boolean b, final boolean b2) {
        if (b2 && h == h.H) {
            return new e(h, f, true, b);
        }
        return new e(h, f, false, b);
    }
    
    public static final boolean b(@org.jetbrains.annotations.e final e1 e1, @org.jetbrains.annotations.e final i i) {
        k0.p((Object)e1, "<this>");
        k0.p((Object)i, "type");
        final b q = y.q;
        k0.o((Object)q, "ENHANCED_NULLABILITY_ANNOTATION");
        return e1.U(i, q);
    }
    
    @f
    public static final <T> T c(@org.jetbrains.annotations.e Set<? extends T> set, @org.jetbrains.annotations.e T t, @org.jetbrains.annotations.e final T t2, @f final T t3, final boolean b) {
        k0.p((Object)set, "<this>");
        k0.p((Object)t, "low");
        k0.p((Object)t2, "high");
        if (b) {
            T t4;
            if (set.contains(t)) {
                t4 = t;
            }
            else if (set.contains(t2)) {
                t4 = t2;
            }
            else {
                t4 = null;
            }
            if (k0.g((Object)t4, (Object)t) && k0.g((Object)t3, (Object)t2)) {
                t = null;
            }
            else if ((t = t3) == null) {
                t = t4;
            }
            return t;
        }
        if (t3 != null) {
            final Set n5 = v.N5((Iterable)j1.D(set, (Object)t3));
            if (n5 != null) {
                set = n5;
            }
        }
        return (T)v.V4((Iterable)set);
    }
    
    @f
    public static final h d(@org.jetbrains.annotations.e final Set<? extends h> set, @f final h h, final boolean b) {
        k0.p((Object)set, "<this>");
        final h i = h.I;
        h h2;
        if (h == i) {
            h2 = i;
        }
        else {
            h2 = c(set, h.H, h.G, h, b);
        }
        return h2;
    }
}
