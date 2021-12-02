// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import com.untis.mobile.persistence.models.Displayable;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.services.timetable.placeholder.j;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel;
import c5.b;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/v;", "", "Lc5/b;", "realmPeriodElementModel", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "a", "periodElementModel", "c", "Lcom/untis/mobile/services/timetable/placeholder/j;", "helper", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "current", "original", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class v
{
    @e
    public static final v a;
    
    static {
        a = new v();
    }
    
    private v() {
    }
    
    @e
    public final PeriodElementModel a(@e final b b) {
        k0.p(b, "realmPeriodElementModel");
        return new PeriodElementModel(EntityType.Companion.findBy(b.u8()), b.t8(), b.x8(), b.v8(), b.w8(), b.y8(), b.s8());
    }
    
    @e
    public final PeriodElementModel b(@e final j j, @e final EntityType entityType, @f final DisplayableEntity displayableEntity, @f final DisplayableEntity displayableEntity2) {
        k0.p(j, "helper");
        k0.p(entityType, "entityType");
        long entityId = 0L;
        long entityId2;
        if (displayableEntity == null) {
            entityId2 = 0L;
        }
        else {
            entityId2 = displayableEntity.entityId();
        }
        if (displayableEntity2 != null) {
            entityId = displayableEntity2.entityId();
        }
        return new PeriodElementModel(entityType, entityId2, entityId, j.i(displayableEntity, displayableEntity2), j.j(displayableEntity, displayableEntity2), j.k(displayableEntity, displayableEntity2), j.h(displayableEntity, displayableEntity2));
    }
    
    @e
    public final b c(@e final PeriodElementModel periodElementModel) {
        k0.p(periodElementModel, "periodElementModel");
        return new b(periodElementModel.getEntityType().getWebuntisId(), periodElementModel.getCurrentId(), periodElementModel.getOriginalId(), periodElementModel.getLabel(), periodElementModel.getLabelLong(), periodElementModel.getTextColor(), periodElementModel.getBackGround());
    }
}
