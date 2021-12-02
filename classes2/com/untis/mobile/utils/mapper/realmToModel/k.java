// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.k0;
import l4.c;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMEventReasonGroup;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/k;", "", "Lcom/untis/mobile/api/common/masterdata/UMEventReasonGroup;", "umEventReasonGroup", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReasonGroup;", "a", "Ll4/c;", "realmEventReasonGroup", "b", "eventReasonGroup", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k
{
    @e
    public static final k a;
    
    static {
        a = new k();
    }
    
    private k() {
    }
    
    @f
    public final EventReasonGroup a(@f final UMEventReasonGroup umEventReasonGroup) {
        if (umEventReasonGroup == null) {
            return null;
        }
        final long id = umEventReasonGroup.id;
        final String name = umEventReasonGroup.name;
        if (name == null) {
            return null;
        }
        final String longName = umEventReasonGroup.longName;
        if (longName == null) {
            return null;
        }
        return new EventReasonGroup(id, name, longName, umEventReasonGroup.active);
    }
    
    @e
    public final EventReasonGroup b(@e final c c) {
        k0.p(c, "realmEventReasonGroup");
        return new EventReasonGroup(c.t8(), c.v8(), c.u8(), c.s8());
    }
    
    @e
    public final c c(@e final EventReasonGroup eventReasonGroup) {
        k0.p(eventReasonGroup, "eventReasonGroup");
        return new c(eventReasonGroup.getId(), eventReasonGroup.getName(), eventReasonGroup.getLongName(), eventReasonGroup.getActive());
    }
}
