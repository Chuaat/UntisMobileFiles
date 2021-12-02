// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.k0;
import w4.b;
import com.untis.mobile.persistence.models.masterdata.Department;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMDepartment;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/g;", "", "Lcom/untis/mobile/api/common/masterdata/UMDepartment;", "umDepartment", "Lcom/untis/mobile/persistence/models/masterdata/Department;", "a", "Lw4/b;", "realmDepartment", "b", "department", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g
{
    @e
    public static final g a;
    
    static {
        a = new g();
    }
    
    private g() {
    }
    
    @f
    public final Department a(@f final UMDepartment umDepartment) {
        if (umDepartment == null) {
            return null;
        }
        final long id = umDepartment.id;
        final String name = umDepartment.name;
        final String s = "";
        String s2;
        if ((s2 = name) == null) {
            s2 = "";
        }
        String longName = umDepartment.longName;
        if (longName == null) {
            longName = s;
        }
        return new Department(id, s2, longName);
    }
    
    @e
    public final Department b(@e final b b) {
        k0.p(b, "realmDepartment");
        return new Department(b.s8(), b.u8(), b.t8());
    }
    
    @e
    public final b c(@e final Department department) {
        k0.p(department, "department");
        return new b(department.getId(), department.getName(), department.getLongName());
    }
}
