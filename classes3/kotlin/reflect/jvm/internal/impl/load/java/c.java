// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.components.d;
import kotlin.jvm.internal.m0;
import java.util.Collection;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.resolve.constants.j;
import n6.p;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.f0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.utils.e;

public final class c
{
    @org.jetbrains.annotations.e
    private final e a;
    @org.jetbrains.annotations.e
    private final h<kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b;
    
    public c(@org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.e final e a) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)a, "javaTypeEnhancementState");
        this.a = a;
        this.b = n.i((n6.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, ? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)new l<kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(this));
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c(final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        final boolean b4 = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e).getAnnotations().B4(kotlin.reflect.jvm.internal.impl.load.java.b.g());
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c = null;
        if (!b4) {
            return null;
        }
        final Iterator<Object> iterator = ((Iterable<Object>)((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e).getAnnotations()).iterator();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c m;
        do {
            m = c;
            if (!iterator.hasNext()) {
                break;
            }
            m = this.m(iterator.next());
        } while (m == null);
        return m;
    }
    
    private final List<kotlin.reflect.jvm.internal.impl.load.java.a> d(final g<?> g, final p<? super j, ? super kotlin.reflect.jvm.internal.impl.load.java.a, Boolean> p2) {
        List<kotlin.reflect.jvm.internal.impl.load.java.a> list2;
        if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            final Iterable<g> iterable = ((g<Iterable<g>>)g).b();
            final ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a> list = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a>();
            final Iterator<g<?>> iterator = iterable.iterator();
            while (true) {
                list2 = list;
                if (!iterator.hasNext()) {
                    break;
                }
                v.q0((Collection)list, (Iterable)this.d(iterator.next(), p2));
            }
        }
        else {
            if (g instanceof j) {
                for (final kotlin.reflect.jvm.internal.impl.load.java.a a : kotlin.reflect.jvm.internal.impl.load.java.a.values()) {
                    if (p2.invoke((Object)g, (Object)a)) {
                        final kotlin.reflect.jvm.internal.impl.load.java.a a2 = a;
                        list2 = (List<kotlin.reflect.jvm.internal.impl.load.java.a>)v.M((Object)a2);
                        return list2;
                    }
                }
                final kotlin.reflect.jvm.internal.impl.load.java.a a2 = null;
                return (List<kotlin.reflect.jvm.internal.impl.load.java.a>)v.M((Object)a2);
            }
            list2 = (List<kotlin.reflect.jvm.internal.impl.load.java.a>)v.E();
        }
        return list2;
    }
    
    private final List<kotlin.reflect.jvm.internal.impl.load.java.a> e(final g<?> g) {
        return this.d(g, (p<? super j, ? super kotlin.reflect.jvm.internal.impl.load.java.a, Boolean>)c$b.G);
    }
    
    private final List<kotlin.reflect.jvm.internal.impl.load.java.a> f(final g<?> g) {
        return this.d(g, (p<? super j, ? super kotlin.reflect.jvm.internal.impl.load.java.a, Boolean>)new p<j, kotlin.reflect.jvm.internal.impl.load.java.a, Boolean>() {
            public final boolean a(@org.jetbrains.annotations.e final j j, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.load.java.a a) {
                k0.p((Object)j, "<this>");
                k0.p((Object)a, "it");
                return c.this.p(a.b()).contains(j.c().g());
            }
        });
    }
    
    private final kotlin.reflect.jvm.internal.impl.utils.h g(final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a0 = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e).getAnnotations().a0(kotlin.reflect.jvm.internal.impl.load.java.b.d());
        final kotlin.reflect.jvm.internal.impl.utils.h h = null;
        g<?> b;
        if (a0 == null) {
            b = null;
        }
        else {
            b = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.b(a0);
        }
        j j;
        if (b instanceof j) {
            j = (j)b;
        }
        else {
            j = null;
        }
        if (j == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.utils.h f = this.a.f();
        if (f == null) {
            final String d = j.c().d();
            final int hashCode = d.hashCode();
            kotlin.reflect.jvm.internal.impl.utils.h h2;
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode != 2656902) {
                        h2 = h;
                    }
                    else if (!d.equals("WARN")) {
                        h2 = h;
                    }
                    else {
                        h2 = kotlin.reflect.jvm.internal.impl.utils.h.J;
                    }
                }
                else if (!d.equals("STRICT")) {
                    h2 = h;
                }
                else {
                    h2 = kotlin.reflect.jvm.internal.impl.utils.h.K;
                }
            }
            else if (!d.equals("IGNORE")) {
                h2 = h;
            }
            else {
                h2 = kotlin.reflect.jvm.internal.impl.utils.h.I;
            }
            return h2;
        }
        return f;
    }
    
    private final kotlin.reflect.jvm.internal.impl.utils.h i(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        if (kotlin.reflect.jvm.internal.impl.load.java.b.c().containsKey(c.f())) {
            return this.a.e();
        }
        return this.j(c);
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c o(final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.K) {
            return null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c)((l)this.b).invoke((Object)e);
    }
    
    private final List<String> p(final String s) {
        final Set<kotlin.reflect.jvm.internal.impl.descriptors.annotations.n> b = d.a.b(s);
        final ArrayList list = new ArrayList<String>(v.Y((Iterable)b, 10));
        final Iterator<Object> iterator = b.iterator();
        while (iterator.hasNext()) {
            list.add(((Enum)iterator.next()).name());
        }
        return (List<String>)list;
    }
    
    @f
    public final a h(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        k0.p((Object)c, "annotationDescriptor");
        final kotlin.reflect.jvm.internal.impl.descriptors.e f = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(c);
        if (f == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)f).getAnnotations();
        final kotlin.reflect.jvm.internal.impl.name.b d = y.d;
        k0.o((Object)d, "TARGET_ANNOTATION");
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a0 = annotations.a0(d);
        if (a0 == null) {
            return null;
        }
        final Map b = a0.b();
        final ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a> list = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a>();
        final Iterator<Map.Entry<K, g>> iterator = b.entrySet().iterator();
        while (iterator.hasNext()) {
            v.q0((Collection)list, (Iterable)this.f(iterator.next().getValue()));
        }
        int n = 0;
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            n |= 1 << iterator2.next().ordinal();
        }
        return new a(c, n);
    }
    
    @org.jetbrains.annotations.e
    public final kotlin.reflect.jvm.internal.impl.utils.h j(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        k0.p((Object)c, "annotationDescriptor");
        kotlin.reflect.jvm.internal.impl.utils.h h;
        if ((h = this.k(c)) == null) {
            h = this.a.d();
        }
        return h;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.utils.h k(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        k0.p((Object)c, "annotationDescriptor");
        final Map<String, kotlin.reflect.jvm.internal.impl.utils.h> g = this.a.g();
        final kotlin.reflect.jvm.internal.impl.name.b f = c.f();
        final kotlin.reflect.jvm.internal.impl.utils.h h = null;
        Object b;
        if (f == null) {
            b = null;
        }
        else {
            b = f.b();
        }
        final kotlin.reflect.jvm.internal.impl.utils.h h2 = g.get(b);
        if (h2 == null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.e f2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(c);
            kotlin.reflect.jvm.internal.impl.utils.h g2;
            if (f2 == null) {
                g2 = h;
            }
            else {
                g2 = this.g(f2);
            }
            return g2;
        }
        return h2;
    }
    
    @f
    public final s l(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        k0.p((Object)c, "annotationDescriptor");
        final boolean a = this.a.a();
        final s s = null;
        if (a) {
            return null;
        }
        final s s2 = kotlin.reflect.jvm.internal.impl.load.java.b.a().get(c.f());
        s b;
        if (s2 == null) {
            b = s;
        }
        else {
            kotlin.reflect.jvm.internal.impl.utils.h i = this.i(c);
            if (i == kotlin.reflect.jvm.internal.impl.utils.h.I) {
                i = null;
            }
            if (i == null) {
                return null;
            }
            b = kotlin.reflect.jvm.internal.impl.load.java.s.b(s2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(s2.e(), null, i.f(), 1, null), null, false, 6, null);
        }
        return b;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c m(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        k0.p((Object)c, "annotationDescriptor");
        if (this.a.b()) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e f = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(c);
        if (f == null) {
            return null;
        }
        if (kotlin.reflect.jvm.internal.impl.load.java.d.a(f)) {
            return c;
        }
        return this.o(f);
    }
    
    @f
    public final a n(@org.jetbrains.annotations.e kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a0) {
        k0.p((Object)a0, "annotationDescriptor");
        if (this.a.b()) {
            return null;
        }
        Object f = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(a0);
        if (f == null || !((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)f).getAnnotations().B4(kotlin.reflect.jvm.internal.impl.load.java.b.e())) {
            f = null;
        }
        if (f == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e f2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(a0);
        k0.m((Object)f2);
        a0 = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)f2).getAnnotations().a0(kotlin.reflect.jvm.internal.impl.load.java.b.e());
        k0.m((Object)a0);
        final Map b = a0.b();
        final ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a> list = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a>();
        for (final Map.Entry<kotlin.reflect.jvm.internal.impl.name.e, V> entry : b.entrySet()) {
            final kotlin.reflect.jvm.internal.impl.name.e e = entry.getKey();
            final g g = (g)entry.getValue();
            List<kotlin.reflect.jvm.internal.impl.load.java.a> list2;
            if (k0.g((Object)e, (Object)y.c)) {
                list2 = this.e(g);
            }
            else {
                list2 = (List<kotlin.reflect.jvm.internal.impl.load.java.a>)v.E();
            }
            v.q0((Collection)list, (Iterable)list2);
        }
        final Iterator<Object> iterator2 = list.iterator();
        int n = 0;
        while (iterator2.hasNext()) {
            n |= 1 << iterator2.next().ordinal();
        }
        while (true) {
            for (final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c next : ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)f).getAnnotations()) {
                if (this.m(next) != null) {
                    a0 = next;
                    if (a0 == null) {
                        return null;
                    }
                    return new a(a0, n);
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c next = null;
            continue;
        }
    }
    
    public static final class a
    {
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a;
        private final int b;
        
        public a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a, final int b) {
            k0.p((Object)a, "typeQualifier");
            this.a = a;
            this.b = b;
        }
        
        private final boolean c(final kotlin.reflect.jvm.internal.impl.load.java.a a) {
            final int b = this.b;
            final int ordinal = a.ordinal();
            boolean b2 = true;
            if ((1 << ordinal & b) == 0x0) {
                b2 = false;
            }
            return b2;
        }
        
        private final boolean d(final kotlin.reflect.jvm.internal.impl.load.java.a a) {
            final boolean c = this.c(a);
            boolean b = true;
            if (c) {
                return true;
            }
            if (!this.c(a.K) || a == a.L) {
                b = false;
            }
            return b;
        }
        
        @org.jetbrains.annotations.e
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final List<kotlin.reflect.jvm.internal.impl.load.java.a> b() {
            final kotlin.reflect.jvm.internal.impl.load.java.a[] values = kotlin.reflect.jvm.internal.impl.load.java.a.values();
            final ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a> list = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.a>();
            for (final kotlin.reflect.jvm.internal.impl.load.java.a a : values) {
                if (this.d(a)) {
                    list.add(a);
                }
            }
            return list;
        }
    }
}
