// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.k0;
import j4.b;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMAbsenceReason;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/a;", "", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "absenceReason", "Lj4/b;", "c", "realmAbsenceReason", "b", "Lcom/untis/mobile/api/common/masterdata/UMAbsenceReason;", "umAbsenceReason", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    @f
    public final AbsenceReason a(@f final UMAbsenceReason umAbsenceReason) {
        if (umAbsenceReason == null) {
            return null;
        }
        final long id = umAbsenceReason.id;
        String name = umAbsenceReason.name;
        if (name == null) {
            name = "";
        }
        String longName = umAbsenceReason.longName;
        if (longName == null) {
            longName = "";
        }
        return new AbsenceReason(id, name, longName, umAbsenceReason.active);
    }
    
    @e
    public final AbsenceReason b(@e final b b) {
        k0.p(b, "realmAbsenceReason");
        return new AbsenceReason(b.t8(), b.v8(), b.u8(), b.s8());
    }
    
    @e
    public final b c(@e final AbsenceReason absenceReason) {
        k0.p(absenceReason, "absenceReason");
        return new b(absenceReason.getId(), absenceReason.getName(), absenceReason.getLongName(), absenceReason.getActive());
    }
}
