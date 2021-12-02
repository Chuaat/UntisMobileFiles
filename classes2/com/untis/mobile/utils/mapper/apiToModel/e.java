// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToModel;

import org.joda.time.c;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.classbook.absence.StudentAttendance;
import com.untis.mobile.api.common.absence.UMStudentAttendance;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.masterdata.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/apiToModel/e;", "", "Lcom/untis/mobile/api/common/absence/UMStudentAttendance;", "umStudentAttendance", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAttendance;", "a", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e
{
    @org.jetbrains.annotations.e
    private final a a;
    
    public e(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "profileId");
        this.a = b.Z.a(s);
    }
    
    @org.jetbrains.annotations.e
    public final StudentAttendance a(@org.jetbrains.annotations.e final UMStudentAttendance umStudentAttendance) {
        k0.p(umStudentAttendance, "umStudentAttendance");
        Student v;
        if ((v = this.a.V(umStudentAttendance.studentId)) == null) {
            v = new Student(umStudentAttendance.studentId, null, null, null, null, 30, null);
        }
        final c c = com.untis.mobile.utils.mapper.common.b.c(umStudentAttendance.startDateTime);
        k0.o(c, "isoStringToDateTime(umStudentAttendance.startDateTime)");
        final c c2 = com.untis.mobile.utils.mapper.common.b.c(umStudentAttendance.endDateTime);
        k0.o(c2, "isoStringToDateTime(umStudentAttendance.endDateTime)");
        return new StudentAttendance(v, c, c2);
    }
}
