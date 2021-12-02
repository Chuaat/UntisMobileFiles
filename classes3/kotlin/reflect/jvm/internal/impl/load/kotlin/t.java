// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import n6.q;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class t
{
    private static final void a(final StringBuilder sb, final c0 c0) {
        sb.append(g(c0));
    }
    
    @e
    public static final String b(@e final y y, final boolean b, final boolean b2) {
        k0.p((Object)y, "<this>");
        final StringBuilder sb = new StringBuilder();
        if (b2) {
            String d;
            if (y instanceof l) {
                d = "<init>";
            }
            else {
                d = ((f0)y).getName().d();
                k0.o((Object)d, "name.asString()");
            }
            sb.append(d);
        }
        sb.append("(");
        final t0 q0 = ((a)y).q0();
        if (q0 != null) {
            final c0 a = ((d1)q0).a();
            k0.o((Object)a, "it.type");
            a(sb, a);
        }
        final Iterator<e1> iterator = ((a)y).m().iterator();
        while (iterator.hasNext()) {
            final c0 a2 = ((d1)iterator.next()).a();
            k0.o((Object)a2, "parameter.type");
            a(sb, a2);
        }
        sb.append(")");
        if (b) {
            if (c.c((a)y)) {
                sb.append("V");
            }
            else {
                final c0 returnType = ((a)y).getReturnType();
                k0.m((Object)returnType);
                a(sb, returnType);
            }
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static /* synthetic */ String c(final y y, boolean b, boolean b2, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        if ((n & 0x2) != 0x0) {
            b2 = true;
        }
        return b(y, b, b2);
    }
    
    @f
    public static final String d(@e a b) {
        k0.p((Object)b, "<this>");
        final v a = v.a;
        if (d.E((m)b)) {
            return null;
        }
        final m c = ((n)b).c();
        kotlin.reflect.jvm.internal.impl.descriptors.e e;
        if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
        }
        else {
            e = null;
        }
        if (e == null) {
            return null;
        }
        if (((f0)e).getName().j()) {
            return null;
        }
        b = b.b();
        Object o;
        if (b instanceof v0) {
            o = b;
        }
        else {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return s.a(a, e, c((y)o, false, false, 3, null));
    }
    
    public static final boolean e(@e final a a) {
        k0.p((Object)a, "f");
        final boolean b = a instanceof y;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final y y = (y)a;
        boolean b3 = b2;
        if (k0.g((Object)((f0)y).getName().d(), (Object)"remove")) {
            b3 = b2;
            if (((a)y).m().size() == 1) {
                if (b0.h((b)a)) {
                    b3 = b2;
                }
                else {
                    final List m = ((a)y.b()).m();
                    k0.o((Object)m, "f.original.valueParameters");
                    final c0 a2 = ((d1)kotlin.collections.v.U4(m)).a();
                    k0.o((Object)a2, "f.original.valueParameters.single().type");
                    final j g = g(a2);
                    final boolean b4 = g instanceof j.d;
                    final kotlin.reflect.jvm.internal.impl.resolve.jvm.d d = null;
                    j.d d2;
                    if (b4) {
                        d2 = (j.d)g;
                    }
                    else {
                        d2 = null;
                    }
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.d i;
                    if (d2 == null) {
                        i = d;
                    }
                    else {
                        i = d2.i();
                    }
                    if (i != kotlin.reflect.jvm.internal.impl.resolve.jvm.d.O) {
                        return false;
                    }
                    final kotlin.reflect.jvm.internal.impl.load.java.f n = kotlin.reflect.jvm.internal.impl.load.java.f.n;
                    final y k = kotlin.reflect.jvm.internal.impl.load.java.f.k(y);
                    if (k == null) {
                        return false;
                    }
                    final List j = ((a)k.b()).m();
                    k0.o((Object)j, "overridden.original.valueParameters");
                    final c0 a3 = ((d1)kotlin.collections.v.U4(j)).a();
                    k0.o((Object)a3, "overridden.original.valueParameters.single().type");
                    final j g2 = g(a3);
                    final m c = k.c();
                    k0.o((Object)c, "overridden.containingDeclaration");
                    b3 = b2;
                    if (k0.g((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j(c), (Object)StandardNames$FqNames.mutableCollection.j())) {
                        b3 = b2;
                        if (g2 instanceof j.c) {
                            b3 = b2;
                            if (k0.g((Object)((j.c)g2).i(), (Object)"java/lang/Object")) {
                                b3 = true;
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @e
    public static final String f(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)e, "<this>");
        final kotlin.reflect.jvm.internal.impl.builtins.jvm.c a = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
        final kotlin.reflect.jvm.internal.impl.name.c j = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)e).j();
        k0.o((Object)j, "fqNameSafe.toUnsafe()");
        final kotlin.reflect.jvm.internal.impl.name.a o = a.o(j);
        if (o == null) {
            return c.b(e, null, 2, null);
        }
        final String f = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.b(o).f();
        k0.o((Object)f, "byClassId(it).internalName");
        return f;
    }
    
    @e
    public static final j g(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return (j)c.e(c0, kotlin.reflect.jvm.internal.impl.load.kotlin.l.a, kotlin.reflect.jvm.internal.impl.load.kotlin.y.o, x.a, null, null, 32, null);
    }
}
