// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import java.util.Iterator;
import io.realm.l0;
import java.util.List;
import c5.b;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import c5.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/y;", "", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "periodModel", "Lc5/c;", "b", "", "profileId", "realmPeriodModel", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class y
{
    @e
    public static final y a;
    
    static {
        a = new y();
    }
    
    private y() {
    }
    
    @e
    public final PeriodModel a(@e final String s, @e final c c) {
        k0.p(s, "profileId");
        k0.p(c, "realmPeriodModel");
        final long f8 = c.F8();
        final long j8 = c.J8();
        final long n8 = c.N8();
        final int l8 = c.L8();
        final int x8 = c.x8();
        final float m8 = c.M8();
        final float t8 = c.T8();
        final int s2 = c.S8();
        final int p2 = c.P8();
        final int s3 = c.s8();
        final int r8 = c.R8();
        final int u8 = c.u8();
        final int q8 = c.Q8();
        final int t9 = c.t8();
        final l0<b> w8 = c.w8();
        final v a = v.a;
        final ArrayList list = new ArrayList<PeriodElementModel>(kotlin.collections.v.Y((Iterable<?>)w8, 10));
        final Iterator<Object> iterator = w8.iterator();
        while (iterator.hasNext()) {
            list.add(a.a(iterator.next()));
        }
        final l0<com.untis.mobile.persistence.realm.e> d8 = c.D8();
        final ArrayList list2 = new ArrayList<String>(kotlin.collections.v.Y((Iterable<?>)d8, 10));
        final Iterator<Object> iterator2 = d8.iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().s8());
        }
        final l0<com.untis.mobile.persistence.realm.e> e8 = c.E8();
        final ArrayList list3 = new ArrayList<String>(kotlin.collections.v.Y((Iterable<?>)e8, 10));
        final Iterator<Object> iterator3 = e8.iterator();
        while (iterator3.hasNext()) {
            list3.add(iterator3.next().s8());
        }
        return new PeriodModel(f8, j8, s, n8, l8, x8, m8, t8, s2, p2, s3, r8, u8, q8, t9, (List<PeriodElementModel>)list, (List<String>)list2, (List<String>)list3, c.G8(), c.K8(), c.O8(), c.I8(), c.z8(), c.v8(), c.y8(), c.H8(), c.A8(), c.B8(), c.C8(), c.U8());
    }
    
    @e
    public final c b(@e final PeriodModel periodModel) {
        k0.p(periodModel, "periodModel");
        final long id = periodModel.getId();
        final long lessonId = periodModel.getLessonId();
        final long subjectId = periodModel.getSubjectId();
        final int startMinute = periodModel.getStartMinute();
        final int endMinute = periodModel.getEndMinute();
        final float startX = periodModel.getStartX();
        final float widthX = periodModel.getWidthX();
        final int totalX = periodModel.getTotalX();
        final List<PeriodElementModel> elements = periodModel.getElements();
        final v a = v.a;
        final ArrayList list = new ArrayList<b>(kotlin.collections.v.Y((Iterable<?>)elements, 10));
        final Iterator<Object> iterator = elements.iterator();
        while (iterator.hasNext()) {
            list.add(a.c(iterator.next()));
        }
        final l0<b> h = com.untis.mobile.utils.mapper.common.b.h((List<b>)list);
        final int textColor = periodModel.getTextColor();
        final int backColor = periodModel.getBackColor();
        final int textColorSubject = periodModel.getTextColorSubject();
        final int backColorSubject = periodModel.getBackColorSubject();
        final int textColorCustom = periodModel.getTextColorCustom();
        final int backColorCustom = periodModel.getBackColorCustom();
        final List<String> homeworks = periodModel.getHomeworks();
        final ArrayList list2 = new ArrayList<com.untis.mobile.persistence.realm.e>(kotlin.collections.v.Y((Iterable<?>)homeworks, 10));
        final Iterator<Object> iterator2 = homeworks.iterator();
        while (iterator2.hasNext()) {
            list2.add(new com.untis.mobile.persistence.realm.e(iterator2.next()));
        }
        final l0<com.untis.mobile.persistence.realm.e> h2 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.e>)list2);
        final List<String> localhomeWorks = periodModel.getLocalhomeWorks();
        final ArrayList list3 = new ArrayList<com.untis.mobile.persistence.realm.e>(kotlin.collections.v.Y((Iterable<?>)localhomeWorks, 10));
        final Iterator<Object> iterator3 = localhomeWorks.iterator();
        while (iterator3.hasNext()) {
            list3.add(new com.untis.mobile.persistence.realm.e(iterator3.next()));
        }
        final l0<com.untis.mobile.persistence.realm.e> h3 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.e>)list3);
        final String info = periodModel.getInfo();
        final String local = periodModel.getLocal();
        final String substitution = periodModel.getSubstitution();
        final String lesson = periodModel.getLesson();
        final boolean hasOfficeHourRegistrations = periodModel.getHasOfficeHourRegistrations();
        final boolean cancelled = periodModel.getCancelled();
        final boolean exam = periodModel.getExam();
        final boolean irregular = periodModel.getIrregular();
        final boolean hide = periodModel.getHide();
        final float hideStartX = periodModel.getHideStartX();
        final float hideWidthX = periodModel.getHideWidthX();
        final boolean onlinePeriod = periodModel.isOnlinePeriod();
        k0.o(h, "toRealmList(periodModel.elements.map(::toRealmPeriodElementModel))");
        k0.o(h2, "toRealmList(periodModel.homeworks.map { RealmString(it) })");
        k0.o(h3, "toRealmList(periodModel.localhomeWorks.map { RealmString(it) })");
        return new c(id, lessonId, subjectId, startMinute, endMinute, startX, widthX, totalX, h, textColor, backColor, textColorSubject, backColorSubject, textColorCustom, backColorCustom, h2, h3, info, local, lesson, substitution, hasOfficeHourRegistrations, cancelled, exam, irregular, hide, hideStartX, hideWidthX, onlinePeriod);
    }
}
