// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.Iterator;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.resolve.j;
import java.util.Map;
import java.util.LinkedHashMap;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.List;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.o;

public abstract class e extends i
{
    static final /* synthetic */ o<Object>[] d;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.descriptors.e b;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i c;
    
    static {
        d = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;")) };
    }
    
    public e(@org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e b) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)b, "containingClass");
        this.b = b;
        this.c = n.g((n6.a<?>)new n6.a<List<? extends m>>() {
            final /* synthetic */ e G;
            
            @org.jetbrains.annotations.e
            public final List<m> a() {
                final List<y> j = this.G.j();
                return (List<m>)v.q4((Collection)j, (Iterable)e.this.k(j));
            }
        });
    }
    
    private final List<m> k(final List<? extends y> list) {
        final ArrayList<m> list2 = new ArrayList<m>(3);
        final Collection<c0> k = ((kotlin.reflect.jvm.internal.impl.descriptors.h)this.b).l().k();
        k0.o((Object)k, "containingClass.typeConstructor.supertypes");
        final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b> list3 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>();
        final Iterator<Object> iterator = k.iterator();
        while (iterator.hasNext()) {
            v.q0((Collection)list3, (Iterable)kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a.a(iterator.next().x(), null, null, 3, null));
        }
        final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b> list4 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>();
        for (final kotlin.reflect.jvm.internal.impl.descriptors.b next : list3) {
            if (next instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                list4.add(next);
            }
        }
        final LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        for (final kotlin.reflect.jvm.internal.impl.descriptors.b next2 : list4) {
            final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)next2).getName();
            List<kotlin.reflect.jvm.internal.impl.descriptors.b> value;
            if ((value = linkedHashMap.get(name)) == null) {
                value = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>();
                linkedHashMap.put(name, value);
            }
            value.add(next2);
        }
        for (final Map.Entry<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.descriptors.b>> entry : linkedHashMap.entrySet()) {
            final kotlin.reflect.jvm.internal.impl.name.e e = entry.getKey();
            final List<kotlin.reflect.jvm.internal.impl.descriptors.b> list5 = entry.getValue();
            final LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<Object, Object>();
            for (final Object next3 : list5) {
                final Boolean value2 = ((kotlin.reflect.jvm.internal.impl.descriptors.b)next3) instanceof y;
                List<Object> value3;
                if ((value3 = linkedHashMap2.get(value2)) == null) {
                    value3 = new ArrayList<Object>();
                    linkedHashMap2.put(value2, value3);
                }
                value3.add(next3);
            }
            for (final Map.Entry<Boolean, List<Object>> entry2 : linkedHashMap2.entrySet()) {
                final boolean booleanValue = entry2.getKey();
                final List<Object> list6 = entry2.getValue();
                final j d = j.d;
                List<kotlin.reflect.jvm.internal.impl.descriptors.b> e2;
                if (booleanValue) {
                    final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b> list7 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b>();
                    final Iterator<y> iterator7 = list.iterator();
                    while (true) {
                        e2 = list7;
                        if (!iterator7.hasNext()) {
                            break;
                        }
                        final y next4 = iterator7.next();
                        if (!k0.g((Object)((f0)next4).getName(), (Object)e)) {
                            continue;
                        }
                        list7.add((kotlin.reflect.jvm.internal.impl.descriptors.b)next4);
                    }
                }
                else {
                    e2 = (List<kotlin.reflect.jvm.internal.impl.descriptors.b>)v.E();
                }
                d.y(e, (Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)list6, e2, this.b, new kotlin.reflect.jvm.internal.impl.resolve.h() {
                    final /* synthetic */ e b;
                    
                    @Override
                    public void a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b e) {
                        k0.p((Object)e, "fakeOverride");
                        j.N(e, null);
                        list2.add((m)e);
                    }
                    
                    @Override
                    protected void e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b obj, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b obj2) {
                        k0.p((Object)obj, "fromSuper");
                        k0.p((Object)obj2, "fromCurrent");
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Conflict in scope of ");
                        sb.append(this.b.m());
                        sb.append(": ");
                        sb.append(obj);
                        sb.append(" vs ");
                        sb.append(obj2);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                });
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(list2);
    }
    
    private final List<m> l() {
        return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends List<m>>)this.c, (Object)this, (o<?>)e.d[0]);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<v0> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final List<m> l = this.l();
        final kotlin.reflect.jvm.internal.impl.utils.i<v0> i = new kotlin.reflect.jvm.internal.impl.utils.i<v0>();
        for (final v0 next : l) {
            if (next instanceof v0 && k0.g((Object)((f0)next).getName(), (Object)e)) {
                i.add(next);
            }
        }
        return i;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<q0> c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final List<m> l = this.l();
        final kotlin.reflect.jvm.internal.impl.utils.i<q0> i = new kotlin.reflect.jvm.internal.impl.utils.i<q0>();
        for (final q0 next : l) {
            if (next instanceof q0 && k0.g((Object)((f0)next).getName(), (Object)e)) {
                i.add(next);
            }
        }
        return i;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<m> e(@org.jetbrains.annotations.e final d d, @org.jetbrains.annotations.e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        if (!d.a(d.p.o())) {
            return (Collection<m>)v.E();
        }
        return this.l();
    }
    
    @org.jetbrains.annotations.e
    protected abstract List<y> j();
    
    @org.jetbrains.annotations.e
    protected final kotlin.reflect.jvm.internal.impl.descriptors.e m() {
        return this.b;
    }
}
