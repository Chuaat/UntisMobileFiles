// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.dto.parentsday.GetPDayAppointmentsResponse;
import io.realm.l0;
import u4.a;
import java.util.Iterator;
import org.joda.time.c;
import com.untis.mobile.persistence.models.parentday.ParentDayStudent;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.parentday.ParentDayAppointment;
import java.util.ArrayList;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import com.untis.mobile.api.common.parentsday.UMPDayAppointment;
import java.util.List;
import com.untis.mobile.api.common.parentsday.UMPDay;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u001c\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/u;", "", "Lu4/a;", "realmParentDay", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "b", "parentDay", "d", "Lcom/untis/mobile/api/common/parentsday/UMPDay;", "umpDay", "", "Lcom/untis/mobile/api/common/parentsday/UMPDayAppointment;", "umpDayAppointments", "a", "Lcom/untis/mobile/api/dto/parentsday/GetPDayAppointmentsResponse;", "response", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class u
{
    @e
    public static final u a;
    
    static {
        a = new u();
    }
    
    private u() {
    }
    
    @e
    public final ParentDay a(@e final UMPDay umpDay, @e final List<? extends UMPDayAppointment> list) {
        k0.p(umpDay, "umpDay");
        k0.p(list, "umpDayAppointments");
        final long id = umpDay.id;
        String name;
        if ((name = umpDay.name) == null) {
            name = "";
        }
        final c c = b.c(umpDay.startDateTime);
        k0.o(c, "isoStringToDateTime(umpDay.startDateTime)");
        c c2 = b.c(umpDay.endDateTime);
        k0.o(c2, "isoStringToDateTime(umpDay.endDateTime)");
        final ArrayList<ParentDayAppointment> list2 = new ArrayList<ParentDayAppointment>();
        final Iterator<UMPDayAppointment> iterator = list.iterator();
        c c3 = c;
        while (iterator.hasNext()) {
            final UMPDayAppointment umpDayAppointment = iterator.next();
            ParentDayAppointment parentDayAppointment;
            c c5;
            c c6;
            if (umpDayAppointment == null) {
                final c c4 = c2;
                parentDayAppointment = null;
                c5 = c3;
                c6 = c4;
            }
            else {
                final long id2 = umpDayAppointment.id;
                final c c7 = b.c(umpDayAppointment.startDateTime);
                k0.o(c7, "isoStringToDateTime(umpDayAppointment.startDateTime)");
                final c c8 = b.c(umpDayAppointment.endDateTime);
                k0.o(c8, "isoStringToDateTime(umpDayAppointment.endDateTime)");
                final long teacherId = umpDayAppointment.teacherId;
                final long roomId = umpDayAppointment.roomId;
                final boolean cancelled = umpDayAppointment.cancelled;
                final List<UMPDayAppointment.UMStudentSubjects> studentSubjects = umpDayAppointment.studentSubjects;
                List<ParentDayStudent> list3;
                if (studentSubjects == null) {
                    final c c9 = c3;
                    c6 = c2;
                    list3 = null;
                    c5 = c9;
                }
                else {
                    final ArrayList list4 = new ArrayList<ParentDayStudent>(v.Y((Iterable<?>)studentSubjects, 10));
                    for (final UMPDayAppointment.UMStudentSubjects umStudentSubjects : studentSubjects) {
                        final long studentId = umStudentSubjects.studentId;
                        List<Long> subjectIds;
                        if ((subjectIds = umStudentSubjects.subjectIds) == null) {
                            subjectIds = new ArrayList<Long>();
                        }
                        list4.add(new ParentDayStudent(studentId, subjectIds));
                    }
                    final c c10 = c3;
                    c6 = c2;
                    c5 = c10;
                    list3 = (List<ParentDayStudent>)list4;
                }
                if (list3 == null) {
                    list3 = new ArrayList<ParentDayStudent>();
                }
                parentDayAppointment = new ParentDayAppointment(id2, c7, c8, teacherId, roomId, cancelled, list3);
            }
            if (parentDayAppointment != null) {
                list2.add(parentDayAppointment);
            }
            final c c11 = c6;
            c3 = c5;
            c2 = c11;
        }
        return new ParentDay(id, name, c3, c2, list2);
    }
    
    @e
    public final ParentDay b(@e final a a) {
        k0.p(a, "realmParentDay");
        final long u8 = a.u8();
        final String v8 = a.v8();
        final c c = new c(a.w8());
        final c c2 = new c(a.t8());
        final l0<u4.b> s8 = a.s8();
        final ArrayList list = new ArrayList<ParentDayAppointment>(v.Y((Iterable<?>)s8, 10));
        for (final u4.b b : s8) {
            final long u9 = b.u8();
            final c c3 = new c(b.w8());
            final c c4 = new c(b.t8());
            final long y8 = b.y8();
            final long v9 = b.v8();
            final boolean s9 = b.s8();
            final l0<u4.c> x8 = b.x8();
            final ArrayList list2 = new ArrayList<ParentDayStudent>(v.Y((Iterable<?>)x8, 10));
            for (final u4.c c5 : x8) {
                final long s10 = c5.s8();
                final l0<com.untis.mobile.persistence.realm.b> t8 = c5.t8();
                final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)t8, 10));
                final Iterator<Object> iterator3 = t8.iterator();
                while (iterator3.hasNext()) {
                    list3.add(Long.valueOf(iterator3.next().s8()));
                }
                list2.add(new ParentDayStudent(s10, (List<Long>)list3));
            }
            list.add(new ParentDayAppointment(u9, c3, c4, y8, v9, s9, (List<ParentDayStudent>)list2));
        }
        return new ParentDay(u8, v8, c, c2, (List<ParentDayAppointment>)list);
    }
    
    @e
    public final List<ParentDay> c(@f final GetPDayAppointmentsResponse getPDayAppointmentsResponse) {
        Set<UMPDay> referencedPDays;
        if (getPDayAppointmentsResponse == null) {
            referencedPDays = null;
        }
        else {
            referencedPDays = getPDayAppointmentsResponse.referencedPDays;
        }
        if (referencedPDays == null) {
            return v.E();
        }
        final Map<Long, List<UMPDayAppointment>> appointments = getPDayAppointmentsResponse.appointments;
        if (appointments == null) {
            return v.E();
        }
        final ArrayList<ParentDay> list = new ArrayList<ParentDay>();
        for (final UMPDay umpDay : referencedPDays) {
            List<? extends UMPDayAppointment> e;
            if ((e = appointments.get(umpDay.id)) == null) {
                e = v.E();
            }
            k0.o(umpDay, "umParentday");
            list.add(this.a(umpDay, e));
        }
        return list;
    }
    
    @e
    public final a d(@e final ParentDay parentDay) {
        k0.p(parentDay, "parentDay");
        final long id = parentDay.getId();
        final String name = parentDay.getName();
        final long n = ((g)parentDay.getStart()).n();
        final long n2 = ((g)parentDay.getEnd()).n();
        final List<ParentDayAppointment> appointments = parentDay.getAppointments();
        final ArrayList list = new ArrayList<u4.b>(v.Y((Iterable<?>)appointments, 10));
        for (final ParentDayAppointment parentDayAppointment : appointments) {
            final long id2 = parentDayAppointment.getId();
            final long n3 = ((g)parentDayAppointment.getStart()).n();
            final long n4 = ((g)parentDayAppointment.getEnd()).n();
            final long teacherId = parentDayAppointment.getTeacherId();
            final long roomId = parentDayAppointment.getRoomId();
            final boolean cancelled = parentDayAppointment.getCancelled();
            final List<ParentDayStudent> students = parentDayAppointment.getStudents();
            final ArrayList list2 = new ArrayList<u4.c>(v.Y((Iterable<?>)students, 10));
            for (final ParentDayStudent parentDayStudent : students) {
                final long studentId = parentDayStudent.getStudentId();
                final List<Long> subjectIds = parentDayStudent.getSubjectIds();
                final ArrayList list3 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)subjectIds, 10));
                final Iterator<Number> iterator3 = subjectIds.iterator();
                while (iterator3.hasNext()) {
                    list3.add(new com.untis.mobile.persistence.realm.b(iterator3.next().longValue()));
                }
                final l0<com.untis.mobile.persistence.realm.b> h = b.h((List<com.untis.mobile.persistence.realm.b>)list3);
                k0.o(h, "toRealmList(parentDayStudent.subjectIds.map { id -> RealmLong(id) })");
                list2.add(new u4.c(studentId, h));
            }
            final l0<u4.c> h2 = b.h((List<u4.c>)list2);
            k0.o(h2, "toRealmList(parentDayAppointment.students.map { parentDayStudent ->\n                                RealmParentDayStudent(\n                                        studentId = parentDayStudent.studentId,\n                                        subjectIds = toRealmList(parentDayStudent.subjectIds.map { id -> RealmLong(id) })\n                                )\n                            })");
            list.add(new u4.b(id2, n3, n4, teacherId, roomId, cancelled, h2));
        }
        final l0<u4.b> h3 = b.h((List<u4.b>)list);
        k0.o(h3, "toRealmList(parentDay.appointments.map { parentDayAppointment ->\n                    RealmParentDayAppointment(\n                            id = parentDayAppointment.id,\n                            start = parentDayAppointment.start.millis,\n                            end = parentDayAppointment.end.millis,\n                            teacherId = parentDayAppointment.teacherId,\n                            roomId = parentDayAppointment.roomId,\n                            cancelled = parentDayAppointment.cancelled,\n                            students = toRealmList(parentDayAppointment.students.map { parentDayStudent ->\n                                RealmParentDayStudent(\n                                        studentId = parentDayStudent.studentId,\n                                        subjectIds = toRealmList(parentDayStudent.subjectIds.map { id -> RealmLong(id) })\n                                )\n                            })\n                    )\n                })");
        return new a(id, name, n, n2, h3);
    }
}
