// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.types.checker.u;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import m6.g;

@g(name = "SpecialBuiltinMembers")
public final class b0
{
    public static final boolean a(@e final b b) {
        k0.p((Object)b, "<this>");
        return d(b) != null;
    }
    
    @f
    public static final String b(@e b c) {
        k0.p((Object)c, "callableMemberDescriptor");
        c = c(c);
        final String s = null;
        Object o;
        if (c == null) {
            o = null;
        }
        else {
            o = a.o(c);
        }
        if (o == null) {
            return null;
        }
        String s2;
        if (o instanceof q0) {
            s2 = i.a.a((b)o);
        }
        else {
            s2 = s;
            if (o instanceof v0) {
                final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.load.java.e.n.j((v0)o);
                if (j == null) {
                    s2 = s;
                }
                else {
                    s2 = j.d();
                }
            }
        }
        return s2;
    }
    
    private static final b c(b d) {
        if (KotlinBuiltIns.isBuiltIn((m)d)) {
            d = d(d);
        }
        else {
            d = null;
        }
        return d;
    }
    
    @f
    public static final <T extends b> T d(@e final T t) {
        k0.p((Object)t, "<this>");
        final boolean contains = c0.a.f().contains(((f0)t).getName());
        b d = null;
        if (!contains && !kotlin.reflect.jvm.internal.impl.load.java.g.a.d().contains(((f0)a.o(t)).getName())) {
            return null;
        }
        m0 m0;
        if (t instanceof q0 || t instanceof p0) {
            m0 = b0$a.G;
        }
        else {
            if (!(t instanceof v0)) {
                return (T)d;
            }
            m0 = b0$b.G;
        }
        d = a.d(t, false, (l)m0, 1, null);
        return (T)d;
    }
    
    @f
    public static final <T extends b> T e(@e final T t) {
        k0.p((Object)t, "<this>");
        final b d = d((b)t);
        if (d != null) {
            return (T)d;
        }
        final kotlin.reflect.jvm.internal.impl.load.java.f n = kotlin.reflect.jvm.internal.impl.load.java.f.n;
        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)t).getName();
        k0.o((Object)name, "name");
        if (!n.l(name)) {
            return null;
        }
        return (T)a.d(t, false, (l)b0$c.G, 1, null);
    }
    
    public static final boolean f(@e kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        k0.p((Object)e, "<this>");
        k0.p((Object)a, "specialCallableDescriptor");
        final kotlin.reflect.jvm.internal.impl.types.k0 a2 = ((kotlin.reflect.jvm.internal.impl.descriptors.e)((n)a).c()).A();
        k0.o((Object)a2, "specialCallableDescriptor.containingDeclaration as ClassDescriptor).defaultType");
        while (true) {
            final Object s = d.s(e);
            boolean b = false;
            if (s == null) {
                return false;
            }
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)s;
            if (s instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.d) {
                continue;
            }
            if (u.b(((kotlin.reflect.jvm.internal.impl.descriptors.e)s).A(), a2) != null) {
                b = true;
            }
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)s;
            if (b) {
                return KotlinBuiltIns.isBuiltIn((m)s) ^ true;
            }
        }
    }
    
    public static final boolean g(@e final b b) {
        k0.p((Object)b, "<this>");
        return ((n)a.o(b)).c() instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.d;
    }
    
    public static final boolean h(@e final b b) {
        k0.p((Object)b, "<this>");
        return g(b) || KotlinBuiltIns.isBuiltIn((m)b);
    }
}
