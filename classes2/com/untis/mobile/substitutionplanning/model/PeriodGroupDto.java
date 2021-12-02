// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "", "Lcom/untis/mobile/substitutionplanning/model/GroupDto;", "component1", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "component2", "group", "periods", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/substitutionplanning/model/GroupDto;", "getGroup", "()Lcom/untis/mobile/substitutionplanning/model/GroupDto;", "setGroup", "(Lcom/untis/mobile/substitutionplanning/model/GroupDto;)V", "Ljava/util/List;", "getPeriods", "()Ljava/util/List;", "setPeriods", "(Ljava/util/List;)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/GroupDto;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodGroupDto
{
    @e
    private GroupDto group;
    @e
    private List<PeriodDto> periods;
    
    public PeriodGroupDto(@e final GroupDto group, @e final List<PeriodDto> periods) {
        k0.p(group, "group");
        k0.p(periods, "periods");
        this.group = group;
        this.periods = periods;
    }
    
    @e
    public final GroupDto component1() {
        return this.group;
    }
    
    @e
    public final List<PeriodDto> component2() {
        return this.periods;
    }
    
    @e
    public final PeriodGroupDto copy(@e final GroupDto groupDto, @e final List<PeriodDto> list) {
        k0.p(groupDto, "group");
        k0.p(list, "periods");
        return new PeriodGroupDto(groupDto, list);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeriodGroupDto)) {
            return false;
        }
        final PeriodGroupDto periodGroupDto = (PeriodGroupDto)o;
        return k0.g(this.group, periodGroupDto.group) && k0.g(this.periods, periodGroupDto.periods);
    }
    
    @e
    public final GroupDto getGroup() {
        return this.group;
    }
    
    @e
    public final List<PeriodDto> getPeriods() {
        return this.periods;
    }
    
    @Override
    public int hashCode() {
        return this.group.hashCode() * 31 + this.periods.hashCode();
    }
    
    public final void setGroup(@e final GroupDto group) {
        k0.p(group, "<set-?>");
        this.group = group;
    }
    
    public final void setPeriods(@e final List<PeriodDto> periods) {
        k0.p(periods, "<set-?>");
        this.periods = periods;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodGroupDto(group=");
        sb.append(this.group);
        sb.append(", periods=");
        sb.append(this.periods);
        sb.append(')');
        return sb.toString();
    }
}
