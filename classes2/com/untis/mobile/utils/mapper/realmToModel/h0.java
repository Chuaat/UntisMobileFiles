// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import org.joda.time.t;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import w4.i;
import com.untis.mobile.api.common.masterdata.UMTeacher;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/h0;", "", "Lw4/i;", "realmTeacher", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "d", "Lcom/untis/mobile/api/common/masterdata/UMTeacher;", "umTeacher", "c", "a", "teacher", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h0
{
    @e
    public static final h0 a;
    
    static {
        a = new h0();
    }
    
    private h0() {
    }
    
    @e
    public final i a(@e final UMTeacher umTeacher) {
        k0.p(umTeacher, "umTeacher");
        final long id = umTeacher.id;
        String name = umTeacher.name;
        if (name == null) {
            name = "";
        }
        String firstName = umTeacher.firstName;
        if (firstName == null) {
            firstName = "";
        }
        String lastName = umTeacher.lastName;
        if (lastName == null) {
            lastName = "";
        }
        return new i(id, name, firstName, lastName, ((g)b.d(umTeacher.entryDate).F0()).n(), ((g)b.d(umTeacher.exitDate).F0().S0(1).v0(1)).n(), b.a(umTeacher.foreColor), b.a(umTeacher.backColor), umTeacher.active, umTeacher.displayAllowed);
    }
    
    @e
    public final i b(@e final Teacher teacher) {
        k0.p(teacher, "teacher");
        return new i(teacher.getId(), teacher.getName(), teacher.getFirstName(), teacher.getLastName(), ((g)teacher.getStart().F0()).n(), ((g)teacher.getEnd().F0().S0(1).v0(1)).n(), teacher.getTextColor(), teacher.getBackColor(), teacher.getActive(), teacher.getDisplayable());
    }
    
    @e
    public final Teacher c(@e final UMTeacher umTeacher) {
        k0.p(umTeacher, "umTeacher");
        final long id = umTeacher.id;
        String name = umTeacher.name;
        if (name == null) {
            name = "";
        }
        String firstName = umTeacher.firstName;
        if (firstName == null) {
            firstName = "";
        }
        String lastName = umTeacher.lastName;
        if (lastName == null) {
            lastName = "";
        }
        final t d = b.d(umTeacher.entryDate);
        k0.o(d, "isoStringToLocalDate(umTeacher.entryDate)");
        final t d2 = b.d(umTeacher.exitDate);
        k0.o(d2, "isoStringToLocalDate(umTeacher.exitDate)");
        return new Teacher(id, name, firstName, lastName, d, d2, b.a(umTeacher.foreColor), b.a(umTeacher.backColor), umTeacher.active, umTeacher.displayAllowed);
    }
    
    @e
    public final Teacher d(@e final i i) {
        k0.p(i, "realmTeacher");
        return new Teacher(i.x8(), i.z8(), i.w8(), i.y8(), new t(i.A8()), new t(i.v8()), i.B8(), i.t8(), i.s8(), i.u8());
    }
}
