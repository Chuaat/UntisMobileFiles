// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.io.Serializable;

public final class g implements Serializable
{
    private static final long G = 5123414776151687185L;
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof g;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public String toString() {
        return "MaxKey";
    }
}
