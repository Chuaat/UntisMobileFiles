// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.parentday;

import org.joda.time.base.d;
import org.joda.time.c;
import java.util.Iterator;
import org.joda.time.n0;
import java.util.Collection;
import kotlin.collections.v;
import org.joda.time.l0;
import org.joda.time.r;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000\u001a\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "Lorg/joda/time/r;", "interval", "", "Lorg/joda/time/t;", "getLocalDates", "date", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "getAppointmentsBy", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointmentBlock;", "getAppointmentBlocksBy", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class DashboardParentDayKt
{
    @e
    public static final List<DashboardParentDayAppointmentBlock> getAppointmentBlocksBy(@e final DashboardParentDay dashboardParentDay, @e final t t) {
        k0.p(dashboardParentDay, "<this>");
        k0.p(t, "date");
        final ArrayList<DashboardParentDayAppointmentBlock> list = new ArrayList<DashboardParentDayAppointmentBlock>();
        final List<DashboardParentDayAppointment> appointmentsBy = getAppointmentsBy(dashboardParentDay, t);
        if (appointmentsBy.isEmpty()) {
            list.add(new DashboardParentDayAppointmentBlock(new r((l0)dashboardParentDay.getStart(), (l0)dashboardParentDay.getEnd()), null, null, v.E()));
            return list;
        }
        if (appointmentsBy.size() == 1) {
            final DashboardParentDayAppointment dashboardParentDayAppointment = appointmentsBy.get(0);
            r r;
            if (k0.g(dashboardParentDayAppointment.getStart(), dashboardParentDay.getStart())) {
                r = null;
            }
            else {
                r = new r((l0)dashboardParentDay.getStart(), (l0)dashboardParentDayAppointment.getStart());
            }
            r r2;
            if (k0.g(dashboardParentDayAppointment.getEnd(), dashboardParentDay.getEnd())) {
                r2 = null;
            }
            else {
                r2 = new r((l0)dashboardParentDayAppointment.getEnd(), (l0)dashboardParentDay.getEnd());
            }
            list.add(new DashboardParentDayAppointmentBlock(r, DashboardParentDayAppointmentKt.interval(dashboardParentDayAppointment), r2, v.k(dashboardParentDayAppointment)));
            if (!k0.g(((d)DashboardParentDayAppointmentKt.interval(dashboardParentDayAppointment)).s(), dashboardParentDay.getEnd())) {
                list.add(new DashboardParentDayAppointmentBlock(new r((l0)((d)DashboardParentDayAppointmentKt.interval(dashboardParentDayAppointment)).s(), (l0)dashboardParentDay.getEnd()), null, null, v.E()));
            }
            return list;
        }
        final ArrayList list2 = new ArrayList<Object>(v.Y((Iterable<?>)appointmentsBy, 10));
        for (final DashboardParentDayAppointment dashboardParentDayAppointment2 : appointmentsBy) {
            list2.add(new DashboardParentDayAppointmentBlock(null, DashboardParentDayAppointmentKt.interval(dashboardParentDayAppointment2), null, v.k(dashboardParentDayAppointment2)));
        }
        for (final DashboardParentDayAppointmentBlock e : list2) {
            final Iterator<Object> iterator3 = list.iterator();
            boolean b = false;
            while (iterator3.hasNext()) {
                final DashboardParentDayAppointmentBlock dashboardParentDayAppointmentBlock = iterator3.next();
                final r interval = dashboardParentDayAppointmentBlock.getInterval();
                boolean b3 = false;
                Label_0438: {
                    if (interval != null) {
                        final c s = ((d)interval).s();
                        if (s != null) {
                            final r interval2 = e.getInterval();
                            Object b2;
                            if (interval2 == null) {
                                b2 = null;
                            }
                            else {
                                b2 = ((d)interval2).b();
                            }
                            if (((org.joda.time.base.c)s).X4((l0)b2)) {
                                b3 = true;
                                break Label_0438;
                            }
                        }
                    }
                    b3 = false;
                }
                if (b3) {
                    dashboardParentDayAppointmentBlock.setAppointments((List<DashboardParentDayAppointment>)v.q4((Collection<?>)dashboardParentDayAppointmentBlock.getAppointments(), (Iterable<?>)e.getAppointments()));
                    final r interval3 = dashboardParentDayAppointmentBlock.getInterval();
                    Object b4;
                    if (interval3 == null) {
                        b4 = null;
                    }
                    else {
                        b4 = ((d)interval3).b();
                    }
                    final r interval4 = e.getInterval();
                    Object s2;
                    if (interval4 == null) {
                        s2 = null;
                    }
                    else {
                        s2 = ((d)interval4).s();
                    }
                    dashboardParentDayAppointmentBlock.setInterval(new r((l0)b4, (l0)s2));
                    b = true;
                }
            }
            if (!b) {
                list.add(e);
            }
        }
        final Iterator<Object> iterator4 = list.iterator();
        int n = 0;
        while (iterator4.hasNext()) {
            final DashboardParentDayAppointmentBlock next = iterator4.next();
            final int index = n + 1;
            if (n < 0) {
                v.W();
            }
            final DashboardParentDayAppointmentBlock dashboardParentDayAppointmentBlock2 = next;
            Label_1035: {
                r afterFree;
                if (n == 0) {
                    final r interval5 = dashboardParentDayAppointmentBlock2.getInterval();
                    boolean b6 = false;
                    Label_0648: {
                        if (interval5 != null) {
                            final c b5 = ((d)interval5).b();
                            if (b5 != null) {
                                final org.joda.time.v j1 = b5.j1();
                                if (j1 != null) {
                                    if (((org.joda.time.base.e)j1).p((n0)dashboardParentDay.getStart().j1())) {
                                        b6 = true;
                                        break Label_0648;
                                    }
                                }
                            }
                        }
                        b6 = false;
                    }
                    if (b6) {
                        dashboardParentDayAppointmentBlock2.setBeforeFree(null);
                    }
                    else {
                        final c start = dashboardParentDay.getStart();
                        final r interval6 = dashboardParentDayAppointmentBlock2.getInterval();
                        Object b7;
                        if (interval6 == null) {
                            b7 = null;
                        }
                        else {
                            b7 = ((d)interval6).b();
                        }
                        dashboardParentDayAppointmentBlock2.setBeforeFree(new r((l0)start, (l0)b7));
                    }
                    final r interval7 = dashboardParentDayAppointmentBlock2.getInterval();
                    Object s3;
                    if (interval7 == null) {
                        s3 = null;
                    }
                    else {
                        s3 = ((d)interval7).s();
                    }
                    afterFree = new r((l0)s3, (l0)dashboardParentDay.getEnd());
                }
                else {
                    if (n == v.G((List<?>)list)) {
                        final r interval8 = dashboardParentDayAppointmentBlock2.getInterval();
                        boolean b8 = false;
                        Label_0795: {
                            if (interval8 != null) {
                                final c s4 = ((d)interval8).s();
                                if (s4 != null) {
                                    if (((org.joda.time.base.c)s4).X4((l0)dashboardParentDay.getEnd())) {
                                        b8 = true;
                                        break Label_0795;
                                    }
                                }
                            }
                            b8 = false;
                        }
                        if (b8) {
                            dashboardParentDayAppointmentBlock2.setAfterFree(null);
                        }
                        else {
                            final r interval9 = dashboardParentDayAppointmentBlock2.getInterval();
                            Object s5;
                            if (interval9 == null) {
                                s5 = null;
                            }
                            else {
                                s5 = ((d)interval9).s();
                            }
                            dashboardParentDayAppointmentBlock2.setAfterFree(new r((l0)s5, (l0)dashboardParentDay.getEnd()));
                        }
                        final r interval10 = list.get(n - 1).getInterval();
                        Object s6;
                        if (interval10 == null) {
                            s6 = null;
                        }
                        else {
                            s6 = ((d)interval10).s();
                        }
                        final r interval11 = dashboardParentDayAppointmentBlock2.getInterval();
                        Object b9;
                        if (interval11 == null) {
                            b9 = null;
                        }
                        else {
                            b9 = ((d)interval11).b();
                        }
                        dashboardParentDayAppointmentBlock2.setBeforeFree(new r((l0)s6, (l0)b9));
                        break Label_1035;
                    }
                    final r interval12 = list.get(n - 1).getInterval();
                    Object s7;
                    if (interval12 == null) {
                        s7 = null;
                    }
                    else {
                        s7 = ((d)interval12).s();
                    }
                    final r interval13 = dashboardParentDayAppointmentBlock2.getInterval();
                    Object b10;
                    if (interval13 == null) {
                        b10 = null;
                    }
                    else {
                        b10 = ((d)interval13).b();
                    }
                    dashboardParentDayAppointmentBlock2.setBeforeFree(new r((l0)s7, (l0)b10));
                    final r interval14 = dashboardParentDayAppointmentBlock2.getInterval();
                    Object s8;
                    if (interval14 == null) {
                        s8 = null;
                    }
                    else {
                        s8 = ((d)interval14).s();
                    }
                    final r interval15 = list.get(index).getInterval();
                    Object b11;
                    if (interval15 == null) {
                        b11 = null;
                    }
                    else {
                        b11 = ((d)interval15).b();
                    }
                    afterFree = new r((l0)s8, (l0)b11);
                }
                dashboardParentDayAppointmentBlock2.setAfterFree(afterFree);
            }
            n = index;
        }
        final DashboardParentDayAppointmentBlock value = list.get(v.G((List<?>)list));
        k0.o(value, "blocks[blocks.lastIndex]");
        final DashboardParentDayAppointmentBlock dashboardParentDayAppointmentBlock3 = value;
        final r interval16 = dashboardParentDayAppointmentBlock3.getInterval();
        Object s9;
        if (interval16 == null) {
            s9 = null;
        }
        else {
            s9 = ((d)interval16).s();
        }
        if (!k0.g(s9, dashboardParentDay.getEnd())) {
            final r interval17 = dashboardParentDayAppointmentBlock3.getInterval();
            Object s10;
            if (interval17 == null) {
                s10 = null;
            }
            else {
                s10 = ((d)interval17).s();
            }
            list.add(new DashboardParentDayAppointmentBlock(new r((l0)s10, (l0)dashboardParentDay.getEnd()), null, null, v.E()));
        }
        return list;
    }
    
    @e
    public static final List<DashboardParentDayAppointment> getAppointmentsBy(@e final DashboardParentDay dashboardParentDay, @e final t t) {
        k0.p(dashboardParentDay, "<this>");
        k0.p(t, "date");
        Object o;
        if ((o = dashboardParentDay.getAppointments()) == null) {
            o = v.E();
        }
        final ArrayList<DashboardParentDayAppointment> list = new ArrayList<DashboardParentDayAppointment>();
        for (final DashboardParentDayAppointment next : o) {
            if (((org.joda.time.base.e)next.getStart().h1()).p((n0)t)) {
                list.add(next);
            }
        }
        return (List<DashboardParentDayAppointment>)v.d5((Iterable<? extends Comparable>)list);
    }
    
    @e
    public static final List<t> getLocalDates(@e final DashboardParentDay dashboardParentDay) {
        k0.p(dashboardParentDay, "<this>");
        Object o;
        if ((o = dashboardParentDay.getAppointments()) == null) {
            o = v.E();
        }
        final List<Comparable> d5 = v.d5((Iterable<? extends Comparable>)o);
        final ArrayList list = new ArrayList<t>(v.Y((Iterable<?>)d5, 10));
        final Iterator<DashboardParentDayAppointment> iterator = d5.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getStart().h1());
        }
        return v.N1((Iterable<? extends t>)list);
    }
    
    @e
    public static final r interval(@e final DashboardParentDay dashboardParentDay) {
        k0.p(dashboardParentDay, "<this>");
        return new r((l0)dashboardParentDay.getStart(), (l0)dashboardParentDay.getEnd());
    }
}
