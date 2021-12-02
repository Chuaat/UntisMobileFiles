// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.resolve.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public final class a
{
    private static final boolean a(final e e) {
        return k0.g((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)e), (Object)StandardNames.RESULT_FQ_NAME);
    }
    
    public static final boolean b(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        return f.b(m) && !a((e)m);
    }
    
    public static final boolean c(@org.jetbrains.annotations.e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final h c2 = c0.N0().c();
        Object value;
        if (c2 == null) {
            value = null;
        }
        else {
            value = b((m)c2);
        }
        return k0.g(value, (Object)Boolean.TRUE);
    }
    
    private static final boolean d(final c0 c0) {
        final h c2 = c0.N0().c();
        b1 b1;
        if (c2 instanceof b1) {
            b1 = (b1)c2;
        }
        else {
            b1 = null;
        }
        return b1 != null && e(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(b1));
    }
    
    private static final boolean e(final c0 c0) {
        return c(c0) || d(c0);
    }
    
    public static final boolean f(@org.jetbrains.annotations.e final b b) {
        k0.p((Object)b, "descriptor");
        Object o;
        if (b instanceof d) {
            o = b;
        }
        else {
            o = null;
        }
        final boolean b2 = false;
        if (o == null) {
            return false;
        }
        if (t.g(((a0)o).getVisibility())) {
            return false;
        }
        final e i = ((l)o).I();
        k0.o((Object)i, "constructorDescriptor.constructedClass");
        if (f.b((m)i)) {
            return false;
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.d.G((m)((l)o).I())) {
            return false;
        }
        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)o).m();
        k0.o((Object)m, "constructorDescriptor.valueParameters");
        boolean b3;
        if (m instanceof Collection && m.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator<e1> iterator = (Iterator<e1>)m.iterator();
            c0 a;
            do {
                b3 = b2;
                if (!iterator.hasNext()) {
                    return b3;
                }
                a = ((d1)iterator.next()).a();
                k0.o((Object)a, "it.type");
            } while (!e(a));
            b3 = true;
        }
        return b3;
    }
}
