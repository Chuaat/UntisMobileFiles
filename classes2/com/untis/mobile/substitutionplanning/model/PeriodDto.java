// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import a4.a;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0004\b[\u0010\\J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u00c6\u0003J®\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010!\u001a\u00020\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u00c6\u0001¢\u0006\u0004\b'\u0010(J\t\u0010)\u001a\u00020\u0006H\u00d6\u0001J\t\u0010*\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010#\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00107\u001a\u0004\b\u001f\u00108\"\u0004\b9\u0010:R$\u0010 \u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010;\u001a\u0004\b \u0010\r\"\u0004\b<\u0010=R$\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010E\u001a\u0004\bT\u0010G\"\u0004\bU\u0010IR\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\bV\u00104\"\u0004\bW\u00106R(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010E\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR$\u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010;\u001a\u0004\b\"\u0010\r\"\u0004\bZ\u0010=¨\u0006]" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "", "", "component1", "Lcom/untis/mobile/substitutionplanning/model/PeriodTypeEnum;", "component2", "", "component3", "component4", "component5", "", "component6", "component7", "()Ljava/lang/Boolean;", "", "component8", "component9", "Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "component10", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodTeacherDto;", "component11", "Lcom/untis/mobile/substitutionplanning/model/PeriodKlasseDto;", "component12", "Lcom/untis/mobile/substitutionplanning/model/PeriodRoomDto;", "component13", "wuId", "periodType", "startDateTime", "endDateTime", "created", "isCanceled", "isGlobalSolutionPublished", "unitOfDay", "isPending", "subject", "teachers", "klassen", "rooms", "copy", "(JLcom/untis/mobile/substitutionplanning/model/PeriodTypeEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Boolean;Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "toString", "hashCode", "other", "equals", "Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "getSubject", "()Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "setSubject", "(Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;)V", "Ljava/lang/String;", "getStartDateTime", "()Ljava/lang/String;", "setStartDateTime", "(Ljava/lang/String;)V", "Z", "()Z", "setCanceled", "(Z)V", "Ljava/lang/Boolean;", "setGlobalSolutionPublished", "(Ljava/lang/Boolean;)V", "getCreated", "setCreated", "Lcom/untis/mobile/substitutionplanning/model/PeriodTypeEnum;", "getPeriodType", "()Lcom/untis/mobile/substitutionplanning/model/PeriodTypeEnum;", "setPeriodType", "(Lcom/untis/mobile/substitutionplanning/model/PeriodTypeEnum;)V", "Ljava/util/List;", "getRooms", "()Ljava/util/List;", "setRooms", "(Ljava/util/List;)V", "J", "getWuId", "()J", "setWuId", "(J)V", "I", "getUnitOfDay", "()I", "setUnitOfDay", "(I)V", "getKlassen", "setKlassen", "getEndDateTime", "setEndDateTime", "getTeachers", "setTeachers", "setPending", "<init>", "(JLcom/untis/mobile/substitutionplanning/model/PeriodTypeEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Boolean;Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodDto
{
    @f
    private String created;
    @e
    private String endDateTime;
    private boolean isCanceled;
    @f
    private Boolean isGlobalSolutionPublished;
    @f
    private Boolean isPending;
    @e
    private List<PeriodKlasseDto> klassen;
    @f
    private PeriodTypeEnum periodType;
    @e
    private List<PeriodRoomDto> rooms;
    @e
    private String startDateTime;
    @f
    private SubjectRefDto subject;
    @e
    private List<PeriodTeacherDto> teachers;
    private int unitOfDay;
    private long wuId;
    
    public PeriodDto(final long wuId, @f final PeriodTypeEnum periodType, @e final String startDateTime, @e final String endDateTime, @f final String created, final boolean isCanceled, @f final Boolean isGlobalSolutionPublished, final int unitOfDay, @f final Boolean isPending, @f final SubjectRefDto subject, @e final List<PeriodTeacherDto> teachers, @e final List<PeriodKlasseDto> klassen, @e final List<PeriodRoomDto> rooms) {
        k0.p(startDateTime, "startDateTime");
        k0.p(endDateTime, "endDateTime");
        k0.p(teachers, "teachers");
        k0.p(klassen, "klassen");
        k0.p(rooms, "rooms");
        this.wuId = wuId;
        this.periodType = periodType;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.created = created;
        this.isCanceled = isCanceled;
        this.isGlobalSolutionPublished = isGlobalSolutionPublished;
        this.unitOfDay = unitOfDay;
        this.isPending = isPending;
        this.subject = subject;
        this.teachers = teachers;
        this.klassen = klassen;
        this.rooms = rooms;
    }
    
    public final long component1() {
        return this.wuId;
    }
    
    @f
    public final SubjectRefDto component10() {
        return this.subject;
    }
    
    @e
    public final List<PeriodTeacherDto> component11() {
        return this.teachers;
    }
    
    @e
    public final List<PeriodKlasseDto> component12() {
        return this.klassen;
    }
    
    @e
    public final List<PeriodRoomDto> component13() {
        return this.rooms;
    }
    
    @f
    public final PeriodTypeEnum component2() {
        return this.periodType;
    }
    
    @e
    public final String component3() {
        return this.startDateTime;
    }
    
    @e
    public final String component4() {
        return this.endDateTime;
    }
    
    @f
    public final String component5() {
        return this.created;
    }
    
    public final boolean component6() {
        return this.isCanceled;
    }
    
    @f
    public final Boolean component7() {
        return this.isGlobalSolutionPublished;
    }
    
    public final int component8() {
        return this.unitOfDay;
    }
    
    @f
    public final Boolean component9() {
        return this.isPending;
    }
    
    @e
    public final PeriodDto copy(final long n, @f final PeriodTypeEnum periodTypeEnum, @e final String s, @e final String s2, @f final String s3, final boolean b, @f final Boolean b2, final int n2, @f final Boolean b3, @f final SubjectRefDto subjectRefDto, @e final List<PeriodTeacherDto> list, @e final List<PeriodKlasseDto> list2, @e final List<PeriodRoomDto> list3) {
        k0.p(s, "startDateTime");
        k0.p(s2, "endDateTime");
        k0.p(list, "teachers");
        k0.p(list2, "klassen");
        k0.p(list3, "rooms");
        return new PeriodDto(n, periodTypeEnum, s, s2, s3, b, b2, n2, b3, subjectRefDto, list, list2, list3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeriodDto)) {
            return false;
        }
        final PeriodDto periodDto = (PeriodDto)o;
        return this.wuId == periodDto.wuId && this.periodType == periodDto.periodType && k0.g(this.startDateTime, periodDto.startDateTime) && k0.g(this.endDateTime, periodDto.endDateTime) && k0.g(this.created, periodDto.created) && this.isCanceled == periodDto.isCanceled && k0.g(this.isGlobalSolutionPublished, periodDto.isGlobalSolutionPublished) && this.unitOfDay == periodDto.unitOfDay && k0.g(this.isPending, periodDto.isPending) && k0.g(this.subject, periodDto.subject) && k0.g(this.teachers, periodDto.teachers) && k0.g(this.klassen, periodDto.klassen) && k0.g(this.rooms, periodDto.rooms);
    }
    
    @f
    public final String getCreated() {
        return this.created;
    }
    
    @e
    public final String getEndDateTime() {
        return this.endDateTime;
    }
    
    @e
    public final List<PeriodKlasseDto> getKlassen() {
        return this.klassen;
    }
    
    @f
    public final PeriodTypeEnum getPeriodType() {
        return this.periodType;
    }
    
    @e
    public final List<PeriodRoomDto> getRooms() {
        return this.rooms;
    }
    
    @e
    public final String getStartDateTime() {
        return this.startDateTime;
    }
    
    @f
    public final SubjectRefDto getSubject() {
        return this.subject;
    }
    
    @e
    public final List<PeriodTeacherDto> getTeachers() {
        return this.teachers;
    }
    
    public final int getUnitOfDay() {
        return this.unitOfDay;
    }
    
    public final long getWuId() {
        return this.wuId;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.wuId);
        final PeriodTypeEnum periodType = this.periodType;
        int hashCode = 0;
        int hashCode2;
        if (periodType == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = periodType.hashCode();
        }
        final int hashCode3 = this.startDateTime.hashCode();
        final int hashCode4 = this.endDateTime.hashCode();
        final String created = this.created;
        int hashCode5;
        if (created == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = created.hashCode();
        }
        int isCanceled;
        if ((isCanceled = (this.isCanceled ? 1 : 0)) != 0) {
            isCanceled = 1;
        }
        final Boolean isGlobalSolutionPublished = this.isGlobalSolutionPublished;
        int hashCode6;
        if (isGlobalSolutionPublished == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = isGlobalSolutionPublished.hashCode();
        }
        final int unitOfDay = this.unitOfDay;
        final Boolean isPending = this.isPending;
        int hashCode7;
        if (isPending == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = isPending.hashCode();
        }
        final SubjectRefDto subject = this.subject;
        if (subject != null) {
            hashCode = subject.hashCode();
        }
        return (((((((((((a * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + isCanceled) * 31 + hashCode6) * 31 + unitOfDay) * 31 + hashCode7) * 31 + hashCode) * 31 + this.teachers.hashCode()) * 31 + this.klassen.hashCode()) * 31 + this.rooms.hashCode();
    }
    
    public final boolean isCanceled() {
        return this.isCanceled;
    }
    
    @f
    public final Boolean isGlobalSolutionPublished() {
        return this.isGlobalSolutionPublished;
    }
    
    @f
    public final Boolean isPending() {
        return this.isPending;
    }
    
    public final void setCanceled(final boolean isCanceled) {
        this.isCanceled = isCanceled;
    }
    
    public final void setCreated(@f final String created) {
        this.created = created;
    }
    
    public final void setEndDateTime(@e final String endDateTime) {
        k0.p(endDateTime, "<set-?>");
        this.endDateTime = endDateTime;
    }
    
    public final void setGlobalSolutionPublished(@f final Boolean isGlobalSolutionPublished) {
        this.isGlobalSolutionPublished = isGlobalSolutionPublished;
    }
    
    public final void setKlassen(@e final List<PeriodKlasseDto> klassen) {
        k0.p(klassen, "<set-?>");
        this.klassen = klassen;
    }
    
    public final void setPending(@f final Boolean isPending) {
        this.isPending = isPending;
    }
    
    public final void setPeriodType(@f final PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }
    
    public final void setRooms(@e final List<PeriodRoomDto> rooms) {
        k0.p(rooms, "<set-?>");
        this.rooms = rooms;
    }
    
    public final void setStartDateTime(@e final String startDateTime) {
        k0.p(startDateTime, "<set-?>");
        this.startDateTime = startDateTime;
    }
    
    public final void setSubject(@f final SubjectRefDto subject) {
        this.subject = subject;
    }
    
    public final void setTeachers(@e final List<PeriodTeacherDto> teachers) {
        k0.p(teachers, "<set-?>");
        this.teachers = teachers;
    }
    
    public final void setUnitOfDay(final int unitOfDay) {
        this.unitOfDay = unitOfDay;
    }
    
    public final void setWuId(final long wuId) {
        this.wuId = wuId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodDto(wuId=");
        sb.append(this.wuId);
        sb.append(", periodType=");
        sb.append(this.periodType);
        sb.append(", startDateTime=");
        sb.append(this.startDateTime);
        sb.append(", endDateTime=");
        sb.append(this.endDateTime);
        sb.append(", created=");
        sb.append((Object)this.created);
        sb.append(", isCanceled=");
        sb.append(this.isCanceled);
        sb.append(", isGlobalSolutionPublished=");
        sb.append(this.isGlobalSolutionPublished);
        sb.append(", unitOfDay=");
        sb.append(this.unitOfDay);
        sb.append(", isPending=");
        sb.append(this.isPending);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", teachers=");
        sb.append(this.teachers);
        sb.append(", klassen=");
        sb.append(this.klassen);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(')');
        return sb.toString();
    }
}
