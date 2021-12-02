// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m0;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.incremental.components.d;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.collections.v;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.Set;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;

public final class k extends l
{
    @e
    private final g n;
    @e
    private final f o;
    
    public k(@e final kotlin.reflect.jvm.internal.impl.load.java.lazy.g g, @e final g n, @e final f o) {
        k0.p((Object)g, "c");
        k0.p((Object)n, "jClass");
        k0.p((Object)o, "ownerDescriptor");
        super(g);
        this.n = n;
        this.o = o;
    }
    
    private final <R> Set<R> O(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final Set<R> set, final n6.l<? super h, ? extends Collection<? extends R>> l) {
        kotlin.reflect.jvm.internal.impl.utils.b.b(v.k((Object)e), (kotlin.reflect.jvm.internal.impl.utils.b.d<Object>)k$d.a, (kotlin.reflect.jvm.internal.impl.utils.b.e<Object, Object>)new kotlin.reflect.jvm.internal.impl.utils.b.b<kotlin.reflect.jvm.internal.impl.descriptors.e, j2>() {
            public boolean d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
                k0.p((Object)e, "current");
                if (e == e) {
                    return true;
                }
                final h v = e.V();
                k0.o((Object)v, "current.staticScope");
                if (v instanceof l) {
                    set.addAll((Collection<? extends R>)l.invoke((Object)v));
                    return false;
                }
                return true;
            }
            
            public void e() {
            }
        });
        return set;
    }
    
    private final q0 Q(final q0 q0) {
        if (((kotlin.reflect.jvm.internal.impl.descriptors.b)q0).n().b()) {
            return q0;
        }
        final Collection g = q0.g();
        k0.o((Object)g, "this.overriddenDescriptors");
        final ArrayList list = new ArrayList<q0>(v.Y((Iterable)g, 10));
        for (final q0 q2 : g) {
            k0.o((Object)q2, "it");
            list.add(this.Q(q2));
        }
        return (q0)v.U4(v.N1((Iterable)list));
    }
    
    private final Set<v0> R(final kotlin.reflect.jvm.internal.impl.name.e e, final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
        final k c = kotlin.reflect.jvm.internal.impl.load.java.descriptors.k.c(e2);
        if (c == null) {
            return (Set<v0>)j1.k();
        }
        return (Set<v0>)v.N5((Iterable)c.a(e, kotlin.reflect.jvm.internal.impl.incremental.components.d.U));
    }
    
    @e
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a N() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a(this.n, (n6.l<? super q, Boolean>)k$a.G);
    }
    
    @e
    protected f P() {
        return this.o;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return null;
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> m(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @org.jetbrains.annotations.f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> o(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @org.jetbrains.annotations.f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        final Set m5 = v.M5((Iterable)((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).a());
        final k c = kotlin.reflect.jvm.internal.impl.load.java.descriptors.k.c((kotlin.reflect.jvm.internal.impl.descriptors.e)this.P());
        Set<? extends kotlin.reflect.jvm.internal.impl.name.e> set;
        if (c == null) {
            set = null;
        }
        else {
            set = c.b();
        }
        if (set == null) {
            set = (Set<? extends kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
        }
        m5.addAll(set);
        if (this.n.A()) {
            m5.addAll(v.L((Object[])new kotlin.reflect.jvm.internal.impl.name.e[] { StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES }));
        }
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)m5;
    }
    
    @Override
    protected void s(@e final Collection<v0> collection, @e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)collection, "result");
        k0.p((Object)e, "name");
        final Collection<v0> e2 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(e, this.R(e, (kotlin.reflect.jvm.internal.impl.descriptors.e)this.P()), collection, (kotlin.reflect.jvm.internal.impl.descriptors.e)this.P(), this.x().a().c(), this.x().a().j().a());
        k0.o((Object)e2, "resolveOverridesForStaticMembers(\n            name,\n            functionsFromSupertypes,\n            result,\n            ownerDescriptor,\n            c.components.errorReporter,\n            c.components.kotlinTypeChecker.overridingUtil\n        )");
        collection.addAll(e2);
        if (this.n.A()) {
            v0 v0;
            String s;
            if (k0.g((Object)e, (Object)StandardNames.ENUM_VALUE_OF)) {
                v0 = kotlin.reflect.jvm.internal.impl.resolve.c.d((kotlin.reflect.jvm.internal.impl.descriptors.e)this.P());
                s = "createEnumValueOfMethod(ownerDescriptor)";
            }
            else {
                if (!k0.g((Object)e, (Object)StandardNames.ENUM_VALUES)) {
                    return;
                }
                v0 = kotlin.reflect.jvm.internal.impl.resolve.c.e((kotlin.reflect.jvm.internal.impl.descriptors.e)this.P());
                s = "createEnumValuesMethod(ownerDescriptor)";
            }
            k0.o((Object)v0, s);
            collection.add(v0);
        }
    }
    
    @Override
    protected void t(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final Collection<q0> collection) {
        k0.p((Object)e, "name");
        k0.p((Object)collection, "result");
        final Set<D> o = this.O((kotlin.reflect.jvm.internal.impl.descriptors.e)this.P(), (Set<D>)new LinkedHashSet<Object>(), (n6.l<? super h, ? extends Collection<? extends D>>)new n6.l<h, Collection<? extends q0>>() {
            @e
            public final Collection<? extends q0> a(@e final h h) {
                k0.p((Object)h, "it");
                return h.c(e, kotlin.reflect.jvm.internal.impl.incremental.components.d.U);
            }
        });
        if (collection.isEmpty() ^ true) {
            final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> e2 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(e, (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)o, (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)collection, (kotlin.reflect.jvm.internal.impl.descriptors.e)this.P(), this.x().a().c(), this.x().a().j().a());
            k0.o((Object)e2, "resolveOverridesForStaticMembers(\n                    name,\n                    propertiesFromSupertypes,\n                    result,\n                    ownerDescriptor,\n                    c.components.errorReporter,\n                    c.components.kotlinTypeChecker.overridingUtil\n                )");
            collection.addAll((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)e2);
        }
        else {
            final LinkedHashMap<q0, Collection<D>> linkedHashMap = (LinkedHashMap<q0, Collection<D>>)new LinkedHashMap<Object, List<Object>>();
            for (final q0 next : o) {
                final q0 q = this.Q(next);
                List<Object> value;
                if ((value = linkedHashMap.get(q)) == null) {
                    value = new ArrayList<Object>();
                    linkedHashMap.put(q, value);
                }
                value.add(next);
            }
            final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>();
            final Iterator<Map.Entry<q0, List<Object>>> iterator2 = linkedHashMap.entrySet().iterator();
            while (iterator2.hasNext()) {
                final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> e3 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(e, (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)iterator2.next().getValue(), (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)collection, (kotlin.reflect.jvm.internal.impl.descriptors.e)this.P(), this.x().a().c(), this.x().a().j().a());
                k0.o((Object)e3, "resolveOverridesForStaticMembers(\n                    name, it.value, result, ownerDescriptor, c.components.errorReporter,\n                    c.components.kotlinTypeChecker.overridingUtil\n                )");
                v.q0((Collection)list, (Iterable)e3);
            }
            collection.addAll((Collection<? extends D>)list);
        }
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> u(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @org.jetbrains.annotations.f final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        final Set m5 = v.M5((Iterable)((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b)((n6.a)this.z()).invoke()).e());
        this.O((kotlin.reflect.jvm.internal.impl.descriptors.e)this.P(), (Set<Object>)m5, (n6.l<? super h, ? extends Collection<?>>)k$c.G);
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)m5;
    }
}
