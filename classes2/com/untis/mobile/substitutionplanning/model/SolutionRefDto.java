// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\u0006J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u0017R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/SolutionRefDto;", "", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "component1", "", "component2", "()Ljava/lang/Long;", "component3", "type", "teacherId", "conflictId", "copy", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;Ljava/lang/Long;Ljava/lang/Long;)Lcom/untis/mobile/substitutionplanning/model/SolutionRefDto;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Long;", "getTeacherId", "setTeacherId", "(Ljava/lang/Long;)V", "getConflictId", "setConflictId", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "getType", "()Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "setType", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;Ljava/lang/Long;Ljava/lang/Long;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SolutionRefDto
{
    @f
    private Long conflictId;
    @f
    private Long teacherId;
    @f
    private SolutionDto.SolutionEnum type;
    
    public SolutionRefDto() {
        this(null, null, null, 7, null);
    }
    
    public SolutionRefDto(@f final SolutionDto.SolutionEnum type, @f final Long teacherId, @f final Long conflictId) {
        this.type = type;
        this.teacherId = teacherId;
        this.conflictId = conflictId;
    }
    
    @f
    public final SolutionDto.SolutionEnum component1() {
        return this.type;
    }
    
    @f
    public final Long component2() {
        return this.teacherId;
    }
    
    @f
    public final Long component3() {
        return this.conflictId;
    }
    
    @e
    public final SolutionRefDto copy(@f final SolutionDto.SolutionEnum solutionEnum, @f final Long n, @f final Long n2) {
        return new SolutionRefDto(solutionEnum, n, n2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SolutionRefDto)) {
            return false;
        }
        final SolutionRefDto solutionRefDto = (SolutionRefDto)o;
        return this.type == solutionRefDto.type && k0.g(this.teacherId, solutionRefDto.teacherId) && k0.g(this.conflictId, solutionRefDto.conflictId);
    }
    
    @f
    public final Long getConflictId() {
        return this.conflictId;
    }
    
    @f
    public final Long getTeacherId() {
        return this.teacherId;
    }
    
    @f
    public final SolutionDto.SolutionEnum getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final SolutionDto.SolutionEnum type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Long teacherId = this.teacherId;
        int hashCode3;
        if (teacherId == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = teacherId.hashCode();
        }
        final Long conflictId = this.conflictId;
        if (conflictId != null) {
            hashCode = conflictId.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void setConflictId(@f final Long conflictId) {
        this.conflictId = conflictId;
    }
    
    public final void setTeacherId(@f final Long teacherId) {
        this.teacherId = teacherId;
    }
    
    public final void setType(@f final SolutionDto.SolutionEnum type) {
        this.type = type;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SolutionRefDto(type=");
        sb.append(this.type);
        sb.append(", teacherId=");
        sb.append(this.teacherId);
        sb.append(", conflictId=");
        sb.append(this.conflictId);
        sb.append(')');
        return sb.toString();
    }
}
