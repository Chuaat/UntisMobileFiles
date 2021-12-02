// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Iterator;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.utils.j;
import java.util.LinkedList;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import n6.l;
import org.jetbrains.annotations.e;
import java.util.Collection;

public final class k
{
    @e
    public static final <H> Collection<H> a(@e final Collection<? extends H> c, @e final l<? super H, ? extends a> l) {
        k0.p((Object)c, "<this>");
        k0.p((Object)l, "descriptorByHandle");
        if (c.size() <= 1) {
            return (Collection<H>)c;
        }
        final LinkedList<H> list = new LinkedList<H>(c);
        final j<Object> a = (j<Object>)j.I.a();
        while (list.isEmpty() ^ true) {
            final Object o2 = v.o2((List)list);
            final j<?> a2 = j.I.a();
            final Collection<H> s = kotlin.reflect.jvm.internal.impl.resolve.j.s((H)o2, list, (n6.l<H, a>)l, (n6.l<H, j2>)new l<H, j2>() {
                public final void a(final H h) {
                    final j<H> g = (j<H>)a2;
                    k0.o((Object)h, "it");
                    g.add(h);
                }
            });
            k0.o((Object)s, "val conflictedHandles = SmartSet.create<H>()\n\n        val overridableGroup =\n            OverridingUtil.extractMembersOverridableInBothWays(nextHandle, queue, descriptorByHandle) { conflictedHandles.add(it) }");
            if (s.size() == 1 && a2.isEmpty()) {
                final Object s2 = v.S4((Iterable)s);
                k0.o(s2, "overridableGroup.single()");
                a.add(s2);
            }
            else {
                final H o3 = kotlin.reflect.jvm.internal.impl.resolve.j.O(s, (n6.l<H, a>)l);
                k0.o((Object)o3, "selectMostSpecificMember(overridableGroup, descriptorByHandle)");
                final a a3 = (a)l.invoke((Object)o3);
                for (final H next : s) {
                    k0.o((Object)next, "it");
                    if (!kotlin.reflect.jvm.internal.impl.resolve.j.E(a3, (a)l.invoke((Object)next))) {
                        a2.add(next);
                    }
                }
                if (a2.isEmpty() ^ true) {
                    a.addAll(a2);
                }
                a.add(o3);
            }
        }
        return (Collection<H>)a;
    }
}
