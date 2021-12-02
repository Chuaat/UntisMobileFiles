// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.update;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.network.model.period.CalendarPeriodUpdateFile;
import java.util.List;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.utils.jsonadapter.a;
import com.google.gson.annotations.JsonAdapter;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bK\u0010LJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0099\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001J\t\u0010 \u001a\u00020\u001fH\u00d6\u0001J\t\u0010\"\u001a\u00020!H\u00d6\u0001J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R$\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u00102\u001a\u0004\b\u0014\u00103\"\u0004\b4\u00105R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010&\u001a\u0004\b6\u0010(\"\u0004\b7\u0010*R$\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010&\u001a\u0004\bB\u0010(\"\u0004\bC\u0010*R$\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010=\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010A¨\u0006M" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdate;", "", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancel;", "component1", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateNote;", "component2", "", "Lcom/untis/mobile/calendar/network/model/period/CalendarPeriodUpdateFile;", "component3", "component4", "component5", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateRoom;", "component6", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateTeacher;", "component7", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateTeachingContent;", "component8", "component9", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateOnlineLesson;", "component10", "isCancelled", "notesAll", "notesAllFiles", "notesStaff", "notesStaffFiles", "rooms", "teachers", "teachingContent", "teachingContentFiles", "onlineLessonLink", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getNotesStaffFiles", "()Ljava/util/List;", "setNotesStaffFiles", "(Ljava/util/List;)V", "getTeachers", "setTeachers", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateOnlineLesson;", "getOnlineLessonLink", "()Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateOnlineLesson;", "setOnlineLessonLink", "(Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateOnlineLesson;)V", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancel;", "()Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancel;", "setCancelled", "(Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancel;)V", "getNotesAllFiles", "setNotesAllFiles", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateTeachingContent;", "getTeachingContent", "()Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateTeachingContent;", "setTeachingContent", "(Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateTeachingContent;)V", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateNote;", "getNotesAll", "()Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateNote;", "setNotesAll", "(Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateNote;)V", "getTeachingContentFiles", "setTeachingContentFiles", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateRoom;", "getRooms", "()Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateRoom;", "setRooms", "(Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateRoom;)V", "getNotesStaff", "setNotesStaff", "<init>", "(Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancel;Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateNote;Ljava/util/List;Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateNote;Ljava/util/List;Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateRoom;Ljava/util/List;Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateTeachingContent;Ljava/util/List;Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateOnlineLesson;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodUpdate
{
    @JsonAdapter(a.class)
    @SerializedName("isCancelled")
    @f
    private CalendarPeriodUpdateCancel isCancelled;
    @SerializedName("notesAll")
    @f
    private CalendarPeriodUpdateNote notesAll;
    @SerializedName("notesAllFiles")
    @f
    private List<CalendarPeriodUpdateFile> notesAllFiles;
    @SerializedName("notesStaff")
    @f
    private CalendarPeriodUpdateNote notesStaff;
    @SerializedName("notesStaffFiles")
    @f
    private List<CalendarPeriodUpdateFile> notesStaffFiles;
    @SerializedName("videoCall")
    @f
    private CalendarPeriodUpdateOnlineLesson onlineLessonLink;
    @SerializedName("rooms")
    @f
    private CalendarPeriodUpdateRoom rooms;
    @SerializedName("teachers")
    @f
    private List<CalendarPeriodUpdateTeacher> teachers;
    @SerializedName("teachingContent")
    @f
    private CalendarPeriodUpdateTeachingContent teachingContent;
    @SerializedName("teachingContentFiles")
    @f
    private List<CalendarPeriodUpdateFile> teachingContentFiles;
    
    public CalendarPeriodUpdate() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
    
    public CalendarPeriodUpdate(@f final CalendarPeriodUpdateCancel isCancelled, @f final CalendarPeriodUpdateNote notesAll, @f final List<CalendarPeriodUpdateFile> notesAllFiles, @f final CalendarPeriodUpdateNote notesStaff, @f final List<CalendarPeriodUpdateFile> notesStaffFiles, @f final CalendarPeriodUpdateRoom rooms, @f final List<CalendarPeriodUpdateTeacher> teachers, @f final CalendarPeriodUpdateTeachingContent teachingContent, @f final List<CalendarPeriodUpdateFile> teachingContentFiles, @f final CalendarPeriodUpdateOnlineLesson onlineLessonLink) {
        this.isCancelled = isCancelled;
        this.notesAll = notesAll;
        this.notesAllFiles = notesAllFiles;
        this.notesStaff = notesStaff;
        this.notesStaffFiles = notesStaffFiles;
        this.rooms = rooms;
        this.teachers = teachers;
        this.teachingContent = teachingContent;
        this.teachingContentFiles = teachingContentFiles;
        this.onlineLessonLink = onlineLessonLink;
    }
    
    @f
    public final CalendarPeriodUpdateCancel component1() {
        return this.isCancelled;
    }
    
    @f
    public final CalendarPeriodUpdateOnlineLesson component10() {
        return this.onlineLessonLink;
    }
    
    @f
    public final CalendarPeriodUpdateNote component2() {
        return this.notesAll;
    }
    
    @f
    public final List<CalendarPeriodUpdateFile> component3() {
        return this.notesAllFiles;
    }
    
    @f
    public final CalendarPeriodUpdateNote component4() {
        return this.notesStaff;
    }
    
    @f
    public final List<CalendarPeriodUpdateFile> component5() {
        return this.notesStaffFiles;
    }
    
    @f
    public final CalendarPeriodUpdateRoom component6() {
        return this.rooms;
    }
    
    @f
    public final List<CalendarPeriodUpdateTeacher> component7() {
        return this.teachers;
    }
    
    @f
    public final CalendarPeriodUpdateTeachingContent component8() {
        return this.teachingContent;
    }
    
    @f
    public final List<CalendarPeriodUpdateFile> component9() {
        return this.teachingContentFiles;
    }
    
    @e
    public final CalendarPeriodUpdate copy(@f final CalendarPeriodUpdateCancel calendarPeriodUpdateCancel, @f final CalendarPeriodUpdateNote calendarPeriodUpdateNote, @f final List<CalendarPeriodUpdateFile> list, @f final CalendarPeriodUpdateNote calendarPeriodUpdateNote2, @f final List<CalendarPeriodUpdateFile> list2, @f final CalendarPeriodUpdateRoom calendarPeriodUpdateRoom, @f final List<CalendarPeriodUpdateTeacher> list3, @f final CalendarPeriodUpdateTeachingContent calendarPeriodUpdateTeachingContent, @f final List<CalendarPeriodUpdateFile> list4, @f final CalendarPeriodUpdateOnlineLesson calendarPeriodUpdateOnlineLesson) {
        return new CalendarPeriodUpdate(calendarPeriodUpdateCancel, calendarPeriodUpdateNote, list, calendarPeriodUpdateNote2, list2, calendarPeriodUpdateRoom, list3, calendarPeriodUpdateTeachingContent, list4, calendarPeriodUpdateOnlineLesson);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodUpdate)) {
            return false;
        }
        final CalendarPeriodUpdate calendarPeriodUpdate = (CalendarPeriodUpdate)o;
        return k0.g(this.isCancelled, calendarPeriodUpdate.isCancelled) && k0.g(this.notesAll, calendarPeriodUpdate.notesAll) && k0.g(this.notesAllFiles, calendarPeriodUpdate.notesAllFiles) && k0.g(this.notesStaff, calendarPeriodUpdate.notesStaff) && k0.g(this.notesStaffFiles, calendarPeriodUpdate.notesStaffFiles) && k0.g(this.rooms, calendarPeriodUpdate.rooms) && k0.g(this.teachers, calendarPeriodUpdate.teachers) && k0.g(this.teachingContent, calendarPeriodUpdate.teachingContent) && k0.g(this.teachingContentFiles, calendarPeriodUpdate.teachingContentFiles) && k0.g(this.onlineLessonLink, calendarPeriodUpdate.onlineLessonLink);
    }
    
    @f
    public final CalendarPeriodUpdateNote getNotesAll() {
        return this.notesAll;
    }
    
    @f
    public final List<CalendarPeriodUpdateFile> getNotesAllFiles() {
        return this.notesAllFiles;
    }
    
    @f
    public final CalendarPeriodUpdateNote getNotesStaff() {
        return this.notesStaff;
    }
    
    @f
    public final List<CalendarPeriodUpdateFile> getNotesStaffFiles() {
        return this.notesStaffFiles;
    }
    
    @f
    public final CalendarPeriodUpdateOnlineLesson getOnlineLessonLink() {
        return this.onlineLessonLink;
    }
    
    @f
    public final CalendarPeriodUpdateRoom getRooms() {
        return this.rooms;
    }
    
    @f
    public final List<CalendarPeriodUpdateTeacher> getTeachers() {
        return this.teachers;
    }
    
    @f
    public final CalendarPeriodUpdateTeachingContent getTeachingContent() {
        return this.teachingContent;
    }
    
    @f
    public final List<CalendarPeriodUpdateFile> getTeachingContentFiles() {
        return this.teachingContentFiles;
    }
    
    @Override
    public int hashCode() {
        final CalendarPeriodUpdateCancel isCancelled = this.isCancelled;
        int hashCode = 0;
        int hashCode2;
        if (isCancelled == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = isCancelled.hashCode();
        }
        final CalendarPeriodUpdateNote notesAll = this.notesAll;
        int hashCode3;
        if (notesAll == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = notesAll.hashCode();
        }
        final List<CalendarPeriodUpdateFile> notesAllFiles = this.notesAllFiles;
        int hashCode4;
        if (notesAllFiles == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = notesAllFiles.hashCode();
        }
        final CalendarPeriodUpdateNote notesStaff = this.notesStaff;
        int hashCode5;
        if (notesStaff == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = notesStaff.hashCode();
        }
        final List<CalendarPeriodUpdateFile> notesStaffFiles = this.notesStaffFiles;
        int hashCode6;
        if (notesStaffFiles == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = notesStaffFiles.hashCode();
        }
        final CalendarPeriodUpdateRoom rooms = this.rooms;
        int hashCode7;
        if (rooms == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = rooms.hashCode();
        }
        final List<CalendarPeriodUpdateTeacher> teachers = this.teachers;
        int hashCode8;
        if (teachers == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = teachers.hashCode();
        }
        final CalendarPeriodUpdateTeachingContent teachingContent = this.teachingContent;
        int hashCode9;
        if (teachingContent == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = teachingContent.hashCode();
        }
        final List<CalendarPeriodUpdateFile> teachingContentFiles = this.teachingContentFiles;
        int hashCode10;
        if (teachingContentFiles == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = teachingContentFiles.hashCode();
        }
        final CalendarPeriodUpdateOnlineLesson onlineLessonLink = this.onlineLessonLink;
        if (onlineLessonLink != null) {
            hashCode = onlineLessonLink.hashCode();
        }
        return ((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode;
    }
    
    @f
    public final CalendarPeriodUpdateCancel isCancelled() {
        return this.isCancelled;
    }
    
    public final void setCancelled(@f final CalendarPeriodUpdateCancel isCancelled) {
        this.isCancelled = isCancelled;
    }
    
    public final void setNotesAll(@f final CalendarPeriodUpdateNote notesAll) {
        this.notesAll = notesAll;
    }
    
    public final void setNotesAllFiles(@f final List<CalendarPeriodUpdateFile> notesAllFiles) {
        this.notesAllFiles = notesAllFiles;
    }
    
    public final void setNotesStaff(@f final CalendarPeriodUpdateNote notesStaff) {
        this.notesStaff = notesStaff;
    }
    
    public final void setNotesStaffFiles(@f final List<CalendarPeriodUpdateFile> notesStaffFiles) {
        this.notesStaffFiles = notesStaffFiles;
    }
    
    public final void setOnlineLessonLink(@f final CalendarPeriodUpdateOnlineLesson onlineLessonLink) {
        this.onlineLessonLink = onlineLessonLink;
    }
    
    public final void setRooms(@f final CalendarPeriodUpdateRoom rooms) {
        this.rooms = rooms;
    }
    
    public final void setTeachers(@f final List<CalendarPeriodUpdateTeacher> teachers) {
        this.teachers = teachers;
    }
    
    public final void setTeachingContent(@f final CalendarPeriodUpdateTeachingContent teachingContent) {
        this.teachingContent = teachingContent;
    }
    
    public final void setTeachingContentFiles(@f final List<CalendarPeriodUpdateFile> teachingContentFiles) {
        this.teachingContentFiles = teachingContentFiles;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodUpdate(isCancelled=");
        sb.append(this.isCancelled);
        sb.append(", notesAll=");
        sb.append(this.notesAll);
        sb.append(", notesAllFiles=");
        sb.append(this.notesAllFiles);
        sb.append(", notesStaff=");
        sb.append(this.notesStaff);
        sb.append(", notesStaffFiles=");
        sb.append(this.notesStaffFiles);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(", teachers=");
        sb.append(this.teachers);
        sb.append(", teachingContent=");
        sb.append(this.teachingContent);
        sb.append(", teachingContentFiles=");
        sb.append(this.teachingContentFiles);
        sb.append(", onlineLessonLink=");
        sb.append(this.onlineLessonLink);
        sb.append(')');
        return sb.toString();
    }
}
