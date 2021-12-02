// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.k0;
import k4.b;
import com.untis.mobile.persistence.models.classbook.duty.DutyType;
import com.untis.mobile.persistence.models.classbook.duty.Duty;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMDuty;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/i;", "", "Lk4/b;", "realmDuty", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "b", "Lcom/untis/mobile/api/common/masterdata/UMDuty;", "umDuty", "a", "duty", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i
{
    @e
    public static final i a;
    
    static {
        a = new i();
    }
    
    private i() {
    }
    
    @f
    public final Duty a(@f final UMDuty umDuty) {
        if (umDuty == null) {
            return null;
        }
        final long id = umDuty.id;
        String name = umDuty.name;
        if (name == null) {
            name = "";
        }
        String longName = umDuty.longName;
        if (longName == null) {
            longName = "";
        }
        return new Duty(id, name, longName, DutyType.Companion.fromUmDutyType(umDuty.type));
    }
    
    @e
    public final Duty b(@e final b b) {
        k0.p(b, "realmDuty");
        return new Duty(b.s8(), b.u8(), b.t8(), DutyType.Companion.fromValue(b.v8()));
    }
    
    @e
    public final b c(@e final Duty duty) {
        k0.p(duty, "duty");
        return new b(duty.getId(), duty.getName(), duty.getLongName(), duty.getType().getValue());
    }
}
