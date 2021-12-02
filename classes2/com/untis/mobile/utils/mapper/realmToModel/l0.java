// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.n0;
import com.untis.mobile.api.common.masterdata.UMTimeGridDayUnit;
import com.untis.mobile.persistence.models.WeekDay;
import com.untis.mobile.api.common.masterdata.UMTimeGridDay;
import com.untis.mobile.persistence.models.timegrid.TimeGrid;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import java.util.List;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import b5.c;
import java.util.ArrayList;
import kotlin.collections.v;
import b5.b;
import com.untis.mobile.persistence.models.timegrid.TimeGridDay;
import b5.a;
import com.untis.mobile.api.common.masterdata.UMTimeGrid;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/l0;", "", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridDay;", "timeGridDay", "Lb5/b;", "d", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "timeGridUnit", "Lb5/c;", "e", "Lcom/untis/mobile/api/common/masterdata/UMTimeGrid;", "umTimeGrid", "", "schoolyearId", "Lb5/a;", "a", "Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;", "g", "timeGrid", "b", "realmTimeGrid", "f", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class l0
{
    @e
    public static final l0 a;
    
    static {
        a = new l0();
    }
    
    private l0() {
    }
    
    private final b d(final TimeGridDay timeGridDay) {
        final int dateTimeConstant = timeGridDay.getWeekDay().getDateTimeConstant();
        final List<TimeGridUnit> units = timeGridDay.getUnits();
        final ArrayList list = new ArrayList<c>(v.Y((Iterable<?>)units, 10));
        final Iterator<Object> iterator = units.iterator();
        while (iterator.hasNext()) {
            list.add(l0.a.e(iterator.next()));
        }
        final io.realm.l0<c> h = com.untis.mobile.utils.mapper.common.b.h((List<c>)list);
        k0.o(h, "toRealmList(timeGridDay.units.map { toRealmTimegridUnit(it) })");
        return new b(dateTimeConstant, h);
    }
    
    private final c e(final TimeGridUnit timeGridUnit) {
        return new c(timeGridUnit.getLabel(), timeGridUnit.getStart().k1(), timeGridUnit.getEnd().k1());
    }
    
    @e
    public final a a(@e final UMTimeGrid umTimeGrid, final long n) {
        k0.p(umTimeGrid, "umTimeGrid");
        final List<UMTimeGridDay> days = umTimeGrid.days;
        k0.o(days, "umTimeGrid.days");
        final ArrayList list = new ArrayList<b>(v.Y((Iterable<?>)days, 10));
        for (final UMTimeGridDay umTimeGridDay : days) {
            final int dateTimeConstant = WeekDay.fromWebUntis(umTimeGridDay.day.getWebUntisDay()).getDateTimeConstant();
            final List<UMTimeGridDayUnit> units = umTimeGridDay.units;
            k0.o(units, "umDay.units");
            final ArrayList<c> list2 = new ArrayList<c>();
            for (final UMTimeGridDayUnit umTimeGridDayUnit : units) {
                final long n2 = com.untis.mobile.utils.mapper.common.b.e(umTimeGridDayUnit.startTime).k1();
                final long n3 = com.untis.mobile.utils.mapper.common.b.e(umTimeGridDayUnit.endTime).k1();
                c c;
                if (n3 <= n2) {
                    c = null;
                }
                else {
                    final String label = umTimeGridDayUnit.label;
                    k0.o(label, "umUnit.label");
                    c = new c(label, n2, n3);
                }
                if (c != null) {
                    list2.add(c);
                }
            }
            final io.realm.l0<c> h = com.untis.mobile.utils.mapper.common.b.h(list2);
            k0.o(h, "toRealmList(umDay.units.mapNotNull { umUnit ->\n                                val start = Mapper.isoStringToLocalTime(umUnit.startTime).millisOfDay.toLong()\n                                val end = Mapper.isoStringToLocalTime(umUnit.endTime).millisOfDay.toLong()\n\n                                if (end <= start) {\n                                    return@mapNotNull null\n                                }\n\n                                return@mapNotNull RealmTimeGridUnit(\n                                        name = umUnit.label,\n                                        start = start,\n                                        end = end\n                                )\n                            })");
            list.add(new b(dateTimeConstant, h));
        }
        final io.realm.l0<b> h2 = com.untis.mobile.utils.mapper.common.b.h((List<b>)list);
        k0.o(h2, "toRealmList(umTimeGrid.days.map { umDay ->\n                    RealmTimeGridDay(\n                            weekday = WeekDay.fromWebUntis(umDay.day.webUntisDay).dateTimeConstant,\n                            units = Mapper.toRealmList(umDay.units.mapNotNull { umUnit ->\n                                val start = Mapper.isoStringToLocalTime(umUnit.startTime).millisOfDay.toLong()\n                                val end = Mapper.isoStringToLocalTime(umUnit.endTime).millisOfDay.toLong()\n\n                                if (end <= start) {\n                                    return@mapNotNull null\n                                }\n\n                                return@mapNotNull RealmTimeGridUnit(\n                                        name = umUnit.label,\n                                        start = start,\n                                        end = end\n                                )\n                            })\n                    )\n                })");
        return new a(n, h2);
    }
    
    @e
    public final a b(@e final TimeGrid timeGrid) {
        k0.p(timeGrid, "timeGrid");
        final long id = timeGrid.getId();
        final List<TimeGridDay> days = timeGrid.getDays();
        final ArrayList list = new ArrayList<b>(v.Y((Iterable<?>)days, 10));
        final Iterator<Object> iterator = days.iterator();
        while (iterator.hasNext()) {
            list.add(l0.a.d(iterator.next()));
        }
        final io.realm.l0<b> h = com.untis.mobile.utils.mapper.common.b.h((List<b>)list);
        k0.o(h, "toRealmList(timeGrid.days.map { toRealmTimegridDay(it) })");
        return new a(id, h);
    }
    
    @e
    public final TimeGrid f(@e final a a) {
        k0.p(a, "realmTimeGrid");
        final long t8 = a.t8();
        final io.realm.l0<b> s8 = a.s8();
        final ArrayList list = new ArrayList<TimeGridDay>(v.Y((Iterable<?>)s8, 10));
        for (final b b : s8) {
            final WeekDay fromDateTimeConstant = WeekDay.fromDateTimeConstant(b.t8());
            k0.o(fromDateTimeConstant, "fromDateTimeConstant(day.weekday)");
            final io.realm.l0<c> s9 = b.s8();
            final ArrayList<TimeGridUnit> list2 = new ArrayList<TimeGridUnit>();
            for (final c c : s9) {
                TimeGridUnit timeGridUnit;
                if (c.s8() <= c.u8()) {
                    timeGridUnit = null;
                }
                else {
                    final String t9 = c.t8();
                    final org.joda.time.v z = org.joda.time.v.z(c.u8());
                    k0.o(z, "fromMillisOfDay(unit.start)");
                    final org.joda.time.v z2 = org.joda.time.v.z(c.s8());
                    k0.o(z2, "fromMillisOfDay(unit.end)");
                    timeGridUnit = new TimeGridUnit(t9, z, z2);
                }
                if (timeGridUnit != null) {
                    list2.add(timeGridUnit);
                }
            }
            list.add(new TimeGridDay(fromDateTimeConstant, list2));
        }
        return new TimeGrid(t8, (List<TimeGridDay>)list);
    }
    
    @e
    public final TimeGrid g(@e final UMTimeGrid umTimeGrid, final long n) {
        k0.p(umTimeGrid, "umTimeGrid");
        final List<UMTimeGridDay> days = umTimeGrid.days;
        k0.o(days, "umTimeGrid.days");
        final ArrayList list = new ArrayList<TimeGridDay>(v.Y((Iterable<?>)days, 10));
        for (final UMTimeGridDay umTimeGridDay : days) {
            final WeekDay fromWebUntis = WeekDay.fromWebUntis(umTimeGridDay.day.getWebUntisDay());
            k0.o(fromWebUntis, "fromWebUntis(umDay.day.webUntisDay)");
            final List<UMTimeGridDayUnit> units = umTimeGridDay.units;
            k0.o(units, "umDay.units");
            final ArrayList<TimeGridUnit> list2 = new ArrayList<TimeGridUnit>();
            for (final UMTimeGridDayUnit umTimeGridDayUnit : units) {
                final org.joda.time.v e = com.untis.mobile.utils.mapper.common.b.e(umTimeGridDayUnit.startTime);
                k0.o(e, "isoStringToLocalTime(umUnit.startTime)");
                final org.joda.time.v e2 = com.untis.mobile.utils.mapper.common.b.e(umTimeGridDayUnit.endTime);
                k0.o(e2, "isoStringToLocalTime(umUnit.endTime)");
                TimeGridUnit timeGridUnit;
                if (!((org.joda.time.base.e)e2).p((n0)e) && !((org.joda.time.base.e)e2).o((n0)e)) {
                    final String label = umTimeGridDayUnit.label;
                    k0.o(label, "umUnit.label");
                    timeGridUnit = new TimeGridUnit(label, e, e2);
                }
                else {
                    timeGridUnit = null;
                }
                if (timeGridUnit != null) {
                    list2.add(timeGridUnit);
                }
            }
            list.add(new TimeGridDay(fromWebUntis, list2));
        }
        return new TimeGrid(n, (List<TimeGridDay>)list);
    }
}
