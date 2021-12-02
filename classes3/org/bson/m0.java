// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public final class m0 extends y0
{
    public static final m0 a;
    
    static {
        a = new m0();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && m0.class == o.getClass());
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public w0 t0() {
        return w0.R;
    }
    
    @Override
    public String toString() {
        return "BsonNull";
    }
}
