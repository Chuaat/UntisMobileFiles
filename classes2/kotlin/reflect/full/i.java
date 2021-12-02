// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.full;

import kotlin.e1;
import kotlin.reflect.jvm.internal.b0;
import n6.a;
import kotlin.reflect.jvm.internal.j;
import kotlin.reflect.s;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.e;
import kotlin.reflect.w;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.x;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.u;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.w0;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007\u001a.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\" \u0010\u0014\u001a\u00020\b*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "Lkotlin/reflect/g;", "", "Lkotlin/reflect/u;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/s;", "b", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/g;", "typeAnnotations", "Lkotlin/reflect/jvm/internal/impl/types/w0;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/k0;", "a", "d", "(Lkotlin/reflect/g;)Lkotlin/reflect/s;", "getStarProjectedType$annotations", "(Lkotlin/reflect/g;)V", "starProjectedType", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KClassifiers")
public final class i
{
    private static final k0 a(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, final w0 w0, final List<u> list, final boolean b) {
        final List parameters = w0.getParameters();
        kotlin.jvm.internal.k0.o(parameters, "typeConstructor.parameters");
        final ArrayList<Object> list2 = new ArrayList<Object>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final T next = (T)iterator.next();
            if (n < 0) {
                v.W();
            }
            final u u = (u)next;
            final x x = (x)u.g();
            c0 v;
            if (x != null) {
                v = x.v();
            }
            else {
                v = null;
            }
            final w h = u.h();
            Object o;
            if (h == null) {
                final b1 value = parameters.get(n);
                kotlin.jvm.internal.k0.o(value, "parameters[index]");
                o = new p0((b1)value);
            }
            else {
                final int n2 = kotlin.reflect.full.h.a[h.ordinal()];
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            throw new h0();
                        }
                        final k1 m = k1.M;
                        kotlin.jvm.internal.k0.m(v);
                        o = new a1(m, v);
                    }
                    else {
                        final k1 l = k1.L;
                        kotlin.jvm.internal.k0.m(v);
                        o = new a1(l, v);
                    }
                }
                else {
                    final k1 k = k1.K;
                    kotlin.jvm.internal.k0.m(v);
                    o = new a1(k, v);
                }
            }
            list2.add(o);
            ++n;
        }
        return d0.i(g, w0, (List)list2, b, (kotlin.reflect.jvm.internal.impl.types.checker.g)null, 16, (Object)null);
    }
    
    @e1(version = "1.1")
    @e
    public static final s b(@e final kotlin.reflect.g obj, @e final List<u> list, final boolean b, @e final List<? extends Annotation> list2) {
        kotlin.jvm.internal.k0.p(obj, "$this$createType");
        kotlin.jvm.internal.k0.p(list, "arguments");
        kotlin.jvm.internal.k0.p(list2, "annotations");
        Object o;
        if (!(obj instanceof j)) {
            o = null;
        }
        else {
            o = obj;
        }
        final j j = (j)o;
        if (j != null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.h z = j.z();
            if (z != null) {
                final w0 l = z.l();
                kotlin.jvm.internal.k0.o(l, "descriptor.typeConstructor");
                final List parameters = l.getParameters();
                kotlin.jvm.internal.k0.o(parameters, "typeConstructor.parameters");
                if (parameters.size() == list.size()) {
                    list2.isEmpty();
                    return new x((c0)a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), l, list, b), null, 2, null);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Class declares ");
                sb.append(parameters.size());
                sb.append(" type parameters, but ");
                sb.append(list.size());
                sb.append(" were provided.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create type for an unsupported classifier: ");
        sb2.append(obj);
        sb2.append(" (");
        sb2.append(obj.getClass());
        sb2.append(')');
        throw new b0(sb2.toString());
    }
    
    public static /* synthetic */ s c(final kotlin.reflect.g g, List e, boolean b, List e2, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            e = v.E();
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        if ((n & 0x4) != 0x0) {
            e2 = v.E();
        }
        return b(g, e, b, e2);
    }
    
    @e
    public static final s d(@e final kotlin.reflect.g g) {
        kotlin.jvm.internal.k0.p(g, "$this$starProjectedType");
        Object o;
        if (!(g instanceof j)) {
            o = null;
        }
        else {
            o = g;
        }
        final j j = (j)o;
        if (j != null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.h z = j.z();
            if (z != null) {
                final w0 l = z.l();
                kotlin.jvm.internal.k0.o(l, "descriptor.typeConstructor");
                final List parameters = l.getParameters();
                kotlin.jvm.internal.k0.o(parameters, "descriptor.typeConstructor.parameters");
                if (parameters.isEmpty()) {
                    return c(g, null, false, null, 7, null);
                }
                final ArrayList list = new ArrayList<u>(v.Y((Iterable<?>)parameters, 10));
                for (final b1 b1 : parameters) {
                    list.add(u.d.c());
                }
                return c(g, list, false, null, 6, null);
            }
        }
        return c(g, null, false, null, 7, null);
    }
}
