// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.types.Decimal128;

class e implements a<Decimal128>
{
    public void b(final Decimal128 decimal128, final y0 y0) {
        y0.f();
        y0.K("$numberDecimal");
        y0.i(decimal128.toString());
        y0.b();
    }
}
