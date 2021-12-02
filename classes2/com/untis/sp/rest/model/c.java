// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public enum c
{
    H("WEEKEND_NOWORK"), 
    I("NOWORK"), 
    J("WORK");
    
    private String G;
    
    private c(final String g) {
        this.G = g;
    }
    
    @JsonCreator
    public static c b(final String s) {
        for (final c c : values()) {
            if (c.G.equals(s)) {
                return c;
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
