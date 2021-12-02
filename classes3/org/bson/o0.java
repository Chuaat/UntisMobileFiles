// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.ObjectId;

public class o0 extends y0 implements Comparable<o0>
{
    private final ObjectId G;
    
    public o0() {
        this(new ObjectId());
    }
    
    public o0(final ObjectId g) {
        if (g != null) {
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("value may not be null");
    }
    
    public int X0(final o0 o0) {
        return this.G.b(o0.G);
    }
    
    public ObjectId Y0() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.G.equals(((o0)o).G));
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.O;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonObjectId{value=");
        sb.append(this.G.U());
        sb.append('}');
        return sb.toString();
    }
}
