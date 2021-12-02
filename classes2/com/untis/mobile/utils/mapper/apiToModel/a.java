// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToModel;

import org.joda.time.c;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.api.common.classreg.UMClassRegEvent;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/utils/mapper/apiToModel/a;", "", "", "periodId", "Lcom/untis/mobile/api/common/classreg/UMClassRegEvent;", "umClassRegEvent", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "a", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    private final com.untis.mobile.services.masterdata.a a;
    
    public a(@e final String s) {
        k0.p(s, "profileId");
        this.a = b.Z.a(s);
    }
    
    @e
    public final Event a(final long n, @e final UMClassRegEvent umClassRegEvent) {
        k0.p(umClassRegEvent, "umClassRegEvent");
        final long id = umClassRegEvent.id;
        final EntityType by = EntityType.Companion.findBy(umClassRegEvent.elementType);
        final long elementId = umClassRegEvent.elementId;
        final c c = com.untis.mobile.utils.mapper.common.b.c(umClassRegEvent.dateTime);
        k0.o(c, "isoStringToDateTime(umClassRegEvent.dateTime)");
        String text;
        if ((text = umClassRegEvent.text) == null) {
            text = "";
        }
        return new Event(id, n, by, elementId, c, text, this.a.w(umClassRegEvent.eventReasonId), true);
    }
}
