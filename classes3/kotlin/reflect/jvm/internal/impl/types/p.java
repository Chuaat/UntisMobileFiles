// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.j0;
import java.util.HashMap;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;

public class p
{
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 4) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 4) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "typeParameters";
                break;
            }
            case 4: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            }
            case 3:
            case 8: {
                args[0] = "result";
                break;
            }
            case 2:
            case 7: {
                args[0] = "newContainingDeclaration";
                break;
            }
            case 1:
            case 6: {
                args[0] = "originalSubstitution";
                break;
            }
        }
        if (n != 4) {
            args[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        }
        else {
            args[1] = "substituteTypeParameters";
        }
        if (n != 4) {
            args[2] = "substituteTypeParameters";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 4) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @e
    public static d1 b(@e final List<b1> list, @e final kotlin.reflect.jvm.internal.impl.types.b1 b1, @e final m m, @e final List<b1> list2) {
        if (list == null) {
            a(0);
        }
        if (b1 == null) {
            a(1);
        }
        if (m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        final d1 c = c(list, b1, m, list2, null);
        if (c != null) {
            return c;
        }
        throw new AssertionError((Object)"Substitution failed");
    }
    
    @f
    public static d1 c(@e final List<b1> list, @e final kotlin.reflect.jvm.internal.impl.types.b1 b1, @e final m m, @e final List<b1> list2, @f final boolean[] array) {
        if (list == null) {
            a(5);
        }
        if (b1 == null) {
            a(6);
        }
        if (m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        final HashMap<w0, a1> hashMap = new HashMap<w0, a1>();
        final HashMap<Object, j0> hashMap2 = new HashMap<Object, j0>();
        final Iterator<b1> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final b1 b2 = iterator.next();
            final j0 q0 = j0.Q0(m, ((a)b2).getAnnotations(), b2.r(), b2.v(), ((f0)b2).getName(), n, kotlin.reflect.jvm.internal.impl.descriptors.w0.a, b2.l0());
            hashMap.put(b2.l(), new a1(((kotlin.reflect.jvm.internal.impl.descriptors.impl.e)q0).A()));
            hashMap2.put(b2, q0);
            list2.add((b1)q0);
            ++n;
        }
        final d1 h = d1.h(b1, x0.i(hashMap));
        for (final b1 b3 : list) {
            final j0 j0 = hashMap2.get(b3);
            for (final c0 c0 : b3.getUpperBounds()) {
                final c0 p5 = h.p(c0, k1.L);
                if (p5 == null) {
                    return null;
                }
                if (p5 != c0 && array != null) {
                    array[0] = true;
                }
                j0.N0(p5);
            }
            j0.V0();
        }
        return h;
    }
}
