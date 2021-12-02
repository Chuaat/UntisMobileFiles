// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.collections.v;
import java.util.Iterator;
import io.realm.l0;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import i4.c;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import java.util.List;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendanceType;
import com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendance;
import com.untis.mobile.api.common.classreg.UMPrioritizedAttendance;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.masterdata.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/a0;", "", "Li4/c;", "realm", "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendance;", "b", "prioritizedAttendance", "c", "", "periodId", "Lcom/untis/mobile/api/common/classreg/UMPrioritizedAttendance;", "umPrioritizedAttendance", "a", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a0
{
    @e
    private final a a;
    
    public a0(@e final String s) {
        k0.p(s, "profileId");
        this.a = b.Z.a(s);
    }
    
    @e
    public final PrioritizedAttendance a(final long n, @e final UMPrioritizedAttendance umPrioritizedAttendance) {
        k0.p(umPrioritizedAttendance, "umPrioritizedAttendance");
        final Student v = this.a.V(umPrioritizedAttendance.studentId);
        k0.m(v);
        final long periodId = umPrioritizedAttendance.periodId;
        final PrioritizedAttendanceType fromUMActivityType = PrioritizedAttendanceType.Companion.fromUMActivityType(umPrioritizedAttendance.activityType);
        final Subject u = this.a.U(umPrioritizedAttendance.subjectId);
        final a a = this.a;
        final List<Long> teacherIds = umPrioritizedAttendance.teacherIds;
        k0.o(teacherIds, "umPrioritizedAttendance.teacherIds");
        final List<Teacher> q = a.Q(teacherIds);
        final a a2 = this.a;
        final List<Long> teacherIds2 = umPrioritizedAttendance.teacherIds;
        k0.o(teacherIds2, "umPrioritizedAttendance.teacherIds");
        final List<Klasse> d = a2.D(teacherIds2);
        final a a3 = this.a;
        final List<Long> roomIds = umPrioritizedAttendance.roomIds;
        k0.o(roomIds, "umPrioritizedAttendance.roomIds");
        return new PrioritizedAttendance(v, n, periodId, fromUMActivityType, u, q, d, a3.R(roomIds));
    }
    
    @e
    public final PrioritizedAttendance b(@e final c c) {
        k0.p(c, "realm");
        Student v;
        if ((v = this.a.V(c.w8())) == null) {
            v = new Student(c.w8(), null, null, null, null, 30, null);
        }
        final long u8 = c.u8();
        final long t8 = c.t8();
        final PrioritizedAttendanceType fromValue = PrioritizedAttendanceType.Companion.fromValue(c.z8());
        final Subject u9 = this.a.U(c.x8());
        final l0<com.untis.mobile.persistence.realm.b> y8 = c.y8();
        final ArrayList<Teacher> list = new ArrayList<Teacher>();
        final Iterator<Object> iterator = y8.iterator();
        while (iterator.hasNext()) {
            final Teacher k = this.a.k(iterator.next().s8());
            if (k != null) {
                list.add(k);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> s8 = c.s8();
        final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
        final Iterator<Object> iterator2 = s8.iterator();
        while (iterator2.hasNext()) {
            final Klasse n = this.a.N(iterator2.next().s8());
            if (n != null) {
                list2.add(n);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> v2 = c.v8();
        final ArrayList<Room> list3 = new ArrayList<Room>();
        final Iterator<Object> iterator3 = v2.iterator();
        while (iterator3.hasNext()) {
            final Room p = this.a.P(iterator3.next().s8());
            if (p != null) {
                list3.add(p);
            }
        }
        return new PrioritizedAttendance(v, u8, t8, fromValue, u9, list, list2, list3);
    }
    
    @e
    public final c c(@e final PrioritizedAttendance prioritizedAttendance) {
        k0.p(prioritizedAttendance, "prioritizedAttendance");
        final long id = prioritizedAttendance.getStudent().getId();
        final long periodId = prioritizedAttendance.getPeriodId();
        final long parallelPeriodId = prioritizedAttendance.getParallelPeriodId();
        final int value = prioritizedAttendance.getType().getValue();
        final Subject subject = prioritizedAttendance.getSubject();
        long id2;
        if (subject == null) {
            id2 = 0L;
        }
        else {
            id2 = subject.getId();
        }
        final List<Teacher> teachers = prioritizedAttendance.getTeachers();
        final ArrayList list = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)teachers, 10));
        final Iterator<Object> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            list.add(new com.untis.mobile.persistence.realm.b(iterator.next().getId()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list);
        k0.o(h, "toRealmList(prioritizedAttendance.teachers.map { teacher -> RealmLong(teacher.id) })");
        final List<Klasse> klassen = prioritizedAttendance.getKlassen();
        final ArrayList list2 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)klassen, 10));
        final Iterator<Object> iterator2 = klassen.iterator();
        while (iterator2.hasNext()) {
            list2.add(new com.untis.mobile.persistence.realm.b(iterator2.next().getId()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h2 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list2);
        k0.o(h2, "toRealmList(prioritizedAttendance.klassen.map { klasse -> RealmLong(klasse.id) })");
        final List<Room> rooms = prioritizedAttendance.getRooms();
        final ArrayList list3 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)rooms, 10));
        final Iterator<Object> iterator3 = rooms.iterator();
        final l0<com.untis.mobile.persistence.realm.b> l0 = h2;
        while (iterator3.hasNext()) {
            list3.add(new com.untis.mobile.persistence.realm.b(iterator3.next().getId()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h3 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list3);
        k0.o(h3, "toRealmList(prioritizedAttendance.rooms.map { room -> RealmLong(room.id) })");
        return new c(id, periodId, parallelPeriodId, value, id2, h, l0, h3);
    }
}
