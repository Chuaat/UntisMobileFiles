// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.d0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.d1;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.s0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.model.b;
import kotlin.reflect.jvm.internal.impl.types.j1;

public final class k
{
    private static final List<y0> a(final j1 j1, final b b) {
        if (j1.M0().size() != j1.N0().getParameters().size()) {
            return null;
        }
        final List<y0> m0 = j1.M0();
        final boolean b2 = m0 instanceof Collection;
        final int n = 0;
        final boolean b3 = true;
        int n2 = 0;
        Label_0124: {
            if (b2 && m0.isEmpty()) {
                n2 = (b3 ? 1 : 0);
            }
            else {
                final Iterator<Object> iterator = m0.iterator();
                do {
                    n2 = (b3 ? 1 : 0);
                    if (iterator.hasNext()) {
                        continue;
                    }
                    break Label_0124;
                } while (iterator.next().c() == k1.K);
                n2 = 0;
            }
        }
        if (n2 != 0) {
            return null;
        }
        final List<b1> parameters = j1.N0().getParameters();
        k0.o((Object)parameters, "type.constructor.parameters");
        final List v5 = v.V5((Iterable)m0, (Iterable)parameters);
        final ArrayList list = new ArrayList<Object>(v.Y((Iterable)v5, 10));
        for (final s0 s0 : v5) {
            final y0 y0 = (y0)s0.a();
            final b1 b4 = (b1)s0.b();
            y0 a;
            if (y0.c() == k1.K) {
                a = y0;
            }
            else {
                j1 q0;
                if (!y0.d() && y0.c() == k1.L) {
                    q0 = y0.a().Q0();
                }
                else {
                    q0 = null;
                }
                k0.o((Object)b4, "parameter");
                a = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(new i(b, q0, y0, b4));
            }
            list.add(a);
        }
        final d1 c = x0.c.b(j1.N0(), (List<? extends y0>)list).c();
        final int n3 = m0.size() - 1;
        if (n3 >= 0) {
            int n4 = n;
            while (true) {
                final int n5 = n4 + 1;
                final y0 y2 = m0.get(n4);
                final y0 y3 = list.get(n4);
                if (y2.c() != k1.K) {
                    final List upperBounds = j1.N0().getParameters().get(n4).getUpperBounds();
                    k0.o((Object)upperBounds, "type.constructor.parameters[index].upperBounds");
                    final ArrayList<j1> list2 = new ArrayList<j1>();
                    final Iterator<c0> iterator3 = (Iterator<c0>)upperBounds.iterator();
                    while (iterator3.hasNext()) {
                        list2.add(l.b.a().h(c.n(iterator3.next(), k1.K).Q0()));
                    }
                    if (!y2.d() && y2.c() == k1.M) {
                        list2.add(l.b.a().h(y2.a().Q0()));
                    }
                    ((i)y3.a()).X0().h(list2);
                }
                if (n5 > n3) {
                    break;
                }
                n4 = n5;
            }
        }
        return (List<y0>)list;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.types.k0 b(@e kotlin.reflect.jvm.internal.impl.types.k0 c, @e final b b) {
        k0.p((Object)c, "type");
        k0.p((Object)b, "status");
        final List<y0> a = a(c, b);
        if (a == null) {
            c = null;
        }
        else {
            c = c(c, a);
        }
        return c;
    }
    
    private static final kotlin.reflect.jvm.internal.impl.types.k0 c(final j1 j1, final List<? extends y0> list) {
        final d0 a = d0.a;
        return d0.i(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)j1).getAnnotations(), j1.N0(), list, j1.O0(), null, 16, null);
    }
}
