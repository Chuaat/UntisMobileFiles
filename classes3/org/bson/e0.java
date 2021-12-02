// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.Decimal128;

public final class e0 extends n0 implements Comparable<e0>
{
    private final int G;
    
    public e0(final int g) {
        this.G = g;
    }
    
    @Override
    public Decimal128 X0() {
        return new Decimal128(this.G);
    }
    
    @Override
    public double Y0() {
        return this.G;
    }
    
    @Override
    public int Z0() {
        return this.G;
    }
    
    @Override
    public long b1() {
        return this.G;
    }
    
    public int c1(final e0 e0) {
        final int g = this.G;
        final int g2 = e0.G;
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
        return this == o || (o != null && e0.class == o.getClass() && this.G == ((e0)o).G);
    }
    
    public int h1() {
        return this.G;
    }
    
    @Override
    public int hashCode() {
        return this.G;
    }
    
    @Override
    public w0 t0() {
        return w0.X;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonInt32{value=");
        sb.append(this.G);
        sb.append('}');
        return sb.toString();
    }
}
