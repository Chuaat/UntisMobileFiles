// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import java.util.Iterator;
import io.realm.l0;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import s4.b;
import java.util.List;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.infocenter.Lesson;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.timetable.UMLesson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/g;", "", "Lcom/untis/mobile/api/common/timetable/UMLesson;", "umLesson", "Lcom/untis/mobile/persistence/models/infocenter/Lesson;", "a", "Ls4/b;", "realmInfoCenterLesson", "b", "lesson", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g
{
    @e
    public static final g a;
    
    static {
        a = new g();
    }
    
    private g() {
    }
    
    @f
    public final Lesson a(@f final UMLesson umLesson) {
        final List<Long> list = null;
        if (umLesson == null) {
            return null;
        }
        final long id = umLesson.id;
        final long subjectId = umLesson.subjectId;
        final List<Long> klassenIds = umLesson.klassenIds;
        Object i5;
        if (klassenIds == null) {
            i5 = null;
        }
        else {
            i5 = v.I5((Iterable<?>)klassenIds);
        }
        Object e = i5;
        if (i5 == null) {
            e = v.E();
        }
        final List<Long> teacherIds = umLesson.teacherIds;
        Object o;
        if (teacherIds == null) {
            o = list;
        }
        else {
            o = v.I5((Iterable<?>)teacherIds);
        }
        if (o == null) {
            o = v.E();
        }
        return new Lesson(id, subjectId, (List<Long>)e, (List<Long>)o);
    }
    
    @e
    public final Lesson b(@e final b b) {
        k0.p(b, "realmInfoCenterLesson");
        final long s8 = b.s8();
        final long u8 = b.u8();
        final l0<com.untis.mobile.persistence.realm.b> t8 = b.t8();
        final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)t8, 10));
        final Iterator<Object> iterator = t8.iterator();
        while (iterator.hasNext()) {
            list.add(Long.valueOf(iterator.next().s8()));
        }
        final l0<com.untis.mobile.persistence.realm.b> v8 = b.v8();
        final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)v8, 10));
        final Iterator<Object> iterator2 = v8.iterator();
        while (iterator2.hasNext()) {
            list2.add(Long.valueOf(iterator2.next().s8()));
        }
        return new Lesson(s8, u8, (List<Long>)list, (List<Long>)list2);
    }
    
    @e
    public final b c(@e final Lesson lesson) {
        k0.p(lesson, "lesson");
        final long id = lesson.getId();
        final long subjectId = lesson.getSubjectId();
        final List<Long> klassenIds = lesson.getKlassenIds();
        final ArrayList list = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)klassenIds, 10));
        final Iterator<Number> iterator = klassenIds.iterator();
        while (iterator.hasNext()) {
            list.add(new com.untis.mobile.persistence.realm.b(iterator.next().longValue()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list);
        k0.o(h, "toRealmList(lesson.klassenIds.map { RealmLong(it) })");
        final List<Long> teacherIds = lesson.getTeacherIds();
        final ArrayList list2 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)teacherIds, 10));
        final Iterator<Number> iterator2 = teacherIds.iterator();
        while (iterator2.hasNext()) {
            list2.add(new com.untis.mobile.persistence.realm.b(iterator2.next().longValue()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h2 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list2);
        k0.o(h2, "toRealmList(lesson.teacherIds.map { RealmLong(it) })");
        return new b(id, subjectId, h, h2);
    }
}
