// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00c6\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;", "", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "component1", "groups", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getGroups", "()Ljava/util/List;", "setGroups", "(Ljava/util/List;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodGroupCollectionDto
{
    @f
    private List<PeriodGroupDto> groups;
    
    public PeriodGroupCollectionDto(@f final List<PeriodGroupDto> groups) {
        this.groups = groups;
    }
    
    @f
    public final List<PeriodGroupDto> component1() {
        return this.groups;
    }
    
    @e
    public final PeriodGroupCollectionDto copy(@f final List<PeriodGroupDto> list) {
        return new PeriodGroupCollectionDto(list);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof PeriodGroupCollectionDto && k0.g(this.groups, ((PeriodGroupCollectionDto)o).groups));
    }
    
    @f
    public final List<PeriodGroupDto> getGroups() {
        return this.groups;
    }
    
    @Override
    public int hashCode() {
        final List<PeriodGroupDto> groups = this.groups;
        int hashCode;
        if (groups == null) {
            hashCode = 0;
        }
        else {
            hashCode = groups.hashCode();
        }
        return hashCode;
    }
    
    public final void setGroups(@f final List<PeriodGroupDto> groups) {
        this.groups = groups;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodGroupCollectionDto(groups=");
        sb.append(this.groups);
        sb.append(')');
        return sb.toString();
    }
}
