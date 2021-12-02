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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bX\u0010YJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J¦\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010#\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00106\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u00109R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010:\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010H\u001a\u0004\bI\u0010\u0004\"\u0004\bJ\u0010KR$\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00101\u001a\u0004\bL\u00103\"\u0004\bM\u00105R$\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010$\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Z" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "", "Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "component4", "Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "component5", "Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "component6", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "component7", "Lcom/untis/mobile/substitutionplanning/model/TeamTeacherDto;", "component8", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto;", "component9", "", "component10", "()Ljava/lang/Integer;", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;", "component11", "id", "startDateTime", "endDateTime", "klassen", "subject", "rooms", "originalTeacher", "teamTeachers", "solution", "unitOfDay", "askTeacherStats", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SolutionDto;Ljava/lang/Integer;Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;)Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "toString", "hashCode", "other", "", "equals", "Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "getSubject", "()Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "setSubject", "(Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;)V", "Ljava/lang/String;", "getStartDateTime", "()Ljava/lang/String;", "setStartDateTime", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getUnitOfDay", "setUnitOfDay", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getTeamTeachers", "()Ljava/util/List;", "setTeamTeachers", "(Ljava/util/List;)V", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto;", "getSolution", "()Lcom/untis/mobile/substitutionplanning/model/SolutionDto;", "setSolution", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto;)V", "getKlassen", "setKlassen", "getRooms", "setRooms", "Ljava/lang/Long;", "getId", "setId", "(Ljava/lang/Long;)V", "getEndDateTime", "setEndDateTime", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "getOriginalTeacher", "()Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "setOriginalTeacher", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;)V", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;", "getAskTeacherStats", "()Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;", "setAskTeacherStats", "(Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;)V", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/util/List;Lcom/untis/mobile/substitutionplanning/model/SolutionDto;Ljava/lang/Integer;Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodConflictDto
{
    @f
    private AskTeacherStatsDtoAskTeacherStatsDto askTeacherStats;
    @f
    private String endDateTime;
    @f
    private Long id;
    @f
    private List<KlasseRefDto> klassen;
    @f
    private TeacherRefDto originalTeacher;
    @f
    private List<RoomRefDto> rooms;
    @f
    private SolutionDto solution;
    @f
    private String startDateTime;
    @f
    private SubjectRefDto subject;
    @f
    private List<TeamTeacherDto> teamTeachers;
    @f
    private Integer unitOfDay;
    
    public PeriodConflictDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
    
    public PeriodConflictDto(@f final Long id, @f final String startDateTime, @f final String endDateTime, @f final List<KlasseRefDto> klassen, @f final SubjectRefDto subject, @f final List<RoomRefDto> rooms, @f final TeacherRefDto originalTeacher, @f final List<TeamTeacherDto> teamTeachers, @f final SolutionDto solution, @f final Integer unitOfDay, @f final AskTeacherStatsDtoAskTeacherStatsDto askTeacherStats) {
        this.id = id;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.klassen = klassen;
        this.subject = subject;
        this.rooms = rooms;
        this.originalTeacher = originalTeacher;
        this.teamTeachers = teamTeachers;
        this.solution = solution;
        this.unitOfDay = unitOfDay;
        this.askTeacherStats = askTeacherStats;
    }
    
    @f
    public final Long component1() {
        return this.id;
    }
    
    @f
    public final Integer component10() {
        return this.unitOfDay;
    }
    
    @f
    public final AskTeacherStatsDtoAskTeacherStatsDto component11() {
        return this.askTeacherStats;
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
    public final List<RoomRefDto> component6() {
        return this.rooms;
    }
    
    @f
    public final TeacherRefDto component7() {
        return this.originalTeacher;
    }
    
    @f
    public final List<TeamTeacherDto> component8() {
        return this.teamTeachers;
    }
    
    @f
    public final SolutionDto component9() {
        return this.solution;
    }
    
    @e
    public final PeriodConflictDto copy(@f final Long n, @f final String s, @f final String s2, @f final List<KlasseRefDto> list, @f final SubjectRefDto subjectRefDto, @f final List<RoomRefDto> list2, @f final TeacherRefDto teacherRefDto, @f final List<TeamTeacherDto> list3, @f final SolutionDto solutionDto, @f final Integer n2, @f final AskTeacherStatsDtoAskTeacherStatsDto askTeacherStatsDtoAskTeacherStatsDto) {
        return new PeriodConflictDto(n, s, s2, list, subjectRefDto, list2, teacherRefDto, list3, solutionDto, n2, askTeacherStatsDtoAskTeacherStatsDto);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeriodConflictDto)) {
            return false;
        }
        final PeriodConflictDto periodConflictDto = (PeriodConflictDto)o;
        return k0.g(this.id, periodConflictDto.id) && k0.g(this.startDateTime, periodConflictDto.startDateTime) && k0.g(this.endDateTime, periodConflictDto.endDateTime) && k0.g(this.klassen, periodConflictDto.klassen) && k0.g(this.subject, periodConflictDto.subject) && k0.g(this.rooms, periodConflictDto.rooms) && k0.g(this.originalTeacher, periodConflictDto.originalTeacher) && k0.g(this.teamTeachers, periodConflictDto.teamTeachers) && k0.g(this.solution, periodConflictDto.solution) && k0.g(this.unitOfDay, periodConflictDto.unitOfDay) && k0.g(this.askTeacherStats, periodConflictDto.askTeacherStats);
    }
    
    @f
    public final AskTeacherStatsDtoAskTeacherStatsDto getAskTeacherStats() {
        return this.askTeacherStats;
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
    public final TeacherRefDto getOriginalTeacher() {
        return this.originalTeacher;
    }
    
    @f
    public final List<RoomRefDto> getRooms() {
        return this.rooms;
    }
    
    @f
    public final SolutionDto getSolution() {
        return this.solution;
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
    public final List<TeamTeacherDto> getTeamTeachers() {
        return this.teamTeachers;
    }
    
    @f
    public final Integer getUnitOfDay() {
        return this.unitOfDay;
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
        final List<RoomRefDto> rooms = this.rooms;
        int hashCode7;
        if (rooms == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = rooms.hashCode();
        }
        final TeacherRefDto originalTeacher = this.originalTeacher;
        int hashCode8;
        if (originalTeacher == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = originalTeacher.hashCode();
        }
        final List<TeamTeacherDto> teamTeachers = this.teamTeachers;
        int hashCode9;
        if (teamTeachers == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = teamTeachers.hashCode();
        }
        final SolutionDto solution = this.solution;
        int hashCode10;
        if (solution == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = solution.hashCode();
        }
        final Integer unitOfDay = this.unitOfDay;
        int hashCode11;
        if (unitOfDay == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = unitOfDay.hashCode();
        }
        final AskTeacherStatsDtoAskTeacherStatsDto askTeacherStats = this.askTeacherStats;
        if (askTeacherStats != null) {
            hashCode = askTeacherStats.hashCode();
        }
        return (((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
    }
    
    public final void setAskTeacherStats(@f final AskTeacherStatsDtoAskTeacherStatsDto askTeacherStats) {
        this.askTeacherStats = askTeacherStats;
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
    
    public final void setOriginalTeacher(@f final TeacherRefDto originalTeacher) {
        this.originalTeacher = originalTeacher;
    }
    
    public final void setRooms(@f final List<RoomRefDto> rooms) {
        this.rooms = rooms;
    }
    
    public final void setSolution(@f final SolutionDto solution) {
        this.solution = solution;
    }
    
    public final void setStartDateTime(@f final String startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    public final void setSubject(@f final SubjectRefDto subject) {
        this.subject = subject;
    }
    
    public final void setTeamTeachers(@f final List<TeamTeacherDto> teamTeachers) {
        this.teamTeachers = teamTeachers;
    }
    
    public final void setUnitOfDay(@f final Integer unitOfDay) {
        this.unitOfDay = unitOfDay;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodConflictDto(id=");
        sb.append(this.id);
        sb.append(", startDateTime=");
        sb.append((Object)this.startDateTime);
        sb.append(", endDateTime=");
        sb.append((Object)this.endDateTime);
        sb.append(", klassen=");
        sb.append(this.klassen);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(", originalTeacher=");
        sb.append(this.originalTeacher);
        sb.append(", teamTeachers=");
        sb.append(this.teamTeachers);
        sb.append(", solution=");
        sb.append(this.solution);
        sb.append(", unitOfDay=");
        sb.append(this.unitOfDay);
        sb.append(", askTeacherStats=");
        sb.append(this.askTeacherStats);
        sb.append(')');
        return sb.toString();
    }
}
