// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public enum h
{
    H("CANCELLED"), 
    I("LOCKED");
    
    private String G;
    
    private h(final String g) {
        this.G = g;
    }
    
    @JsonCreator
    public static h b(final String s) {
        for (final h h : values()) {
            if (h.G.equals(s)) {
                return h;
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
