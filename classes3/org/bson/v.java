// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public class v extends y0 implements Comparable<v>
{
    private final long G;
    
    public v(final long g) {
        this.G = g;
    }
    
    public int X0(final v v) {
        return Long.valueOf(this.G).compareTo(v.G);
    }
    
    public long Y0() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.G == ((v)o).G);
    }
    
    @Override
    public int hashCode() {
        final long g = this.G;
        return (int)(g ^ g >>> 32);
    }
    
    @Override
    public w0 t0() {
        return w0.Q;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonDateTime{value=");
        sb.append(this.G);
        sb.append('}');
        return sb.toString();
    }
}
