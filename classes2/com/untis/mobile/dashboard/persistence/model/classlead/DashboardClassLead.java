// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.classlead;

import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import android.util.LongSparseArray;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\n\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0004\b,\u0010-R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\"\u0010\"\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011¨\u0006." }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassbookEvent;", "events", "Ljava/util/List;", "getEvents", "()Ljava/util/List;", "setEvents", "(Ljava/util/List;)V", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "referencedStudents", "Landroid/util/LongSparseArray;", "getReferencedStudents", "()Landroid/util/LongSparseArray;", "setReferencedStudents", "(Landroid/util/LongSparseArray;)V", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "referencedKlassen", "getReferencedKlassen", "setReferencedKlassen", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "referencedExcuseStates", "getReferencedExcuseStates", "setReferencedExcuseStates", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "referencedAbsenceReasons", "getReferencedAbsenceReasons", "setReferencedAbsenceReasons", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absences", "getAbsences", "setAbsences", "klasse", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "getKlasse", "()Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "setKlasse", "(Lcom/untis/mobile/persistence/models/masterdata/Klasse;)V", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "referencedEventReasons", "getReferencedEventReasons", "setReferencedEventReasons", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Klasse;Ljava/util/List;Ljava/util/List;Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardClassLead
{
    @e
    private List<DashboardStudentAbsence> absences;
    @e
    private List<DashboardClassbookEvent> events;
    @e
    private Klasse klasse;
    @e
    private LongSparseArray<AbsenceReason> referencedAbsenceReasons;
    @e
    private LongSparseArray<EventReason> referencedEventReasons;
    @e
    private LongSparseArray<ExcuseStatus> referencedExcuseStates;
    @e
    private LongSparseArray<Klasse> referencedKlassen;
    @e
    private LongSparseArray<Student> referencedStudents;
    
    public DashboardClassLead(@e final Klasse klasse, @e final List<DashboardClassbookEvent> events, @e final List<DashboardStudentAbsence> absences, @e final LongSparseArray<AbsenceReason> referencedAbsenceReasons, @e final LongSparseArray<EventReason> referencedEventReasons, @e final LongSparseArray<ExcuseStatus> referencedExcuseStates, @e final LongSparseArray<Student> referencedStudents, @e final LongSparseArray<Klasse> referencedKlassen) {
        k0.p(klasse, "klasse");
        k0.p(events, "events");
        k0.p(absences, "absences");
        k0.p(referencedAbsenceReasons, "referencedAbsenceReasons");
        k0.p(referencedEventReasons, "referencedEventReasons");
        k0.p(referencedExcuseStates, "referencedExcuseStates");
        k0.p(referencedStudents, "referencedStudents");
        k0.p(referencedKlassen, "referencedKlassen");
        this.klasse = klasse;
        this.events = events;
        this.absences = absences;
        this.referencedAbsenceReasons = referencedAbsenceReasons;
        this.referencedEventReasons = referencedEventReasons;
        this.referencedExcuseStates = referencedExcuseStates;
        this.referencedStudents = referencedStudents;
        this.referencedKlassen = referencedKlassen;
    }
    
    @e
    public final List<DashboardStudentAbsence> getAbsences() {
        return this.absences;
    }
    
    @e
    public final List<DashboardClassbookEvent> getEvents() {
        return this.events;
    }
    
    @e
    public final Klasse getKlasse() {
        return this.klasse;
    }
    
    @e
    public final LongSparseArray<AbsenceReason> getReferencedAbsenceReasons() {
        return this.referencedAbsenceReasons;
    }
    
    @e
    public final LongSparseArray<EventReason> getReferencedEventReasons() {
        return this.referencedEventReasons;
    }
    
    @e
    public final LongSparseArray<ExcuseStatus> getReferencedExcuseStates() {
        return this.referencedExcuseStates;
    }
    
    @e
    public final LongSparseArray<Klasse> getReferencedKlassen() {
        return this.referencedKlassen;
    }
    
    @e
    public final LongSparseArray<Student> getReferencedStudents() {
        return this.referencedStudents;
    }
    
    public final void setAbsences(@e final List<DashboardStudentAbsence> absences) {
        k0.p(absences, "<set-?>");
        this.absences = absences;
    }
    
    public final void setEvents(@e final List<DashboardClassbookEvent> events) {
        k0.p(events, "<set-?>");
        this.events = events;
    }
    
    public final void setKlasse(@e final Klasse klasse) {
        k0.p(klasse, "<set-?>");
        this.klasse = klasse;
    }
    
    public final void setReferencedAbsenceReasons(@e final LongSparseArray<AbsenceReason> referencedAbsenceReasons) {
        k0.p(referencedAbsenceReasons, "<set-?>");
        this.referencedAbsenceReasons = referencedAbsenceReasons;
    }
    
    public final void setReferencedEventReasons(@e final LongSparseArray<EventReason> referencedEventReasons) {
        k0.p(referencedEventReasons, "<set-?>");
        this.referencedEventReasons = referencedEventReasons;
    }
    
    public final void setReferencedExcuseStates(@e final LongSparseArray<ExcuseStatus> referencedExcuseStates) {
        k0.p(referencedExcuseStates, "<set-?>");
        this.referencedExcuseStates = referencedExcuseStates;
    }
    
    public final void setReferencedKlassen(@e final LongSparseArray<Klasse> referencedKlassen) {
        k0.p(referencedKlassen, "<set-?>");
        this.referencedKlassen = referencedKlassen;
    }
    
    public final void setReferencedStudents(@e final LongSparseArray<Student> referencedStudents) {
        k0.p(referencedStudents, "<set-?>");
        this.referencedStudents = referencedStudents;
    }
}
