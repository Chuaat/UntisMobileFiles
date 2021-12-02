// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.services.timetable.placeholder.l;
import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timetable.period.ui.HolidayModel;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.p0;
import java.util.List;
import com.untis.mobile.utils.mapper.common.b;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import c5.c;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/k0;", "", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timeTableModel", "Lc5/e;", "a", "", "profileId", "realmTimeTableModel", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k0
{
    @e
    public static final k0 a;
    
    static {
        a = new k0();
    }
    
    private k0() {
    }
    
    @e
    public final c5.e a(@e final TimeTableModel timeTableModel) {
        kotlin.jvm.internal.k0.p(timeTableModel, "timeTableModel");
        final int webuntisId = timeTableModel.getEntityType().getWebuntisId();
        final long entityId = timeTableModel.getEntityId();
        final long n = ((g)timeTableModel.getDate().F0()).n();
        final long timestamp = timeTableModel.getTimestamp();
        final List<PeriodModel> periods = timeTableModel.getPeriods();
        final y a = y.a;
        final ArrayList<c> list = new ArrayList<c>(v.Y((Iterable<?>)periods, 10));
        final Iterator<Object> iterator = periods.iterator();
        while (iterator.hasNext()) {
            list.add(a.b(iterator.next()));
        }
        final l0<p0> h = b.h((List<p0>)list);
        kotlin.jvm.internal.k0.o(h, "toRealmList(timeTableModel.periods\n                        .map(PeriodModelMapper::toRealmPeriodModel))");
        final List<PeriodModel> periodsWithOutCancelled = timeTableModel.getPeriodsWithOutCancelled();
        final y a2 = y.a;
        final ArrayList<c> list2 = new ArrayList<c>(v.Y((Iterable<?>)periodsWithOutCancelled, 10));
        final Iterator<Object> iterator2 = periodsWithOutCancelled.iterator();
        while (iterator2.hasNext()) {
            list2.add(a2.b(iterator2.next()));
        }
        final l0<p0> h2 = b.h((List<p0>)list2);
        kotlin.jvm.internal.k0.o(h2, "toRealmList(timeTableModel.periodsWithOutCancelled\n                        .map(PeriodModelMapper::toRealmPeriodModel))");
        final HolidayModel holiday = timeTableModel.getHoliday();
        long holidayId;
        if (holiday == null) {
            holidayId = 0L;
        }
        else {
            holidayId = holiday.getHolidayId();
        }
        return new c5.e(webuntisId, entityId, n, timestamp, h, h2, holidayId, timeTableModel.getPreLoadedPeriodData(), timeTableModel.getLastRequestTimestamp(), null, 512, null);
    }
    
    @e
    public final TimeTableModel b(@e final String s, @e final c5.e e) {
        kotlin.jvm.internal.k0.p(s, "profileId");
        kotlin.jvm.internal.k0.p(e, "realmTimeTableModel");
        final Holiday b = com.untis.mobile.services.masterdata.b.Z.a(s).B(e.v8());
        final EntityType by = EntityType.Companion.findBy(e.u8());
        final long t8 = e.t8();
        final t t9 = new t(e.s8());
        final long b2 = e.B8();
        final l0<c> y8 = e.y8();
        final ArrayList list = new ArrayList<PeriodModel>(v.Y((Iterable<?>)y8, 10));
        for (final c c : y8) {
            final y a = y.a;
            kotlin.jvm.internal.k0.o(c, "realmPeriodModel");
            list.add(a.a(s, c));
        }
        final l0<c> z8 = e.z8();
        final ArrayList list2 = new ArrayList<PeriodModel>(v.Y((Iterable<?>)z8, 10));
        for (final c c2 : z8) {
            final y a2 = y.a;
            kotlin.jvm.internal.k0.o(c2, "realmPeriodModel");
            list2.add(a2.a(s, c2));
        }
        HolidayModel holidayModel;
        if (b != null) {
            holidayModel = new HolidayModel(b.getId());
        }
        else {
            holidayModel = null;
        }
        return new TimeTableModel(null, by, t8, t9, b2, list, list2, holidayModel, e.A8(), e.x8(), null, 1025, null);
    }
}
