// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.common;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "EditRoom", "Move", "EditTeachers", "AccessClassRegister", "Cancel", "Recover", "EditResource", "WriteNotesAll", "WriteNotesStaff", "ReadHomework", "WriteHomework", "ReadStudentAbsence", "WriteStudentAbsence", "WriteLessonContent", "ReadClassRegisterEntries", "WriteClassRegisterEntries", "ReadMessengerGroup", "CreateMessengerGroup", "CreateExam", "EditExam", "AccessStudentAssignment", "AccessStudentPeriodAssignments", "WriteVideoCall", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum CalendarPeriodPermission
{
    AccessClassRegister("ACCESS_CLASS_REGISTER"), 
    AccessStudentAssignment("ACCESS_STUDENT_ASSIGN"), 
    AccessStudentPeriodAssignments("ACCESS_STUDENT_PERIOD_ASSIGNMENT"), 
    Cancel("CANCEL");
    
    @e
    public static final Companion Companion;
    
    CreateExam("CREATE_EXAM"), 
    CreateMessengerGroup("CREATE_MESSENGER_GROUP"), 
    EditExam("EDIT_EXAM"), 
    EditResource("EDIT_RESOURCE"), 
    EditRoom("EDIT_ROOM"), 
    EditTeachers("EDIT_TEACHERS"), 
    Move("MOVE"), 
    ReadClassRegisterEntries("READ_CLASSREGEVENT"), 
    ReadHomework("READ_HOMEWORK"), 
    ReadMessengerGroup("READ_MESSENGER_GROUP"), 
    ReadStudentAbsence("READ_STUD_ABSENCE"), 
    Recover("RECOVER"), 
    WriteClassRegisterEntries("WRITE_CLASS_REGISTER_ENTRIES"), 
    WriteHomework("WRITE_HOMEWORK"), 
    WriteLessonContent("WRITE_TEACHING_CONTENT"), 
    WriteNotesAll("WRITE_NOTES_ALL"), 
    WriteNotesStaff("WRITE_NOTES_STAFF"), 
    WriteStudentAbsence("WRITE_STUD_ABSENCE"), 
    WriteVideoCall("WRITE_VIDEO_CALL");
    
    @e
    private final String key;
    
    private static final /* synthetic */ CalendarPeriodPermission[] $values() {
        return new CalendarPeriodPermission[] { CalendarPeriodPermission.EditRoom, CalendarPeriodPermission.Move, CalendarPeriodPermission.EditTeachers, CalendarPeriodPermission.AccessClassRegister, CalendarPeriodPermission.Cancel, CalendarPeriodPermission.Recover, CalendarPeriodPermission.EditResource, CalendarPeriodPermission.WriteNotesAll, CalendarPeriodPermission.WriteNotesStaff, CalendarPeriodPermission.ReadHomework, CalendarPeriodPermission.WriteHomework, CalendarPeriodPermission.ReadStudentAbsence, CalendarPeriodPermission.WriteStudentAbsence, CalendarPeriodPermission.WriteLessonContent, CalendarPeriodPermission.ReadClassRegisterEntries, CalendarPeriodPermission.WriteClassRegisterEntries, CalendarPeriodPermission.ReadMessengerGroup, CalendarPeriodPermission.CreateMessengerGroup, CalendarPeriodPermission.CreateExam, CalendarPeriodPermission.EditExam, CalendarPeriodPermission.AccessStudentAssignment, CalendarPeriodPermission.AccessStudentPeriodAssignments, CalendarPeriodPermission.WriteVideoCall };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private CalendarPeriodPermission(final String key) {
        this.key = key;
    }
    
    @e
    public final String getKey() {
        return this.key;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission$Companion;", "", "", "key", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission;", "findByKey", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final CalendarPeriodPermission findByKey(@f final String s) {
            for (final CalendarPeriodPermission calendarPeriodPermission : CalendarPeriodPermission.values()) {
                if (k0.g(calendarPeriodPermission.getKey(), s)) {
                    return calendarPeriodPermission;
                }
            }
            return null;
        }
    }
}
