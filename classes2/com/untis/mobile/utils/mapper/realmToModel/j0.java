// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import c5.d;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/j0;", "", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lc5/d;", "a", "realmTimeTableEntity", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j0
{
    @e
    public static final j0 a;
    
    static {
        a = new j0();
    }
    
    private j0() {
    }
    
    @e
    public final d a(@e final TimeTableEntity timeTableEntity) {
        k0.p(timeTableEntity, "timeTableEntity");
        return new d(timeTableEntity.getEntityType().getWebuntisId(), timeTableEntity.getEntityId(), timeTableEntity.getFavorite(), timeTableEntity.getCounter(), timeTableEntity.getTimestamp(), null, 32, null);
    }
    
    @e
    public final TimeTableEntity b(@e final d d) {
        k0.p(d, "realmTimeTableEntity");
        return new TimeTableEntity(EntityType.Companion.findBy(d.u8()), d.t8(), d.v8(), d.s8(), d.x8(), null, 32, null);
    }
}
