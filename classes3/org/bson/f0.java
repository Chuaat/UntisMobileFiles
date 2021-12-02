// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.Decimal128;

public final class f0 extends n0 implements Comparable<f0>
{
    private final long G;
    
    public f0(final long g) {
        this.G = g;
    }
    
    @Override
    public Decimal128 X0() {
        return new Decimal128(this.G);
    }
    
    @Override
    public double Y0() {
        return (double)this.G;
    }
    
    @Override
    public int Z0() {
        return (int)this.G;
    }
    
    @Override
    public long b1() {
        return this.G;
    }
    
    public int c1(final f0 f0) {
        final long g = this.G;
        final long g2 = f0.G;
        int n;
        if (g < g2) {
            n = -1;
        }
        else if (g == g2) {
            n = 0;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && f0.class == o.getClass() && this.G == ((f0)o).G);
    }
    
    public long h1() {
        return this.G;
    }
    
    @Override
    public int hashCode() {
        final long g = this.G;
        return (int)(g ^ g >>> 32);
    }
    
    @Override
    public w0 t0() {
        return w0.Z;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonInt64{value=");
        sb.append(this.G);
        sb.append('}');
        return sb.toString();
    }
}
