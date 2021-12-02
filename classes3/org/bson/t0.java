// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public class t0 extends y0 implements Comparable<t0>
{
    private final String G;
    
    public t0(final String g) {
        if (g != null) {
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("Value can not be null");
    }
    
    public int X0(final t0 t0) {
        return this.G.compareTo(t0.G);
    }
    
    public String Y0() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.G.equals(((t0)o).G));
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.J;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonString{value='");
        sb.append(this.G);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
