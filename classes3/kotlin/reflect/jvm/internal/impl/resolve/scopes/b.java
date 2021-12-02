// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.v;
import kotlin.collections.j1;
import x6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.Collection;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public final class b implements h
{
    @e
    public static final a d;
    @e
    private final String b;
    @e
    private final h[] c;
    
    static {
        d = new a(null);
    }
    
    private b(final String b, final h[] c) {
        this.b = b;
        this.c = c;
    }
    
    public static final /* synthetic */ h[] i(final b b) {
        return b.c;
    }
    
    @e
    @Override
    public Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final h[] c = this.c;
        final int length = c.length;
        Object o;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Object a;
                h h;
                for (a = null; i < c.length; ++i, a = x6.a.a((Collection<?>)a, (Collection<?>)h.a(e, b))) {
                    h = c[i];
                }
                if ((o = a) == null) {
                    o = j1.k();
                }
            }
            else {
                o = c[0].a(e, b);
            }
        }
        else {
            o = v.E();
        }
        return (Collection<v0>)o;
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
        final h[] c = this.c;
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        for (int length = c.length, i = 0; i < length; ++i) {
            v.q0((Collection)set, (Iterable)c[i].b());
        }
        return set;
    }
    
    @e
    @Override
    public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final h[] c = this.c;
        final int length = c.length;
        Object o;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Object a;
                h h;
                for (a = null; i < c.length; ++i, a = x6.a.a((Collection<?>)a, (Collection<?>)h.c(e, b))) {
                    h = c[i];
                }
                if ((o = a) == null) {
                    o = j1.k();
                }
            }
            else {
                o = c[0].c(e, b);
            }
        }
        else {
            o = v.E();
        }
        return (Collection<q0>)o;
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        final h[] c = this.c;
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        for (int length = c.length, i = 0; i < length; ++i) {
            v.q0((Collection)set, (Iterable)c[i].d());
        }
        return set;
    }
    
    @e
    @Override
    public Collection<m> e(@e final d d, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        final h[] c = this.c;
        final int length = c.length;
        Object o;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Object a;
                h h;
                for (a = null; i < c.length; ++i, a = x6.a.a((Collection<?>)a, (Collection<?>)h.e(d, l))) {
                    h = c[i];
                }
                if ((o = a) == null) {
                    o = j1.k();
                }
            }
            else {
                o = c[0].e(d, l);
            }
        }
        else {
            o = v.E();
        }
        return (Collection<m>)o;
    }
    
    @f
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
        return j.a(kotlin.collections.m.Y4((Object[])this.c));
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final h[] c = this.c;
        final int length = c.length;
        i i = null;
        int n = 0;
        Object g;
        while (true) {
            g = i;
            if (n >= length) {
                break;
            }
            final h h = c[n];
            final int n2 = n + 1;
            g = h.g(e, b);
            n = n2;
            if (g == null) {
                continue;
            }
            if (!(g instanceof i) || !((a0)g).Q()) {
                break;
            }
            n = n2;
            if (i != null) {
                continue;
            }
            i = (i)g;
            n = n2;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.h)g;
    }
    
    @Override
    public void h(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final h[] c = this.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            c[i].h(e, b);
        }
    }
    
    @e
    @Override
    public String toString() {
        return this.b;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final h a(@e final String s, @e final Iterable<? extends h> iterable) {
            k0.p((Object)s, "debugName");
            k0.p((Object)iterable, "scopes");
            final kotlin.reflect.jvm.internal.impl.utils.i<b> i = new kotlin.reflect.jvm.internal.impl.utils.i<b>();
            for (final h h : iterable) {
                if (h == h.c.b) {
                    continue;
                }
                if (h instanceof b) {
                    v.s0((Collection)i, (Object[])kotlin.reflect.jvm.internal.impl.resolve.scopes.b.i((b)h));
                }
                else {
                    i.add((b)h);
                }
            }
            return this.b(s, i);
        }
        
        @e
        public final h b(@e final String s, @e final List<? extends h> list) {
            k0.p((Object)s, "debugName");
            k0.p((Object)list, "scopes");
            final int size = list.size();
            h b;
            if (size != 0) {
                if (size != 1) {
                    final h[] array = list.toArray(new h[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    b = new b(s, array, null);
                }
                else {
                    b = list.get(0);
                }
            }
            else {
                b = h.c.b;
            }
            return b;
        }
    }
}
