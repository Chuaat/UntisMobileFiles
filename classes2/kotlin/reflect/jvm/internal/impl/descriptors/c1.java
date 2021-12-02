// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.w0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.v;
import n6.l;
import kotlin.sequences.p;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.types.u;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class c1
{
    @f
    public static final o0 a(@e final c0 c0) {
        k0.p(c0, "<this>");
        final h c2 = c0.N0().c();
        i i;
        if (c2 instanceof i) {
            i = (i)c2;
        }
        else {
            i = null;
        }
        return b(c0, i, 0);
    }
    
    private static final o0 b(final c0 c0, final i i, final int n) {
        i j = null;
        if (i == null || u.r((m)i)) {
            return null;
        }
        final int n2 = i.C().size() + n;
        if (!i.u()) {
            if (n2 != c0.M0().size()) {
                d.E((m)i);
            }
            return new o0(i, c0.M0().subList(n, c0.M0().size()), null);
        }
        final List subList = c0.M0().subList(n, n2);
        final m c2 = i.c();
        if (c2 instanceof i) {
            j = (i)c2;
        }
        return new o0(i, subList, b(c0, j, n2));
    }
    
    private static final c c(final b1 b1, final m m, final int n) {
        return new c(b1, m, n);
    }
    
    @e
    public static final List<b1> d(@e final i i) {
        k0.p(i, "<this>");
        final List<b1> c = i.C();
        k0.o(c, "declaredTypeParameters");
        if (!i.u() && !(i.c() instanceof a)) {
            return c;
        }
        final List v2 = p.V2(p.A0(p.i0(p.S2(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m((m)i), (l)c1$a.G), (l)c1$b.G), (l)c1$c.G));
        final Iterator iterator = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m((m)i).iterator();
        while (true) {
            kotlin.reflect.jvm.internal.impl.descriptors.e next;
            do {
                final boolean hasNext = iterator.hasNext();
                final Iterable<? extends T> iterable = null;
                if (hasNext) {
                    next = iterator.next();
                }
                else {
                    next = null;
                    final kotlin.reflect.jvm.internal.impl.descriptors.e e = next;
                    Object o;
                    if (e == null) {
                        o = iterable;
                    }
                    else {
                        final w0 l = e.l();
                        if (l == null) {
                            o = iterable;
                        }
                        else {
                            o = l.getParameters();
                        }
                    }
                    if (o == null) {
                        o = v.E();
                    }
                    if (v2.isEmpty() && ((List)o).isEmpty()) {
                        final List<b1> c2 = i.C();
                        k0.o(c2, "declaredTypeParameters");
                        return c2;
                    }
                    final List<Object> q4 = v.q4((Collection<?>)v2, (Iterable<?>)o);
                    final ArrayList list = new ArrayList<b1>(v.Y((Iterable<?>)q4, 10));
                    for (final b1 b1 : q4) {
                        k0.o(b1, "it");
                        list.add(c(b1, i, c.size()));
                    }
                    return (List<b1>)v.q4((Collection<?>)c, (Iterable<?>)list);
                }
            } while (!(next instanceof kotlin.reflect.jvm.internal.impl.descriptors.e));
            continue;
        }
    }
}
