// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.internal.j;

public final class v0 extends y0 implements Comparable<v0>
{
    private final long G;
    
    public v0() {
        this.G = 0L;
    }
    
    public v0(final int n, final int n2) {
        this.G = (((long)n2 & 0xFFFFFFFFL) | (long)n << 32);
    }
    
    public v0(final long g) {
        this.G = g;
    }
    
    public int X0(final v0 v0) {
        return j.a(this.G, v0.G);
    }
    
    public int Y0() {
        return (int)this.G;
    }
    
    public int Z0() {
        return (int)(this.G >> 32);
    }
    
    public long b1() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && v0.class == o.getClass() && this.G == ((v0)o).G);
    }
    
    @Override
    public int hashCode() {
        final long g = this.G;
        return (int)(g ^ g >>> 32);
    }
    
    @Override
    public w0 t0() {
        return w0.Y;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Timestamp{value=");
        sb.append(this.b1());
        sb.append(", seconds=");
        sb.append(this.Z0());
        sb.append(", inc=");
        sb.append(this.Y0());
        sb.append('}');
        return sb.toString();
    }
}
