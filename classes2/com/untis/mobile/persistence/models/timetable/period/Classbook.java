// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendance;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import java.util.List;
import org.jetbrains.annotations.e;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u0002\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020 0\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0002\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b5\u00106R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0005\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR(\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0005\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR(\u0010.\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0005\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR(\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0005\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\t¨\u00067" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "events", "Ljava/util/Set;", "getEvents", "()Ljava/util/Set;", "setEvents", "(Ljava/util/Set;)V", "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "exemptions", "getExemptions", "setExemptions", "", "synced", "Z", "getSynced", "()Z", "setSynced", "(Z)V", "", "Lcom/untis/mobile/persistence/models/classbook/duty/ClassRole;", "classRoles", "Ljava/util/List;", "getClassRoles", "()Ljava/util/List;", "setClassRoles", "(Ljava/util/List;)V", "absencesChecked", "getAbsencesChecked", "setAbsencesChecked", "", "id", "J", "getId", "()J", "setId", "(J)V", "students", "getStudents", "setStudents", "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendance;", "prioritizedAttendances", "getPrioritizedAttendances", "setPrioritizedAttendances", "absences", "getAbsences", "setAbsences", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWorks", "getHomeWorks", "setHomeWorks", "<init>", "(JLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Classbook
{
    @e
    private Set<Long> absences;
    private boolean absencesChecked;
    @e
    private List<ClassRole> classRoles;
    @e
    private Set<Event> events;
    @e
    private Set<Exemption> exemptions;
    @e
    private Set<HomeWork> homeWorks;
    private long id;
    @e
    private Set<PrioritizedAttendance> prioritizedAttendances;
    @e
    private Set<Long> students;
    private boolean synced;
    
    public Classbook() {
        this(0L, null, null, null, null, null, null, false, false, null, 1023, null);
    }
    
    public Classbook(final long id, @e final Set<Long> students, @e final Set<Long> absences, @e final Set<Event> events, @e final Set<Exemption> exemptions, @e final Set<PrioritizedAttendance> prioritizedAttendances, @e final Set<HomeWork> homeWorks, final boolean absencesChecked, final boolean synced, @e final List<ClassRole> classRoles) {
        k0.p(students, "students");
        k0.p(absences, "absences");
        k0.p(events, "events");
        k0.p(exemptions, "exemptions");
        k0.p(prioritizedAttendances, "prioritizedAttendances");
        k0.p(homeWorks, "homeWorks");
        k0.p(classRoles, "classRoles");
        this.id = id;
        this.students = students;
        this.absences = absences;
        this.events = events;
        this.exemptions = exemptions;
        this.prioritizedAttendances = prioritizedAttendances;
        this.homeWorks = homeWorks;
        this.absencesChecked = absencesChecked;
        this.synced = synced;
        this.classRoles = classRoles;
    }
    
    @e
    public final Set<Long> getAbsences() {
        return this.absences;
    }
    
    public final boolean getAbsencesChecked() {
        return this.absencesChecked;
    }
    
    @e
    public final List<ClassRole> getClassRoles() {
        return this.classRoles;
    }
    
    @e
    public final Set<Event> getEvents() {
        return this.events;
    }
    
    @e
    public final Set<Exemption> getExemptions() {
        return this.exemptions;
    }
    
    @e
    public final Set<HomeWork> getHomeWorks() {
        return this.homeWorks;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final Set<PrioritizedAttendance> getPrioritizedAttendances() {
        return this.prioritizedAttendances;
    }
    
    @e
    public final Set<Long> getStudents() {
        return this.students;
    }
    
    public final boolean getSynced() {
        return this.synced;
    }
    
    public final void setAbsences(@e final Set<Long> absences) {
        k0.p(absences, "<set-?>");
        this.absences = absences;
    }
    
    public final void setAbsencesChecked(final boolean absencesChecked) {
        this.absencesChecked = absencesChecked;
    }
    
    public final void setClassRoles(@e final List<ClassRole> classRoles) {
        k0.p(classRoles, "<set-?>");
        this.classRoles = classRoles;
    }
    
    public final void setEvents(@e final Set<Event> events) {
        k0.p(events, "<set-?>");
        this.events = events;
    }
    
    public final void setExemptions(@e final Set<Exemption> exemptions) {
        k0.p(exemptions, "<set-?>");
        this.exemptions = exemptions;
    }
    
    public final void setHomeWorks(@e final Set<HomeWork> homeWorks) {
        k0.p(homeWorks, "<set-?>");
        this.homeWorks = homeWorks;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setPrioritizedAttendances(@e final Set<PrioritizedAttendance> prioritizedAttendances) {
        k0.p(prioritizedAttendances, "<set-?>");
        this.prioritizedAttendances = prioritizedAttendances;
    }
    
    public final void setStudents(@e final Set<Long> students) {
        k0.p(students, "<set-?>");
        this.students = students;
    }
    
    public final void setSynced(final boolean synced) {
        this.synced = synced;
    }
}
