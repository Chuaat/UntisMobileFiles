// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import k4.a;
import org.joda.time.t;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import com.untis.mobile.api.common.classreg.UMClassRole;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/c;", "", "Lcom/untis/mobile/persistence/models/classbook/duty/ClassRole;", "classRole", "Lk4/a;", "c", "realmClassRole", "b", "Lcom/untis/mobile/api/common/classreg/UMClassRole;", "umClassRole", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    @e
    public final ClassRole a(@e final UMClassRole umClassRole) {
        k0.p(umClassRole, "umClassRole");
        final long studentId = umClassRole.studentId;
        final long klasseId = umClassRole.klasseId;
        final long dutyId = umClassRole.dutyId;
        final t d = b.d(umClassRole.startDate);
        k0.o(d, "isoStringToLocalDate(umClassRole.startDate)");
        final t d2 = b.d(umClassRole.endDate);
        k0.o(d2, "isoStringToLocalDate(umClassRole.endDate)");
        String text;
        if ((text = umClassRole.text) == null) {
            text = "";
        }
        return new ClassRole(studentId, klasseId, dutyId, d, d2, text);
    }
    
    @e
    public final ClassRole b(@e final a a) {
        k0.p(a, "realmClassRole");
        final long w8 = a.w8();
        final long u8 = a.u8();
        final long s8 = a.s8();
        final t h1 = new org.joda.time.c(a.v8()).h1();
        k0.o(h1, "DateTime(realmClassRole.start).toLocalDate()");
        final t h2 = new org.joda.time.c(a.t8()).h1();
        k0.o(h2, "DateTime(realmClassRole.end).toLocalDate()");
        return new ClassRole(w8, u8, s8, h1, h2, a.x8());
    }
    
    @e
    public final a c(@e final ClassRole classRole) {
        k0.p(classRole, "classRole");
        return new a(classRole.getStudentId(), classRole.getKlasseId(), classRole.getDutyId(), ((g)classRole.getStart().F0()).n(), ((g)classRole.getEnd().F0().S0(1).v0(1)).n(), classRole.getText());
    }
}
