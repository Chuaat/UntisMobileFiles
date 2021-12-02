// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.s0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import org.jetbrains.annotations.e;
import java.util.Collection;

public final class k
{
    @e
    public static final List<e1> a(@e final Collection<l> collection, @e final Collection<? extends e1> collection2, @e final a a) {
        k0.p((Object)collection, "newValueParametersTypes");
        k0.p((Object)collection2, "oldValueParameters");
        k0.p((Object)a, "newOwner");
        collection.size();
        collection2.size();
        final List v5 = v.V5((Iterable)collection, (Iterable)collection2);
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.impl.k0>(v.Y((Iterable)v5, 10));
        for (final s0 s0 : v5) {
            final l l = (l)s0.a();
            final e1 e1 = (e1)s0.b();
            final int i = e1.i();
            final g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e1).getAnnotations();
            final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)e1).getName();
            k0.o((Object)name, "oldParameter.name");
            final c0 b = l.b();
            final boolean a2 = l.a();
            final boolean f0 = e1.f0();
            final boolean b2 = e1.b0();
            c0 arrayElementType;
            if (e1.p0() != null) {
                arrayElementType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.l((m)a).w().getArrayElementType(l.b());
            }
            else {
                arrayElementType = null;
            }
            final w0 k = ((p)e1).k();
            k0.o((Object)k, "oldParameter.source");
            list.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0(a, (e1)null, i, annotations, name, b, a2, f0, b2, arrayElementType, k));
        }
        return (List<e1>)list;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.load.java.descriptors.a b(@e final e1 e1) {
        k0.p((Object)e1, "<this>");
        final g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e1).getAnnotations();
        final b t = y.t;
        k0.o((Object)t, "DEFAULT_VALUE_FQ_NAME");
        final c a0 = annotations.a0(t);
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<String> g2 = null;
        Label_0068: {
            if (a0 != null) {
                final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> b = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.b(a0);
                if (b != null) {
                    kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g = b;
                    if (!(b instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.v)) {
                        g = null;
                    }
                    g2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.v)g;
                    break Label_0068;
                }
            }
            g2 = null;
        }
        if (g2 != null) {
            final String s = g2.b();
            if (s != null) {
                return new j(s);
            }
        }
        final g annotations2 = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e1).getAnnotations();
        final b u = y.u;
        k0.o((Object)u, "DEFAULT_NULL_FQ_NAME");
        if (annotations2.B4(u)) {
            return h.a;
        }
        return null;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k c(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)e, "<this>");
        final kotlin.reflect.jvm.internal.impl.descriptors.e p = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.p(e);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k k = null;
        if (p == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h v = p.V();
        if (v instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k) {
            k = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k)v;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k c;
        if ((c = k) == null) {
            c = c(p);
        }
        return c;
    }
}
