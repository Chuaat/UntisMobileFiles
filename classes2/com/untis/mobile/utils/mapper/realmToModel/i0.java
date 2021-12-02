// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMTeachingMethod;
import kotlin.jvm.internal.k0;
import v4.b;
import com.untis.mobile.persistence.models.classbook.lessontopic.TeachingMethod;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/i0;", "", "Lcom/untis/mobile/api/common/masterdata/UMTeachingMethod;", "umTeachingMethod", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/TeachingMethod;", "b", "Lv4/b;", "realmTeachingMethod", "c", "teachingMethod", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i0
{
    @e
    public static final i0 a;
    
    static {
        a = new i0();
    }
    
    private i0() {
    }
    
    @e
    public final b a(@e final TeachingMethod teachingMethod) {
        k0.p(teachingMethod, "teachingMethod");
        return new b(teachingMethod.getId(), teachingMethod.getName(), teachingMethod.getLongName());
    }
    
    @f
    public final TeachingMethod b(@f final UMTeachingMethod umTeachingMethod) {
        if (umTeachingMethod == null) {
            return null;
        }
        final long id = umTeachingMethod.id;
        final String name = umTeachingMethod.name;
        if (name == null) {
            return null;
        }
        final String longName = umTeachingMethod.longName;
        if (longName == null) {
            return null;
        }
        return new TeachingMethod(id, name, longName);
    }
    
    @e
    public final TeachingMethod c(@e final b b) {
        k0.p(b, "realmTeachingMethod");
        return new TeachingMethod(b.s8(), b.u8(), b.t8());
    }
}
