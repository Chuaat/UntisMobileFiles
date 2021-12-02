// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.booking;

import java.util.List;
import org.joda.time.c;
import com.untis.mobile.persistence.models.booking.RoomChangeData;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.booking.RoomChangeSuccessData;
import rx.g;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Room;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\n\u001a\u00020\tH&J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/services/booking/a;", "", "Lorg/joda/time/c;", "start", "end", "Lrx/g;", "", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "c", "", "periodId", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "b", "newRoom", "originalRoom", "Lcom/untis/mobile/persistence/models/booking/RoomChangeSuccessData;", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    g<RoomChangeSuccessData> a(final long p0, @f final Room p1, @f final Room p2);
    
    @e
    g<RoomChangeData> b(final long p0);
    
    @e
    g<List<Room>> c(@e final c p0, @e final c p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
