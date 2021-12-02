// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import n6.l;
import kotlin.sequences.p;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.incremental.components.d;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.resolve.m;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;
import org.jetbrains.annotations.e;

public final class x
{
    @f
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final e0 e0, @e final a a) {
        k0.p(e0, "<this>");
        k0.p(a, "classId");
        final h b = b(e0, a);
        kotlin.reflect.jvm.internal.impl.descriptors.e e2;
        if (b instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)b;
        }
        else {
            e2 = null;
        }
        return e2;
    }
    
    @f
    public static final h b(@e final e0 e0, @e final a a) {
        k0.p(e0, "<this>");
        k0.p(a, "classId");
        final e0 a2 = m.a(e0);
        final h h = null;
        h h4;
        if (a2 == null) {
            final kotlin.reflect.jvm.internal.impl.name.b h2 = a.h();
            k0.o(h2, "classId.packageFqName");
            final m0 r = e0.R(h2);
            final List f = a.i().f();
            k0.o(f, "classId.relativeClassName.pathSegments()");
            final kotlin.reflect.jvm.internal.impl.resolve.scopes.h x = r.x();
            final kotlin.reflect.jvm.internal.impl.name.e o2 = v.o2((List<? extends kotlin.reflect.jvm.internal.impl.name.e>)f);
            k0.o(o2, "segments.first()");
            h g = ((k)x).g((kotlin.reflect.jvm.internal.impl.name.e)o2, (b)d.X);
            if (g == null) {
                return h;
            }
            final Iterator<? extends kotlin.reflect.jvm.internal.impl.name.e> iterator = f.subList(1, f.size()).iterator();
            kotlin.reflect.jvm.internal.impl.descriptors.e e2;
            do {
                h4 = g;
                if (!iterator.hasNext()) {
                    return h4;
                }
                final kotlin.reflect.jvm.internal.impl.name.e e3 = iterator.next();
                if (!(g instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                    return h;
                }
                final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b0 = ((kotlin.reflect.jvm.internal.impl.descriptors.e)g).B0();
                k0.o(e3, "name");
                final h g2 = ((k)b0).g(e3, (b)d.X);
                if (g2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g2;
                }
                else {
                    e2 = null;
                }
                g = e2;
            } while (e2 != null);
            return h;
        }
        else {
            final kotlin.reflect.jvm.internal.impl.name.b h5 = a.h();
            k0.o(h5, "classId.packageFqName");
            final m0 r2 = a2.R(h5);
            final List f2 = a.i().f();
            k0.o(f2, "classId.relativeClassName.pathSegments()");
            final kotlin.reflect.jvm.internal.impl.resolve.scopes.h x2 = r2.x();
            final kotlin.reflect.jvm.internal.impl.name.e o3 = v.o2((List<? extends kotlin.reflect.jvm.internal.impl.name.e>)f2);
            k0.o(o3, "segments.first()");
            h g3 = ((k)x2).g((kotlin.reflect.jvm.internal.impl.name.e)o3, (b)d.X);
            h h6 = null;
            Label_0418: {
                if (g3 != null) {
                    final Iterator<? extends kotlin.reflect.jvm.internal.impl.name.e> iterator2 = f2.subList(1, f2.size()).iterator();
                    kotlin.reflect.jvm.internal.impl.descriptors.e e4;
                    do {
                        h6 = g3;
                        if (!iterator2.hasNext()) {
                            break Label_0418;
                        }
                        final kotlin.reflect.jvm.internal.impl.name.e e5 = iterator2.next();
                        if (!(g3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                            break;
                        }
                        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b2 = ((kotlin.reflect.jvm.internal.impl.descriptors.e)g3).B0();
                        k0.o(e5, "name");
                        final h g4 = ((k)b2).g(e5, (b)d.X);
                        if (g4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                            e4 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g4;
                        }
                        else {
                            e4 = null;
                        }
                        g3 = e4;
                    } while (e4 != null);
                }
                h6 = null;
            }
            if (h6 != null) {
                return h6;
            }
            final kotlin.reflect.jvm.internal.impl.name.b h7 = a.h();
            k0.o(h7, "classId.packageFqName");
            final m0 r3 = e0.R(h7);
            final List f3 = a.i().f();
            k0.o(f3, "classId.relativeClassName.pathSegments()");
            final kotlin.reflect.jvm.internal.impl.resolve.scopes.h x3 = r3.x();
            final kotlin.reflect.jvm.internal.impl.name.e o4 = v.o2((List<? extends kotlin.reflect.jvm.internal.impl.name.e>)f3);
            k0.o(o4, "segments.first()");
            h g5 = ((k)x3).g((kotlin.reflect.jvm.internal.impl.name.e)o4, (b)d.X);
            if (g5 == null) {
                return h;
            }
            final Iterator<? extends kotlin.reflect.jvm.internal.impl.name.e> iterator3 = f3.subList(1, f3.size()).iterator();
            kotlin.reflect.jvm.internal.impl.descriptors.e e6;
            do {
                h4 = g5;
                if (!iterator3.hasNext()) {
                    return h4;
                }
                final kotlin.reflect.jvm.internal.impl.name.e e7 = iterator3.next();
                if (!(g5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                    return h;
                }
                final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b3 = ((kotlin.reflect.jvm.internal.impl.descriptors.e)g5).B0();
                k0.o(e7, "name");
                final h g6 = ((k)b3).g(e7, (b)d.X);
                if (g6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    e6 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g6;
                }
                else {
                    e6 = null;
                }
                g5 = e6;
            } while (e6 != null);
            return h;
        }
        return h4;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e c(@e final e0 e0, @e final a a, @e final g0 g0) {
        k0.p(e0, "<this>");
        k0.p(a, "classId");
        k0.p(g0, "notFoundClasses");
        final kotlin.reflect.jvm.internal.impl.descriptors.e a2 = a(e0, a);
        if (a2 != null) {
            return a2;
        }
        return g0.d(a, p.V2(p.d1(p.o((Object)a, (l)x$a.G), (l)x$b.G)));
    }
    
    @f
    public static final a1 d(@e final e0 e0, @e final a a) {
        k0.p(e0, "<this>");
        k0.p(a, "classId");
        final h b = b(e0, a);
        a1 a2;
        if (b instanceof a1) {
            a2 = (a1)b;
        }
        else {
            a2 = null;
        }
        return a2;
    }
}
