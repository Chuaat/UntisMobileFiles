// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.studentabsence;

import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.services.masterdata.a;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import org.joda.time.r;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "isExcused", "Lorg/joda/time/r;", "interval", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class DashboardStudentAbsenceKt
{
    @e
    public static final r interval(@e final DashboardStudentAbsence dashboardStudentAbsence) {
        k0.p(dashboardStudentAbsence, "<this>");
        return new r((l0)dashboardStudentAbsence.getStart(), (l0)dashboardStudentAbsence.getEnd());
    }
    
    public static final boolean isExcused(@e final DashboardStudentAbsence dashboardStudentAbsence, @e final a a) {
        k0.p(dashboardStudentAbsence, "<this>");
        k0.p(a, "masterDataService");
        final DashboardExcuse excuse = dashboardStudentAbsence.getExcuse();
        if (excuse == null) {
            return dashboardStudentAbsence.getExcused();
        }
        final ExcuseStatus c = a.c(excuse.getStatusId());
        Boolean value;
        if (c == null) {
            value = null;
        }
        else {
            value = c.getExcused();
        }
        boolean b;
        if (value == null) {
            b = dashboardStudentAbsence.getExcused();
        }
        else {
            b = value;
        }
        return b;
    }
}
