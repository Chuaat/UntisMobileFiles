// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b<\u0010=J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J_\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!¨\u0006>" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;", "", "Lcom/untis/mobile/substitutionplanning/model/AbsenceReasonRefDto;", "component1", "", "component2", "component3", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "component4", "component5", "", "component6", "", "component7", "component8", "reason", "note", "startDateTime", "teacher", "endDateTime", "missedPeriods", "wuAbsenceId", "created", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getStartDateTime", "()Ljava/lang/String;", "setStartDateTime", "(Ljava/lang/String;)V", "getEndDateTime", "setEndDateTime", "Lcom/untis/mobile/substitutionplanning/model/AbsenceReasonRefDto;", "getReason", "()Lcom/untis/mobile/substitutionplanning/model/AbsenceReasonRefDto;", "setReason", "(Lcom/untis/mobile/substitutionplanning/model/AbsenceReasonRefDto;)V", "I", "getMissedPeriods", "()I", "setMissedPeriods", "(I)V", "getCreated", "setCreated", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "getTeacher", "()Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "setTeacher", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;)V", "J", "getWuAbsenceId", "()J", "setWuAbsenceId", "(J)V", "getNote", "setNote", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/AbsenceReasonRefDto;Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/lang/String;IJLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TeacherAbsenceDto
{
    @f
    private String created;
    @e
    private String endDateTime;
    private int missedPeriods;
    @f
    private String note;
    @f
    private AbsenceReasonRefDto reason;
    @e
    private String startDateTime;
    @e
    private TeacherRefDto teacher;
    private long wuAbsenceId;
    
    public TeacherAbsenceDto(@f final AbsenceReasonRefDto reason, @f final String note, @e final String startDateTime, @e final TeacherRefDto teacher, @e final String endDateTime, final int missedPeriods, final long wuAbsenceId, @f final String created) {
        k0.p(startDateTime, "startDateTime");
        k0.p(teacher, "teacher");
        k0.p(endDateTime, "endDateTime");
        this.reason = reason;
        this.note = note;
        this.startDateTime = startDateTime;
        this.teacher = teacher;
        this.endDateTime = endDateTime;
        this.missedPeriods = missedPeriods;
        this.wuAbsenceId = wuAbsenceId;
        this.created = created;
    }
    
    @f
    public final AbsenceReasonRefDto component1() {
        return this.reason;
    }
    
    @f
    public final String component2() {
        return this.note;
    }
    
    @e
    public final String component3() {
        return this.startDateTime;
    }
    
    @e
    public final TeacherRefDto component4() {
        return this.teacher;
    }
    
    @e
    public final String component5() {
        return this.endDateTime;
    }
    
    public final int component6() {
        return this.missedPeriods;
    }
    
    public final long component7() {
        return this.wuAbsenceId;
    }
    
    @f
    public final String component8() {
        return this.created;
    }
    
    @e
    public final TeacherAbsenceDto copy(@f final AbsenceReasonRefDto absenceReasonRefDto, @f final String s, @e final String s2, @e final TeacherRefDto teacherRefDto, @e final String s3, final int n, final long n2, @f final String s4) {
        k0.p(s2, "startDateTime");
        k0.p(teacherRefDto, "teacher");
        k0.p(s3, "endDateTime");
        return new TeacherAbsenceDto(absenceReasonRefDto, s, s2, teacherRefDto, s3, n, n2, s4);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeacherAbsenceDto)) {
            return false;
        }
        final TeacherAbsenceDto teacherAbsenceDto = (TeacherAbsenceDto)o;
        return k0.g(this.reason, teacherAbsenceDto.reason) && k0.g(this.note, teacherAbsenceDto.note) && k0.g(this.startDateTime, teacherAbsenceDto.startDateTime) && k0.g(this.teacher, teacherAbsenceDto.teacher) && k0.g(this.endDateTime, teacherAbsenceDto.endDateTime) && this.missedPeriods == teacherAbsenceDto.missedPeriods && this.wuAbsenceId == teacherAbsenceDto.wuAbsenceId && k0.g(this.created, teacherAbsenceDto.created);
    }
    
    @f
    public final String getCreated() {
        return this.created;
    }
    
    @e
    public final String getEndDateTime() {
        return this.endDateTime;
    }
    
    public final int getMissedPeriods() {
        return this.missedPeriods;
    }
    
    @f
    public final String getNote() {
        return this.note;
    }
    
    @f
    public final AbsenceReasonRefDto getReason() {
        return this.reason;
    }
    
    @e
    public final String getStartDateTime() {
        return this.startDateTime;
    }
    
    @e
    public final TeacherRefDto getTeacher() {
        return this.teacher;
    }
    
    public final long getWuAbsenceId() {
        return this.wuAbsenceId;
    }
    
    @Override
    public int hashCode() {
        final AbsenceReasonRefDto reason = this.reason;
        int hashCode = 0;
        int hashCode2;
        if (reason == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = reason.hashCode();
        }
        final String note = this.note;
        int hashCode3;
        if (note == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = note.hashCode();
        }
        final int hashCode4 = this.startDateTime.hashCode();
        final int hashCode5 = this.teacher.hashCode();
        final int hashCode6 = this.endDateTime.hashCode();
        final int missedPeriods = this.missedPeriods;
        final int a = a4.a.a(this.wuAbsenceId);
        final String created = this.created;
        if (created != null) {
            hashCode = created.hashCode();
        }
        return ((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + missedPeriods) * 31 + a) * 31 + hashCode;
    }
    
    public final void setCreated(@f final String created) {
        this.created = created;
    }
    
    public final void setEndDateTime(@e final String endDateTime) {
        k0.p(endDateTime, "<set-?>");
        this.endDateTime = endDateTime;
    }
    
    public final void setMissedPeriods(final int missedPeriods) {
        this.missedPeriods = missedPeriods;
    }
    
    public final void setNote(@f final String note) {
        this.note = note;
    }
    
    public final void setReason(@f final AbsenceReasonRefDto reason) {
        this.reason = reason;
    }
    
    public final void setStartDateTime(@e final String startDateTime) {
        k0.p(startDateTime, "<set-?>");
        this.startDateTime = startDateTime;
    }
    
    public final void setTeacher(@e final TeacherRefDto teacher) {
        k0.p(teacher, "<set-?>");
        this.teacher = teacher;
    }
    
    public final void setWuAbsenceId(final long wuAbsenceId) {
        this.wuAbsenceId = wuAbsenceId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TeacherAbsenceDto(reason=");
        sb.append(this.reason);
        sb.append(", note=");
        sb.append((Object)this.note);
        sb.append(", startDateTime=");
        sb.append(this.startDateTime);
        sb.append(", teacher=");
        sb.append(this.teacher);
        sb.append(", endDateTime=");
        sb.append(this.endDateTime);
        sb.append(", missedPeriods=");
        sb.append(this.missedPeriods);
        sb.append(", wuAbsenceId=");
        sb.append(this.wuAbsenceId);
        sb.append(", created=");
        sb.append((Object)this.created);
        sb.append(')');
        return sb.toString();
    }
}
