// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001:\u00017BM\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b5\u00106J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003JX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rH\u00c6\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u0004\"\u0004\b\u001f\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010&\u001a\u0004\b\u0013\u0010\f\"\u0004\b'\u0010(R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010 R$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/SolutionDto;", "", "", "component1", "()Ljava/lang/Long;", "component2", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "component3", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "component4", "", "component5", "()Ljava/lang/Boolean;", "Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;", "component6", "conflictId", "id", "type", "teacher", "isPublished", "period", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/lang/Boolean;Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;)Lcom/untis/mobile/substitutionplanning/model/SolutionDto;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Long;", "getId", "setId", "(Ljava/lang/Long;)V", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "getTeacher", "()Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "setTeacher", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;)V", "Ljava/lang/Boolean;", "setPublished", "(Ljava/lang/Boolean;)V", "getConflictId", "setConflictId", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "getType", "()Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "setType", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;)V", "Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;", "getPeriod", "()Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;", "setPeriod", "(Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;)V", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/lang/Boolean;Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;)V", "SolutionEnum", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SolutionDto
{
    @f
    private Long conflictId;
    @f
    private Long id;
    @f
    private Boolean isPublished;
    @f
    private ShiftedPeriodDto period;
    @f
    private TeacherRefDto teacher;
    @f
    private SolutionEnum type;
    
    public SolutionDto(@f final Long conflictId, @f final Long id, @f final SolutionEnum type, @f final TeacherRefDto teacher, @f final Boolean isPublished, @f final ShiftedPeriodDto period) {
        this.conflictId = conflictId;
        this.id = id;
        this.type = type;
        this.teacher = teacher;
        this.isPublished = isPublished;
        this.period = period;
    }
    
    @f
    public final Long component1() {
        return this.conflictId;
    }
    
    @f
    public final Long component2() {
        return this.id;
    }
    
    @f
    public final SolutionEnum component3() {
        return this.type;
    }
    
    @f
    public final TeacherRefDto component4() {
        return this.teacher;
    }
    
    @f
    public final Boolean component5() {
        return this.isPublished;
    }
    
    @f
    public final ShiftedPeriodDto component6() {
        return this.period;
    }
    
    @e
    public final SolutionDto copy(@f final Long n, @f final Long n2, @f final SolutionEnum solutionEnum, @f final TeacherRefDto teacherRefDto, @f final Boolean b, @f final ShiftedPeriodDto shiftedPeriodDto) {
        return new SolutionDto(n, n2, solutionEnum, teacherRefDto, b, shiftedPeriodDto);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SolutionDto)) {
            return false;
        }
        final SolutionDto solutionDto = (SolutionDto)o;
        return k0.g(this.conflictId, solutionDto.conflictId) && k0.g(this.id, solutionDto.id) && this.type == solutionDto.type && k0.g(this.teacher, solutionDto.teacher) && k0.g(this.isPublished, solutionDto.isPublished) && k0.g(this.period, solutionDto.period);
    }
    
    @f
    public final Long getConflictId() {
        return this.conflictId;
    }
    
    @f
    public final Long getId() {
        return this.id;
    }
    
    @f
    public final ShiftedPeriodDto getPeriod() {
        return this.period;
    }
    
    @f
    public final TeacherRefDto getTeacher() {
        return this.teacher;
    }
    
    @f
    public final SolutionEnum getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final Long conflictId = this.conflictId;
        int hashCode = 0;
        int hashCode2;
        if (conflictId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = conflictId.hashCode();
        }
        final Long id = this.id;
        int hashCode3;
        if (id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = id.hashCode();
        }
        final SolutionEnum type = this.type;
        int hashCode4;
        if (type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = type.hashCode();
        }
        final TeacherRefDto teacher = this.teacher;
        int hashCode5;
        if (teacher == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = teacher.hashCode();
        }
        final Boolean isPublished = this.isPublished;
        int hashCode6;
        if (isPublished == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = isPublished.hashCode();
        }
        final ShiftedPeriodDto period = this.period;
        if (period != null) {
            hashCode = period.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @f
    public final Boolean isPublished() {
        return this.isPublished;
    }
    
    public final void setConflictId(@f final Long conflictId) {
        this.conflictId = conflictId;
    }
    
    public final void setId(@f final Long id) {
        this.id = id;
    }
    
    public final void setPeriod(@f final ShiftedPeriodDto period) {
        this.period = period;
    }
    
    public final void setPublished(@f final Boolean isPublished) {
        this.isPublished = isPublished;
    }
    
    public final void setTeacher(@f final TeacherRefDto teacher) {
        this.teacher = teacher;
    }
    
    public final void setType(@f final SolutionEnum type) {
        this.type = type;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SolutionDto(conflictId=");
        sb.append(this.conflictId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", teacher=");
        sb.append(this.teacher);
        sb.append(", isPublished=");
        sb.append(this.isPublished);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "", "", "id", "I", "getId", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "SUBSTITUTION", "CANCELLATION", "NO_SUBSTITUTION", "SHIFT", "ASK_TEACHER", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum SolutionEnum
    {
        ASK_TEACHER(5), 
        CANCELLATION(2);
        
        @e
        public static final Companion Companion;
        
        NO_SUBSTITUTION(3), 
        SHIFT(4), 
        SUBSTITUTION(1);
        
        private final int id;
        
        private static final /* synthetic */ SolutionEnum[] $values() {
            return new SolutionEnum[] { SolutionEnum.SUBSTITUTION, SolutionEnum.CANCELLATION, SolutionEnum.NO_SUBSTITUTION, SolutionEnum.SHIFT, SolutionEnum.ASK_TEACHER };
        }
        
        static {
            $VALUES = $values();
            Companion = new Companion(null);
        }
        
        private SolutionEnum(final int id) {
            this.id = id;
        }
        
        public final int getId() {
            return this.id;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum$Companion;", "", "", "id", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "findBy", "(Ljava/lang/Integer;)Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        public static final class Companion
        {
            private Companion() {
            }
            
            @f
            public final SolutionEnum findBy(@f final Integer n) {
                for (final SolutionEnum solutionEnum : SolutionEnum.values()) {
                    final int id = solutionEnum.getId();
                    boolean b = false;
                    Label_0054: {
                        if (n != null) {
                            if (id == n) {
                                b = true;
                                break Label_0054;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        return solutionEnum;
                    }
                }
                return null;
            }
        }
    }
}
