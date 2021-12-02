// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J=\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001a¨\u0006." }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/OverbookingDto;", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "component1", "", "component2", "", "component3", "component4", "", "component5", "period", "startDateTime", "id", "endDateTime", "missedPeriods", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getStartDateTime", "()Ljava/lang/String;", "setStartDateTime", "(Ljava/lang/String;)V", "J", "getId", "()J", "setId", "(J)V", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "getPeriod", "()Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "setPeriod", "(Lcom/untis/mobile/substitutionplanning/model/PeriodDto;)V", "I", "getMissedPeriods", "()I", "setMissedPeriods", "(I)V", "getEndDateTime", "setEndDateTime", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/PeriodDto;Ljava/lang/String;JLjava/lang/String;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class OverbookingDto
{
    @e
    private String endDateTime;
    private long id;
    private int missedPeriods;
    @f
    private PeriodDto period;
    @e
    private String startDateTime;
    
    public OverbookingDto(@f final PeriodDto period, @e final String startDateTime, final long id, @e final String endDateTime, final int missedPeriods) {
        k0.p(startDateTime, "startDateTime");
        k0.p(endDateTime, "endDateTime");
        this.period = period;
        this.startDateTime = startDateTime;
        this.id = id;
        this.endDateTime = endDateTime;
        this.missedPeriods = missedPeriods;
    }
    
    @f
    public final PeriodDto component1() {
        return this.period;
    }
    
    @e
    public final String component2() {
        return this.startDateTime;
    }
    
    public final long component3() {
        return this.id;
    }
    
    @e
    public final String component4() {
        return this.endDateTime;
    }
    
    public final int component5() {
        return this.missedPeriods;
    }
    
    @e
    public final OverbookingDto copy(@f final PeriodDto periodDto, @e final String s, final long n, @e final String s2, final int n2) {
        k0.p(s, "startDateTime");
        k0.p(s2, "endDateTime");
        return new OverbookingDto(periodDto, s, n, s2, n2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OverbookingDto)) {
            return false;
        }
        final OverbookingDto overbookingDto = (OverbookingDto)o;
        return k0.g(this.period, overbookingDto.period) && k0.g(this.startDateTime, overbookingDto.startDateTime) && this.id == overbookingDto.id && k0.g(this.endDateTime, overbookingDto.endDateTime) && this.missedPeriods == overbookingDto.missedPeriods;
    }
    
    @e
    public final String getEndDateTime() {
        return this.endDateTime;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final int getMissedPeriods() {
        return this.missedPeriods;
    }
    
    @f
    public final PeriodDto getPeriod() {
        return this.period;
    }
    
    @e
    public final String getStartDateTime() {
        return this.startDateTime;
    }
    
    @Override
    public int hashCode() {
        final PeriodDto period = this.period;
        int hashCode;
        if (period == null) {
            hashCode = 0;
        }
        else {
            hashCode = period.hashCode();
        }
        return (((hashCode * 31 + this.startDateTime.hashCode()) * 31 + a.a(this.id)) * 31 + this.endDateTime.hashCode()) * 31 + this.missedPeriods;
    }
    
    public final void setEndDateTime(@e final String endDateTime) {
        k0.p(endDateTime, "<set-?>");
        this.endDateTime = endDateTime;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setMissedPeriods(final int missedPeriods) {
        this.missedPeriods = missedPeriods;
    }
    
    public final void setPeriod(@f final PeriodDto period) {
        this.period = period;
    }
    
    public final void setStartDateTime(@e final String startDateTime) {
        k0.p(startDateTime, "<set-?>");
        this.startDateTime = startDateTime;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OverbookingDto(period=");
        sb.append(this.period);
        sb.append(", startDateTime=");
        sb.append(this.startDateTime);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", endDateTime=");
        sb.append(this.endDateTime);
        sb.append(", missedPeriods=");
        sb.append(this.missedPeriods);
        sb.append(')');
        return sb.toString();
    }
}
