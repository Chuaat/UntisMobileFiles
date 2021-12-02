// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.LinkedHashSet;
import java.util.HashSet;
import kotlin.collections.j1;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.c0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.load.java.q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.h0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.storage.j;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.u;

public final class i extends l
{
    @e
    private final u n;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h o;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.j<Set<String>> p;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.h<a, kotlin.reflect.jvm.internal.impl.descriptors.e> q;
    
    public i(@e final g g, @e final u n, @e final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h o) {
        k0.p((Object)g, "c");
        k0.p((Object)n, "jPackage");
        k0.p((Object)o, "ownerDescriptor");
        super(g);
        this.n = n;
        this.o = o;
        this.p = g.e().e((n6.a<? extends Set<String>>)new n6.a<Set<? extends String>>() {
            final /* synthetic */ i H;
            
            @f
            public final Set<String> a() {
                return g.a().d().c(this.H.R().f());
            }
        });
        this.q = g.e().i((n6.l<? super a, ? extends kotlin.reflect.jvm.internal.impl.descriptors.e>)new n6.l<a, kotlin.reflect.jvm.internal.impl.descriptors.e>() {
            final /* synthetic */ i G;
            
            @f
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final i.a a) {
                k0.p((Object)a, "request");
                final kotlin.reflect.jvm.internal.impl.name.a obj = new kotlin.reflect.jvm.internal.impl.name.a(this.G.R().f(), a.b());
                m.a a2;
                if (a.a() != null) {
                    a2 = g.a().i().a(a.a());
                }
                else {
                    a2 = g.a().i().c(obj);
                }
                final d d = null;
                o a3;
                if (a2 == null) {
                    a3 = null;
                }
                else {
                    a3 = a2.a();
                }
                kotlin.reflect.jvm.internal.impl.name.a c;
                if (a3 == null) {
                    c = null;
                }
                else {
                    c = a3.c();
                }
                if (c != null && (c.l() || c.k())) {
                    return null;
                }
                final i.b n = i.this.S(a3);
                Object a4;
                if (n instanceof i.b.a) {
                    a4 = ((i.b.a)n).a();
                }
                else if (n instanceof c) {
                    a4 = d;
                }
                else {
                    if (!(n instanceof i.b.b)) {
                        throw new h0();
                    }
                    kotlin.reflect.jvm.internal.impl.load.java.structure.g obj2;
                    if ((obj2 = a.a()) == null) {
                        final q d2 = g.a().d();
                        byte[] b = null;
                        Label_0251: {
                            if (a2 != null) {
                                m.a a5 = a2;
                                if (!(a2 instanceof m.a.a)) {
                                    a5 = null;
                                }
                                final m.a.a a6 = (m.a.a)a5;
                                if (a6 != null) {
                                    b = a6.b();
                                    break Label_0251;
                                }
                            }
                            b = null;
                        }
                        obj2 = d2.a(new q.a(obj, b, null, 4, null));
                    }
                    c0 h;
                    if (obj2 == null) {
                        h = null;
                    }
                    else {
                        h = obj2.H();
                    }
                    if (h == c0.H) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                        sb.append(obj2);
                        sb.append("\nClassId: ");
                        sb.append(obj);
                        sb.append("\nfindKotlinClass(JavaClass) = ");
                        sb.append(kotlin.reflect.jvm.internal.impl.load.kotlin.n.a(g.a().i(), obj2));
                        sb.append("\nfindKotlinClass(ClassId) = ");
                        sb.append(kotlin.reflect.jvm.internal.impl.load.kotlin.n.b(g.a().i(), obj));
                        sb.append('\n');
                        throw new IllegalStateException(sb.toString());
                    }
                    b f;
                    if (obj2 == null) {
                        f = null;
                    }
                    else {
                        f = obj2.f();
                    }
                    a4 = d;
                    if (f != null) {
                        a4 = d;
                        if (!f.d()) {
                            if (!k0.g((Object)f.e(), (Object)this.G.R().f())) {
                                a4 = d;
                            }
                            else {
                                a4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f(g, (kotlin.reflect.jvm.internal.impl.descriptors.m)this.G.R(), obj2, null, 8, null);
                                g.a().e().a((d)a4);
                            }
                        }
                    }
                }
                return (kotlin.reflect.jvm.internal.impl.descriptors.e)a4;
            }
        });
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e O(final kotlin.reflect.jvm.internal.impl.name.e e, final kotlin.reflect.jvm.internal.impl.load.java.structure.g g) {
        if (!kotlin.reflect.jvm.internal.impl.name.g.b(e)) {
            return null;
        }
        final Set set = (Set)((n6.a)this.p).invoke();
        if (g == null && set != null && !set.contains(e.d())) {
            return null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.e)((n6.l)this.q).invoke((Object)new a(e, g));
    }
    
    private final b S(final o o) {
        if (o != null) {
            if (o.a().c() != kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.K) {
                return c.a;
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e m = this.x().a().b().m(o);
            if (m != null) {
                return new b.a(m);
            }
        }
        return b.b.a;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.e P(@e final kotlin.reflect.jvm.internal.impl.load.java.structure.g g) {
        k0.p((Object)g, "javaClass");
        return this.O(g.getName(), g);
    }
    
    @f
    public kotlin.reflect.jvm.internal.impl.descriptors.e Q(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return this.O(e, null);
    }
    
    @e
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h R() {
        return this.o;
    }
    
    @e
    @Override
    public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return (Collection<q0>)v.E();
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> e(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.d.a c = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c;
        List<kotlin.reflect.jvm.internal.impl.descriptors.m> e;
        if (!d.a(c.f() | c.d())) {
            e = (List<kotlin.reflect.jvm.internal.impl.descriptors.m>)v.E();
        }
        else {
            final Iterable iterable = (Iterable)((n6.a)this.w()).invoke();
            e = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m>();
            for (final kotlin.reflect.jvm.internal.impl.descriptors.m next : iterable) {
                final kotlin.reflect.jvm.internal.impl.descriptors.m m = next;
                boolean b = false;
                Label_0148: {
                    if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)m).getName();
                        k0.o((Object)name, "it.name");
                        if (l.invoke((Object)name)) {
                            b = true;
                            break Label_0148;
                        }
                    }
                    b = false;
                }
                if (b) {
                    e.add(next);
                }
            }
        }
        return e;
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> m(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        if (!d.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c.f())) {
            return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
        }
        final Set set = (Set)((n6.a)this.p).invoke();
        if (set != null) {
            final HashSet<kotlin.reflect.jvm.internal.impl.name.e> set2 = new HashSet<kotlin.reflect.jvm.internal.impl.name.e>();
            final Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                set2.add(kotlin.reflect.jvm.internal.impl.name.e.i(iterator.next()));
            }
            return set2;
        }
        final u n = this.n;
        n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> a;
        if ((a = l) == null) {
            a = kotlin.reflect.jvm.internal.impl.utils.d.a();
        }
        final Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.g> g = n.g(a);
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set3 = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        for (final kotlin.reflect.jvm.internal.impl.load.java.structure.g g2 : g) {
            kotlin.reflect.jvm.internal.impl.name.e name;
            if (g2.H() == c0.G) {
                name = null;
            }
            else {
                name = g2.getName();
            }
            if (name != null) {
                set3.add(name);
            }
        }
        return set3;
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> o(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
    }
    
    @e
    @Override
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b q() {
        return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b.a.a;
    }
    
    @Override
    protected void s(@e final Collection<v0> collection, @e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)collection, "result");
        k0.p((Object)e, "name");
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> u(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
    }
    
    private static final class a
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.name.e a;
        @f
        private final kotlin.reflect.jvm.internal.impl.load.java.structure.g b;
        
        public a(@e final kotlin.reflect.jvm.internal.impl.name.e a, @f final kotlin.reflect.jvm.internal.impl.load.java.structure.g b) {
            k0.p((Object)a, "name");
            this.a = a;
            this.b = b;
        }
        
        @f
        public final kotlin.reflect.jvm.internal.impl.load.java.structure.g a() {
            return this.b;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.e b() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return o instanceof a && k0.g((Object)this.a, (Object)((a)o).a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
    
    private abstract static class b
    {
        public static final class a extends i.b
        {
            @e
            private final kotlin.reflect.jvm.internal.impl.descriptors.e a;
            
            public a(@e final kotlin.reflect.jvm.internal.impl.descriptors.e a) {
                k0.p((Object)a, "descriptor");
                super(null);
                this.a = a;
            }
            
            @e
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a() {
                return this.a;
            }
        }
        
        public static final class b extends i.b
        {
            @e
            public static final b a;
            
            static {
                a = new b();
            }
            
            private b() {
                super(null);
            }
        }
        
        public static final class c extends i.b
        {
            @e
            public static final c a;
            
            static {
                a = new c();
            }
            
            private c() {
                super(null);
            }
        }
    }
}
