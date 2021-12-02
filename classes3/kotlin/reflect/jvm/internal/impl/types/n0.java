// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.i;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.collections.v;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class n0
{
    @f
    public static final a a(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        a a;
        if (q0 instanceof a) {
            a = (a)q0;
        }
        else {
            a = null;
        }
        return a;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.types.k0 b(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final a a = a(c0);
        kotlin.reflect.jvm.internal.impl.types.k0 z0;
        if (a == null) {
            z0 = null;
        }
        else {
            z0 = a.Z0();
        }
        return z0;
    }
    
    public static final boolean c(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return c0.Q0() instanceof l;
    }
    
    private static final b0 d(b0 j) {
        final Collection<c0> k = j.k();
        final ArrayList list = new ArrayList<c0>(v.Y((Iterable)k, 10));
        final Iterator<Object> iterator = k.iterator();
        boolean b = false;
        b0 b2;
        c0 c0;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            b2 = null;
            c0 = null;
            if (!hasNext) {
                break;
            }
            c0 f;
            final c0 c2 = f = iterator.next();
            if (f1.l(c2)) {
                f = f(c2.Q0(), false, 1, null);
                b = true;
            }
            list.add(f);
        }
        if (!b) {
            j = b2;
        }
        else {
            final c0 g = j.g();
            c0 f2;
            if (g == null) {
                f2 = c0;
            }
            else {
                f2 = g;
                if (f1.l(g)) {
                    f2 = f(g.Q0(), false, 1, null);
                }
            }
            j = new b0((Collection<? extends c0>)list).j(f2);
        }
        return j;
    }
    
    @e
    public static final j1 e(@e final j1 j1, final boolean b) {
        k0.p((Object)j1, "<this>");
        j1 j2;
        if ((j2 = l.J.b(j1, b)) == null && (j2 = g(j1)) == null) {
            j2 = j1.R0(false);
        }
        return j2;
    }
    
    public static /* synthetic */ j1 f(final j1 j1, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        return e(j1, b);
    }
    
    private static final kotlin.reflect.jvm.internal.impl.types.k0 g(final c0 c0) {
        final w0 n0 = c0.N0();
        b0 b0;
        if (n0 instanceof b0) {
            b0 = (b0)n0;
        }
        else {
            b0 = null;
        }
        if (b0 == null) {
            return null;
        }
        final b0 d = d(b0);
        if (d == null) {
            return null;
        }
        return d.f();
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.k0 h(@e final kotlin.reflect.jvm.internal.impl.types.k0 k0, final boolean b) {
        k0.p((Object)k0, "<this>");
        kotlin.reflect.jvm.internal.impl.types.k0 k2;
        if ((k2 = l.J.b(k0, b)) == null && (k2 = g(k0)) == null) {
            k2 = k0.U0(false);
        }
        return k2;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.k0 j(@e final kotlin.reflect.jvm.internal.impl.types.k0 k0, @e final kotlin.reflect.jvm.internal.impl.types.k0 k2) {
        k0.p((Object)k0, "<this>");
        k0.p((Object)k2, "abbreviatedType");
        if (e0.a(k0)) {
            return k0;
        }
        return new a(k0, k2);
    }
    
    @e
    public static final i k(@e final i i) {
        k0.p((Object)i, "<this>");
        return new i(i.W0(), i.X0(), i.Y0(), i.getAnnotations(), i.O0(), true);
    }
}
