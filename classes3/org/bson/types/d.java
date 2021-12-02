// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.io.Serializable;

public class d implements Serializable
{
    private static final long H = 475535263314046697L;
    private final String G;
    
    public d(final String g) {
        this.G = g;
    }
    
    public String a() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.G.equals(((d)o).G));
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Code{code='");
        sb.append(this.G);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
