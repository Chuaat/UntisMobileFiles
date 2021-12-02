// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import org.jetbrains.annotations.f;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ranges.o;
import kotlin.collections.y0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.sequences.m;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.p;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.structure.r;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;

public class a implements b
{
    @e
    private final g a;
    @e
    private final l<q, Boolean> b;
    @e
    private final l<r, Boolean> c;
    @e
    private final Map<kotlin.reflect.jvm.internal.impl.name.e, List<r>> d;
    @e
    private final Map<kotlin.reflect.jvm.internal.impl.name.e, n> e;
    @e
    private final Map<kotlin.reflect.jvm.internal.impl.name.e, w> f;
    
    public a(@e final g a, @e final l<? super q, Boolean> b) {
        k0.p((Object)a, "jClass");
        k0.p((Object)b, "memberFilter");
        this.a = a;
        this.b = (l<q, Boolean>)b;
        final l<r, Boolean> c = (l<r, Boolean>)new l<r, Boolean>() {
            final /* synthetic */ a G;
            
            public final boolean a(@e final r r) {
                k0.p((Object)r, "m");
                return (boolean)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a.g(this.G).invoke((Object)r) && !p.c(r);
            }
        };
        this.c = (l<r, Boolean>)c;
        final m<Object> i0 = kotlin.sequences.p.i0((m<?>)v.n1((Iterable)a.L()), (n6.l<? super Object, Boolean>)c);
        final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<r>> d = (LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<r>>)new LinkedHashMap<Object, List<r>>();
        for (final r next : i0) {
            final kotlin.reflect.jvm.internal.impl.name.e name = next.getName();
            List<r> value;
            if ((value = d.get(name)) == null) {
                value = new ArrayList<r>();
                d.put(name, value);
            }
            value.add(next);
        }
        this.d = d;
        final m<n> i2 = kotlin.sequences.p.i0((m<? extends n>)v.n1((Iterable)this.a.C()), (n6.l<? super n, Boolean>)this.b);
        final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, n> e = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, n>();
        for (final n next2 : i2) {
            e.put(next2.getName(), next2);
        }
        this.e = e;
        final Collection<w> h = this.a.h();
        final l<q, Boolean> b2 = this.b;
        final ArrayList<w> list = new ArrayList<w>();
        for (final w next3 : h) {
            if (b2.invoke((Object)next3)) {
                list.add(next3);
            }
        }
        final LinkedHashMap f = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, w>(o.n(y0.j(v.Y((Iterable)list, 10)), 16));
        for (final w next4 : list) {
            f.put(next4.getName(), next4);
        }
        this.f = (Map<kotlin.reflect.jvm.internal.impl.name.e, w>)f;
    }
    
    public static final /* synthetic */ l g(final a a) {
        return a.b;
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> a() {
        final m<t> i0 = kotlin.sequences.p.i0((m<? extends t>)v.n1((Iterable)this.a.L()), (n6.l<? super t, Boolean>)this.c);
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        final Iterator<t> iterator = i0.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().getName());
        }
        return set;
    }
    
    @f
    @Override
    public w b(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        return this.f.get(e);
    }
    
    @f
    @Override
    public n c(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        return this.e.get(e);
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        return this.f.keySet();
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> e() {
        final m<t> i0 = kotlin.sequences.p.i0((m<? extends t>)v.n1((Iterable)this.a.C()), (n6.l<? super t, Boolean>)this.b);
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        final Iterator<t> iterator = i0.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().getName());
        }
        return set;
    }
    
    @e
    @Override
    public Collection<r> f(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        List<r> e2;
        if ((e2 = this.d.get(e)) == null) {
            e2 = (List<r>)v.E();
        }
        return e2;
    }
}
