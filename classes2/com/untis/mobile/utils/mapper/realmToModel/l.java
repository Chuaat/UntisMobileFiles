// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.k0;
import l4.b;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMEventReason;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/l;", "", "Lcom/untis/mobile/api/common/masterdata/UMEventReason;", "umEventReason", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "a", "Ll4/b;", "realmEventReason", "b", "eventReason", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class l
{
    @e
    public static final l a;
    
    static {
        a = new l();
    }
    
    private l() {
    }
    
    @f
    public final EventReason a(@f final UMEventReason umEventReason) {
        if (umEventReason == null) {
            return null;
        }
        final long id = umEventReason.id;
        String name = umEventReason.name;
        if (name == null) {
            name = "";
        }
        String longName = umEventReason.longName;
        if (longName == null) {
            longName = "";
        }
        return new EventReason(id, name, longName, EntityType.Companion.findBy(umEventReason.elementType), umEventReason.groupId, umEventReason.active);
    }
    
    @e
    public final EventReason b(@e final b b) {
        k0.p(b, "realmEventReason");
        return new EventReason(b.v8(), b.x8(), b.w8(), EntityType.Companion.findBy(b.t8()), b.u8(), b.s8());
    }
    
    @e
    public final b c(@e final EventReason eventReason) {
        k0.p(eventReason, "eventReason");
        return new b(eventReason.getId(), eventReason.getName(), eventReason.getLongName(), eventReason.getEntityType().getWebuntisId(), eventReason.getGroupId(), eventReason.getActive());
    }
}
