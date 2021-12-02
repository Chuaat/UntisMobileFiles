// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import org.joda.time.t;
import com.untis.mobile.api.common.masterdata.UMSchoolyear;
import kotlin.jvm.internal.k0;
import w4.f;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.utils.mapper.common.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/e0;", "Lcom/untis/mobile/utils/mapper/common/a;", "Lcom/untis/mobile/api/common/masterdata/UMSchoolyear;", "umSchoolyear", "Lcom/untis/mobile/persistence/models/masterdata/Schoolyear;", "j", "Lw4/f;", "realmSchoolyear", "k", "schoolyear", "i", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e0 extends a
{
    @e
    public static final e0 a;
    
    static {
        a = new e0();
    }
    
    private e0() {
    }
    
    @e
    public final f i(@e final Schoolyear schoolyear) {
        k0.p(schoolyear, "schoolyear");
        return new f(schoolyear.getId(), schoolyear.getName(), ((g)schoolyear.getStart().F0()).n(), ((g)schoolyear.getEnd().F0()).n());
    }
    
    @org.jetbrains.annotations.f
    public final Schoolyear j(@org.jetbrains.annotations.f final UMSchoolyear umSchoolyear) {
        if (umSchoolyear == null) {
            return null;
        }
        final long id = umSchoolyear.id;
        final String name = umSchoolyear.name;
        if (name == null) {
            return null;
        }
        final t g = this.g(umSchoolyear.startDate);
        if (g == null) {
            return null;
        }
        final t g2 = this.g(umSchoolyear.endDate);
        if (g2 == null) {
            return null;
        }
        return new Schoolyear(id, name, g, g2);
    }
    
    @e
    public final Schoolyear k(@e final f f) {
        k0.p(f, "realmSchoolyear");
        return new Schoolyear(f.t8(), f.u8(), new t(f.v8()), new t(f.s8()));
    }
}
