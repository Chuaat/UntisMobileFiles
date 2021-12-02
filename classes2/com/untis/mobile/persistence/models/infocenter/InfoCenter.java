// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.infocenter.classlead.ClassLead;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bw\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0002\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002¢\u0006\u0004\b\"\u0010#R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u0006$" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenter;", "", "", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "parentdays", "Ljava/util/List;", "getParentdays", "()Ljava/util/List;", "setParentdays", "(Ljava/util/List;)V", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterHomework;", "homeworks", "getHomeworks", "setHomeworks", "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLead;", "classLeads", "getClassLeads", "setClassLeads", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExam;", "exams", "getExams", "setExams", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHour;", "contactHours", "getContactHours", "setContactHours", "Lcom/untis/mobile/persistence/models/infocenter/Lesson;", "lessons", "getLessons", "setLessons", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterStudentAbsence;", "studentAbsences", "getStudentAbsences", "setStudentAbsences", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenter
{
    @e
    private List<ClassLead> classLeads;
    @e
    private List<InfoCenterContactHour> contactHours;
    @e
    private List<InfoCenterExam> exams;
    @e
    private List<InfoCenterHomework> homeworks;
    @e
    private List<Lesson> lessons;
    @e
    private List<ParentDay> parentdays;
    @e
    private List<InfoCenterStudentAbsence> studentAbsences;
    
    public InfoCenter() {
        this(null, null, null, null, null, null, null, 127, null);
    }
    
    public InfoCenter(@e final List<InfoCenterContactHour> contactHours, @e final List<ParentDay> parentdays, @e final List<InfoCenterHomework> homeworks, @e final List<Lesson> lessons, @e final List<InfoCenterExam> exams, @e final List<InfoCenterStudentAbsence> studentAbsences, @e final List<ClassLead> classLeads) {
        k0.p(contactHours, "contactHours");
        k0.p(parentdays, "parentdays");
        k0.p(homeworks, "homeworks");
        k0.p(lessons, "lessons");
        k0.p(exams, "exams");
        k0.p(studentAbsences, "studentAbsences");
        k0.p(classLeads, "classLeads");
        this.contactHours = contactHours;
        this.parentdays = parentdays;
        this.homeworks = homeworks;
        this.lessons = lessons;
        this.exams = exams;
        this.studentAbsences = studentAbsences;
        this.classLeads = classLeads;
    }
    
    @e
    public final List<ClassLead> getClassLeads() {
        return this.classLeads;
    }
    
    @e
    public final List<InfoCenterContactHour> getContactHours() {
        return this.contactHours;
    }
    
    @e
    public final List<InfoCenterExam> getExams() {
        return this.exams;
    }
    
    @e
    public final List<InfoCenterHomework> getHomeworks() {
        return this.homeworks;
    }
    
    @e
    public final List<Lesson> getLessons() {
        return this.lessons;
    }
    
    @e
    public final List<ParentDay> getParentdays() {
        return this.parentdays;
    }
    
    @e
    public final List<InfoCenterStudentAbsence> getStudentAbsences() {
        return this.studentAbsences;
    }
    
    public final void setClassLeads(@e final List<ClassLead> classLeads) {
        k0.p(classLeads, "<set-?>");
        this.classLeads = classLeads;
    }
    
    public final void setContactHours(@e final List<InfoCenterContactHour> contactHours) {
        k0.p(contactHours, "<set-?>");
        this.contactHours = contactHours;
    }
    
    public final void setExams(@e final List<InfoCenterExam> exams) {
        k0.p(exams, "<set-?>");
        this.exams = exams;
    }
    
    public final void setHomeworks(@e final List<InfoCenterHomework> homeworks) {
        k0.p(homeworks, "<set-?>");
        this.homeworks = homeworks;
    }
    
    public final void setLessons(@e final List<Lesson> lessons) {
        k0.p(lessons, "<set-?>");
        this.lessons = lessons;
    }
    
    public final void setParentdays(@e final List<ParentDay> parentdays) {
        k0.p(parentdays, "<set-?>");
        this.parentdays = parentdays;
    }
    
    public final void setStudentAbsences(@e final List<InfoCenterStudentAbsence> studentAbsences) {
        k0.p(studentAbsences, "<set-?>");
        this.studentAbsences = studentAbsences;
    }
}
