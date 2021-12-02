// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.math.BigDecimal;
import org.bson.types.Decimal128;

public class c0 extends n0 implements Comparable<c0>
{
    private final double G;
    
    public c0(final double g) {
        this.G = g;
    }
    
    @Override
    public Decimal128 X0() {
        if (Double.isNaN(this.G)) {
            return Decimal128.a0;
        }
        if (Double.isInfinite(this.G)) {
            Decimal128 decimal128;
            if (this.G > 0.0) {
                decimal128 = Decimal128.X;
            }
            else {
                decimal128 = Decimal128.Y;
            }
            return decimal128;
        }
        return new Decimal128(new BigDecimal(this.G));
    }
    
    @Override
    public double Y0() {
        return this.G;
    }
    
    @Override
    public int Z0() {
        return (int)this.G;
    }
    
    @Override
    public long b1() {
        return (long)this.G;
    }
    
    public int c1(final c0 c0) {
        return Double.compare(this.G, c0.G);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Double.compare(((c0)o).G, this.G) == 0);
    }
    
    public double h1() {
        return this.G;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.G);
        return (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    @Override
    public w0 t0() {
        return w0.I;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonDouble{value=");
        sb.append(this.G);
        sb.append('}');
        return sb.toString();
    }
}
