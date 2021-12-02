// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import w4.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/f;", "", "Lw4/a;", "realmCustomEntityColor", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "a", "customEntityColor", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f
{
    @e
    public static final f a;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    @e
    public final CustomEntityColor a(@e final a a) {
        k0.p(a, "realmCustomEntityColor");
        return new CustomEntityColor(EntityType.Companion.findBy(a.u8()), a.t8(), a.w8(), a.s8());
    }
    
    @e
    public final a b(@e final CustomEntityColor customEntityColor) {
        k0.p(customEntityColor, "customEntityColor");
        return new a(customEntityColor.getEntityType().getWebuntisId(), customEntityColor.getEntityId(), customEntityColor.getTextColor(), customEntityColor.getBackColor(), null, 16, null);
    }
}
