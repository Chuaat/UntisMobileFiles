// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.jsr310;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.Instant;
import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import java.time.LocalDateTime;

public class e extends a<LocalDateTime>
{
    @Override
    public Class<LocalDateTime> g() {
        return LocalDateTime.class;
    }
    
    public LocalDateTime h(final p0 p2, final s0 s0) {
        return Instant.ofEpochMilli(this.e(p2)).atZone(ZoneOffset.UTC).toLocalDateTime();
    }
    
    public void i(final z0 z0, final LocalDateTime localDateTime, final x0 x0) {
        try {
            z0.D0(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        }
        catch (ArithmeticException ex) {
            throw new org.bson.codecs.configuration.a(String.format("Unsupported LocalDateTime value '%s' could not be converted to milliseconds: %s", localDateTime, ex.getMessage()), ex);
        }
    }
}
