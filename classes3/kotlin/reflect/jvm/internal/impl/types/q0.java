// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.n;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

public final class q0
{
    @e
    public static final c0 a(@e final b1 b1) {
        k0.p((Object)b1, "<this>");
        final List<b1> parameters = ((h)((n)b1).c()).l().getParameters();
        k0.o((Object)parameters, "classDescriptor.typeConstructor.parameters");
        final ArrayList list = new ArrayList<w0>(v.Y((Iterable)parameters, 10));
        final Iterator<Object> iterator = parameters.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().l());
        }
        final d1 g = d1.g(new x0() {
            @f
            @Override
            public y0 j(@e final w0 w0) {
                k0.p((Object)w0, "key");
                y0 s;
                if (list.contains(w0)) {
                    final h c = w0.c();
                    Objects.requireNonNull(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                    s = f1.s((kotlin.reflect.jvm.internal.impl.descriptors.b1)c);
                }
                else {
                    s = null;
                }
                return s;
            }
        });
        final List upperBounds = b1.getUpperBounds();
        k0.o((Object)upperBounds, "this.upperBounds");
        c0 c0;
        if ((c0 = g.p((c0)v.o2(upperBounds), k1.M)) == null) {
            c0 = a.g((m)b1).getDefaultBound();
            k0.o((Object)c0, "builtIns.defaultBound");
        }
        return c0;
    }
}
