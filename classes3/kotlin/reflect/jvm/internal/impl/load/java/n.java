// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import n6.l;
import kotlin.sequences.m;
import kotlin.sequences.p;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.resolve.j;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.resolve.e;

public final class n implements e
{
    @org.jetbrains.annotations.e
    @Override
    public e.a a() {
        return e.a.H;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b b(@org.jetbrains.annotations.e kotlin.reflect.jvm.internal.impl.descriptors.a o, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @f final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(o, "superDescriptor");
        k0.p((Object)a, "subDescriptor");
        if (a instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) {
            final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f f = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.f)a;
            final List typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)f).getTypeParameters();
            k0.o((Object)typeParameters, "subDescriptor.typeParameters");
            if (!(typeParameters.isEmpty() ^ true)) {
                final j.i z = j.z((kotlin.reflect.jvm.internal.impl.descriptors.a)o, a);
                final Object o2 = null;
                j.i.a c;
                if (z == null) {
                    c = null;
                }
                else {
                    c = z.c();
                }
                if (c != null) {
                    return b.J;
                }
                final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)f).m();
                k0.o((Object)m, "subDescriptor.valueParameters");
                final m<Object> d1 = p.d1((m<?>)v.n1((Iterable)m), (n6.l<? super Object, ?>)n$b.G);
                final c0 returnType = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)f).getReturnType();
                k0.m((Object)returnType);
                final m<c0> g2 = p.g2((m<? extends c0>)d1, returnType);
                final t0 q0 = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)f).q0();
                Object a2;
                if (q0 == null) {
                    a2 = o2;
                }
                else {
                    a2 = ((d1)q0).a();
                }
                while (true) {
                    for (final c0 c2 : p.f2((m<? extends c0>)g2, (Iterable<? extends c0>)v.M(a2))) {
                        if ((c2.M0().isEmpty() ^ true) && !(c2.Q0() instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f)) {
                            final boolean b = true;
                            if (b) {
                                return kotlin.reflect.jvm.internal.impl.resolve.e.b.J;
                            }
                            final Object o3 = ((y0)o).d(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.c.c());
                            if (o3 == null) {
                                return kotlin.reflect.jvm.internal.impl.resolve.e.b.J;
                            }
                            o = o3;
                            if (o3 instanceof v0) {
                                final v0 v0 = (v0)o3;
                                final List typeParameters2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v0).getTypeParameters();
                                k0.o((Object)typeParameters2, "erasedSuper.typeParameters");
                                o = o3;
                                if (typeParameters2.isEmpty() ^ true) {
                                    o = v0.B().m(v.E()).h();
                                    k0.m(o);
                                }
                            }
                            final j.i.a c3 = j.d.I((kotlin.reflect.jvm.internal.impl.descriptors.a)o, a, false).c();
                            k0.o((Object)c3, "DEFAULT.isOverridableByWithoutExternalConditions(erasedSuper, subDescriptor, false).result");
                            b b2;
                            if (n.a.a[c3.ordinal()] == 1) {
                                b2 = kotlin.reflect.jvm.internal.impl.resolve.e.b.G;
                            }
                            else {
                                b2 = kotlin.reflect.jvm.internal.impl.resolve.e.b.J;
                            }
                            return b2;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        return b.J;
    }
}
