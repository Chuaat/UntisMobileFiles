// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import org.joda.time.base.g;
import io.realm.l0;
import com.untis.mobile.persistence.models.EntityType;
import p4.a;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.infocenter.InfoCenterExam;
import com.untis.mobile.api.common.classreg.UMExam;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.api.common.classreg.UMInvigilator;
import org.joda.time.v;
import p4.b;
import kotlin.text.s;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/c;", "", "Lcom/untis/mobile/api/common/classreg/UMInvigilator;", "umInvigilator", "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/f;", "e", "", "iso", "Lorg/joda/time/c;", "a", "Lorg/joda/time/v;", "f", "Lp4/b;", "realmInvigilator", "b", "invigilator", "h", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "displayableEntity", "Lcom/untis/mobile/api/common/classreg/UMExam;", "umExam", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExam;", "c", "Lp4/a;", "realmExam", "d", "exam", "g", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    private final org.joda.time.c a(String k2) {
        final org.joda.time.c c = null;
        Label_0023: {
            if (k2 == null) {
                k2 = null;
                break Label_0023;
            }
            try {
                k2 = s.k2(k2, "Z", "", false, 4, (Object)null);
                return org.joda.time.c.K0(k2);
            }
            catch (Exception ex) {
                return c;
            }
        }
    }
    
    private final f b(final b b) {
        return new f(b.u8(), new v(b.t8()), new v(b.s8()));
    }
    
    private final f e(final UMInvigilator umInvigilator) {
        if (umInvigilator == null) {
            return null;
        }
        final long id = umInvigilator.id;
        final v f = this.f(umInvigilator.startTime);
        if (f == null) {
            return null;
        }
        final v f2 = this.f(umInvigilator.endTime);
        if (f2 == null) {
            return null;
        }
        return new f(id, f, f2);
    }
    
    private final v f(String k2) {
        final v v = null;
        Label_0023: {
            if (k2 == null) {
                k2 = null;
                break Label_0023;
            }
            try {
                k2 = s.k2(k2, "Z", "", false, 4, (Object)null);
                return org.joda.time.v.c0(k2);
            }
            catch (Exception ex) {
                return v;
            }
        }
    }
    
    private final b h(final f f) {
        return new b(f.h(), f.g().k1(), f.f().k1());
    }
    
    @org.jetbrains.annotations.f
    public final InfoCenterExam c(@e final DisplayableEntity displayableEntity, @org.jetbrains.annotations.f final UMExam umExam) {
        k0.p(displayableEntity, "displayableEntity");
        if (umExam == null) {
            return null;
        }
        final long id = umExam.id;
        String examType = umExam.examType;
        if (examType == null) {
            examType = "";
        }
        final org.joda.time.c a = this.a(umExam.startDateTime);
        if (a == null) {
            return null;
        }
        final org.joda.time.c a2 = this.a(umExam.endDateTime);
        if (a2 == null) {
            return null;
        }
        final long departmentId = umExam.departmentId;
        final long subjectId = umExam.subjectId;
        final List<Long> teacherIds = umExam.teacherIds;
        Object i5;
        if (teacherIds == null) {
            i5 = null;
        }
        else {
            i5 = kotlin.collections.v.I5((Iterable<?>)teacherIds);
        }
        Object e = i5;
        if (i5 == null) {
            e = kotlin.collections.v.E();
        }
        final List<Long> roomIds = umExam.roomIds;
        Object i6;
        if (roomIds == null) {
            i6 = null;
        }
        else {
            i6 = kotlin.collections.v.I5((Iterable<?>)roomIds);
        }
        Object e2 = i6;
        if (i6 == null) {
            e2 = kotlin.collections.v.E();
        }
        final List<Long> teacherIds2 = umExam.teacherIds;
        Object i7;
        if (teacherIds2 == null) {
            i7 = null;
        }
        else {
            i7 = kotlin.collections.v.I5((Iterable<?>)teacherIds2);
        }
        Object e3 = i7;
        if (i7 == null) {
            e3 = kotlin.collections.v.E();
        }
        final List<UMInvigilator> invigilators = umExam.invigilators;
        List<f> list;
        if (invigilators == null) {
            list = null;
        }
        else {
            final ArrayList<f> list2 = new ArrayList<f>();
            final Iterator<Object> iterator = invigilators.iterator();
            while (true) {
                list = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final f e4 = c.a.e(iterator.next());
                if (e4 == null) {
                    continue;
                }
                list2.add(e4);
            }
        }
        List<f> e5;
        if ((e5 = list) == null) {
            e5 = kotlin.collections.v.E();
        }
        String name = umExam.name;
        if (name == null) {
            name = "";
        }
        String text;
        if ((text = umExam.text) == null) {
            text = "";
        }
        return new InfoCenterExam(0L, id, examType, a, a2, departmentId, subjectId, (List<Long>)e, (List<Long>)e2, (List<Long>)e3, e5, name, text, displayableEntity.entityType(), displayableEntity.entityId());
    }
    
    @e
    public final InfoCenterExam d(@e final a a) {
        k0.p(a, "realmExam");
        final long a2 = a.A8();
        final long y8 = a.y8();
        final String x8 = a.x8();
        final org.joda.time.c c = new org.joda.time.c(a.D8());
        final org.joda.time.c c2 = new org.joda.time.c(a.u8());
        final long t8 = a.t8();
        final long e8 = a.E8();
        final l0<com.untis.mobile.persistence.realm.b> s8 = a.s8();
        final ArrayList list = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)s8, 10));
        final Iterator<Object> iterator = s8.iterator();
        while (iterator.hasNext()) {
            list.add(Long.valueOf(iterator.next().s8()));
        }
        final l0<com.untis.mobile.persistence.realm.b> c3 = a.C8();
        final ArrayList list2 = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)c3, 10));
        final Iterator<Object> iterator2 = c3.iterator();
        while (iterator2.hasNext()) {
            list2.add(Long.valueOf(iterator2.next().s8()));
        }
        final l0<com.untis.mobile.persistence.realm.b> f8 = a.F8();
        final ArrayList list3 = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)f8, 10));
        final Iterator<Object> iterator3 = f8.iterator();
        while (iterator3.hasNext()) {
            list3.add(Long.valueOf(iterator3.next().s8()));
        }
        final l0<b> z8 = a.z8();
        final ArrayList list4 = new ArrayList<f>(kotlin.collections.v.Y((Iterable<?>)z8, 10));
        for (final b b : z8) {
            final c a3 = com.untis.mobile.utils.mapper.realmToModel.infocenter.c.a;
            k0.o(b, "it");
            list4.add(a3.b(b));
        }
        return new InfoCenterExam(a2, y8, x8, c, c2, t8, e8, (List<Long>)list, (List<Long>)list2, (List<Long>)list3, (List<f>)list4, a.B8(), a.G8(), EntityType.Companion.findBy(a.w8()), a.v8());
    }
    
    @e
    public final a g(@e final InfoCenterExam infoCenterExam) {
        k0.p(infoCenterExam, "exam");
        final long key = infoCenterExam.getKey();
        final long id = infoCenterExam.getId();
        final String examType = infoCenterExam.getExamType();
        final long n = ((g)infoCenterExam.getStart()).n();
        final long n2 = ((g)infoCenterExam.getEnd()).n();
        final long departmentId = infoCenterExam.getDepartmentId();
        final String name = infoCenterExam.getName();
        final String text = infoCenterExam.getText();
        final int webuntisId = infoCenterExam.getEntityType().getWebuntisId();
        final long entityId = infoCenterExam.getEntityId();
        final long subjectId = infoCenterExam.getSubjectId();
        final List<Long> klassenIds = infoCenterExam.getKlassenIds();
        final ArrayList list = new ArrayList<com.untis.mobile.persistence.realm.b>(kotlin.collections.v.Y((Iterable<?>)klassenIds, 10));
        final Iterator<Number> iterator = klassenIds.iterator();
        while (iterator.hasNext()) {
            list.add(new com.untis.mobile.persistence.realm.b(iterator.next().longValue()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list);
        k0.o(h, "toRealmList(exam.klassenIds.map { RealmLong(it) })");
        final List<Long> roomIds = infoCenterExam.getRoomIds();
        final ArrayList list2 = new ArrayList<com.untis.mobile.persistence.realm.b>(kotlin.collections.v.Y((Iterable<?>)roomIds, 10));
        final Iterator<Number> iterator2 = roomIds.iterator();
        while (iterator2.hasNext()) {
            list2.add(new com.untis.mobile.persistence.realm.b(iterator2.next().longValue()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h2 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list2);
        k0.o(h2, "toRealmList(exam.roomIds.map { RealmLong(it) })");
        final List<Long> teacherIds = infoCenterExam.getTeacherIds();
        final ArrayList list3 = new ArrayList<com.untis.mobile.persistence.realm.b>(kotlin.collections.v.Y((Iterable<?>)teacherIds, 10));
        final Iterator<Number> iterator3 = teacherIds.iterator();
        while (iterator3.hasNext()) {
            list3.add(new com.untis.mobile.persistence.realm.b(iterator3.next().longValue()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h3 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list3);
        k0.o(h3, "toRealmList(exam.teacherIds.map { RealmLong(it) })");
        final List<f> invigilators = infoCenterExam.getInvigilators();
        final ArrayList list4 = new ArrayList<b>(kotlin.collections.v.Y((Iterable<?>)invigilators, 10));
        final Iterator<Object> iterator4 = invigilators.iterator();
        while (iterator4.hasNext()) {
            list4.add(c.a.h(iterator4.next()));
        }
        final l0<b> h4 = com.untis.mobile.utils.mapper.common.b.h((List<b>)list4);
        k0.o(h4, "toRealmList(exam.invigilators.map { toRealmInvigilator(it) })");
        return new a(key, id, examType, n, n2, departmentId, name, text, webuntisId, entityId, subjectId, h, h2, h3, h4);
    }
}
