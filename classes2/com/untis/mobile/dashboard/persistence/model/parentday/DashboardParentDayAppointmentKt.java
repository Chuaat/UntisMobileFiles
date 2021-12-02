// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.parentday;

import java.util.Iterator;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import org.joda.time.r;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "other", "", "isEqual", "Lorg/joda/time/r;", "interval", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class DashboardParentDayAppointmentKt
{
    @e
    public static final r interval(@e final DashboardParentDayAppointment dashboardParentDayAppointment) {
        k0.p(dashboardParentDayAppointment, "<this>");
        return new r((l0)dashboardParentDayAppointment.getStart(), (l0)dashboardParentDayAppointment.getEnd());
    }
    
    public static final boolean isEqual(@e final DashboardParentDayAppointment dashboardParentDayAppointment, @e final DashboardParentDayAppointment dashboardParentDayAppointment2) {
        k0.p(dashboardParentDayAppointment, "<this>");
        k0.p(dashboardParentDayAppointment2, "other");
        if (dashboardParentDayAppointment.getTeacherId() != dashboardParentDayAppointment2.getTeacherId()) {
            return false;
        }
        if (dashboardParentDayAppointment.getRoomId() != dashboardParentDayAppointment2.getRoomId()) {
            return false;
        }
        if (dashboardParentDayAppointment.getCancelled() != dashboardParentDayAppointment2.getCancelled()) {
            return false;
        }
        final Iterator<DashboardParentDayStudentSubject> iterator = dashboardParentDayAppointment.getStudentSubjects().iterator();
        while (iterator.hasNext()) {
            if (!dashboardParentDayAppointment2.getStudentSubjects().contains(iterator.next())) {
                return false;
            }
        }
        final Iterator<DashboardParentDayStudentSubject> iterator2 = dashboardParentDayAppointment2.getStudentSubjects().iterator();
        while (iterator2.hasNext()) {
            if (!dashboardParentDayAppointment.getStudentSubjects().contains(iterator2.next())) {
                return false;
            }
        }
        return true;
    }
}
