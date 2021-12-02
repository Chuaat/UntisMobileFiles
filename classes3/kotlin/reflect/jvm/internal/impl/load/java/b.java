// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.j1;
import kotlin.collections.y0;
import kotlin.n1;
import java.util.Collection;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h;
import kotlin.collections.v;
import java.util.Set;
import java.util.Map;
import java.util.List;
import org.jetbrains.annotations.e;

public final class b
{
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.b a;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.b b;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.b c;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.b d;
    @e
    private static final List<a> e;
    @e
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, s> f;
    @e
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, s> g;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.b> h;
    
    static {
        a = new kotlin.reflect.jvm.internal.impl.name.b("javax.annotation.meta.TypeQualifierNickname");
        b = new kotlin.reflect.jvm.internal.impl.name.b("javax.annotation.meta.TypeQualifier");
        c = new kotlin.reflect.jvm.internal.impl.name.b("javax.annotation.meta.TypeQualifierDefault");
        d = new kotlin.reflect.jvm.internal.impl.name.b("kotlin.annotations.jvm.UnderMigration");
        final a j = kotlin.reflect.jvm.internal.impl.load.java.a.J;
        final a h2 = kotlin.reflect.jvm.internal.impl.load.java.a.H;
        final a i = kotlin.reflect.jvm.internal.impl.load.java.a.I;
        final List<a> list = (List<a>)(e = v.L((Object[])new a[] { j, h2, i, kotlin.reflect.jvm.internal.impl.load.java.a.L, kotlin.reflect.jvm.internal.impl.load.java.a.K }));
        final kotlin.reflect.jvm.internal.impl.name.b g2 = z.g();
        final h h3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.H;
        g = y0.n0(y0.W(new s0[] { n1.a((Object)new kotlin.reflect.jvm.internal.impl.name.b("javax.annotation.ParametersAreNullableByDefault"), (Object)new s(new i(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.G, false, 2, null), v.k((Object)i), false, 4, null)), n1.a((Object)new kotlin.reflect.jvm.internal.impl.name.b("javax.annotation.ParametersAreNonnullByDefault"), (Object)new s(new i(h3, false, 2, null), v.k((Object)i), false, 4, null)) }), f = y0.k(n1.a((Object)g2, (Object)new s(new i(h3, false, 2, null), list, false))));
        h = j1.u((Object[])new kotlin.reflect.jvm.internal.impl.name.b[] { z.f(), z.e() });
    }
    
    @e
    public static final Map<kotlin.reflect.jvm.internal.impl.name.b, s> a() {
        return kotlin.reflect.jvm.internal.impl.load.java.b.g;
    }
    
    @e
    public static final Set<kotlin.reflect.jvm.internal.impl.name.b> b() {
        return kotlin.reflect.jvm.internal.impl.load.java.b.h;
    }
    
    @e
    public static final Map<kotlin.reflect.jvm.internal.impl.name.b, s> c() {
        return kotlin.reflect.jvm.internal.impl.load.java.b.f;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.b d() {
        return kotlin.reflect.jvm.internal.impl.load.java.b.d;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.b e() {
        return kotlin.reflect.jvm.internal.impl.load.java.b.c;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.b f() {
        return kotlin.reflect.jvm.internal.impl.load.java.b.b;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.b g() {
        return kotlin.reflect.jvm.internal.impl.load.java.b.a;
    }
}
