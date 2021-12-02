// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import java.util.Comparator;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\nR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/g;", "", "Lkotlin/j2;", "f", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "b", "Lorg/joda/time/c;", "Lorg/joda/time/c;", "e", "()Lorg/joda/time/c;", "start", "c", "end", "", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "periods", "<init>", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
final class g
{
    @e
    private final List<Period> a;
    @e
    private final c b;
    @e
    private final c c;
    
    public g(@e final Period period) {
        k0.p(period, "period");
        final ArrayList<Period> a = new ArrayList<Period>();
        this.a = a;
        this.b = period.getStart();
        this.c = period.getEnd();
        a.add(period);
    }
    
    private final void f() {
        v.p0(this.a, f.G);
    }
    
    private static final int g(final Period period, final Period period2) {
        final Set<PeriodState> states = period.getStates();
        final PeriodState exam = PeriodState.EXAM;
        if (states.contains(exam) && !period2.getStates().contains(exam)) {
            return -1;
        }
        if (!period.getStates().contains(exam) && period2.getStates().contains(exam)) {
            return 1;
        }
        final Set<PeriodState> states2 = period.getStates();
        final PeriodState cancelled = PeriodState.CANCELLED;
        if (states2.contains(cancelled) && !period2.getStates().contains(cancelled)) {
            return 1;
        }
        if (!period.getStates().contains(cancelled) && period2.getStates().contains(cancelled)) {
            return -1;
        }
        return 0;
    }
    
    public final void b(@e final Period period) {
        k0.p(period, "period");
        this.a.add(period);
        this.f();
    }
    
    @e
    public final c c() {
        return this.c;
    }
    
    @e
    public final List<Period> d() {
        return this.a;
    }
    
    @e
    public final c e() {
        return this.b;
    }
}
