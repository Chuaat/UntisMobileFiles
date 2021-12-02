// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import java.util.Comparator;
import java.io.OutputStream;
import kotlin.j2;
import java.io.ByteArrayOutputStream;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.u;
import kotlin.sequences.p;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.s;
import java.io.ByteArrayInputStream;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.storage.m;
import org.jetbrains.annotations.f;
import kotlin.collections.j1;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import java.util.Set;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import java.util.List;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.storage.j;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.o;

public abstract class i extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i
{
    static final /* synthetic */ o<Object>[] f;
    @e
    private final l b;
    @e
    private final a c;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i d;
    @e
    private final j e;
    
    static {
        f = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)i.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)i.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;")) };
    }
    
    protected i(@e final l b, @e final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> list, @e final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> list2, @e final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> list3, @e final n6.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.e>> a) {
        k0.p((Object)b, "c");
        k0.p((Object)list, "functionList");
        k0.p((Object)list2, "propertyList");
        k0.p((Object)list3, "typeAliasList");
        k0.p((Object)a, "classNames");
        this.b = b;
        this.c = this.p(list, list2, list3);
        this.d = b.h().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
            @e
            public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                return (Set<kotlin.reflect.jvm.internal.impl.name.e>)v.N5((Iterable)a.invoke());
            }
        });
        this.e = b.h().e((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
            final /* synthetic */ i G;
            
            @f
            public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                final Set<kotlin.reflect.jvm.internal.impl.name.e> u = this.G.u();
                if (u == null) {
                    return null;
                }
                return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C(j1.C((Set)this.G.s(), (Iterable)i.j(this.G).f()), (Iterable)u);
            }
        });
    }
    
    public static final /* synthetic */ l i(final i i) {
        return i.b;
    }
    
    public static final /* synthetic */ a j(final i i) {
        return i.c;
    }
    
    private final a p(final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> list, final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> list2, final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> list3) {
        a a;
        if (this.b.c().g().a()) {
            a = new b(list, list2, list3);
        }
        else {
            a = new c(list, list2, list3);
        }
        return a;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e q(final kotlin.reflect.jvm.internal.impl.name.e e) {
        return this.b.c().b(this.o(e));
    }
    
    private final Set<kotlin.reflect.jvm.internal.impl.name.e> t() {
        return m.b((j<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.e, (Object)this, (o<?>)i.f[1]);
    }
    
    private final a1 x(final kotlin.reflect.jvm.internal.impl.name.e e) {
        return this.c.g(e);
    }
    
    @e
    @Override
    public Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return this.c.a(e, b);
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
        return this.c.b();
    }
    
    @e
    @Override
    public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return this.c.c(e, b);
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        return this.c.d();
    }
    
    @f
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
        return this.t();
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        Object o;
        if (this.y(e)) {
            o = this.q(e);
        }
        else if (this.c.f().contains(e)) {
            o = this.x(e);
        }
        else {
            o = null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.h)o;
    }
    
    protected abstract void k(@e final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> p0, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> p1);
    
    @e
    protected final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> l(@e final d d, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        k0.p((Object)b, "location");
        final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e>(0);
        final d.a c = d.c;
        if (d.a(c.h())) {
            this.k((Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>)list, l);
        }
        this.c.e((Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>)list, d, l, b);
        if (d.a(c.d())) {
            for (final kotlin.reflect.jvm.internal.impl.name.e e : this.s()) {
                if (l.invoke((Object)e)) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(list, this.q(e));
                }
            }
        }
        if (d.a(d.c.i())) {
            for (final kotlin.reflect.jvm.internal.impl.name.e e2 : this.c.f()) {
                if (l.invoke((Object)e2)) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a((Collection<a1>)list, this.c.g(e2));
                }
            }
        }
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>)kotlin.reflect.jvm.internal.impl.utils.a.c((ArrayList<Object>)list);
    }
    
    protected void m(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final List<v0> list) {
        k0.p((Object)e, "name");
        k0.p((Object)list, "functions");
    }
    
    protected void n(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final List<q0> list) {
        k0.p((Object)e, "name");
        k0.p((Object)list, "descriptors");
    }
    
    @e
    protected abstract kotlin.reflect.jvm.internal.impl.name.a o(@e final kotlin.reflect.jvm.internal.impl.name.e p0);
    
    @e
    protected final l r() {
        return this.b;
    }
    
    @e
    public final Set<kotlin.reflect.jvm.internal.impl.name.e> s() {
        return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.d, (Object)this, (o<?>)i.f[0]);
    }
    
    @f
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.e> u();
    
    @e
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.e> v();
    
    @e
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.e> w();
    
    protected boolean y(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        return this.s().contains(e);
    }
    
    protected boolean z(@e final v0 v0) {
        k0.p((Object)v0, "function");
        return true;
    }
    
    private interface a
    {
        @e
        Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e p0, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b p1);
        
        @e
        Set<kotlin.reflect.jvm.internal.impl.name.e> b();
        
        @e
        Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e p0, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b p1);
        
        @e
        Set<kotlin.reflect.jvm.internal.impl.name.e> d();
        
        void e(@e final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> p0, @e final d p1, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> p2, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b p3);
        
        @e
        Set<kotlin.reflect.jvm.internal.impl.name.e> f();
        
        @f
        a1 g(@e final kotlin.reflect.jvm.internal.impl.name.e p0);
    }
    
    private final class b implements a
    {
        static final /* synthetic */ o<Object>[] o;
        @e
        private final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> a;
        @e
        private final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> b;
        @e
        private final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> c;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i d;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i e;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i f;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i g;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i h;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i i;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i j;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i k;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i l;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i m;
        final /* synthetic */ i n;
        
        static {
            o = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "allProperties", "getAllProperties()Ljava/util/List;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)b.class), "variableNames", "getVariableNames()Ljava/util/Set;")) };
        }
        
        public b(@e final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> a, @e final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> b, List<kotlin.reflect.jvm.internal.impl.metadata.a.r> e) {
            k0.p((Object)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this, "this$0");
            k0.p((Object)a, "functionList");
            k0.p((Object)b, "propertyList");
            k0.p((Object)e, "typeAliasList");
            this.a = a;
            this.b = b;
            if (!kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().c().g().f()) {
                e = v.E();
            }
            this.c = (List<kotlin.reflect.jvm.internal.impl.metadata.a.r>)e;
            this.d = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<List<? extends v0>>() {
                @e
                public final List<v0> a() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.v();
                }
            });
            this.e = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<List<? extends q0>>() {
                @e
                public final List<q0> a() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.y();
                }
            });
            this.f = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<List<? extends a1>>() {
                @e
                public final List<a1> a() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.z();
                }
            });
            this.g = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<List<? extends v0>>() {
                @e
                public final List<v0> a() {
                    return (List<v0>)v.q4((Collection)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.D(), (Iterable)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.t());
                }
            });
            this.h = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<List<? extends q0>>() {
                @e
                public final List<q0> a() {
                    return (List<q0>)v.q4((Collection)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.E(), (Iterable)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.u());
                }
            });
            this.i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends a1>>() {
                @e
                public final Map<kotlin.reflect.jvm.internal.impl.name.e, a1> a() {
                    final List o = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.C();
                    final LinkedHashMap linkedHashMap = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, a1>(kotlin.ranges.o.n(y0.j(v.Y((Iterable)o, 10)), 16));
                    for (final a1 next : o) {
                        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)next).getName();
                        k0.o((Object)name, "it.name");
                        linkedHashMap.put(name, next);
                    }
                    return (Map<kotlin.reflect.jvm.internal.impl.name.e, a1>)linkedHashMap;
                }
            });
            this.j = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends List<? extends v0>>>() {
                @e
                public final Map<kotlin.reflect.jvm.internal.impl.name.e, List<v0>> a() {
                    final List m = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.A();
                    final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<v0>> linkedHashMap = (LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<v0>>)new LinkedHashMap<Object, List<v0>>();
                    for (final v0 next : m) {
                        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)next).getName();
                        k0.o((Object)name, "it.name");
                        List<v0> value;
                        if ((value = linkedHashMap.get(name)) == null) {
                            value = new ArrayList<v0>();
                            linkedHashMap.put(name, value);
                        }
                        value.add(next);
                    }
                    return linkedHashMap;
                }
            });
            this.k = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends List<? extends q0>>>() {
                @e
                public final Map<kotlin.reflect.jvm.internal.impl.name.e, List<q0>> a() {
                    final List n = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.this.B();
                    final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<q0>> linkedHashMap = (LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<q0>>)new LinkedHashMap<Object, List<q0>>();
                    for (final q0 next : n) {
                        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)next).getName();
                        k0.o((Object)name, "it.name");
                        List<q0> value;
                        if ((value = linkedHashMap.get(name)) == null) {
                            value = new ArrayList<q0>();
                            linkedHashMap.put(name, value);
                        }
                        value.add(next);
                    }
                    return linkedHashMap;
                }
            });
            this.l = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                final /* synthetic */ b G;
                
                @e
                public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                    final b g = this.G;
                    final List r = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.r(g);
                    final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
                    final i n = g.n;
                    final Iterator<q> iterator = r.iterator();
                    while (iterator.hasNext()) {
                        set.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(n).g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.i)iterator.next()).X()));
                    }
                    return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C((Set)set, (Iterable)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.v());
                }
            });
            this.m = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                final /* synthetic */ b G;
                
                @e
                public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                    final b g = this.G;
                    final List s = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.s(g);
                    final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
                    final i n = g.n;
                    final Iterator<q> iterator = s.iterator();
                    while (iterator.hasNext()) {
                        set.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(n).g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.n)iterator.next()).W()));
                    }
                    return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C((Set)set, (Iterable)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.w());
                }
            });
        }
        
        private final List<v0> A() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends List<v0>>)this.g, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[3]);
        }
        
        private final List<q0> B() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends List<q0>>)this.h, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[4]);
        }
        
        private final List<a1> C() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends List<a1>>)this.f, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[2]);
        }
        
        private final List<v0> D() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends List<v0>>)this.d, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[0]);
        }
        
        private final List<q0> E() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends List<q0>>)this.e, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[1]);
        }
        
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, Collection<v0>> F() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, Collection<v0>>>)this.j, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[6]);
        }
        
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, Collection<q0>> G() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, Collection<q0>>>)this.k, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[7]);
        }
        
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, a1> H() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, a1>>)this.i, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[5]);
        }
        
        public static final /* synthetic */ List r(final b b) {
            return b.a;
        }
        
        public static final /* synthetic */ List s(final b b) {
            return b.b;
        }
        
        private final List<v0> t() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> v = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.v();
            final ArrayList<v0> list = new ArrayList<v0>();
            final Iterator<Object> iterator = v.iterator();
            while (iterator.hasNext()) {
                kotlin.collections.v.q0((Collection)list, (Iterable)this.w(iterator.next()));
            }
            return list;
        }
        
        private final List<q0> u() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> w = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.w();
            final ArrayList<q0> list = new ArrayList<q0>();
            final Iterator<Object> iterator = w.iterator();
            while (iterator.hasNext()) {
                v.q0((Collection)list, (Iterable)this.x(iterator.next()));
            }
            return list;
        }
        
        private final List<v0> v() {
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> a = this.a;
            final i n = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final ArrayList<v0> list = new ArrayList<v0>();
            final Iterator<q> iterator = a.iterator();
            while (iterator.hasNext()) {
                v0 n2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(n).f().n((kotlin.reflect.jvm.internal.impl.metadata.a.i)iterator.next());
                if (!n.z(n2)) {
                    n2 = null;
                }
                if (n2 != null) {
                    list.add(n2);
                }
            }
            return list;
        }
        
        private final List<v0> w(final kotlin.reflect.jvm.internal.impl.name.e e) {
            final List<v0> d = this.D();
            final i n = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final ArrayList<Object> list = new ArrayList<Object>();
            for (final kotlin.reflect.jvm.internal.impl.descriptors.m next : d) {
                if (k0.g((Object)((f0)next).getName(), (Object)e)) {
                    list.add(next);
                }
            }
            final int size = list.size();
            n.m(e, (List<v0>)list);
            return list.subList(size, list.size());
        }
        
        private final List<q0> x(final kotlin.reflect.jvm.internal.impl.name.e e) {
            final List<q0> e2 = this.E();
            final i n = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final ArrayList<Object> list = new ArrayList<Object>();
            for (final kotlin.reflect.jvm.internal.impl.descriptors.m next : e2) {
                if (k0.g((Object)((f0)next).getName(), (Object)e)) {
                    list.add(next);
                }
            }
            final int size = list.size();
            n.n(e, (List<q0>)list);
            return list.subList(size, list.size());
        }
        
        private final List<q0> y() {
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> b = this.b;
            final i n = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final ArrayList<q0> list = new ArrayList<q0>();
            final Iterator<q> iterator = b.iterator();
            while (iterator.hasNext()) {
                final q0 p = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(n).f().p((kotlin.reflect.jvm.internal.impl.metadata.a.n)iterator.next());
                if (p != null) {
                    list.add(p);
                }
            }
            return list;
        }
        
        private final List<a1> z() {
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> c = this.c;
            final i n = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final ArrayList<a1> list = new ArrayList<a1>();
            final Iterator<q> iterator = c.iterator();
            while (iterator.hasNext()) {
                final a1 q = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(n).f().q((kotlin.reflect.jvm.internal.impl.metadata.a.r)iterator.next());
                if (q != null) {
                    list.add(q);
                }
            }
            return list;
        }
        
        @e
        @Override
        public Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            if (!this.b().contains(e)) {
                return (Collection<v0>)v.E();
            }
            Collection<v0> e2 = this.F().get(e);
            if (e2 == null) {
                e2 = (Collection<v0>)v.E();
            }
            return e2;
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.l, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[8]);
        }
        
        @e
        @Override
        public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            if (!this.d().contains(e)) {
                return (Collection<q0>)v.E();
            }
            Collection<q0> e2 = this.G().get(e);
            if (e2 == null) {
                e2 = (Collection<q0>)v.E();
            }
            return e2;
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
            return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.m, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.b.o[9]);
        }
        
        @Override
        public void e(@e final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @e final d d, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)collection, "result");
            k0.p((Object)d, "kindFilter");
            k0.p((Object)l, "nameFilter");
            k0.p((Object)b, "location");
            if (d.a(d.c.k())) {
                for (final q0 next : this.B()) {
                    final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)next).getName();
                    k0.o((Object)name, "it.name");
                    if (l.invoke((Object)name)) {
                        collection.add((kotlin.reflect.jvm.internal.impl.descriptors.m)next);
                    }
                }
            }
            if (d.a(d.c.e())) {
                for (final v0 next2 : this.A()) {
                    final kotlin.reflect.jvm.internal.impl.name.e name2 = ((f0)next2).getName();
                    k0.o((Object)name2, "it.name");
                    if (l.invoke((Object)name2)) {
                        collection.add((kotlin.reflect.jvm.internal.impl.descriptors.m)next2);
                    }
                }
            }
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> c = this.c;
            final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
            final i n = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final Iterator<q> iterator = c.iterator();
            while (iterator.hasNext()) {
                set.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(n).g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.r)iterator.next()).Y()));
            }
            return set;
        }
        
        @f
        @Override
        public a1 g(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
            k0.p((Object)e, "name");
            return this.H().get(e);
        }
    }
    
    private final class c implements a
    {
        static final /* synthetic */ o<Object>[] j;
        @e
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]> a;
        @e
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]> b;
        @e
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]> c;
        @e
        private final g<kotlin.reflect.jvm.internal.impl.name.e, Collection<v0>> d;
        @e
        private final g<kotlin.reflect.jvm.internal.impl.name.e, Collection<q0>> e;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.e, a1> f;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i g;
        @e
        private final kotlin.reflect.jvm.internal.impl.storage.i h;
        final /* synthetic */ i i;
        
        static {
            j = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)c.class), "variableNames", "getVariableNames()Ljava/util/Set;")) };
        }
        
        public c(@e final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> list, @e final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> list2, final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> list3) {
            k0.p((Object)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this, "this$0");
            k0.p((Object)list, "functionList");
            k0.p((Object)list2, "propertyList");
            k0.p((Object)list3, "typeAliasList");
            final LinkedHashMap<Object, List<q>> linkedHashMap = new LinkedHashMap<Object, List<q>>();
            for (final q next : list) {
                final kotlin.reflect.jvm.internal.impl.name.e b = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this).g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.i)next).X());
                List<q> value;
                if ((value = linkedHashMap.get(b)) == null) {
                    value = new ArrayList<q>();
                    linkedHashMap.put(b, value);
                }
                value.add(next);
            }
            this.a = this.p((Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>>)linkedHashMap);
            final i j = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<Object, Object>();
            for (final q next2 : list2) {
                final kotlin.reflect.jvm.internal.impl.name.e b2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(j).g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.n)next2).W());
                List<q> value2;
                if ((value2 = linkedHashMap2.get(b2)) == null) {
                    value2 = new ArrayList<q>();
                    linkedHashMap2.put(b2, value2);
                }
                value2.add(next2);
            }
            this.b = this.p((Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>>)linkedHashMap2);
            Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]> c;
            if (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().c().g().f()) {
                final i k = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
                final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<q>> linkedHashMap3 = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<q>>();
                for (final q next3 : list3) {
                    final kotlin.reflect.jvm.internal.impl.name.e b3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.i(k).g(), ((kotlin.reflect.jvm.internal.impl.metadata.a.r)next3).Y());
                    List<q> value3;
                    if ((value3 = linkedHashMap3.get(b3)) == null) {
                        value3 = new ArrayList<q>();
                        linkedHashMap3.put(b3, value3);
                    }
                    value3.add(next3);
                }
                c = this.p((Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>>)linkedHashMap3);
            }
            else {
                c = (Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]>)y0.z();
            }
            this.c = c;
            this.d = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().b((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<v0>>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>() {
                @e
                public final Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
                    k0.p((Object)e, "it");
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.this.m(e);
                }
            });
            this.e = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().b((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<q0>>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends q0>>() {
                @e
                public final Collection<q0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
                    k0.p((Object)e, "it");
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.this.n(e);
                }
            });
            this.f = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().i((n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, ? extends a1>)new n6.l<kotlin.reflect.jvm.internal.impl.name.e, a1>() {
                @f
                public final a1 a(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
                    k0.p((Object)e, "it");
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.this.o(e);
                }
            });
            this.g = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                final /* synthetic */ c G;
                final /* synthetic */ i H = c.this.i;
                
                @e
                public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                    return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C((Set)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.k(this.G).keySet(), (Iterable)this.H.v());
                }
            });
            this.h = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().h().g((n6.a<?>)new n6.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                final /* synthetic */ c G;
                final /* synthetic */ i H = c.this.i;
                
                @e
                public final Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
                    return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.C((Set)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.l(this.G).keySet(), (Iterable)this.H.w());
                }
            });
        }
        
        public static final /* synthetic */ Map k(final c c) {
            return c.a;
        }
        
        public static final /* synthetic */ Map l(final c c) {
            return c.b;
        }
        
        private final Collection<v0> m(final kotlin.reflect.jvm.internal.impl.name.e e) {
            final Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]> a = this.a;
            final s<kotlin.reflect.jvm.internal.impl.metadata.a.i> z = kotlin.reflect.jvm.internal.impl.metadata.a.i.Z;
            k0.o((Object)z, "PARSER");
            final i i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final byte[] buf = a.get(e);
            Object v2;
            if (buf == null) {
                v2 = null;
            }
            else {
                v2 = p.V2(p.p((n6.a<?>)new n6.a<Object>() {
                    final /* synthetic */ s<Object> G;
                    final /* synthetic */ ByteArrayInputStream H;
                    final /* synthetic */ i I;
                    
                    @f
                    public final q a() {
                        return this.G.c(this.H, this.I.r().c().j());
                    }
                }));
            }
            Object e2 = v2;
            if (v2 == null) {
                e2 = v.E();
            }
            final ArrayList list = new ArrayList<v0>(((Collection)e2).size());
            for (final kotlin.reflect.jvm.internal.impl.metadata.a.i j : e2) {
                final u f = i.r().f();
                k0.o((Object)j, "it");
                v0 n = f.n(j);
                if (!i.z(n)) {
                    n = null;
                }
                if (n != null) {
                    list.add(n);
                }
            }
            i.m(e, (List<v0>)list);
            return (Collection<v0>)kotlin.reflect.jvm.internal.impl.utils.a.c((ArrayList<Object>)list);
        }
        
        private final Collection<q0> n(final kotlin.reflect.jvm.internal.impl.name.e e) {
            final Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]> b = this.b;
            final s<kotlin.reflect.jvm.internal.impl.metadata.a.n> z = kotlin.reflect.jvm.internal.impl.metadata.a.n.Z;
            k0.o((Object)z, "PARSER");
            final i i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this;
            final byte[] buf = b.get(e);
            Object v2;
            if (buf == null) {
                v2 = null;
            }
            else {
                v2 = p.V2(p.p((n6.a<?>)new n6.a<Object>() {
                    final /* synthetic */ s<Object> G = (s<Object>)z;
                    final /* synthetic */ ByteArrayInputStream H = new ByteArrayInputStream(buf);
                    final /* synthetic */ i I = c.this.i;
                    
                    @f
                    public final q a() {
                        return this.G.c(this.H, this.I.r().c().j());
                    }
                }));
            }
            Object e2 = v2;
            if (v2 == null) {
                e2 = v.E();
            }
            final ArrayList list = new ArrayList<q0>(((Collection)e2).size());
            for (final kotlin.reflect.jvm.internal.impl.metadata.a.n n : e2) {
                final u f = i.r().f();
                k0.o((Object)n, "it");
                final q0 p = f.p(n);
                if (p != null) {
                    list.add(p);
                }
            }
            i.n(e, (List<q0>)list);
            return (Collection<q0>)kotlin.reflect.jvm.internal.impl.utils.a.c((ArrayList<Object>)list);
        }
        
        private final a1 o(final kotlin.reflect.jvm.internal.impl.name.e e) {
            final byte[] buf = this.c.get(e);
            if (buf == null) {
                return null;
            }
            final kotlin.reflect.jvm.internal.impl.metadata.a.r p = kotlin.reflect.jvm.internal.impl.metadata.a.r.p0(new ByteArrayInputStream(buf), kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().c().j());
            if (p == null) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.this.r().f().q(p);
        }
        
        private final Map<kotlin.reflect.jvm.internal.impl.name.e, byte[]> p(final Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) {
            final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, byte[]> linkedHashMap = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, byte[]>(y0.j(map.size()));
            for (final Map.Entry<Object, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> entry : map.entrySet()) {
                final kotlin.reflect.jvm.internal.impl.name.e key = entry.getKey();
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final Iterable iterable = (Iterable)entry.getValue();
                final ArrayList list = new ArrayList<j2>(v.Y(iterable, 10));
                final Iterator<kotlin.reflect.jvm.internal.impl.protobuf.a> iterator2 = iterable.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().j(byteArrayOutputStream);
                    list.add(j2.a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
        
        @e
        @Override
        public Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            if (!this.b().contains(e)) {
                return (Collection<v0>)v.E();
            }
            return (Collection<v0>)((n6.l)this.d).invoke((Object)e);
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
            return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.g, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.j[0]);
        }
        
        @e
        @Override
        public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            if (!this.d().contains(e)) {
                return (Collection<q0>)v.E();
            }
            return (Collection<q0>)((n6.l)this.e).invoke((Object)e);
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
            return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Set<kotlin.reflect.jvm.internal.impl.name.e>>)this.h, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.j[1]);
        }
        
        @Override
        public void e(@e final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @e final d d, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k0.p((Object)collection, "result");
            k0.p((Object)d, "kindFilter");
            k0.p((Object)l, "nameFilter");
            k0.p((Object)b, "location");
            if (d.a(d.c.k())) {
                final Set<kotlin.reflect.jvm.internal.impl.name.e> d2 = this.d();
                final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m>();
                for (final kotlin.reflect.jvm.internal.impl.name.e e : d2) {
                    if (l.invoke((Object)e)) {
                        list.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>)this.c(e, b));
                    }
                }
                final kotlin.reflect.jvm.internal.impl.resolve.g.b g = kotlin.reflect.jvm.internal.impl.resolve.g.b.G;
                k0.o((Object)g, "INSTANCE");
                v.p0((List)list, (Comparator)g);
                collection.addAll(list);
            }
            if (d.a(d.c.e())) {
                final Set<kotlin.reflect.jvm.internal.impl.name.e> b2 = this.b();
                final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m>();
                for (final kotlin.reflect.jvm.internal.impl.name.e e2 : b2) {
                    if (l.invoke((Object)e2)) {
                        list2.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>)this.a(e2, b));
                    }
                }
                final kotlin.reflect.jvm.internal.impl.resolve.g.b g2 = kotlin.reflect.jvm.internal.impl.resolve.g.b.G;
                k0.o((Object)g2, "INSTANCE");
                v.p0((List)list2, (Comparator)g2);
                collection.addAll(list2);
            }
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
            return this.c.keySet();
        }
        
        @f
        @Override
        public a1 g(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
            k0.p((Object)e, "name");
            return (a1)((n6.l)this.f).invoke((Object)e);
        }
    }
}
