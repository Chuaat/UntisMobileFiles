// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import org.joda.time.c;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.api.common.classreg.UMClassRegEvent;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.masterdata.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/j;", "", "Ll4/a;", "realmEvent", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "b", "", "periodId", "Lcom/untis/mobile/api/common/classreg/UMClassRegEvent;", "umEvent", "a", "event", "c", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j
{
    @e
    private final a a;
    
    public j(@e final String s) {
        k0.p(s, "profileId");
        this.a = b.Z.a(s);
    }
    
    @e
    public final Event a(final long n, @e final UMClassRegEvent umClassRegEvent) {
        k0.p(umClassRegEvent, "umEvent");
        final long id = umClassRegEvent.id;
        final EntityType by = EntityType.Companion.findBy(umClassRegEvent.elementType);
        final long elementId = umClassRegEvent.elementId;
        final c c = com.untis.mobile.utils.mapper.common.b.c(umClassRegEvent.dateTime);
        k0.o(c, "isoStringToDateTime(umEvent.dateTime)");
        String text;
        if ((text = umClassRegEvent.text) == null) {
            text = "";
        }
        return new Event(id, n, by, elementId, c, text, this.a.w(umClassRegEvent.eventReasonId), true);
    }
    
    @e
    public final Event b(@e final l4.a a) {
        k0.p(a, "realmEvent");
        return new Event(a.w8(), a.x8(), EntityType.Companion.findBy(a.u8()), a.t8(), new c(a.s8()), a.z8(), this.a.w(a.v8()), a.y8());
    }
    
    @e
    public final l4.a c(@e final Event event) {
        k0.p(event, "event");
        final long id = event.getId();
        final String text = event.getText();
        final long n = ((g)event.getDateTime()).n();
        final long entityId = event.getEntityId();
        final int webuntisId = event.getEntityType().getWebuntisId();
        final EventReason eventReason = event.getEventReason();
        long id2;
        if (eventReason == null) {
            id2 = 0L;
        }
        else {
            id2 = eventReason.getId();
        }
        return new l4.a(id, webuntisId, entityId, n, text, id2, event.getPeriodId(), event.getSynced());
    }
}
