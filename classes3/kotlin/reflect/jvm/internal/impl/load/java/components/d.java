// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import n6.l;
import java.util.Collection;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.j1;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.constants.j;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.n;
import java.util.EnumSet;
import java.util.Map;
import org.jetbrains.annotations.e;

public final class d
{
    @e
    public static final d a;
    @e
    private static final Map<String, EnumSet<n>> b;
    @e
    private static final Map<String, m> c;
    
    static {
        a = new d();
        b = y0.W(new s0[] { n1.a((Object)"PACKAGE", (Object)EnumSet.noneOf(n.class)), n1.a((Object)"TYPE", (Object)EnumSet.of(n.N, n.a0)), n1.a((Object)"ANNOTATION_TYPE", (Object)EnumSet.of(n.O)), n1.a((Object)"TYPE_PARAMETER", (Object)EnumSet.of(n.P)), n1.a((Object)"FIELD", (Object)EnumSet.of(n.R)), n1.a((Object)"LOCAL_VARIABLE", (Object)EnumSet.of(n.S)), n1.a((Object)"PARAMETER", (Object)EnumSet.of(n.T)), n1.a((Object)"CONSTRUCTOR", (Object)EnumSet.of(n.U)), n1.a((Object)"METHOD", (Object)EnumSet.of(n.V, n.W, n.X)), n1.a((Object)"TYPE_USE", (Object)EnumSet.of(n.Y)) });
        c = y0.W(new s0[] { n1.a((Object)"RUNTIME", (Object)m.G), n1.a((Object)"CLASS", (Object)m.H), n1.a((Object)"SOURCE", (Object)m.I) });
    }
    
    private d() {
    }
    
    @f
    public final g<?> a(@f final b b) {
        final boolean b2 = b instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.m;
        final g<?> g = null;
        kotlin.reflect.jvm.internal.impl.load.java.structure.m m;
        if (b2) {
            m = (kotlin.reflect.jvm.internal.impl.load.java.structure.m)b;
        }
        else {
            m = null;
        }
        g<?> g2;
        if (m == null) {
            g2 = g;
        }
        else {
            final Map<String, m> c = d.c;
            final kotlin.reflect.jvm.internal.impl.name.e d = m.d();
            Object d2;
            if (d == null) {
                d2 = null;
            }
            else {
                d2 = d.d();
            }
            final m i = c.get(d2);
            if (i == null) {
                g2 = g;
            }
            else {
                final a j = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames$FqNames.annotationRetention);
                k0.o((Object)j, "topLevel(StandardNames.FqNames.annotationRetention)");
                final kotlin.reflect.jvm.internal.impl.name.e k = kotlin.reflect.jvm.internal.impl.name.e.i(((Enum)i).name());
                k0.o((Object)k, "identifier(retention.name)");
                g2 = new j(j, k);
            }
        }
        return g2;
    }
    
    @e
    public final Set<n> b(@f final String s) {
        Set<n> k;
        if ((k = d.b.get(s)) == null) {
            k = (Set<n>)j1.k();
        }
        return k;
    }
    
    @e
    public final g<?> c(@e final List<? extends b> list) {
        k0.p((Object)list, "arguments");
        final ArrayList<kotlin.reflect.jvm.internal.impl.load.java.structure.m> list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.structure.m>();
        for (final kotlin.reflect.jvm.internal.impl.load.java.structure.m next : list) {
            if (next instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.m) {
                list2.add(next);
            }
        }
        final ArrayList<n> list3 = new ArrayList<n>();
        final Iterator<Object> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.name.e d = iterator2.next().d();
            String d2;
            if (d == null) {
                d2 = null;
            }
            else {
                d2 = d.d();
            }
            v.q0((Collection)list3, (Iterable)this.b(d2));
        }
        final ArrayList list4 = new ArrayList<j>(v.Y((Iterable)list3, 10));
        for (final n n : list3) {
            final a m = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames$FqNames.annotationTarget);
            k0.o((Object)m, "topLevel(StandardNames.FqNames.annotationTarget)");
            final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(((Enum)n).name());
            k0.o((Object)i, "identifier(kotlinTarget.name)");
            list4.add(new j(m, i));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.b((List<? extends g<?>>)list4, (l<? super e0, ? extends c0>)d$a.G);
    }
}
