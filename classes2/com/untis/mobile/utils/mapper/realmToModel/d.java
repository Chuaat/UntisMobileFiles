// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import java.util.Iterator;
import io.realm.l0;
import java.util.List;
import java.util.Set;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import i4.c;
import com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendance;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.realm.b;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.classbook.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/d;", "", "Li4/a;", "realmClassbook", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "a", "classbook", "b", "Lcom/untis/mobile/utils/mapper/realmToModel/a0;", "Lcom/untis/mobile/utils/mapper/realmToModel/a0;", "attendancesMapper", "Lcom/untis/mobile/services/classbook/a;", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d
{
    @e
    private final a a;
    @e
    private final a0 b;
    
    public d(@e final String s) {
        k0.p(s, "profileId");
        this.a = com.untis.mobile.services.classbook.k0.a0.a(s);
        this.b = new a0(s);
    }
    
    @e
    public final Classbook a(@e final i4.a a) {
        k0.p(a, "realmClassbook");
        final long y8 = a.y8();
        final l0<b> a2 = a.A8();
        final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)a2, 10));
        final Iterator<Object> iterator = a2.iterator();
        while (iterator.hasNext()) {
            list.add(Long.valueOf(iterator.next().s8()));
        }
        final Set<Long> m5 = v.M5((Iterable<? extends Long>)list);
        final l0<b> s8 = a.s8();
        final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)s8, 10));
        final Iterator<Object> iterator2 = s8.iterator();
        while (iterator2.hasNext()) {
            list2.add(Long.valueOf(iterator2.next().s8()));
        }
        final Set<Long> m6 = v.M5((Iterable<? extends Long>)list2);
        final l0<b> v8 = a.v8();
        final ArrayList<Event> list3 = new ArrayList<Event>();
        final Iterator<Object> iterator3 = v8.iterator();
        while (iterator3.hasNext()) {
            final Event v9 = this.a.v(iterator3.next().s8());
            if (v9 != null) {
                list3.add(v9);
            }
        }
        final Set<Object> m7 = v.M5((Iterable<?>)list3);
        final l0<b> w8 = a.w8();
        final ArrayList<Exemption> list4 = new ArrayList<Exemption>();
        final Iterator<Object> iterator4 = w8.iterator();
        while (iterator4.hasNext()) {
            final Exemption i = this.a.m(iterator4.next().s8());
            if (i != null) {
                list4.add(i);
            }
        }
        final Set<Object> m8 = v.M5((Iterable<?>)list4);
        final l0<c> z8 = a.z8();
        final a0 b = this.b;
        final ArrayList list5 = new ArrayList<PrioritizedAttendance>(v.Y((Iterable<?>)z8, 10));
        final Iterator<Object> iterator5 = z8.iterator();
        while (iterator5.hasNext()) {
            list5.add(b.b(iterator5.next()));
        }
        final Set<PrioritizedAttendance> m9 = v.M5((Iterable<? extends PrioritizedAttendance>)list5);
        final l0<b> x8 = a.x8();
        final ArrayList<HomeWork> list6 = new ArrayList<HomeWork>();
        final Iterator<Object> iterator6 = x8.iterator();
        while (iterator6.hasNext()) {
            final HomeWork u = this.a.U(iterator6.next().s8());
            if (u != null) {
                list6.add(u);
            }
        }
        final Set<Object> m10 = v.M5((Iterable<?>)list6);
        final boolean t8 = a.t8();
        final boolean b2 = a.B8();
        final l0<k4.a> u2 = a.u8();
        final com.untis.mobile.utils.mapper.realmToModel.c a3 = com.untis.mobile.utils.mapper.realmToModel.c.a;
        final ArrayList list7 = new ArrayList<ClassRole>(v.Y((Iterable<?>)u2, 10));
        final Iterator<Object> iterator7 = u2.iterator();
        while (iterator7.hasNext()) {
            list7.add(a3.b(iterator7.next()));
        }
        return new Classbook(y8, m5, m6, (Set<Event>)m7, (Set<Exemption>)m8, m9, (Set<HomeWork>)m10, t8, b2, (List<ClassRole>)list7);
    }
    
    @e
    public final i4.a b(@e final Classbook classbook) {
        k0.p(classbook, "classbook");
        final long id = classbook.getId();
        final Set<Long> students = classbook.getStudents();
        final ArrayList list = new ArrayList<b>(v.Y((Iterable<?>)students, 10));
        final Iterator<Number> iterator = students.iterator();
        while (iterator.hasNext()) {
            list.add(new b(iterator.next().longValue()));
        }
        final l0<b> h = com.untis.mobile.utils.mapper.common.b.h((List<b>)list);
        k0.o(h, "toRealmList(classbook.students.map { studentId -> RealmLong(studentId) })");
        final Set<Long> absences = classbook.getAbsences();
        final ArrayList list2 = new ArrayList<b>(v.Y((Iterable<?>)absences, 10));
        final Iterator<Number> iterator2 = absences.iterator();
        while (iterator2.hasNext()) {
            list2.add(new b(iterator2.next().longValue()));
        }
        final l0<b> h2 = com.untis.mobile.utils.mapper.common.b.h((List<b>)list2);
        k0.o(h2, "toRealmList(classbook.absences.map { absenceId -> RealmLong(absenceId) })");
        final Set<Event> events = classbook.getEvents();
        final ArrayList list3 = new ArrayList<b>(v.Y((Iterable<?>)events, 10));
        final Iterator<Object> iterator3 = events.iterator();
        while (iterator3.hasNext()) {
            list3.add(new b(iterator3.next().getId()));
        }
        final l0<b> h3 = com.untis.mobile.utils.mapper.common.b.h((List<b>)list3);
        k0.o(h3, "toRealmList(classbook.events.map { event -> RealmLong(event.id) })");
        final Set<Exemption> exemptions = classbook.getExemptions();
        final ArrayList list4 = new ArrayList<b>(v.Y((Iterable<?>)exemptions, 10));
        final Iterator<Object> iterator4 = exemptions.iterator();
        while (iterator4.hasNext()) {
            list4.add(new b(iterator4.next().getId()));
        }
        final l0<b> h4 = com.untis.mobile.utils.mapper.common.b.h((List<b>)list4);
        k0.o(h4, "toRealmList(classbook.exemptions.map { exemption -> RealmLong(exemption.id) })");
        final Set<PrioritizedAttendance> prioritizedAttendances = classbook.getPrioritizedAttendances();
        final ArrayList list5 = new ArrayList<c>(v.Y((Iterable<?>)prioritizedAttendances, 10));
        final Iterator<Object> iterator5 = prioritizedAttendances.iterator();
        while (iterator5.hasNext()) {
            list5.add(this.b.c(iterator5.next()));
        }
        final l0<c> h5 = com.untis.mobile.utils.mapper.common.b.h((List<c>)list5);
        k0.o(h5, "toRealmList(classbook.prioritizedAttendances.map { attendance -> attendancesMapper.toRealmPrioritiziedAttendance(attendance) })");
        final Set<HomeWork> homeWorks = classbook.getHomeWorks();
        final ArrayList list6 = new ArrayList<b>(v.Y((Iterable<?>)homeWorks, 10));
        final Iterator<Object> iterator6 = homeWorks.iterator();
        while (iterator6.hasNext()) {
            list6.add(new b(iterator6.next().getId()));
        }
        final l0<b> h6 = com.untis.mobile.utils.mapper.common.b.h((List<b>)list6);
        k0.o(h6, "toRealmList(classbook.homeWorks.map { homeWork -> RealmLong(homeWork.id) })");
        final boolean absencesChecked = classbook.getAbsencesChecked();
        final boolean synced = classbook.getSynced();
        final List<ClassRole> classRoles = classbook.getClassRoles();
        final com.untis.mobile.utils.mapper.realmToModel.c a = com.untis.mobile.utils.mapper.realmToModel.c.a;
        final ArrayList list7 = new ArrayList<k4.a>(v.Y((Iterable<?>)classRoles, 10));
        final Iterator<Object> iterator7 = classRoles.iterator();
        while (iterator7.hasNext()) {
            list7.add(a.c(iterator7.next()));
        }
        final l0<k4.a> h7 = com.untis.mobile.utils.mapper.common.b.h((List<k4.a>)list7);
        k0.o(h7, "toRealmList(classbook.classRoles.map(ClassRoleMapper::toRealmClassRole))");
        return new i4.a(id, h, h2, h3, h4, h5, h6, absencesChecked, synced, h7);
    }
}
