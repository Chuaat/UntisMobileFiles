// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.w;
import kotlin.reflect.jvm.internal.impl.resolve.constants.z;
import kotlin.reflect.jvm.internal.impl.resolve.constants.r;
import kotlin.reflect.jvm.internal.impl.resolve.constants.y;
import kotlin.reflect.jvm.internal.impl.resolve.constants.l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.i;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.j;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.collections.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Iterator;
import kotlin.ranges.k;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.collections.t0;
import kotlin.collections.v;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.constants.b;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class e
{
    @org.jetbrains.annotations.e
    private final e0 a;
    @org.jetbrains.annotations.e
    private final g0 b;
    
    public e(@org.jetbrains.annotations.e final e0 a, @org.jetbrains.annotations.e final g0 b) {
        k0.p((Object)a, "module");
        k0.p((Object)b, "notFoundClasses");
        this.a = a;
        this.b = b;
    }
    
    private final boolean b(final g<?> g, c0 arrayElementType, final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c c) {
        final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c.c v = c.V();
        int n;
        if (v == null) {
            n = -1;
        }
        else {
            n = e.a.a[v.ordinal()];
        }
        boolean g2 = false;
        if (n != 10) {
            if (n != 13) {
                g2 = k0.g((Object)g.a(this.a), (Object)arrayElementType);
                return g2;
            }
            if (!(g instanceof b) || ((g<List>)g).b().size() != c.L().size()) {
                throw new IllegalStateException(k0.C("Deserialized ArrayValue should have the same number of elements as the original array value: ", (Object)g).toString());
            }
            arrayElementType = this.c().getArrayElementType(arrayElementType);
            k0.o((Object)arrayElementType, "builtIns.getArrayElementType(expectedType)");
            final b b = (b)g;
            final k f = kotlin.collections.v.F((Collection)((g<Collection>)b).b());
            if (!(f instanceof Collection) || !((Collection)f).isEmpty()) {
                final Iterator iterator = ((Iterable)f).iterator();
                while (iterator.hasNext()) {
                    final int b2 = ((t0)iterator).b();
                    final g<?> g3 = ((g<List<g>>)b).b().get(b2);
                    final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c j = c.J(b2);
                    k0.o((Object)j, "value.getArrayElement(i)");
                    if (!this.b(g3, arrayElementType, j)) {
                        return g2;
                    }
                }
            }
        }
        else {
            final h c2 = arrayElementType.N0().c();
            kotlin.reflect.jvm.internal.impl.descriptors.e e;
            if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
            }
            else {
                e = null;
            }
            if (e != null && !KotlinBuiltIns.isKClass(e)) {
                return g2;
            }
        }
        g2 = true;
        return g2;
    }
    
    private final KotlinBuiltIns c() {
        return this.a.w();
    }
    
    private final s0<kotlin.reflect.jvm.internal.impl.name.e, g<?>> d(final kotlin.reflect.jvm.internal.impl.metadata.a.b.b b, final Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends e1> map, final c c) {
        final e1 e1 = (e1)map.get(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(c, b.y()));
        if (e1 == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.e b2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(c, b.y());
        final c0 a = ((d1)e1).a();
        k0.o((Object)a, "parameter.type");
        final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c z = b.z();
        k0.o((Object)z, "proto.value");
        return (s0<kotlin.reflect.jvm.internal.impl.name.e, g<?>>)new s0((Object)b2, (Object)this.g(a, z, c));
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e e(final kotlin.reflect.jvm.internal.impl.name.a a) {
        return x.c(this.a, a, this.b);
    }
    
    private final g<?> g(final c0 obj, final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c c, final c c2) {
        g<?> f = this.f(obj, c, c2);
        if (!this.b(f, obj, c)) {
            f = null;
        }
        g<?> a = f;
        if (f == null) {
            final kotlin.reflect.jvm.internal.impl.resolve.constants.k.a b = kotlin.reflect.jvm.internal.impl.resolve.constants.k.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected argument value: actual type ");
            sb.append(c.V());
            sb.append(" != expected type ");
            sb.append(obj);
            a = b.a(sb.toString());
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.metadata.a.b b, @org.jetbrains.annotations.e final c c) {
        k0.p((Object)b, "proto");
        k0.p((Object)c, "nameResolver");
        final kotlin.reflect.jvm.internal.impl.descriptors.e e = this.e(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a(c, b.D()));
        Map map2;
        final Map map = map2 = y0.z();
        if (b.y() != 0) {
            map2 = map;
            if (!u.r((m)e)) {
                map2 = map;
                if (d.t((m)e)) {
                    final Collection j = e.j();
                    k0.o((Object)j, "annotationClass.constructors");
                    final kotlin.reflect.jvm.internal.impl.descriptors.d d = (kotlin.reflect.jvm.internal.impl.descriptors.d)v.V4((Iterable)j);
                    map2 = map;
                    if (d != null) {
                        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).m();
                        k0.o((Object)m, "constructor.valueParameters");
                        final LinkedHashMap linkedHashMap = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, e1>(o.n(y0.j(v.Y((Iterable)m, 10)), 16));
                        for (final e1 next : m) {
                            linkedHashMap.put(((f0)next).getName(), next);
                        }
                        final List<kotlin.reflect.jvm.internal.impl.metadata.a.b.b> z = b.z();
                        k0.o((Object)z, "proto.argumentList");
                        final ArrayList<s0<kotlin.reflect.jvm.internal.impl.name.e, g<?>>> list = new ArrayList<s0<kotlin.reflect.jvm.internal.impl.name.e, g<?>>>();
                        for (final kotlin.reflect.jvm.internal.impl.metadata.a.b.b b2 : z) {
                            k0.o((Object)b2, "it");
                            final s0<kotlin.reflect.jvm.internal.impl.name.e, g<?>> d2 = this.d(b2, (Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends e1>)linkedHashMap, c);
                            if (d2 != null) {
                                list.add(d2);
                            }
                        }
                        map2 = y0.B0((Iterable)list);
                    }
                }
            }
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c)new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d((c0)e.A(), map2, w0.a);
    }
    
    @org.jetbrains.annotations.e
    public final g<?> f(@org.jetbrains.annotations.e final c0 obj, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c c, @org.jetbrains.annotations.e final c c2) {
        k0.p((Object)obj, "expectedType");
        k0.p((Object)c, "value");
        k0.p((Object)c2, "nameResolver");
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.N.g(c.R());
        k0.o((Object)g, "IS_UNSIGNED.get(value.flags)");
        final boolean booleanValue = g;
        final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c.c v = c.V();
        int n;
        if (v == null) {
            n = -1;
        }
        else {
            n = e.a.a[v.ordinal()];
        }
        Object b = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported annotation argument type: ");
                sb.append(c.V());
                sb.append(" (expected ");
                sb.append(obj);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
            }
            case 13: {
                final kotlin.reflect.jvm.internal.impl.resolve.constants.h a = kotlin.reflect.jvm.internal.impl.resolve.constants.h.a;
                final List<kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c> l = c.L();
                k0.o((Object)l, "value.arrayElementList");
                final ArrayList list = new ArrayList<g<?>>(kotlin.collections.v.Y((Iterable)l, 10));
                for (final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c c3 : l) {
                    final kotlin.reflect.jvm.internal.impl.types.k0 anyType = this.c().getAnyType();
                    k0.o((Object)anyType, "builtIns.anyType");
                    k0.o((Object)c3, "it");
                    list.add(this.f(anyType, c3, c2));
                }
                b = a.b((List<? extends g<?>>)list, obj);
                break;
            }
            case 12: {
                final kotlin.reflect.jvm.internal.impl.metadata.a.b h = c.H();
                k0.o((Object)h, "value.annotation");
                b = new kotlin.reflect.jvm.internal.impl.resolve.constants.a(this.a(h, c2));
                break;
            }
            case 11: {
                b = new j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a(c2, c.M()), kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(c2, c.Q()));
                break;
            }
            case 10: {
                b = new q(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a(c2, c.M()), c.I());
                break;
            }
            case 9: {
                b = new kotlin.reflect.jvm.internal.impl.resolve.constants.v(c2.getString(c.U()));
                break;
            }
            case 8: {
                b = new kotlin.reflect.jvm.internal.impl.resolve.constants.c(c.T() != 0L);
                break;
            }
            case 7: {
                b = new i(c.P());
                break;
            }
            case 6: {
                b = new l(c.S());
                break;
            }
            case 5: {
                final long t = c.T();
                if (booleanValue) {
                    b = new y(t);
                }
                else {
                    b = new r(t);
                }
                break;
            }
            case 4: {
                final int n2 = (int)c.T();
                if (booleanValue) {
                    b = new kotlin.reflect.jvm.internal.impl.resolve.constants.x(n2);
                    break;
                }
                b = new kotlin.reflect.jvm.internal.impl.resolve.constants.m(n2);
                break;
            }
            case 3: {
                final short n3 = (short)c.T();
                if (booleanValue) {
                    b = new z(n3);
                    break;
                }
                b = new kotlin.reflect.jvm.internal.impl.resolve.constants.u(n3);
                break;
            }
            case 2: {
                b = new kotlin.reflect.jvm.internal.impl.resolve.constants.e((char)c.T());
                break;
            }
            case 1: {
                final byte b2 = (byte)c.T();
                if (booleanValue) {
                    b = new w(b2);
                    break;
                }
                b = new kotlin.reflect.jvm.internal.impl.resolve.constants.d(b2);
                break;
            }
        }
        return (g<?>)b;
    }
}
