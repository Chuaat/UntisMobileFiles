// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\b\u0010\u0006\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/TeamTeacherDto;", "", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "component1", "", "component2", "()Ljava/lang/Boolean;", "teacher", "isAbsent", "copy", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/lang/Boolean;)Lcom/untis/mobile/substitutionplanning/model/TeamTeacherDto;", "", "toString", "", "hashCode", "other", "equals", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "getTeacher", "()Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "setTeacher", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;)V", "Ljava/lang/Boolean;", "setAbsent", "(Ljava/lang/Boolean;)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/lang/Boolean;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TeamTeacherDto
{
    @f
    private Boolean isAbsent;
    @f
    private TeacherRefDto teacher;
    
    public TeamTeacherDto() {
        this(null, null, 3, null);
    }
    
    public TeamTeacherDto(@f final TeacherRefDto teacher, @f final Boolean isAbsent) {
        this.teacher = teacher;
        this.isAbsent = isAbsent;
    }
    
    @f
    public final TeacherRefDto component1() {
        return this.teacher;
    }
    
    @f
    public final Boolean component2() {
        return this.isAbsent;
    }
    
    @e
    public final TeamTeacherDto copy(@f final TeacherRefDto teacherRefDto, @f final Boolean b) {
        return new TeamTeacherDto(teacherRefDto, b);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeamTeacherDto)) {
            return false;
        }
        final TeamTeacherDto teamTeacherDto = (TeamTeacherDto)o;
        return k0.g(this.teacher, teamTeacherDto.teacher) && k0.g(this.isAbsent, teamTeacherDto.isAbsent);
    }
    
    @f
    public final TeacherRefDto getTeacher() {
        return this.teacher;
    }
    
    @Override
    public int hashCode() {
        final TeacherRefDto teacher = this.teacher;
        int hashCode = 0;
        int hashCode2;
        if (teacher == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = teacher.hashCode();
        }
        final Boolean isAbsent = this.isAbsent;
        if (isAbsent != null) {
            hashCode = isAbsent.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @f
    public final Boolean isAbsent() {
        return this.isAbsent;
    }
    
    public final void setAbsent(@f final Boolean isAbsent) {
        this.isAbsent = isAbsent;
    }
    
    public final void setTeacher(@f final TeacherRefDto teacher) {
        this.teacher = teacher;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TeamTeacherDto(teacher=");
        sb.append(this.teacher);
        sb.append(", isAbsent=");
        sb.append(this.isAbsent);
        sb.append(')');
        return sb.toString();
    }
}
