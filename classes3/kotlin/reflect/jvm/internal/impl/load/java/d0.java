// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.utils.g;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.incremental.components.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class d0
{
    @org.jetbrains.annotations.f
    public static final t a(@e final c0 c0, @e String s) {
        k0.p((Object)c0, "<this>");
        k0.p((Object)s, "value");
        final h c2 = c0.N0().c();
        final boolean b = c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
        final t t = null;
        final t t2 = null;
        if (b) {
            final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
            if (e.n() == f.I) {
                final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b2 = e.B0();
                final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(s);
                k0.o((Object)i, "identifier(value)");
                final h g = b2.g(i, d.H);
                t t3 = t2;
                if (g instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g;
                    t3 = t2;
                    if (e2.n() == f.J) {
                        t3 = new m(e2);
                    }
                }
                return t3;
            }
        }
        final c0 j = a.j(c0);
        final kotlin.reflect.jvm.internal.impl.utils.f a = g.a(s);
        final String a2 = a.a();
        final int b3 = a.b();
        while (true) {
            try {
                if (KotlinBuiltIns.isBoolean(j)) {
                    s = (String)Boolean.valueOf(Boolean.parseBoolean(s));
                }
                else if (KotlinBuiltIns.isChar(j)) {
                    s = (String)s.A8(s);
                }
                else if (KotlinBuiltIns.isByte(j)) {
                    s = (String)s.W0(a2, b3);
                }
                else if (KotlinBuiltIns.isShort(j)) {
                    s = (String)s.c1(a2, b3);
                }
                else if (KotlinBuiltIns.isInt(j)) {
                    s = (String)s.Y0(a2, b3);
                }
                else if (KotlinBuiltIns.isLong(j)) {
                    s = (String)s.a1(a2, b3);
                }
                else if (KotlinBuiltIns.isFloat(j)) {
                    s = (String)s.J0(s);
                }
                else if (KotlinBuiltIns.isDouble(j)) {
                    s = (String)s.H0(s);
                }
                else if (!KotlinBuiltIns.isString(j)) {
                    s = null;
                }
                t t4 = t;
                if (s != null) {
                    t4 = new j(s);
                }
                return t4;
            }
            catch (IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    @e
    public static final u b(@e final j1 j1) {
        k0.p((Object)j1, "<this>");
        final u g = kotlin.reflect.jvm.internal.impl.load.java.u.g(j1);
        k0.o((Object)g, "toDescriptorVisibility(this)");
        return g;
    }
}
