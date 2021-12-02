// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public final class f
{
    @e
    private static final b a;
    
    static {
        a = new b("kotlin.jvm.JvmInline");
    }
    
    public static final boolean a(@e final a a) {
        k0.p((Object)a, "<this>");
        if (a instanceof r0) {
            final q0 c0 = ((p0)a).C0();
            k0.o((Object)c0, "correspondingProperty");
            if (d((g1)c0)) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean b(@e final m m) {
        k0.p((Object)m, "<this>");
        if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)m;
            if (e.isInline() || e.t()) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean c(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final h c2 = c0.N0().c();
        return c2 != null && b((m)c2);
    }
    
    public static final boolean d(@e final g1 g1) {
        k0.p((Object)g1, "<this>");
        if (((a)g1).q0() != null) {
            return false;
        }
        final m c = ((kotlin.reflect.jvm.internal.impl.descriptors.d1)g1).c();
        k0.o((Object)c, "this.containingDeclaration");
        if (!b(c)) {
            return false;
        }
        final e1 f = f((kotlin.reflect.jvm.internal.impl.descriptors.e)c);
        Object name;
        if (f == null) {
            name = null;
        }
        else {
            name = ((f0)f).getName();
        }
        return k0.g(name, (Object)((f0)g1).getName());
    }
    
    @org.jetbrains.annotations.f
    public static final c0 e(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final e1 g = g(c0);
        if (g == null) {
            return null;
        }
        return d1.f(c0).p(((kotlin.reflect.jvm.internal.impl.descriptors.d1)g).a(), k1.K);
    }
    
    @org.jetbrains.annotations.f
    public static final e1 f(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)e, "<this>");
        final boolean b = b((m)e);
        final e1 e2 = null;
        if (!b) {
            return null;
        }
        final d u = e.U();
        e1 e3;
        if (u == null) {
            e3 = e2;
        }
        else {
            final List m = ((a)u).m();
            if (m == null) {
                e3 = e2;
            }
            else {
                e3 = (e1)v.X4(m);
            }
        }
        return e3;
    }
    
    @org.jetbrains.annotations.f
    public static final e1 g(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        Object c2 = c0.N0().c();
        final boolean b = c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
        final e1 e1 = null;
        if (!b) {
            c2 = null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
        e1 f;
        if (e2 == null) {
            f = e1;
        }
        else {
            f = f(e2);
        }
        return f;
    }
}
