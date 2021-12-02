// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.name.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import org.jetbrains.annotations.e;

public final class n
{
    @f
    public static final o a(@e final m m, @e final g g) {
        k0.p((Object)m, "<this>");
        k0.p((Object)g, "javaClass");
        final m.a a = m.a(g);
        o a2;
        if (a == null) {
            a2 = null;
        }
        else {
            a2 = a.a();
        }
        return a2;
    }
    
    @f
    public static final o b(@e final m m, @e final a a) {
        k0.p((Object)m, "<this>");
        k0.p((Object)a, "classId");
        final m.a c = m.c(a);
        o a2;
        if (c == null) {
            a2 = null;
        }
        else {
            a2 = c.a();
        }
        return a2;
    }
}
