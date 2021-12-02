// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.sequences.p;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.jvm.internal.w;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public final class b0
{
    @e
    private final l a;
    @f
    private final b0 b;
    @e
    private final String c;
    @e
    private final String d;
    private boolean e;
    @e
    private final n6.l<Integer, h> f;
    @e
    private final n6.l<Integer, h> g;
    @e
    private final Map<Integer, b1> h;
    
    public b0(@e final l a, @f final b0 b, @e final List<a.s> list, @e final String c, @e final String d, final boolean e) {
        k0.p((Object)a, "c");
        k0.p((Object)list, "typeParameterProtos");
        k0.p((Object)c, "debugName");
        k0.p((Object)d, "containerPresentableName");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (n6.l<Integer, h>)a.h().i((n6.l<? super Object, ?>)new n6.l<Integer, h>() {
            @f
            public final h a(final int n) {
                return b0.this.d(n);
            }
        });
        this.g = (n6.l<Integer, h>)a.h().i((n6.l<? super Object, ?>)new n6.l<Integer, h>() {
            @f
            public final h a(final int n) {
                return b0.this.f(n);
            }
        });
        Map<Integer, b1> z;
        if (list.isEmpty()) {
            z = (Map<Integer, b1>)y0.z();
        }
        else {
            final LinkedHashMap<Integer, b1> linkedHashMap = new LinkedHashMap<Integer, b1>();
            final Iterator<a.s> iterator = list.iterator();
            int n = 0;
            while (true) {
                z = linkedHashMap;
                if (!iterator.hasNext()) {
                    break;
                }
                final a.s s = iterator.next();
                linkedHashMap.put(s.O(), (b1)new n(this.a, s, n));
                ++n;
            }
        }
        this.h = z;
    }
    
    public static final /* synthetic */ l c(final b0 b0) {
        return b0.a;
    }
    
    private final h d(final int n) {
        final kotlin.reflect.jvm.internal.impl.name.a a = v.a(this.a.g(), n);
        if (a.k()) {
            return (h)this.a.c().b(a);
        }
        return x.b(this.a.c().p(), a);
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 e(final int n) {
        if (v.a(this.a.g(), n).k()) {
            return this.a.c().n().a();
        }
        return null;
    }
    
    private final h f(final int n) {
        final kotlin.reflect.jvm.internal.impl.name.a a = v.a(this.a.g(), n);
        if (a.k()) {
            return null;
        }
        return (h)x.d(this.a.c().p(), a);
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 g(final c0 c0, final c0 c2) {
        final KotlinBuiltIns e = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(c0);
        final g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations();
        final c0 receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(c0);
        final List q1 = kotlin.collections.v.Q1(FunctionTypesKt.getValueParameterTypesFromFunctionType(c0), 1);
        final ArrayList list = new ArrayList<c0>(kotlin.collections.v.Y((Iterable)q1, 10));
        final Iterator<kotlin.reflect.jvm.internal.impl.types.y0> iterator = q1.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().a());
        }
        return FunctionTypesKt.createFunctionType(e, annotations, receiverTypeFromFunctionType, (List)list, (List)null, c2, true).U0(c0.O0());
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 h(final g g, final w0 w0, final List<? extends kotlin.reflect.jvm.internal.impl.types.y0> list, final boolean b) {
        final int n = w0.getParameters().size() - list.size();
        kotlin.reflect.jvm.internal.impl.types.k0 k0 = null;
        if (n != 0) {
            if (n == 1) {
                final int n2 = list.size() - 1;
                if (n2 >= 0) {
                    final d0 a = d0.a;
                    final w0 l = ((h)w0.w().getSuspendFunction(n2)).l();
                    kotlin.jvm.internal.k0.o((Object)l, "functionTypeConstructor.builtIns.getSuspendFunction(arity).typeConstructor");
                    k0 = d0.i(g, l, list, b, null, 16, null);
                }
            }
        }
        else {
            k0 = this.i(g, w0, list, b);
        }
        kotlin.reflect.jvm.internal.impl.types.k0 n3;
        if ((n3 = k0) == null) {
            n3 = u.n(kotlin.jvm.internal.k0.C("Bad suspend function in metadata with constructor: ", (Object)w0), (List<kotlin.reflect.jvm.internal.impl.types.y0>)list);
            kotlin.jvm.internal.k0.o((Object)n3, "createErrorTypeWithArguments(\n            \"Bad suspend function in metadata with constructor: $functionTypeConstructor\",\n            arguments\n        )");
        }
        return n3;
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 i(final g g, final w0 w0, final List<? extends kotlin.reflect.jvm.internal.impl.types.y0> list, final boolean b) {
        final d0 a = d0.a;
        final kotlin.reflect.jvm.internal.impl.types.k0 i = d0.i(g, w0, list, b, null, 16, null);
        kotlin.reflect.jvm.internal.impl.types.k0 o;
        if (!FunctionTypesKt.isFunctionType((c0)i)) {
            o = null;
        }
        else {
            o = this.o(i);
        }
        return o;
    }
    
    private static final List<a.q.b> m(a.q f, final b0 b0) {
        final List<a.q.b> x = f.X();
        k0.o((Object)x, "argumentList");
        f = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.f(f, b0.a.j());
        List<a.q.b> list;
        if (f == null) {
            list = null;
        }
        else {
            list = m(f, b0);
        }
        if (list == null) {
            list = (List<a.q.b>)kotlin.collections.v.E();
        }
        return (List<a.q.b>)kotlin.collections.v.q4((Collection)x, (Iterable)list);
    }
    
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.k0 n(final b0 b0, final a.q q, boolean b2, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b2 = true;
        }
        return b0.l(q, b2);
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 o(final c0 c0) {
        final boolean g = this.a.c().g().g();
        final kotlin.reflect.jvm.internal.impl.types.y0 y0 = (kotlin.reflect.jvm.internal.impl.types.y0)kotlin.collections.v.i3(FunctionTypesKt.getValueParameterTypesFromFunctionType(c0));
        final Object o = null;
        c0 a;
        if (y0 == null) {
            a = null;
        }
        else {
            a = y0.a();
        }
        if (a == null) {
            return null;
        }
        final h c2 = a.N0().c();
        b i;
        if (c2 == null) {
            i = null;
        }
        else {
            i = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)c2);
        }
        final int size = a.M0().size();
        final boolean b = true;
        if (size != 1 || (!SuspendFunctionTypesKt.isContinuation(i, true) && !SuspendFunctionTypesKt.isContinuation(i, false))) {
            return (kotlin.reflect.jvm.internal.impl.types.k0)c0;
        }
        final c0 a2 = ((kotlin.reflect.jvm.internal.impl.types.y0)kotlin.collections.v.U4((List)a.M0())).a();
        k0.o((Object)a2, "continuationArgumentType.arguments.single().type");
        Object e;
        if (!((e = this.a.e()) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            e = null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.a a3 = (kotlin.reflect.jvm.internal.impl.descriptors.a)e;
        Object e2;
        if (a3 == null) {
            e2 = o;
        }
        else {
            e2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.e((m)a3);
        }
        if (k0.g(e2, (Object)a0.a)) {
            return this.g(c0, a2);
        }
        boolean e3 = b;
        if (!this.e) {
            e3 = (g && SuspendFunctionTypesKt.isContinuation(i, g ^ true) && b);
        }
        this.e = e3;
        return this.g(c0, a2);
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.y0 q(final b1 b1, final a.q.b b2) {
        if (b2.z() == kotlin.reflect.jvm.internal.impl.metadata.a.q.b.c.K) {
            z0 z0;
            if (b1 == null) {
                z0 = new o0(this.a.c().p().w());
            }
            else {
                z0 = new p0(b1);
            }
            return z0;
        }
        final y a = y.a;
        final a.q.b.c z2 = b2.z();
        k0.o((Object)z2, "typeArgumentProto.projection");
        final k1 c = a.c(z2);
        final a.q l = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.l(b2, this.a.j());
        if (l == null) {
            return new a1(u.j("No type recorded"));
        }
        return new a1(c, this.p(l));
    }
    
    private final w0 r(final a.q q) {
        w0 w0 = null;
        String s2 = null;
        Label_0138: {
            if (q.n0()) {
                Object s;
                if ((s = this.f.invoke((Object)q.Y())) == null) {
                    s = s(this, q, q.Y());
                }
                w0 = ((h)s).l();
                s2 = "classifierDescriptors(proto.className) ?: notFoundClass(proto.className)).typeConstructor";
            }
            else if (q.w0()) {
                final w0 t = this.t(q.j0());
                if (t != null) {
                    w0 = t;
                    return w0;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown type parameter ");
                sb.append(q.j0());
                sb.append(". Please try recompiling module containing \"");
                sb.append(this.d);
                sb.append('\"');
                w0 = u.k(sb.toString());
                s2 = "createErrorTypeConstructor(\n                        \"Unknown type parameter ${proto.typeParameter}. Please try recompiling module containing \\\"$containerPresentableName\\\"\"\n                    )";
            }
            else {
                if (q.x0()) {
                    final m e = this.a.e();
                    final String string = this.a.g().getString(q.k0());
                    final Iterator<Object> iterator = this.k().iterator();
                    while (true) {
                        b1 next;
                        do {
                            final boolean hasNext = iterator.hasNext();
                            final w0 w2 = null;
                            if (!hasNext) {
                                next = null;
                                final b1 b1 = next;
                                if (b1 == null) {
                                    w0 = w2;
                                }
                                else {
                                    w0 = b1.l();
                                }
                                if (w0 == null) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Deserialized type parameter ");
                                    sb2.append(string);
                                    sb2.append(" in ");
                                    sb2.append(e);
                                    w0 = u.k(sb2.toString());
                                }
                                s2 = "{\n                val container = c.containingDeclaration\n                val name = c.nameResolver.getString(proto.typeParameterName)\n                val parameter = ownTypeParameters.find { it.name.asString() == name }\n                parameter?.typeConstructor ?: ErrorUtils.createErrorTypeConstructor(\"Deserialized type parameter $name in $container\")\n            }";
                                break Label_0138;
                            }
                            next = iterator.next();
                        } while (!k0.g((Object)((f0)next).getName().d(), (Object)string));
                        continue;
                    }
                }
                if (q.v0()) {
                    Object s3;
                    if ((s3 = this.g.invoke((Object)q.i0())) == null) {
                        s3 = s(this, q, q.i0());
                    }
                    w0 = ((h)s3).l();
                    s2 = "typeAliasDescriptors(proto.typeAliasName) ?: notFoundClass(proto.typeAliasName)).typeConstructor";
                }
                else {
                    w0 = u.k("Unknown type");
                    s2 = "createErrorTypeConstructor(\"Unknown type\")";
                }
            }
        }
        k0.o((Object)w0, s2);
        return w0;
    }
    
    private static final kotlin.reflect.jvm.internal.impl.descriptors.e s(final b0 b0, final a.q q, int z) {
        final kotlin.reflect.jvm.internal.impl.name.a a = v.a(b0.a.g(), z);
        final List<Integer> w2 = (List<Integer>)p.W2(p.d1((kotlin.sequences.m<?>)p.o((T)q, (n6.l<? super T, ? extends T>)new n6.l<a.q, a.q>() {
            @f
            public final a.q a(@e final a.q q) {
                k0.p((Object)q, "it");
                return kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.f(q, b0.c(b0).j());
            }
        }), (n6.l<? super Object, ?>)b0$f.G));
        z = p.Z((kotlin.sequences.m<?>)p.o((T)a, (n6.l<? super T, ? extends T>)b0$d.G));
        while (w2.size() < z) {
            w2.add(0);
        }
        return b0.a.c().q().d(a, (List)w2);
    }
    
    private final w0 t(final int i) {
        final b1 b1 = this.h.get(i);
        final w0 w0 = null;
        w0 w2;
        if (b1 == null) {
            w2 = null;
        }
        else {
            w2 = b1.l();
        }
        if (w2 == null) {
            final b0 b2 = this.b;
            if (b2 == null) {
                w2 = w0;
            }
            else {
                w2 = b2.t(i);
            }
        }
        return w2;
    }
    
    public final boolean j() {
        return this.e;
    }
    
    @e
    public final List<b1> k() {
        return (List<b1>)kotlin.collections.v.I5((Iterable)this.h.values());
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.types.k0 l(@e final a.q q, final boolean b) {
        k0.p((Object)q, "proto");
        kotlin.reflect.jvm.internal.impl.types.k0 e = null;
        Label_0047: {
            int n;
            if (q.n0()) {
                n = q.Y();
            }
            else {
                if (!q.v0()) {
                    e = null;
                    break Label_0047;
                }
                n = q.i0();
            }
            e = this.e(n);
        }
        if (e != null) {
            return e;
        }
        final w0 r = this.r(q);
        if (u.r((m)r.c())) {
            final kotlin.reflect.jvm.internal.impl.types.k0 o = u.o(r.toString(), r);
            k0.o((Object)o, "createErrorTypeWithCustomConstructor(constructor.toString(), constructor)");
            return o;
        }
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b b2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.a.h(), (n6.a<? extends List<? extends c>>)new n6.a<List<? extends c>>() {
            final /* synthetic */ b0 G;
            
            @e
            public final List<c> a() {
                return b0.c(this.G).c().d().d(q, b0.c(this.G).g());
            }
        });
        final List<a.q.b> m = m(q, this);
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.types.y0>(kotlin.collections.v.Y((Iterable)m, 10));
        final Iterator<Object> iterator = m.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final a.q.b next = iterator.next();
            if (n2 < 0) {
                kotlin.collections.v.W();
            }
            final a.q.b b3 = next;
            final List<b1> parameters = r.getParameters();
            k0.o((Object)parameters, "constructor.parameters");
            list.add(this.q((b1)kotlin.collections.v.J2((List)parameters, n2), b3));
            ++n2;
        }
        final List i5 = kotlin.collections.v.I5((Iterable)list);
        final h c = r.c();
        kotlin.reflect.jvm.internal.impl.types.k0 k0;
        if (b && c instanceof kotlin.reflect.jvm.internal.impl.descriptors.a1) {
            final d0 a = d0.a;
            final kotlin.reflect.jvm.internal.impl.types.k0 b4 = d0.b((kotlin.reflect.jvm.internal.impl.descriptors.a1)c, i5);
            k0 = b4.U0(e0.b(b4) || q.f0()).V0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.a(kotlin.collections.v.m4((Iterable)b2, (Iterable)((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)b4).getAnnotations())));
        }
        else {
            final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.a.g(q.b0());
            kotlin.jvm.internal.k0.o((Object)g, "SUSPEND_TYPE.get(proto.flags)");
            if (g) {
                k0 = this.h((g)b2, r, i5, q.f0());
            }
            else {
                final d0 a2 = d0.a;
                k0 = d0.i((g)b2, r, i5, q.f0(), null, 16, null);
            }
        }
        final a.q a3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(q, this.a.j());
        if (a3 != null) {
            final kotlin.reflect.jvm.internal.impl.types.k0 j = n0.j(k0, this.l(a3, false));
            if (j != null) {
                k0 = j;
            }
        }
        if (q.n0()) {
            return this.a.c().t().a(v.a(this.a.g(), q.Y()), k0);
        }
        return k0;
    }
    
    @e
    public final c0 p(@e final a.q q) {
        k0.p((Object)q, "proto");
        if (q.p0()) {
            final String string = this.a.g().getString(q.c0());
            final kotlin.reflect.jvm.internal.impl.types.k0 n = n(this, q, false, 2, null);
            final a.q c = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.c(q, this.a.j());
            k0.m((Object)c);
            return this.a.c().l().a(q, string, n, n(this, c, false, 2, null));
        }
        return this.l(q, true);
    }
    
    @e
    @Override
    public String toString() {
        final String c = this.c;
        final b0 b = this.b;
        String c2;
        if (b == null) {
            c2 = "";
        }
        else {
            c2 = k0.C(". Child of ", (Object)b.c);
        }
        return k0.C(c, (Object)c2);
    }
}
