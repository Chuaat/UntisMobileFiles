// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.jvm.internal.w;
import java.util.Iterator;
import kotlin.collections.q0;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.d;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.k;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;

public final class c
{
    @e
    private final g a;
    @e
    private final k b;
    
    public c(@e final g a, @e final k b) {
        k0.p((Object)a, "c");
        k0.p((Object)b, "typeParameterResolver");
        this.a = a;
        this.b = b;
    }
    
    private final boolean a(final j j, final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        final boolean b = b((x)v.i3((List)j.E()));
        boolean b2 = false;
        if (!b) {
            return false;
        }
        final List<b1> parameters = ((h)d.a.b(e)).l().getParameters();
        k0.o((Object)parameters, "JavaToKotlinClassMapper.convertReadOnlyToMutable(readOnlyContainer)\n            .typeConstructor.parameters");
        final b1 b3 = (b1)v.i3((List)parameters);
        k1 v;
        if (b3 == null) {
            v = null;
        }
        else {
            v = b3.v();
        }
        if (v == null) {
            return false;
        }
        if (v != k1.M) {
            b2 = true;
        }
        return b2;
    }
    
    private static final boolean b(final x x) {
        b0 b0;
        if (x instanceof b0) {
            b0 = (b0)x;
        }
        else {
            b0 = null;
        }
        final boolean b2 = false;
        boolean b3;
        if (b0 == null) {
            b3 = b2;
        }
        else {
            b3 = b2;
            if (b0.B() != null) {
                b3 = b2;
                if (!b0.I()) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    private final List<y0> c(final j j, final a a, final w0 w0) {
        final boolean v = j.v();
        int n = 1;
        Label_0071: {
            if (!v) {
                if (j.E().isEmpty()) {
                    final List<b1> parameters = w0.getParameters();
                    k0.o((Object)parameters, "constructor.parameters");
                    if (parameters.isEmpty() ^ true) {
                        n = n;
                        break Label_0071;
                    }
                }
                n = 0;
            }
        }
        final List<b1> parameters2 = w0.getParameters();
        k0.o((Object)parameters2, "constructor.parameters");
        if (n != 0) {
            final ArrayList list = new ArrayList<y0>(kotlin.collections.v.Y((Iterable)parameters2, 10));
            for (final b1 b1 : parameters2) {
                final f0 f0 = new f0(this.a.e(), (n6.a<? extends c0>)new n6.a<c0>() {
                    @e
                    public final c0 a() {
                        final b1 g = b1;
                        k0.o((Object)g, "parameter");
                        return kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.b(g, a.e(), (n6.a<? extends c0>)new n6.a<c0>() {
                            @e
                            public final c0 a() {
                                final h c = w0.c();
                                k0.m((Object)c);
                                final kotlin.reflect.jvm.internal.impl.types.k0 a = c.A();
                                k0.o((Object)a, "constructor.declarationDescriptor!!.defaultType");
                                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.m(a);
                            }
                        });
                    }
                });
                final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e c = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.c;
                k0.o((Object)b1, "parameter");
                a g;
                if (v) {
                    g = a;
                }
                else {
                    g = a.g(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.G);
                }
                list.add(c.i(b1, g, f0));
            }
            return (List<y0>)kotlin.collections.v.I5((Iterable)list);
        }
        if (parameters2.size() != j.E().size()) {
            final ArrayList list2 = new ArrayList<a1>(kotlin.collections.v.Y((Iterable)parameters2, 10));
            final Iterator<Object> iterator2 = parameters2.iterator();
            while (iterator2.hasNext()) {
                list2.add(new a1(u.j(((kotlin.reflect.jvm.internal.impl.descriptors.f0)iterator2.next()).getName().d())));
            }
            return (List<y0>)kotlin.collections.v.I5((Iterable)list2);
        }
        final Iterable u5 = kotlin.collections.v.U5((Iterable)j.E());
        final ArrayList list3 = new ArrayList<y0>(kotlin.collections.v.Y(u5, 10));
        for (final q0 q0 : u5) {
            final int a2 = q0.a();
            final x x = (x)q0.b();
            parameters2.size();
            final b1 b2 = parameters2.get(a2);
            final a f2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.H, false, null, 3, null);
            k0.o((Object)b2, "parameter");
            list3.add(this.o(x, f2, b2));
        }
        return (List<y0>)kotlin.collections.v.I5((Iterable)list3);
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 d(final j j, final a a, final kotlin.reflect.jvm.internal.impl.types.k0 k0) {
        final Object o = null;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations;
        if (k0 == null) {
            annotations = null;
        }
        else {
            annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)k0).getAnnotations();
        }
        Object o2 = annotations;
        if (annotations == null) {
            o2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(this.a, j, false, 4, null);
        }
        final w0 e = this.e(j, a);
        if (e == null) {
            return null;
        }
        final boolean h = this.h(a);
        Object n0;
        if (k0 == null) {
            n0 = o;
        }
        else {
            n0 = k0.N0();
        }
        if (k0.g(n0, (Object)e) && !j.v() && h) {
            return k0.U0(true);
        }
        final List<y0> c = this.c(j, a, e);
        final d0 a2 = d0.a;
        return d0.i((kotlin.reflect.jvm.internal.impl.descriptors.annotations.g)o2, e, c, h, null, 16, null);
    }
    
    private final w0 e(final j j, final a a) {
        final i b = j.b();
        if (b == null) {
            return this.f(j);
        }
        final boolean b2 = b instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.g;
        final w0 w0 = null;
        w0 l = null;
        w0 w2;
        if (b2) {
            final kotlin.reflect.jvm.internal.impl.load.java.structure.g g = (kotlin.reflect.jvm.internal.impl.load.java.structure.g)b;
            final kotlin.reflect.jvm.internal.impl.name.b f = g.f();
            if (f == null) {
                throw new AssertionError((Object)k0.C("Class type should have a FQ name: ", (Object)b));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e e;
            if ((e = this.i(j, a, f)) == null) {
                e = this.a.a().m().a(g);
            }
            if (e != null) {
                l = ((h)e).l();
            }
            w2 = l;
            if (l == null) {
                w2 = this.f(j);
            }
        }
        else {
            if (!(b instanceof y)) {
                throw new IllegalStateException(k0.C("Unknown classifier kind: ", (Object)b));
            }
            final b1 a2 = this.b.a((y)b);
            if (a2 == null) {
                w2 = w0;
            }
            else {
                w2 = a2.l();
            }
        }
        return w2;
    }
    
    private final w0 f(final j j) {
        final kotlin.reflect.jvm.internal.impl.name.a m = kotlin.reflect.jvm.internal.impl.name.a.m(new kotlin.reflect.jvm.internal.impl.name.b(j.x()));
        k0.o((Object)m, "topLevel(FqName(javaType.classifierQualifiedName))");
        final w0 l = ((h)this.a.a().b().f().q().d(m, v.k((Object)0))).l();
        k0.o((Object)l, "c.components.deserializedDescriptorResolver.components.notFoundClasses.getClass(classId, listOf(0)).typeConstructor");
        return l;
    }
    
    private final boolean g(final k1 k1, final b1 b1) {
        final k1 v = b1.v();
        final k1 i = k1.K;
        boolean b2 = false;
        if (v == i) {
            return false;
        }
        if (k1 != b1.v()) {
            b2 = true;
        }
        return b2;
    }
    
    private final boolean h(final a a) {
        final b c = a.c();
        final b i = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.I;
        final boolean b = false;
        if (c == i) {
            return false;
        }
        boolean b2 = b;
        if (!a.f()) {
            b2 = b;
            if (a.d() != kotlin.reflect.jvm.internal.impl.load.java.components.k.G) {
                b2 = true;
            }
        }
        return b2;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e i(final j j, final a a, final kotlin.reflect.jvm.internal.impl.name.b b) {
        if (a.f() && k0.g((Object)b, (Object)kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.a())) {
            return this.a.a().o().getKClass();
        }
        final d a2 = d.a;
        final kotlin.reflect.jvm.internal.impl.descriptors.e h = d.h(a2, b, this.a.d().w(), (Integer)null, 4, (Object)null);
        if (h == null) {
            return null;
        }
        if (a2.e(h) && (a.c() == b.I || a.d() == kotlin.reflect.jvm.internal.impl.load.java.components.k.G || this.a(j, h))) {
            return a2.b(h);
        }
        return h;
    }
    
    public static /* synthetic */ c0 k(final c c, final f f, final a a, boolean b, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        return c.j(f, a, b);
    }
    
    private final c0 l(final j j, final a a) {
        final boolean b = !a.f() && a.d() != kotlin.reflect.jvm.internal.impl.load.java.components.k.G;
        final boolean v = j.v();
        if (!v && !b) {
            kotlin.reflect.jvm.internal.impl.types.k0 k0;
            if ((k0 = this.d(j, a, null)) == null) {
                k0 = m(j);
            }
            return k0;
        }
        final kotlin.reflect.jvm.internal.impl.types.k0 d = this.d(j, a.g(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.I), null);
        if (d == null) {
            return m(j);
        }
        final kotlin.reflect.jvm.internal.impl.types.k0 d2 = this.d(j, a.g(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.H), d);
        if (d2 == null) {
            return m(j);
        }
        j1 d3;
        if (v) {
            d3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f(d, d2);
        }
        else {
            final d0 a2 = d0.a;
            d3 = d0.d(d, d2);
        }
        return d3;
    }
    
    private static final kotlin.reflect.jvm.internal.impl.types.k0 m(final j j) {
        final kotlin.reflect.jvm.internal.impl.types.k0 i = u.j(k0.C("Unresolved java class ", (Object)j.o()));
        k0.o((Object)i, "createErrorType(\"Unresolved java class ${javaType.presentableText}\")");
        return i;
    }
    
    private final y0 o(final x x, final a a, final b1 b1) {
        y0 y0;
        if (x instanceof b0) {
            final b0 b2 = (b0)x;
            final x b3 = b2.B();
            k1 k1;
            if (b2.I()) {
                k1 = kotlin.reflect.jvm.internal.impl.types.k1.M;
            }
            else {
                k1 = kotlin.reflect.jvm.internal.impl.types.k1.L;
            }
            if (b3 != null && !this.g(k1, b1)) {
                y0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.d(this.n(b3, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.H, false, null, 3, null)), k1, b1);
            }
            else {
                y0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.d(b1, a);
            }
        }
        else {
            y0 = new a1(k1.K, this.n(x, a));
        }
        return y0;
    }
    
    @e
    public final c0 j(@e final f f, @e final a a, final boolean b) {
        k0.p((Object)f, "arrayType");
        k0.p((Object)a, "attr");
        final x n = f.n();
        kotlin.reflect.jvm.internal.impl.load.java.structure.v v;
        if (n instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.v) {
            v = (kotlin.reflect.jvm.internal.impl.load.java.structure.v)n;
        }
        else {
            v = null;
        }
        PrimitiveType a2;
        if (v == null) {
            a2 = null;
        }
        else {
            a2 = v.a();
        }
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.d d = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(this.a, f, true);
        if (a2 != null) {
            j1 j1 = this.a.d().w().getPrimitiveArrayKotlinType(a2);
            k0.o((Object)j1, "c.module.builtIns.getPrimitiveArrayKotlinType(primitiveType)");
            ((kotlin.reflect.jvm.internal.impl.types.k0)j1).V0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.a(kotlin.collections.v.m4((Iterable)d, (Iterable)((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)j1).getAnnotations())));
            if (!a.f()) {
                final d0 a3 = d0.a;
                j1 = d0.d((kotlin.reflect.jvm.internal.impl.types.k0)j1, ((kotlin.reflect.jvm.internal.impl.types.k0)j1).U0(true));
            }
            return j1;
        }
        final c0 n2 = this.n(n, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.H, a.f(), null, 2, null));
        if (a.f()) {
            k1 k1;
            if (b) {
                k1 = kotlin.reflect.jvm.internal.impl.types.k1.M;
            }
            else {
                k1 = kotlin.reflect.jvm.internal.impl.types.k1.K;
            }
            final kotlin.reflect.jvm.internal.impl.types.k0 arrayType = this.a.d().w().getArrayType(k1, n2, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g)d);
            k0.o((Object)arrayType, "c.module.builtIns.getArrayType(projectionKind, componentType, annotations)");
            return arrayType;
        }
        final d0 a4 = d0.a;
        final kotlin.reflect.jvm.internal.impl.types.k0 arrayType2 = this.a.d().w().getArrayType(k1.K, n2, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g)d);
        k0.o((Object)arrayType2, "c.module.builtIns.getArrayType(INVARIANT, componentType, annotations)");
        return d0.d(arrayType2, this.a.d().w().getArrayType(k1.M, n2, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g)d).U0(true));
    }
    
    @e
    public final c0 n(@org.jetbrains.annotations.f x b, @e final a a) {
        k0.p((Object)a, "attr");
        c0 c0;
        if (b instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.v) {
            final PrimitiveType a2 = ((kotlin.reflect.jvm.internal.impl.load.java.structure.v)b).a();
            if (a2 != null) {
                c0 = this.a.d().w().getPrimitiveKotlinType(a2);
            }
            else {
                c0 = this.a.d().w().getUnitType();
            }
            k0.o((Object)c0, "{\n                val primitiveType = javaType.type\n                if (primitiveType != null) c.module.builtIns.getPrimitiveKotlinType(primitiveType)\n                else c.module.builtIns.unitType\n            }");
        }
        else if (b instanceof j) {
            c0 = this.l((j)b, a);
        }
        else if (b instanceof f) {
            c0 = k(this, (f)b, a, false, 4, null);
        }
        else {
            if (b instanceof b0) {
                b = ((b0)b).B();
                c0 n;
                if (b == null) {
                    n = null;
                }
                else {
                    n = this.n(b, a);
                }
                c0 = n;
                if (n != null) {
                    return c0;
                }
            }
            else if (b != null) {
                throw new UnsupportedOperationException(k0.C("Unsupported type: ", (Object)b));
            }
            c0 = this.a.d().w().getDefaultBound();
            k0.o((Object)c0, "c.module.builtIns.defaultBound");
        }
        return c0;
    }
}
