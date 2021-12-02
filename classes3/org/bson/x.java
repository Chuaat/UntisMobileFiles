// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import e7.a;
import org.bson.types.Decimal128;

public final class x extends n0
{
    private final Decimal128 a;
    
    public x(final Decimal128 a) {
        e7.a.e("value", a);
        this.a = a;
    }
    
    @Override
    public Decimal128 X0() {
        return this.a;
    }
    
    @Override
    public double Y0() {
        return this.a.b().doubleValue();
    }
    
    @Override
    public int Z0() {
        return this.a.b().intValue();
    }
    
    @Override
    public long b1() {
        return this.a.b().longValue();
    }
    
    public Decimal128 c1() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && x.class == o.getClass() && this.a.equals(((x)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.a0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonDecimal128{value=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
