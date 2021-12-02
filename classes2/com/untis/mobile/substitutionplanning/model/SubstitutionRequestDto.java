// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J+\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "component1", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "component2", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDtoStateEnum;", "component3", "periodConflict", "period", "state", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "getPeriod", "()Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "setPeriod", "(Lcom/untis/mobile/substitutionplanning/model/PeriodDto;)V", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "getPeriodConflict", "()Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "setPeriodConflict", "(Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;)V", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDtoStateEnum;", "getState", "()Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDtoStateEnum;", "setState", "(Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDtoStateEnum;)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;Lcom/untis/mobile/substitutionplanning/model/PeriodDto;Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDtoStateEnum;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SubstitutionRequestDto
{
    @f
    private PeriodDto period;
    @f
    private PeriodConflictDto periodConflict;
    @e
    private SubstitutionRequestDtoStateEnum state;
    
    public SubstitutionRequestDto(@f final PeriodConflictDto periodConflict, @f final PeriodDto period, @e final SubstitutionRequestDtoStateEnum state) {
        k0.p(state, "state");
        this.periodConflict = periodConflict;
        this.period = period;
        this.state = state;
    }
    
    @f
    public final PeriodConflictDto component1() {
        return this.periodConflict;
    }
    
    @f
    public final PeriodDto component2() {
        return this.period;
    }
    
    @e
    public final SubstitutionRequestDtoStateEnum component3() {
        return this.state;
    }
    
    @e
    public final SubstitutionRequestDto copy(@f final PeriodConflictDto periodConflictDto, @f final PeriodDto periodDto, @e final SubstitutionRequestDtoStateEnum substitutionRequestDtoStateEnum) {
        k0.p(substitutionRequestDtoStateEnum, "state");
        return new SubstitutionRequestDto(periodConflictDto, periodDto, substitutionRequestDtoStateEnum);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubstitutionRequestDto)) {
            return false;
        }
        final SubstitutionRequestDto substitutionRequestDto = (SubstitutionRequestDto)o;
        return k0.g(this.periodConflict, substitutionRequestDto.periodConflict) && k0.g(this.period, substitutionRequestDto.period) && this.state == substitutionRequestDto.state;
    }
    
    @f
    public final PeriodDto getPeriod() {
        return this.period;
    }
    
    @f
    public final PeriodConflictDto getPeriodConflict() {
        return this.periodConflict;
    }
    
    @e
    public final SubstitutionRequestDtoStateEnum getState() {
        return this.state;
    }
    
    @Override
    public int hashCode() {
        final PeriodConflictDto periodConflict = this.periodConflict;
        int hashCode = 0;
        int hashCode2;
        if (periodConflict == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = periodConflict.hashCode();
        }
        final PeriodDto period = this.period;
        if (period != null) {
            hashCode = period.hashCode();
        }
        return (hashCode2 * 31 + hashCode) * 31 + this.state.hashCode();
    }
    
    public final void setPeriod(@f final PeriodDto period) {
        this.period = period;
    }
    
    public final void setPeriodConflict(@f final PeriodConflictDto periodConflict) {
        this.periodConflict = periodConflict;
    }
    
    public final void setState(@e final SubstitutionRequestDtoStateEnum state) {
        k0.p(state, "<set-?>");
        this.state = state;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SubstitutionRequestDto(periodConflict=");
        sb.append(this.periodConflict);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(')');
        return sb.toString();
    }
}
