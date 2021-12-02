// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.n;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.z0$a;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.descriptors.g0$b;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.z;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.y;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.x;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.storage.j;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a;

public final class e extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a implements v
{
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.c M;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a N;
    @org.jetbrains.annotations.e
    private final w0 O;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.name.a P;
    @org.jetbrains.annotations.e
    private final b0 Q;
    @org.jetbrains.annotations.e
    private final u R;
    @org.jetbrains.annotations.e
    private final f S;
    @org.jetbrains.annotations.e
    private final l T;
    @org.jetbrains.annotations.e
    private final i U;
    @org.jetbrains.annotations.e
    private final b V;
    @org.jetbrains.annotations.e
    private final u0<a> W;
    @org.jetbrains.annotations.f
    private final c X;
    @org.jetbrains.annotations.e
    private final m Y;
    @org.jetbrains.annotations.e
    private final j<d> Z;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<d>> a0;
    @org.jetbrains.annotations.e
    private final j<kotlin.reflect.jvm.internal.impl.descriptors.e> b0;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> c0;
    @org.jetbrains.annotations.e
    private final x.a d0;
    @org.jetbrains.annotations.e
    private final g e0;
    
    public e(@org.jetbrains.annotations.e final l l, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.metadata.a.c m, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a n, @org.jetbrains.annotations.e final w0 o) {
        k0.p((Object)l, "outerContext");
        k0.p((Object)m, "classProto");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)n, "metadataVersion");
        k0.p((Object)o, "sourceElement");
        super(l.h(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a(c, m.p0()).j());
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a(c, m.p0());
        final y a = y.a;
        this.Q = a.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.d(m.o0()));
        this.R = z.a(a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c.d(m.o0()));
        final f a2 = a.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e.d(m.o0()));
        this.S = a2;
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.s> h0 = m.H0();
        k0.o((Object)h0, "classProto.typeParameterList");
        final kotlin.reflect.jvm.internal.impl.metadata.a.t i0 = m.I0();
        k0.o((Object)i0, "classProto.typeTable");
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(i0);
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.a b = kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b;
        final kotlin.reflect.jvm.internal.impl.metadata.a.w k0 = m.K0();
        kotlin.jvm.internal.k0.o((Object)k0, "classProto.versionRequirementTable");
        final l a3 = l.a((m)this, h0, c, g, b.a(k0), n);
        this.T = a3;
        final f j = f.I;
        i b2;
        if (a2 == j) {
            b2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.l(a3.h(), (kotlin.reflect.jvm.internal.impl.descriptors.e)this);
        }
        else {
            b2 = h.c.b;
        }
        this.U = b2;
        this.V = new b();
        this.W = (u0<a>)u0.e.a((kotlin.reflect.jvm.internal.impl.descriptors.e)this, a3.h(), a3.c().m().c(), (n6.l)new n6.l<kotlin.reflect.jvm.internal.impl.types.checker.g, a>(this));
        final x.a a4 = null;
        c x;
        if (a2 == j) {
            x = new c();
        }
        else {
            x = null;
        }
        this.X = x;
        final m e = l.e();
        this.Y = e;
        this.Z = (j<d>)a3.h().e((n6.a<?>)new n6.a<d>() {
            @org.jetbrains.annotations.f
            public final d a() {
                return e.this.U0();
            }
        });
        this.a0 = (kotlin.reflect.jvm.internal.impl.storage.i<Collection<d>>)a3.h().g((n6.a<?>)new n6.a<Collection<? extends d>>() {
            @org.jetbrains.annotations.e
            public final Collection<d> a() {
                return e.this.T0();
            }
        });
        this.b0 = (j<kotlin.reflect.jvm.internal.impl.descriptors.e>)a3.h().e((n6.a<?>)new n6.a<kotlin.reflect.jvm.internal.impl.descriptors.e>() {
            @org.jetbrains.annotations.f
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a() {
                return e.this.S0();
            }
        });
        this.c0 = (kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>>)a3.h().g((n6.a<?>)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e>>() {
            @org.jetbrains.annotations.e
            public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a() {
                return e.this.W0();
            }
        });
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g2 = a3.g();
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j2 = a3.j();
        e e2;
        if (e instanceof e) {
            e2 = (e)e;
        }
        else {
            e2 = null;
        }
        x d0;
        if (e2 == null) {
            d0 = a4;
        }
        else {
            d0 = e2.d0;
        }
        this.d0 = new x.a(m, g2, j2, o, (x.a)d0);
        Object b3;
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b.g(m.o0())) {
            b3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        }
        else {
            b3 = new o(a3.h(), (n6.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>)new n6.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() {
                final /* synthetic */ e G;
                
                @org.jetbrains.annotations.e
                public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
                    return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)kotlin.collections.v.I5((Iterable)this.G.X0().c().d().c(this.G.c1()));
                }
            });
        }
        this.e0 = (g)b3;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.a P0(final e e) {
        return e.P;
    }
    
    public static final /* synthetic */ c Q0(final e e) {
        return e.X;
    }
    
    public static final /* synthetic */ b R0(final e e) {
        return e.V;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e S0() {
        final boolean l0 = this.M.L0();
        kotlin.reflect.jvm.internal.impl.descriptors.e e = null;
        if (!l0) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.h g = this.Z0().g(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(this.T.g(), this.M.f0()), kotlin.reflect.jvm.internal.impl.incremental.components.d.X);
        if (g instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)g;
        }
        return e;
    }
    
    private final Collection<d> T0() {
        return (Collection<d>)kotlin.collections.v.q4((Collection)kotlin.collections.v.q4((Collection)this.V0(), (Iterable)kotlin.collections.v.M((Object)this.U())), (Iterable)this.T.c().c().a((kotlin.reflect.jvm.internal.impl.descriptors.e)this));
    }
    
    private final d U0() {
        if (this.S.b()) {
            final kotlin.reflect.jvm.internal.impl.descriptors.impl.f i = kotlin.reflect.jvm.internal.impl.resolve.c.i((kotlin.reflect.jvm.internal.impl.descriptors.e)this, w0.a);
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p)i).h1((c0)this.A());
            return (d)i;
        }
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.d> i2 = this.M.i0();
        k0.o((Object)i2, "classProto.constructorList");
        final Iterator<Object> iterator = i2.iterator();
        while (true) {
            kotlin.reflect.jvm.internal.impl.metadata.f next;
            do {
                final boolean hasNext = iterator.hasNext();
                final d d = null;
                if (!hasNext) {
                    next = null;
                    final kotlin.reflect.jvm.internal.impl.metadata.a.d d2 = (kotlin.reflect.jvm.internal.impl.metadata.a.d)next;
                    d m;
                    if (d2 == null) {
                        m = d;
                    }
                    else {
                        m = this.X0().f().m(d2, true);
                    }
                    return m;
                }
                next = iterator.next();
            } while (!(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.l.g(((kotlin.reflect.jvm.internal.impl.metadata.a.d)next).L()) ^ true));
            continue;
        }
    }
    
    private final List<d> V0() {
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.d> i0 = this.M.i0();
        k0.o((Object)i0, "classProto.constructorList");
        final ArrayList<kotlin.reflect.jvm.internal.impl.metadata.a.d> list = new ArrayList<kotlin.reflect.jvm.internal.impl.metadata.a.d>();
        for (final kotlin.reflect.jvm.internal.impl.metadata.a.d next : i0) {
            final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.l.g(next.L());
            k0.o((Object)g, "IS_SECONDARY.get(it.flags)");
            if (g) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<d>(kotlin.collections.v.Y((Iterable)list, 10));
        for (final kotlin.reflect.jvm.internal.impl.metadata.a.d d : list) {
            final kotlin.reflect.jvm.internal.impl.serialization.deserialization.u f = this.X0().f();
            k0.o((Object)d, "it");
            list2.add(f.m(d, false));
        }
        return (List<d>)list2;
    }
    
    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> W0() {
        if (this.Q != kotlin.reflect.jvm.internal.impl.descriptors.b0.I) {
            return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>)kotlin.collections.v.E();
        }
        final List<Integer> x0 = this.M.x0();
        k0.o((Object)x0, "fqNames");
        if (x0.isEmpty() ^ true) {
            final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e>();
            for (final Integer n : x0) {
                final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j c = this.X0().c();
                final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g = this.X0().g();
                k0.o((Object)n, "index");
                final kotlin.reflect.jvm.internal.impl.descriptors.e b = c.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a(g, n));
                if (b != null) {
                    list.add(b);
                }
            }
            return list;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.a.a.a((kotlin.reflect.jvm.internal.impl.descriptors.e)this, false);
    }
    
    private final a Z0() {
        return (a)this.W.c(this.T.c().m().c());
    }
    
    @org.jetbrains.annotations.e
    public List<b1> C() {
        return this.T.i().k();
    }
    
    public boolean D() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.g.g(this.M.o0());
        k0.o((Object)g, "IS_DATA.get(classProto.flags)");
        return g;
    }
    
    public boolean F0() {
        return false;
    }
    
    public boolean G() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e.d(this.M.o0()) == kotlin.reflect.jvm.internal.impl.metadata.a.c.c.N;
    }
    
    @org.jetbrains.annotations.e
    protected h M(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return this.W.c(g);
    }
    
    public boolean Q() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.i.g(this.M.o0());
        k0.o((Object)g, "IS_EXPECT_CLASS.get(classProto.flags)");
        return g;
    }
    
    @org.jetbrains.annotations.f
    public d U() {
        return (d)((n6.a)this.Z).invoke();
    }
    
    @org.jetbrains.annotations.f
    public kotlin.reflect.jvm.internal.impl.descriptors.e X() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.e)((n6.a)this.b0).invoke();
    }
    
    @org.jetbrains.annotations.e
    public final l X0() {
        return this.T;
    }
    
    @org.jetbrains.annotations.e
    public final kotlin.reflect.jvm.internal.impl.metadata.a.c Y0() {
        return this.M;
    }
    
    @org.jetbrains.annotations.e
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a a1() {
        return this.N;
    }
    
    @org.jetbrains.annotations.e
    public i b1() {
        return this.U;
    }
    
    @org.jetbrains.annotations.e
    public m c() {
        return this.Y;
    }
    
    @org.jetbrains.annotations.e
    public final x.a c1() {
        return this.d0;
    }
    
    public final boolean d1(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        return this.Z0().s().contains(e);
    }
    
    @org.jetbrains.annotations.e
    public g getAnnotations() {
        return this.e0;
    }
    
    @org.jetbrains.annotations.e
    public u getVisibility() {
        return this.R;
    }
    
    public boolean isExternal() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.h.g(this.M.o0());
        k0.o((Object)g, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return g;
    }
    
    public boolean isInline() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.j.g(this.M.o0());
        k0.o((Object)g, "IS_INLINE_CLASS.get(classProto.flags)");
        final boolean booleanValue = g;
        boolean b = true;
        if (!booleanValue || !this.N.e(1, 4, 1)) {
            b = false;
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    public Collection<d> j() {
        return (Collection<d>)((n6.a)this.a0).invoke();
    }
    
    @org.jetbrains.annotations.e
    public w0 k() {
        return this.O;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.types.w0 l() {
        return this.V;
    }
    
    @org.jetbrains.annotations.e
    public f n() {
        return this.S;
    }
    
    @org.jetbrains.annotations.e
    public b0 o() {
        return this.Q;
    }
    
    public boolean q() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.k.g(this.M.o0());
        k0.o((Object)g, "IS_FUN_INTERFACE.get(classProto.flags)");
        return g;
    }
    
    @org.jetbrains.annotations.e
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> s() {
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>)((n6.a)this.c0).invoke();
    }
    
    public boolean t() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.j.g(this.M.o0());
        k0.o((Object)g, "IS_INLINE_CLASS.get(classProto.flags)");
        final boolean booleanValue = g;
        boolean b = true;
        if (!booleanValue || !this.N.c(1, 4, 2)) {
            b = false;
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        String str;
        if (this.Q()) {
            str = "expect ";
        }
        else {
            str = "";
        }
        sb.append(str);
        sb.append("class ");
        sb.append(this.getName());
        return sb.toString();
    }
    
    public boolean u() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f.g(this.M.o0());
        k0.o((Object)g, "IS_INNER.get(classProto.flags)");
        return g;
    }
    
    private final class a extends i
    {
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.types.checker.g g;
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<m>> h;
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<c0>> i;
        
        public a(final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
            k0.p((Object)e.this, "this$0");
            k0.p((Object)g, "kotlinTypeRefiner");
            final l x0 = e.this.X0();
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> s0 = e.this.Y0().s0();
            k0.o((Object)s0, "classProto.functionList");
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> w0 = e.this.Y0().w0();
            k0.o((Object)w0, "classProto.propertyList");
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> e0 = e.this.Y0().E0();
            k0.o((Object)e0, "classProto.typeAliasList");
            final List<Integer> t0 = e.this.Y0().t0();
            k0.o((Object)t0, "classProto.nestedClassNameList");
            final c g2 = e.this.X0().g();
            final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(kotlin.collections.v.Y((Iterable)t0, 10));
            final Iterator<Number> iterator = t0.iterator();
            while (iterator.hasNext()) {
                list.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(g2, iterator.next().intValue()));
            }
            super(x0, s0, w0, e0, (n6.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.e>>)new n6.a<List<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                @org.jetbrains.annotations.e
                public final List<kotlin.reflect.jvm.internal.impl.name.e> a() {
                    return (List<kotlin.reflect.jvm.internal.impl.name.e>)list;
                }
            });
            this.g = g;
            this.h = this.r().h().g((n6.a<? extends Collection<m>>)new n6.a<Collection<? extends m>>() {
                final /* synthetic */ a G;
                
                @org.jetbrains.annotations.e
                public final Collection<m> a() {
                    return this.G.l(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.o, kotlin.reflect.jvm.internal.impl.resolve.scopes.h.a.a(), kotlin.reflect.jvm.internal.impl.incremental.components.d.S);
                }
            });
            this.i = this.r().h().g((n6.a<? extends Collection<c0>>)new n6.a<Collection<? extends c0>>() {
                final /* synthetic */ a G;
                
                @org.jetbrains.annotations.e
                public final Collection<c0> a() {
                    return a.B(this.G).f((kotlin.reflect.jvm.internal.impl.descriptors.e)a.this.D());
                }
            });
        }
        
        public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.g B(final a a) {
            return a.g;
        }
        
        private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> void C(final kotlin.reflect.jvm.internal.impl.name.e e, final Collection<? extends D> collection, final List<D> c) {
            this.r().c().m().a().y(e, collection, new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>(c), (kotlin.reflect.jvm.internal.impl.descriptors.e)this.D(), new kotlin.reflect.jvm.internal.impl.resolve.h() {
                @Override
                public void a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                    k0.p((Object)b, "fakeOverride");
                    kotlin.reflect.jvm.internal.impl.resolve.j.N(b, null);
                    c.add((D)b);
                }
                
                @Override
                protected void e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b2) {
                    k0.p((Object)b, "fromSuper");
                    k0.p((Object)b2, "fromCurrent");
                }
            });
        }
        
        private final e D() {
            return e.this;
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
        @Override
        public Collection<q0> c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            this.h(e, b);
            return super.c(e, b);
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<m> e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @org.jetbrains.annotations.e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
            k0.p((Object)d, "kindFilter");
            k0.p((Object)l, "nameFilter");
            return (Collection<m>)((n6.a)this.h).invoke();
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.h g(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            this.h(e, b);
            final e.c q0 = e.Q0(this.D());
            if (q0 != null) {
                final kotlin.reflect.jvm.internal.impl.descriptors.e f = q0.f(e);
                if (f != null) {
                    return (kotlin.reflect.jvm.internal.impl.descriptors.h)f;
                }
            }
            return super.g(e, b);
        }
        
        @Override
        public void h(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            r6.a.a(this.r().c().o(), b, (kotlin.reflect.jvm.internal.impl.descriptors.e)this.D(), e);
        }
        
        @Override
        protected void k(@org.jetbrains.annotations.e final Collection<m> collection, @org.jetbrains.annotations.e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
            k0.p((Object)collection, "result");
            k0.p((Object)l, "nameFilter");
            final e.c q0 = e.Q0(this.D());
            Object o;
            if (q0 == null) {
                o = null;
            }
            else {
                o = q0.d();
            }
            if (o == null) {
                o = kotlin.collections.v.E();
            }
            collection.addAll((Collection<? extends m>)o);
        }
        
        @Override
        protected void m(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final List<v0> list) {
            k0.p((Object)e, "name");
            k0.p((Object)list, "functions");
            final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b> list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>();
            final Iterator<c0> iterator = ((Collection)((n6.a)this.i).invoke()).iterator();
            while (iterator.hasNext()) {
                list2.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)iterator.next().x().a(e, kotlin.reflect.jvm.internal.impl.incremental.components.d.R));
            }
            list.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)this.r().c().c().b(e, (kotlin.reflect.jvm.internal.impl.descriptors.e)e.this));
            this.C(e, list2, (List<kotlin.reflect.jvm.internal.impl.descriptors.b>)list);
        }
        
        @Override
        protected void n(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final List<q0> list) {
            k0.p((Object)e, "name");
            k0.p((Object)list, "descriptors");
            final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b> list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>();
            final Iterator<c0> iterator = ((Collection)((n6.a)this.i).invoke()).iterator();
            while (iterator.hasNext()) {
                list2.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)iterator.next().x().c(e, kotlin.reflect.jvm.internal.impl.incremental.components.d.R));
            }
            this.C(e, list2, (List<kotlin.reflect.jvm.internal.impl.descriptors.b>)list);
        }
        
        @org.jetbrains.annotations.e
        @Override
        protected kotlin.reflect.jvm.internal.impl.name.a o(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            k0.p((Object)e, "name");
            final kotlin.reflect.jvm.internal.impl.name.a d = e.P0(e.this).d(e);
            k0.o((Object)d, "classId.createNestedClassId(name)");
            return d;
        }
        
        @org.jetbrains.annotations.f
        @Override
        protected Set<kotlin.reflect.jvm.internal.impl.name.e> u() {
            final List<c0> m = e.R0(this.D()).m();
            final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
            final Iterator<Object> iterator = m.iterator();
            LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set2;
            while (true) {
                set2 = set;
                if (!iterator.hasNext()) {
                    break;
                }
                final Set<kotlin.reflect.jvm.internal.impl.name.e> f = iterator.next().x().f();
                if (f == null) {
                    set2 = null;
                    break;
                }
                kotlin.collections.v.q0((Collection)set, (Iterable)f);
            }
            return set2;
        }
        
        @org.jetbrains.annotations.e
        @Override
        protected Set<kotlin.reflect.jvm.internal.impl.name.e> v() {
            final List<c0> m = e.R0(this.D()).m();
            final LinkedHashSet<Object> set = (LinkedHashSet<Object>)new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
            final Iterator<Object> iterator = m.iterator();
            while (iterator.hasNext()) {
                kotlin.collections.v.q0((Collection)set, (Iterable)iterator.next().x().b());
            }
            set.addAll(this.r().c().c().e((kotlin.reflect.jvm.internal.impl.descriptors.e)e.this));
            return (Set<kotlin.reflect.jvm.internal.impl.name.e>)set;
        }
        
        @org.jetbrains.annotations.e
        @Override
        protected Set<kotlin.reflect.jvm.internal.impl.name.e> w() {
            final List<c0> m = e.R0(this.D()).m();
            final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
            final Iterator<Object> iterator = m.iterator();
            while (iterator.hasNext()) {
                kotlin.collections.v.q0((Collection)set, (Iterable)iterator.next().x().d());
            }
            return set;
        }
        
        @Override
        protected boolean z(@org.jetbrains.annotations.e final v0 v0) {
            k0.p((Object)v0, "function");
            return this.r().c().s().c((kotlin.reflect.jvm.internal.impl.descriptors.e)e.this, v0);
        }
    }
    
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b
    {
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.storage.i<List<b1>> d;
        
        public b() {
            k0.p((Object)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this, "this$0");
            super(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this.X0().h());
            this.d = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this.X0().h().g((n6.a<? extends List<b1>>)new n6.a<List<? extends b1>>() {
                @org.jetbrains.annotations.e
                public final List<b1> a() {
                    return (List<b1>)c1.d((kotlin.reflect.jvm.internal.impl.descriptors.i)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this);
                }
            });
        }
        
        @Override
        public boolean d() {
            return true;
        }
        
        @org.jetbrains.annotations.e
        @Override
        protected Collection<c0> g() {
            final List<a.q> k = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this.Y0(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this.X0().j());
            final e e = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this;
            final ArrayList list = new ArrayList<c0>(kotlin.collections.v.Y((Iterable)k, 10));
            final Iterator<Object> iterator = k.iterator();
            while (iterator.hasNext()) {
                list.add(e.X0().i().p(iterator.next()));
            }
            final List q4 = kotlin.collections.v.q4((Collection)list, (Iterable)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this.X0().c().c().d((kotlin.reflect.jvm.internal.impl.descriptors.e)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this));
            final ArrayList<g0$b> list2 = new ArrayList<g0$b>();
            final Iterator<c0> iterator2 = q4.iterator();
            while (true) {
                final boolean hasNext = iterator2.hasNext();
                g0$b g0$b = null;
                if (!hasNext) {
                    break;
                }
                final kotlin.reflect.jvm.internal.impl.descriptors.h c = iterator2.next().N0().c();
                if (c instanceof g0$b) {
                    g0$b = (g0$b)c;
                }
                if (g0$b == null) {
                    continue;
                }
                list2.add(g0$b);
            }
            if (list2.isEmpty() ^ true) {
                final p i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this.X0().c().i();
                final e e2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this;
                final ArrayList list3 = new ArrayList<String>(kotlin.collections.v.Y((Iterable)list2, 10));
                for (final g0$b g0$b2 : list2) {
                    final kotlin.reflect.jvm.internal.impl.name.a h = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.h((kotlin.reflect.jvm.internal.impl.descriptors.h)g0$b2);
                    String b2 = null;
                    Label_0307: {
                        if (h != null) {
                            final kotlin.reflect.jvm.internal.impl.name.b b = h.b();
                            if (b != null) {
                                b2 = b.b();
                                break Label_0307;
                            }
                        }
                        b2 = null;
                    }
                    String d = b2;
                    if (b2 == null) {
                        d = ((a)g0$b2).getName().d();
                    }
                    list3.add(d);
                }
                i.b((kotlin.reflect.jvm.internal.impl.descriptors.e)e2, (List<String>)list3);
            }
            return (Collection<c0>)kotlin.collections.v.I5((Iterable)q4);
        }
        
        @org.jetbrains.annotations.e
        @Override
        public List<b1> getParameters() {
            return (List<b1>)((n6.a)this.d).invoke();
        }
        
        @org.jetbrains.annotations.e
        @Override
        protected z0 l() {
            return (z0)z0$a.a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final String string = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this.getName().toString();
            k0.o((Object)string, "name.toString()");
            return string;
        }
        
        @org.jetbrains.annotations.e
        public e u() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.this;
        }
    }
    
    private final class c
    {
        @org.jetbrains.annotations.e
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.metadata.a.g> a;
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.e> b;
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.e>> c;
        final /* synthetic */ e d;
        
        public c() {
            k0.p((Object)e.this, "this$0");
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.g> n0 = e.this.Y0().n0();
            k0.o((Object)n0, "classProto.enumEntryList");
            final LinkedHashMap a = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.metadata.a.g>(kotlin.ranges.o.n(y0.j(kotlin.collections.v.Y((Iterable)n0, 10)), 16));
            for (final kotlin.reflect.jvm.internal.impl.metadata.a.g next : n0) {
                a.put(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(e.this.X0().g(), next.H()), next);
            }
            this.a = (Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.metadata.a.g>)a;
            this.b = e.this.X0().h().i((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends kotlin.reflect.jvm.internal.impl.descriptors.e>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.e>() {
                final /* synthetic */ c G;
                final /* synthetic */ e H = c.this.d;
                
                @org.jetbrains.annotations.f
                public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                    k0.p((Object)e, "name");
                    final kotlin.reflect.jvm.internal.impl.metadata.a.g g = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.c.b(this.G).get(e);
                    Object m0;
                    if (g == null) {
                        m0 = null;
                    }
                    else {
                        final e h = this.H;
                        m0 = n.M0(h.X0().h(), (kotlin.reflect.jvm.internal.impl.descriptors.e)h, e, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.c.c(this.G), (g)new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(h.X0().h(), (n6.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>)new n6.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() {
                            @org.jetbrains.annotations.e
                            public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
                                return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)kotlin.collections.v.I5((Iterable)h.X0().c().d().f(h.c1(), g));
                            }
                        }), w0.a);
                    }
                    return (kotlin.reflect.jvm.internal.impl.descriptors.e)m0;
                }
            });
            this.c = e.this.X0().h().g((n6.a<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                @org.jetbrains.annotations.e
                public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                    return e.c.this.e();
                }
            });
        }
        
        public static final /* synthetic */ Map b(final c c) {
            return c.a;
        }
        
        public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.i c(final c c) {
            return c.c;
        }
        
        private final Set<kotlin.reflect.jvm.internal.impl.name.e> e() {
            final HashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new HashSet<kotlin.reflect.jvm.internal.impl.name.e>();
            final Iterator<c0> iterator = e.this.l().k().iterator();
            while (iterator.hasNext()) {
                for (final m m : k.a.a(iterator.next().x(), null, null, 3, null)) {
                    if (m instanceof v0 || m instanceof q0) {
                        set.add(((kotlin.reflect.jvm.internal.impl.descriptors.f0)m).getName());
                    }
                }
            }
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> s0 = e.this.Y0().s0();
            k0.o((Object)s0, "classProto.functionList");
            final e d = e.this;
            final Iterator<Object> iterator3 = s0.iterator();
            while (iterator3.hasNext()) {
                set.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(d.X0().g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.i)iterator3.next()).X()));
            }
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> w0 = e.this.Y0().w0();
            k0.o((Object)w0, "classProto.propertyList");
            final e d2 = e.this;
            final Iterator<Object> iterator4 = w0.iterator();
            while (iterator4.hasNext()) {
                set.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(d2.X0().g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.n)iterator4.next()).W()));
            }
            return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C((Set)set, (Iterable)set);
        }
        
        @org.jetbrains.annotations.e
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> d() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> keySet = this.a.keySet();
            final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e>();
            final Iterator<Object> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                final kotlin.reflect.jvm.internal.impl.descriptors.e f = this.f(iterator.next());
                if (f != null) {
                    list.add(f);
                }
            }
            return list;
        }
        
        @org.jetbrains.annotations.f
        public final kotlin.reflect.jvm.internal.impl.descriptors.e f(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            k0.p((Object)e, "name");
            return (kotlin.reflect.jvm.internal.impl.descriptors.e)((n6.l)this.b).invoke((Object)e);
        }
    }
}
