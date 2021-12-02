// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.v;
import org.joda.time.m0;
import org.joda.time.r;
import org.joda.time.l0;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\n\u001a\u00020\u0004R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/d;", "", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lkotlin/j2;", "c", "", "Lcom/untis/mobile/services/timetable/placeholder/e;", "groups", "d", "f", "", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "<init>", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
final class d
{
    @org.jetbrains.annotations.e
    private final List<e> a;
    
    public d(@org.jetbrains.annotations.e final Period period) {
        k0.p(period, "period");
        (this.a = new ArrayList<e>()).add(new e(period));
    }
    
    private static final int g(final g g, final g g2) {
        int b;
        if ((b = ((org.joda.time.base.c)g.e()).b((l0)g2.e())) == 0) {
            b = ((org.joda.time.base.c)g.c()).b((l0)g2.c()) * -1;
        }
        return b;
    }
    
    private static final int h(final a a, final a a2) {
        int b;
        if ((b = ((org.joda.time.base.c)a.b().get(0).e()).b((l0)a2.b().get(0).e())) == 0) {
            b = ((org.joda.time.base.c)a.b().get(0).c()).b((l0)a2.b().get(0).c()) * -1;
        }
        return b;
    }
    
    public final void c(@org.jetbrains.annotations.e final Period period) {
        k0.p(period, "period");
        final r r = new r((l0)period.getStart(), (l0)period.getEnd());
        final List<e> a = this.a;
        final ArrayList<e> list = new ArrayList<e>();
        for (final e next : a) {
            final e e = next;
            if (((org.joda.time.base.d)r).F((m0)new r((l0)e.i(), (l0)e.g()))) {
                list.add(next);
            }
        }
        final List<Object> l5 = v.L5((Collection<?>)list);
        this.a.removeAll(l5);
        this.a.add(this.d(period, (List<e>)l5));
        this.f();
    }
    
    @org.jetbrains.annotations.e
    public final e d(@org.jetbrains.annotations.e final Period period, @org.jetbrains.annotations.e final List<e> list) {
        k0.p(period, "period");
        k0.p(list, "groups");
        final e e = new e(period);
        final ArrayList<Iterable<? extends T>> list2 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((e)iterator.next()).h());
        }
        final Iterator<Object> iterator2 = v.c0((Iterable<? extends Iterable<?>>)list2).iterator();
        while (iterator2.hasNext()) {
            e.a(iterator2.next());
        }
        this.f();
        return e;
    }
    
    @org.jetbrains.annotations.e
    public final List<e> e() {
        return this.a;
    }
    
    public final void f() {
        for (final e e : this.a) {
            final Iterator<Object> iterator2 = e.f().iterator();
            while (iterator2.hasNext()) {
                v.p0(iterator2.next().b(), c.G);
            }
            v.p0(e.f(), b.G);
        }
    }
}
