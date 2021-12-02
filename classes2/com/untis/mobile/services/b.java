// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services;

import org.joda.time.l0;
import org.joda.time.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.joda.time.r;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/services/b;", "", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "a", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "()Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "d", "(Lcom/untis/mobile/persistence/models/masterdata/Holiday;)V", "holiday", "Lorg/joda/time/r;", "c", "Lorg/joda/time/r;", "b", "()Lorg/joda/time/r;", "e", "(Lorg/joda/time/r;)V", "interval", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "()Lcom/untis/mobile/persistence/models/timetable/period/Period;", "f", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "period", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @f
    private Holiday a;
    @f
    private Period b;
    @e
    private r c;
    
    public b(@e final Holiday a) {
        k0.p(a, "holiday");
        this.a = a;
        this.c = new r((l0)a.getStart().F0(), (l0)a.getEnd().x0(new v(23, 59)));
    }
    
    public b(@e final Period b) {
        k0.p(b, "period");
        this.b = b;
        this.c = new r((l0)b.getStart(), (l0)b.getEnd());
    }
    
    @f
    public final Holiday a() {
        return this.a;
    }
    
    @e
    public final r b() {
        return this.c;
    }
    
    @f
    public final Period c() {
        return this.b;
    }
    
    public final void d(@f final Holiday a) {
        this.a = a;
    }
    
    public final void e(@e final r c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void f(@f final Period b) {
        this.b = b;
    }
}
