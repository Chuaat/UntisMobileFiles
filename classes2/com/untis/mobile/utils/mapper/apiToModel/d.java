// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToModel;

import w4.g;
import com.untis.mobile.api.common.masterdata.UMExcuse;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.mapper.realmToModel.f0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.utils.mapper.realmToModel.q;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.utils.mapper.realmToModel.m;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import org.joda.time.t;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import j4.c;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.masterdata.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u0018R\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006&" }, d2 = { "Lcom/untis/mobile/utils/mapper/apiToModel/d;", "", "Lj4/c;", "realmExcuse", "Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;", "a", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "absenceReason", "Lj4/b;", "b", "excuse", "c", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "excuseStatus", "Lj4/d;", "d", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klasse", "Lw4/d;", "e", "", "periodId", "Lcom/untis/mobile/api/common/absence/UMStudentAbsence;", "umStudentAbsence", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "g", "Lj4/a;", "realmAbsence", "h", "studentAbsence", "f", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d
{
    @e
    private final a a;
    
    public d(@e final String s) {
        k0.p(s, "profileId");
        this.a = b.Z.a(s);
    }
    
    private final Excuse a(final c c) {
        ExcuseStatus c2 = null;
        if (c == null) {
            return null;
        }
        final j4.d t8 = c.t8();
        if (t8 != null) {
            c2 = this.a.c(t8.t8());
        }
        return new Excuse(c.u8(), c2, c.w8(), c.v8(), new t(c.s8()));
    }
    
    private final j4.b b(final AbsenceReason absenceReason) {
        if (absenceReason == null) {
            return null;
        }
        return com.untis.mobile.utils.mapper.realmToModel.a.a.c(absenceReason);
    }
    
    private final c c(final Excuse excuse) {
        if (excuse == null) {
            return null;
        }
        return new c(excuse.getId(), this.d(excuse.getExcuseStatus()), excuse.getText(), excuse.getNumber(), ((org.joda.time.base.g)excuse.getDate().F0()).n());
    }
    
    private final j4.d d(final ExcuseStatus excuseStatus) {
        if (excuseStatus == null) {
            return null;
        }
        return m.a.d(excuseStatus);
    }
    
    private final w4.d e(final Klasse klasse) {
        if (klasse == null) {
            return null;
        }
        return q.a.d(klasse);
    }
    
    @f
    public final j4.a f(@e final StudentAbsence studentAbsence) {
        k0.p(studentAbsence, "studentAbsence");
        return new j4.a(studentAbsence.getId(), ((org.joda.time.base.g)studentAbsence.getStart()).n(), ((org.joda.time.base.g)studentAbsence.getEnd()).n(), studentAbsence.getText(), f0.a.b(studentAbsence.getStudent()), this.e(studentAbsence.getKlasse()), this.b(studentAbsence.getAbsenceReason()), studentAbsence.getExcused(), studentAbsence.getOwner(), this.c(studentAbsence.getExcuse()), studentAbsence.getPeriodId(), studentAbsence.getSynced());
    }
    
    @e
    public final StudentAbsence g(final long n, @e final UMStudentAbsence umStudentAbsence) {
        k0.p(umStudentAbsence, "umStudentAbsence");
        final UMExcuse excuse = umStudentAbsence.excuse;
        Excuse excuse3;
        if (excuse != null) {
            final ExcuseStatus c = this.a.c(excuse.excuseStatusId);
            final UMExcuse excuse2 = umStudentAbsence.excuse;
            final long id = excuse2.id;
            String text = excuse2.text;
            if (text == null) {
                text = "";
            }
            final long number = excuse2.number;
            final t d = com.untis.mobile.utils.mapper.common.b.d(excuse2.date);
            k0.o(d, "isoStringToLocalDate(umStudentAbsence.excuse.date)");
            excuse3 = new Excuse(id, c, text, number, d);
        }
        else {
            excuse3 = null;
        }
        final long id2 = umStudentAbsence.id;
        Student v;
        if ((v = this.a.V(umStudentAbsence.studentId)) == null) {
            v = new Student(umStudentAbsence.studentId, null, null, null, null, 30, null);
        }
        final Klasse n2 = this.a.N(umStudentAbsence.klasseId);
        final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umStudentAbsence.startDateTime);
        k0.o(c2, "isoStringToDateTime(umStudentAbsence.startDateTime)");
        final org.joda.time.c c3 = com.untis.mobile.utils.mapper.common.b.c(umStudentAbsence.endDateTime);
        k0.o(c3, "isoStringToDateTime(umStudentAbsence.endDateTime)");
        final boolean excused = umStudentAbsence.excused;
        final AbsenceReason h = this.a.H(umStudentAbsence.absenceReasonId);
        final boolean owner = umStudentAbsence.owner;
        String text2 = umStudentAbsence.text;
        if (text2 == null) {
            text2 = "";
        }
        return new StudentAbsence(id2, n, v, n2, c2, c3, excused, h, owner, text2, excuse3, true);
    }
    
    @f
    public final StudentAbsence h(@e final j4.a a) {
        k0.p(a, "realmAbsence");
        final long w8 = a.w8();
        final String d8 = a.D8();
        final a a2 = this.a;
        final g b8 = a.B8();
        Long value;
        if (b8 == null) {
            value = null;
        }
        else {
            value = b8.u8();
        }
        if (value == null) {
            return null;
        }
        final Student v = a2.V(value);
        if (v == null) {
            return null;
        }
        final boolean c8 = a.C8();
        final long z8 = a.z8();
        final org.joda.time.c c9 = new org.joda.time.c(a.A8());
        final boolean v2 = a.v8();
        final org.joda.time.c c10 = new org.joda.time.c(a.t8());
        final a a3 = this.a;
        final j4.b s8 = a.s8();
        long t8;
        if (s8 == null) {
            t8 = 0L;
        }
        else {
            t8 = s8.t8();
        }
        final AbsenceReason h = a3.H(t8);
        final Excuse a4 = this.a(a.u8());
        final a a5 = this.a;
        final w4.d x8 = a.x8();
        long w9;
        if (x8 == null) {
            w9 = 0L;
        }
        else {
            w9 = x8.w8();
        }
        return new StudentAbsence(w8, z8, v, a5.N(w9), c9, c10, v2, h, a.y8(), d8, a4, c8);
    }
}
