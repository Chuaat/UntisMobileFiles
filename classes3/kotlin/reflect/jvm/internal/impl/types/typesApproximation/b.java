// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.j1;
import n6.l;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.f1;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.w0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.s0;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.z;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class b
{
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0> a(@e final c0 c0) {
        k0.p((Object)c0, "type");
        if (z.b(c0)) {
            final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0> a = a(z.c(c0));
            final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0> a2 = a(z.d(c0));
            final d0 a3 = d0.a;
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0>(h1.b(d0.d(z.c(a.c()), z.d(a2.c())), c0), h1.b(d0.d(z.c(a.d()), z.d(a2.d())), c0));
        }
        final w0 n0 = c0.N0();
        if (d.d(c0)) {
            final y0 a4 = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b)n0).a();
            final c0 a5 = a4.a();
            k0.o((Object)a5, "typeProjection.type");
            final c0 b = b(a5, c0);
            final int n2 = a.a[a4.c().ordinal()];
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a a6;
            if (n2 != 2) {
                if (n2 != 3) {
                    throw new AssertionError((Object)k0.C("Only nontrivial projections should have been captured, not: ", (Object)a4));
                }
                final kotlin.reflect.jvm.internal.impl.types.k0 nothingType = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(c0).getNothingType();
                k0.o((Object)nothingType, "type.builtIns.nothingType");
                a6 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0>(b(nothingType, c0), b);
            }
            else {
                final kotlin.reflect.jvm.internal.impl.types.k0 nullableAnyType = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(c0).getNullableAnyType();
                k0.o((Object)nullableAnyType, "type.builtIns.nullableAnyType");
                a6 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0>(b, nullableAnyType);
            }
            return (kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0>)a6;
        }
        if (!c0.M0().isEmpty() && c0.M0().size() == n0.getParameters().size()) {
            final ArrayList<c> list = new ArrayList<c>();
            final ArrayList<c> list2 = new ArrayList<c>();
            final List<y0> m0 = c0.M0();
            final List<b1> parameters = n0.getParameters();
            k0.o((Object)parameters, "typeConstructor.parameters");
            for (final s0 s0 : v.V5((Iterable)m0, (Iterable)parameters)) {
                final y0 y0 = (y0)s0.a();
                final b1 b2 = (b1)s0.b();
                k0.o((Object)b2, "typeParameter");
                c g = g(y0, b2);
                if (y0.d()) {
                    list.add(g);
                }
                else {
                    final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c> d = d(g);
                    final c e = d.a();
                    g = d.b();
                    list.add(e);
                }
                list2.add(g);
            }
            final boolean empty = list.isEmpty();
            boolean b3 = true;
            Label_0490: {
                if (!empty) {
                    final Iterator<Object> iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        if (iterator2.next().d() ^ true) {
                            break Label_0490;
                        }
                    }
                }
                b3 = false;
            }
            c0 c2;
            if (b3) {
                c2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(c0).getNothingType();
                k0.o((Object)c2, "type.builtIns.nothingType");
            }
            else {
                c2 = e(c0, list);
            }
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0>(c2, e(c0, list2));
        }
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0>(c0, c0);
    }
    
    private static final c0 b(c0 q, final c0 c0) {
        q = f1.q(q, c0.O0());
        k0.o((Object)q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return q;
    }
    
    @f
    public static final y0 c(@f final y0 y0, final boolean b) {
        if (y0 == null) {
            return null;
        }
        if (y0.d()) {
            return y0;
        }
        final c0 a = y0.a();
        k0.o((Object)a, "typeProjection.type");
        if (!f1.c(a, (l<j1, Boolean>)b$b.G)) {
            return y0;
        }
        final k1 c = y0.c();
        k0.o((Object)c, "typeProjection.projectionKind");
        if (c == k1.M) {
            return new a1(c, a(a).d());
        }
        if (b) {
            return new a1(c, a(a).c());
        }
        return f(y0);
    }
    
    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c> d(final c c) {
        final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0> a = a(c.a());
        final c0 c2 = a.a();
        final c0 c3 = a.b();
        final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c0> a2 = a(c.b());
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<c>(new c(c.c(), c3, a2.a()), new c(c.c(), c2, a2.b()));
    }
    
    private static final c0 e(final c0 c0, final List<c> list) {
        c0.M0().size();
        list.size();
        final ArrayList list2 = new ArrayList<y0>(v.Y((Iterable)list, 10));
        final Iterator<c> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(h(iterator.next()));
        }
        return c1.e(c0, list2, null, null, 6, null);
    }
    
    private static final y0 f(final y0 y0) {
        final d1 g = d1.g(new x0() {
            @f
            @Override
            public y0 j(@e final w0 w0) {
                k0.p((Object)w0, "key");
                b b;
                if (w0 instanceof b) {
                    b = (b)w0;
                }
                else {
                    b = null;
                }
                if (b == null) {
                    return null;
                }
                if (b.a().d()) {
                    return new a1(k1.M, b.a().a());
                }
                return b.a();
            }
        });
        k0.o((Object)g, "create(object : TypeConstructorSubstitution() {\n        override fun get(key: TypeConstructor): TypeProjection? {\n            val capturedTypeConstructor = key as? CapturedTypeConstructor ?: return null\n            if (capturedTypeConstructor.projection.isStarProjection) {\n                return TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.projection.type)\n            }\n            return capturedTypeConstructor.projection\n        }\n    })");
        return g.t(y0);
    }
    
    private static final c g(final y0 y0, final b1 b1) {
        final int n = a.a[d1.c(b1.v(), y0).ordinal()];
        c c;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                final kotlin.reflect.jvm.internal.impl.types.k0 nothingType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)b1).getNothingType();
                k0.o((Object)nothingType, "typeParameter.builtIns.nothingType");
                final c0 a = y0.a();
                k0.o((Object)a, "type");
                c = new c(b1, nothingType, a);
            }
            else {
                final c0 a2 = y0.a();
                k0.o((Object)a2, "type");
                final kotlin.reflect.jvm.internal.impl.types.k0 nullableAnyType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)b1).getNullableAnyType();
                k0.o((Object)nullableAnyType, "typeParameter.builtIns.nullableAnyType");
                c = new c(b1, a2, nullableAnyType);
            }
        }
        else {
            final c0 a3 = y0.a();
            k0.o((Object)a3, "type");
            final c0 a4 = y0.a();
            k0.o((Object)a4, "type");
            c = new c(b1, a3, a4);
        }
        return c;
    }
    
    private static final y0 h(final c c) {
        c.d();
        if (!k0.g((Object)c.a(), (Object)c.b())) {
            final k1 v = c.c().v();
            final k1 l = k1.L;
            if (v != l) {
                if (KotlinBuiltIns.isNothing(c.a()) && c.c().v() != l) {
                    return new a1(i(c, k1.M), c.b());
                }
                if (KotlinBuiltIns.isNullableAny(c.b())) {
                    return new a1(i(c, l), c.a());
                }
                return new a1(i(c, k1.M), c.b());
            }
        }
        return new a1(c.a());
    }
    
    private static final k1 i(final c c, final k1 k1) {
        k1 i = k1;
        if (k1 == c.c().v()) {
            i = k1.K;
        }
        return i;
    }
}
