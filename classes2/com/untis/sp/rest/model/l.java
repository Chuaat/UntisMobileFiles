// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public enum l
{
    H("CANCELLATION"), 
    I("NO_SUBSTITUTION"), 
    J("SUBSTITUTION"), 
    K("SHIFT");
    
    private String G;
    
    private l(final String g) {
        this.G = g;
    }
    
    @JsonCreator
    public static l b(final String s) {
        for (final l l : values()) {
            if (l.G.equals(s)) {
                return l;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected value '");
        sb.append(s);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @JsonValue
    public String d() {
        return this.G;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.G);
    }
}
