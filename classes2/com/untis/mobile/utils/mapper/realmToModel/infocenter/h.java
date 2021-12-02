// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import kotlin.jvm.internal.k0;
import q4.b;
import org.joda.time.c;
import com.untis.mobile.persistence.models.infocenter.InfoCenterStudentAbsence;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.utils.mapper.common.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/h;", "Lcom/untis/mobile/utils/mapper/common/a;", "Lcom/untis/mobile/api/common/absence/UMStudentAbsence;", "umStudentAbsence", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterStudentAbsence;", "i", "Lq4/b;", "absence", "j", "k", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends a
{
    @e
    public static final h a;
    
    static {
        a = new h();
    }
    
    private h() {
    }
    
    @f
    public final InfoCenterStudentAbsence i(@f final UMStudentAbsence umStudentAbsence) {
        if (umStudentAbsence == null) {
            return null;
        }
        final long id = umStudentAbsence.id;
        final c c = this.c(umStudentAbsence.startDateTime);
        if (c == null) {
            return null;
        }
        final c c2 = this.c(umStudentAbsence.endDateTime);
        if (c2 == null) {
            return null;
        }
        String text;
        if ((text = umStudentAbsence.text) == null) {
            text = "";
        }
        return new InfoCenterStudentAbsence(id, c, c2, text, umStudentAbsence.studentId, umStudentAbsence.klasseId, umStudentAbsence.absenceReasonId, umStudentAbsence.excused, umStudentAbsence.owner, d.a.i(umStudentAbsence.excuse));
    }
    
    @e
    public final InfoCenterStudentAbsence j(@e final b b) {
        k0.p(b, "absence");
        final long w8 = b.w8();
        final c k0 = c.K0(b.z8());
        kotlin.jvm.internal.k0.o(k0, "parse(absence.start)");
        final c k2 = c.K0(b.t8());
        kotlin.jvm.internal.k0.o(k2, "parse(absence.end)");
        return new InfoCenterStudentAbsence(w8, k0, k2, b.B8(), b.A8(), b.x8(), b.s8(), b.v8(), b.y8(), d.a.j(b.u8()));
    }
    
    @e
    public final b k(@e final InfoCenterStudentAbsence infoCenterStudentAbsence) {
        k0.p(infoCenterStudentAbsence, "absence");
        final long id = infoCenterStudentAbsence.getId();
        final String string = ((org.joda.time.base.a)infoCenterStudentAbsence.getStart()).toString();
        k0.o(string, "absence.start.toString()");
        final String string2 = ((org.joda.time.base.a)infoCenterStudentAbsence.getEnd()).toString();
        k0.o(string2, "absence.end.toString()");
        return new b(id, string, string2, infoCenterStudentAbsence.getText(), infoCenterStudentAbsence.getStudentId(), infoCenterStudentAbsence.getKlassenId(), infoCenterStudentAbsence.getAbsenceReasonId(), infoCenterStudentAbsence.getExcused(), infoCenterStudentAbsence.getOwner(), d.a.k(infoCenterStudentAbsence.getExcuse()));
    }
}
