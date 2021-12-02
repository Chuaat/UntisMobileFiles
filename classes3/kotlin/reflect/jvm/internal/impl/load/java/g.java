// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.k0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.name.c;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.collections.y0;
import kotlin.s0;
import kotlin.n1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import java.util.Set;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.Map;
import org.jetbrains.annotations.e;

public final class g
{
    @e
    public static final g a;
    @e
    private static final Map<b, kotlin.reflect.jvm.internal.impl.name.e> b;
    @e
    private static final Map<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>> c;
    @e
    private static final Set<b> d;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.e> e;
    
    static {
        a = new g();
        final c enum1 = StandardNames$FqNames._enum;
        final s0 a2 = n1.a((Object)h.b(enum1, "name"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("name"));
        final s0 a3 = n1.a((Object)h.b(enum1, "ordinal"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("ordinal"));
        final s0 a4 = n1.a((Object)h.a(StandardNames$FqNames.collection, "size"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("size"));
        final b map = StandardNames$FqNames.map;
        final Set<Map.Entry<b, kotlin.reflect.jvm.internal.impl.name.e>> entrySet = (b = y0.W(new s0[] { a2, a3, a4, n1.a((Object)h.a(map, "size"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("size")), n1.a((Object)h.b(StandardNames$FqNames.charSequence, "length"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("length")), n1.a((Object)h.a(map, "keys"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("keySet")), n1.a((Object)h.a(map, "values"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("values")), n1.a((Object)h.a(map, "entries"), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("entrySet")) })).entrySet();
        final ArrayList list = new ArrayList<s0>(v.Y((Iterable)entrySet, 10));
        for (final Map.Entry<b, V> entry : entrySet) {
            list.add(new s0((Object)entry.getKey().g(), (Object)entry.getValue()));
        }
        final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>> c2 = (LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>>)new LinkedHashMap<Object, Object>();
        for (final s0 s0 : list) {
            final kotlin.reflect.jvm.internal.impl.name.e e2 = (kotlin.reflect.jvm.internal.impl.name.e)s0.f();
            List<kotlin.reflect.jvm.internal.impl.name.e> value;
            if ((value = c2.get(e2)) == null) {
                value = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>();
                c2.put(e2, value);
            }
            value.add((kotlin.reflect.jvm.internal.impl.name.e)s0.e());
        }
        c = c2;
        final Set<b> set = (Set<b>)(d = g.b.keySet());
        final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(v.Y((Iterable)set, 10));
        final Iterator<Object> iterator3 = set.iterator();
        while (iterator3.hasNext()) {
            list2.add(iterator3.next().g());
        }
        e = v.N5((Iterable)list2);
    }
    
    private g() {
    }
    
    @e
    public final Map<b, kotlin.reflect.jvm.internal.impl.name.e> a() {
        return g.b;
    }
    
    @e
    public final List<kotlin.reflect.jvm.internal.impl.name.e> b(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name1");
        List<kotlin.reflect.jvm.internal.impl.name.e> e2;
        if ((e2 = g.c.get(e)) == null) {
            e2 = (List<kotlin.reflect.jvm.internal.impl.name.e>)v.E();
        }
        return e2;
    }
    
    @e
    public final Set<b> c() {
        return g.d;
    }
    
    @e
    public final Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        return g.e;
    }
}
