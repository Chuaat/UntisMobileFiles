// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import java.util.Map;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.z;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.load.java.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.jvm.internal.w;
import java.util.Set;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.load.java.structure.r;
import java.util.ArrayList;
import kotlin.collections.v;
import n6.l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Collection;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;

public abstract class j extends i
{
    static final /* synthetic */ o<Object>[] m;
    @e
    private final g b;
    @f
    private final j c;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<m>> d;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> e;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.e, Collection<v0>> f;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.e, q0> g;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.e, Collection<v0>> h;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i i;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i j;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i k;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.e, List<q0>> l;
    
    static {
        m = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;")) };
    }
    
    public j(@e final g b, @f final j c) {
        k0.p((Object)b, "c");
        this.b = b;
        this.c = c;
        this.d = b.e().a((n6.a<? extends Collection<m>>)new n6.a<Collection<? extends m>>() {
            final /* synthetic */ j G;
            
            @e
            public final Collection<m> a() {
                return this.G.n(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.o, kotlin.reflect.jvm.internal.impl.resolve.scopes.h.a.a());
            }
        }, (Collection<m>)v.E());
        this.e = b.e().g((n6.a<? extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b>)new n6.a<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b>() {
            final /* synthetic */ j G;
            
            @e
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b a() {
                return this.G.q();
            }
        });
        this.f = b.e().b((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<v0>>)new l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>() {
            final /* synthetic */ j G;
            
            @e
            public final Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "name");
                if (this.G.C() != null) {
                    return (Collection<v0>)((l)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.j(this.G.C())).invoke((Object)e);
                }
                final ArrayList<v0> list = new ArrayList<v0>();
                for (final r r : ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.G.z()).invoke()).f(e)) {
                    final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f j = this.G.J(r);
                    if (!this.G.H(j)) {
                        continue;
                    }
                    this.G.x().a().g().e(r, (v0)j);
                    list.add(j);
                }
                this.G.p(list, e);
                return list;
            }
        });
        this.g = b.e().i((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends q0>)new l<kotlin.reflect.jvm.internal.impl.name.e, q0>() {
            final /* synthetic */ j G;
            
            @f
            public final q0 a(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "name");
                if (this.G.C() != null) {
                    return (q0)((l)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.i(this.G.C())).invoke((Object)e);
                }
                final n c = ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.G.z()).invoke()).c(e);
                q0 k;
                if (c != null && !c.F()) {
                    k = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.this.K(c);
                }
                else {
                    k = null;
                }
                return k;
            }
        });
        this.h = b.e().b((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<v0>>)new l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>() {
            final /* synthetic */ j G;
            
            @e
            public final Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "name");
                final LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.b> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.b>((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)((l)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.j(this.G)).invoke((Object)e));
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.this.M(set);
                this.G.s((Collection<v0>)set, e);
                return (Collection<v0>)v.I5((Iterable)this.G.x().a().q().e(this.G.x(), (Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)set));
            }
        });
        this.i = b.e().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
            final /* synthetic */ j G;
            
            @e
            public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                return this.G.o(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.v, null);
            }
        });
        this.j = b.e().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
            final /* synthetic */ j G;
            
            @e
            public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                return this.G.u(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.w, null);
            }
        });
        this.k = b.e().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
            final /* synthetic */ j G;
            
            @e
            public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                return this.G.m(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.t, null);
            }
        });
        this.l = b.e().b((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends List<q0>>)new l<kotlin.reflect.jvm.internal.impl.name.e, List<? extends q0>>() {
            final /* synthetic */ j G;
            
            @e
            public final List<q0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "name");
                final ArrayList<Object> list = new ArrayList<Object>();
                kotlin.reflect.jvm.internal.impl.utils.a.a(list, ((l)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.i(this.G)).invoke((Object)e));
                this.G.t(e, (Collection<q0>)list);
                List list2;
                if (kotlin.reflect.jvm.internal.impl.resolve.d.t(this.G.D())) {
                    list2 = v.I5((Iterable)list);
                }
                else {
                    list2 = v.I5((Iterable)this.G.x().a().q().e(this.G.x(), (Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)list));
                }
                return (List<q0>)list2;
            }
        });
    }
    
    private final Set<kotlin.reflect.jvm.internal.impl.name.e> B() {
        return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.i, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.m[0]);
    }
    
    private final Set<kotlin.reflect.jvm.internal.impl.name.e> E() {
        return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.j, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.m[1]);
    }
    
    private final c0 F(final n n) {
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c g = this.b.g();
        final x a = n.a();
        final kotlin.reflect.jvm.internal.impl.load.java.components.k h = kotlin.reflect.jvm.internal.impl.load.java.components.k.H;
        final boolean b = false;
        final c0 n2 = g.n(a, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(h, false, null, 3, null));
        int n3 = 0;
        Label_0084: {
            if (!KotlinBuiltIns.isPrimitiveType(n2)) {
                n3 = (b ? 1 : 0);
                if (!KotlinBuiltIns.isString(n2)) {
                    break Label_0084;
                }
            }
            n3 = (b ? 1 : 0);
            if (this.G(n)) {
                n3 = (b ? 1 : 0);
                if (n.N()) {
                    n3 = 1;
                }
            }
        }
        if (n3 != 0) {
            final c0 n4 = kotlin.reflect.jvm.internal.impl.types.f1.n(n2);
            k0.o((Object)n4, "makeNotNullable(propertyType)");
            return n4;
        }
        return n2;
    }
    
    private final boolean G(final n n) {
        return n.isFinal() && n.P();
    }
    
    private final q0 K(final n n) {
        final b0 v = this.v(n);
        v.W0((kotlin.reflect.jvm.internal.impl.descriptors.impl.c0)null, (s0)null, (kotlin.reflect.jvm.internal.impl.descriptors.w)null, (kotlin.reflect.jvm.internal.impl.descriptors.w)null);
        v.b1(this.F(n), kotlin.collections.v.E(), this.A(), (t0)null);
        if (kotlin.reflect.jvm.internal.impl.resolve.d.K((g1)v, ((l0)v).a())) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.m0)v).M0((kotlin.reflect.jvm.internal.impl.storage.j)this.b.e().e((n6.a<?>)new n6.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>() {
                final /* synthetic */ j G;
                
                @f
                public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a() {
                    return this.G.x().a().f().a(n, (q0)v);
                }
            }));
        }
        this.b.a().g().d(n, (q0)v);
        return (q0)v;
    }
    
    private final void M(final Set<v0> set) {
        final LinkedHashMap<String, List<?>> linkedHashMap = new LinkedHashMap<String, List<?>>();
        for (final v0 next : set) {
            final String c = t.c((y)next, false, false, 2, null);
            List<?> value;
            if ((value = linkedHashMap.get(c)) == null) {
                value = new ArrayList<Object>();
                linkedHashMap.put(c, value);
            }
            value.add(next);
        }
        for (final List<?> list : linkedHashMap.values()) {
            if (list.size() == 1) {
                continue;
            }
            final Collection<Object> a = kotlin.reflect.jvm.internal.impl.resolve.k.a((Collection<?>)list, (n6.l<? super Object, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a>)j$m.G);
            set.removeAll(list);
            set.addAll((Collection<? extends v0>)a);
        }
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.h i(final j j) {
        return j.g;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.g j(final j j) {
        return j.f;
    }
    
    private final b0 v(final n n) {
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.g d1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.g.d1(this.D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.b, n), kotlin.reflect.jvm.internal.impl.descriptors.b0.H, d0.b(n.getVisibility()), n.isFinal() ^ true, n.getName(), (w0)this.b.a().s().a(n), this.G(n));
        k0.o((Object)d1, "create(\n            ownerDescriptor, annotations, Modality.FINAL, field.visibility.toDescriptorVisibility(), isVar, field.name,\n            c.components.sourceElementFactory.source(field), /* isConst = */ field.isFinalStatic\n        )");
        return d1;
    }
    
    private final Set<kotlin.reflect.jvm.internal.impl.name.e> y() {
        return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.k, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.m[2]);
    }
    
    @f
    protected abstract t0 A();
    
    @f
    protected final j C() {
        return this.c;
    }
    
    @e
    protected abstract m D();
    
    protected boolean H(@e final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f f) {
        k0.p((Object)f, "<this>");
        return true;
    }
    
    @e
    protected abstract a I(@e final r p0, @e final List<? extends b1> p1, @e final c0 p2, @e final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.e1> p3);
    
    @e
    protected final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f J(@e final r r) {
        k0.p((Object)r, "method");
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f q1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.q1(this.D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.b, r), r.getName(), (w0)this.b.a().s().a(r), ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.e).invoke()).b(r.getName()) != null && r.m().isEmpty());
        k0.o((Object)q1, "createJavaMethod(\n            ownerDescriptor, annotations, method.name, c.components.sourceElementFactory.source(method),\n            declaredMemberIndex().findRecordComponentByName(method.name) != null && method.valueParameters.isEmpty()\n        )");
        final g f = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.f(this.b, (m)q1, r, 0, 4, null);
        final List<kotlin.reflect.jvm.internal.impl.load.java.structure.y> typeParameters = r.getTypeParameters();
        final ArrayList list = new ArrayList<b1>(v.Y((Iterable)typeParameters, 10));
        final Iterator<Object> iterator = typeParameters.iterator();
        while (iterator.hasNext()) {
            final b1 a = f.f().a(iterator.next());
            k0.m((Object)a);
            list.add(a);
        }
        final b l = this.L(f, (y)q1, r.m());
        final a i = this.I(r, (List<? extends b1>)list, this.r(r, f), l.a());
        final c0 c = i.c();
        t0 f2;
        if (c == null) {
            f2 = null;
        }
        else {
            f2 = kotlin.reflect.jvm.internal.impl.resolve.c.f((kotlin.reflect.jvm.internal.impl.descriptors.a)q1, c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b());
        }
        final t0 a2 = this.A();
        final List<b1> e = i.e();
        final List<kotlin.reflect.jvm.internal.impl.descriptors.e1> f3 = i.f();
        final c0 d = i.d();
        final kotlin.reflect.jvm.internal.impl.descriptors.b0 a3 = kotlin.reflect.jvm.internal.impl.descriptors.b0.G.a(false, r.isAbstract(), r.isFinal() ^ true);
        final u b = d0.b(r.getVisibility());
        Map map;
        if (i.c() != null) {
            map = y0.k(n1.a((Object)kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.l0, v.o2((List)l.a())));
        }
        else {
            map = y0.z();
        }
        q1.p1(f2, a2, e, f3, d, a3, b, map);
        q1.t1(i.b(), l.b());
        if (i.a().isEmpty() ^ true) {
            f.a().r().b((kotlin.reflect.jvm.internal.impl.descriptors.b)q1, i.a());
        }
        return q1;
    }
    
    @e
    protected final b L(@e final g g, @e final y y, @e final List<? extends a0> list) {
        k0.p((Object)g, "c");
        k0.p((Object)y, "function");
        k0.p((Object)list, "jValueParameters");
        final LinkedHashSet<String> set = new LinkedHashSet<String>();
        final Iterable u5 = v.U5((Iterable)list);
        final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.impl.k0>(v.Y(u5, 10));
        final Iterator<kotlin.collections.q0> iterator = u5.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final kotlin.collections.q0 q0 = iterator.next();
            final int a = q0.a();
            final a0 a2 = (a0)q0.b();
            final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(g, a2);
            final kotlin.reflect.jvm.internal.impl.load.java.components.k h = kotlin.reflect.jvm.internal.impl.load.java.components.k.H;
            final c0 c0 = null;
            final kotlin.reflect.jvm.internal.impl.load.java.structure.f f = null;
            final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(h, false, null, 3, null);
            final kotlin.reflect.jvm.internal.impl.name.b s = kotlin.reflect.jvm.internal.impl.load.java.y.s;
            k0.o((Object)s, "PARAMETER_NAME_FQ_NAME");
            final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a4 = a3.a0(s);
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> b;
            if (a4 == null) {
                b = null;
            }
            else {
                b = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.b(a4);
            }
            String s2 = null;
            Label_0225: {
                if (b != null) {
                    kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g2 = b;
                    if (!(b instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.v)) {
                        g2 = null;
                    }
                    final kotlin.reflect.jvm.internal.impl.resolve.constants.v v = (kotlin.reflect.jvm.internal.impl.resolve.constants.v)g2;
                    if (v != null) {
                        s2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.g<__Null>)v).b();
                        break Label_0225;
                    }
                }
                s2 = null;
            }
            c0 c2;
            c0 arrayElementType;
            if (a2.l()) {
                final x a5 = a2.a();
                kotlin.reflect.jvm.internal.impl.load.java.structure.f f3 = f;
                if (a5 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.f) {
                    f3 = (kotlin.reflect.jvm.internal.impl.load.java.structure.f)a5;
                }
                if (f3 == null) {
                    throw new AssertionError((Object)k0.C("Vararg parameter should be an array: ", (Object)a2));
                }
                c2 = g.g().j(f3, f2, true);
                arrayElementType = g.d().w().getArrayElementType(c2);
            }
            else {
                c2 = g.g().n(a2.a(), f2);
                arrayElementType = c0;
            }
            final kotlin.s0 a6 = n1.a((Object)c2, (Object)arrayElementType);
            final c0 c3 = (c0)a6.a();
            final c0 c4 = (c0)a6.b();
            kotlin.reflect.jvm.internal.impl.name.e e;
            int n2;
            if (k0.g((Object)((f0)y).getName().d(), (Object)"equals") && list.size() == 1 && k0.g((Object)g.d().w().getNullableAnyType(), (Object)c3)) {
                e = kotlin.reflect.jvm.internal.impl.name.e.i("other");
                n2 = n;
            }
            else if (s2 != null && s2.length() > 0 && set.add(s2)) {
                e = kotlin.reflect.jvm.internal.impl.name.e.i(s2);
                n2 = n;
            }
            else {
                final kotlin.reflect.jvm.internal.impl.name.e name = a2.getName();
                if (name == null) {
                    n = 1;
                }
                n2 = n;
                if ((e = name) == null) {
                    e = kotlin.reflect.jvm.internal.impl.name.e.i(k0.C("p", (Object)a));
                    k0.o((Object)e, "identifier(\"p$index\")");
                    n2 = n;
                }
            }
            k0.o((Object)e, "if (function.name.asString() == \"equals\" &&\n                jValueParameters.size == 1 &&\n                c.module.builtIns.nullableAnyType == outType\n            ) {\n                // This is a hack to prevent numerous warnings on Kotlin classes that inherit Java classes: if you override \"equals\" in such\n                // class without this hack, you'll be warned that in the superclass the name is \"p0\" (regardless of the fact that it's\n                // \"other\" in Any)\n                // TODO: fix Java parameter name loading logic somehow (don't always load \"p0\", \"p1\", etc.)\n                Name.identifier(\"other\")\n            } else if (parameterName != null && parameterName.isNotEmpty() && usedNames.add(parameterName)) {\n                Name.identifier(parameterName)\n            } else {\n                // TODO: parameter names may be drawn from attached sources, which is slow; it's better to make them lazy\n                val javaName = javaParameter.name\n                if (javaName == null) synthesizedNames = true\n                javaName ?: Name.identifier(\"p$index\")\n            }");
            list2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0((kotlin.reflect.jvm.internal.impl.descriptors.a)y, (kotlin.reflect.jvm.internal.impl.descriptors.e1)null, a, a3, e, c3, false, false, false, c4, (w0)g.a().s().a(a2)));
            n = n2;
        }
        return new b(v.I5((Iterable)list2), (boolean)(n != 0));
    }
    
    @e
    @Override
    public Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        if (!this.b().contains(e)) {
            return (Collection<v0>)v.E();
        }
        return (Collection<v0>)((l)this.h).invoke((Object)e);
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
        return this.B();
    }
    
    @e
    @Override
    public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        if (!this.d().contains(e)) {
            return (Collection<q0>)v.E();
        }
        return (Collection<q0>)((l)this.l).invoke((Object)e);
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        return this.E();
    }
    
    @e
    @Override
    public Collection<m> e(@e final d d, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        return (Collection<m>)((n6.a)this.d).invoke();
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
        return this.y();
    }
    
    @e
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.e> m(@e final d p0, @f final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> p1);
    
    @e
    protected final List<m> n(@e final d d, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        final kotlin.reflect.jvm.internal.impl.incremental.components.d s = kotlin.reflect.jvm.internal.impl.incremental.components.d.S;
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.h> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.h>();
        if (d.a(d.c.d())) {
            for (final kotlin.reflect.jvm.internal.impl.name.e e : this.m(d, l)) {
                if (l.invoke((Object)e)) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(set, this.g(e, s));
                }
            }
        }
        if (d.a(d.c.e()) && !d.n().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.a)) {
            for (final kotlin.reflect.jvm.internal.impl.name.e e2 : this.o(d, l)) {
                if (l.invoke((Object)e2)) {
                    set.addAll((Collection<?>)this.a(e2, s));
                }
            }
        }
        if (d.a(d.c.k()) && !d.n().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.a)) {
            for (final kotlin.reflect.jvm.internal.impl.name.e e3 : this.u(d, l)) {
                if (l.invoke((Object)e3)) {
                    set.addAll((Collection<?>)this.c(e3, s));
                }
            }
        }
        return (List<m>)v.I5((Iterable)set);
    }
    
    @e
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.e> o(@e final d p0, @f final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> p1);
    
    protected void p(@e final Collection<v0> collection, @e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)collection, "result");
        k0.p((Object)e, "name");
    }
    
    @e
    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b q();
    
    @e
    protected final c0 r(@e final r r, @e final g g) {
        k0.p((Object)r, "method");
        k0.p((Object)g, "c");
        return g.g().n(r.getReturnType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(kotlin.reflect.jvm.internal.impl.load.java.components.k.H, r.O().p(), null, 2, null));
    }
    
    protected abstract void s(@e final Collection<v0> p0, @e final kotlin.reflect.jvm.internal.impl.name.e p1);
    
    protected abstract void t(@e final kotlin.reflect.jvm.internal.impl.name.e p0, @e final Collection<q0> p1);
    
    @e
    @Override
    public String toString() {
        return k0.C("Lazy scope for ", (Object)this.D());
    }
    
    @e
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.e> u(@e final d p0, @f final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> p1);
    
    @e
    protected final kotlin.reflect.jvm.internal.impl.storage.i<Collection<m>> w() {
        return this.d;
    }
    
    @e
    protected final g x() {
        return this.b;
    }
    
    @e
    protected final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> z() {
        return this.e;
    }
    
    protected static final class a
    {
        @e
        private final c0 a;
        @f
        private final c0 b;
        @e
        private final List<kotlin.reflect.jvm.internal.impl.descriptors.e1> c;
        @e
        private final List<b1> d;
        private final boolean e;
        @e
        private final List<String> f;
        
        public a(@e final c0 a, @f final c0 b, @e final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.e1> c, @e final List<? extends b1> d, final boolean e, @e final List<String> f) {
            k0.p((Object)a, "returnType");
            k0.p((Object)c, "valueParameters");
            k0.p((Object)d, "typeParameters");
            k0.p((Object)f, "errors");
            this.a = a;
            this.b = b;
            this.c = (List<kotlin.reflect.jvm.internal.impl.descriptors.e1>)c;
            this.d = (List<b1>)d;
            this.e = e;
            this.f = f;
        }
        
        @e
        public final List<String> a() {
            return this.f;
        }
        
        public final boolean b() {
            return this.e;
        }
        
        @f
        public final c0 c() {
            return this.b;
        }
        
        @e
        public final c0 d() {
            return this.a;
        }
        
        @e
        public final List<b1> e() {
            return this.d;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return k0.g((Object)this.a, (Object)a.a) && k0.g((Object)this.b, (Object)a.b) && k0.g((Object)this.c, (Object)a.c) && k0.g((Object)this.d, (Object)a.d) && this.e == a.e && k0.g((Object)this.f, (Object)a.f);
        }
        
        @e
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.e1> f() {
            return this.c;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final c0 b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            final int hashCode3 = this.c.hashCode();
            final int hashCode4 = this.d.hashCode();
            int e;
            if ((e = (this.e ? 1 : 0)) != 0) {
                e = 1;
            }
            return ((((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + e) * 31 + this.f.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("MethodSignatureData(returnType=");
            sb.append(this.a);
            sb.append(", receiverType=");
            sb.append(this.b);
            sb.append(", valueParameters=");
            sb.append(this.c);
            sb.append(", typeParameters=");
            sb.append(this.d);
            sb.append(", hasStableParameterNames=");
            sb.append(this.e);
            sb.append(", errors=");
            sb.append(this.f);
            sb.append(')');
            return sb.toString();
        }
    }
    
    protected static final class b
    {
        @e
        private final List<kotlin.reflect.jvm.internal.impl.descriptors.e1> a;
        private final boolean b;
        
        public b(@e final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.e1> a, final boolean b) {
            k0.p((Object)a, "descriptors");
            this.a = (List<kotlin.reflect.jvm.internal.impl.descriptors.e1>)a;
            this.b = b;
        }
        
        @e
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.e1> a() {
            return this.a;
        }
        
        public final boolean b() {
            return this.b;
        }
    }
}
