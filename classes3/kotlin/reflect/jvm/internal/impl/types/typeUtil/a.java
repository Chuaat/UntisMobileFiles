// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.j1;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.y0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class a
{
    @e
    public static final y0 a(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return new a1(c0);
    }
    
    public static final boolean b(@e final c0 c0, @e final l<? super j1, Boolean> l) {
        k0.p((Object)c0, "<this>");
        k0.p((Object)l, "predicate");
        return f1.c(c0, (l<j1, Boolean>)l);
    }
    
    public static final boolean c(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return b(c0, (l<? super j1, Boolean>)a$a.G);
    }
    
    @e
    public static final y0 d(@e final c0 c0, @e final k1 k1, @f final b1 b1) {
        k0.p((Object)c0, "type");
        k0.p((Object)k1, "projectionKind");
        k1 v;
        if (b1 == null) {
            v = null;
        }
        else {
            v = b1.v();
        }
        k1 i = k1;
        if (v == k1) {
            i = k1.K;
        }
        return new a1(i, c0);
    }
    
    @e
    public static final KotlinBuiltIns e(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final KotlinBuiltIns w = c0.N0().w();
        k0.o((Object)w, "constructor.builtIns");
        return w;
    }
    
    @e
    public static final c0 f(@e final b1 b1) {
        k0.p((Object)b1, "<this>");
        final List upperBounds = b1.getUpperBounds();
        k0.o((Object)upperBounds, "upperBounds");
        upperBounds.isEmpty();
        final List upperBounds2 = b1.getUpperBounds();
        k0.o((Object)upperBounds2, "upperBounds");
        final Iterator<c0> iterator = upperBounds2.iterator();
        while (true) {
            int i;
            c0 next;
            do {
                final boolean hasNext = iterator.hasNext();
                final c0 c0 = null;
                final kotlin.reflect.jvm.internal.impl.descriptors.e e = null;
                if (!hasNext) {
                    c0 c2;
                    if ((c2 = c0) == null) {
                        final List upperBounds3 = b1.getUpperBounds();
                        k0.o((Object)upperBounds3, "upperBounds");
                        final Object o2 = v.o2(upperBounds3);
                        k0.o(o2, "upperBounds.first()");
                        c2 = (c0)o2;
                    }
                    return c2;
                }
                next = iterator.next();
                final h c3 = next.N0().c();
                kotlin.reflect.jvm.internal.impl.descriptors.e e2 = e;
                if (c3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)c3;
                }
                final int n = 0;
                if (e2 == null) {
                    i = n;
                }
                else {
                    i = n;
                    if (e2.n() == kotlin.reflect.jvm.internal.impl.descriptors.f.H) {
                        continue;
                    }
                    i = n;
                    if (e2.n() == kotlin.reflect.jvm.internal.impl.descriptors.f.K) {
                        continue;
                    }
                    i = 1;
                }
            } while (i == 0);
            final c0 c0 = next;
            continue;
        }
    }
    
    public static final boolean g(@e final c0 c0, @e final c0 c2) {
        k0.p((Object)c0, "<this>");
        k0.p((Object)c2, "superType");
        return kotlin.reflect.jvm.internal.impl.types.checker.f.a.d(c0, c2);
    }
    
    public static final boolean h(@e final h h) {
        k0.p((Object)h, "<this>");
        return h instanceof b1 && ((n)h).c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.a1;
    }
    
    public static final boolean i(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return f1.m(c0);
    }
    
    @e
    public static final c0 j(@e c0 n) {
        k0.p((Object)n, "<this>");
        n = f1.n(n);
        k0.o((Object)n, "makeNotNullable(this)");
        return n;
    }
    
    @e
    public static final c0 k(@e c0 o) {
        k0.p((Object)o, "<this>");
        o = f1.o(o);
        k0.o((Object)o, "makeNullable(this)");
        return o;
    }
    
    @e
    public static final c0 l(@e final c0 c0, @e final g g) {
        k0.p((Object)c0, "<this>");
        k0.p((Object)g, "newAnnotations");
        if (((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations().isEmpty() && g.isEmpty()) {
            return c0;
        }
        return c0.Q0().T0(g);
    }
    
    @e
    public static final c0 m(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        final j1 q0 = c0.Q0();
        j1 j1;
        if (q0 instanceof w) {
            final d0 a = d0.a;
            final w w = (w)q0;
            kotlin.reflect.jvm.internal.impl.types.k0 k2;
            final kotlin.reflect.jvm.internal.impl.types.k0 k0 = k2 = w.V0();
            if (!k0.N0().getParameters().isEmpty()) {
                if (k0.N0().c() == null) {
                    k2 = k0;
                }
                else {
                    final List<b1> parameters = k0.N0().getParameters();
                    kotlin.jvm.internal.k0.o((Object)parameters, "constructor.parameters");
                    final ArrayList list = new ArrayList<p0>(v.Y((Iterable)parameters, 10));
                    final Iterator<Object> iterator = parameters.iterator();
                    while (iterator.hasNext()) {
                        list.add(new p0(iterator.next()));
                    }
                    k2 = c1.f(k0, list, null, 2, null);
                }
            }
            kotlin.reflect.jvm.internal.impl.types.k0 k4;
            final kotlin.reflect.jvm.internal.impl.types.k0 k3 = k4 = w.W0();
            if (!k3.N0().getParameters().isEmpty()) {
                if (k3.N0().c() == null) {
                    k4 = k3;
                }
                else {
                    final List<b1> parameters2 = k3.N0().getParameters();
                    kotlin.jvm.internal.k0.o((Object)parameters2, "constructor.parameters");
                    final ArrayList list2 = new ArrayList<p0>(v.Y((Iterable)parameters2, 10));
                    final Iterator<Object> iterator2 = parameters2.iterator();
                    while (iterator2.hasNext()) {
                        list2.add(new p0(iterator2.next()));
                    }
                    k4 = c1.f(k3, list2, null, 2, null);
                }
            }
            j1 = d0.d(k2, k4);
        }
        else {
            if (!(q0 instanceof kotlin.reflect.jvm.internal.impl.types.k0)) {
                throw new h0();
            }
            final kotlin.reflect.jvm.internal.impl.types.k0 k5 = (kotlin.reflect.jvm.internal.impl.types.k0)(j1 = q0);
            if (!k5.N0().getParameters().isEmpty()) {
                if (k5.N0().c() == null) {
                    j1 = k5;
                }
                else {
                    final List<b1> parameters3 = k5.N0().getParameters();
                    k0.o((Object)parameters3, "constructor.parameters");
                    final ArrayList list3 = new ArrayList<p0>(v.Y((Iterable)parameters3, 10));
                    final Iterator<Object> iterator3 = parameters3.iterator();
                    while (iterator3.hasNext()) {
                        list3.add(new p0(iterator3.next()));
                    }
                    j1 = c1.f(k5, list3, null, 2, null);
                }
            }
        }
        return h1.b(j1, q0);
    }
    
    public static final boolean n(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return b(c0, (l<? super j1, Boolean>)a$b.G);
    }
    
    public static final boolean o(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return b(c0, (l<? super j1, Boolean>)a$c.G);
    }
}
