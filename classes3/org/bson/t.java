// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public final class t extends y0 implements Comparable<t>
{
    public static final t H;
    public static final t I;
    private final boolean G;
    
    static {
        H = new t(true);
        I = new t(false);
    }
    
    public t(final boolean g) {
        this.G = g;
    }
    
    public static t Z0(final boolean b) {
        t t;
        if (b) {
            t = org.bson.t.H;
        }
        else {
            t = org.bson.t.I;
        }
        return t;
    }
    
    public int X0(final t t) {
        return Boolean.valueOf(this.G).compareTo(Boolean.valueOf(t.G));
    }
    
    public boolean Y0() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && t.class == o.getClass() && this.G == ((t)o).G);
    }
    
    @Override
    public int hashCode() {
        return this.G ? 1 : 0;
    }
    
    @Override
    public w0 t0() {
        return w0.P;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonBoolean{value=");
        sb.append(this.G);
        sb.append('}');
        return sb.toString();
    }
}
