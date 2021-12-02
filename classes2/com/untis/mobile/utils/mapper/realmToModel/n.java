// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import org.jetbrains.annotations.f;
import org.joda.time.v;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.WeekDay;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import com.untis.mobile.api.common.classreg.UMStudentExemption;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.masterdata.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/n;", "", "Lcom/untis/mobile/api/common/classreg/UMStudentExemption;", "umExcemption", "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "a", "Li4/b;", "realmExemption", "b", "exemption", "c", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class n
{
    @e
    private final a a;
    
    public n(@e final String s) {
        k0.p(s, "profileId");
        this.a = b.Z.a(s);
    }
    
    @e
    public final Exemption a(@e final UMStudentExemption umStudentExemption) {
        k0.p(umStudentExemption, "umExcemption");
        final long id = umStudentExemption.id;
        Student v = this.a.V(umStudentExemption.studentId);
        if (v == null) {
            v = new Student(umStudentExemption.studentId, null, null, null, null, 30, null);
        }
        final Subject u = this.a.U(umStudentExemption.subjectId);
        String subjectGroup = umStudentExemption.subjectGroup;
        if (subjectGroup == null) {
            subjectGroup = "";
        }
        String exemptionReason = umStudentExemption.exemptionReason;
        if (exemptionReason == null) {
            exemptionReason = "";
        }
        final t d = com.untis.mobile.utils.mapper.common.b.d(umStudentExemption.startDate);
        k0.o(d, "isoStringToLocalDate(umExcemption.startDate)");
        final t d2 = com.untis.mobile.utils.mapper.common.b.d(umStudentExemption.endDate);
        k0.o(d2, "isoStringToLocalDate(umExcemption.endDate)");
        final v e = com.untis.mobile.utils.mapper.common.b.e(umStudentExemption.startTime);
        k0.o(e, "isoStringToLocalTime(umExcemption.startTime)");
        final v e2 = com.untis.mobile.utils.mapper.common.b.e(umStudentExemption.endTime);
        k0.o(e2, "isoStringToLocalTime(umExcemption.endTime)");
        final com.untis.mobile.api.enumeration.WeekDay weekDay = umStudentExemption.weekDay;
        WeekDay fromWebUntis;
        if (weekDay != null) {
            fromWebUntis = WeekDay.fromWebUntis(weekDay.getWebUntisDay());
        }
        else {
            fromWebUntis = null;
        }
        String text;
        if ((text = umStudentExemption.text) == null) {
            text = "";
        }
        return new Exemption(id, v, u, subjectGroup, exemptionReason, d, d2, e, e2, fromWebUntis, text);
    }
    
    @f
    public final Exemption b(@e final i4.b b) {
        k0.p(b, "realmExemption");
        final long v8 = b.v8();
        final String b2 = b.B8();
        final t t = new t(b.s8());
        final v v9 = new v(b.t8());
        final String u8 = b.u8();
        final t t2 = new t(b.w8());
        final v v10 = new v(b.x8());
        final Student v11 = this.a.V(b.y8());
        if (v11 == null) {
            return null;
        }
        return new Exemption(v8, v11, this.a.U(b.z8()), b.A8(), u8, t2, t, v10, v9, WeekDay.fromDateTimeConstant(b.C8()), b2);
    }
    
    @e
    public final i4.b c(@e final Exemption exemption) {
        k0.p(exemption, "exemption");
        final long id = exemption.getId();
        final String subjectGroup = exemption.getSubjectGroup();
        final Subject subject = exemption.getSubject();
        long id2;
        if (subject == null) {
            id2 = 0L;
        }
        else {
            id2 = subject.getId();
        }
        final long id3 = exemption.getStudent().getId();
        final long n = exemption.getStartTime().k1();
        final long n2 = ((g)exemption.getStartDate().F0()).n();
        final String exemptionReason = exemption.getExemptionReason();
        final long n3 = exemption.getEndTime().k1();
        final long n4 = ((g)exemption.getEndDate().F0()).n();
        final String text = exemption.getText();
        final WeekDay weekDay = exemption.getWeekDay();
        int dateTimeConstant;
        if (weekDay == null) {
            dateTimeConstant = 0;
        }
        else {
            dateTimeConstant = weekDay.getDateTimeConstant();
        }
        return new i4.b(id, id3, id2, subjectGroup, exemptionReason, n2, n4, n, n3, dateTimeConstant, text);
    }
}
