// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import io.realm.l0;
import com.untis.mobile.utils.mapper.realmToModel.q;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.v;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.infocenter.classlead.ClassLead;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.dto.GetClassregDataResponse;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.joda.time.t;
import com.untis.mobile.persistence.models.infocenter.InfoCenterExcuse;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.infocenter.classlead.ClassLeadStudentAbsence;
import r4.d;
import r4.b;
import org.joda.time.c;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.infocenter.classlead.ClassLeadEvent;
import com.untis.mobile.api.common.classreg.UMClassRegEvent;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u0016\u0010 \u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006&" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/a;", "Lcom/untis/mobile/utils/mapper/common/a;", "Lcom/untis/mobile/api/common/classreg/UMClassRegEvent;", "umClassRegEvent", "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLeadEvent;", "k", "Lr4/b;", "event", "l", "Lr4/d;", "absence", "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLeadStudentAbsence;", "n", "Lr4/c;", "excuse", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "o", "q", "r", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klasse", "Lcom/untis/mobile/api/dto/GetClassregDataResponse;", "response", "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLead;", "i", "Lcom/untis/mobile/api/common/absence/UMStudentAbsence;", "umStudentAbsence", "m", "Lw4/d;", "realmKlasse", "Lr4/a;", "realmClassLead", "j", "classLead", "p", "s", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends com.untis.mobile.utils.mapper.common.a
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    private final ClassLeadEvent k(final UMClassRegEvent umClassRegEvent) {
        if (umClassRegEvent == null) {
            return null;
        }
        final long id = umClassRegEvent.id;
        final EntityType by = EntityType.Companion.findBy(umClassRegEvent.elementType);
        final long elementId = umClassRegEvent.elementId;
        final c c = this.c(umClassRegEvent.dateTime);
        if (c == null) {
            return null;
        }
        String text;
        if ((text = umClassRegEvent.text) == null) {
            text = "";
        }
        return new ClassLeadEvent(id, by, elementId, c, text, umClassRegEvent.eventReasonId);
    }
    
    private final ClassLeadEvent l(final b b) {
        return new ClassLeadEvent(b.w8(), EntityType.Companion.findBy(b.u8()), b.t8(), new c((Object)b.s8()), b.x8(), b.v8());
    }
    
    private final ClassLeadStudentAbsence n(final d d) {
        final long w8 = d.w8();
        final c k0 = c.K0(d.x8());
        kotlin.jvm.internal.k0.o(k0, "parse(absence.start)");
        final c k2 = c.K0(d.t8());
        kotlin.jvm.internal.k0.o(k2, "parse(absence.end)");
        return new ClassLeadStudentAbsence(w8, k0, k2, d.z8(), d.y8(), d.s8(), d.v8(), this.o(d.u8()));
    }
    
    private final InfoCenterExcuse o(final r4.c c) {
        if (c == null) {
            return null;
        }
        final long u8 = c.u8();
        final long t8 = c.t8();
        final String w8 = c.w8();
        final long v8 = c.v8();
        final t c2 = t.c0(c.s8());
        k0.o(c2, "parse(excuse.date)");
        return new InfoCenterExcuse(u8, t8, w8, v8, c2);
    }
    
    private final b q(final ClassLeadEvent classLeadEvent) {
        final long id = classLeadEvent.getId();
        final int webuntisId = classLeadEvent.getEntityType().getWebuntisId();
        final long entityId = classLeadEvent.getEntityId();
        final String string = ((org.joda.time.base.a)classLeadEvent.getTimestamp()).toString();
        k0.o(string, "event.timestamp.toString()");
        return new b(id, webuntisId, entityId, string, classLeadEvent.getText(), classLeadEvent.getEventReasonId());
    }
    
    private final r4.c r(final InfoCenterExcuse infoCenterExcuse) {
        if (infoCenterExcuse == null) {
            return null;
        }
        final long id = infoCenterExcuse.getId();
        final long excuseStatusId = infoCenterExcuse.getExcuseStatusId();
        final String text = infoCenterExcuse.getText();
        final long number = infoCenterExcuse.getNumber();
        final String string = infoCenterExcuse.getDate().toString();
        k0.o(string, "excuse.date.toString()");
        return new r4.c(id, excuseStatusId, text, number, string);
    }
    
    @f
    public final ClassLead i(@e final Klasse klasse, @f final GetClassregDataResponse getClassregDataResponse) {
        k0.p(klasse, "klasse");
        final List<ClassLeadEvent> list = null;
        if (getClassregDataResponse == null) {
            return null;
        }
        final List<UMStudentAbsence> absences = getClassregDataResponse.absences;
        ArrayList<ClassLeadStudentAbsence> list2;
        if (absences == null) {
            list2 = null;
        }
        else {
            final ArrayList<ClassLeadStudentAbsence> list3 = new ArrayList<ClassLeadStudentAbsence>();
            final Iterator<Object> iterator = absences.iterator();
            while (true) {
                list2 = list3;
                if (!iterator.hasNext()) {
                    break;
                }
                final ClassLeadStudentAbsence m = com.untis.mobile.utils.mapper.realmToModel.infocenter.a.a.m(iterator.next());
                if (m == null) {
                    continue;
                }
                list3.add(m);
            }
        }
        List<ClassLeadStudentAbsence> e;
        if ((e = list2) == null) {
            e = v.E();
        }
        final List<UMClassRegEvent> classRegEvents = getClassregDataResponse.classRegEvents;
        List<ClassLeadEvent> list4;
        if (classRegEvents == null) {
            list4 = list;
        }
        else {
            final ArrayList<ClassLeadEvent> list5 = new ArrayList<ClassLeadEvent>();
            final Iterator<Object> iterator2 = classRegEvents.iterator();
            while (true) {
                list4 = list5;
                if (!iterator2.hasNext()) {
                    break;
                }
                final ClassLeadEvent k = com.untis.mobile.utils.mapper.realmToModel.infocenter.a.a.k(iterator2.next());
                if (k == null) {
                    continue;
                }
                list5.add(k);
            }
        }
        List<ClassLeadEvent> e2;
        if ((e2 = list4) == null) {
            e2 = v.E();
        }
        return new ClassLead(klasse, e2, e);
    }
    
    @e
    public final ClassLead j(@e final w4.d d, @e final r4.a a) {
        k0.p(d, "realmKlasse");
        k0.p(a, "realmClassLead");
        final Klasse b = q.a.b(d);
        final l0<b> t8 = a.t8();
        final ArrayList list = new ArrayList<ClassLeadEvent>(v.Y((Iterable<?>)t8, 10));
        for (final b b2 : t8) {
            final a a2 = a.a;
            k0.o(b2, "it");
            list.add(a2.l(b2));
        }
        final l0<d> s8 = a.s8();
        final ArrayList list2 = new ArrayList<ClassLeadStudentAbsence>(v.Y((Iterable<?>)s8, 10));
        for (final d d2 : s8) {
            final a a3 = a.a;
            k0.o(d2, "it");
            list2.add(a3.n(d2));
        }
        return new ClassLead(b, (List<ClassLeadEvent>)list, (List<ClassLeadStudentAbsence>)list2);
    }
    
    @f
    public final ClassLeadStudentAbsence m(@f final UMStudentAbsence umStudentAbsence) {
        if (umStudentAbsence == null) {
            return null;
        }
        final c c = this.c(umStudentAbsence.startDateTime);
        if (c == null) {
            return null;
        }
        final c c2 = this.c(umStudentAbsence.endDateTime);
        if (c2 == null) {
            return null;
        }
        if (((org.joda.time.base.c)c).X4((org.joda.time.l0)c2)) {
            return null;
        }
        if (((org.joda.time.base.c)c).R((org.joda.time.l0)c2)) {
            return null;
        }
        final long id = umStudentAbsence.id;
        String text;
        if ((text = umStudentAbsence.text) == null) {
            text = "";
        }
        return new ClassLeadStudentAbsence(id, c, c2, text, umStudentAbsence.studentId, umStudentAbsence.absenceReasonId, umStudentAbsence.excused, com.untis.mobile.utils.mapper.realmToModel.infocenter.d.a.i(umStudentAbsence.excuse));
    }
    
    @e
    public final r4.a p(@e final ClassLead classLead) {
        k0.p(classLead, "classLead");
        final long id = classLead.getKlasse().getId();
        final List<ClassLeadEvent> events = classLead.getEvents();
        final ArrayList list = new ArrayList<b>(v.Y((Iterable<?>)events, 10));
        final Iterator<Object> iterator = events.iterator();
        while (iterator.hasNext()) {
            list.add(com.untis.mobile.utils.mapper.realmToModel.infocenter.a.a.q(iterator.next()));
        }
        final l0<b> h = com.untis.mobile.utils.mapper.common.b.h((List<b>)list);
        k0.o(h, "toRealmList(classLead.events.map { toRealmClassLeadEvent(it) })");
        final List<ClassLeadStudentAbsence> absences = classLead.getAbsences();
        final ArrayList list2 = new ArrayList<d>(v.Y((Iterable<?>)absences, 10));
        final Iterator<Object> iterator2 = absences.iterator();
        while (iterator2.hasNext()) {
            list2.add(com.untis.mobile.utils.mapper.realmToModel.infocenter.a.a.s(iterator2.next()));
        }
        final l0<d> h2 = com.untis.mobile.utils.mapper.common.b.h((List<d>)list2);
        k0.o(h2, "toRealmList(classLead.absences.map { toRealmClassStudentAbsence(it) })");
        return new r4.a(id, h, h2);
    }
    
    @e
    public final d s(@e final ClassLeadStudentAbsence classLeadStudentAbsence) {
        k0.p(classLeadStudentAbsence, "absence");
        final long id = classLeadStudentAbsence.getId();
        final String string = ((org.joda.time.base.a)classLeadStudentAbsence.getStart()).toString();
        k0.o(string, "absence.start.toString()");
        final String string2 = ((org.joda.time.base.a)classLeadStudentAbsence.getEnd()).toString();
        k0.o(string2, "absence.end.toString()");
        return new d(id, string, string2, classLeadStudentAbsence.getText(), classLeadStudentAbsence.getStudentId(), classLeadStudentAbsence.getAbsenceReasonId(), classLeadStudentAbsence.getExcused(), this.r(classLeadStudentAbsence.getExcuse()));
    }
}
