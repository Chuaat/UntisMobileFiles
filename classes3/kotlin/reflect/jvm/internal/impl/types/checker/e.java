// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.z;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.types.s;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.j1;
import java.util.List;

public final class e
{
    @org.jetbrains.annotations.e
    public static final j1 a(@org.jetbrains.annotations.e final List<? extends j1> list) {
        k0.p((Object)list, "types");
        final int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (j1)v.U4((List)list);
        }
        final ArrayList<kotlin.reflect.jvm.internal.impl.types.k0> list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.types.k0>(v.Y((Iterable)list, 10));
        final Iterator<j1> iterator = (Iterator<j1>)list.iterator();
        int n = 0;
        boolean b = false;
        while (iterator.hasNext()) {
            final j1 j1 = iterator.next();
            if (n == 0 && !e0.a(j1)) {
                n = 0;
            }
            else {
                n = 1;
            }
            kotlin.reflect.jvm.internal.impl.types.k0 v0;
            if (j1 instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                v0 = (kotlin.reflect.jvm.internal.impl.types.k0)j1;
            }
            else {
                if (!(j1 instanceof w)) {
                    throw new h0();
                }
                if (s.a(j1)) {
                    return j1;
                }
                v0 = ((w)j1).V0();
                b = true;
            }
            list2.add(v0);
        }
        if (n != 0) {
            final kotlin.reflect.jvm.internal.impl.types.k0 i = u.j(k0.C("Intersection of error types: ", (Object)list));
            k0.o((Object)i, "createErrorType(\"Intersection of error types: $types\")");
            return i;
        }
        if (!b) {
            return kotlin.reflect.jvm.internal.impl.types.checker.w.a.c(list2);
        }
        final ArrayList<kotlin.reflect.jvm.internal.impl.types.k0> list3 = new ArrayList<kotlin.reflect.jvm.internal.impl.types.k0>(v.Y((Iterable)list, 10));
        final Iterator<j1> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list3.add(z.d(iterator2.next()));
        }
        final d0 a = d0.a;
        final kotlin.reflect.jvm.internal.impl.types.checker.w a2 = kotlin.reflect.jvm.internal.impl.types.checker.w.a;
        return d0.d(a2.c(list2), a2.c(list3));
    }
}
