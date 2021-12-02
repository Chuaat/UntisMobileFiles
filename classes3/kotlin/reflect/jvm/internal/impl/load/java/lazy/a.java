// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.List;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i;
import java.util.Iterator;
import java.util.EnumMap;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import java.util.ArrayList;
import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.g0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.w;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.z;
import kotlin.reflect.jvm.internal.impl.descriptors.m;

public final class a
{
    private static final g a(final g g, final m m, final z z, final int n, final b0<w> b0) {
        final b a = g.a();
        h h;
        if (z == null) {
            h = null;
        }
        else {
            h = new h(g, m, z, n);
        }
        k f = h;
        if (h == null) {
            f = g.f();
        }
        return new g(a, f, b0);
    }
    
    @e
    public static final g b(@e final g g, @e final k k) {
        k0.p((Object)g, "<this>");
        k0.p((Object)k, "typeParameterResolver");
        return new g(g.a(), k, g.c());
    }
    
    @e
    public static final g c(@e final g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.g g2, @f final z z, final int n) {
        k0.p((Object)g, "<this>");
        k0.p((Object)g2, "containingDeclaration");
        return a(g, (m)g2, z, n, (b0<w>)d0.b(g0.I, (n6.a)new n6.a<w>() {
            @f
            public final w a() {
                return a.g(g, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)g2).getAnnotations());
            }
        }));
    }
    
    @e
    public static final g e(@e final g g, @e final m m, @e final z z, final int n) {
        k0.p((Object)g, "<this>");
        k0.p((Object)m, "containingDeclaration");
        k0.p((Object)z, "typeParameterOwner");
        return a(g, m, z, n, g.c());
    }
    
    @f
    public static final w g(@e final g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g2) {
        k0.p((Object)g, "<this>");
        k0.p((Object)g2, "additionalAnnotations");
        if (g.a().h().a()) {
            return g.b();
        }
        final ArrayList<s> list = new ArrayList<s>();
        final Iterator<c> iterator = (Iterator<c>)((Iterable<Object>)g2).iterator();
        while (iterator.hasNext()) {
            final s i = i(g, iterator.next());
            if (i != null) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return g.b();
        }
        final w b = g.b();
        EnumMap<kotlin.reflect.jvm.internal.impl.load.java.a, s> enumMap = null;
        if (b != null) {
            final EnumMap<kotlin.reflect.jvm.internal.impl.load.java.a, s> b2 = b.b();
            if (b2 != null) {
                enumMap = new EnumMap<kotlin.reflect.jvm.internal.impl.load.java.a, s>((EnumMap<Enum, ?>)b2);
            }
        }
        EnumMap<kotlin.reflect.jvm.internal.impl.load.java.a, s> enumMap2 = enumMap;
        if (enumMap == null) {
            enumMap2 = new EnumMap<kotlin.reflect.jvm.internal.impl.load.java.a, s>(kotlin.reflect.jvm.internal.impl.load.java.a.class);
        }
        boolean b3 = false;
        for (final s s : list) {
            final Iterator<kotlin.reflect.jvm.internal.impl.load.java.a> iterator3 = s.f().iterator();
            while (iterator3.hasNext()) {
                enumMap2.put(iterator3.next(), s);
                b3 = true;
            }
        }
        w b4;
        if (!b3) {
            b4 = g.b();
        }
        else {
            b4 = new w(enumMap2);
        }
        return b4;
    }
    
    @e
    public static final g h(@e g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g2) {
        k0.p((Object)g, "<this>");
        k0.p((Object)g2, "additionalAnnotations");
        if (!g2.isEmpty()) {
            g = new g(g.a(), g.f(), (b0<w>)d0.b(g0.I, (n6.a)new n6.a<w>() {
                @f
                public final w a() {
                    return a.g(g, g2);
                }
            }));
        }
        return g;
    }
    
    private static final s i(final g g, final c c) {
        final kotlin.reflect.jvm.internal.impl.load.java.c a = g.a().a();
        final s l = a.l(c);
        if (l != null) {
            return l;
        }
        final kotlin.reflect.jvm.internal.impl.load.java.c.a n = a.n(c);
        if (n == null) {
            return null;
        }
        final c a2 = n.a();
        final List<kotlin.reflect.jvm.internal.impl.load.java.a> b = n.b();
        kotlin.reflect.jvm.internal.impl.utils.h h;
        if ((h = a.k(c)) == null) {
            h = a.j(a2);
        }
        if (h.d()) {
            return null;
        }
        final i h2 = g.a().q().h(a2, g.a().p().b(), false);
        i b2;
        if (h2 == null) {
            b2 = null;
        }
        else {
            b2 = i.b(h2, null, h.f(), 1, null);
        }
        if (b2 == null) {
            return null;
        }
        return new s(b2, b, false, 4, null);
    }
    
    @e
    public static final g j(@e final g g, @e final b b) {
        k0.p((Object)g, "<this>");
        k0.p((Object)b, "components");
        return new g(b, g.f(), g.c());
    }
}
