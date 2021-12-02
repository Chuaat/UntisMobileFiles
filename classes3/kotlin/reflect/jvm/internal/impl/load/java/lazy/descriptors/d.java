// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.collections.v;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.storage.m;
import java.util.Iterator;
import java.util.Collection;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.u;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

public final class d implements h
{
    static final /* synthetic */ o<Object>[] f;
    @e
    private final g b;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h c;
    @e
    private final i d;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i e;
    
    static {
        f = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")) };
    }
    
    public d(@e final g b, @e final u u, @e final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h c) {
        k0.p((Object)b, "c");
        k0.p((Object)u, "jPackage");
        k0.p((Object)c, "packageFragment");
        this.b = b;
        this.c = c;
        this.d = new i(b, u, c);
        this.e = b.e().g((n6.a<?>)new n6.a<h[]>() {
            final /* synthetic */ d G;
            
            @e
            public final h[] a() {
                final Collection<kotlin.reflect.jvm.internal.impl.load.kotlin.o> values = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.j(this.G).N0().values();
                final d g = this.G;
                final ArrayList<h> list = new ArrayList<h>();
                final Iterator<Object> iterator = values.iterator();
                while (iterator.hasNext()) {
                    final h d = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.i(g).a().b().d((h0)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.j(g), iterator.next());
                    if (d != null) {
                        list.add(d);
                    }
                }
                final h[] array = x6.a.b(list).toArray(new h[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return array;
            }
        });
    }
    
    public static final /* synthetic */ g i(final d d) {
        return d.b;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h j(final d d) {
        return d.c;
    }
    
    private final h[] l() {
        return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends h[]>)this.e, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.f[0]);
    }
    
    @e
    @Override
    public Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.h(e, b);
        final i d = this.d;
        final h[] l = this.l();
        Object o = d.a(e, b);
        h h;
        for (int length = l.length, i = 0; i < length; ++i, o = x6.a.a((Collection<?>)o, (Collection<?>)h.a(e, b))) {
            h = l[i];
        }
        Collection<? extends T> k;
        if ((k = (Collection<? extends T>)o) == null) {
            k = (Collection<? extends T>)j1.k();
        }
        return (Collection<v0>)k;
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
        final h[] l = this.l();
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        for (int length = l.length, i = 0; i < length; ++i) {
            v.q0((Collection)set, (Iterable)l[i].b());
        }
        set.addAll((Collection<?>)this.k().b());
        return set;
    }
    
    @e
    @Override
    public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.h(e, b);
        final i d = this.d;
        final h[] l = this.l();
        Object o = d.c(e, b);
        h h;
        for (int length = l.length, i = 0; i < length; ++i, o = x6.a.a((Collection<?>)o, (Collection<?>)h.c(e, b))) {
            h = l[i];
        }
        Collection<? extends T> k;
        if ((k = (Collection<? extends T>)o) == null) {
            k = (Collection<? extends T>)j1.k();
        }
        return (Collection<q0>)k;
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        final h[] l = this.l();
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        for (int length = l.length, i = 0; i < length; ++i) {
            v.q0((Collection)set, (Iterable)l[i].d());
        }
        set.addAll((Collection<?>)this.k().d());
        return set;
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> e(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        final i d2 = this.d;
        final h[] i = this.l();
        Object o = d2.e(d, l);
        h h;
        for (int length = i.length, j = 0; j < length; ++j, o = x6.a.a((Collection<?>)o, (Collection<?>)h.e(d, l))) {
            h = i[j];
        }
        Collection<? extends T> k;
        if ((k = (Collection<? extends T>)o) == null) {
            k = (Collection<? extends T>)j1.k();
        }
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>)k;
    }
    
    @f
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
        Set<kotlin.reflect.jvm.internal.impl.name.e> a = j.a(kotlin.collections.m.Y4((Object[])this.l()));
        if (a == null) {
            a = null;
        }
        else {
            a.addAll(this.k().f());
        }
        return a;
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.h(e, b);
        final kotlin.reflect.jvm.internal.impl.descriptors.e q = this.d.Q(e, b);
        if (q != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.h)q;
        }
        final h[] l = this.l();
        kotlin.reflect.jvm.internal.impl.descriptors.i i = null;
        int n = 0;
        final int length = l.length;
        Object g;
        while (true) {
            g = i;
            if (n >= length) {
                break;
            }
            final h h = l[n];
            final int n2 = n + 1;
            g = h.g(e, b);
            n = n2;
            if (g == null) {
                continue;
            }
            if (!(g instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) || !((a0)g).Q()) {
                break;
            }
            n = n2;
            if (i != null) {
                continue;
            }
            i = (kotlin.reflect.jvm.internal.impl.descriptors.i)g;
            n = n2;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.h)g;
    }
    
    @Override
    public void h(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        r6.a.b(this.b.a().k(), b, (h0)this.c, e);
    }
    
    @e
    public final i k() {
        return this.d;
    }
}
