// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.g0$b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.collections.t0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.load.java.o;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.types.b;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.z;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.a;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import java.util.Set;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g;

public final class f extends g implements d
{
    @e
    public static final a e0;
    @e
    private static final Set<String> f0;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g P;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.g Q;
    @org.jetbrains.annotations.f
    private final kotlin.reflect.jvm.internal.impl.descriptors.e R;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g S;
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.f T;
    @e
    private final b0 U;
    @e
    private final j1 V;
    private final boolean W;
    @e
    private final b X;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g Y;
    @e
    private final u0<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g> Z;
    @e
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.f a0;
    @e
    private final k b0;
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c0;
    @e
    private final i<List<b1>> d0;
    
    static {
        e0 = new a(null);
        f0 = kotlin.collections.j1.u((Object[])new String[] { "equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString" });
    }
    
    public f(@e final kotlin.reflect.jvm.internal.impl.load.java.lazy.g p4, @e final m m, @e final kotlin.reflect.jvm.internal.impl.load.java.structure.g q, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.descriptors.e r) {
        k0.p((Object)p4, "outerContext");
        k0.p((Object)m, "containingDeclaration");
        k0.p((Object)q, "jClass");
        super(p4.e(), m, q.getName(), (w0)p4.a().s().a(q), false);
        this.P = p4;
        this.Q = q;
        this.R = r;
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.g d = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.d(p4, (kotlin.reflect.jvm.internal.impl.descriptors.g)this, q, 0, 4, null);
        this.S = d;
        d.a().g().c(q, (kotlin.reflect.jvm.internal.impl.descriptors.e)this);
        q.H();
        kotlin.reflect.jvm.internal.impl.descriptors.f t;
        if (q.p()) {
            t = kotlin.reflect.jvm.internal.impl.descriptors.f.K;
        }
        else if (q.G()) {
            t = kotlin.reflect.jvm.internal.impl.descriptors.f.H;
        }
        else if (q.A()) {
            t = kotlin.reflect.jvm.internal.impl.descriptors.f.I;
        }
        else {
            t = kotlin.reflect.jvm.internal.impl.descriptors.f.G;
        }
        this.T = t;
        b0 u;
        if (!q.p() && !q.A()) {
            u = kotlin.reflect.jvm.internal.impl.descriptors.b0.G.a(false, q.w() || q.isAbstract() || q.G(), q.isFinal() ^ true);
        }
        else {
            u = kotlin.reflect.jvm.internal.impl.descriptors.b0.H;
        }
        this.U = u;
        this.V = q.getVisibility();
        this.W = (q.e() != null && !q.P());
        this.X = new b();
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g y = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g(d, (kotlin.reflect.jvm.internal.impl.descriptors.e)this, q, r != null, null, 16, null);
        this.Y = y;
        this.Z = (u0<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g>)u0.e.a((kotlin.reflect.jvm.internal.impl.descriptors.e)this, d.e(), d.a().j().c(), (n6.l)new n6.l<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g>() {
            final /* synthetic */ f G;
            
            @e
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g a(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
                k0.p((Object)g, "it");
                final kotlin.reflect.jvm.internal.impl.load.java.lazy.g m0 = f.M0(this.G);
                final f g2 = this.G;
                return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g(m0, (kotlin.reflect.jvm.internal.impl.descriptors.e)g2, g2.Q0(), f.L0(this.G) != null, f.N0(this.G));
            }
        });
        this.a0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.f(y);
        this.b0 = new k(d, q, this);
        this.c0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(d, q);
        this.d0 = (i<List<b1>>)d.e().g((n6.a<?>)new n6.a<List<? extends b1>>() {
            final /* synthetic */ f G;
            
            @e
            public final List<b1> a() {
                final List<y> typeParameters = this.G.Q0().getTypeParameters();
                final f g = this.G;
                final ArrayList list = new ArrayList<b1>(v.Y((Iterable)typeParameters, 10));
                for (final y obj : typeParameters) {
                    final b1 a = f.M0(g).f().a(obj);
                    if (a == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Parameter ");
                        sb.append(obj);
                        sb.append(" surely belongs to class ");
                        sb.append(g.Q0());
                        sb.append(", so it must be resolved");
                        throw new AssertionError((Object)sb.toString());
                    }
                    list.add(a);
                }
                return (List<b1>)list;
            }
        });
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e L0(final f f) {
        return f.R;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g M0(final f f) {
        return f.S;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g N0(final f f) {
        return f.Y;
    }
    
    @e
    public h B0() {
        return this.a0;
    }
    
    @e
    public List<b1> C() {
        return (List<b1>)((n6.a)this.d0).invoke();
    }
    
    public boolean D() {
        return false;
    }
    
    public boolean F0() {
        return false;
    }
    
    public boolean G() {
        return false;
    }
    
    @e
    public final f O0(@e final kotlin.reflect.jvm.internal.impl.load.java.components.g g, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)g, "javaResolverCache");
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.g s = this.S;
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.g j = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.j(s, s.a().v(g));
        final m c = this.c();
        k0.o((Object)c, "containingDeclaration");
        return new f(j, c, this.Q, e);
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> P0() {
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.d>)((n6.a)this.Y.x0()).invoke();
    }
    
    public boolean Q() {
        return false;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.g Q0() {
        return this.Q;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g R0() {
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g)super.E0();
    }
    
    @e
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g S0(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g)this.Z.c(g);
    }
    
    @org.jetbrains.annotations.f
    public kotlin.reflect.jvm.internal.impl.descriptors.d U() {
        return null;
    }
    
    @e
    public h V() {
        return this.b0;
    }
    
    @org.jetbrains.annotations.f
    public kotlin.reflect.jvm.internal.impl.descriptors.e X() {
        return null;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.c0;
    }
    
    @e
    public u getVisibility() {
        u u;
        if (k0.g((Object)this.V, (Object)t.a) && this.Q.e() == null) {
            u = kotlin.reflect.jvm.internal.impl.load.java.u.a;
            k0.o((Object)u, "{\n            JavaDescriptorVisibilities.PACKAGE_VISIBILITY\n        }");
        }
        else {
            u = kotlin.reflect.jvm.internal.impl.load.java.d0.b(this.V);
        }
        return u;
    }
    
    public boolean isInline() {
        return false;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.types.w0 l() {
        return this.X;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.f n() {
        return this.T;
    }
    
    @e
    public b0 o() {
        return this.U;
    }
    
    public boolean q() {
        return false;
    }
    
    @e
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> s() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.e> e;
        if (this.U == kotlin.reflect.jvm.internal.impl.descriptors.b0.I) {
            final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.H, false, null, 3, null);
            final Collection<j> m = this.Q.M();
            final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e>();
            final Iterator<Object> iterator = m.iterator();
            while (true) {
                e = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final kotlin.reflect.jvm.internal.impl.descriptors.h c = this.S.g().n(iterator.next(), f).N0().c();
                kotlin.reflect.jvm.internal.impl.descriptors.e e2;
                if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
                }
                else {
                    e2 = null;
                }
                if (e2 == null) {
                    continue;
                }
                list.add(e2);
            }
        }
        else {
            e = (List<kotlin.reflect.jvm.internal.impl.descriptors.e>)v.E();
        }
        return e;
    }
    
    public boolean t() {
        return false;
    }
    
    @e
    public String toString() {
        return k0.C("Lazy Java class ", (Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)this));
    }
    
    public boolean u() {
        return this.W;
    }
    
    public static final class a
    {
        private a() {
        }
    }
    
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b
    {
        @e
        private final i<List<b1>> d;
        
        public b() {
            k0.p((Object)f.this, "this$0");
            super(f.M0(f.this).e());
            this.d = f.M0(f.this).e().g((n6.a<? extends List<b1>>)new n6.a<List<? extends b1>>() {
                @e
                public final List<b1> a() {
                    return (List<b1>)c1.d((kotlin.reflect.jvm.internal.impl.descriptors.i)f.this);
                }
            });
        }
        
        private final c0 u() {
            kotlin.reflect.jvm.internal.impl.name.b v = this.v();
            if (v == null || (v.d() || !v.i(StandardNames.BUILT_INS_PACKAGE_NAME))) {
                v = null;
            }
            kotlin.reflect.jvm.internal.impl.name.b b;
            if (v == null) {
                if ((b = kotlin.reflect.jvm.internal.impl.load.java.o.a.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)f.this))) == null) {
                    return null;
                }
            }
            else {
                b = v;
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e r = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.r(f.M0(f.this).d(), b, kotlin.reflect.jvm.internal.impl.incremental.components.d.Y);
            if (r == null) {
                return null;
            }
            final int size = ((kotlin.reflect.jvm.internal.impl.descriptors.h)r).l().getParameters().size();
            final List<b1> parameters = f.this.l().getParameters();
            k0.o((Object)parameters, "getTypeConstructor().parameters");
            final int size2 = parameters.size();
            ArrayList<a1> list2;
            if (size2 == size) {
                final ArrayList list = new ArrayList<a1>(kotlin.collections.v.Y((Iterable)parameters, 10));
                final Iterator<Object> iterator = parameters.iterator();
                while (true) {
                    list2 = (ArrayList<a1>)list;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    list.add(new a1(k1.K, ((kotlin.reflect.jvm.internal.impl.descriptors.h)iterator.next()).A()));
                }
            }
            else {
                if (size2 != 1 || size <= 1 || v != null) {
                    return null;
                }
                final a1 a1 = new a1(k1.K, ((kotlin.reflect.jvm.internal.impl.descriptors.h)kotlin.collections.v.U4((List)parameters)).A());
                final kotlin.ranges.k k = new kotlin.ranges.k(1, size);
                list2 = new ArrayList<a1>(kotlin.collections.v.Y((Iterable)k, 10));
                final Iterator iterator2 = ((Iterable)k).iterator();
                while (iterator2.hasNext()) {
                    ((t0)iterator2).b();
                    list2.add(a1);
                }
            }
            final kotlin.reflect.jvm.internal.impl.types.d0 a2 = kotlin.reflect.jvm.internal.impl.types.d0.a;
            return kotlin.reflect.jvm.internal.impl.types.d0.g(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), r, list2);
        }
        
        private final kotlin.reflect.jvm.internal.impl.name.b v() {
            final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = f.this.getAnnotations();
            final kotlin.reflect.jvm.internal.impl.name.b o = kotlin.reflect.jvm.internal.impl.load.java.y.o;
            k0.o((Object)o, "PURELY_IMPLEMENTS_ANNOTATION");
            final c a0 = annotations.a0(o);
            if (a0 == null) {
                return null;
            }
            final Object v4 = v.V4((Iterable)a0.b().values());
            Object o2;
            if (v4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.v) {
                o2 = v4;
            }
            else {
                o2 = null;
            }
            String s;
            if (o2 == null) {
                s = null;
            }
            else {
                s = ((kotlin.reflect.jvm.internal.impl.resolve.constants.g<__Null>)o2).b();
            }
            if (s == null) {
                return null;
            }
            if (!kotlin.reflect.jvm.internal.impl.name.d.c(s)) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.name.b(s);
        }
        
        @Override
        public boolean d() {
            return true;
        }
        
        @e
        @Override
        protected Collection<c0> g() {
            final Collection<j> k = f.this.Q0().k();
            final ArrayList list = new ArrayList<c0>(k.size());
            final ArrayList<Object> list2 = new ArrayList<Object>(0);
            final c0 u = this.u();
            final Iterator<j> iterator = k.iterator();
            c0 p;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                p = null;
                Object n0 = null;
                if (!hasNext) {
                    break;
                }
                final j e = iterator.next();
                c0 e2;
                final c0 c0 = e2 = f.M0(f.this).g().n(e, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.G, (boolean)(0 != 0), null, 3, null));
                if (f.M0(f.this).a().p().b()) {
                    e2 = f.M0(f.this).a().q().f(c0, f.M0(f.this));
                }
                if (e2.N0().c() instanceof g0$b) {
                    list2.add(e);
                }
                final w0 n2 = e2.N0();
                if (u != null) {
                    n0 = u.N0();
                }
                if (k0.g((Object)n2, n0)) {
                    continue;
                }
                if (KotlinBuiltIns.isAnyOrNullableAny(e2)) {
                    continue;
                }
                list.add(e2);
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e l0 = f.L0(f.this);
            if (l0 != null) {
                p = kotlin.reflect.jvm.internal.impl.builtins.jvm.j.a(l0, (kotlin.reflect.jvm.internal.impl.descriptors.e)f.this).c().p(l0.A(), k1.K);
            }
            kotlin.reflect.jvm.internal.impl.utils.a.a((Collection<c0>)list, p);
            kotlin.reflect.jvm.internal.impl.utils.a.a((Collection<c0>)list, u);
            if (list2.isEmpty() ^ true) {
                final p c2 = f.M0(f.this).a().c();
                final kotlin.reflect.jvm.internal.impl.descriptors.e s = this.s();
                final ArrayList list3 = new ArrayList<String>(v.Y((Iterable)list2, 10));
                final Iterator<Object> iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    list3.add(((j)iterator2.next()).o());
                }
                c2.b(s, (List<String>)list3);
            }
            List list4;
            if (list.isEmpty() ^ true) {
                list4 = v.I5((Iterable)list);
            }
            else {
                list4 = v.k((Object)f.M0(f.this).d().w().getAnyType());
            }
            return (Collection<c0>)list4;
        }
        
        @e
        @Override
        public List<b1> getParameters() {
            return (List<b1>)((n6.a)this.d).invoke();
        }
        
        @e
        @Override
        protected z0 l() {
            return f.M0(f.this).a().u();
        }
        
        @e
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.e s() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e)f.this;
        }
        
        @e
        @Override
        public String toString() {
            final String d = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.a)f.this).getName().d();
            k0.o((Object)d, "name.asString()");
            return d;
        }
    }
}
