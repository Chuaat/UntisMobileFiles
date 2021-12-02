// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.x0$a;
import kotlin.s0;
import kotlin.collections.y0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.w0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public final class j
{
    @org.jetbrains.annotations.e
    public static final x0 a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final e e2) {
        k0.p(e, "from");
        k0.p(e2, "to");
        e.C().size();
        e2.C().size();
        final x0$a c = x0.c;
        final List<b1> c2 = e.C();
        k0.o(c2, "from.declaredTypeParameters");
        final ArrayList list = new ArrayList<w0>(v.Y((Iterable<?>)c2, 10));
        final Iterator<Object> iterator = c2.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().l());
        }
        final List<b1> c3 = e2.C();
        k0.o(c3, "to.declaredTypeParameters");
        final ArrayList list2 = new ArrayList<Object>(v.Y((Iterable<?>)c3, 10));
        final Iterator<Object> iterator2 = c3.iterator();
        while (iterator2.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.types.k0 a = iterator2.next().A();
            k0.o(a, "it.defaultType");
            list2.add((R)kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a((c0)a));
        }
        return x0$a.e(c, (Map)y0.B0((Iterable<? extends s0<?, ?>>)v.V5((Iterable<?>)list, (Iterable<?>)list2)), false, 2, (Object)null);
    }
}
