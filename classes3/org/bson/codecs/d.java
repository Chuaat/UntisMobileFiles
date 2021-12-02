// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.types.Decimal128;
import org.bson.p0;
import org.bson.z0;
import java.math.BigDecimal;

public final class d implements n0<BigDecimal>
{
    public BigDecimal e(final p0 p2, final s0 s0) {
        return p2.q0().b();
    }
    
    @Override
    public Class<BigDecimal> g() {
        return BigDecimal.class;
    }
    
    public void h(final z0 z0, final BigDecimal bigDecimal, final x0 x0) {
        z0.g1(new Decimal128(bigDecimal));
    }
}
