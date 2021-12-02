// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import org.joda.time.base.d;
import java.util.Iterator;
import org.joda.time.m0;
import org.joda.time.l0;
import org.jetbrains.annotations.f;
import org.joda.time.r;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/a;", "", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lkotlin/j2;", "a", "Lorg/joda/time/r;", "interval", "", "c", "", "Lcom/untis/mobile/services/timetable/placeholder/g;", "Ljava/util/List;", "b", "()Ljava/util/List;", "periodGroups", "<init>", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
final class a
{
    @e
    private final List<g> a;
    
    public a(@e final Period period) {
        k0.p(period, "period");
        (this.a = new ArrayList<g>()).add(new g(period));
    }
    
    public final void a(@e final Period period) {
        k0.p(period, "period");
        this.a.add(new g(period));
    }
    
    @e
    public final List<g> b() {
        return this.a;
    }
    
    public final int c(@f final r r) {
        final Iterator<g> iterator = this.a.iterator();
        int size = 0;
        while (iterator.hasNext()) {
            final g g = iterator.next();
            if ((r == null || ((d)r).F((m0)new r((l0)g.e(), (l0)g.c()))) && g.d().size() > size) {
                size = g.d().size();
            }
        }
        return size;
    }
}
