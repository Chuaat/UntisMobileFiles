// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J?\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010(\u001a\u0004\b\u000e\u0010)\"\u0004\b*\u0010+¨\u0006." }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodTeacherDto;", "", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "component1", "component2", "Lcom/untis/mobile/substitutionplanning/model/ConflictType;", "component3", "", "component4", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDto;", "component5", "currentTeacher", "removedTeacher", "conflictState", "isPublished", "askTeacherRequest", "copy", "", "toString", "", "hashCode", "other", "equals", "Lcom/untis/mobile/substitutionplanning/model/ConflictType;", "getConflictState", "()Lcom/untis/mobile/substitutionplanning/model/ConflictType;", "setConflictState", "(Lcom/untis/mobile/substitutionplanning/model/ConflictType;)V", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "getRemovedTeacher", "()Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "setRemovedTeacher", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;)V", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDto;", "getAskTeacherRequest", "()Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDto;", "setAskTeacherRequest", "(Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDto;)V", "getCurrentTeacher", "setCurrentTeacher", "Z", "()Z", "setPublished", "(Z)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Lcom/untis/mobile/substitutionplanning/model/ConflictType;ZLcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDto;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodTeacherDto
{
    @e
    private AskTeacherStatsDto askTeacherRequest;
    @e
    private ConflictType conflictState;
    @f
    private TeacherRefDto currentTeacher;
    private boolean isPublished;
    @f
    private TeacherRefDto removedTeacher;
    
    public PeriodTeacherDto(@f final TeacherRefDto currentTeacher, @f final TeacherRefDto removedTeacher, @e final ConflictType conflictState, final boolean isPublished, @e final AskTeacherStatsDto askTeacherRequest) {
        k0.p(conflictState, "conflictState");
        k0.p(askTeacherRequest, "askTeacherRequest");
        this.currentTeacher = currentTeacher;
        this.removedTeacher = removedTeacher;
        this.conflictState = conflictState;
        this.isPublished = isPublished;
        this.askTeacherRequest = askTeacherRequest;
    }
    
    @f
    public final TeacherRefDto component1() {
        return this.currentTeacher;
    }
    
    @f
    public final TeacherRefDto component2() {
        return this.removedTeacher;
    }
    
    @e
    public final ConflictType component3() {
        return this.conflictState;
    }
    
    public final boolean component4() {
        return this.isPublished;
    }
    
    @e
    public final AskTeacherStatsDto component5() {
        return this.askTeacherRequest;
    }
    
    @e
    public final PeriodTeacherDto copy(@f final TeacherRefDto teacherRefDto, @f final TeacherRefDto teacherRefDto2, @e final ConflictType conflictType, final boolean b, @e final AskTeacherStatsDto askTeacherStatsDto) {
        k0.p(conflictType, "conflictState");
        k0.p(askTeacherStatsDto, "askTeacherRequest");
        return new PeriodTeacherDto(teacherRefDto, teacherRefDto2, conflictType, b, askTeacherStatsDto);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeriodTeacherDto)) {
            return false;
        }
        final PeriodTeacherDto periodTeacherDto = (PeriodTeacherDto)o;
        return k0.g(this.currentTeacher, periodTeacherDto.currentTeacher) && k0.g(this.removedTeacher, periodTeacherDto.removedTeacher) && this.conflictState == periodTeacherDto.conflictState && this.isPublished == periodTeacherDto.isPublished && k0.g(this.askTeacherRequest, periodTeacherDto.askTeacherRequest);
    }
    
    @e
    public final AskTeacherStatsDto getAskTeacherRequest() {
        return this.askTeacherRequest;
    }
    
    @e
    public final ConflictType getConflictState() {
        return this.conflictState;
    }
    
    @f
    public final TeacherRefDto getCurrentTeacher() {
        return this.currentTeacher;
    }
    
    @f
    public final TeacherRefDto getRemovedTeacher() {
        return this.removedTeacher;
    }
    
    @Override
    public int hashCode() {
        final TeacherRefDto currentTeacher = this.currentTeacher;
        int hashCode = 0;
        int hashCode2;
        if (currentTeacher == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = currentTeacher.hashCode();
        }
        final TeacherRefDto removedTeacher = this.removedTeacher;
        if (removedTeacher != null) {
            hashCode = removedTeacher.hashCode();
        }
        final int hashCode3 = this.conflictState.hashCode();
        int isPublished;
        if ((isPublished = (this.isPublished ? 1 : 0)) != 0) {
            isPublished = 1;
        }
        return (((hashCode2 * 31 + hashCode) * 31 + hashCode3) * 31 + isPublished) * 31 + this.askTeacherRequest.hashCode();
    }
    
    public final boolean isPublished() {
        return this.isPublished;
    }
    
    public final void setAskTeacherRequest(@e final AskTeacherStatsDto askTeacherRequest) {
        k0.p(askTeacherRequest, "<set-?>");
        this.askTeacherRequest = askTeacherRequest;
    }
    
    public final void setConflictState(@e final ConflictType conflictState) {
        k0.p(conflictState, "<set-?>");
        this.conflictState = conflictState;
    }
    
    public final void setCurrentTeacher(@f final TeacherRefDto currentTeacher) {
        this.currentTeacher = currentTeacher;
    }
    
    public final void setPublished(final boolean isPublished) {
        this.isPublished = isPublished;
    }
    
    public final void setRemovedTeacher(@f final TeacherRefDto removedTeacher) {
        this.removedTeacher = removedTeacher;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodTeacherDto(currentTeacher=");
        sb.append(this.currentTeacher);
        sb.append(", removedTeacher=");
        sb.append(this.removedTeacher);
        sb.append(", conflictState=");
        sb.append(this.conflictState);
        sb.append(", isPublished=");
        sb.append(this.isPublished);
        sb.append(", askTeacherRequest=");
        sb.append(this.askTeacherRequest);
        sb.append(')');
        return sb.toString();
    }
}
