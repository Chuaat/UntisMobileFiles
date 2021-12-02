// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.jsr310;

import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import java.time.Instant;

public class b extends a<Instant>
{
    @Override
    public Class<Instant> g() {
        return Instant.class;
    }
    
    public Instant h(final p0 p2, final s0 s0) {
        return Instant.ofEpochMilli(this.e(p2));
    }
    
    public void i(final z0 z0, final Instant instant, final x0 x0) {
        try {
            z0.D0(instant.toEpochMilli());
        }
        catch (ArithmeticException ex) {
            throw new org.bson.codecs.configuration.a(String.format("Unsupported Instant value '%s' could not be converted to milliseconds: %s", instant, ex.getMessage()), ex);
        }
    }
}
