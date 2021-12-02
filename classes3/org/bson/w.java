// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.ObjectId;

public class w extends y0
{
    private final String a;
    private final ObjectId b;
    
    public w(final String a, final ObjectId b) {
        if (a == null) {
            throw new IllegalArgumentException("namespace can not be null");
        }
        if (b != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("id can not be null");
    }
    
    public ObjectId X0() {
        return this.b;
    }
    
    public String Y0() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final w w = (w)o;
            return this.b.equals(w.b) && this.a.equals(w.a);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.T;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonDbPointer{namespace='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", id=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
