// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.jsr310;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.Instant;
import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import java.time.LocalTime;

public class f extends a<LocalTime>
{
    @Override
    public Class<LocalTime> g() {
        return LocalTime.class;
    }
    
    public LocalTime h(final p0 p2, final s0 s0) {
        return Instant.ofEpochMilli(this.e(p2)).atOffset(ZoneOffset.UTC).toLocalTime();
    }
    
    public void i(final z0 z0, final LocalTime localTime, final x0 x0) {
        z0.D0(localTime.atDate(LocalDate.ofEpochDay(0L)).toInstant(ZoneOffset.UTC).toEpochMilli());
    }
}
