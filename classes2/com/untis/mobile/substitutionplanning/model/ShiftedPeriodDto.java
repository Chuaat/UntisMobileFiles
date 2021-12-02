// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b<\u0010=J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Jp\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b4\u0010,\"\u0004\b5\u0010.R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00106\u001a\u0004\b7\u0010\u0004\"\u0004\b8\u00109R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b:\u0010\"\"\u0004\b;\u0010$¨\u0006>" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;", "", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "", "Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "component4", "Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "component5", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "component6", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "component7", "id", "startDateTime", "endDateTime", "klassen", "subject", "teachers", "type", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;)Lcom/untis/mobile/substitutionplanning/model/ShiftedPeriodDto;", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getKlassen", "()Ljava/util/List;", "setKlassen", "(Ljava/util/List;)V", "Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "getSubject", "()Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "setSubject", "(Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;)V", "Ljava/lang/String;", "getStartDateTime", "()Ljava/lang/String;", "setStartDateTime", "(Ljava/lang/String;)V", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "getType", "()Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "setType", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;)V", "getEndDateTime", "setEndDateTime", "Ljava/lang/Long;", "getId", "setId", "(Ljava/lang/Long;)V", "getTeachers", "setTeachers", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ShiftedPeriodDto
{
    @f
    private String endDateTime;
    @f
    private Long id;
    @f
    private List<KlasseRefDto> klassen;
    @f
    private String startDateTime;
    @f
    private SubjectRefDto subject;
    @f
    private List<TeacherRefDto> teachers;
    @f
    private SolutionDto.SolutionEnum type;
    
    public ShiftedPeriodDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }
    
    public ShiftedPeriodDto(@f final Long id, @f final String startDateTime, @f final String endDateTime, @f final List<KlasseRefDto> klassen, @f final SubjectRefDto subject, @f final List<TeacherRefDto> teachers, @f final SolutionDto.SolutionEnum type) {
        this.id = id;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.klassen = klassen;
        this.subject = subject;
        this.teachers = teachers;
        this.type = type;
    }
    
    @f
    public final Long component1() {
        return this.id;
    }
    
    @f
    public final String component2() {
        return this.startDateTime;
    }
    
    @f
    public final String component3() {
        return this.endDateTime;
    }
    
    @f
    public final List<KlasseRefDto> component4() {
        return this.klassen;
    }
    
    @f
    public final SubjectRefDto component5() {
        return this.subject;
    }
    
    @f
    public final List<TeacherRefDto> component6() {
        return this.teachers;
    }
    
    @f
    public final SolutionDto.SolutionEnum component7() {
        return this.type;
    }
    
    @e
    public final ShiftedPeriodDto copy(@f final Long n, @f final String s, @f final String s2, @f final List<KlasseRefDto> list, @f final SubjectRefDto subjectRefDto, @f final List<TeacherRefDto> list2, @f final SolutionDto.SolutionEnum solutionEnum) {
        return new ShiftedPeriodDto(n, s, s2, list, subjectRefDto, list2, solutionEnum);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShiftedPeriodDto)) {
            return false;
        }
        final ShiftedPeriodDto shiftedPeriodDto = (ShiftedPeriodDto)o;
        return k0.g(this.id, shiftedPeriodDto.id) && k0.g(this.startDateTime, shiftedPeriodDto.startDateTime) && k0.g(this.endDateTime, shiftedPeriodDto.endDateTime) && k0.g(this.klassen, shiftedPeriodDto.klassen) && k0.g(this.subject, shiftedPeriodDto.subject) && k0.g(this.teachers, shiftedPeriodDto.teachers) && this.type == shiftedPeriodDto.type;
    }
    
    @f
    public final String getEndDateTime() {
        return this.endDateTime;
    }
    
    @f
    public final Long getId() {
        return this.id;
    }
    
    @f
    public final List<KlasseRefDto> getKlassen() {
        return this.klassen;
    }
    
    @f
    public final String getStartDateTime() {
        return this.startDateTime;
    }
    
    @f
    public final SubjectRefDto getSubject() {
        return this.subject;
    }
    
    @f
    public final List<TeacherRefDto> getTeachers() {
        return this.teachers;
    }
    
    @f
    public final SolutionDto.SolutionEnum getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final Long id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String startDateTime = this.startDateTime;
        int hashCode3;
        if (startDateTime == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = startDateTime.hashCode();
        }
        final String endDateTime = this.endDateTime;
        int hashCode4;
        if (endDateTime == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = endDateTime.hashCode();
        }
        final List<KlasseRefDto> klassen = this.klassen;
        int hashCode5;
        if (klassen == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = klassen.hashCode();
        }
        final SubjectRefDto subject = this.subject;
        int hashCode6;
        if (subject == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = subject.hashCode();
        }
        final List<TeacherRefDto> teachers = this.teachers;
        int hashCode7;
        if (teachers == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = teachers.hashCode();
        }
        final SolutionDto.SolutionEnum type = this.type;
        if (type != null) {
            hashCode = type.hashCode();
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    public final void setEndDateTime(@f final String endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    public final void setId(@f final Long id) {
        this.id = id;
    }
    
    public final void setKlassen(@f final List<KlasseRefDto> klassen) {
        this.klassen = klassen;
    }
    
    public final void setStartDateTime(@f final String startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    public final void setSubject(@f final SubjectRefDto subject) {
        this.subject = subject;
    }
    
    public final void setTeachers(@f final List<TeacherRefDto> teachers) {
        this.teachers = teachers;
    }
    
    public final void setType(@f final SolutionDto.SolutionEnum type) {
        this.type = type;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ShiftedPeriodDto(id=");
        sb.append(this.id);
        sb.append(", startDateTime=");
        sb.append((Object)this.startDateTime);
        sb.append(", endDateTime=");
        sb.append((Object)this.endDateTime);
        sb.append(", klassen=");
        sb.append(this.klassen);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", teachers=");
        sb.append(this.teachers);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(')');
        return sb.toString();
    }
}
