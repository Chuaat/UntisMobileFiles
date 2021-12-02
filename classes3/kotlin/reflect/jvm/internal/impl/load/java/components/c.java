// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.collections.y0;
import kotlin.s0;
import kotlin.n1;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.Map;
import org.jetbrains.annotations.e;

public final class c
{
    @e
    public static final c a;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.e b;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.e c;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.e d;
    @e
    private static final Map<b, b> e;
    @e
    private static final Map<b, b> f;
    
    static {
        a = new c();
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i("message");
        k0.o((Object)i, "identifier(\"message\")");
        b = i;
        final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i("allowedTargets");
        k0.o((Object)j, "identifier(\"allowedTargets\")");
        c = j;
        final kotlin.reflect.jvm.internal.impl.name.e k = kotlin.reflect.jvm.internal.impl.name.e.i("value");
        k0.o((Object)k, "identifier(\"value\")");
        d = k;
        final b target = StandardNames$FqNames.target;
        final b d2 = y.d;
        final s0 a2 = n1.a((Object)target, (Object)d2);
        final b retention = StandardNames$FqNames.retention;
        final b e2 = y.e;
        final s0 a3 = n1.a((Object)retention, (Object)e2);
        final b repeatable = StandardNames$FqNames.repeatable;
        final b h = y.h;
        final s0 a4 = n1.a((Object)repeatable, (Object)h);
        final b mustBeDocumented = StandardNames$FqNames.mustBeDocumented;
        final b g = y.g;
        e = y0.W(new s0[] { a2, a3, a4, n1.a((Object)mustBeDocumented, (Object)g) });
        f = y0.W(new s0[] { n1.a((Object)d2, (Object)target), n1.a((Object)e2, (Object)retention), n1.a((Object)y.f, (Object)StandardNames$FqNames.deprecated), n1.a((Object)h, (Object)repeatable), n1.a((Object)g, (Object)mustBeDocumented) });
    }
    
    private c() {
    }
    
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(final c c, final a a, final g g, boolean b, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        return c.e(a, g, b);
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@e final b b, @e final d d, @e final g g) {
        k0.p((Object)b, "kotlinName");
        k0.p((Object)d, "annotationOwner");
        k0.p((Object)g, "c");
        if (k0.g((Object)b, (Object)StandardNames$FqNames.deprecated)) {
            final b f = y.f;
            k0.o((Object)f, "DEPRECATED_ANNOTATION");
            final a a0 = d.a0(f);
            if (a0 != null || d.i()) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c)new kotlin.reflect.jvm.internal.impl.load.java.components.e(a0, g);
            }
        }
        final b b2 = kotlin.reflect.jvm.internal.impl.load.java.components.c.e.get(b);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f2 = null;
        if (b2 != null) {
            final a a2 = d.a0(b2);
            if (a2 != null) {
                f2 = f(this, a2, g, false, 4, null);
            }
        }
        return f2;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e b() {
        return kotlin.reflect.jvm.internal.impl.load.java.components.c.b;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e c() {
        return kotlin.reflect.jvm.internal.impl.load.java.components.c.d;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e d() {
        return kotlin.reflect.jvm.internal.impl.load.java.components.c.c;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(@e final a a, @e final g g, final boolean b) {
        k0.p((Object)a, "annotation");
        k0.p((Object)g, "c");
        final kotlin.reflect.jvm.internal.impl.name.a c = a.c();
        Object o;
        if (k0.g((Object)c, (Object)kotlin.reflect.jvm.internal.impl.name.a.m(y.d))) {
            o = new i(a, g);
        }
        else if (k0.g((Object)c, (Object)kotlin.reflect.jvm.internal.impl.name.a.m(y.e))) {
            o = new h(a, g);
        }
        else if (k0.g((Object)c, (Object)kotlin.reflect.jvm.internal.impl.name.a.m(y.h))) {
            o = new kotlin.reflect.jvm.internal.impl.load.java.components.b(g, a, StandardNames$FqNames.repeatable);
        }
        else if (k0.g((Object)c, (Object)kotlin.reflect.jvm.internal.impl.name.a.m(y.g))) {
            o = new kotlin.reflect.jvm.internal.impl.load.java.components.b(g, a, StandardNames$FqNames.mustBeDocumented);
        }
        else if (k0.g((Object)c, (Object)kotlin.reflect.jvm.internal.impl.name.a.m(y.f))) {
            o = null;
        }
        else {
            o = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e(g, a, b);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c)o;
    }
}
