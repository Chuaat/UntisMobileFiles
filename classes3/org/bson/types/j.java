// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.io.Serializable;

public class j implements Serializable
{
    private static final long H = 1326269319883146072L;
    private final String G;
    
    public j(final String g) {
        this.G = g;
    }
    
    public String a() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.G.equals(((j)o).G));
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public String toString() {
        return this.G;
    }
}
