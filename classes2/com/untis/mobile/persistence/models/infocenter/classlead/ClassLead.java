// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter.classlead;

import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLead;", "", "", "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLeadStudentAbsence;", "absences", "Ljava/util/List;", "getAbsences", "()Ljava/util/List;", "setAbsences", "(Ljava/util/List;)V", "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLeadEvent;", "events", "getEvents", "setEvents", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klasse", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "getKlasse", "()Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "setKlasse", "(Lcom/untis/mobile/persistence/models/masterdata/Klasse;)V", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Klasse;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ClassLead
{
    @e
    private List<ClassLeadStudentAbsence> absences;
    @e
    private List<ClassLeadEvent> events;
    @e
    private Klasse klasse;
    
    public ClassLead(@e final Klasse klasse, @e final List<ClassLeadEvent> events, @e final List<ClassLeadStudentAbsence> absences) {
        k0.p(klasse, "klasse");
        k0.p(events, "events");
        k0.p(absences, "absences");
        this.klasse = klasse;
        this.events = events;
        this.absences = absences;
    }
    
    @e
    public final List<ClassLeadStudentAbsence> getAbsences() {
        return this.absences;
    }
    
    @e
    public final List<ClassLeadEvent> getEvents() {
        return this.events;
    }
    
    @e
    public final Klasse getKlasse() {
        return this.klasse;
    }
    
    public final void setAbsences(@e final List<ClassLeadStudentAbsence> absences) {
        k0.p(absences, "<set-?>");
        this.absences = absences;
    }
    
    public final void setEvents(@e final List<ClassLeadEvent> events) {
        k0.p(events, "<set-?>");
        this.events = events;
    }
    
    public final void setKlasse(@e final Klasse klasse) {
        k0.p(klasse, "<set-?>");
        this.klasse = klasse;
    }
}
