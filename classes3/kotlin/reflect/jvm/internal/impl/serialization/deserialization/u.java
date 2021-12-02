// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.storage.j;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.types.j1;
import java.util.List;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class u
{
    @e
    private final l a;
    @e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e b;
    
    public u(@e final l a) {
        k0.p((Object)a, "c");
        this.a = a;
        this.b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(a.c().p(), a.c().q());
    }
    
    public static final /* synthetic */ l b(final u u) {
        return u.a;
    }
    
    private final x c(final m m) {
        x c1;
        if (m instanceof h0) {
            c1 = new x.b(((h0)m).f(), this.a.g(), this.a.j(), (w0)this.a.d());
        }
        else if (m instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) {
            c1 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)m).c1();
        }
        else {
            c1 = null;
        }
        return c1;
    }
    
    private final h.a d(final h h, final b0 b0) {
        if (!this.s(h)) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h.a.G;
        }
        this.g(b0);
        h.a a;
        if (b0.j()) {
            a = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h.a.I;
        }
        else {
            a = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h.a.G;
        }
        return a;
    }
    
    private final h.a e(final c c, final t0 t0, final Collection<? extends e1> collection, final Collection<? extends b1> collection2, final c0 c2, final boolean b) {
        if (!this.s(c)) {
            return h.a.G;
        }
        if (k0.g((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.e((m)c), (Object)a0.a)) {
            return h.a.G;
        }
        final ArrayList<c0> list = new ArrayList<c0>(v.Y((Iterable)collection, 10));
        final Iterator<e1> iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add(((d1)iterator.next()).a());
        }
        final Object o = null;
        Object a;
        if (t0 == null) {
            a = null;
        }
        else {
            a = ((d1)t0).a();
        }
        final List q4 = v.q4((Collection)list, (Iterable)v.M(a));
        Object value;
        if (c2 == null) {
            value = o;
        }
        else {
            value = this.f(c2);
        }
        if (k0.g(value, (Object)Boolean.TRUE)) {
            return h.a.I;
        }
        boolean b3 = false;
        Label_0283: {
            if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                final Iterator<b1> iterator2 = (Iterator<b1>)collection2.iterator();
                while (iterator2.hasNext()) {
                    final List upperBounds = iterator2.next().getUpperBounds();
                    k0.o((Object)upperBounds, "typeParameter.upperBounds");
                    boolean b2 = false;
                    Label_0275: {
                        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
                            for (final c0 c3 : upperBounds) {
                                k0.o((Object)c3, "it");
                                if (this.f(c3)) {
                                    b2 = true;
                                    break Label_0275;
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        b3 = true;
                        break Label_0283;
                    }
                }
            }
            b3 = false;
        }
        if (b3) {
            return h.a.I;
        }
        final ArrayList list2 = new ArrayList<h.a>(v.Y((Iterable)q4, 10));
        for (final c0 c4 : q4) {
            k0.o((Object)c4, "type");
            h.a a3 = null;
            Label_0472: {
                if (FunctionTypesKt.isSuspendFunctionType(c4) && c4.M0().size() <= 3) {
                    final List<y0> m0 = c4.M0();
                    boolean b4 = false;
                    Label_0438: {
                        if (!(m0 instanceof Collection) || !m0.isEmpty()) {
                            final Iterator<Object> iterator5 = m0.iterator();
                            while (iterator5.hasNext()) {
                                final c0 a2 = iterator5.next().a();
                                k0.o((Object)a2, "it.type");
                                if (this.f(a2)) {
                                    b4 = true;
                                    break Label_0438;
                                }
                            }
                        }
                        b4 = false;
                    }
                    if (!b4) {
                        a3 = h.a.H;
                        break Label_0472;
                    }
                }
                else if (!this.f(c4)) {
                    a3 = h.a.G;
                    break Label_0472;
                }
                a3 = h.a.I;
            }
            list2.add(a3);
        }
        Enum<h.a> g;
        if ((g = (h.a)v.F3((Iterable)list2)) == null) {
            g = h.a.G;
        }
        h.a a4;
        if (b) {
            a4 = h.a.H;
        }
        else {
            a4 = h.a.G;
        }
        return (h.a)kotlin.comparisons.a.O((Comparable)a4, (Comparable)g);
    }
    
    private final boolean f(final c0 c0) {
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.b(c0, (n6.l<? super j1, Boolean>)u$a.G);
    }
    
    private final void g(final b0 b0) {
        final Iterator<b1> iterator = b0.k().iterator();
        while (iterator.hasNext()) {
            iterator.next().getUpperBounds();
        }
    }
    
    private final g h(final q q, final int n, final b b) {
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b.g(n)) {
            return g.r.b();
        }
        return (g)new o(this.a.h(), (n6.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>)new n6.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() {
            final /* synthetic */ u G;
            
            @e
            public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
                final u g = this.G;
                final x a = g.c(u.b(g).e());
                List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
                if (a == null) {
                    list = null;
                }
                else {
                    list = (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.I5((Iterable)u.b(this.G).c().d().j(a, q, b));
                }
                if (list == null) {
                    list = (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.E();
                }
                return list;
            }
        });
    }
    
    private final t0 i() {
        final m e = this.a.e();
        final boolean b = e instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
        final t0 t0 = null;
        kotlin.reflect.jvm.internal.impl.descriptors.e e2;
        if (b) {
            e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)e;
        }
        else {
            e2 = null;
        }
        t0 k0;
        if (e2 == null) {
            k0 = t0;
        }
        else {
            k0 = e2.K0();
        }
        return k0;
    }
    
    private final g j(final kotlin.reflect.jvm.internal.impl.metadata.a.n n, final boolean b) {
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b.g(n.U())) {
            return g.r.b();
        }
        return (g)new o(this.a.h(), (n6.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>)new n6.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() {
            final /* synthetic */ u G;
            
            @e
            public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
                final u g = this.G;
                final x a = g.c(u.b(g).e());
                List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
                if (a == null) {
                    list = null;
                }
                else {
                    final boolean h = b;
                    final u g2 = this.G;
                    final kotlin.reflect.jvm.internal.impl.metadata.a.n i = n;
                    List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list2;
                    if (h) {
                        list2 = u.b(g2).c().d().i(a, i);
                    }
                    else {
                        list2 = u.b(g2).c().d().g(a, i);
                    }
                    list = (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.I5((Iterable)list2);
                }
                if (list == null) {
                    list = (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.E();
                }
                return list;
            }
        });
    }
    
    private final g k(final q q, final b b) {
        return (g)new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.a.h(), (n6.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>)new n6.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() {
            final /* synthetic */ u G;
            
            @e
            public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
                final u g = this.G;
                final x a = g.c(u.b(g).e());
                List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
                if (a == null) {
                    list = null;
                }
                else {
                    list = u.b(this.G).c().d().h(a, q, b);
                }
                if (list == null) {
                    list = (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.E();
                }
                return list;
            }
        });
    }
    
    private final void l(final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l l, final t0 t0, final t0 t2, final List<? extends b1> list, final List<? extends e1> list2, final c0 c0, final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, final kotlin.reflect.jvm.internal.impl.descriptors.u u, final Map<? extends a$a<?>, ?> map, final boolean b2) {
        l.s1(t0, t2, list, list2, c0, b0, u, map, this.e(l, t0, list2, list, c0, b2));
    }
    
    private final int o(final int n) {
        return (n & 0x3F) + (n >> 8 << 6);
    }
    
    private final List<e1> r(final List<kotlin.reflect.jvm.internal.impl.metadata.a.u> list, final q q, final b b) {
        final kotlin.reflect.jvm.internal.impl.descriptors.a a = (kotlin.reflect.jvm.internal.impl.descriptors.a)this.a.e();
        final m c = ((n)a).c();
        k0.o((Object)c, "callableDescriptor.containingDeclaration");
        final x c2 = this.c(c);
        final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.impl.k0>(v.Y((Iterable)list, 10));
        final Iterator<kotlin.reflect.jvm.internal.impl.metadata.a.u> iterator = list.iterator();
        int n = 0;
        final ArrayList list3 = list2;
        while (iterator.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.metadata.a.u next = iterator.next();
            if (n < 0) {
                v.W();
            }
            final kotlin.reflect.jvm.internal.impl.metadata.a.u u = next;
            int m;
            if (u.S()) {
                m = u.M();
            }
            else {
                m = 0;
            }
            Object b2 = null;
            Label_0195: {
                if (c2 != null) {
                    final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b.g(m);
                    k0.o((Object)g, "HAS_ANNOTATIONS.get(flags)");
                    if (g) {
                        b2 = new o(this.a.h(), (n6.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>)new n6.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() {
                            final /* synthetic */ u G;
                            
                            @e
                            public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
                                return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.I5((Iterable)u.b(this.G).c().d().b(c2, q, b, n, u));
                            }
                        });
                        break Label_0195;
                    }
                }
                b2 = g.r.b();
            }
            final kotlin.reflect.jvm.internal.impl.name.e b3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(this.a.g(), u.N());
            final c0 p3 = this.a.i().p(f.m(u, this.a.j()));
            final Boolean g2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.F.g(m);
            k0.o((Object)g2, "DECLARES_DEFAULT_VALUE.get(flags)");
            final boolean booleanValue = g2;
            final Boolean g3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.G.g(m);
            k0.o((Object)g3, "IS_CROSSINLINE.get(flags)");
            final boolean booleanValue2 = g3;
            final Boolean g4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.H.g(m);
            k0.o((Object)g4, "IS_NOINLINE.get(flags)");
            final boolean booleanValue3 = g4;
            final kotlin.reflect.jvm.internal.impl.metadata.a.q p4 = f.p(u, this.a.j());
            c0 p5;
            if (p4 == null) {
                p5 = null;
            }
            else {
                p5 = this.a.i().p(p4);
            }
            final w0 a2 = w0.a;
            k0.o((Object)a2, "NO_SOURCE");
            list3.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0(a, (e1)null, n, (g)b2, b3, p3, booleanValue, booleanValue2, booleanValue3, p5, a2));
            ++n;
        }
        return (List<e1>)v.I5((Iterable)list3);
    }
    
    private final boolean s(final h h) {
        final boolean g = this.a.c().g().g();
        boolean b = false;
        if (g) {
            final List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.h> j0 = h.J0();
            boolean b2 = false;
            Label_0132: {
                if (!(j0 instanceof Collection) || !j0.isEmpty()) {
                    for (final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h h2 : j0) {
                        if (k0.g((Object)h2.b(), (Object)new kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.b(1, 3, 0, 4, null)) && h2.a() == kotlin.reflect.jvm.internal.impl.metadata.a.v.d.H) {
                            b2 = false;
                            break Label_0132;
                        }
                    }
                }
                b2 = true;
            }
            b = b;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    @e
    public final d m(@e final kotlin.reflect.jvm.internal.impl.metadata.a.d d, final boolean b) {
        k0.p((Object)d, "proto");
        final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)this.a.e();
        final int l = d.L();
        final b g = b.G;
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d d2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d(e, null, this.h(d, l, g), b, b$a.G, d, this.a.g(), this.a.j(), this.a.k(), this.a.d(), null, 1024, null);
        final u f = kotlin.reflect.jvm.internal.impl.serialization.deserialization.l.b(this.a, (m)d2, v.E(), null, null, null, null, 60, null).f();
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.u> o = d.O();
        k0.o((Object)o, "proto.valueParameterList");
        d2.q1((List)f.r(o, d, g), z.a(y.a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c.d(d.L())));
        ((p)d2).h1((c0)e.A());
        final boolean booleanValue = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.m.g(d.L());
        boolean b2 = true;
        ((p)d2).Z0(booleanValue ^ true);
        final m e2 = this.a.e();
        final boolean b3 = e2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;
        final Object o2 = null;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e e3;
        if (b3) {
            e3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)e2;
        }
        else {
            e3 = null;
        }
        l x0;
        if (e3 == null) {
            x0 = null;
        }
        else {
            x0 = e3.X0();
        }
        Object value;
        if (x0 == null) {
            value = o2;
        }
        else {
            final b0 i = x0.i();
            if (i == null) {
                value = o2;
            }
            else {
                value = i.j();
            }
        }
        if (!k0.g(value, (Object)Boolean.TRUE) || !this.s(d2)) {
            b2 = false;
        }
        Enum<h.a> enum1;
        if (b2) {
            enum1 = h.a.I;
        }
        else {
            final List m = ((p)d2).m();
            k0.o((Object)m, "descriptor.valueParameters");
            final List typeParameters = ((p)d2).getTypeParameters();
            k0.o((Object)typeParameters, "descriptor.typeParameters");
            enum1 = this.e(d2, null, m, typeParameters, ((p)d2).getReturnType(), false);
        }
        d2.v1((h.a)enum1);
        return (d)d2;
    }
    
    @e
    public final v0 n(@e final kotlin.reflect.jvm.internal.impl.metadata.a.i i) {
        k0.p((Object)i, "proto");
        int n;
        if (i.m0()) {
            n = i.W();
        }
        else {
            n = this.o(i.Y());
        }
        final b g = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.G;
        final g h = this.h(i, n, g);
        g g2;
        if (f.d(i)) {
            g2 = this.k(i, g);
        }
        else {
            g2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        }
        i j;
        if (k0.g((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i(this.a.e()).c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(this.a.g(), i.X())), (Object)a0.a)) {
            j = i.b.b();
        }
        else {
            j = this.a.k();
        }
        final m e = this.a.e();
        final kotlin.reflect.jvm.internal.impl.name.e b = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(this.a.g(), i.X());
        final y a = y.a;
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l l = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l(e, null, h, b, z.b(a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.n.d(n)), i, this.a.g(), this.a.j(), j, this.a.d(), null, 1024, null);
        final l a2 = this.a;
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.s> f0 = i.f0();
        k0.o((Object)f0, "proto.typeParameterList");
        final l b2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.l.b(a2, (m)l, f0, null, null, null, null, 60, null);
        final kotlin.reflect.jvm.internal.impl.metadata.a.q g3 = f.g(i, this.a.j());
        final t0 t0 = null;
        t0 f2;
        if (g3 == null) {
            f2 = t0;
        }
        else {
            final c0 p = b2.i().p(g3);
            if (p == null) {
                f2 = t0;
            }
            else {
                f2 = kotlin.reflect.jvm.internal.impl.resolve.c.f((kotlin.reflect.jvm.internal.impl.descriptors.a)l, p, g2);
            }
        }
        final t0 k = this.i();
        final List<b1> m = b2.i().k();
        final u f3 = b2.f();
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.u> j2 = i.j0();
        k0.o((Object)j2, "proto.valueParameterList");
        final List<e1> r = f3.r(j2, i, g);
        final c0 p2 = b2.i().p(f.i(i, this.a.j()));
        final kotlin.reflect.jvm.internal.impl.descriptors.b0 b3 = a.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.d(n));
        final kotlin.reflect.jvm.internal.impl.descriptors.u a3 = z.a(a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c.d(n));
        final Map z = kotlin.collections.y0.z();
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b t2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.t;
        final Boolean g4 = t2.g(n);
        k0.o((Object)g4, "IS_SUSPEND.get(flags)");
        this.l(l, f2, k, m, r, p2, b3, a3, z, g4);
        final Boolean g5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.o.g(n);
        k0.o((Object)g5, "IS_OPERATOR.get(flags)");
        ((p)l).g1((boolean)g5);
        final Boolean g6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.p.g(n);
        k0.o((Object)g6, "IS_INFIX.get(flags)");
        ((p)l).d1((boolean)g6);
        final Boolean g7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.s.g(n);
        k0.o((Object)g7, "IS_EXTERNAL_FUNCTION.get(flags)");
        ((p)l).Y0((boolean)g7);
        final Boolean g8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.q.g(n);
        k0.o((Object)g8, "IS_INLINE.get(flags)");
        ((p)l).f1((boolean)g8);
        final Boolean g9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.r.g(n);
        k0.o((Object)g9, "IS_TAILREC.get(flags)");
        ((p)l).j1((boolean)g9);
        final Boolean g10 = t2.g(n);
        k0.o((Object)g10, "IS_SUSPEND.get(flags)");
        ((p)l).i1((boolean)g10);
        final Boolean g11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.u.g(n);
        k0.o((Object)g11, "IS_EXPECT_FUNCTION.get(flags)");
        ((p)l).X0((boolean)g11);
        ((p)l).Z0(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.v.g(n) ^ true);
        final s0<a$a<?>, Object> a4 = this.a.c().h().a(i, (kotlin.reflect.jvm.internal.impl.descriptors.y)l, this.a.j(), b2.i());
        if (a4 != null) {
            ((p)l).V0((a$a)a4.e(), a4.f());
        }
        return (v0)l;
    }
    
    @e
    public final q0 p(@e final kotlin.reflect.jvm.internal.impl.metadata.a.n n) {
        k0.p((Object)n, "proto");
        int n2;
        if (n.i0()) {
            n2 = n.U();
        }
        else {
            n2 = this.o(n.X());
        }
        final m e = this.a.e();
        final g h = this.h(n, n2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.H);
        final y a = y.a;
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d<kotlin.reflect.jvm.internal.impl.metadata.a.k> d = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d;
        final kotlin.reflect.jvm.internal.impl.descriptors.b0 b = a.b(d.d(n2));
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d<kotlin.reflect.jvm.internal.impl.metadata.a.x> c = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c;
        final kotlin.reflect.jvm.internal.impl.descriptors.u a2 = z.a(a, c.d(n2));
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.w.g(n2);
        k0.o((Object)g, "IS_VAR.get(flags)");
        final boolean booleanValue = g;
        final kotlin.reflect.jvm.internal.impl.name.e b2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(this.a.g(), n.W());
        final b$a b3 = z.b(a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.n.d(n2));
        final Boolean g2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A.g(n2);
        k0.o((Object)g2, "IS_LATEINIT.get(flags)");
        final boolean booleanValue2 = g2;
        final Boolean g3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.z.g(n2);
        k0.o((Object)g3, "IS_CONST.get(flags)");
        final boolean booleanValue3 = g3;
        final Boolean g4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C.g(n2);
        k0.o((Object)g4, "IS_EXTERNAL_PROPERTY.get(flags)");
        final boolean booleanValue4 = g4;
        final Boolean g5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.D.g(n2);
        k0.o((Object)g5, "IS_DELEGATED.get(flags)");
        final boolean booleanValue5 = g5;
        final Boolean g6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.E.g(n2);
        k0.o((Object)g6, "IS_EXPECT_PROPERTY.get(flags)");
        final boolean booleanValue6 = g6;
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g7 = this.a.g();
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j = this.a.j();
        final i k = this.a.k();
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g d2 = this.a.d();
        final y y = a;
        final k i = new k(e, null, h, b, a2, booleanValue, b2, b3, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, n, g7, j, k, d2);
        final l a3 = this.a;
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.s> g8 = n.g0();
        k0.o((Object)g8, "proto.typeParameterList");
        final l b4 = l.b(a3, (m)i, g8, null, null, null, null, 60, null);
        final Boolean g9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.x.g(n2);
        k0.o((Object)g9, "HAS_GETTER.get(flags)");
        final boolean booleanValue7 = g9;
        g g10;
        if (booleanValue7 && f.e(n)) {
            g10 = this.k(n, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.I);
        }
        else {
            g10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        }
        final c0 p = b4.i().p(f.j(n, this.a.j()));
        final List<b1> l = b4.i().k();
        final t0 m = this.i();
        final kotlin.reflect.jvm.internal.impl.metadata.a.q h2 = f.h(n, this.a.j());
        t0 f = null;
        Label_0544: {
            if (h2 != null) {
                final c0 p2 = b4.i().p(h2);
                if (p2 != null) {
                    f = kotlin.reflect.jvm.internal.impl.resolve.c.f((kotlin.reflect.jvm.internal.impl.descriptors.a)i, p2, g10);
                    break Label_0544;
                }
            }
            f = null;
        }
        i.b1(p, (List)l, m, f);
        final Boolean g11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b.g(n2);
        k0.o((Object)g11, "HAS_ANNOTATIONS.get(flags)");
        int n3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b(g11, c.d(n2), d.d(n2), false, false, false);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 b5;
        if (booleanValue7) {
            int v;
            if (n.j0()) {
                v = n.V();
            }
            else {
                v = n3;
            }
            final Boolean g12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.I.g(v);
            k0.o((Object)g12, "IS_NOT_DEFAULT.get(getterFlags)");
            final boolean booleanValue8 = g12;
            final Boolean g13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J.g(v);
            k0.o((Object)g13, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            final boolean booleanValue9 = g13;
            final Boolean g14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K.g(v);
            k0.o((Object)g14, "IS_INLINE_ACCESSOR.get(getterFlags)");
            final boolean booleanValue10 = g14;
            final g h3 = this.h(n, v, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.I);
            if (booleanValue8) {
                b5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.c0((q0)i, h3, y.b(d.d(v)), z.a(y, c.d(v)), booleanValue8 ^ true, booleanValue9, booleanValue10, i.n(), (r0)null, w0.a);
            }
            else {
                b5 = kotlin.reflect.jvm.internal.impl.resolve.c.b((q0)i, h3);
                k0.o((Object)b5, "{\n                DescriptorFactory.createDefaultGetter(property, annotations)\n            }");
            }
            b5.R0(i.getReturnType());
        }
        else {
            b5 = null;
        }
        final Boolean g15 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.y.g(n2);
        k0.o((Object)g15, "HAS_SETTER.get(flags)");
        Object c2;
        if (g15) {
            if (n.q0()) {
                n3 = n.c0();
            }
            final Boolean g16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.I.g(n3);
            k0.o((Object)g16, "IS_NOT_DEFAULT.get(setterFlags)");
            final boolean booleanValue11 = g16;
            final Boolean g17 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J.g(n3);
            k0.o((Object)g17, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            final boolean booleanValue12 = g17;
            final Boolean g18 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K.g(n3);
            k0.o((Object)g18, "IS_INLINE_ACCESSOR.get(setterFlags)");
            final boolean booleanValue13 = g18;
            final b j2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.J;
            final g h4 = this.h(n, n3, j2);
            if (booleanValue11) {
                final d0 d3 = new d0((q0)i, h4, a.b(d.d(n3)), z.a(a, c.d(n3)), booleanValue11 ^ true, booleanValue12, booleanValue13, i.n(), (kotlin.reflect.jvm.internal.impl.descriptors.s0)null, w0.a);
                d3.S0((e1)v.U4((List)kotlin.reflect.jvm.internal.impl.serialization.deserialization.l.b(b4, (m)d3, v.E(), null, null, null, null, 60, null).f().r(v.k((Object)n.d0()), n, j2)));
                c2 = d3;
            }
            else {
                c2 = kotlin.reflect.jvm.internal.impl.resolve.c.c((q0)i, h4, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b());
                k0.o(c2, "{\n                DescriptorFactory.createDefaultSetter(\n                    property, annotations,\n                    Annotations.EMPTY /* Otherwise the setter is not default, see DescriptorResolver.resolvePropertySetterDescriptor */\n                )\n            }");
            }
        }
        else {
            c2 = null;
        }
        final Boolean g19 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B.g(n2);
        k0.o((Object)g19, "HAS_CONSTANT.get(flags)");
        if (g19) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.m0)i).M0((j)this.a.h().e((n6.a<?>)new n6.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>() {
                final /* synthetic */ u G;
                
                @org.jetbrains.annotations.f
                public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a() {
                    final u g = this.G;
                    final x a = g.c(u.b(g).e());
                    k0.m((Object)a);
                    final kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d = u.b(this.G).c().d();
                    final kotlin.reflect.jvm.internal.impl.metadata.a.n h = n;
                    final c0 returnType = i.getReturnType();
                    k0.o((Object)returnType, "property.returnType");
                    return d.e(a, h, returnType);
                }
            }));
        }
        i.e1(b5, (kotlin.reflect.jvm.internal.impl.descriptors.s0)c2, (kotlin.reflect.jvm.internal.impl.descriptors.w)new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(this.j(n, false), (q0)i), (kotlin.reflect.jvm.internal.impl.descriptors.w)new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(this.j(n, true), (q0)i), this.d(i, b4.i()));
        return (q0)i;
    }
    
    @e
    public final a1 q(@e final kotlin.reflect.jvm.internal.impl.metadata.a.r r) {
        k0.p((Object)r, "proto");
        final g$a r2 = g.r;
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.b> s = r.S();
        k0.o((Object)s, "proto.annotationList");
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(v.Y((Iterable)s, 10));
        for (final kotlin.reflect.jvm.internal.impl.metadata.a.b b : s) {
            final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e b2 = this.b;
            k0.o((Object)b, "it");
            list.add(b2.a(b, this.a.g()));
        }
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m m = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m(this.a.h(), this.a.e(), r2.a((List)list), kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(this.a.g(), r.Y()), z.a(y.a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c.d(r.X())), r, this.a.g(), this.a.j(), this.a.k(), this.a.d());
        final l a = this.a;
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.s> b3 = r.b0();
        k0.o((Object)b3, "proto.typeParameterList");
        final l b4 = l.b(a, (m)m, b3, null, null, null, null, 60, null);
        m.R0(b4.i().k(), b4.i().l(f.n(r, this.a.j()), false), b4.i().l(f.b(r, this.a.j()), false), this.d(m, b4.i()));
        return (a1)m;
    }
}
