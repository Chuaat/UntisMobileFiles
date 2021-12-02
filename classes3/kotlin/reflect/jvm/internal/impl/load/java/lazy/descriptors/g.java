// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.y$a;
import java.util.Collections;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.r;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.z;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.c;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.load.java.x;
import kotlin.reflect.jvm.internal.impl.load.java.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.load.java.q;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.collections.j1;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.collections.y0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.load.java.structure.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public final class g extends j
{
    @org.jetbrains.annotations.e
    private final e n;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.g o;
    private final boolean p;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i<List<d>> q;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.e>> r;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i<Map<kotlin.reflect.jvm.internal.impl.name.e, n>> s;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.impl.g> t;
    
    public g(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.load.java.lazy.g g, @org.jetbrains.annotations.e final e n, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.load.java.structure.g o, final boolean p5, @f final g g2) {
        k0.p((Object)g, "c");
        k0.p((Object)n, "ownerDescriptor");
        k0.p((Object)o, "jClass");
        super(g, g2);
        this.n = n;
        this.o = o;
        this.p = p5;
        this.q = g.e().g((n6.a<? extends List<d>>)new n6.a<List<? extends d>>() {
            final /* synthetic */ g G;
            
            @org.jetbrains.annotations.e
            public final List<d> a() {
                final Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.k> j = g.Q(this.G).j();
                final ArrayList list = new ArrayList<y>(j.size());
                final Iterator<kotlin.reflect.jvm.internal.impl.load.java.structure.k> iterator = j.iterator();
                while (iterator.hasNext()) {
                    list.add((y)g.this.G0(iterator.next()));
                }
                if (g.Q(this.G).r()) {
                    final d o = g.this.f0();
                    boolean b = false;
                    final String c = kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)o, false, false, 2, null);
                    Label_0160: {
                        if (!list.isEmpty()) {
                            final Iterator<d> iterator2 = (Iterator<d>)list.iterator();
                            while (iterator2.hasNext()) {
                                if (k0.g((Object)kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)iterator2.next(), false, false, 2, null), (Object)c)) {
                                    break Label_0160;
                                }
                            }
                        }
                        b = true;
                    }
                    if (b) {
                        list.add((y)o);
                        g.a().g().b(g.Q(this.G), (kotlin.reflect.jvm.internal.impl.descriptors.l)o);
                    }
                }
                final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l q = g.a().q();
                final kotlin.reflect.jvm.internal.impl.load.java.lazy.g h = g;
                final g g = this.G;
                List<Object> m = (List<Object>)list;
                if (list.isEmpty()) {
                    m = (List<Object>)v.M((Object)g.e0());
                }
                return (List<d>)v.I5((Iterable)q.e(h, (Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)m));
            }
        });
        this.r = g.e().g((n6.a<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
            final /* synthetic */ g G;
            
            @org.jetbrains.annotations.e
            public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                return (Set<kotlin.reflect.jvm.internal.impl.name.e>)v.N5((Iterable)g.Q(this.G).J());
            }
        });
        this.s = g.e().g((n6.a<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, n>>)new n6.a<Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends n>>() {
            final /* synthetic */ g G;
            
            @org.jetbrains.annotations.e
            public final Map<kotlin.reflect.jvm.internal.impl.name.e, n> a() {
                final Collection<n> c = g.Q(this.G).C();
                final ArrayList<n> list = new ArrayList<n>();
                for (final n next : c) {
                    if (next.F()) {
                        list.add(next);
                    }
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, n>(kotlin.ranges.o.n(y0.j(v.Y((Iterable)list, 10)), 16));
                for (final n next2 : list) {
                    linkedHashMap.put(next2.getName(), next2);
                }
                return (Map<kotlin.reflect.jvm.internal.impl.name.e, n>)linkedHashMap;
            }
        });
        this.t = g.e().i((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends kotlin.reflect.jvm.internal.impl.descriptors.impl.g>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.impl.g>() {
            final /* synthetic */ g G;
            
            @f
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.g a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "name");
                final boolean contains = ((Set)((n6.a)g.R(this.G)).invoke()).contains(e);
                Object m0 = null;
                if (!contains) {
                    final n n = ((Map)((n6.a)g.P(this.G)).invoke()).get(e);
                    if (n != null) {
                        m0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.n.M0(g.e(), this.G.z0(), e, (kotlin.reflect.jvm.internal.impl.storage.i)g.e().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                            final /* synthetic */ g G = g$j.this.G;
                            
                            @org.jetbrains.annotations.e
                            public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                                return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C((Set)this.G.b(), (Iterable)this.G.d());
                            }
                        }), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(g, n), (w0)g.a().s().a(n));
                    }
                }
                else {
                    final q d = g.a().d();
                    final kotlin.reflect.jvm.internal.impl.name.a h = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.h((kotlin.reflect.jvm.internal.impl.descriptors.h)this.G.z0());
                    k0.m((Object)h);
                    final kotlin.reflect.jvm.internal.impl.name.a d2 = h.d(e);
                    k0.o((Object)d2, "ownerDescriptor.classId!!.createNestedClassId(name)");
                    final kotlin.reflect.jvm.internal.impl.load.java.structure.g a = d.a(new q.a(d2, null, g.Q(this.G), 2, null));
                    if (a != null) {
                        final kotlin.reflect.jvm.internal.impl.load.java.lazy.g h2 = g;
                        m0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f(h2, (m)this.G.z0(), a, null, 8, null);
                        h2.a().e().a((kotlin.reflect.jvm.internal.impl.load.java.descriptors.d)m0);
                    }
                }
                return (kotlin.reflect.jvm.internal.impl.descriptors.impl.g)m0;
            }
        });
    }
    
    private final Set<q0> A0(final kotlin.reflect.jvm.internal.impl.name.e e) {
        final Collection<c0> c0 = this.c0();
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = c0.iterator();
        while (iterator.hasNext()) {
            final Collection<? extends q0> c2 = iterator.next().x().c(e, kotlin.reflect.jvm.internal.impl.incremental.components.d.U);
            final ArrayList list2 = new ArrayList<q0>(v.Y((Iterable)c2, 10));
            final Iterator<q0> iterator2 = c2.iterator();
            while (iterator2.hasNext()) {
                list2.add((q0)iterator2.next());
            }
            v.q0((Collection)list, (Iterable)list2);
        }
        return (Set<q0>)v.N5((Iterable)list);
    }
    
    private final boolean B0(final v0 v0, final y y) {
        final boolean b = false;
        final String c = kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)v0, false, false, 2, null);
        final y b2 = y.b();
        k0.o((Object)b2, "builtinWithErasedParameters.original");
        boolean b3 = b;
        if (k0.g((Object)c, (Object)kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(b2, false, false, 2, null))) {
            b3 = b;
            if (!this.p0((kotlin.reflect.jvm.internal.impl.descriptors.a)v0, (kotlin.reflect.jvm.internal.impl.descriptors.a)y)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    private final boolean C0(final v0 v0) {
        final kotlin.reflect.jvm.internal.impl.name.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName();
        k0.o((Object)name, "function.name");
        final List<kotlin.reflect.jvm.internal.impl.name.e> a = a0.a(name);
        final boolean b = a instanceof Collection;
        boolean b2 = true;
        boolean b5 = false;
        Label_0215: {
            if (!b || !a.isEmpty()) {
                final Iterator<Object> iterator = a.iterator();
                while (iterator.hasNext()) {
                    final Set<q0> a2 = this.A0(iterator.next());
                    boolean b4 = false;
                    Label_0207: {
                        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                            for (final q0 q0 : a2) {
                                boolean b3 = false;
                                Label_0199: {
                                    Label_0196: {
                                        if (this.o0(q0, (n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>() {
                                            @org.jetbrains.annotations.e
                                            public final Collection<v0> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                                                k0.p((Object)e, "accessorName");
                                                List list;
                                                if (k0.g((Object)((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName(), (Object)e)) {
                                                    list = v.k((Object)v0);
                                                }
                                                else {
                                                    list = v.q4(g.this.I0(e), (Iterable)g.this.J0(e));
                                                }
                                                return (Collection<v0>)list;
                                            }
                                        })) {
                                            if (!((g1)q0).n0()) {
                                                final x a3 = x.a;
                                                final String d = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName().d();
                                                k0.o((Object)d, "function.name.asString()");
                                                if (x.c(d)) {
                                                    break Label_0196;
                                                }
                                            }
                                            b3 = true;
                                            break Label_0199;
                                        }
                                    }
                                    b3 = false;
                                }
                                if (b3) {
                                    b4 = true;
                                    break Label_0207;
                                }
                            }
                        }
                        b4 = false;
                    }
                    if (b4) {
                        b5 = true;
                        break Label_0215;
                    }
                }
            }
            b5 = false;
        }
        if (b5) {
            return false;
        }
        if (this.q0(v0) || this.K0(v0) || this.s0(v0)) {
            b2 = false;
        }
        return b2;
    }
    
    private final v0 D0(v0 v0, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l, final Collection<? extends v0> collection) {
        final kotlin.reflect.jvm.internal.impl.load.java.f n = kotlin.reflect.jvm.internal.impl.load.java.f.n;
        final y k = kotlin.reflect.jvm.internal.impl.load.java.f.k((y)v0);
        final v0 v2 = null;
        if (k == null) {
            return null;
        }
        v0 = this.h0(k, l);
        if (v0 == null) {
            v0 = v2;
        }
        else {
            if (!this.C0(v0)) {
                v0 = null;
            }
            if (v0 == null) {
                v0 = v2;
            }
            else {
                v0 = this.g0(v0, (kotlin.reflect.jvm.internal.impl.descriptors.a)k, collection);
            }
        }
        return v0;
    }
    
    private final v0 E0(v0 v0, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l, final kotlin.reflect.jvm.internal.impl.name.e e, final Collection<? extends v0> collection) {
        v0 = b0.d(v0);
        if (v0 == null) {
            return null;
        }
        final String b = b0.b((kotlin.reflect.jvm.internal.impl.descriptors.b)v0);
        k0.m((Object)b);
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(b);
        k0.o((Object)i, "identifier(nameInJava)");
        final Iterator iterator = ((Collection)l.invoke((Object)i)).iterator();
        while (iterator.hasNext()) {
            final v0 m0 = this.m0(iterator.next(), e);
            if (this.r0(v0, (y)m0)) {
                return this.g0(m0, (kotlin.reflect.jvm.internal.impl.descriptors.a)v0, collection);
            }
        }
        return null;
    }
    
    private final v0 F0(final v0 v0, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        final boolean suspend = ((y)v0).isSuspend();
        final kotlin.reflect.jvm.internal.impl.descriptors.a a = null;
        if (!suspend) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName();
        k0.o((Object)name, "descriptor.name");
        final Iterator iterator = ((Iterable)l.invoke((Object)name)).iterator();
        Object n0;
        do {
            n0 = a;
            if (!iterator.hasNext()) {
                break;
            }
            n0 = this.n0(iterator.next());
            if (n0 != null && this.p0((kotlin.reflect.jvm.internal.impl.descriptors.a)n0, (kotlin.reflect.jvm.internal.impl.descriptors.a)v0)) {
                continue;
            }
            n0 = null;
        } while (n0 == null);
        return (v0)n0;
    }
    
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c G0(final kotlin.reflect.jvm.internal.impl.load.java.structure.k k) {
        final e z0 = this.z0();
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c t1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.c.t1(z0, kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.x(), k), false, (w0)this.x().a().s().a(k));
        k0.o((Object)t1, "createJavaConstructor(\n            classDescriptor,\n            c.resolveAnnotations(constructor), /* isPrimary = */\n            false,\n            c.components.sourceElementFactory.source(constructor)\n        )");
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.g e = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.e(this.x(), (m)t1, k, z0.C().size());
        final b l = this.L(e, (y)t1, k.m());
        final List c = z0.C();
        k0.o((Object)c, "classDescriptor.declaredTypeParameters");
        final List<kotlin.reflect.jvm.internal.impl.load.java.structure.y> typeParameters = k.getTypeParameters();
        final ArrayList list = new ArrayList<b1>(v.Y((Iterable)typeParameters, 10));
        final Iterator<Object> iterator = typeParameters.iterator();
        while (iterator.hasNext()) {
            final b1 a = e.f().a(iterator.next());
            k0.m((Object)a);
            list.add(a);
        }
        t1.r1((List)l.a(), d0.b(k.getVisibility()), v.q4((Collection)c, (Iterable)list));
        t1.Z0(false);
        t1.a1(l.b());
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)t1).h1((c0)z0.A());
        e.a().g().b(k, (kotlin.reflect.jvm.internal.impl.descriptors.l)t1);
        return t1;
    }
    
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f H0(final kotlin.reflect.jvm.internal.impl.load.java.structure.w w) {
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f q1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.q1((m)this.z0(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.x(), w), w.getName(), (w0)this.x().a().s().a(w), true);
        k0.o((Object)q1, "createJavaMethod(\n            ownerDescriptor, annotations, recordComponent.name, c.components.sourceElementFactory.source(recordComponent), true\n        )");
        q1.p1(null, this.A(), v.E(), v.E(), this.x().g().n(w.a(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.H, false, null, 2, null)), kotlin.reflect.jvm.internal.impl.descriptors.b0.G.a(false, false, true), kotlin.reflect.jvm.internal.impl.descriptors.t.e, null);
        q1.t1(false, false);
        this.x().a().g().e(w, (v0)q1);
        return q1;
    }
    
    private final Collection<v0> I0(final kotlin.reflect.jvm.internal.impl.name.e e) {
        final Collection<r> f = ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).f(e);
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.descriptors.f>(v.Y((Iterable)f, 10));
        final Iterator<Object> iterator = f.iterator();
        while (iterator.hasNext()) {
            list.add(this.J(iterator.next()));
        }
        return (Collection<v0>)list;
    }
    
    private final Collection<v0> J0(final kotlin.reflect.jvm.internal.impl.name.e e) {
        final Set<v0> y0 = this.y0(e);
        final ArrayList<v0> list = new ArrayList<v0>();
        for (final v0 next : y0) {
            final v0 v0 = next;
            boolean b = false;
            Label_0076: {
                if (!b0.a((kotlin.reflect.jvm.internal.impl.descriptors.b)v0)) {
                    final kotlin.reflect.jvm.internal.impl.load.java.f n = kotlin.reflect.jvm.internal.impl.load.java.f.n;
                    if (kotlin.reflect.jvm.internal.impl.load.java.f.k((y)v0) == null) {
                        b = false;
                        break Label_0076;
                    }
                }
                b = true;
            }
            if (!b) {
                list.add(next);
            }
        }
        return list;
    }
    
    private final boolean K0(final v0 v0) {
        final kotlin.reflect.jvm.internal.impl.load.java.f n = kotlin.reflect.jvm.internal.impl.load.java.f.n;
        final kotlin.reflect.jvm.internal.impl.name.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName();
        k0.o((Object)name, "name");
        final boolean l = n.l(name);
        final boolean b = false;
        if (!l) {
            return false;
        }
        final kotlin.reflect.jvm.internal.impl.name.e name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName();
        k0.o((Object)name2, "name");
        final Set<v0> y0 = this.y0(name2);
        final ArrayList<y> list = new ArrayList<y>();
        for (final v0 v2 : y0) {
            final kotlin.reflect.jvm.internal.impl.load.java.f n2 = kotlin.reflect.jvm.internal.impl.load.java.f.n;
            final y k = kotlin.reflect.jvm.internal.impl.load.java.f.k((y)v2);
            if (k != null) {
                list.add(k);
            }
        }
        boolean b2;
        if (list.isEmpty()) {
            b2 = b;
        }
        else {
            final Iterator<Object> iterator2 = list.iterator();
            do {
                b2 = b;
                if (iterator2.hasNext()) {
                    continue;
                }
                return b2;
            } while (!this.B0(v0, iterator2.next()));
            b2 = true;
        }
        return b2;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.i P(final g g) {
        return g.s;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.g Q(final g g) {
        return g.o;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.i R(final g g) {
        return g.r;
    }
    
    private final void V(final List<e1> list, final kotlin.reflect.jvm.internal.impl.descriptors.l l, final int n, final r r, c0 n2, final c0 c0) {
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        final kotlin.reflect.jvm.internal.impl.name.e name = r.getName();
        final c0 n3 = f1.n(n2);
        k0.o((Object)n3, "makeNotNullable(returnType)");
        final boolean k = r.K();
        if (c0 == null) {
            n2 = null;
        }
        else {
            n2 = f1.n(c0);
        }
        list.add((e1)new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0((kotlin.reflect.jvm.internal.impl.descriptors.a)l, (e1)null, n, b, name, n3, k, false, false, n2, (w0)this.x().a().s().a(r)));
    }
    
    private final void W(final Collection<v0> collection, final kotlin.reflect.jvm.internal.impl.name.e e, final Collection<? extends v0> collection2, final boolean b) {
        final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> d = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(e, (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)collection2, (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)collection, this.z0(), this.x().a().c(), this.x().a().j().a());
        k0.o((Object)d, "resolveOverridesForNonStaticMembers(\n            name, functionsFromSupertypes, result, ownerDescriptor, c.components.errorReporter,\n            c.components.kotlinTypeChecker.overridingUtil\n        )");
        if (!b) {
            collection.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)d);
        }
        else {
            final List q4 = v.q4((Collection)collection, (Iterable)d);
            final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>(v.Y((Iterable)d, 10));
            for (v0 g0 : d) {
                final v0 v0 = b0.e(g0);
                k0.o((Object)g0, "resolvedOverride");
                if (v0 != null) {
                    g0 = this.g0(g0, (kotlin.reflect.jvm.internal.impl.descriptors.a)v0, q4);
                }
                list.add((D)g0);
            }
            collection.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)list);
        }
    }
    
    private final void X(final kotlin.reflect.jvm.internal.impl.name.e e, final Collection<? extends v0> collection, final Collection<? extends v0> collection2, final Collection<v0> collection3, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        for (final v0 v0 : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, this.E0(v0, l, e, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, this.D0(v0, l, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, this.F0(v0, l));
        }
    }
    
    private final void Y(final Set<? extends q0> set, final Collection<q0> collection, final Set<q0> set2, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        for (final q0 q0 : set) {
            final kotlin.reflect.jvm.internal.impl.load.java.descriptors.g i0 = this.i0(q0, l);
            if (i0 != null) {
                collection.add((q0)i0);
                if (set2 == null) {
                    break;
                }
                set2.add(q0);
                break;
            }
        }
    }
    
    private final void Z(final kotlin.reflect.jvm.internal.impl.name.e e, final Collection<q0> collection) {
        final r r = (r)v.V4((Iterable)((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).f(e));
        if (r == null) {
            return;
        }
        collection.add((q0)k0(this, r, null, kotlin.reflect.jvm.internal.impl.descriptors.b0.H, 2, null));
    }
    
    private final Collection<c0> c0() {
        if (this.p) {
            final Collection<c0> k = ((kotlin.reflect.jvm.internal.impl.descriptors.h)this.z0()).l().k();
            k0.o((Object)k, "ownerDescriptor.typeConstructor.supertypes");
            return k;
        }
        return this.x().a().j().c().f(this.z0());
    }
    
    private final List<e1> d0(final kotlin.reflect.jvm.internal.impl.descriptors.impl.f f) {
        final Collection<r> l = this.o.L();
        final ArrayList list = new ArrayList<e1>(l.size());
        final kotlin.reflect.jvm.internal.impl.load.java.components.k h = kotlin.reflect.jvm.internal.impl.load.java.components.k.H;
        int n = 1;
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(h, true, null, 2, null);
        final ArrayList<r> list2 = new ArrayList<r>();
        final ArrayList<r> list3 = new ArrayList<r>();
        for (final r next : l) {
            if (k0.g((Object)next.getName(), (Object)kotlin.reflect.jvm.internal.impl.load.java.y.c)) {
                list2.add(next);
            }
            else {
                list3.add(next);
            }
        }
        final s0 s0 = new s0((Object)list2, (Object)list3);
        final List list4 = (List)s0.a();
        final List list5 = (List)s0.b();
        list4.size();
        final r r = (r)v.t2(list4);
        if (r != null) {
            final kotlin.reflect.jvm.internal.impl.load.java.structure.x returnType = r.getReturnType();
            s0 s2;
            if (returnType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.f) {
                final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c g = this.x().g();
                final kotlin.reflect.jvm.internal.impl.load.java.structure.f f3 = (kotlin.reflect.jvm.internal.impl.load.java.structure.f)returnType;
                s2 = new s0((Object)g.j(f3, f2, true), (Object)this.x().g().n(f3.n(), f2));
            }
            else {
                s2 = new s0((Object)this.x().g().n(returnType, f2), (Object)null);
            }
            this.V((List<e1>)list, (kotlin.reflect.jvm.internal.impl.descriptors.l)f, 0, r, (c0)s2.a(), (c0)s2.b());
        }
        int n2 = 0;
        if (r == null) {
            n = 0;
        }
        for (final r r2 : list5) {
            this.V((List<e1>)list, (kotlin.reflect.jvm.internal.impl.descriptors.l)f, n2 + n, r2, this.x().g().n(r2.getReturnType(), f2), null);
            ++n2;
        }
        return (List<e1>)list;
    }
    
    private final d e0() {
        final boolean p = this.o.p();
        if ((this.o.G() || !this.o.s()) && !p) {
            return null;
        }
        final e z0 = this.z0();
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c t1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.c.t1(z0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), true, (w0)this.x().a().s().a(this.o));
        k0.o((Object)t1, "createJavaConstructor(\n            classDescriptor, Annotations.EMPTY, /* isPrimary = */ true, c.components.sourceElementFactory.source(jClass)\n        )");
        Object o;
        if (p) {
            o = this.d0(t1);
        }
        else {
            o = Collections.emptyList();
        }
        t1.a1(false);
        t1.q1((List)o, this.w0(z0));
        t1.Z0(true);
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)t1).h1((c0)z0.A());
        this.x().a().g().b(this.o, (kotlin.reflect.jvm.internal.impl.descriptors.l)t1);
        return (d)t1;
    }
    
    private final d f0() {
        final e z0 = this.z0();
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c t1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.c.t1(z0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), true, (w0)this.x().a().s().a(this.o));
        k0.o((Object)t1, "createJavaConstructor(\n            classDescriptor, Annotations.EMPTY, /* isPrimary = */ true, c.components.sourceElementFactory.source(jClass)\n        )");
        final List<e1> l0 = this.l0(t1);
        t1.a1(false);
        t1.q1((List)l0, this.w0(z0));
        t1.Z0(false);
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)t1).h1((c0)z0.A());
        return (d)t1;
    }
    
    private final v0 g0(v0 v0, final kotlin.reflect.jvm.internal.impl.descriptors.a a, final Collection<? extends v0> collection) {
        final boolean b = collection instanceof Collection;
        final int n = 0;
        int n2 = 0;
        Label_0102: {
            if (!b || !collection.isEmpty()) {
                for (final v0 v2 : collection) {
                    if (!k0.g((Object)v0, (Object)v2) && ((y)v2).h0() == null && this.p0((kotlin.reflect.jvm.internal.impl.descriptors.a)v2, a)) {
                        n2 = n;
                        break Label_0102;
                    }
                }
            }
            n2 = 1;
        }
        if (n2 == 0) {
            v0 = (v0)v0.B().p().h();
            k0.m((Object)v0);
        }
        return v0;
    }
    
    private final v0 h0(final y y, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        final kotlin.reflect.jvm.internal.impl.name.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)y).getName();
        k0.o((Object)name, "overridden.name");
        final Iterator iterator = ((Iterable)l.invoke((Object)name)).iterator();
        while (true) {
            v0 next;
            do {
                final boolean hasNext = iterator.hasNext();
                final v0 v0 = null;
                if (!hasNext) {
                    next = null;
                    final v0 v2 = next;
                    v0 v3;
                    if (v2 == null) {
                        v3 = v0;
                    }
                    else {
                        final y$a b = v2.B();
                        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m();
                        k0.o((Object)m, "overridden.valueParameters");
                        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.descriptors.l>(v.Y((Iterable)m, 10));
                        for (final e1 e1 : m) {
                            final c0 a = ((d1)e1).a();
                            k0.o((Object)a, "it.type");
                            list.add(new kotlin.reflect.jvm.internal.impl.load.java.descriptors.l(a, e1.x0()));
                        }
                        final List i = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v2).m();
                        k0.o((Object)i, "override.valueParameters");
                        b.b((List)kotlin.reflect.jvm.internal.impl.load.java.descriptors.k.a((Collection<kotlin.reflect.jvm.internal.impl.load.java.descriptors.l>)list, i, (kotlin.reflect.jvm.internal.impl.descriptors.a)y));
                        b.t();
                        b.e();
                        v3 = (v0)b.h();
                    }
                    return v3;
                }
                next = iterator.next();
            } while (!this.B0(next, y));
            continue;
        }
    }
    
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.g i0(final q0 q0, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        final boolean o0 = this.o0(q0, l);
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.a0 a0 = null;
        if (!o0) {
            return null;
        }
        final v0 u0 = this.u0(q0, l);
        k0.m((Object)u0);
        Object v0;
        if (((g1)q0).n0()) {
            v0 = this.v0(q0, l);
            k0.m(v0);
        }
        else {
            v0 = null;
        }
        if (v0 != null) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.a0)v0).o();
            ((kotlin.reflect.jvm.internal.impl.descriptors.a0)u0).o();
        }
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e e = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e(this.z0(), u0, (v0)v0, q0);
        final c0 returnType = ((kotlin.reflect.jvm.internal.impl.descriptors.a)u0).getReturnType();
        k0.m((Object)returnType);
        e.b1(returnType, v.E(), this.A(), (t0)null);
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 h = kotlin.reflect.jvm.internal.impl.resolve.c.h((q0)e, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)u0).getAnnotations(), false, false, false, ((kotlin.reflect.jvm.internal.impl.descriptors.p)u0).k());
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.a0)h).O0((y)u0);
        h.R0(((l0)e).a());
        k0.o((Object)h, "createGetter(\n            propertyDescriptor, getterMethod.annotations, /* isDefault = */false,\n            /* isExternal = */ false, /* isInline = */ false, getterMethod.source\n        ).apply {\n            initialSignatureDescriptor = getterMethod\n            initialize(propertyDescriptor.type)\n        }");
        Object j = a0;
        if (v0 != null) {
            final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v0).m();
            k0.o((Object)m, "setterMethod.valueParameters");
            final e1 e2 = (e1)v.t2(m);
            if (e2 == null) {
                throw new AssertionError((Object)k0.C("No parameter found for ", v0));
            }
            j = kotlin.reflect.jvm.internal.impl.resolve.c.j((q0)e, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)v0).getAnnotations(), ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e2).getAnnotations(), false, false, false, ((kotlin.reflect.jvm.internal.impl.descriptors.a0)v0).getVisibility(), ((kotlin.reflect.jvm.internal.impl.descriptors.p)v0).k());
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.a0)j).O0((y)v0);
        }
        e.V0(h, (kotlin.reflect.jvm.internal.impl.descriptors.s0)j);
        return e;
    }
    
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.g j0(final r r, c0 r2, final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0) {
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.g d1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.g.d1((m)this.z0(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.x(), r), b0, d0.b(r.getVisibility()), false, r.getName(), (w0)this.x().a().s().a(r), false);
        k0.o((Object)d1, "create(\n            ownerDescriptor, annotations, modality, method.visibility.toDescriptorVisibility(),\n            /* isVar = */ false, method.name, c.components.sourceElementFactory.source(method),\n            /* isStaticFinal = */ false\n        )");
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 b2 = kotlin.reflect.jvm.internal.impl.resolve.c.b((q0)d1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b());
        k0.o((Object)b2, "createDefaultGetter(propertyDescriptor, Annotations.EMPTY)");
        d1.V0(b2, (kotlin.reflect.jvm.internal.impl.descriptors.s0)null);
        if (r2 == null) {
            r2 = this.r(r, kotlin.reflect.jvm.internal.impl.load.java.lazy.a.f(this.x(), (m)d1, r, 0, 4, null));
        }
        d1.b1(r2, v.E(), this.A(), (t0)null);
        b2.R0(r2);
        return d1;
    }
    
    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.g k0(final g g, final r r, c0 c0, final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            c0 = null;
        }
        return g.j0(r, c0, b0);
    }
    
    private final List<e1> l0(final kotlin.reflect.jvm.internal.impl.descriptors.impl.f f) {
        final Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.w> h = this.o.h();
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.impl.k0>(h.size());
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.H, false, null, 2, null);
        final Iterator<kotlin.reflect.jvm.internal.impl.load.java.structure.w> iterator = h.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.load.java.structure.w w = iterator.next();
            final c0 n2 = this.x().g().n(w.a(), f2);
            c0 arrayElementType;
            if (w.l()) {
                arrayElementType = this.x().a().l().w().getArrayElementType(n2);
            }
            else {
                arrayElementType = null;
            }
            list.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0((kotlin.reflect.jvm.internal.impl.descriptors.a)f, (e1)null, n, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), w.getName(), n2, false, false, false, arrayElementType, (w0)this.x().a().s().a(w)));
            ++n;
        }
        return (List<e1>)list;
    }
    
    private final v0 m0(v0 v0, final kotlin.reflect.jvm.internal.impl.name.e e) {
        final y$a b = v0.B();
        b.s(e);
        b.t();
        b.e();
        v0 = (v0)b.h();
        k0.m((Object)v0);
        return v0;
    }
    
    private final v0 n0(final v0 v0) {
        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v0).m();
        k0.o((Object)m, "valueParameters");
        final e1 e1 = (e1)v.i3(m);
        Object o = null;
        Label_0117: {
            if (e1 != null) {
                final kotlin.reflect.jvm.internal.impl.descriptors.h c = ((d1)e1).a().N0().c();
                kotlin.reflect.jvm.internal.impl.name.c j;
                if (c == null) {
                    j = null;
                }
                else {
                    j = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)c);
                }
                kotlin.reflect.jvm.internal.impl.name.b l = null;
                Label_0093: {
                    if (j != null) {
                        if (!j.f()) {
                            j = null;
                        }
                        if (j != null) {
                            l = j.l();
                            break Label_0093;
                        }
                    }
                    l = null;
                }
                if (SuspendFunctionTypesKt.isContinuation(l, this.x().a().p().c())) {
                    o = e1;
                    break Label_0117;
                }
            }
            o = null;
        }
        if (o == null) {
            return null;
        }
        final y$a b = v0.B();
        final List i = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v0).m();
        k0.o((Object)i, "valueParameters");
        final v0 v2 = (v0)b.b(v.Q1(i, 1)).f(((d1)o).a().M0().get(0).a()).h();
        final f0 f0 = (f0)v2;
        if (f0 != null) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)f0).i1(true);
        }
        return v2;
    }
    
    private final boolean o0(final q0 q0, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        final boolean a = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(q0);
        final boolean b = false;
        if (a) {
            return false;
        }
        final v0 u0 = this.u0(q0, l);
        final v0 v0 = this.v0(q0, l);
        if (u0 == null) {
            return false;
        }
        if (!((g1)q0).n0()) {
            return true;
        }
        boolean b2 = b;
        if (v0 != null) {
            b2 = b;
            if (((kotlin.reflect.jvm.internal.impl.descriptors.a0)v0).o() == ((kotlin.reflect.jvm.internal.impl.descriptors.a0)u0).o()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    private final boolean p0(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        final kotlin.reflect.jvm.internal.impl.resolve.j d = kotlin.reflect.jvm.internal.impl.resolve.j.d;
        boolean b = true;
        final kotlin.reflect.jvm.internal.impl.resolve.j.i.a c = d.I(a2, a, true).c();
        k0.o((Object)c, "DEFAULT.isOverridableByWithoutExternalConditions(superDescriptor, this, true).result");
        if (c != kotlin.reflect.jvm.internal.impl.resolve.j.i.a.G || kotlin.reflect.jvm.internal.impl.load.java.v.a.a(a2, a)) {
            b = false;
        }
        return b;
    }
    
    private final boolean q0(final v0 v0) {
        final kotlin.reflect.jvm.internal.impl.load.java.e n = kotlin.reflect.jvm.internal.impl.load.java.e.n;
        final kotlin.reflect.jvm.internal.impl.name.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName();
        k0.o((Object)name, "name");
        final List<kotlin.reflect.jvm.internal.impl.name.e> i = n.i(name);
        final boolean b = i instanceof Collection;
        boolean b2 = true;
        if (!b || !i.isEmpty()) {
            for (final kotlin.reflect.jvm.internal.impl.name.e e : i) {
                final Set<v0> y0 = this.y0(e);
                final ArrayList<v0> list = new ArrayList<v0>();
                for (final v0 next : y0) {
                    if (b0.a((kotlin.reflect.jvm.internal.impl.descriptors.b)next)) {
                        list.add(next);
                    }
                }
                boolean b3 = false;
                Label_0220: {
                    if (!list.isEmpty()) {
                        final v0 m0 = this.m0(v0, e);
                        if (!list.isEmpty()) {
                            final Iterator<Object> iterator3 = list.iterator();
                            while (iterator3.hasNext()) {
                                if (this.r0(iterator3.next(), (y)m0)) {
                                    b3 = true;
                                    break Label_0220;
                                }
                            }
                        }
                    }
                    b3 = false;
                }
                if (b3) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    private final boolean r0(final v0 v0, final y y) {
        y b = y;
        if (kotlin.reflect.jvm.internal.impl.load.java.e.n.m(v0)) {
            b = y.b();
        }
        k0.o((Object)b, "if (superDescriptor.isRemoveAtByIndex) subDescriptor.original else subDescriptor");
        return this.p0((kotlin.reflect.jvm.internal.impl.descriptors.a)b, (kotlin.reflect.jvm.internal.impl.descriptors.a)v0);
    }
    
    private final boolean s0(final v0 v0) {
        final v0 n0 = this.n0(v0);
        final boolean b = false;
        if (n0 == null) {
            return false;
        }
        final kotlin.reflect.jvm.internal.impl.name.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)v0).getName();
        k0.o((Object)name, "name");
        final Set<v0> y0 = this.y0(name);
        boolean b2;
        if (y0 instanceof Collection && y0.isEmpty()) {
            b2 = b;
        }
        else {
            final Iterator<Object> iterator = y0.iterator();
            v0 v2;
            do {
                b2 = b;
                if (!iterator.hasNext()) {
                    return b2;
                }
                v2 = iterator.next();
            } while (!((y)v2).isSuspend() || !this.p0((kotlin.reflect.jvm.internal.impl.descriptors.a)n0, (kotlin.reflect.jvm.internal.impl.descriptors.a)v2));
            b2 = true;
        }
        return b2;
    }
    
    private final v0 t0(final q0 q0, final String s, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(s);
        k0.o((Object)i, "identifier(getterName)");
        final Iterator iterator = ((Iterable)l.invoke((Object)i)).iterator();
        v0 v0;
        do {
            final boolean hasNext = iterator.hasNext();
            v0 = null;
            final v0 v2 = null;
            if (!hasNext) {
                break;
            }
            final v0 v3 = iterator.next();
            if (((kotlin.reflect.jvm.internal.impl.descriptors.a)v3).m().size() != 0) {
                v0 = v2;
            }
            else {
                final kotlin.reflect.jvm.internal.impl.types.checker.f a = kotlin.reflect.jvm.internal.impl.types.checker.f.a;
                final c0 returnType = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v3).getReturnType();
                final boolean b = returnType != null && a.d(returnType, ((d1)q0).a());
                v0 = v2;
                if (!b) {
                    continue;
                }
                v0 = v3;
            }
        } while (v0 == null);
        return v0;
    }
    
    private final v0 u0(final q0 q0, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        final r0 e = q0.e();
        String a = null;
        Object o;
        if (e == null) {
            o = null;
        }
        else {
            o = b0.d(e);
        }
        if (o != null) {
            a = kotlin.reflect.jvm.internal.impl.load.java.i.a.a((kotlin.reflect.jvm.internal.impl.descriptors.b)o);
        }
        if (a != null && !b0.f(this.z0(), (kotlin.reflect.jvm.internal.impl.descriptors.a)o)) {
            return this.t0(q0, a, l);
        }
        final x a2 = x.a;
        final String d = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)q0).getName().d();
        k0.o((Object)d, "name.asString()");
        return this.t0(q0, x.a(d), l);
    }
    
    private final v0 v0(final q0 q0, final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>> l) {
        final x a = x.a;
        final String d = ((kotlin.reflect.jvm.internal.impl.descriptors.f0)q0).getName().d();
        k0.o((Object)d, "name.asString()");
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(x.d(d));
        k0.o((Object)i, "identifier(JvmAbi.setterName(name.asString()))");
        final Iterator iterator = ((Iterable)l.invoke((Object)i)).iterator();
        v0 v0;
        do {
            final boolean hasNext = iterator.hasNext();
            v0 = null;
            final v0 v2 = null;
            if (!hasNext) {
                break;
            }
            final v0 v3 = iterator.next();
            if (((kotlin.reflect.jvm.internal.impl.descriptors.a)v3).m().size() != 1) {
                v0 = v2;
            }
            else {
                final c0 returnType = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v3).getReturnType();
                if (returnType == null) {
                    v0 = v2;
                }
                else if (!KotlinBuiltIns.isUnit(returnType)) {
                    v0 = v2;
                }
                else {
                    final kotlin.reflect.jvm.internal.impl.types.checker.f a2 = kotlin.reflect.jvm.internal.impl.types.checker.f.a;
                    final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)v3).m();
                    k0.o((Object)m, "descriptor.valueParameters");
                    v0 = v2;
                    if (!a2.b(((d1)v.U4(m)).a(), ((d1)q0).a())) {
                        continue;
                    }
                    v0 = v3;
                }
            }
        } while (v0 == null);
        return v0;
    }
    
    private final u w0(final e e) {
        final u visibility = e.getVisibility();
        k0.o((Object)visibility, "classDescriptor.visibility");
        u c = visibility;
        if (k0.g((Object)visibility, (Object)kotlin.reflect.jvm.internal.impl.load.java.u.b)) {
            c = kotlin.reflect.jvm.internal.impl.load.java.u.c;
            k0.o((Object)c, "PROTECTED_AND_PACKAGE");
        }
        return c;
    }
    
    private final Set<v0> y0(final kotlin.reflect.jvm.internal.impl.name.e e) {
        final Collection<c0> c0 = this.c0();
        final LinkedHashSet<v0> set = new LinkedHashSet<v0>();
        final Iterator<Object> iterator = c0.iterator();
        while (iterator.hasNext()) {
            v.q0((Collection)set, (Iterable)iterator.next().x().a(e, kotlin.reflect.jvm.internal.impl.incremental.components.d.U));
        }
        return set;
    }
    
    @f
    @Override
    protected t0 A() {
        return kotlin.reflect.jvm.internal.impl.resolve.d.l((m)this.z0());
    }
    
    @Override
    protected boolean H(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f f) {
        k0.p((Object)f, "<this>");
        return !this.o.p() && this.C0((v0)f);
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected a I(@org.jetbrains.annotations.e final r r, @org.jetbrains.annotations.e final List<? extends b1> list, @org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final List<? extends e1> list2) {
        k0.p((Object)r, "method");
        k0.p((Object)list, "methodTypeParameters");
        k0.p((Object)c0, "returnType");
        k0.p((Object)list2, "valueParameters");
        final kotlin.reflect.jvm.internal.impl.load.java.components.j.b a = this.x().a().r().a(r, this.z0(), c0, null, (List<e1>)list2, (List<b1>)list);
        k0.o((Object)a, "c.components.signaturePropagator.resolvePropagatedSignature(\n            method, ownerDescriptor, returnType, null, valueParameters, methodTypeParameters\n        )");
        final c0 d = a.d();
        k0.o((Object)d, "propagated.returnType");
        final c0 c2 = a.c();
        final List<e1> f = a.f();
        k0.o((Object)f, "propagated.valueParameters");
        final List<b1> e = a.e();
        k0.o((Object)e, "propagated.typeParameters");
        final boolean g = a.g();
        final List<String> b = a.b();
        k0.o((Object)b, "propagated.errors");
        return new a(d, c2, f, e, g, b);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<v0> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.h(e, b);
        return super.a(e, b);
    }
    
    @org.jetbrains.annotations.e
    protected LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> a0(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        final Collection<c0> k = ((kotlin.reflect.jvm.internal.impl.descriptors.h)this.z0()).l().k();
        k0.o((Object)k, "ownerDescriptor.typeConstructor.supertypes");
        final LinkedHashSet<Object> set = (LinkedHashSet<Object>)new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        final Iterator<Object> iterator = k.iterator();
        while (iterator.hasNext()) {
            v.q0((Collection)set, (Iterable)iterator.next().x().b());
        }
        set.addAll(((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).a());
        set.addAll(((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).d());
        set.addAll(this.m(d, l));
        return (LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>)set;
    }
    
    @org.jetbrains.annotations.e
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a b0() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a(this.o, (n6.l<? super kotlin.reflect.jvm.internal.impl.load.java.structure.q, Boolean>)g$a.G);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<q0> c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.h(e, b);
        return super.c(e, b);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.h(e, b);
        final g g = (g)this.C();
        Object o = null;
        if (g != null) {
            final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.impl.g> t = g.t;
            if (t != null) {
                o = ((n6.l)t).invoke((Object)e);
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h h = (kotlin.reflect.jvm.internal.impl.descriptors.h)o;
        if (o == null) {
            h = (kotlin.reflect.jvm.internal.impl.descriptors.h)((n6.l)this.t).invoke((Object)e);
        }
        return h;
    }
    
    @Override
    public void h(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        r6.a.a(this.x().a().k(), b, this.z0(), e);
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> m(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C((Set)((n6.a)this.r).invoke(), (Iterable)((Map)((n6.a)this.s).invoke()).keySet());
    }
    
    @Override
    protected void p(@org.jetbrains.annotations.e final Collection<v0> collection, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)collection, "result");
        k0.p((Object)e, "name");
        if (this.o.r() && ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).b(e) != null) {
            final boolean empty = collection.isEmpty();
            final boolean b = true;
            int n = 0;
            Label_0116: {
                if (empty) {
                    n = (b ? 1 : 0);
                }
                else {
                    final Iterator<Object> iterator = collection.iterator();
                    do {
                        n = (b ? 1 : 0);
                        if (iterator.hasNext()) {
                            continue;
                        }
                        break Label_0116;
                    } while (!((kotlin.reflect.jvm.internal.impl.descriptors.a)iterator.next()).m().isEmpty());
                    n = 0;
                }
            }
            if (n != 0) {
                final kotlin.reflect.jvm.internal.impl.load.java.structure.w b2 = ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).b(e);
                k0.m((Object)b2);
                collection.add((v0)this.H0(b2));
            }
        }
    }
    
    @Override
    protected void s(@org.jetbrains.annotations.e final Collection<v0> collection, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)collection, "result");
        k0.p((Object)e, "name");
        final Set<v0> y0 = this.y0(e);
        if (!kotlin.reflect.jvm.internal.impl.load.java.e.n.k(e) && !kotlin.reflect.jvm.internal.impl.load.java.f.n.l(e)) {
            boolean b = false;
            Label_0101: {
                if (!(y0 instanceof Collection) || !y0.isEmpty()) {
                    final Iterator<y> iterator = y0.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().isSuspend()) {
                            b = false;
                            break Label_0101;
                        }
                    }
                }
                b = true;
            }
            if (b) {
                final ArrayList<v0> list = new ArrayList<v0>();
                for (final v0 next : y0) {
                    if (this.C0(next)) {
                        list.add(next);
                    }
                }
                this.W(collection, e, list, false);
                return;
            }
        }
        final kotlin.reflect.jvm.internal.impl.utils.j<v0> a = kotlin.reflect.jvm.internal.impl.utils.j.I.a();
        final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> d = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(e, (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)y0, v.E(), this.z0(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.p.a, this.x().a().j().a());
        k0.o((Object)d, "resolveOverridesForNonStaticMembers(\n            name, functionsFromSupertypes, emptyList(), ownerDescriptor, ErrorReporter.DO_NOTHING,\n            c.components.kotlinTypeChecker.overridingUtil\n        )");
        this.X(e, collection, (Collection<? extends v0>)d, collection, (n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>(this));
        this.X(e, collection, (Collection<? extends v0>)d, a, (n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>(this));
        final ArrayList<v0> list2 = new ArrayList<v0>();
        for (final v0 next2 : y0) {
            if (this.C0(next2)) {
                list2.add(next2);
            }
        }
        this.W(collection, e, v.q4((Collection)list2, (Iterable)a), true);
    }
    
    @Override
    protected void t(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final Collection<q0> collection) {
        k0.p((Object)e, "name");
        k0.p((Object)collection, "result");
        if (this.o.p()) {
            this.Z(e, collection);
        }
        final Set<q0> a0 = this.A0(e);
        if (a0.isEmpty()) {
            return;
        }
        final kotlin.reflect.jvm.internal.impl.utils.j.b i = kotlin.reflect.jvm.internal.impl.utils.j.I;
        final kotlin.reflect.jvm.internal.impl.utils.j<Object> a2 = i.a();
        final kotlin.reflect.jvm.internal.impl.utils.j<Object> a3 = i.a();
        this.Y(a0, collection, (Set<q0>)a2, (n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>() {
            @org.jetbrains.annotations.e
            public final Collection<v0> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "it");
                return g.this.I0(e);
            }
        });
        this.Y(j1.x((Set)a0, (Iterable)a2), (Collection<q0>)a3, null, (n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends v0>>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>() {
            @org.jetbrains.annotations.e
            public final Collection<v0> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "it");
                return g.this.J0(e);
            }
        });
        final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> d = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(e, j1.C((Set)a0, (Iterable)a3), (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)collection, this.z0(), this.x().a().c(), this.x().a().j().a());
        k0.o((Object)d, "resolveOverridesForNonStaticMembers(\n                name,\n                propertiesFromSupertypes + propertiesOverridesFromSuperTypes,\n                result,\n                ownerDescriptor,\n                c.components.errorReporter,\n                c.components.kotlinTypeChecker.overridingUtil\n            )");
        collection.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)d);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return k0.C("Lazy Java member scope for ", (Object)this.o.f());
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> u(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        if (this.o.p()) {
            return this.b();
        }
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>(((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).e());
        final Collection<c0> k = ((kotlin.reflect.jvm.internal.impl.descriptors.h)this.z0()).l().k();
        k0.o((Object)k, "ownerDescriptor.typeConstructor.supertypes");
        final Iterator<Object> iterator = k.iterator();
        while (iterator.hasNext()) {
            v.q0((Collection)set, (Iterable)iterator.next().x().d());
        }
        return set;
    }
    
    @org.jetbrains.annotations.e
    public final kotlin.reflect.jvm.internal.impl.storage.i<List<d>> x0() {
        return this.q;
    }
    
    @org.jetbrains.annotations.e
    protected e z0() {
        return this.n;
    }
}
